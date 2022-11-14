package com.VaibhavIT.blog.Services.Impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.VaibhavIT.blog.Services.FileService;
@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		//FileName
		String name=file.getOriginalFilename();
		
		//Random Name Generation Of FileName
		String randomId=UUID.randomUUID().toString();
		String fileName1=randomId.concat(name.substring(name.lastIndexOf("")));
		
		//Give FullPath
		String filePath=path +File.separator +fileName1;
		
		// Create Folder If Not Created
		
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();  // means make new direction or folder if the folder was not already present
		}
		
		//Create FileCopy
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		
		String fullPath=path+File.separator+fileName;
		InputStream is=new FileInputStream(fullPath);
		
		return is;
	}

}
