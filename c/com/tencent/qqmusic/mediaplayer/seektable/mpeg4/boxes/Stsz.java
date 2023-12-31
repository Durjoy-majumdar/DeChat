package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsz extends FullBox {
    public int[] entrySize;
    public int sampleCount;
    public int sampleSize;

    public int[] getEntrySize() {
        return this.entrySize;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        this.sampleSize = parsable.readInt();
        int readInt = parsable.readInt();
        this.sampleCount = readInt;
        if (this.sampleSize == 0) {
            this.entrySize = parsable.readIntArray(readInt);
        }
        if (this.sampleSize == 0 && this.sampleCount == 0) {
            throw new InvalidBoxException("invalide stsz: both [sample_count] and [sample_size] is 0!");
        }
    }
}
