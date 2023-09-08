package com.tencent.wxmm;

import java.nio.ByteBuffer;

public class ImagePlane {
    public ByteBuffer[] data;
    public int format;
    public int height;
    public long[] stride;
    public ByteBuffer userdata;
    public int width;
}
