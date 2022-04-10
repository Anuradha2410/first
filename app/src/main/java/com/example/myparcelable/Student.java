package com.example.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String mName;
    private int mAge;
    private String mRollNo;
    private String mDOB;

    public Student(){

    }

    protected Student(Parcel in) {
        mName = in.readString();
        mAge = in.readInt();
        mRollNo = in.readString();
        mDOB = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeInt(mAge);
        parcel.writeString(mRollNo);
        parcel.writeString(mDOB);
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmRollNo() {
        return mRollNo;
    }

    public void setmRollNo(String mRollNo) {
        this.mRollNo = mRollNo;
    }

    public String getmDOB() {
        return mDOB;
    }

    public void setmDOB(String mDOB) {
        this.mDOB = mDOB;
    }
}
