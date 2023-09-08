package cn0;

import an0.C79592a;
import android.net.Uri;
import android.text.TextUtils;
import dn0.C86358b;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: cn0.k */
public class C80087k implements C80109t {

    /* renamed from: a */
    public final C80108s f234562a = null;

    /* renamed from: b */
    public RandomAccessFile f234563b;

    /* renamed from: c */
    public String f234564c;

    /* renamed from: d */
    public long f234565d;

    /* renamed from: e */
    public long f234566e = -1;

    /* renamed from: f */
    public boolean f234567f;

    /* renamed from: g */
    public Uri f234568g;

    /* renamed from: cn0.k$a */
    public static class C80088a extends IOException {
        public C80088a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: a */
    public long mo109835a() {
        try {
            return this.f234563b.length();
        } catch (IOException unused) {
            return 0;
        }
    }

    public long available() {
        return this.f234566e;
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        try {
            this.f234568g = gVar.f234519a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(gVar.f234519a.getPath(), "r");
            this.f234563b = randomAccessFile;
            randomAccessFile.seek(gVar.f234521c);
            long j = gVar.f234522d;
            if (j == -1) {
                j = this.f234563b.length() - gVar.f234521c;
            }
            this.f234565d = j;
            this.f234566e = this.f234563b.length() - gVar.f234521c;
            if (this.f234565d >= 0) {
                this.f234567f = true;
                C80108s sVar = this.f234562a;
                if (sVar != null) {
                    ((C80082h) sVar).mo110331c();
                }
                return this.f234565d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C80088a(e);
        }
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        long j = this.f234565d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f234563b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f234565d -= (long) read;
                C80108s sVar = this.f234562a;
                if (sVar != null) {
                    ((C80082h) sVar).mo110329a(read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new C80088a(e);
        }
    }

    public void close() {
        this.f234564c = null;
        RandomAccessFile randomAccessFile = this.f234563b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f234563b = null;
                if (this.f234567f) {
                    this.f234567f = false;
                    C80108s sVar = this.f234562a;
                    if (sVar != null) {
                        ((C80082h) sVar).mo110330b();
                    }
                }
            } catch (IOException e) {
                throw new C80088a(e);
            } catch (Throwable th) {
                this.f234563b = null;
                if (this.f234567f) {
                    this.f234567f = false;
                    C80108s sVar2 = this.f234562a;
                    if (sVar2 != null) {
                        ((C80082h) sVar2).mo110330b();
                    }
                }
                throw th;
            }
        }
    }

    public C86358b getFileType() {
        String type = C79592a.m96648a().f233398a.getContentResolver().getType(this.f234568g);
        return type == null ? C86358b.f251079e : C86358b.m106987a(type);
    }

    public String getUri() {
        Uri uri;
        if (TextUtils.isEmpty(this.f234564c) && (uri = this.f234568g) != null) {
            this.f234564c = uri.toString();
        }
        return this.f234564c;
    }
}
