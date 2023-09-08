package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.wcdb.FileUtils;
import com.tencent.wxmm.v2encoder;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import dl0.C86342c;

class Mp3FrameInfoParse {
    private static final int[][][] BitrateTable = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, 288, C0947jz.f2205e, JsApiNFCStartHCE.CTRL_INDEX, 384, v2helper.EMethodEhanceHeadsetEC, FileUtils.S_IRWXU}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};
    private static final int DECODE_ERROR_IO_READ = -3;
    private static final int DECODE_ERROR_MEMORY_ALLOC = -2;
    private static final int DECODE_ERROR_SUCCESS = 0;
    private static final int DECODE_FAIL = -1;
    private static final int[][] SAMPLE_PER_FRAME = {new int[]{384, C86342c.CTRL_INDEX, C86342c.CTRL_INDEX}, new int[]{384, C86342c.CTRL_INDEX, 576}, new int[]{384, C86342c.CTRL_INDEX, 576}};
    private static final int[][] SAMPLE_RATE_TABLE = {new int[]{11025, 12000, 8000}, new int[]{0, 0, 0}, new int[]{22050, 24000, 16000}, new int[]{44100, 48000, 32000}};
    private static final String TAG = "Mp3FrameInfoParse";
    public static final int VBR_TYPE_CBR = 0;
    public static final int VBR_TYPE_VBRI = 1;
    public static final int VBR_TYPE_XING = 2;

    public static class Mp3Info {
        public int VBRType = 0;
        public int bit_rate = 0;
        public int channels = 0;
        public long duration = 0;
        public int entry_count = 0;
        public int entry_size = 0;
        public long fileLengthInBytes = 0;
        public long firstFramePosition = 0;
        public long firstFrameSize = 0;
        public int flag_value = 0;
        public int idv2Size = 0;
        public int isVbr = 0;
        public int layer = 0;
        public long lengthInFrames = 0;
        public int mpeg_version = 0;
        public long sample_rate = 0;
        public int scale_factor = 0;
        public long[] toc_table = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean IsMp3Header(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource r22, byte[] r23, int r24, int r25, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r25
            r3 = r26
            r4 = 0
            if (r1 == 0) goto L_0x0121
            if (r3 != 0) goto L_0x000f
            goto L_0x0121
        L_0x000f:
            int r5 = r2 + 1
            byte r5 = r1[r5]
            int r6 = r5 >> 3
            r7 = 3
            r6 = r6 & r7
            r8 = 1
            if (r8 != r6) goto L_0x001b
            return r4
        L_0x001b:
            int r5 = r5 >> r8
            r5 = r5 & r7
            if (r5 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r9 = 4
            int r5 = 4 - r5
            int r10 = r2 + 2
            byte r10 = r1[r10]
            int r11 = r10 >> 4
            r12 = 15
            r11 = r11 & r12
            if (r12 != r11) goto L_0x002f
            return r4
        L_0x002f:
            int r12 = r10 >> 2
            r12 = r12 & r7
            if (r7 != r12) goto L_0x0035
            return r4
        L_0x0035:
            int r13 = r2 + 3
            byte r13 = r1[r13]
            int r13 = r13 >> 6
            r13 = r13 & r7
            int r10 = r10 >> r8
            r10 = r10 & r8
            if (r6 != r7) goto L_0x0042
            r14 = 0
            goto L_0x0043
        L_0x0042:
            r14 = 1
        L_0x0043:
            r15 = 2
            if (r8 != r5) goto L_0x005b
            int[][][] r16 = BitrateTable
            r16 = r16[r14]
            r16 = r16[r4]
            r7 = r16[r11]
            int r7 = r7 * 12000
            int[][] r16 = SAMPLE_RATE_TABLE
            r16 = r16[r6]
            r16 = r16[r12]
            int r7 = r7 / r16
            int r7 = r7 + r10
            int r7 = r7 << r15
            goto L_0x0088
        L_0x005b:
            r7 = 144000(0x23280, float:2.01787E-40)
            if (r15 != r5) goto L_0x0073
            int[][][] r16 = BitrateTable
            r16 = r16[r14]
            r16 = r16[r8]
            r16 = r16[r11]
            int r16 = r16 * r7
            int[][] r7 = SAMPLE_RATE_TABLE
            r7 = r7[r6]
            r7 = r7[r12]
            int r16 = r16 / r7
            goto L_0x0086
        L_0x0073:
            int[][][] r16 = BitrateTable
            r16 = r16[r14]
            r16 = r16[r15]
            r16 = r16[r11]
            int r16 = r16 * r7
            int[][] r7 = SAMPLE_RATE_TABLE
            r7 = r7[r6]
            r7 = r7[r12]
            int r7 = r7 << r14
            int r16 = r16 / r7
        L_0x0086:
            int r7 = r16 + r10
        L_0x0088:
            if (r7 <= 0) goto L_0x011b
            long r8 = r22.getCurPosition()
            r10 = r24
            r17 = r5
            long r4 = (long) r10
            long r4 = r8 - r4
            r18 = r11
            long r10 = (long) r2
            long r4 = r4 + r10
            long r10 = (long) r7
            long r4 = r4 + r10
            long r4 = r0.seek(r4)
            r19 = 0
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 >= 0) goto L_0x00a7
            r4 = 0
            return r4
        L_0x00a7:
            r4 = 0
            r5 = 4
            byte[] r15 = new byte[r5]
            int r4 = r0.read(r15, r5)
            r5 = -1
            if (r4 != r5) goto L_0x00b4
            r4 = 0
            return r4
        L_0x00b4:
            r4 = 4
            int r1 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readInt(r1, r2, r4)
            int r2 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readInt(r15, r4)
            r4 = -128000(0xfffffffffffe0c00, float:NaN)
            r0.seek(r8)
            if (r1 == 0) goto L_0x0119
            if (r2 == 0) goto L_0x0119
            r0 = r1 & r4
            r1 = r2 & r4
            if (r0 == r1) goto L_0x00ce
            goto L_0x0119
        L_0x00ce:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FirstFrameSize = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Mp3FrameInfoParse"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r1, r0)
            r3.firstFrameSize = r10
            r0 = 3
            if (r6 != r0) goto L_0x00ec
            r0 = 2
        L_0x00ea:
            r4 = 0
            goto L_0x00f4
        L_0x00ec:
            r0 = 2
            if (r6 != r0) goto L_0x00f1
            r4 = 1
            goto L_0x00f4
        L_0x00f1:
            if (r6 != 0) goto L_0x00ea
            r4 = 2
        L_0x00f4:
            r3.mpeg_version = r4
            r9 = r17
            r3.layer = r9
            int[][] r1 = SAMPLE_RATE_TABLE
            r1 = r1[r6]
            r1 = r1[r12]
            long r1 = (long) r1
            r3.sample_rate = r1
            int[][][] r1 = BitrateTable
            r1 = r1[r14]
            r2 = 1
            int r5 = r9 + -1
            r1 = r1[r5]
            r1 = r1[r18]
            r3.bit_rate = r1
            r1 = 3
            if (r13 != r1) goto L_0x0115
            r15 = 1
            goto L_0x0116
        L_0x0115:
            r15 = 2
        L_0x0116:
            r3.channels = r15
            return r2
        L_0x0119:
            r0 = 0
            return r0
        L_0x011b:
            r0 = 0
            r1 = -1
            r3.firstFrameSize = r1
            return r0
        L_0x0121:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.IsMp3Header(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource, byte[], int, int, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse$Mp3Info):boolean");
    }

    public static int parseFrameInfo(TrackPositionDataSource trackPositionDataSource, Mp3Info mp3Info) {
        String str;
        TrackPositionDataSource trackPositionDataSource2 = trackPositionDataSource;
        Mp3Info mp3Info2 = mp3Info;
        int i = -1;
        if (trackPositionDataSource2 == null) {
            return -1;
        }
        byte[] bArr = new byte[1024];
        if (trackPositionDataSource2.read(bArr, 1024) < 1024) {
            return -2;
        }
        boolean hasId3v2 = Mp3DecodeBase.hasId3v2(bArr, 4);
        String str2 = TAG;
        if (hasId3v2) {
            Logger.m21791i(str2, "hasId3v2");
            skipId3v2(trackPositionDataSource2, bArr, mp3Info2);
        } else {
            trackPositionDataSource2.seek(0);
        }
        long size = trackPositionDataSource.getSize();
        long j = (long) mp3Info2.idv2Size;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 > 0 && size > j) {
            size -= j;
        }
        int i3 = 0;
        while (true) {
            long curPosition = trackPositionDataSource.getCurPosition();
            if (i2 > 0) {
                curPosition -= j;
            }
            if (curPosition >= size / 10) {
                return -3;
            }
            if (i3 >= 3) {
                str = str2;
                if (trackPositionDataSource2.seek(trackPositionDataSource.getCurPosition() - 3) < 0) {
                    return -3;
                }
            } else {
                str = str2;
            }
            int read = trackPositionDataSource2.read(bArr, 1024);
            if (read == i) {
                mp3Info2.firstFramePosition = -1;
                return -3;
            }
            i3 += read;
            int i4 = 0;
            while (i4 + 4 <= read) {
                if (255 == (bArr[i4] & ExifInterface.MARKER) && 224 == (bArr[i4 + 1] & 224) && IsMp3Header(trackPositionDataSource2, bArr, 1024, i4, mp3Info2)) {
                    mp3Info2.firstFramePosition = (long) (((mp3Info2.idv2Size + i3) - read) + i4);
                    Logger.m21791i(str, "FirstFramePos = " + mp3Info2.firstFramePosition);
                    if (trackPositionDataSource2.seek(mp3Info2.firstFramePosition) < 0) {
                        return -1;
                    }
                    return (trackPositionDataSource2.seek(0) < 0 || !parseVBRFrameInfo(trackPositionDataSource, mp3Info)) ? -1 : 0;
                }
                i = -1;
                i4++;
                str = str;
            }
            str2 = str;
        }
    }

    private static boolean parseVBRFrameInfo(TrackPositionDataSource trackPositionDataSource, Mp3Info mp3Info) {
        TrackPositionDataSource trackPositionDataSource2 = trackPositionDataSource;
        Mp3Info mp3Info2 = mp3Info;
        if (trackPositionDataSource2 == null || mp3Info2 == null) {
            return false;
        }
        long j = mp3Info2.sample_rate;
        int i = mp3Info2.channels;
        byte[] bArr = new byte[1024];
        long j2 = 21;
        if (mp3Info2.mpeg_version == 0) {
            if (i != 1) {
                j2 = 36;
            }
        } else if (i == 1) {
            j2 = 13;
        }
        if (trackPositionDataSource2.seek(trackPositionDataSource.getCurPosition() + j2) < 0 || trackPositionDataSource2.read(bArr, 1024) < 1024) {
            return false;
        }
        if (Mp3DecodeBase.isXingVBRheader(bArr, 4)) {
            Logger.m21791i(TAG, "is Xing VBR");
            mp3Info2.VBRType = 2;
            mp3Info2.isVbr = 1;
            parseXingInfo(bArr, j, mp3Info2);
            return true;
        }
        long curPosition = trackPositionDataSource.getCurPosition();
        String str = TAG;
        if (trackPositionDataSource2.seek(curPosition - (j2 + ((long) 1024))) < 0 || trackPositionDataSource2.seek(trackPositionDataSource.getCurPosition() + 36) < 0 || trackPositionDataSource2.read(bArr, 1024) < 1024) {
            return false;
        }
        if (Mp3DecodeBase.isVBRIVBRHeader(bArr, 4)) {
            Logger.m21791i(str, "is VBRI VBR");
            mp3Info2.VBRType = 1;
            mp3Info2.isVbr = 1;
            parseVBRIInfo(mp3Info2, bArr, j);
            return true;
        }
        Logger.m21791i(str, "is CBR");
        mp3Info2.VBRType = 0;
        long size = trackPositionDataSource.getSize();
        if (mp3Info2.fileLengthInBytes <= 0) {
            mp3Info2.fileLengthInBytes = size;
        }
        mp3Info2.duration = (long) ((((float) (mp3Info2.fileLengthInBytes - ((long) mp3Info2.idv2Size))) * 8.0f) / ((float) mp3Info2.bit_rate));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0 A[EDGE_INSN: B:39:0x00c0->B:38:0x00c0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseVBRIInfo(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info r18, byte[] r19, long r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            if (r1 == 0) goto L_0x00c8
            if (r0 != 0) goto L_0x000c
            goto L_0x00c8
        L_0x000c:
            r4 = 10
            r5 = 4
            long r6 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(r1, r4, r5)
            r0.fileLengthInBytes = r6
            r4 = 14
            long r8 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(r1, r4, r5)
            r10 = 0
            r4 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0047
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0047
            int r12 = r0.mpeg_version
            int r13 = r0.layer
            int r13 = r13 - r4
            r0.lengthInFrames = r8
            int[][] r14 = SAMPLE_PER_FRAME
            r12 = r14[r12]
            r12 = r12[r13]
            long r12 = (long) r12
            long r8 = r8 * r12
            double r8 = (double) r8
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 * r12
            double r2 = (double) r2
            double r8 = r8 / r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r2
            long r2 = (long) r8
            r0.duration = r2
        L_0x0047:
            r2 = 18
            r3 = 2
            int r2 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(r1, r2, r3)
            r8 = 20
            int r8 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(r1, r8, r3)
            r9 = 22
            int r9 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(r1, r9, r3)
            r12 = 24
            if (r2 <= 0) goto L_0x00c8
            if (r8 <= 0) goto L_0x00c8
            int r13 = r2 + 1
            long[] r14 = new long[r13]
            r15 = 0
            r16 = r6
            long r5 = r0.firstFramePosition
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
            long r3 = (long) r15
            long r3 = r3 + r5
            int r15 = (int) r3
        L_0x0070:
            long r3 = r0.firstFrameSize
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0079
            long r5 = (long) r15
            long r5 = r5 + r3
            int r15 = (int) r5
        L_0x0079:
            r3 = 1
        L_0x007a:
            if (r3 >= r13) goto L_0x00c0
            r4 = -1
            r5 = 1
            if (r9 != r5) goto L_0x0089
            int r4 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readByte(r1, r12, r5)
            int r12 = r12 + 1
            r6 = 2
        L_0x0087:
            r7 = 4
            goto L_0x00a9
        L_0x0089:
            r6 = 2
            if (r9 != r6) goto L_0x0093
            int r4 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(r1, r12, r6)
            int r12 = r12 + 2
            goto L_0x0087
        L_0x0093:
            r7 = 3
            if (r9 != r7) goto L_0x009d
            int r4 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readUnsignedInt24(r1, r12, r7)
            int r12 = r12 + 3
            goto L_0x0087
        L_0x009d:
            r7 = 4
            if (r9 != r7) goto L_0x00a7
            int r4 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readInt(r1, r12, r7)
            int r12 = r12 + 4
            goto L_0x00a9
        L_0x00a7:
            r10 = 0
            r14 = r10
        L_0x00a9:
            if (r4 >= 0) goto L_0x00ac
            goto L_0x00c0
        L_0x00ac:
            int r4 = r4 * r8
            int r15 = r15 + r4
            long r10 = (long) r15
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            r10 = r16
            if (r4 < 0) goto L_0x00b8
            int r4 = (int) r10
            r15 = r4
        L_0x00b8:
            long r5 = (long) r15
            r14[r3] = r5
            int r3 = r3 + 1
            r16 = r10
            goto L_0x007a
        L_0x00c0:
            r0.entry_count = r2
            r0.entry_size = r9
            r0.scale_factor = r8
            r0.toc_table = r14
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.parseVBRIInfo(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse$Mp3Info, byte[], long):void");
    }

    private static void parseXingInfo(byte[] bArr, long j, Mp3Info mp3Info) {
        if (bArr != null && mp3Info != null) {
            long[] jArr = null;
            int readInt = Mp3DecodeBase.readInt(bArr, 4, 4);
            int i = 8;
            if ((readInt & 1) == 1) {
                long readLong = Mp3DecodeBase.readLong(bArr, 8, 4) - 1;
                if (readLong > 0 && j > 0) {
                    int i2 = mp3Info.mpeg_version;
                    mp3Info.lengthInFrames = readLong;
                    mp3Info.duration = (long) (((((double) (readLong * ((long) SAMPLE_PER_FRAME[i2][mp3Info.layer - 1]))) * 1.0d) / ((double) j)) * 1000.0d);
                }
                i = 12;
            }
            if ((readInt & 2) == 2) {
                mp3Info.fileLengthInBytes = Mp3DecodeBase.readLong(bArr, i, 4);
                i += 4;
            }
            if ((readInt & 4) == 4) {
                jArr = new long[100];
                for (int i3 = 0; i3 < 100; i3++) {
                    jArr[i3] = (long) (bArr[i3 + i] & ExifInterface.MARKER);
                }
            }
            if (readInt > 0 && jArr != null) {
                mp3Info.toc_table = jArr;
                mp3Info.flag_value = readInt;
            }
        }
    }

    private static void skipId3v2(TrackPositionDataSource trackPositionDataSource, byte[] bArr, Mp3Info mp3Info) {
        boolean z;
        int i;
        if (trackPositionDataSource != null && bArr != null && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i2 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & v2encoder.enumCODEC_vcodec2) != 0) {
                i = i2 + 20;
                z = true;
            } else {
                i = i2 + 10;
                z = false;
            }
            if (trackPositionDataSource.seek((long) i) >= 0) {
                if (!z) {
                    byte[] bArr2 = new byte[1];
                    int read = trackPositionDataSource.read(bArr2, 1);
                    while (bArr2[0] == 0 && read == 1) {
                        i++;
                        read = trackPositionDataSource.read(bArr2, 1);
                    }
                }
                mp3Info.idv2Size = i;
                Logger.m21791i(TAG, "id3V2 Size: " + mp3Info.idv2Size);
                trackPositionDataSource.seek((long) i);
            }
        }
    }
}
