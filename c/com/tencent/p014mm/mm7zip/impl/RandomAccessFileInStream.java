package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IInStream;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.tencent.mm.mm7zip.impl.RandomAccessFileInStream */
public class RandomAccessFileInStream implements IInStream {
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileInStream(RandomAccessFile randomAccessFile2) {
        this.randomAccessFile = randomAccessFile2;
    }

    public synchronized void close() {
        this.randomAccessFile.close();
    }

    public synchronized int read(byte[] bArr) {
        try {
            int read = this.randomAccessFile.read(bArr);
            if (read == -1) {
                return 0;
            }
            return read;
        } catch (IOException e) {
            throw new SevenZipException("Error reading random access file", e);
        }
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
}
