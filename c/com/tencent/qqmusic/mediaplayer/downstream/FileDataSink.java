package com.tencent.qqmusic.mediaplayer.downstream;

import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.RandomAccessFile;

public class FileDataSink implements IDataSink {
    private static final String TAG = "FileDataSink";
    private long currentPosition = 0;
    private final String filePath;
    private boolean opened = false;
    private RandomAccessFile randomAccessFile = null;

    public FileDataSink(String str) {
        this.filePath = str;
    }

    public void close() {
        if (this.opened) {
            this.randomAccessFile.close();
            this.currentPosition = 0;
        }
    }

    public void open() {
        if (!this.opened) {
            this.randomAccessFile = new RandomAccessFile(this.filePath, "rw");
            this.currentPosition = 0;
            this.opened = true;
        }
    }

    public int write(long j, byte[] bArr, int i, int i2) {
        if (this.randomAccessFile == null) {
            return 0;
        }
        if (this.currentPosition != j) {
            Logger.m21786d(TAG, "[write] seek to: " + j);
            this.randomAccessFile.seek(j);
            this.currentPosition = j;
        }
        this.randomAccessFile.write(bArr, i, i2);
        this.currentPosition += (long) i2;
        return i2;
    }
}
