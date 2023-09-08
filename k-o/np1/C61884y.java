package np1;

import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;

/* renamed from: np1.y */
public final class C61884y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C56032b f175972d;

    /* renamed from: e */
    public final /* synthetic */ int f175973e;

    /* renamed from: f */
    public final /* synthetic */ long f175974f;

    /* renamed from: g */
    public final /* synthetic */ String f175975g;

    /* renamed from: h */
    public final /* synthetic */ String f175976h;

    /* renamed from: i */
    public final /* synthetic */ String f175977i;

    /* renamed from: j */
    public final /* synthetic */ int f175978j;

    /* renamed from: n */
    public final /* synthetic */ String f175979n;

    /* renamed from: o */
    public final /* synthetic */ boolean f175980o;

    /* renamed from: p */
    public final /* synthetic */ HalfScreenConfig.CustomSubjectInfo f175981p;

    /* renamed from: q */
    public final /* synthetic */ C61885z f175982q;

    public C61884y(C56032b bVar, int i, long j, String str, String str2, String str3, int i2, String str4, boolean z, HalfScreenConfig.CustomSubjectInfo customSubjectInfo, C61885z zVar) {
        this.f175972d = bVar;
        this.f175973e = i;
        this.f175974f = j;
        this.f175975g = str;
        this.f175976h = str2;
        this.f175977i = str3;
        this.f175978j = i2;
        this.f175979n = str4;
        this.f175980o = z;
        this.f175981p = customSubjectInfo;
        this.f175982q = zVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: sk1.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: sk1.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r0 = r48
            di0.o r1 = new di0.o
            r1.<init>()
            int r2 = r0.f175973e
            com.tencent.mm.plugin.finder.live.view.b r3 = r0.f175972d
            long r4 = r0.f175974f
            java.lang.String r6 = r0.f175975g
            java.lang.String r7 = r0.f175976h
            java.lang.String r8 = r0.f175977i
            int r9 = r0.f175978j
            java.lang.String r10 = r0.f175979n
            boolean r14 = r0.f175980o
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r13 = r0.f175981p
            np1.z r15 = r0.f175982q
            r12 = 1
            if (r2 != r12) goto L_0x0084
            fj1.b r11 = r3.getBuContext()
            java.lang.Class<cl1.h1> r12 = cl1.C54979h1.class
            androidx.lifecycle.i0 r11 = r11.mo71262a(r12)
            cl1.h1 r11 = (cl1.C54979h1) r11
            p40.a<cm1.i2> r11 = r11.f154140o
            java.util.List r11 = r11.mo87250a()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x003d:
            boolean r18 = r11.hasNext()
            if (r18 == 0) goto L_0x0057
            r19 = r13
            java.lang.Object r13 = r11.next()
            r18 = r11
            boolean r11 = r13 instanceof sk1.C63965x
            if (r11 == 0) goto L_0x0052
            r12.add(r13)
        L_0x0052:
            r11 = r18
            r13 = r19
            goto L_0x003d
        L_0x0057:
            r19 = r13
            java.util.Iterator r11 = r12.iterator()
        L_0x005d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x007f
            java.lang.Object r12 = r11.next()
            r13 = r12
            sk1.x r13 = (sk1.C63965x) r13
            r18 = r11
            r20 = r12
            long r11 = r13.f181347t
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0076
            r11 = 1
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            if (r11 == 0) goto L_0x007c
            r11 = r20
            goto L_0x0080
        L_0x007c:
            r11 = r18
            goto L_0x005d
        L_0x007f:
            r11 = 0
        L_0x0080:
            sk1.x r11 = (sk1.C63965x) r11
            r4 = r11
            goto L_0x0087
        L_0x0084:
            r19 = r13
            r4 = 0
        L_0x0087:
            r1.f250930b = r6
            r1.f250934f = r7
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87027N0()
            if (r5 == 0) goto L_0x0096
            r5 = 1176(0x498, float:1.648E-42)
            goto L_0x0098
        L_0x0096:
            r5 = 1177(0x499, float:1.65E-42)
        L_0x0098:
            r1.f250939k = r5
            r1.f250940l = r8
            if (r9 != 0) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r5 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
            goto L_0x00a3
        L_0x00a1:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r5 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.SLIDE
        L_0x00a3:
            java.lang.String r6 = "halfPage"
            boolean r6 = gy3.C87412m.m108589b(r10, r6)
            if (r6 == 0) goto L_0x00ee
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.y
            float r6 = (float) r6
            android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x00ce
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.x
            float r6 = (float) r6
        L_0x00ce:
            gg1.a r7 = gg1.C32444a.f86121a
            int r7 = r7.mo58621b()
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r8
            float r7 = r7 * r6
            int r6 = (int) r7
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            int r6 = r6 + r7
            r13 = r6
            goto L_0x00f0
        L_0x00ee:
            r6 = -1
            r13 = -1
        L_0x00f0:
            if (r14 == 0) goto L_0x00f5
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r6 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
            goto L_0x00f7
        L_0x00f5:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r6 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
        L_0x00f7:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r7 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r11 = r7
            r12 = 1
            r8 = 1
            r9 = 0
            r10 = r15
            r15 = r9
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = -33555080(0xfffffffffdfffd78, float:-4.2533653E37)
            r46 = 1
            r47 = 0
            r9 = r19
            r21 = r14
            r14 = r5
            r19 = r6
            r37 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r1.f250912A = r7
            if (r2 != r8) goto L_0x017d
            java.lang.String r2 = r10.f175983a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "share item:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            if (r4 == 0) goto L_0x017d
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r1.f250912A
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$b r2 = r2.mo76935f()
            np1.v r5 = np1.C61881v.f175961a
            fj1.b r3 = r3.getBuContext()
            te3.l40 r6 = r4.f181334B
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r3 = r5.mo86810b(r3, r4, r6)
            r2.f158008t = r3
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.mo76967a()
            r1.f250912A = r2
        L_0x017d:
            cj1.r0 r2 = cj1.C54804r0.f153631a
            com.tencent.mm.plugin.finder.live.view.b r3 = r0.f175972d
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "pluginLayout.context"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.plugin.finder.live.view.b r4 = r0.f175972d
            fj1.b r4 = r4.getBuContext()
            com.tencent.mm.plugin.finder.live.view.b r5 = r0.f175972d
            r2.mo75767i(r3, r4, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61884y.run():void");
    }
}
