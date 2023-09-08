package com.tencent.midas.comm.log.processor;

import com.tencent.midas.comm.log.APLogFileInfo;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

public class APLogWriter {
    private FileChannel fileChannel = null;
    private MappedByteBuffer mappedByteBuffer = null;
    private RandomAccessFile randomAccessFile = null;

    public static APLogWriter create() {
        APLogWriter aPLogWriter = new APLogWriter();
        aPLogWriter.openLogFile();
        return aPLogWriter;
    }

    private void openLogFile() {
        try {
            String str = APLogFileInfo.fileName;
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(APLogFileInfo.fileName, "rw");
            this.randomAccessFile = randomAccessFile2;
            this.fileChannel = randomAccessFile2.getChannel();
        } catch (FileNotFoundException unused) {
        }
    }

    private long refreshFileChannel(long j) {
        long j2;
        try {
            j2 = this.fileChannel.size();
        } catch (IOException unused) {
            APLogFileInfo.updateFileName();
            openLogFile();
            j2 = 0;
        }
        long j3 = (long) (APLogFileUtil.maxLogFileSizeMB * 1024 * 1024);
        String.format(Locale.CHINA, "size to write: %d, channel size: %d, limit: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
        if ((j + j2) - j3 <= 0) {
            return j2;
        }
        APLogFileInfo.updateFileName();
        openLogFile();
        return 0;
    }

    public void close() {
        try {
            FileChannel fileChannel2 = this.fileChannel;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            RandomAccessFile randomAccessFile2 = this.randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            MappedByteBuffer mappedByteBuffer2 = this.mappedByteBuffer;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.force();
                this.mappedByteBuffer.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void flush() {
        MappedByteBuffer mappedByteBuffer2 = this.mappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.force();
        }
    }

    public void write(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            long refreshFileChannel = refreshFileChannel((long) bArr.length);
            System.currentTimeMillis();
            this.mappedByteBuffer = this.fileChannel.map(FileChannel.MapMode.READ_WRITE, refreshFileChannel, (long) (bArr.length + bArr2.length + bArr3.length));
            System.currentTimeMillis();
            System.currentTimeMillis();
            this.mappedByteBuffer.put(bArr2);
            this.mappedByteBuffer.put(bArr);
            this.mappedByteBuffer.put(bArr3);
            this.mappedByteBuffer.force();
            System.currentTimeMillis();
            APLogFileUtil.deleteOldFileToday(APLogFileInfo.dirName);
        } catch (Throwable th) {
            String.format(Locale.CHINA, "cache log to file error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
        }
    }
}
