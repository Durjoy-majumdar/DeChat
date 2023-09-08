package hz0;

import a70.C112760b;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C90193h;
import sf0.C101592a0;

/* renamed from: hz0.l */
public class C76251l implements C101592a0 {

    /* renamed from: b */
    public static final String f223366b;

    /* renamed from: c */
    public static final String f223367c;

    /* renamed from: a */
    public String f223368a;

    static {
        String str = C112760b.m154195C() + "card";
        f223366b = str;
        f223367c = str + "/" + "video";
    }

    public C76251l(String str) {
        this.f223368a = str;
    }

    /* renamed from: m */
    public static String m91644m(String str) {
        return String.format("%s/%s", new Object[]{f223366b, C90193h.m112878f(str.getBytes())});
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f223368a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|3|4|5|6|(2:8|(1:10))|11|(1:13)(1:14)|(2:16|(1:18)(1:19))|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.CardSimpleGetPicStrategy", r9, "", new java.lang.Object[0]);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.CardSimpleGetPicStrategy", "save bitmap fail");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[Catch:{ IOException -> 0x0077 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94819c(android.graphics.Bitmap r7, sf0.C101592a0.C77686a r8, java.lang.String r9) {
        /*
            r6 = this;
            sf0.a0$a r9 = sf0.C101592a0.C77686a.NET
            java.lang.String r0 = "MicroMsg.CardSimpleGetPicStrategy"
            r1 = 0
            if (r9 != r8) goto L_0x0085
            r9 = 100
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0013 }
            java.lang.String r3 = r6.mo94827k()     // Catch:{ IOException -> 0x0013 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r9, r2, r3, r1)     // Catch:{ IOException -> 0x0013 }
            goto L_0x0085
        L_0x0013:
            java.lang.String r2 = r6.mo94827k()     // Catch:{ IOException -> 0x0077 }
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ IOException -> 0x0077 }
            r3 = 0
            java.lang.String r4 = r2.getPath()     // Catch:{ IOException -> 0x0077 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r1, r1)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r5 = r2.getPath()     // Catch:{ IOException -> 0x0077 }
            boolean r5 = r5.equals(r4)     // Catch:{ IOException -> 0x0077 }
            if (r5 != 0) goto L_0x003c
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ IOException -> 0x0077 }
            android.net.Uri$Builder r2 = r2.path(r4)     // Catch:{ IOException -> 0x0077 }
            android.net.Uri r2 = r2.build()     // Catch:{ IOException -> 0x0077 }
        L_0x003c:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x0077 }
            com.tencent.mm.vfs.f0$h r3 = r4.mo177799l(r2, r3)     // Catch:{ IOException -> 0x0077 }
            boolean r4 = r3.mo177810a()     // Catch:{ IOException -> 0x0077 }
            if (r4 != 0) goto L_0x004a
            r4 = 0
            goto L_0x0052
        L_0x004a:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a     // Catch:{ IOException -> 0x0077 }
            java.lang.String r5 = r3.f348992b     // Catch:{ IOException -> 0x0077 }
            boolean r4 = r4.mo119948x(r5)     // Catch:{ IOException -> 0x0077 }
        L_0x0052:
            if (r4 != 0) goto L_0x0068
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x0077 }
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r3)     // Catch:{ IOException -> 0x0077 }
            boolean r3 = r2.mo177810a()     // Catch:{ IOException -> 0x0077 }
            if (r3 != 0) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a     // Catch:{ IOException -> 0x0077 }
            java.lang.String r2 = r2.f348992b     // Catch:{ IOException -> 0x0077 }
            r3.mo119937g(r2)     // Catch:{ IOException -> 0x0077 }
        L_0x0068:
            java.lang.String r2 = " retry saving bitmap"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ IOException -> 0x0077 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0077 }
            java.lang.String r3 = r6.mo94827k()     // Catch:{ IOException -> 0x0077 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r9, r2, r3, r1)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0085
        L_0x0077:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r3, r2)
            java.lang.String r9 = "save bitmap fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
        L_0x0085:
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r8 = r8.toString()
            r9[r1] = r8
            java.lang.String r8 = "get bitmap, from %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.C76251l.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f223368a;
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        Log.m105918d("MicroMsg.CardSimpleGetPicStrategy", "no sd card!");
        return null;
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f223368a;
    }

    /* renamed from: h */
    public boolean mo94824h() {
        return false;
    }

    /* renamed from: i */
    public void mo94825i(C101592a0.C77686a aVar, String str) {
    }

    /* renamed from: j */
    public void mo94826j(String str, boolean z) {
    }

    /* renamed from: k */
    public String mo94827k() {
        return String.format("%s/%s", new Object[]{f223366b, C90193h.m112878f(this.f223368a.getBytes())});
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
