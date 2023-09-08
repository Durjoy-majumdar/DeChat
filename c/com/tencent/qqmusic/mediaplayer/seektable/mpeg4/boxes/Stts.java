package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stts extends FullBox {
    public int entryCount;
    public int[] sampleCount;
    public int[] sampleDelta;

    public int getEntryCount() {
        return this.entryCount;
    }

    public int[] getSampleCount() {
        return this.sampleCount;
    }

    public int[] getSampleDelta() {
        return this.sampleDelta;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        int[] iArr = new int[readInt];
        this.sampleCount = iArr;
        int[] iArr2 = new int[readInt];
        this.sampleDelta = iArr2;
        parsable.readIntArrayInterleaved(readInt, iArr, iArr2);
    }
}
