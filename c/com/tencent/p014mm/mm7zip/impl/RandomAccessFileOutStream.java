package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IOutStream;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.tencent.mm.mm7zip.impl.RandomAccessFileOutStream */
public class RandomAccessFileOutStream implements IOutStream, Closeable {
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileOutStream(RandomAccessFile randomAccessFile2) {
        this.randomAccessFile = randomAccessFile2;
    }

    public void close() {
        this.randomAccessFile.close();
    }

    public synchronized long seek(long j, int i) {
        if (i == 0) {
            this.randomAccessFile.seek(j);
        } else if (i == 1) {
            RandomAccessFile randomAccessFile2 = this.randomAccessFile;
            randomAccessFile2.seek(randomAccessFile2.getFilePointer() + j);
        } else if (i == 2) {
            try {
                RandomAccessFile randomAccessFile3 = this.randomAccessFile;
                randomAccessFile3.seek(randomAccessFile3.length() + j);
            } catch (IOException e) {
                throw new SevenZipException("Error while seek operation", e);
            }
        } else {
            throw new RuntimeException("Seek: unknown origin: " + i);
        }
        return this.randomAccessFile.getFilePointer();
    }

    public synchronized void setSize(long j) {
        try {
            this.randomAccessFile.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException("Error setting new length of the file", e);
        }
    }

    public synchronized int write(byte[] bArr) {
        try {
            this.randomAccessFile.write(bArr);
        } catch (IOException e) {
            throw new SevenZipException("Error reading random access file", e);
        }
        return bArr.length;
    }
}
