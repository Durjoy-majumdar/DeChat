package com.tencent.p014mm.plugin.location.p069ui.impl;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import p823sg.C90193h;
import sf0.C101592a0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.r0 */
public class C69123r0 implements C101592a0 {

    /* renamed from: a */
    public String f198768a;

    /* renamed from: b */
    public C101592a0.C101593b f198769b = new C69125b(this);

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.r0$a */
    public class C69124a implements Runnable {
        public C69124a(C69123r0 r0Var) {
        }

        public void run() {
            if (!C86013q1.m106450k(C69123r0.m81439m())) {
                C86013q1.m106461v(C69123r0.m81439m());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.r0$b */
    public class C69125b implements C101592a0.C101593b {
        public C69125b(C69123r0 r0Var) {
        }

        /* renamed from: a */
        public Bitmap mo95233a(String str) {
            return BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
        }
    }

    public C69123r0(String str) {
        this.f198768a = str;
        C86709a0.m107525e().postToWorker(new C69124a(this));
    }

    /* renamed from: m */
    public static String m81439m() {
        return C112760b.m154195C() + "taxi_icon";
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f198768a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return this.f198769b;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94819c(android.graphics.Bitmap r5, sf0.C101592a0.C77686a r6, java.lang.String r7) {
        /*
            r4 = this;
            sf0.a0$a r0 = sf0.C101592a0.C77686a.NET
            r1 = 0
            java.lang.String r2 = "MicroMsg.TaxiWeappIconStrategy"
            if (r0 != r6) goto L_0x004b
            if (r5 == 0) goto L_0x001c
            byte[] r0 = r5.getNinePatchChunk()
            if (r0 == 0) goto L_0x001c
            java.lang.String r6 = "get ninePatch chChunk."
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r6)
            java.lang.String r6 = r4.mo94827k()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r7, r6)
            return r5
        L_0x001c:
            r7 = 100
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0028 }
            java.lang.String r3 = r4.mo94827k()     // Catch:{ IOException -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r5, r7, r0, r3, r1)     // Catch:{ IOException -> 0x0028 }
            goto L_0x004b
        L_0x0028:
            java.lang.String r0 = m81439m()     // Catch:{ IOException -> 0x003e }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ IOException -> 0x003e }
            java.lang.String r0 = "retry saving bitmap."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ IOException -> 0x003e }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x003e }
            java.lang.String r3 = r4.mo94827k()     // Catch:{ IOException -> 0x003e }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r5, r7, r0, r3, r1)     // Catch:{ IOException -> 0x003e }
            goto L_0x004b
        L_0x003e:
            r7 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r7, r3, r0)
            java.lang.String r7 = "save bitmap fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r7)
        L_0x004b:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r6 = r6.toString()
            r7[r1] = r6
            java.lang.String r6 = "get bitmap, from %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C69123r0.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f198768a;
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
        return this.f198768a;
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
        return String.format("%s/%s", new Object[]{m81439m(), C90193h.m112878f(this.f198768a.getBytes())});
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
