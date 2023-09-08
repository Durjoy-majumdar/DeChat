package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stco extends FullBox {
    public int[] chunkOffset;
    public int entryCount;

    public int[] getChunkOffset() {
        return this.chunkOffset;
    }

    public int getEntryCount() {
        return this.entryCount;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        this.chunkOffset = parsable.readIntArray(readInt);
    }
}
