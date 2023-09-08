package com.tencent.qqmusic.mediaplayer;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WaveWriter {
    private static final int OUTPUT_STREAM_BUFFER = 16384;
    private static final String TAG = "WaveWriter";
    private int mBytesWritten = 0;
    private int mChannels;
    private File mOutFile;
    private BufferedOutputStream mOutStream;
    private int mSampleBits;
    private int mSampleRate;
    private ByteArrayOutputStream mTmpStream;

    public WaveWriter(String str, String str2, int i, int i2, int i3) {
        this.mOutFile = new File(str + File.separator + str2);
        this.mSampleRate = i;
        this.mChannels = i2;
        this.mSampleBits = i3;
    }

    private short[] interpolate(int i, int i2, short[] sArr) {
        if (i == i2) {
            return sArr;
        }
        int round = Math.round((((float) sArr.length) / ((float) i)) * ((float) i2));
        float length = ((float) round) / ((float) sArr.length);
        short[] sArr2 = new short[round];
        for (int i3 = 0; i3 < round; i3++) {
            float f = ((float) i3) / length;
            int i4 = (int) f;
            int i5 = i4 + 1;
            if (i5 >= sArr.length) {
                i5 = sArr.length - 1;
            }
            short s = sArr[i5];
            short s2 = sArr[i4];
            sArr2[i3] = (short) ((int) ((((float) (s - s2)) * (f - ((float) i4))) + ((float) s2)));
        }
        return sArr2;
    }

    private byte[] reSample(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        int i4 = i / 8;
        if (i4 <= 0) {
            return null;
        }
        int length = bArr.length / i4;
        short[] sArr = new short[length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = 0;
            short s = 0;
            while (i8 < i4) {
                s = (short) (((short) ((bArr[i6] & ExifInterface.MARKER) << (i8 * 8))) | s);
                i8++;
                i6++;
            }
            sArr[i7] = s;
        }
        short[] interpolate = interpolate(i2, i3, sArr);
        int length2 = interpolate.length;
        if (i4 == 1) {
            bArr2 = new byte[length2];
            while (i5 < length2) {
                bArr2[i5] = (byte) interpolate[i5];
                i5++;
            }
        } else {
            bArr2 = new byte[(length2 * 2)];
            while (i5 < interpolate.length) {
                int i9 = i5 * 2;
                short s2 = interpolate[i5];
                bArr2[i9] = (byte) (s2 & 255);
                bArr2[i9 + 1] = (byte) ((s2 >> 8) & 255);
                i5++;
            }
        }
        this.mSampleRate = i3;
        return bArr2;
    }

    private static void writeUnsignedShortLE(ByteArrayOutputStream byteArrayOutputStream, short s) {
        byteArrayOutputStream.write(s);
        byteArrayOutputStream.write(s >> 8);
    }

    private void writeWaveHeader() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.mOutFile, "rw");
        randomAccessFile.seek(0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i = (this.mSampleBits + 7) / 8;
        try {
            dataOutputStream.writeBytes("RIFF");
            dataOutputStream.writeInt(Integer.reverseBytes(this.mBytesWritten + 36));
            dataOutputStream.writeBytes("WAVE");
            dataOutputStream.writeBytes("fmt ");
            dataOutputStream.writeInt(Integer.reverseBytes(16));
            dataOutputStream.writeShort(Short.reverseBytes(1));
            dataOutputStream.writeShort(Short.reverseBytes((short) this.mChannels));
            dataOutputStream.writeInt(Integer.reverseBytes(this.mSampleRate));
            dataOutputStream.writeInt(Integer.reverseBytes(this.mSampleRate * this.mChannels * i));
            dataOutputStream.writeShort(Short.reverseBytes((short) (this.mChannels * i)));
            dataOutputStream.writeShort(Short.reverseBytes((short) this.mSampleBits));
            dataOutputStream.writeBytes("data");
            dataOutputStream.writeInt(Integer.reverseBytes(this.mBytesWritten));
            byteArrayOutputStream.flush();
            randomAccessFile.write(byteArrayOutputStream.toByteArray());
        } finally {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            randomAccessFile.close();
        }
    }

    public byte[] changeStereoToMono(byte[] bArr) {
        int i = this.mChannels;
        if (i != 2) {
            return bArr;
        }
        int i2 = this.mSampleBits / 8;
        long length = (long) ((bArr.length / i) / i2);
        byte[] bArr2 = new byte[((int) (((long) i2) * length))];
        for (int i3 = 0; ((long) i3) < length; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.mChannels;
                bArr2[(i3 * i2) + i4] = (byte) ((bArr[((i3 * i5) * i2) + i4] + bArr[(((i5 * i3) + 1) * i2) + i4]) / 2);
            }
        }
        this.mChannels = 1;
        return bArr2;
    }

    public void closeWaveFile() {
        BufferedOutputStream bufferedOutputStream = this.mOutStream;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
            this.mOutStream.close();
        }
        ByteArrayOutputStream byteArrayOutputStream = this.mTmpStream;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.flush();
            this.mTmpStream.close();
        }
        writeWaveHeader();
    }

    public boolean createWaveFile() {
        if (this.mOutFile.exists()) {
            this.mOutFile.delete();
        }
        this.mOutFile.getParentFile().mkdirs();
        if (!this.mOutFile.createNewFile()) {
            return false;
        }
        this.mOutStream = new BufferedOutputStream(new FileOutputStream(this.mOutFile), 16384);
        this.mTmpStream = new ByteArrayOutputStream();
        this.mOutStream.write(new byte[44]);
        return true;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public boolean reSampler() {
        try {
            byte[] reSample = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
            if (reSample == null) {
                return false;
            }
            Logger.m21786d(TAG, "mTmpStream length = " + this.mTmpStream.toByteArray().length);
            byte[] changeStereoToMono = changeStereoToMono(reSample);
            Logger.m21786d(TAG, "monoData length = " + changeStereoToMono.length);
            byte[] reSample2 = reSample(changeStereoToMono, this.mSampleBits, 8000, 4000);
            if (reSample2 == null) {
                return false;
            }
            Logger.m21786d(TAG, "resultData length = " + reSample2.length);
            this.mBytesWritten = reSample2.length;
            this.mOutStream.write(reSample2);
            return true;
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
            return false;
        }
    }

    public boolean reSamplerTo8K() {
        try {
            byte[] reSample = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
            if (reSample == null) {
                return false;
            }
            Logger.m21786d(TAG, "mTmpStream length = " + this.mTmpStream.toByteArray().length);
            byte[] changeStereoToMono = changeStereoToMono(reSample);
            Logger.m21786d(TAG, "resultData length = " + changeStereoToMono.length);
            this.mBytesWritten = changeStereoToMono.length;
            this.mOutStream.write(changeStereoToMono);
            return true;
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
            return false;
        }
    }

    public void setSampleByte(int i) {
        this.mSampleBits = i;
    }

    public void write(short[] sArr, int i, int i2) {
        if (i <= i2) {
            while (i < i2) {
                writeUnsignedShortLE(this.mTmpStream, sArr[i]);
                this.mBytesWritten += 2;
                i++;
            }
            return;
        }
        throw new IndexOutOfBoundsException(String.format("offset %d is greater than length %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public void writeDone() {
        try {
            this.mOutStream.write(this.mTmpStream.toByteArray());
        } catch (IOException e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    public void write(short[] sArr, short[] sArr2, int i, int i2) {
        if (this.mChannels == 2) {
            if (i <= i2) {
                while (i < i2) {
                    writeUnsignedShortLE(this.mTmpStream, sArr[i]);
                    writeUnsignedShortLE(this.mTmpStream, sArr2[i]);
                    this.mBytesWritten += 4;
                    i++;
                }
                return;
            }
            throw new IndexOutOfBoundsException(String.format("offset %d is greater than length %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    public WaveWriter(File file, int i, int i2, int i3) {
        this.mOutFile = file;
        this.mSampleRate = i;
        this.mChannels = i2;
        this.mSampleBits = i3;
    }
}
