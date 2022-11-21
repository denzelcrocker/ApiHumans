package com.example.apihumans;

import android.os.Parcel;
import android.os.Parcelable;

public class mask implements Parcelable {

    private int Id;
    private String Name;
    private int Count;
    private String Image;

    protected mask(Parcel in){
        Id = in.readInt();
        Name = in.readString();
        Count = in.readInt();
        Image = in.readString();
    }

    public mask(int ID, String Name, int Count,String Image ) {
        this.Id = ID;
        this.Name = Name;
        this.Count = Count;
        this.Image = Image;
    }

    public static final Creator<mask> CREATOR = new Creator<mask>() {
        @Override
        public mask createFromParcel(Parcel in) {
            return new mask(in);
        }

        @Override
        public mask[] newArray(int size) {
            return new mask[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Id);
        dest.writeString(Name);
        dest.writeInt(Count);
        dest.writeString(Image);
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
