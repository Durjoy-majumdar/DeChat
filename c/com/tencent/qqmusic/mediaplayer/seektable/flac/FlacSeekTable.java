package com.tencent.qqmusic.mediaplayer.seektable.flac;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.Arrays;
import java.util.HashSet;

public class FlacSeekTable implements SeekTable {
    private static final int SEEK_POINT_SIZE = 18;
    private static final byte TYPE_SEEKTABLE = 3;
    private static final byte TYPE_STREAMINFO = 0;
    /* access modifiers changed from: private */
    public long firstFrameOffset;
    /* access modifiers changed from: private */
    public long[] offsets;
    /* access modifiers changed from: private */
    public long[] sampleNumbers;
    private int sampleRate;

    public interface BlockHandler {
        boolean handle(Parsable parsable, int i);
    }

    public class SeektableHandler implements BlockHandler {
        public SeektableHandler() {
        }

        public boolean handle(Parsable parsable, int i) {
            if (i != 3) {
                return false;
            }
            byte[] bArr = new byte[3];
            parsable.readBytes(bArr, 0, 3);
            int from = BytesUtil.from(bArr) / 18;
            long[] unused = FlacSeekTable.this.sampleNumbers = new long[from];
            long[] unused2 = FlacSeekTable.this.offsets = new long[from];
            for (int i2 = 0; i2 < from; i2++) {
                FlacSeekTable.this.sampleNumbers[i2] = parsable.readLong();
                FlacSeekTable.this.offsets[i2] = parsable.readLong();
                parsable.skip(2);
            }
            if (FlacSeekTable.seekToFirstFrame(parsable)) {
                long unused3 = FlacSeekTable.this.firstFrameOffset = parsable.tell() - 2;
                return true;
            }
            throw new InvalidBoxException("can't find audio frame!");
        }
    }

    public class StreamInfoHandler implements BlockHandler {
        public StreamInfoHandler() {
        }

        public boolean handle(Parsable parsable, int i) {
            if (i != 0) {
                return false;
            }
            parsable.skip(13);
            parsable.readBytes(new byte[3], 0, 3);
            parsable.skip(21);
            return true;
        }
    }

    public FlacSeekTable(int i) {
        this.sampleRate = i;
    }

    private static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else if (!z) {
            binarySearch--;
        }
        return z2 ? Math.max(0, binarySearch) : binarySearch;
    }

    /* access modifiers changed from: private */
    public static boolean seekToFirstFrame(Parsable parsable) {
        boolean z = true;
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        boolean z2 = false;
        while (parsable.available() > 0) {
            if (z2) {
                byte[] bArr3 = new byte[2];
                parsable.readBytes(bArr3, 0, 2);
                if (!((bArr3[0] & ExifInterface.MARKER) == 255 && ((bArr3[1] & ExifInterface.MARKER) >> 2) == 62)) {
                    z = false;
                }
                return z;
            }
            parsable.readBytes(bArr, 0, 1);
            if (((255 & bArr[0]) >> 7) == 1) {
                z2 = true;
            }
            parsable.readBytes(bArr2, 0, 3);
            parsable.skip((long) BytesUtil.from(bArr2));
        }
        return false;
    }

    private static boolean seekToFlac(Parsable parsable) {
        byte[] bArr = new byte[4];
        parsable.readBytes(bArr, 0, 4);
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            parsable.skip(2);
            parsable.skip((long) Id3Util.unsynchsafe(parsable.readInt()));
            parsable.readBytes(bArr, 0, 4);
        }
        return bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 67;
    }

    private static boolean walkThrough(Parsable parsable, BlockHandler... blockHandlerArr) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        HashSet hashSet = new HashSet();
        while (hashSet.size() < blockHandlerArr.length && parsable.available() > 0) {
            parsable.readBytes(bArr, 0, 1);
            byte b = bArr[0] & Byte.MAX_VALUE;
            int length = blockHandlerArr.length;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                BlockHandler blockHandler = blockHandlerArr[i];
                boolean handle = blockHandler.handle(parsable, b);
                if (handle) {
                    hashSet.add(Integer.valueOf(blockHandler.hashCode()));
                    z = handle;
                    break;
                }
                i++;
                z = handle;
            }
            if (!z) {
                if (((bArr[0] & ExifInterface.MARKER) >> 7) == 1) {
                    break;
                }
                parsable.readBytes(bArr2, 0, 3);
                parsable.skip((long) BytesUtil.from(bArr2));
            }
        }
        return hashSet.size() == blockHandlerArr.length;
    }

    public long[] getOffsetRangeOfSample(int i) {
        int binarySearchFloor = binarySearchFloor(this.sampleNumbers, (long) i, true, true);
        int i2 = binarySearchFloor + 1;
        long[] jArr = this.offsets;
        if (i2 >= jArr.length) {
            return new long[]{this.firstFrameOffset + jArr[binarySearchFloor], -1};
        }
        long j = this.firstFrameOffset;
        return new long[]{jArr[binarySearchFloor] + j, j + jArr[i2]};
    }

    public void parse(IDataSource iDataSource) {
        ParsableInputStreamWrapper parsableInputStreamWrapper = new ParsableInputStreamWrapper(iDataSource);
        if (seekToFlac(parsableInputStreamWrapper)) {
            if (!walkThrough(parsableInputStreamWrapper, this.sampleRate == 0 ? new BlockHandler[]{new SeektableHandler(), new StreamInfoHandler()} : new BlockHandler[]{new SeektableHandler()})) {
                throw new InvalidBoxException("lack one or more critical BLOCK(s) to create seek table!");
            }
        }
    }

    public long seek(long j) {
        return this.firstFrameOffset + this.offsets[binarySearchFloor(this.sampleNumbers, (long) ((int) (Math.round(((double) j) / 1000.0d) * ((long) this.sampleRate))), true, true)];
    }
}
