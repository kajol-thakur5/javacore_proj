package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	static int count = 0;
	List<MyDir> files = new ArrayList<>();

	
	public List<MyDir> getFiles()
	{
		File f = new File("c://java");
		String[] fd = f.list();
		for (String file : fd) {
			count++;
			files.add(new MyDir(count, file));
		}
		return files;
	}
	public void addFile(String fileName) throws IOException
	{
		File f=new File("c://java//"+fileName);
		f.createNewFile();
	}
	public boolean deleteFile(String fileName)
	{ 
		boolean isDeleted = false;
		files=getFiles();
		File f=new File("c://java//"+fileName);
		if(f.delete())
			isDeleted=true;
		return isDeleted;
	}
	public boolean search(String fileName)
	{
		boolean isIdentified = false;
		files=getFiles();
		for(MyDir file:files)
		{
			if(file.getfileName().equals(fileName))
			{
				isIdentified=true;
			    break;
			}
		}
		return isIdentified;
	}
}
