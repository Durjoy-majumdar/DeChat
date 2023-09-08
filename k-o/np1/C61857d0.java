package np1;

import di0.C86300q;
import fj1.C45795b;
import ht1.C33062n5;

/* renamed from: np1.d0 */
public final class C61857d0 implements C86300q {

    /* renamed from: a */
    public final C45795b f175882a;

    /* renamed from: b */
    public final C33062n5 f175883b;

    public C61857d0(C45795b bVar, C33062n5 n5Var) {
        this.f175882a = bVar;
        this.f175883b = n5Var;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63853a() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "live:"
            r0.append(r1)
            fj1.b r1 = r5.f175882a
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0022
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            r0.append(r1)
            java.lang.String r1 = " onAppBrandProcessDied!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MiniProgramUICallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            fj1.b r0 = r5.f175882a
            if (r0 == 0) goto L_0x0041
            java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            r2 = r0
            cl1.h1 r2 = (cl1.C54979h1) r2
        L_0x0041:
            if (r2 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = 0
            r2.f154109A = r0
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61857d0.mo63853a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63854b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "live:"
            r0.append(r1)
            fj1.b r1 = r9.f175882a
            if (r1 == 0) goto L_0x0021
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0021
            long r1 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r0.append(r1)
            java.lang.String r1 = " onTriggerHalfScreenShare "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MiniProgramUICallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r10 == 0) goto L_0x0041
            int r0 = r10.length()
            if (r0 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0 = 0
            goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 != 0) goto L_0x0085
            er1.f2 r0 = er1.C58719f2.f168110a
            te3.ci1 r10 = r0.mo83633f(r10)
            if (r10 == 0) goto L_0x0085
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "getContext()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            ht1.t1 r1 = (ht1.C60200t1) r1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r3, r2)
            r7 = 0
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r3
            r3 = r10
            ht1.C60200t1.C60201a.m70372j(r1, r2, r3, r4, r5, r6)
            r3 = 0
            r5 = 0
            r6 = 14
            r8 = 0
            r1 = r0
            r2 = r10
            r4 = r7
            r7 = r8
            java.lang.String r1 = er1.C58719f2.m68198d(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = "share_commodity"
            r0.mo83636i(r10, r2, r1)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61857d0.mo63854b(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63855c() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "live:"
            r0.append(r1)
            fj1.b r1 = r5.f175882a
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0022
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            r0.append(r1)
            java.lang.String r1 = " onAppBrandUIEnter!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MiniProgramUICallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            fj1.b r0 = r5.f175882a
            if (r0 == 0) goto L_0x0041
            java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            r2 = r0
            cl1.h1 r2 = (cl1.C54979h1) r2
        L_0x0041:
            if (r2 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = 1
            r2.f154109A = r0
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61857d0.mo63855c():void");
    }

    /* renamed from: d */
    public /* synthetic */ void mo63856d() {
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63857e() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "live:"
            r0.append(r1)
            fj1.b r1 = r5.f175882a
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0022
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            r0.append(r1)
            java.lang.String r1 = " luanchMiniProgram error!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MiniProgramUICallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            fj1.b r0 = r5.f175882a
            if (r0 == 0) goto L_0x0041
            java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            r2 = r0
            cl1.h1 r2 = (cl1.C54979h1) r2
        L_0x0041:
            if (r2 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = 0
            r2.f154109A = r0
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61857d0.mo63857e():void");
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = ((cl1.C55001u) r1.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63858f(boolean r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "live:"
            r0.append(r1)
            fj1.b r1 = r5.f175882a
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0022
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            r0.append(r1)
            java.lang.String r1 = " onAppBrandUIExit isFinish:"
            r0.append(r1)
            r0.append(r6)
            r6 = 33
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MiniProgramUICallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            fj1.b r6 = r5.f175882a
            if (r6 == 0) goto L_0x0049
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            androidx.lifecycle.i0 r6 = r6.mo71262a(r0)
            r2 = r6
            cl1.h1 r2 = (cl1.C54979h1) r2
        L_0x0049:
            if (r2 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r6 = 0
            r2.f154109A = r6
        L_0x004f:
            ht1.n5 r6 = r5.f175883b
            if (r6 == 0) goto L_0x0056
            r6.mo58971a()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61857d0.mo63858f(boolean):void");
    }
}
