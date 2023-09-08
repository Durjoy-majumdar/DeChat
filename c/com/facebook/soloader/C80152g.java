package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.g */
public class C80152g implements C80151f {

    /* renamed from: d */
    public File f234657d;

    /* renamed from: e */
    public FileInputStream f234658e;

    /* renamed from: f */
    public FileChannel f234659f;

    public C80152g(File file) {
        this.f234657d = file;
        FileInputStream fileInputStream = new FileInputStream(this.f234657d);
        this.f234658e = fileInputStream;
        this.f234659f = fileInputStream.getChannel();
    }

    public void close() {
        this.f234658e.close();
    }

    public boolean isOpen() {
        return this.f234659f.isOpen();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.f234659f.read(byteBuffer);
    }

    /* renamed from: w */
    public int mo110966w(ByteBuffer byteBuffer, long j) {
        return this.f234659f.read(byteBuffer, j);
    }

    public int write(ByteBuffer byteBuffer) {
        return this.f234659f.write(byteBuffer);
    }
}
