package com.example.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Students implements Parcelable {

    private String mName;
    private int mAge;
    private String mRollNo;
    private String mDOB;

    public Students(){

    }

    protected Students(Parcel in) {
        mName = in.readString();
        mAge = in.readInt();
        mRollNo = in.readString();
        mDOB = in.readString();
    }

    public static final Creator<Students> CREATOR = new Creator<Students>() {
        @Override
        public Students createFromParcel(Parcel in) {
            return new Students(in);
        }

        @Override
        public Students[] newArray(int size) {
            return new Students[size];
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
