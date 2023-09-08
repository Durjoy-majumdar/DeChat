package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f12.C7970a;
import p823sg.C90193h;
import sf0.C101592a0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.s */
public class C72925s implements C101592a0 {

    /* renamed from: a */
    public String f212539a;

    /* renamed from: b */
    public String f212540b;

    /* renamed from: c */
    public int f212541c;

    /* renamed from: d */
    public int f212542d;

    public C72925s(String str, String str2, int i, int i2) {
        this.f212539a = str;
        this.f212540b = str2;
        this.f212541c = i;
        this.f212542d = i2;
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f212539a;
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
            java.lang.String r0 = "MicroMsg.DefaultPicStrategy"
            sf0.a0$a r1 = sf0.C101592a0.C77686a.NET
            if (r1 != r7) goto L_0x0057
            r7 = 0
            java.lang.String r1 = "handlerBitmap get from net url:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0051 }
            java.lang.String r4 = r5.f212540b     // Catch:{ IOException -> 0x0051 }
            r3[r7] = r4     // Catch:{ IOException -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r1, r3)     // Catch:{ IOException -> 0x0051 }
            int r1 = r5.f212541c     // Catch:{ IOException -> 0x0051 }
            if (r1 <= 0) goto L_0x0021
            int r3 = r5.f212542d     // Catch:{ IOException -> 0x0051 }
            if (r3 <= 0) goto L_0x0021
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r6, r1, r3, r2)     // Catch:{ IOException -> 0x0051 }
        L_0x0021:
            java.lang.String r1 = r5.mo94827k()     // Catch:{ IOException -> 0x0051 }
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0051 }
            r2.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0051 }
            r2.mo119964e()     // Catch:{ IOException -> 0x0051 }
            r1 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106426H(r2)     // Catch:{ FileNotFoundException -> 0x0042 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0042 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C72925s.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f212539a;
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.biu);
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f212540b;
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
        return C7970a.m8127a() + "/" + C90193h.m112878f(this.f212540b.getBytes());
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
