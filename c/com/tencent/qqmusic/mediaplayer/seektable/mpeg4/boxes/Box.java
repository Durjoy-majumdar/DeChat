package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import java.nio.charset.Charset;
import java.util.Arrays;

public abstract class Box implements IMpeg4Box {
    private long largeSize;
    private int size;
    private byte[] type;
    private byte[] userType;

    public final long getSize() {
        long j = this.largeSize;
        return j != 0 ? j : (long) this.size;
    }

    public final String getType() {
        return new String(this.type, Charset.defaultCharset());
    }

    public void parse(Parsable parsable, Box box) {
        if (box == null) {
            this.size = parsable.readInt();
            byte[] bArr = new byte[4];
            this.type = bArr;
            parsable.readBytes(bArr, 0, bArr.length);
            int i = this.size;
            if (i == 1) {
                long readLong = parsable.readLong();
                this.largeSize = readLong;
                if (readLong == 0) {
                    throw new InvalidBoxException("invalid [" + getType() + "]: largeSize is 0!");
                }
            } else if (i == 0) {
                this.largeSize = parsable.available();
            } else if (i < 8) {
                throw new InvalidBoxException("invalid [" + getType() + "]: size is less than 8!");
            }
            if (Arrays.equals(this.type, "uuid".getBytes())) {
                byte[] bArr2 = new byte[16];
                this.userType = bArr2;
                parsable.readBytes(bArr2, 0, bArr2.length);
                return;
            }
            return;
        }
        this.size = box.size;
        this.type = box.type;
        this.largeSize = box.largeSize;
        this.userType = box.userType;
    }
}
