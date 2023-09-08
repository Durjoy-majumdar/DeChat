package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import java.util.concurrent.Callable;
import ob0.C89132b;
import te3.o55;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.a4 */
public class C83289a4 implements Callable<Pair<WxaAttributes, C89132b.C89134c<o55>>> {

    /* renamed from: d */
    public final /* synthetic */ C83293b4 f243404d;

    public C83289a4(C83293b4 b4Var) {
        this.f243404d = b4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r1 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (com.tencent.p014mm.plugin.appbrand.config.C81662k.m100194m(r8, r1, r6) != false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r14 = this;
            com.tencent.mm.plugin.appbrand.launching.z3 r0 = new com.tencent.mm.plugin.appbrand.launching.z3
            r0.<init>(r14)
            com.tencent.mm.plugin.appbrand.launching.s2$a r1 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.INVALID_FIELDS
            com.tencent.mm.plugin.appbrand.launching.b4 r2 = r14.f243404d
            com.tencent.mm.plugin.appbrand.launching.s2$a r3 = r2.f243431z
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r2 = r2.f243417i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r6 = 0
            r3 = 0
            if (r2 == 0) goto L_0x009d
            com.tencent.mm.plugin.appbrand.launching.b4 r2 = r14.f243404d
            boolean r8 = r2.f243429x
            if (r8 == 0) goto L_0x007c
            java.lang.String r8 = r2.f243418j
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.f243421p
            if (r2 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            long r6 = r2.field_syncTimeSecond
        L_0x002c:
            wi0.e0 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r9 = "MicroMsg.WxaAttrSyncHelper"
            if (r2 != 0) goto L_0x003e
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r8
            java.lang.String r2 = "needUpdateAttrByAppId(%s), storage NULL"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r2, r1)
            goto L_0x0076
        L_0x003e:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r1 = com.tencent.p014mm.plugin.appbrand.config.C81662k.m100189h(r1)
            int r12 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r12 > 0) goto L_0x006a
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r12[r4] = r8
            r8 = 2
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r12[r8] = r13
            r8 = 3
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            r12[r8] = r13
            java.lang.String r8 = "needUpdateAttrByAppId, appId(%s), currentMS(%d), lastUpdateTime(%d), freq(%d)."
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r9, r8, r12)
        L_0x006a:
            long r8 = r10 - r6
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0078
            long r10 = r10 + r1
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r1 = 0
            goto L_0x0079
        L_0x0078:
            r1 = 1
        L_0x0079:
            if (r1 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r4 != 0) goto L_0x008a
            com.tencent.mm.plugin.appbrand.launching.b4 r1 = r14.f243404d
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = r1.f243421p
            if (r1 == 0) goto L_0x008a
            android.util.Pair r0 = android.util.Pair.create(r1, r3)
            goto L_0x00ce
        L_0x008a:
            com.tencent.mm.plugin.appbrand.launching.b4 r1 = r14.f243404d
            java.lang.String r2 = r1.f243418j
            com.tencent.mm.plugin.appbrand.launching.b4$c r5 = new com.tencent.mm.plugin.appbrand.launching.b4$c
            r5.<init>(r3)
            com.tencent.mm.plugin.appbrand.config.l r1 = new com.tencent.mm.plugin.appbrand.config.l
            r1.<init>(r2, r0)
            android.util.Pair r0 = com.tencent.p014mm.plugin.appbrand.config.C81662k.m100191j(r2, r4, r5, r1, r3)
            goto L_0x00ce
        L_0x009d:
            com.tencent.mm.plugin.appbrand.launching.b4 r2 = r14.f243404d
            boolean r8 = r2.f243429x
            if (r8 == 0) goto L_0x00b3
            java.lang.String r8 = r2.f243417i
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.f243421p
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            long r6 = r2.field_syncTimeSecond
        L_0x00ac:
            boolean r1 = com.tencent.p014mm.plugin.appbrand.config.C81662k.m100194m(r8, r1, r6)
            if (r1 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            if (r4 != 0) goto L_0x00c1
            com.tencent.mm.plugin.appbrand.launching.b4 r1 = r14.f243404d
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = r1.f243421p
            if (r1 == 0) goto L_0x00c1
            android.util.Pair r0 = android.util.Pair.create(r1, r3)
            goto L_0x00ce
        L_0x00c1:
            com.tencent.mm.plugin.appbrand.launching.b4 r1 = r14.f243404d
            java.lang.String r2 = r1.f243417i
            com.tencent.mm.plugin.appbrand.launching.b4$c r5 = new com.tencent.mm.plugin.appbrand.launching.b4$c
            r5.<init>(r3)
            android.util.Pair r0 = com.tencent.p014mm.plugin.appbrand.config.C81662k.m100190i(r2, r4, r5, r0)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83289a4.call():java.lang.Object");
    }
}
