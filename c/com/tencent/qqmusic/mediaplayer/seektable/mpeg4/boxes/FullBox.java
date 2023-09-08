package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.wxmm.v2encoder;

public abstract class FullBox extends Box {
    public int flags;
    public int version;

    public int getFlags() {
        return this.flags;
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        byte[] bArr = new byte[4];
        parsable.readBytes(bArr, 0, 4);
        this.version = bArr[0] & ExifInterface.MARKER;
        this.flags = ((bArr[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[2] & ExifInterface.MARKER) << 8) | (bArr[3] & ExifInterface.MARKER);
    }
}
