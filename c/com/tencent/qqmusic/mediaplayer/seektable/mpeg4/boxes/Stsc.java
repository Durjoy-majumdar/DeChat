package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsc extends FullBox {
    public int entryCount;
    public int[] firstChunk;
    public int[] sampleDescIndex;
    public int[] samplesPerChunk;

    public int getEntryCount() {
        return this.entryCount;
    }

    public int[] getFirstChunk() {
        return this.firstChunk;
    }

    public int[] getSampleDescIndex() {
        return this.sampleDescIndex;
    }

    public int[] getSamplesPerChunk() {
        return this.samplesPerChunk;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        int[] iArr = new int[readInt];
        this.firstChunk = iArr;
        int[] iArr2 = new int[readInt];
        this.samplesPerChunk = iArr2;
        int[] iArr3 = new int[readInt];
        this.sampleDescIndex = iArr3;
        parsable.readIntArrayInterleaved(readInt, iArr, iArr2, iArr3);
    }
}
