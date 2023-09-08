package cf0;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: cf0.h */
public class C80029h extends OutputStream {

    /* renamed from: d */
    public final RandomAccessFile f234463d;

    public C80029h(File file, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f234463d = randomAccessFile;
        if (j >= 0) {
            randomAccessFile.setLength(j);
            if (randomAccessFile.length() != j) {
                throw new IOException("Unable to set the file size");
            }
        }
    }

    public void close() {
        flush();
        this.f234463d.close();
    }

    public void flush() {
        this.f234463d.getChannel().force(true);
    }

    public void write(int i) {
        this.f234463d.write(i);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f234463d.write(bArr, i, i2);
    }
}
