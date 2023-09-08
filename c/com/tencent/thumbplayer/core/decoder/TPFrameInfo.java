package com.tencent.thumbplayer.core.decoder;

class TPFrameInfo {
    public int bufferIndex;
    public int channelCount;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public byte[] data;
    public int errCode;
    public int format;
    public int height;
    public int[] lineSize;
    public long ptsUs;
    public long renderTimestampNs;
    public int sampleRate;
    public byte[][] videoData;
    public int width;
}
