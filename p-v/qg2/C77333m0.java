package qg2;

import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import eb0.C97625j3;
import p823sg.C90193h;
import sf0.C101592a0;

/* renamed from: qg2.m0 */
public class C77333m0 implements C101592a0 {

    /* renamed from: a */
    public String f225453a;

    /* renamed from: b */
    public String f225454b;

    /* renamed from: c */
    public int f225455c;

    /* renamed from: d */
    public int f225456d;

    public C77333m0(String str, String str2, int i, int i2) {
        this.f225453a = str;
        this.f225454b = str2;
        this.f225455c = i;
        this.f225456d = i2;
        Uri n = C116299g2.m163858n(C97625j3.m125812b().mo105892g() + "web/");
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(l.mo177810a() ? l.f348991a.mo119948x(l.f348992b) : z)) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f225453a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94819c(android.graphics.Bitmap r6, sf0.C101592a0.C77686a r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r8 = ""
            java.lang.String r0 = "MicroMsg.FavGetPicStrategy"
            sf0.a0$a r1 = sf0.C101592a0.C77686a.NET
            if (r1 != r7) goto L_0x0057
            r7 = 0
            java.lang.String r1 = "handlerBitmap get from net url:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0051 }
            java.lang.String r4 = r5.f225454b     // Catch:{ IOException -> 0x0051 }
            r3[r7] = r4     // Catch:{ IOException -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r1, r3)     // Catch:{ IOException -> 0x0051 }
            int r1 = r5.f225455c     // Catch:{ IOException -> 0x0051 }
            if (r1 <= 0) goto L_0x0021
            int r3 = r5.f225456d     // Catch:{ IOException -> 0x0051 }
            if (r3 <= 0) goto L_0x0021
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r6, r1, r3, r2)     // Catch:{ IOException -> 0x0051 }
        L_0x0021:
            java.lang.String r1 = r5.mo94827k()     // Catch:{ IOException -> 0x0051 }
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0051 }
            r2.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0051 }
            r2.mo119964e()     // Catch:{ IOException -> 0x0051 }
            r1 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106426H(r2)     // Catch:{ FileNotFoundException -> 0x0042 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0042 }
            r3 = 100
            r6.compress(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x0042 }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0042 }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0057
        L_0x0040:
            r2 = move-exception
            goto L_0x004b
        L_0x0042:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0040 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r8, r3)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0057
            goto L_0x003c
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0050:
            throw r2     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r8, r7)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C77333m0.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f225453a;
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        return MMBitmapFactory.m98736e(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.biu);
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f225454b;
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
        return C97625j3.m125812b().mo105892g() + "web/" + C90193h.m112878f(this.f225454b.getBytes());
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
