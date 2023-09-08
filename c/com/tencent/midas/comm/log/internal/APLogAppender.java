package com.tencent.midas.comm.log.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.log.APLogFileInfo;
import com.tencent.midas.comm.log.processor.APLogCompressor;
import com.tencent.midas.comm.log.processor.APLogEncryptor;
import com.tencent.midas.comm.log.processor.APLogWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

public class APLogAppender {
    private static final int AUTO_FLUSH_INTERVAL = 15000;
    private static final int BUFFER_BLOCK_SIZE = 153600;
    private static final int POSITION_INIT = 12;
    private static APLogAppender instance;
    /* access modifiers changed from: private */
    public static boolean stopAutoFlush;
    private byte[] EMPTY_BUFFER = new byte[BUFFER_BLOCK_SIZE];
    private String FLAG_BEGIN = "============mmap cache begin===========\r\n";
    private String FLAG_END = "============mmap cache end=============\r\n";
    private final String SPACE = " ";
    private final byte[] _bytes = new byte[0];
    /* access modifiers changed from: private */
    public Handler autoFlushHandler = null;
    /* access modifiers changed from: private */
    public Runnable autoFlushRunnable = new Runnable() {
        public void run() {
            try {
                APLogAppender.this.flushAndWrite();
                if (!APLogAppender.stopAutoFlush && APLogAppender.this.autoFlushHandler != null) {
                    APLogAppender.this.autoFlushHandler.postDelayed(APLogAppender.this.autoFlushRunnable, 15000);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    };
    private HandlerThread autoFlushThread = null;
    private FileChannel fileChannel = null;
    private APLogCompressor mCompressor = null;
    private APLogEncryptor mEncryptor = null;
    private APLogWriter mWriter = null;
    private MappedByteBuffer mappedByteBuffer = null;
    private RandomAccessFile randomAccessFile = null;
    private volatile long seq = 12;

    private APLogAppender() {
        HandlerThread handlerThread = new HandlerThread("LOG-FLUSH");
        this.autoFlushThread = handlerThread;
        handlerThread.start();
        this.autoFlushHandler = new Handler(this.autoFlushThread.getLooper());
    }

    private synchronized void checkAndFlushBuffer() {
        try {
            MappedByteBuffer mappedByteBuffer2 = this.mappedByteBuffer;
            if (mappedByteBuffer2 != null) {
                int i = (int) mappedByteBuffer2.getLong(0);
                if (i <= 12) {
                    this.seq = 12;
                    return;
                }
                flushBuffer(i - 12);
            } else {
                return;
            }
        } catch (Throwable th) {
            String.format(Locale.CHINA, "check and flush buffer error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
        }
        return;
    }

    private void createBufferProcessor() {
        if (APLog.getLogInfo() != null && APLog.getLogInfo().isCompressLog()) {
            this.mCompressor = APLogCompressor.create();
        }
        if (APLog.getLogInfo() != null && APLog.getLogInfo().isEncryptLog()) {
            this.mEncryptor = APLogEncryptor.create();
        }
        this.mWriter = APLogWriter.create();
    }

    private void flushBuffer(int i) {
        MappedByteBuffer mappedByteBuffer2 = this.mappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            if (i > BUFFER_BLOCK_SIZE) {
                i = BUFFER_BLOCK_SIZE;
            }
            byte[] bArr = new byte[i];
            mappedByteBuffer2.position(12);
            this.mappedByteBuffer.get(bArr);
            this.mWriter.write(bArr, process(this.FLAG_BEGIN), process(this.FLAG_END));
            this.mappedByteBuffer.position(12);
            this.mappedByteBuffer.put(this.EMPTY_BUFFER, 12, i);
            this.mappedByteBuffer.putLong(0, 0);
            resetPosAndSeq();
        }
    }

    private void initMmap() {
        if (this.mappedByteBuffer != null) {
            checkAndFlushBuffer();
            this.mappedByteBuffer.putLong(0, 12);
            this.mappedByteBuffer.putInt(8, 43);
            resetPosAndSeq();
        }
    }

    public static APLogAppender open() {
        APLogAppender aPLogAppender = instance;
        if (aPLogAppender != null) {
            return aPLogAppender;
        }
        APLogAppender aPLogAppender2 = new APLogAppender();
        instance = aPLogAppender2;
        aPLogAppender2.createBufferProcessor();
        instance.openMmapFile();
        instance.initMmap();
        instance.startAutoFlush();
        return instance;
    }

    private void openMmapFile() {
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(APLogFileInfo.mmapName, "rw");
            this.randomAccessFile = randomAccessFile2;
            FileChannel channel = randomAccessFile2.getChannel();
            this.fileChannel = channel;
            this.mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 153600);
        } catch (Throwable th) {
            String.format(Locale.CHINA, "open log mmap file error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
        }
    }

    private synchronized byte[] process(String str) {
        byte[] bytes;
        try {
            bytes = (System.currentTimeMillis() + " " + str).getBytes();
            APLogCompressor aPLogCompressor = this.mCompressor;
            if (aPLogCompressor != null) {
                bytes = aPLogCompressor.compress(bytes);
            }
            APLogEncryptor aPLogEncryptor = this.mEncryptor;
            if (aPLogEncryptor != null) {
                bytes = aPLogEncryptor.encrypt(bytes);
            }
        } catch (Throwable th) {
            String.format(Locale.CHINA, "process log error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
            return this._bytes;
        }
        return bytes;
    }

    private void resetPosAndSeq() {
        if (this.mappedByteBuffer != null) {
            this.seq = 12;
            this.mappedByteBuffer.position(12);
        }
    }

    private void startAutoFlush() {
        if (APLog.getLogInfo() != null && APLog.getLogInfo().isAutoFlush()) {
            try {
                this.autoFlushHandler.postDelayed(this.autoFlushRunnable, 15000);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private void stopAutoFlush() {
        stopAutoFlush = true;
    }

    public void append(String str) {
        try {
            updateMmap(process(str));
        } catch (Throwable th) {
            String.format(Locale.CHINA, "append log error: <%s> %s", new Object[]{th.getClass().getName(), th.getMessage()});
        }
    }

    public void flushAndWrite() {
        try {
            checkAndFlushBuffer();
            APLogWriter aPLogWriter = this.mWriter;
            if (aPLogWriter != null) {
                aPLogWriter.flush();
            }
        } catch (Throwable th) {
            String.format(Locale.CHINA, "flush buffer and write error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
        }
    }

    public synchronized void updateMmap(byte[] bArr) {
        if (this.seq + ((long) bArr.length) > 102400) {
            checkAndFlushBuffer();
        }
        MappedByteBuffer mappedByteBuffer2 = this.mappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.put(bArr);
            this.seq += (long) bArr.length;
            this.mappedByteBuffer.putLong(0, this.seq);
        }
    }
}
