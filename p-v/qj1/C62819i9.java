package qj1;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.i9 */
public final class C62819i9 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f178302d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62819i9(C62949r8 r8Var) {
        super(1);
        this.f178302d = r8Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Class<cl1.j> r2 = cl1.C39975j.class
            java.lang.Class<cl1.z0> r3 = cl1.C0702z0.class
            qj1.r8 r10 = r0.f178302d
            androidx.lifecycle.i0 r4 = r10.mo87696x0(r3)
            cl1.z0 r4 = (cl1.C0702z0) r4
            int r11 = r4.mo671e3()
            qk1.i1 r4 = r10.f178622B
            r13 = 1
            java.lang.String r14 = "Finder.LiveInputPlugin"
            if (r4 == 0) goto L_0x016f
            java.util.ArrayList<qk1.i1$b> r4 = r4.f179401e
            if (r4 == 0) goto L_0x016f
            java.lang.Object r1 = r4.get(r1)
            qk1.i1$b r1 = (qk1.C63221i1.C63223b) r1
            if (r1 == 0) goto L_0x016f
            java.lang.String r15 = r1.f179410a
            long r4 = eb0.C31543z5.m39451a()
            long r6 = r1.f179412c
            long r6 = r4 - r6
            long r8 = qj1.C62949r8.f178619W
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 > 0) goto L_0x006d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "checkIfCanSendLocationMsg: too fast, currentTime:"
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = ", lastPoiSendTime:"
            r3.append(r4)
            long r4 = r1.f179412c
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            android.content.Context r1 = r10.f178626F
            r3 = 2131827616(0x7f111ba0, float:1.928815E38)
            java.lang.String r3 = r1.getString(r3)
            nj3.C76912y0.m92767f(r1, r3)
            r1 = r0
            r0 = r2
            r17 = r14
            goto L_0x0186
        L_0x006d:
            r1.f179412c = r4
            boolean r1 = r10.mo87881n1()
            if (r1 != 0) goto L_0x0127
            long r6 = r10.f178633M
            boolean r1 = r10.f178632L
            cj1.r0 r9 = cj1.C54804r0.f153631a
            android.content.Context r5 = r10.f178626F
            fj1.b r4 = r10.mo87684A0()
            dj1.z$b r8 = dj1.C58294z.f166917x
            te3.r41 r8 = r8.mo8522a(r15, r13, r11)
            qj1.o9 r12 = new qj1.o9
            r13 = r4
            r4 = r12
            r17 = r14
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r15
            r7 = r1
            r21 = r2
            r0 = r8
            r1 = r9
            r2 = 1000066(0xf4282, float:1.401391E-39)
            r8 = r18
            r4.<init>(r5, r6, r7, r8)
            r1.mo75763e(r14, r13, r0, r12)
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r4 = r10.mo87684A0()
            boolean r4 = r1.mo87046U0(r4)
            if (r4 == 0) goto L_0x00b1
            goto L_0x011b
        L_0x00b1:
            te3.r41 r4 = new te3.r41
            r4.<init>()
            te3.hx0 r5 = new te3.hx0
            r5.<init>()
            fj1.b r6 = r10.mo87684A0()
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r1.mo87050W(r6)
            r5.f134919d = r6
            androidx.lifecycle.i0 r6 = r10.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            java.util.LinkedList r6 = r6.mo76016o3()
            r5.f134930r = r6
            int r1 = r1.mo87036R()
            r5.f134926n = r1
            r4.f185132o = r5
            r4.f185126f = r15
            r4.f185127g = r2
            r4.f185137t = r11
            if (r11 <= 0) goto L_0x00e3
            r1 = 1
            goto L_0x00e4
        L_0x00e3:
            r1 = 0
        L_0x00e4:
            r4.f185136s = r1
            java.lang.String r1 = r4.f185130j
            r4.f185130j = r1
            r1 = 0
            r2 = 1
            java.lang.String r5 = qj1.C62949r8.m74148m1(r10, r1, r2, r1)
            r4.f185124d = r5
            cj1.j5 r1 = new cj1.j5
            r1.<init>(r4)
            androidx.lifecycle.i0 r2 = r10.mo87696x0(r3)
            cl1.z0 r2 = (cl1.C0702z0) r2
            java.util.List<cj1.o5> r2 = r2.f1672f
            r2.add(r1)
            androidx.lifecycle.i0 r2 = r10.mo87696x0(r3)
            cl1.z0 r2 = (cl1.C0702z0) r2
            r2.mo669c3(r1)
            androidx.lifecycle.i0 r0 = r10.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.List<cj1.o5> r0 = r0.f154224L2
            r0.add(r1)
            y50.k r0 = y50.C53496k.f150436a
            r0.mo74169b()
        L_0x011b:
            d60.b r0 = r10.f178641p
            d60.b$b r1 = d60.C58124b.C58125b.POST_MSG
            r2 = 2
            r3 = 0
            d60.C58124b.C7172a.m7372a(r0, r1, r3, r2, r3)
            r0 = r21
            goto L_0x0172
        L_0x0127:
            r0 = r2
            r17 = r14
            r2 = 1000066(0xf4282, float:1.401391E-39)
            androidx.lifecycle.i0 r1 = r10.mo87696x0(r0)
            cl1.j r1 = (cl1.C39975j) r1
            androidx.lifecycle.z<te3.lw0> r3 = r1.f107170j
            java.lang.Object r3 = r3.getValue()
            te3.lw0 r3 = (te3.C50317lw0) r3
            if (r3 == 0) goto L_0x0141
            java.lang.String r3 = r3.f137677e
            if (r3 != 0) goto L_0x0143
        L_0x0141:
            java.lang.String r3 = ""
        L_0x0143:
            te3.lw0 r4 = new te3.lw0
            r4.<init>()
            r5 = 1
            r4.f137676d = r5
            r4.f137677e = r3
            nk1.h r5 = nk1.C47272h.f126894a
            te3.xs0 r4 = r5.mo72298c(r4, r15)
            r1.mo62582j3(r3, r4)
            d60.b r1 = r10.f178641p
            d60.b$b r3 = d60.C58124b.C58125b.POST_BOX_MSG
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "PARAM_FINDER_LIVE_BOX_MSG_TYPE"
            r4.putInt(r5, r2)
            java.lang.String r2 = "PARAM_FINDER_LIVE_BOX_MSG_CONTENT"
            r4.putString(r2, r15)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r1.statusChange(r3, r4)
            goto L_0x0172
        L_0x016f:
            r0 = r2
            r17 = r14
        L_0x0172:
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            androidx.recyclerview.widget.RecyclerView r2 = r10.f178621A
            r3 = 25561(0x63d9, float:3.5819E-41)
            java.lang.String r4 = "finder_live_room_fastcomment_event"
            r5 = 0
            r1.mo86153W7(r4, r2, r5, r3)
            r1 = r20
        L_0x0186:
            qj1.r8 r2 = r1.f178302d
            androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
            cl1.j r0 = (cl1.C39975j) r0
            boolean r0 = r0.mo62578e3()
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "inBox, keep show keyboard"
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x01a2
        L_0x019c:
            qj1.r8 r0 = r1.f178302d
            r2 = 1
            r0.mo87878h1(r2)
        L_0x01a2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62819i9.invoke(java.lang.Object):java.lang.Object");
    }
}
