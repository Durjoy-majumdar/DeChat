package p300c8;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: c8.r */
public final class C79955r implements C79946g {

    /* renamed from: a */
    public final C79967x<? super C79955r> f234221a;

    /* renamed from: b */
    public RandomAccessFile f234222b;

    /* renamed from: c */
    public Uri f234223c;

    /* renamed from: d */
    public long f234224d;

    /* renamed from: e */
    public boolean f234225e;

    /* renamed from: c8.r$a */
    public static class C79956a extends IOException {
        public C79956a(IOException iOException) {
            super(iOException);
        }
    }

    public C79955r(C79967x<? super C79955r> xVar) {
        this.f234221a = xVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        try {
            this.f234223c = jVar.f234181a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f234181a.getPath(), "r");
            this.f234222b = randomAccessFile;
            randomAccessFile.seek(jVar.f234184d);
            long j = jVar.f234185e;
            if (j == -1) {
                j = this.f234222b.length() - jVar.f234184d;
            }
            this.f234224d = j;
            if (j >= 0) {
                this.f234225e = true;
                C79967x<? super C79955r> xVar = this.f234221a;
                if (xVar != null) {
                    xVar.mo17932c(this, jVar);
                }
                return this.f234224d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C79956a(e);
        }
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f234224d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f234222b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f234224d -= (long) read;
                C79967x<? super C79955r> xVar = this.f234221a;
                if (xVar != null) {
                    xVar.mo17931a(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new C79956a(e);
        }
    }

    public void close() {
        this.f234223c = null;
        try {
            RandomAccessFile randomAccessFile = this.f234222b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f234222b = null;
            if (this.f234225e) {
                this.f234225e = false;
                C79967x<? super C79955r> xVar = this.f234221a;
                if (xVar != null) {
                    xVar.mo17933d(this);
                }
            }
        } catch (IOException e) {
            throw new C79956a(e);
        } catch (Throwable th) {
            this.f234222b = null;
            if (this.f234225e) {
                this.f234225e = false;
                C79967x<? super C79955r> xVar2 = this.f234221a;
                if (xVar2 != null) {
                    xVar2.mo17933d(this);
                }
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f234223c;
    }
}
