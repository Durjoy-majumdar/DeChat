package g63;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import e63.C75556b;
import sf0.C101592a0;

/* renamed from: g63.j */
public class C75886j implements C101592a0 {

    /* renamed from: a */
    public String f222561a;

    /* renamed from: b */
    public C101592a0.C101593b f222562b = new C75887a(this);

    /* renamed from: g63.j$a */
    public class C75887a implements C101592a0.C101593b {
        public C75887a(C75886j jVar) {
        }

        /* renamed from: a */
        public Bitmap mo95233a(String str) {
            return BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
        }
    }

    public C75886j(String str) {
        this.f222561a = str;
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f222561a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return this.f222562b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.WalletGetPicStrategy", r7, "", new java.lang.Object[0]);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94819c(android.graphics.Bitmap r5, sf0.C101592a0.C77686a r6, java.lang.String r7) {
        /*
            r4 = this;
            sf0.a0$a r0 = sf0.C101592a0.C77686a.NET
            r1 = 0
            java.lang.String r2 = "MicroMsg.WalletGetPicStrategy"
            if (r0 != r6) goto L_0x0049
            if (r5 == 0) goto L_0x001c
            byte[] r0 = r5.getNinePatchChunk()
            if (r0 == 0) goto L_0x001c
            java.lang.String r6 = " get the ninePathchChunk"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r6)
            java.lang.String r6 = r4.mo94827k()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r7, r6)
            return r5
        L_0x001c:
            r7 = 100
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0028 }
            java.lang.String r3 = r4.mo94827k()     // Catch:{ IOException -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r5, r7, r0, r3, r1)     // Catch:{ IOException -> 0x0028 }
            goto L_0x0049
        L_0x0028:
            java.lang.String r0 = e63.C75556b.f221973a     // Catch:{ IOException -> 0x003c }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ IOException -> 0x003c }
            java.lang.String r0 = " retry saving bitmap"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ IOException -> 0x003c }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x003c }
            java.lang.String r3 = r4.mo94827k()     // Catch:{ IOException -> 0x003c }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r5, r7, r0, r3, r1)     // Catch:{ IOException -> 0x003c }
            goto L_0x0049
        L_0x003c:
            r7 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r7, r3, r0)
            java.lang.String r7 = "save bitmap fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r7)
        L_0x0049:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r6 = r6.toString()
            r7[r1] = r6
            java.lang.String r6 = "get bitmap, from %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g63.C75886j.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f222561a;
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        return null;
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f222561a;
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
        return C75556b.m90591a(this.f222561a);
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
