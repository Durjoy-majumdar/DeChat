package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

public class Mp3SeekTable implements SeekTable {
    private final Mp3FrameInfoParse.Mp3Info mInfo = new Mp3FrameInfoParse.Mp3Info();

    private static long timeToBytePositionInCbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j) {
        int i;
        if (mp3Info == null || (i = mp3Info.bit_rate) <= 0 || j < 0) {
            return -1;
        }
        long j2 = ((long) (i / 8)) * j;
        int i2 = mp3Info.idv2Size;
        return i2 > 0 ? j2 + ((long) i2) : j2;
    }

    private static long timeToBytePositionInVBRIVbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j) {
        long[] jArr;
        Mp3FrameInfoParse.Mp3Info mp3Info2 = mp3Info;
        long j2 = j;
        if (mp3Info2 == null || (jArr = mp3Info2.toc_table) == null) {
            return -1;
        }
        long j3 = mp3Info2.fileLengthInBytes;
        if (j3 <= 0) {
            return -1;
        }
        long j4 = mp3Info2.firstFramePosition;
        if (j4 < 0) {
            return -1;
        }
        long j5 = mp3Info2.duration;
        if (j5 <= 0 || j2 < 0) {
            return -1;
        }
        int i = mp3Info2.entry_count;
        int i2 = i + 1;
        int i3 = (int) (((((double) j2) * 1.0d) / ((double) j5)) * ((double) i2));
        if (i3 >= 0) {
            j4 = jArr[i3];
        }
        if (i3 < i) {
            j3 = jArr[i3 + 1];
        }
        long j6 = (long) i2;
        long j7 = (((long) i3) * j5) / j6;
        return j4 + (j3 == j4 ? 0 : (long) (((((double) (j3 - j4)) * 1.0d) * ((double) (j2 - j7))) / ((double) (((((long) (i3 + 1)) * j5) / j6) - j7))));
    }

    private static long timeToBytePositionInXingVbr(Mp3FrameInfoParse.Mp3Info mp3Info, long j) {
        long[] jArr;
        if (mp3Info == null || (jArr = mp3Info.toc_table) == null) {
            return -1;
        }
        long j2 = mp3Info.fileLengthInBytes;
        if (j2 <= 0) {
            return -1;
        }
        long j3 = mp3Info.firstFramePosition;
        if (j3 < 0) {
            return -1;
        }
        long j4 = mp3Info.duration;
        if (j4 < 0 || j < 0) {
            return -1;
        }
        double d = (((double) j) * 100.0d) / ((double) j4);
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                float f = i == 0 ? 0.0f : (float) jArr[i];
                d2 = ((double) f) + (((double) ((i < 99 ? (float) jArr[i + 1] : 256.0f) - f)) * (d - ((double) i)));
            }
        }
        long round = Math.round(d2 * 0.00390625d * ((double) j2)) + j3;
        long j5 = (j3 + j2) - 1;
        int i2 = mp3Info.idv2Size;
        if (i2 > 0) {
            j5 -= (long) i2;
        }
        return round < j5 ? round : j5;
    }

    public void parse(IDataSource iDataSource) {
        Mp3FrameInfoParse.parseFrameInfo(new TrackPositionDataSource(iDataSource), this.mInfo);
    }

    public long seek(long j) {
        if (j < 0) {
            return -1;
        }
        Mp3FrameInfoParse.Mp3Info mp3Info = this.mInfo;
        int i = mp3Info.VBRType;
        if (i == 0) {
            return timeToBytePositionInCbr(mp3Info, j);
        }
        if (i == 1) {
            return timeToBytePositionInVBRIVbr(mp3Info, j);
        }
        if (i != 2) {
            return -1;
        }
        return timeToBytePositionInXingVbr(mp3Info, j);
    }
}
