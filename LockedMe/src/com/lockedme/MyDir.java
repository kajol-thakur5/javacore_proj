package com.lockedme;

public class MyDir {
  private int id;
  private String fileName;
  public MyDir()
  {
	  
  }
  public MyDir(int id, String fileName)
  {
	  super();
	  this.id= id;
	  this.fileName =fileName;}
  public int getId()
  {
	  return id;
  }
  public void setId(int id)
  {
	  this.id=id;
  }
  public String getfileName()
  {
	  return fileName;
  }
  public void setfileName(String fileName)
  {
	  this.fileName = fileName;
  }
}
