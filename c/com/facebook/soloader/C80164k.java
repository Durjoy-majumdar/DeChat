package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.k */
public final class C80164k implements Closeable {

    /* renamed from: d */
    public final FileOutputStream f234680d;

    /* renamed from: e */
    public final FileLock f234681e;

    public C80164k(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f234680d = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f234681e = lock;
        } catch (Throwable th) {
            this.f234680d.close();
            throw th;
        }
    }

    public void close() {
        try {
            FileLock fileLock = this.f234681e;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f234680d.close();
        }
    }
}
