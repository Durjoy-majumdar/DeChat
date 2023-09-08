package qi3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import ri3.C89966b;
import ri3.C89967c;
import ri3.C89969d;

/* renamed from: qi3.c */
public class C89673c implements Comparable<C89673c> {

    /* renamed from: d */
    public int f257907d;

    /* renamed from: e */
    public Uri f257908e;

    /* renamed from: f */
    public File f257909f;

    /* renamed from: g */
    public File f257910g;

    /* renamed from: h */
    public boolean f257911h = false;

    /* renamed from: i */
    public int f257912i = 0;

    /* renamed from: j */
    public long f257913j = 0;

    /* renamed from: n */
    public long f257914n = -1;

    /* renamed from: o */
    public HashMap<String, String> f257915o;

    /* renamed from: p */
    public C89969d f257916p;

    /* renamed from: q */
    public C89967c f257917q;

    /* renamed from: r */
    public C89966b f257918r;

    public C89673c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            this.f257915o = new HashMap<>();
            this.f257907d = 2000;
            this.f257908e = parse;
            return;
        }
        throw new NullPointerException("uri is invalid!");
    }

    /* renamed from: a */
    public C89967c mo124004a() {
        C89967c cVar = this.f257917q;
        if (cVar != null) {
            return cVar;
        }
        this.f257917q = new C89967c.C89968a();
        return mo124004a();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124005b() {
        /*
            r5 = this;
            ri3.d r0 = r5.f257916p
            if (r0 == 0) goto L_0x0068
            qi3.f r0 = (qi3.C89676f) r0
            r0.getClass()
            java.io.File r1 = r5.f257910g
            java.lang.String r0 = r0.f257920a
            if (r1 == 0) goto L_0x005a
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x005a
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            r4.<init>(r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x004f, all -> 0x004d }
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x004f, all -> 0x004d }
            r2.<init>(r3, r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x004f, all -> 0x004d }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
        L_0x002f:
            int r3 = r2.read(r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            if (r3 <= 0) goto L_0x0036
            goto L_0x002f
        L_0x0036:
            java.security.MessageDigest r1 = r2.getMessageDigest()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            byte[] r1 = r1.digest()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            java.lang.String r1 = qi3.C89674d.m112123a(r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0057, all -> 0x0051 }
            if (r0 == 0) goto L_0x0057
            r0 = 1
            qi3.C89675e.m112124a(r2)
            goto L_0x005b
        L_0x004d:
            r0 = move-exception
            goto L_0x0053
        L_0x004f:
            r2 = r3
            goto L_0x0057
        L_0x0051:
            r0 = move-exception
            r3 = r2
        L_0x0053:
            qi3.C89675e.m112124a(r3)
            throw r0
        L_0x0057:
            qi3.C89675e.m112124a(r2)
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x0068
        L_0x005e:
            ri3.a r0 = new ri3.a
            r1 = 1202(0x4b2, float:1.684E-42)
            java.lang.String r2 = "File MD5 is invalid."
            r0.<init>(r1, r2)
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi3.C89673c.mo124005b():void");
    }

    public int compareTo(Object obj) {
        ((C89673c) obj).getClass();
        return 0;
    }
}
