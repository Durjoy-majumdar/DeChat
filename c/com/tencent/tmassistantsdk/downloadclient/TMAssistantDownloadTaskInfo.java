package com.tencent.tmassistantsdk.downloadclient;

import android.os.Parcel;
import android.os.Parcelable;

public class TMAssistantDownloadTaskInfo implements Parcelable {
    public static final Parcelable.Creator<TMAssistantDownloadTaskInfo> CREATOR = new Parcelable.Creator<TMAssistantDownloadTaskInfo>() {
        public TMAssistantDownloadTaskInfo createFromParcel(Parcel parcel) {
            return new TMAssistantDownloadTaskInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        public TMAssistantDownloadTaskInfo[] newArray(int i) {
            return new TMAssistantDownloadTaskInfo[i];
        }
    };
    public String mContentType;
    public long mReceiveDataLen;
    public String mSavePath;
    public int mState;
    public long mTotalDataLen;
    public String mUrl;

    public TMAssistantDownloadTaskInfo(String str, String str2, int i, long j, long j2, String str3) {
        this.mUrl = str;
        this.mSavePath = str2;
        this.mState = i;
        this.mReceiveDataLen = j;
        this.mTotalDataLen = j2;
        this.mContentType = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.mUrl;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        String str2 = this.mSavePath;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mReceiveDataLen);
        parcel.writeLong(this.mTotalDataLen);
        parcel.writeString(this.mContentType);
    }
}
