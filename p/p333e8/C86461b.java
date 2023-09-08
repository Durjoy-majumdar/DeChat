package p333e8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: e8.b */
public final class C86461b {

    /* renamed from: a */
    public final File f251254a;

    /* renamed from: b */
    public final File f251255b;

    /* renamed from: e8.b$a */
    public static final class C86462a extends OutputStream {

        /* renamed from: d */
        public final FileOutputStream f251256d;

        /* renamed from: e */
        public boolean f251257e = false;

        public C86462a(File file) {
            this.f251256d = new FileOutputStream(file);
        }

        public void close() {
            if (!this.f251257e) {
                this.f251257e = true;
                flush();
                try {
                    this.f251256d.getFD().sync();
                } catch (IOException unused) {
                }
                this.f251256d.close();
            }
        }

        public void flush() {
            this.f251256d.flush();
        }

        public void write(int i) {
            this.f251256d.write(i);
        }

        public void write(byte[] bArr) {
            this.f251256d.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f251256d.write(bArr, i, i2);
        }
    }

    public C86461b(File file) {
        this.f251254a = file;
        this.f251255b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public InputStream mo120880a() {
        if (this.f251255b.exists()) {
            this.f251254a.delete();
            this.f251255b.renameTo(this.f251254a);
        }
        return new FileInputStream(this.f251254a);
    }

    /* renamed from: b */
    public OutputStream mo120881b() {
        if (this.f251254a.exists()) {
            if (this.f251255b.exists()) {
                this.f251254a.delete();
            } else if (!this.f251254a.renameTo(this.f251255b)) {
                Objects.toString(this.f251254a);
                Objects.toString(this.f251255b);
            }
        }
        try {
            return new C86462a(this.f251254a);
        } catch (FileNotFoundException unused) {
            if (this.f251254a.getParentFile().mkdirs()) {
                try {
                    return new C86462a(this.f251254a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f251254a);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.f251254a);
            }
        }
    }
}
