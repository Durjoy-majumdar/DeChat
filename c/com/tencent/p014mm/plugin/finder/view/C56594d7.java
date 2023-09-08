package com.tencent.p014mm.plugin.finder.view;

import cj1.C0581o5;
import fj1.C45795b;
import nj3.C76891l0;

/* renamed from: com.tencent.mm.plugin.finder.view.d7 */
public final class C56594d7 implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ C45795b f162245a;

    /* renamed from: b */
    public final /* synthetic */ boolean f162246b;

    /* renamed from: c */
    public final /* synthetic */ C0581o5 f162247c;

    /* renamed from: d */
    public final /* synthetic */ String f162248d;

    public C56594d7(C45795b bVar, boolean z, C0581o5 o5Var, String str) {
        this.f162245a = bVar;
        this.f162246b = z;
        this.f162247c = o5Var;
        this.f162248d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.view.MenuItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nj3.f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if (r2.mo87037R0(r9.mo579i()) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71744a(nj3.C76874e0 r12, android.view.View r13, android.view.ContextMenu.ContextMenuInfo r14) {
        /*
            r11 = this;
            java.lang.Class<cl1.o> r13 = cl1.C54991o.class
            ak1.g0 r1 = ak1.C0073g0.LIVE_DESC
            java.lang.Class<ak1.o> r14 = ak1.C54108o.class
            com.tencent.mm.plugin.finder.view.f7 r0 = com.tencent.p014mm.plugin.finder.view.C56608f7.f162301a
            fj1.b r2 = r11.f162245a
            java.lang.String r3 = "menu"
            gy3.C87412m.m108593f(r12, r3)
            com.tencent.p014mm.plugin.finder.view.C56608f7.m65279a(r0, r2, r12)
            boolean r2 = r11.f162246b
            java.lang.String r3 = "utf-8"
            java.lang.String r4 = "doc"
            r5 = 4
            java.lang.String r6 = "type"
            java.lang.String r7 = "getService(HellLiveReport::class.java)"
            if (r2 == 0) goto L_0x0051
            di3.d r12 = di3.C86312j.m106911c(r14)
            gy3.C87412m.m108593f(r12, r7)
            r0 = r12
            ht1.j5 r0 = (ht1.C8777j5) r0
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            cj1.o5 r13 = r11.f162247c
            r12.put(r6, r5)
            java.lang.String r13 = r13.getContent()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            java.lang.String r13 = p206nj.C117627q.m165909b(r13, r3)
            r12.put(r4, r13)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            java.lang.String r2 = r12.toString()
            r3 = 0
            r4 = 4
            r5 = 0
            ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)
            return
        L_0x0051:
            cj1.o5 r2 = r11.f162247c
            java.lang.String r2 = r2.mo571e()
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            boolean r2 = gy3.C87412m.m108589b(r2, r8)
            r8 = 1
            if (r2 != 0) goto L_0x00da
            cj1.o5 r2 = r11.f162247c
            java.lang.String r2 = r2.mo571e()
            java.lang.String r9 = eb0.C75592q0.m90789s()
            boolean r2 = gy3.C87412m.m108589b(r2, r9)
            if (r2 != 0) goto L_0x00da
            r2 = 158(0x9e, float:2.21E-43)
            android.view.MenuItem r2 = r12.findItem(r2)
            if (r2 != 0) goto L_0x00da
            r2 = 168(0xa8, float:2.35E-43)
            android.view.MenuItem r2 = r12.findItem(r2)
            if (r2 != 0) goto L_0x00da
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r9 = r2.mo87027N0()
            if (r9 != 0) goto L_0x00ab
            fj1.b r9 = r11.f162245a
            androidx.lifecycle.i0 r9 = r9.mo71262a(r13)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.mo76001f4()
            if (r9 != r8) goto L_0x00da
            cj1.o5 r9 = r11.f162247c
            java.lang.String r10 = "msg"
            gy3.C87412m.m108594g(r9, r10)
            te3.hx0 r9 = r9.mo579i()
            boolean r2 = r2.mo87037R0(r9)
            if (r2 != 0) goto L_0x00da
        L_0x00ab:
            fj1.b r2 = r11.f162245a
            androidx.lifecycle.i0 r13 = r2.mo71262a(r13)
            cl1.o r13 = (cl1.C54991o) r13
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r13 = r13.f154262U0
            java.lang.String r2 = r11.f162248d
            java.lang.Object r13 = r13.get(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r13 = gy3.C87412m.m108589b(r13, r2)
            java.lang.String r2 = ""
            if (r13 != 0) goto L_0x00cf
            fj1.b r13 = r11.f162245a
            java.lang.String r9 = r11.f162248d
            if (r9 != 0) goto L_0x00cc
            r9 = r2
        L_0x00cc:
            r0.mo79958g(r13, r12, r9)
        L_0x00cf:
            fj1.b r13 = r11.f162245a
            java.lang.String r9 = r11.f162248d
            if (r9 != 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            r0.mo79953b(r13, r12, r2)
        L_0x00da:
            cj1.o5 r13 = r11.f162247c
            r0.mo79955d(r12, r13)
            boolean r13 = r11.f162246b
            if (r13 == 0) goto L_0x0113
            di3.d r12 = di3.C86312j.m106911c(r14)
            gy3.C87412m.m108593f(r12, r7)
            r0 = r12
            ht1.j5 r0 = (ht1.C8777j5) r0
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            cj1.o5 r13 = r11.f162247c
            r12.put(r6, r5)
            java.lang.String r13 = r13.getContent()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            java.lang.String r13 = p206nj.C117627q.m165909b(r13, r3)
            r12.put(r4, r13)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            java.lang.String r2 = r12.toString()
            r3 = 0
            r4 = 4
            r5 = 0
            ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)
            return
        L_0x0113:
            r13 = 154(0x9a, float:2.16E-43)
            android.view.MenuItem r13 = r12.findItem(r13)
            if (r13 != 0) goto L_0x011e
            r0.mo79956e(r12)
        L_0x011e:
            r0.mo79954c(r12)
            fj1.b r13 = r11.f162245a
            cj1.o5 r14 = r11.f162247c
            r0.mo79957f(r13, r12, r14)
            java.util.List<android.view.MenuItem> r12 = r12.f224704d
            java.lang.String r13 = "menuList"
            gy3.C87412m.m108593f(r12, r13)
            r13 = 0
            java.util.Iterator r12 = r12.iterator()
        L_0x0134:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0169
            java.lang.Object r14 = r12.next()
            int r0 = r13 + 1
            r1 = 0
            if (r13 < 0) goto L_0x0165
            android.view.MenuItem r14 = (android.view.MenuItem) r14
            qj1.e5$g r13 = qj1.C12322e5.f35497W
            java.util.Set<java.lang.Integer> r13 = qj1.C12322e5.f35503y0
            int r2 = r14.getItemId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x0163
            boolean r13 = r14 instanceof nj3.C76875f0
            if (r13 == 0) goto L_0x015e
            r1 = r14
            nj3.f0 r1 = (nj3.C76875f0) r1
        L_0x015e:
            if (r1 != 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r1.f224708B = r8
        L_0x0163:
            r13 = r0
            goto L_0x0134
        L_0x0165:
            sx3.C64197v.m75542k()
            throw r1
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56594d7.mo71744a(nj3.e0, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }
}
