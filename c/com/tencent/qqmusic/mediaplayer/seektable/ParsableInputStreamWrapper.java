package com.tencent.qqmusic.mediaplayer.seektable;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.wxmm.v2encoder;
import java.io.Closeable;
import java.nio.charset.Charset;

public class ParsableInputStreamWrapper implements Closeable, Parsable {
    private final IDataSource dataSource;
    private final byte[] intBuffer = new byte[4];
    private final byte[] longBuffer = new byte[8];
    private long position = 0;

    public ParsableInputStreamWrapper(IDataSource iDataSource) {
        this.dataSource = iDataSource;
    }

    public long available() {
        return this.dataSource.getSize() - this.position;
    }

    public void close() {
        this.dataSource.close();
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        long j = this.position;
        this.position = j + ((long) this.dataSource.readAt(j, bArr, i, i2));
    }

    public int readInt() {
        IDataSource iDataSource = this.dataSource;
        long j = this.position;
        byte[] bArr = this.intBuffer;
        int readAt = iDataSource.readAt(j, bArr, 0, bArr.length);
        this.position += (long) readAt;
        byte[] bArr2 = this.intBuffer;
        if (readAt != bArr2.length) {
            return -1;
        }
        return ((bArr2[0] & ExifInterface.MARKER) << 24) | ((bArr2[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[2] & ExifInterface.MARKER) << 8) | (bArr2[3] & ExifInterface.MARKER);
    }

    public int[] readIntArray(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public void readIntArrayInterleaved(int i, int[]... iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int[] iArr2 : iArr) {
                iArr2[i2] = readInt();
            }
        }
    }

    public long readLong() {
        IDataSource iDataSource = this.dataSource;
        long j = this.position;
        byte[] bArr = this.longBuffer;
        int readAt = iDataSource.readAt(j, bArr, 0, bArr.length);
        this.position += (long) readAt;
        byte[] bArr2 = this.longBuffer;
        if (readAt != bArr2.length) {
            return -1;
        }
        return (((long) bArr2[7]) & 255) | ((((long) bArr2[0]) & 255) << 56) | ((((long) bArr2[1]) & 255) << 48) | ((((long) bArr2[2]) & 255) << 40) | ((((long) bArr2[3]) & 255) << 32) | ((((long) bArr2[4]) & 255) << 24) | ((((long) bArr2[5]) & 255) << 16) | ((((long) bArr2[6]) & 255) << 8);
    }

    public long[] readLongArray(int i) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public void readLongArrayInterleaved(int i, long[]... jArr) {
        for (int i2 = 0; i2 < i; i2++) {
            for (long[] jArr2 : jArr) {
                jArr2[i2] = readLong();
            }
        }
    }

    public String readString(int i) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new String(bArr, Charset.defaultCharset());
    }

    public long skip(long j) {
        long available = available();
        if (available > j) {
            this.position += j;
            return j;
        }
        this.position += available;
        return available;
    }

    public long tell() {
        return this.position;
    }
}
