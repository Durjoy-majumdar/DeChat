package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Mdhd extends FullBox {
    public long creationTime;
    public long duration;
    public long modificationTime;
    public byte[] remaining;
    public int timeScale;

    public long getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getModificationTime() {
        return this.modificationTime;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public void parse(Parsable parsable, Box box) {
        super.parse(parsable, box);
        if (this.version == 1) {
            this.creationTime = parsable.readLong();
            this.modificationTime = parsable.readLong();
            this.timeScale = parsable.readInt();
            this.duration = parsable.readLong();
        } else {
            this.creationTime = (long) parsable.readInt();
            this.modificationTime = (long) parsable.readInt();
            this.timeScale = parsable.readInt();
            this.duration = (long) parsable.readInt();
        }
        byte[] bArr = new byte[4];
        this.remaining = bArr;
        parsable.readBytes(bArr, 0, bArr.length);
    }
}
