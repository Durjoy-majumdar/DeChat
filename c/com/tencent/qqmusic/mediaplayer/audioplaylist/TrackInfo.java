package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

public class TrackInfo extends AudioPlayListItemInfo {
    public static final Parcelable.Creator<TrackInfo> CREATOR = new Parcelable.Creator<TrackInfo>() {
        public TrackInfo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            TrackInfo trackInfo = new TrackInfo(readInt);
            trackInfo.setFilePath(readString);
            trackInfo.setTitle(readString2);
            trackInfo.setStartPosition(readLong);
            trackInfo.setEndPostion(readLong2);
            trackInfo.setPerformer(readString3);
            trackInfo.setAlbum(readString4);
            return trackInfo;
        }

        public TrackInfo[] newArray(int i) {
            return new TrackInfo[i];
        }
    };
    private String mAlbum = "";
    private long mEndPostion;
    private String mPerformer = "";
    private long mStartPosition;
    private String mTitle = "";

    public TrackInfo(int i) {
        this.mType = i;
    }

    public int describeContents() {
        return 0;
    }

    public String getAlbum() {
        return this.mAlbum;
    }

    public String getPerformer() {
        return this.mPerformer;
    }

    public Pair<Long, Long> getRange() {
        return new Pair<>(Long.valueOf(this.mStartPosition), Long.valueOf(this.mEndPostion));
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setAlbum(String str) {
        this.mAlbum = str;
    }

    public void setEndPostion(long j) {
        this.mEndPostion = j;
    }

    public void setFilePath(String str) {
        this.mUri = str;
    }

    public void setPerformer(String str) {
        this.mPerformer = str;
    }

    public void setStartPosition(long j) {
        this.mStartPosition = j;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
        parcel.writeString(this.mUri);
        parcel.writeString(this.mTitle);
        parcel.writeLong(this.mStartPosition);
        parcel.writeLong(this.mEndPostion);
        parcel.writeString(this.mPerformer);
        parcel.writeString(this.mAlbum);
    }
}
