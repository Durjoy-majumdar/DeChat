package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.util.StreamUtils;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class FileDataSource implements IDataSource {
    private long currentPosition;
    private RandomAccessFile file;
    private FileInputStream fileInputStream;
    private final String filePath;
    private boolean opened = false;
    private BufferedInputStream readingStream;

    public FileDataSource(String str) {
        this.filePath = str;
    }

    public void close() {
        if (this.opened) {
            FileInputStream fileInputStream2 = this.fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            BufferedInputStream bufferedInputStream = this.readingStream;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.opened = false;
        }
    }

    public AudioFormat.AudioType getAudioType() {
        return AudioRecognition.recognitionAudioFormatExactly(this.filePath);
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getSize() {
        return this.file.length();
    }

    public void open() {
        if (!this.opened) {
            this.opened = true;
            this.file = new RandomAccessFile(this.filePath, "r");
            this.fileInputStream = new FileInputStream(this.file.getFD());
            this.readingStream = new BufferedInputStream(this.fileInputStream);
            this.currentPosition = 0;
        }
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        long j2;
        long j3 = this.currentPosition;
        if (j3 != j) {
            if (j3 > j) {
                this.file.seek(j);
                this.readingStream = new BufferedInputStream(this.fileInputStream);
                j2 = j;
            } else {
                j2 = j3 + StreamUtils.skipForBufferStream(this.readingStream, j - j3);
            }
            if (j2 != j) {
                return -1;
            }
            this.currentPosition = j;
        }
        int read = this.readingStream.read(bArr, i, i2);
        if (read >= 0) {
            this.currentPosition += (long) read;
        }
        return read;
    }

    public String toString() {
        return "(fd)" + this.filePath;
    }
}
