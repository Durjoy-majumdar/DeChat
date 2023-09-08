package com.tencent.qqmusic.mediaplayer.codec.mp3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.wxmm.v2encoder;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MP3FileCheck {
    private static final String TAG = "MP3FileCheck";
    private byte[] buf = new byte[8192];
    private int endPos;
    private boolean eof;
    private int frameCount;
    private boolean hasCheck = false;
    private boolean hasID3V2 = false;
    private MP3Header header = new MP3Header();
    private int headerMask;
    private boolean isMP3 = false;
    private String mFilePath = null;
    private int mID3V2Size = -1;
    private RandomAccessFile mRandomAccessFile = null;
    private int pos;
    private int skipped;
    private boolean sync;

    public MP3FileCheck(String str) {
        this.mFilePath = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r5 = (r4 >> 12) & 15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean available(int r4, int r5) {
        /*
            r3 = this;
            r0 = r4 & r5
            r1 = 1
            if (r0 != r5) goto L_0x001f
            int r5 = r4 >> 19
            r0 = 3
            r5 = r5 & r0
            if (r5 == r1) goto L_0x001f
            int r5 = r4 >> 17
            r5 = r5 & r0
            if (r5 == 0) goto L_0x001f
            int r5 = r4 >> 12
            r2 = 15
            r5 = r5 & r2
            if (r5 == r2) goto L_0x001f
            if (r5 == 0) goto L_0x001f
            int r4 = r4 >> 10
            r4 = r4 & r0
            if (r4 == r0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.mp3.MP3FileCheck.available(int, int):boolean");
    }

    private int byte2int(byte[] bArr, int i) {
        return (bArr[i + 3] & ExifInterface.MARKER) | (bArr[i] << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8);
    }

    private boolean checkAndSeekID3V2Tag() {
        byte[] bArr = new byte[10];
        int fillBuffer = fillBuffer(bArr, 0, 10);
        if (fillBuffer <= 0) {
            return false;
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i = (bArr[6] << 21) + (bArr[7] << 14) + (bArr[8] << 7) + bArr[9];
            this.mID3V2Size = i;
            this.hasID3V2 = true;
            seekTo(i - fillBuffer);
            Logger.m21786d(TAG, "有ID3V2，ID3V2大小 = " + this.mID3V2Size);
        } else {
            closeFileStream();
            Logger.m21786d(TAG, "没有有ID3V2");
        }
        return this.hasID3V2;
    }

    private void closeFileStream() {
        RandomAccessFile randomAccessFile = this.mRandomAccessFile;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                Logger.m21790e(TAG, (Throwable) e);
            }
            this.mRandomAccessFile = null;
        }
    }

    private int fillBuffer(byte[] bArr, int i, int i2) {
        try {
            if (this.mRandomAccessFile == null) {
                this.mRandomAccessFile = new RandomAccessFile(this.mFilePath, "r");
            }
            return this.mRandomAccessFile.read(bArr, i, i2);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean isMp3File(String str) {
        return new MP3FileCheck(str).isMp3File();
    }

    private void nextFrameHeader() {
        int i = 0;
        while (!this.eof && !syncFrame()) {
            int i2 = this.endPos;
            int i3 = this.pos;
            int i4 = i2 - i3;
            if (i4 > 0) {
                byte[] bArr = this.buf;
                System.arraycopy(bArr, i3, bArr, 0, i4);
            }
            int fillBuffer = fillBuffer(this.buf, i4, this.pos) + i4;
            this.endPos = fillBuffer;
            if (fillBuffer <= i4 || (i = i + this.pos) > 65536) {
                this.eof = true;
            }
            this.pos = 0;
        }
    }

    private void seekTo(int i) {
        try {
            this.mRandomAccessFile.seek((long) i);
        } catch (Exception e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    private boolean syncFrame() {
        int i = this.pos;
        if (this.endPos - i <= 4) {
            return false;
        }
        int byte2int = byte2int(this.buf, i);
        this.pos += 4;
        System.out.println(this.frameCount);
        while (true) {
            if (this.eof) {
                break;
            }
            while (!available(byte2int, this.headerMask)) {
                byte[] bArr = this.buf;
                int i2 = this.pos;
                int i3 = i2 + 1;
                this.pos = i3;
                byte2int = (byte2int << 8) | (bArr[i2] & ExifInterface.MARKER);
                if (i3 == this.endPos) {
                    int i4 = this.skipped;
                    int i5 = i3 - 4;
                    this.pos = i5;
                    this.skipped = i4 + (i5 - i);
                    return false;
                }
            }
            int i6 = this.pos;
            if (i6 > i + 4) {
                this.sync = false;
                this.skipped += (i6 - 4) - i;
            }
            this.header.decode(byte2int);
            int frameSize = this.header.getFrameSize();
            int i7 = this.pos;
            int i8 = i7 + frameSize;
            int i9 = this.endPos;
            if (i8 <= i9 + 4) {
                if (this.sync) {
                    break;
                } else if (i7 + frameSize > i9) {
                    int i15 = this.skipped;
                    int i16 = i7 - 4;
                    this.pos = i16;
                    this.skipped = i15 + (i16 - i);
                    return false;
                } else {
                    int i17 = (1572864 & byte2int) | -2097152 | (393216 & byte2int) | (byte2int & LVBuffer.MAX_STRING_LENGTH);
                    if (available(byte2int(this.buf, (i7 - 4) + frameSize), i17)) {
                        if (this.headerMask == -2097152) {
                            this.headerMask = i17;
                        }
                        this.sync = true;
                    } else {
                        byte[] bArr2 = this.buf;
                        int i18 = this.pos;
                        this.pos = i18 + 1;
                        byte2int = (byte2int << 8) | (bArr2[i18] & ExifInterface.MARKER);
                    }
                }
            } else {
                int i19 = this.skipped;
                int i25 = i7 - 4;
                this.pos = i25;
                this.skipped = i19 + (i25 - i);
                return false;
            }
        }
        if (this.header.isProtected()) {
            this.pos += 2;
        }
        this.frameCount++;
        int i26 = this.skipped;
        if (i26 > 0 || (i26 == 0 && this.sync)) {
            this.isMP3 = true;
            this.skipped = 0;
        }
        return true;
    }

    public void fileCheck() {
        try {
            this.hasCheck = true;
            checkAndSeekID3V2Tag();
            this.headerMask = -2097152;
            this.sync = false;
            this.eof = false;
            this.frameCount = 0;
            int length = this.buf.length;
            this.pos = length;
            this.endPos = length;
            this.header.initialize();
            nextFrameHeader();
            RandomAccessFile randomAccessFile = this.mRandomAccessFile;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception e) {
                    Logger.m21790e(TAG, (Throwable) e);
                }
            }
        } catch (Exception e2) {
            Logger.m21790e(TAG, (Throwable) e2);
            RandomAccessFile randomAccessFile2 = this.mRandomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (Throwable th) {
            RandomAccessFile randomAccessFile3 = this.mRandomAccessFile;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (Exception e3) {
                    Logger.m21790e(TAG, (Throwable) e3);
                }
            }
            throw th;
        }
    }

    public int getFrameSize() {
        MP3Header mP3Header = this.header;
        if (mP3Header != null) {
            return mP3Header.getFrameSize();
        }
        return -1;
    }

    private boolean isMp3File() {
        if (!this.hasCheck) {
            fileCheck();
        }
        return this.isMP3;
    }
}
