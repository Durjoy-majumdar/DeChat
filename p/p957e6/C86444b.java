package p957e6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p811d6.C116587a;
import p811d6.C86197l;
import p957e6.C86449e;

/* renamed from: e6.b */
public class C86444b implements C116587a {

    /* renamed from: a */
    public final C86443a f251236a;

    /* renamed from: b */
    public File f251237b;

    /* renamed from: c */
    public RandomAccessFile f251238c;

    public C86444b(File file, C86443a aVar) {
        File file2;
        if (aVar != null) {
            try {
                this.f251236a = aVar;
                C86446d.m107124a(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + ".download");
                }
                this.f251237b = file2;
                this.f251238c = new RandomAccessFile(this.f251237b, exists ? "r" : "rw");
            } catch (IOException e) {
                throw new C86197l("Error using file " + file + " as disc cache", e);
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public synchronized void mo120864a() {
        if (!mo120867c()) {
            close();
            File file = new File(this.f251237b.getParentFile(), this.f251237b.getName().substring(0, this.f251237b.getName().length() - 9));
            if (this.f251237b.renameTo(file)) {
                this.f251237b = file;
                try {
                    this.f251238c = new RandomAccessFile(this.f251237b, "r");
                    C86443a aVar = this.f251236a;
                    C86449e eVar = (C86449e) aVar;
                    eVar.f251239a.submit(new C86449e.C86450a(this.f251237b));
                } catch (IOException e) {
                    throw new C86197l("Error opening " + this.f251237b + " as disc cache", e);
                }
            } else {
                throw new C86197l("Error renaming file " + this.f251237b + " to " + file + " for completion!");
            }
        }
    }

    public synchronized long available() {
        try {
        } catch (IOException e) {
            throw new C86197l("Error reading length of file " + this.f251237b, e);
        }
        return (long) ((int) this.f251238c.length());
    }

    /* renamed from: b */
    public synchronized void mo120866b(byte[] bArr, int i) {
        try {
            if (!mo120867c()) {
                this.f251238c.seek(available());
                this.f251238c.write(bArr, 0, i);
            } else {
                throw new C86197l("Error append cache: cache file " + this.f251237b + " is completed!");
            }
        } catch (IOException e) {
            throw new C86197l(String.format("Error writing %d bytes to %s from buffer with size %d", new Object[]{Integer.valueOf(i), this.f251238c, Integer.valueOf(bArr.length)}), e);
        }
    }

    /* renamed from: c */
    public synchronized boolean mo120867c() {
        return !this.f251237b.getName().endsWith(".download");
    }

    public synchronized void close() {
        try {
            this.f251238c.close();
            C86443a aVar = this.f251236a;
            C86449e eVar = (C86449e) aVar;
            eVar.f251239a.submit(new C86449e.C86450a(this.f251237b));
        } catch (IOException e) {
            throw new C86197l("Error closing file " + this.f251237b, e);
        }
    }

    /* renamed from: d */
    public synchronized int mo120869d(byte[] bArr, long j, int i) {
        try {
            this.f251238c.seek(j);
        } catch (IOException e) {
            throw new C86197l(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(available()), Integer.valueOf(bArr.length)}), e);
        }
        return this.f251238c.read(bArr, 0, i);
    }
}
