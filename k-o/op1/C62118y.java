package op1;

import cm1.C0740i2;
import nj3.C11184p0;

/* renamed from: op1.y */
public final class C62118y implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176636d;

    /* renamed from: e */
    public final /* synthetic */ C0740i2 f176637e;

    public C62118y(C62084h hVar, C0740i2 i2Var) {
        this.f176636d = hVar;
        this.f176637e = i2Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMMMenuItemSelected(android.view.MenuItem r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            ak1.g0 r2 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
            java.lang.Class<kq.h> r1 = p185kq.C10383h.class
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.Class<ak1.o> r6 = ak1.C54108o.class
            int r7 = r27.getItemId()
            java.lang.String r9 = "clickid"
            java.lang.String r12 = "appid"
            java.lang.String r13 = "shopwindowid"
            java.lang.String r14 = "sessionid"
            java.lang.String r15 = "type"
            r16 = 0
            java.lang.String r10 = "liveid"
            java.lang.String r11 = "getService(HellLiveReport::class.java)"
            r17 = 0
            java.lang.String r8 = "productid"
            r20 = r2
            java.lang.String r2 = ""
            r21 = 0
            r22 = r9
            r9 = 100
            if (r7 == r9) goto L_0x01d1
            r9 = 101(0x65, float:1.42E-43)
            if (r7 == r9) goto L_0x003b
            goto L_0x02f4
        L_0x003b:
            op1.h r7 = r0.f176636d
            uo3.a r7 = r7.mo87154Q5()
            r7.mo108266a()
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            cm1.i2 r9 = r0.f176637e
            sk1.x r9 = (sk1.C63965x) r9
            r19 = r10
            long r9 = r9.f181347t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r7.add(r9)
            op1.h r9 = r0.f176636d
            ok1.e r10 = ok1.C62042e.f176370a
            r23 = r1
            r1 = 102(0x66, float:1.43E-43)
            te3.mh0 r1 = r10.mo87131z(r1, r7)
            op1.C62084h.m72975w5(r9, r1)
            op1.h r1 = r0.f176636d
            boolean r1 = r1.f176532f
            if (r1 == 0) goto L_0x02f4
            cm1.i2 r1 = r0.f176637e
            sk1.x r1 = (sk1.C63965x) r1
            if (r1 == 0) goto L_0x007a
            int r1 = r1.f181336D
            r7 = 1
            if (r1 != r7) goto L_0x007a
            r1 = 1
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            if (r1 == 0) goto L_0x00e0
            di3.d r1 = di3.C86312j.m106911c(r6)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            cm1.i2 r7 = r0.f176637e
            sk1.x r7 = (sk1.C63965x) r7
            long r9 = r7.f181347t
            ak1.m0 r1 = r1.f151443Y
            java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r1 = r1.f151845v
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0099
            goto L_0x00e0
        L_0x0099:
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            java.lang.Object r1 = r1.get(r7)
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            if (r1 == 0) goto L_0x00e0
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x00ac
            goto L_0x00e0
        L_0x00ac:
            java.lang.Object r7 = r1.getLast()
            ak1.z r7 = (ak1.C54118z) r7
            boolean r7 = r7.f151965b
            if (r7 != 0) goto L_0x00e0
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Object r7 = r1.getLast()
            ak1.z r7 = (ak1.C54118z) r7
            r24 = r3
            r25 = r4
            long r3 = r7.f151964a
            long r9 = r9 - r3
            java.lang.Object r3 = r1.getLast()
            ak1.z r3 = (ak1.C54118z) r3
            int r4 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r9 = r17
        L_0x00d4:
            r3.f151964a = r9
            java.lang.Object r1 = r1.getLast()
            ak1.z r1 = (ak1.C54118z) r1
            r3 = 1
            r1.f151965b = r3
            goto L_0x00e4
        L_0x00e0:
            r24 = r3
            r25 = r4
        L_0x00e4:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3 = 4
            r1.put(r15, r3)
            di3.d r3 = di3.C86312j.m106911c(r6)
            ak1.o r3 = (ak1.C54108o) r3
            r3.getClass()
            ak1.f0 r3 = ak1.C54108o.f151869h
            java.lang.String r3 = r3.f151475s
            r1.put(r14, r3)
            r1.put(r13, r2)
            cm1.i2 r3 = r0.f176637e
            sk1.x r3 = (sk1.C63965x) r3
            if (r3 == 0) goto L_0x0109
            long r3 = r3.f181347t
            goto L_0x010b
        L_0x0109:
            r3 = r17
        L_0x010b:
            r1.put(r8, r3)
            fj1.b$a r3 = fj1.C45795b.f123697j
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x0123
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75995c4()
            r4 = 1
            if (r3 != r4) goto L_0x0123
            r3 = 1
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            if (r3 == 0) goto L_0x013e
            di3.d r2 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r2, r11)
            r3 = r2
            ht1.j5 r3 = (ht1.C8777j5) r3
            r4 = 6
            java.lang.String r6 = r1.toString()
            r7 = 0
            r8 = 4
            r9 = 0
            ht1.C8777j5.C8778a.m8600a(r3, r4, r6, r7, r8, r9)
            goto L_0x02f4
        L_0x013e:
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x0151
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75999e4()
            r4 = 1
            if (r3 != r4) goto L_0x0151
            r21 = 1
        L_0x0151:
            if (r21 == 0) goto L_0x02f4
            fj1.b r3 = fj1.C45795b.f123698n
            r4 = r25
            if (r3 == 0) goto L_0x0162
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            java.lang.String r3 = r3.f154151z
            goto L_0x0164
        L_0x0162:
            r3 = r16
        L_0x0164:
            r1.put(r12, r3)
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x017a
            r7 = r24
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x017a
            long r9 = r3.f182392d
            goto L_0x017c
        L_0x017a:
            r9 = -1
        L_0x017c:
            int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x0186
            r3 = r19
            r1.put(r3, r2)
            goto L_0x0195
        L_0x0186:
            r3 = r19
            di3.d r5 = di3.C86312j.m106911c(r23)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10700XQ(r9)
            r1.put(r3, r5)
        L_0x0195:
            t91.c$a r3 = t91.C64208c.f181951a
            java.lang.String r3 = t91.C64208c.f181967q
            r9 = r22
            r1.put(r9, r3)
            t91.C64208c.f181967q = r2
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x01b6
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            cm1.i2 r3 = r3.f154147v
            if (r3 == 0) goto L_0x01b6
            long r2 = r3.getItemId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x01b6:
            r1.put(r8, r2)
            di3.d r2 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r2, r11)
            ht1.j5 r2 = (ht1.C8777j5) r2
            java.lang.String r3 = r1.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r2
            r2 = r20
            ht1.C8777j5.C8778a.m8605f(r1, r2, r3, r4, r5, r6)
            goto L_0x02f4
        L_0x01d1:
            r23 = r1
            r7 = r3
            r3 = r10
            r9 = r22
            op1.h r1 = r0.f176636d
            uo3.a r1 = r1.mo87154Q5()
            r1.mo108266a()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            cm1.i2 r10 = r0.f176637e
            sk1.x r10 = (sk1.C63965x) r10
            r22 = r9
            long r9 = r10.f181347t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r1.add(r9)
            op1.h r9 = r0.f176636d
            ok1.e r10 = ok1.C62042e.f176370a
            r19 = r3
            r3 = 103(0x67, float:1.44E-43)
            te3.mh0 r1 = r10.mo87131z(r3, r1)
            op1.C62084h.m72975w5(r9, r1)
            op1.h r1 = r0.f176636d
            boolean r1 = r1.f176532f
            if (r1 == 0) goto L_0x02f4
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3 = 5
            r1.put(r15, r3)
            di3.d r3 = di3.C86312j.m106911c(r6)
            ak1.o r3 = (ak1.C54108o) r3
            r3.getClass()
            ak1.f0 r3 = ak1.C54108o.f151869h
            java.lang.String r3 = r3.f151475s
            r1.put(r14, r3)
            r1.put(r13, r2)
            cm1.i2 r3 = r0.f176637e
            sk1.x r3 = (sk1.C63965x) r3
            if (r3 == 0) goto L_0x0232
            long r9 = r3.f181347t
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto L_0x0234
        L_0x0232:
            r3 = r16
        L_0x0234:
            r1.put(r8, r3)
            fj1.b$a r3 = fj1.C45795b.f123697j
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x024c
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75995c4()
            r9 = 1
            if (r3 != r9) goto L_0x024c
            r3 = 1
            goto L_0x024d
        L_0x024c:
            r3 = 0
        L_0x024d:
            if (r3 == 0) goto L_0x0267
            di3.d r2 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r2, r11)
            r3 = r2
            ht1.j5 r3 = (ht1.C8777j5) r3
            r4 = 6
            java.lang.String r6 = r1.toString()
            r7 = 0
            r8 = 4
            r9 = 0
            ht1.C8777j5.C8778a.m8600a(r3, r4, r6, r7, r8, r9)
            goto L_0x02f4
        L_0x0267:
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x027a
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75999e4()
            r5 = 1
            if (r3 != r5) goto L_0x027a
            r21 = 1
        L_0x027a:
            if (r21 == 0) goto L_0x02f4
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x0289
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            java.lang.String r3 = r3.f154151z
            goto L_0x028b
        L_0x0289:
            r3 = r16
        L_0x028b:
            r1.put(r12, r3)
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x029f
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x029f
            long r9 = r3.f182392d
            goto L_0x02a1
        L_0x029f:
            r9 = -1
        L_0x02a1:
            int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ab
            r3 = r19
            r1.put(r3, r2)
            goto L_0x02ba
        L_0x02ab:
            r3 = r19
            di3.d r5 = di3.C86312j.m106911c(r23)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10700XQ(r9)
            r1.put(r3, r5)
        L_0x02ba:
            t91.c$a r3 = t91.C64208c.f181951a
            java.lang.String r3 = t91.C64208c.f181967q
            r5 = r22
            r1.put(r5, r3)
            t91.C64208c.f181967q = r2
            fj1.b r3 = fj1.C45795b.f123698n
            if (r3 == 0) goto L_0x02db
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            cm1.i2 r3 = r3.f154147v
            if (r3 == 0) goto L_0x02db
            long r2 = r3.getItemId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x02db:
            r1.put(r8, r2)
            di3.d r2 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r2, r11)
            ht1.j5 r2 = (ht1.C8777j5) r2
            java.lang.String r3 = r1.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r2
            r2 = r20
            ht1.C8777j5.C8778a.m8605f(r1, r2, r3, r4, r5, r6)
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62118y.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
