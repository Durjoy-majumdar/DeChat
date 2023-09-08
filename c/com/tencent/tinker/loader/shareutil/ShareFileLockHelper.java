package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

public class ShareFileLockHelper implements Closeable {
    public static final int LOCK_WAIT_EACH_TIME = 10;
    public static final int MAX_LOCK_ATTEMPTS = 3;
    private static final String TAG = "Tinker.FileLockHelper";
    private final FileLock fileLock;
    private final FileOutputStream outputStream;

    private ShareFileLockHelper(File file) {
        this.outputStream = new FileOutputStream(file);
        FileLock fileLock2 = null;
        Exception e = null;
        int i = 0;
        while (i < 3) {
            i++;
            try {
                fileLock2 = this.outputStream.getChannel().lock();
                if (fileLock2 != null) {
                    break;
                }
            } catch (Exception e2) {
                e = e2;
                ShareTinkerLog.m106531e(TAG, "getInfoLock Thread failed time:10", new Object[0]);
            }
            try {
                Thread.sleep(10);
            } catch (Exception e3) {
                ShareTinkerLog.m106531e(TAG, "getInfoLock Thread sleep exception", e3);
            }
        }
        if (fileLock2 != null) {
            this.fileLock = fileLock2;
            return;
        }
        throw new IOException("Tinker Exception:FileLockHelper lock file failed: " + file.getAbsolutePath(), e);
    }

    public static ShareFileLockHelper getFileLock(File file) {
        return new ShareFileLockHelper(file);
    }

    public void close() {
        try {
            FileLock fileLock2 = this.fileLock;
            if (fileLock2 != null) {
                fileLock2.release();
            }
        } finally {
            FileOutputStream fileOutputStream = this.outputStream;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
