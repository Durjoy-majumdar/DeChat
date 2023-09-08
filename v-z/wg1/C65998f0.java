package wg1;

import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: wg1.f0 */
public final class C65998f0 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C65954a0 f189746d;

    public C65998f0(C65954a0 a0Var) {
        this.f189746d = a0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r11, r0)
            int r0 = r11.what
            wg1.a0 r1 = r10.f189746d
            int r2 = r1.f189628o
            java.lang.String r3 = "FinderLiveAnchorMusicPresenter"
            r4 = 1
            if (r0 != r2) goto L_0x00fd
            java.lang.Object r11 = r11.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorMusicPlugin.SeiDataFromGame"
            gy3.C87412m.m108592e(r11, r0)
            qj1.t2$a r11 = (qj1.C62987t2.C62988a) r11
            r1.getClass()
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            long r5 = r11.f178723d
            long r7 = r1.f189630q
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "[checkAndUpdateUI] update ui,seiData:"
            r2.append(r5)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            long r5 = r11.f178723d
            r1.f189630q = r5
            fj1.b r2 = r1.f189621e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.o r2 = (cl1.C54991o) r2
            cj1.f r2 = r2.f154232N2
            java.util.ArrayList<cj1.h6> r2 = r2.f153469f
            java.util.Iterator r5 = r2.iterator()
        L_0x004e:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r5.next()
            r8 = r6
            cj1.h6 r8 = (cj1.C54768h6) r8
            te3.x41 r8 = r8.f153498a
            int r8 = r8.f144442d
            int r9 = r11.f178720a
            if (r8 != r9) goto L_0x0066
            r8 = 1
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 == 0) goto L_0x004e
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            cj1.h6 r6 = (cj1.C54768h6) r6
            if (r6 == 0) goto L_0x00b9
            int r2 = r2.indexOf(r6)
            int r5 = r11.f178721b
            if (r5 != r4) goto L_0x0089
            int r5 = r6.f153499b
            if (r5 == r4) goto L_0x009b
            fj1.b r5 = r1.f189621e
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.o r5 = (cl1.C54991o) r5
            cj1.f r5 = r5.f154232N2
            r5.mo75651h(r6, r2)
            goto L_0x009a
        L_0x0089:
            int r5 = r6.f153499b
            if (r5 != r4) goto L_0x009b
            fj1.b r5 = r1.f189621e
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.o r5 = (cl1.C54991o) r5
            cj1.f r5 = r5.f154232N2
            r5.mo75650g(r6, r2)
        L_0x009a:
            r7 = 1
        L_0x009b:
            if (r7 == 0) goto L_0x00aa
            java.lang.String r2 = "[checkAndUpdateUI] song changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            wg1.y r2 = new wg1.y
            r2.<init>(r1)
            o40.C61926c.m72668M(r2)
        L_0x00aa:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r2 = r2.mo83692U()
            if (r2 == 0) goto L_0x00b9
            if (r7 != 0) goto L_0x00b9
            java.lang.String r2 = "[checkAndUpdateUI] ui not need change song status"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
        L_0x00b9:
            int r2 = r11.f178722c
            fj1.b r5 = r1.f189621e
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154235O2
            if (r2 == r5) goto L_0x00e1
            java.lang.String r2 = "[checkAndUpdateUI] volume changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            fj1.b r2 = r1.f189621e
            androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r2 = r11.f178722c
            r0.f154235O2 = r2
            wg1.z r0 = new wg1.z
            r0.<init>(r1, r11)
            o40.C61926c.m72668M(r0)
            goto L_0x0129
        L_0x00e1:
            er1.j4 r11 = er1.C58739j4.f168176a
            boolean r11 = r11.mo83692U()
            if (r11 == 0) goto L_0x0129
            java.lang.String r11 = "[checkAndUpdateUI] ui not need change volume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            goto L_0x0129
        L_0x00ef:
            er1.j4 r11 = er1.C58739j4.f168176a
            boolean r11 = r11.mo83692U()
            if (r11 == 0) goto L_0x0129
            java.lang.String r11 = "[checkAndUpdateUI] opt is old"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            goto L_0x0129
        L_0x00fd:
            int r2 = r1.f189629p
            if (r0 != r2) goto L_0x0129
            java.lang.Object r11 = r11.obj
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r11, r0)
            java.lang.Long r11 = (java.lang.Long) r11
            long r5 = r11.longValue()
            long r7 = r1.f189630q
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x011c
            java.lang.String r11 = "[checkAndUpdateTime] opt is new ,update ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            r1.f189630q = r5
            goto L_0x0129
        L_0x011c:
            er1.j4 r11 = er1.C58739j4.f168176a
            boolean r11 = r11.mo83692U()
            if (r11 == 0) goto L_0x0129
            java.lang.String r11 = "[checkAndUpdateTime] opt is old"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
        L_0x0129:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65998f0.handleMessage(android.os.Message):boolean");
    }
}
