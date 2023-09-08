package com.tencent.thumbplayer.core.common;

import com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceDolbyVisionInfo;

public class TPVideoPacket {
    public byte[] mData;
    public TPNativePlayerSurfaceDolbyVisionInfo mDolbyVisionInfo;
    public long mDtsUs;
    public long mPtsUs;
    public int mSize;
}
