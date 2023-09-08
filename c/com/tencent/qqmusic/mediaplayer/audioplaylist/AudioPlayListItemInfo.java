package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcelable;

public abstract class AudioPlayListItemInfo implements Parcelable {
    public static int TYPE_CUE = 1;
    public static int TYPE_M3U = 2;
    public static int TYPE_NONE;
    public int mType = TYPE_NONE;
    public String mUri;

    public int getType() {
        return this.mType;
    }
}
