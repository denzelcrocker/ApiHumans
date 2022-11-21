package com.example.apihumans;

public class DataModal {
    private String Image;
    private String Name;
    private int Count;
    public DataModal(String Image, String Name, int Count){

        this.Image=Image;
        this.Name=Name;
        this.Count=Count;
    }
    public void setImage(String Image)
    {
        this.Image=Image;
    }
    public void setName(String Name ){this.Name=Name;}
    public void setCount (int Count)
    {
        this.Count=Count;
    }
    public String getImage()
    {
        return Image;
    }
    public String getName()
    {
        return Name;
    }
    public int getCount()
    {
        return Count;
    }
}
