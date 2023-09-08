package p300c8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c8.c */
public final class C79940c implements C79946g {

    /* renamed from: a */
    public final AssetManager f234161a;

    /* renamed from: b */
    public final C79967x<? super C79940c> f234162b;

    /* renamed from: c */
    public Uri f234163c;

    /* renamed from: d */
    public InputStream f234164d;

    /* renamed from: e */
    public long f234165e;

    /* renamed from: f */
    public boolean f234166f;

    /* renamed from: c8.c$a */
    public static final class C79941a extends IOException {
        public C79941a(IOException iOException) {
            super(iOException);
        }
    }

    public C79940c(Context context, C79967x<? super C79940c> xVar) {
        this.f234161a = context.getAssets();
        this.f234162b = xVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        try {
            Uri uri = jVar.f234181a;
            this.f234163c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f234161a.open(path, 1);
            this.f234164d = open;
            if (open.skip(jVar.f234184d) >= jVar.f234184d) {
                long j = jVar.f234185e;
                if (j != -1) {
                    this.f234165e = j;
                } else {
                    long available = (long) this.f234164d.available();
                    this.f234165e = available;
                    if (available == 2147483647L) {
                        this.f234165e = -1;
                    }
                }
                this.f234166f = true;
                C79967x<? super C79940c> xVar = this.f234162b;
                if (xVar != null) {
                    xVar.mo17932c(this, jVar);
                }
                return this.f234165e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C79941a(e);
        }
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f234165e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C79941a(e);
            }
        }
        int read = this.f234164d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f234165e;
            if (j2 != -1) {
                this.f234165e = j2 - ((long) read);
            }
            C79967x<? super C79940c> xVar = this.f234162b;
            if (xVar != null) {
                xVar.mo17931a(this, read);
            }
            return read;
        } else if (this.f234165e == -1) {
            return -1;
        } else {
            throw new C79941a(new EOFException());
        }
    }

    public void close() {
        this.f234163c = null;
        try {
            InputStream inputStream = this.f234164d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f234164d = null;
            if (this.f234166f) {
                this.f234166f = false;
                C79967x<? super C79940c> xVar = this.f234162b;
                if (xVar != null) {
                    xVar.mo17933d(this);
                }
            }
        } catch (IOException e) {
            throw new C79941a(e);
        } catch (Throwable th) {
            this.f234164d = null;
            if (this.f234166f) {
                this.f234166f = false;
                C79967x<? super C79940c> xVar2 = this.f234162b;
                if (xVar2 != null) {
                    xVar2.mo17933d(this);
                }
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f234163c;
    }
}
