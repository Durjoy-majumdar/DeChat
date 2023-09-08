package cn0;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import dn0.C86358b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cn0.a */
public class C80073a implements C80109t {

    /* renamed from: a */
    public final AssetManager f234508a;

    /* renamed from: b */
    public InputStream f234509b;

    /* renamed from: c */
    public long f234510c;

    /* renamed from: d */
    public boolean f234511d;

    /* renamed from: e */
    public long f234512e = -1;

    /* renamed from: f */
    public long f234513f = -1;

    /* renamed from: g */
    public String f234514g;

    /* renamed from: cn0.a$a */
    public static final class C80074a extends IOException {
        public C80074a(IOException iOException) {
            super(iOException);
        }
    }

    public C80073a(Context context) {
        this.f234508a = context.getAssets();
    }

    /* renamed from: a */
    public long mo109835a() {
        return this.f234512e;
    }

    public long available() {
        return this.f234513f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r0 == null) goto L_0x0058;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[Catch:{ IOException -> 0x0053, all -> 0x004c, IOException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[Catch:{ IOException -> 0x0053, all -> 0x004c, IOException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093 A[SYNTHETIC, Splitter:B:35:0x0093] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo109837b(cn0.C80081g r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f234519a     // Catch:{ IOException -> 0x0099 }
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException -> 0x0099 }
            r8.f234514g = r0     // Catch:{ IOException -> 0x0099 }
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ IOException -> 0x0099 }
            r1 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r8.f234514g     // Catch:{ IOException -> 0x0099 }
            r2 = 15
            java.lang.String r0 = r0.substring(r2)     // Catch:{ IOException -> 0x0099 }
            r8.f234514g = r0     // Catch:{ IOException -> 0x0099 }
            goto L_0x002e
        L_0x001c:
            java.lang.String r0 = r8.f234514g     // Catch:{ IOException -> 0x0099 }
            java.lang.String r2 = "/"
            boolean r0 = r0.startsWith(r2)     // Catch:{ IOException -> 0x0099 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r8.f234514g     // Catch:{ IOException -> 0x0099 }
            java.lang.String r0 = r0.substring(r1)     // Catch:{ IOException -> 0x0099 }
            r8.f234514g = r0     // Catch:{ IOException -> 0x0099 }
        L_0x002e:
            android.content.res.AssetManager r0 = r8.f234508a     // Catch:{ IOException -> 0x0099 }
            java.lang.String r2 = r8.f234514g     // Catch:{ IOException -> 0x0099 }
            java.io.InputStream r0 = r0.open(r2, r1)     // Catch:{ IOException -> 0x0099 }
            r8.f234509b = r0     // Catch:{ IOException -> 0x0099 }
            r2 = -1
            r8.f234512e = r2     // Catch:{ IOException -> 0x0099 }
            r0 = 0
            android.content.res.AssetManager r4 = r8.f234508a     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            java.lang.String r5 = r8.f234514g     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            android.content.res.AssetFileDescriptor r0 = r4.openFd(r5)     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            long r4 = r0.getLength()     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            r8.f234512e = r4     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            goto L_0x0055
        L_0x004c:
            r9 = move-exception
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r9     // Catch:{ IOException -> 0x0099 }
        L_0x0053:
            if (r0 == 0) goto L_0x0058
        L_0x0055:
            r0.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            long r4 = r8.f234512e     // Catch:{ IOException -> 0x0099 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            r8.f234512e = r2     // Catch:{ IOException -> 0x0099 }
        L_0x0060:
            long r4 = r8.f234512e     // Catch:{ IOException -> 0x0099 }
            long r6 = r9.f234521c     // Catch:{ IOException -> 0x0099 }
            long r4 = r4 - r6
            r8.f234513f = r4     // Catch:{ IOException -> 0x0099 }
            java.io.InputStream r0 = r8.f234509b     // Catch:{ IOException -> 0x0099 }
            long r4 = r0.skip(r6)     // Catch:{ IOException -> 0x0099 }
            long r6 = r9.f234521c     // Catch:{ IOException -> 0x0099 }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            long r4 = r9.f234522d     // Catch:{ IOException -> 0x0099 }
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x007c
            r8.f234510c = r4     // Catch:{ IOException -> 0x0099 }
            goto L_0x008e
        L_0x007c:
            java.io.InputStream r9 = r8.f234509b     // Catch:{ IOException -> 0x0099 }
            int r9 = r9.available()     // Catch:{ IOException -> 0x0099 }
            long r4 = (long) r9     // Catch:{ IOException -> 0x0099 }
            r8.f234510c = r4     // Catch:{ IOException -> 0x0099 }
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x008e
            r8.f234510c = r2     // Catch:{ IOException -> 0x0099 }
        L_0x008e:
            r8.f234511d = r1
            long r0 = r8.f234510c
            return r0
        L_0x0093:
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ IOException -> 0x0099 }
            r9.<init>()     // Catch:{ IOException -> 0x0099 }
            throw r9     // Catch:{ IOException -> 0x0099 }
        L_0x0099:
            r9 = move-exception
            cn0.a$a r0 = new cn0.a$a
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.C80073a.mo109837b(cn0.g):long");
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f234510c;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C80074a(e);
            }
        }
        int read = this.f234509b.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f234510c;
            if (j2 != -1) {
                this.f234510c = j2 - ((long) read);
            }
            return read;
        } else if (this.f234510c == -1) {
            return -1;
        } else {
            throw new C80074a(new EOFException());
        }
    }

    public void close() {
        try {
            InputStream inputStream = this.f234509b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f234509b = null;
            if (this.f234511d) {
                this.f234511d = false;
            }
        } catch (IOException e) {
            throw new C80074a(e);
        } catch (Throwable th) {
            this.f234509b = null;
            if (this.f234511d) {
                this.f234511d = false;
            }
            throw th;
        }
    }

    public C86358b getFileType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.f234514g);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        return TextUtils.isEmpty(mimeTypeFromExtension) ? C86358b.f251078d : C86358b.m106987a(mimeTypeFromExtension);
    }
}
