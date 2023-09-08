package cn0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import dn0.C86358b;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

/* renamed from: cn0.o */
public class C80100o implements C80109t {

    /* renamed from: a */
    public final Resources f234578a;

    /* renamed from: b */
    public Uri f234579b;

    /* renamed from: c */
    public AssetFileDescriptor f234580c;

    /* renamed from: d */
    public InputStream f234581d;

    /* renamed from: e */
    public long f234582e;

    /* renamed from: f */
    public boolean f234583f;

    /* renamed from: g */
    public String f234584g = null;

    /* renamed from: h */
    public long f234585h = -1;

    /* renamed from: i */
    public long f234586i = -1;

    /* renamed from: cn0.o$a */
    public static class C80101a extends IOException {
        public C80101a(String str) {
            super(str);
        }

        public C80101a(IOException iOException) {
            super(iOException);
        }
    }

    public C80100o(Context context) {
        this.f234578a = context.getResources();
    }

    /* renamed from: a */
    public long mo109835a() {
        return this.f234585h;
    }

    public long available() {
        return this.f234586i;
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        try {
            Uri uri = gVar.f234519a;
            this.f234579b = uri;
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                AssetFileDescriptor openRawResourceFd = this.f234578a.openRawResourceFd(Integer.parseInt(this.f234579b.getLastPathSegment()));
                this.f234580c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                this.f234585h = length;
                this.f234586i = length - gVar.f234521c;
                FileInputStream fileInputStream = new FileInputStream(this.f234580c.getFileDescriptor());
                this.f234581d = fileInputStream;
                if (fileInputStream.markSupported()) {
                    this.f234584g = URLConnection.guessContentTypeFromStream(this.f234581d);
                }
                this.f234581d.skip(this.f234580c.getStartOffset());
                if (this.f234581d.skip(gVar.f234521c) >= gVar.f234521c) {
                    long j = gVar.f234522d;
                    long j2 = -1;
                    if (j != -1) {
                        this.f234582e = j;
                    } else {
                        long length2 = this.f234580c.getLength();
                        if (length2 != -1) {
                            j2 = length2 - gVar.f234521c;
                        }
                        this.f234582e = j2;
                    }
                    this.f234583f = true;
                    return this.f234582e;
                }
                throw new EOFException();
            }
            throw new C80101a("URI must use scheme android.resource");
        } catch (NumberFormatException unused) {
            throw new C80101a("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new C80101a(e);
        }
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f234582e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C80101a(e);
            }
        }
        int read = this.f234581d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f234582e;
            if (j2 != -1) {
                this.f234582e = j2 - ((long) read);
            }
            return read;
        } else if (this.f234582e == -1) {
            return -1;
        } else {
            throw new C80101a((IOException) new EOFException());
        }
    }

    public void close() {
        this.f234579b = null;
        try {
            InputStream inputStream = this.f234581d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f234581d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f234580c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f234580c = null;
                if (this.f234583f) {
                    this.f234583f = false;
                }
            } catch (IOException e) {
                throw new C80101a(e);
            } catch (Throwable th) {
                this.f234580c = null;
                if (this.f234583f) {
                    this.f234583f = false;
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C80101a(e2);
        } catch (Throwable th4) {
            this.f234581d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f234580c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f234580c = null;
                if (this.f234583f) {
                    this.f234583f = false;
                }
                throw th4;
            } catch (IOException e3) {
                throw new C80101a(e3);
            } catch (Throwable th5) {
                this.f234580c = null;
                if (this.f234583f) {
                    this.f234583f = false;
                }
                throw th5;
            }
        }
    }

    public C86358b getFileType() {
        return TextUtils.isEmpty(this.f234584g) ? C86358b.f251078d : C86358b.m106987a(this.f234584g);
    }
}
