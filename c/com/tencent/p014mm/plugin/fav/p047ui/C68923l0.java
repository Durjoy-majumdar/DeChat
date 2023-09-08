package com.tencent.p014mm.plugin.fav.p047ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p823sg.C90193h;
import pb1.C100734q;
import sf0.C101592a0;

/* renamed from: com.tencent.mm.plugin.fav.ui.l0 */
public class C68923l0 implements C101592a0 {

    /* renamed from: a */
    public String f198035a;

    /* renamed from: b */
    public String f198036b;

    /* renamed from: c */
    public int f198037c;

    /* renamed from: d */
    public int f198038d;

    public C68923l0(String str, String str2, int i, int i2) {
        this.f198035a = str;
        this.f198036b = str2;
        this.f198037c = i;
        this.f198038d = i2;
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f198035a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r4 == null) goto L_0x00ab;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo94819c(android.graphics.Bitmap r8, sf0.C101592a0.C77686a r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r10 = ""
            java.lang.String r0 = "MicroMsg.FavGetPicStrategy"
            sf0.a0$a r1 = sf0.C101592a0.C77686a.NET
            if (r1 != r9) goto L_0x00ab
            r9 = 0
            java.lang.String r1 = "handlerBitmap get from net url:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r4 = r7.f198036b     // Catch:{ IOException -> 0x00a5 }
            r3[r9] = r4     // Catch:{ IOException -> 0x00a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r1, r3)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r1 = pb1.C100734q.m131812C()     // Catch:{ IOException -> 0x00a5 }
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r3 = r1.getPath()     // Catch:{ IOException -> 0x00a5 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r9, r9)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r4 = r1.getPath()     // Catch:{ IOException -> 0x00a5 }
            boolean r4 = r4.equals(r3)     // Catch:{ IOException -> 0x00a5 }
            if (r4 != 0) goto L_0x003d
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ IOException -> 0x00a5 }
            android.net.Uri$Builder r1 = r1.path(r3)     // Catch:{ IOException -> 0x00a5 }
            android.net.Uri r1 = r1.build()     // Catch:{ IOException -> 0x00a5 }
        L_0x003d:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x00a5 }
            r4 = 0
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r1, r4)     // Catch:{ IOException -> 0x00a5 }
            boolean r5 = r3.mo177810a()     // Catch:{ IOException -> 0x00a5 }
            if (r5 != 0) goto L_0x004c
            r5 = 0
            goto L_0x0054
        L_0x004c:
            com.tencent.mm.vfs.FileSystem$c r5 = r3.f348991a     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r6 = r3.f348992b     // Catch:{ IOException -> 0x00a5 }
            boolean r5 = r5.mo119948x(r6)     // Catch:{ IOException -> 0x00a5 }
        L_0x0054:
            if (r5 != 0) goto L_0x006a
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x00a5 }
            com.tencent.mm.vfs.f0$h r1 = r5.mo177799l(r1, r3)     // Catch:{ IOException -> 0x00a5 }
            boolean r3 = r1.mo177810a()     // Catch:{ IOException -> 0x00a5 }
            if (r3 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            com.tencent.mm.vfs.FileSystem$c r3 = r1.f348991a     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r1 = r1.f348992b     // Catch:{ IOException -> 0x00a5 }
            r3.mo119937g(r1)     // Catch:{ IOException -> 0x00a5 }
        L_0x006a:
            int r1 = r7.f198037c     // Catch:{ IOException -> 0x00a5 }
            if (r1 <= 0) goto L_0x0076
            int r3 = r7.f198038d     // Catch:{ IOException -> 0x00a5 }
            if (r3 <= 0) goto L_0x0076
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r8, r1, r3, r2)     // Catch:{ IOException -> 0x00a5 }
        L_0x0076:
            java.lang.String r1 = r7.mo94827k()     // Catch:{ IOException -> 0x00a5 }
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x00a5 }
            r2.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x00a5 }
            r2.mo119964e()     // Catch:{ IOException -> 0x00a5 }
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106426H(r2)     // Catch:{ FileNotFoundException -> 0x0096 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0096 }
            r2 = 100
            r8.compress(r1, r2, r4)     // Catch:{ FileNotFoundException -> 0x0096 }
            r4.flush()     // Catch:{ FileNotFoundException -> 0x0096 }
        L_0x0090:
            r4.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00ab
        L_0x0094:
            r1 = move-exception
            goto L_0x009f
        L_0x0096:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r10, r2)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x00ab
            goto L_0x0090
        L_0x009f:
            if (r4 == 0) goto L_0x00a4
            r4.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a4:
            throw r1     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r10, r9)
        L_0x00ab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C68923l0.mo94819c(android.graphics.Bitmap, sf0.a0$a, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f198035a;
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
        return this.f198036b;
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
        return C100734q.m131812C() + C90193h.m112878f(this.f198036b.getBytes());
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
