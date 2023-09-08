package p300c8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c8.e */
public final class C79942e implements C79946g {

    /* renamed from: a */
    public final ContentResolver f234167a;

    /* renamed from: b */
    public final C79967x<? super C79942e> f234168b;

    /* renamed from: c */
    public Uri f234169c;

    /* renamed from: d */
    public AssetFileDescriptor f234170d;

    /* renamed from: e */
    public InputStream f234171e;

    /* renamed from: f */
    public long f234172f;

    /* renamed from: g */
    public boolean f234173g;

    /* renamed from: c8.e$a */
    public static class C79943a extends IOException {
        public C79943a(IOException iOException) {
            super(iOException);
        }
    }

    public C79942e(Context context, C79967x<? super C79942e> xVar) {
        this.f234167a = context.getContentResolver();
        this.f234168b = xVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        try {
            Uri uri = jVar.f234181a;
            this.f234169c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f234167a.openAssetFileDescriptor(uri, "r");
            this.f234170d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f234171e = new FileInputStream(this.f234170d.getFileDescriptor());
                long startOffset = this.f234170d.getStartOffset();
                long skip = this.f234171e.skip(jVar.f234184d + startOffset) - startOffset;
                if (skip == jVar.f234184d) {
                    long j = jVar.f234185e;
                    if (j != -1) {
                        this.f234172f = j;
                    } else {
                        long length = this.f234170d.getLength();
                        if (length == -1) {
                            long available = (long) this.f234171e.available();
                            this.f234172f = available;
                            if (available == 0) {
                                this.f234172f = -1;
                            }
                        } else {
                            this.f234172f = length - skip;
                        }
                    }
                    this.f234173g = true;
                    C79967x<? super C79942e> xVar = this.f234168b;
                    if (xVar != null) {
                        xVar.mo17932c(this, jVar);
                    }
                    return this.f234172f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f234169c);
        } catch (IOException e) {
            throw new C79943a(e);
        }
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f234172f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C79943a(e);
            }
        }
        int read = this.f234171e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f234172f;
            if (j2 != -1) {
                this.f234172f = j2 - ((long) read);
            }
            C79967x<? super C79942e> xVar = this.f234168b;
            if (xVar != null) {
                xVar.mo17931a(this, read);
            }
            return read;
        } else if (this.f234172f == -1) {
            return -1;
        } else {
            throw new C79943a(new EOFException());
        }
    }

    public void close() {
        this.f234169c = null;
        try {
            InputStream inputStream = this.f234171e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f234171e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f234170d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f234170d = null;
                if (this.f234173g) {
                    this.f234173g = false;
                    C79967x<? super C79942e> xVar = this.f234168b;
                    if (xVar != null) {
                        xVar.mo17933d(this);
                    }
                }
            } catch (IOException e) {
                throw new C79943a(e);
            } catch (Throwable th) {
                this.f234170d = null;
                if (this.f234173g) {
                    this.f234173g = false;
                    C79967x<? super C79942e> xVar2 = this.f234168b;
                    if (xVar2 != null) {
                        xVar2.mo17933d(this);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C79943a(e2);
        } catch (Throwable th4) {
            this.f234171e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f234170d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f234170d = null;
                if (this.f234173g) {
                    this.f234173g = false;
                    C79967x<? super C79942e> xVar3 = this.f234168b;
                    if (xVar3 != null) {
                        xVar3.mo17933d(this);
                    }
                }
                throw th4;
            } catch (IOException e3) {
                throw new C79943a(e3);
            } catch (Throwable th5) {
                this.f234170d = null;
                if (this.f234173g) {
                    this.f234173g = false;
                    C79967x<? super C79942e> xVar4 = this.f234168b;
                    if (xVar4 != null) {
                        xVar4.mo17933d(this);
                    }
                }
                throw th5;
            }
        }
    }

    public Uri getUri() {
        return this.f234169c;
    }
}
