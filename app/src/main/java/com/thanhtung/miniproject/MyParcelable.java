package com.thanhtung.miniproject;

import android.os.Parcel;
import android.os.Parcelable;

public class MyParcelable implements Parcelable {
    private int mData;

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static final Parcelable.Creator<MyParcelable> CREATOR
            = new Parcelable.Creator<MyParcelable>() {
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    public MyParcelable(Parcel in) {
        mData = in.readInt();
    }
}
