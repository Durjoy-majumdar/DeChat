package cj1;

import android.os.Bundle;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32231t;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49291ej0;

/* renamed from: cj1.m1 */
public final class C54791m1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f153598d;

    /* renamed from: e */
    public final /* synthetic */ int f153599e;

    /* renamed from: f */
    public final /* synthetic */ boolean f153600f;

    /* renamed from: g */
    public final /* synthetic */ String f153601g;

    /* renamed from: h */
    public final /* synthetic */ C45795b f153602h;

    /* renamed from: i */
    public final /* synthetic */ C54795n5 f153603i;

    /* renamed from: j */
    public final /* synthetic */ C54806r1 f153604j;

    /* renamed from: n */
    public final /* synthetic */ C49291ej0 f153605n;

    /* renamed from: o */
    public final /* synthetic */ C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> f153606o;

    /* renamed from: p */
    public final /* synthetic */ int f153607p;

    /* renamed from: q */
    public final /* synthetic */ String f153608q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54791m1(boolean z, int i, boolean z2, String str, C45795b bVar, C54795n5 n5Var, C54806r1 r1Var, C49291ej0 ej02, C32231t<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, ? super C49291ej0, C13598b0> tVar, int i2, String str2) {
        super(0);
        this.f153598d = z;
        this.f153599e = i;
        this.f153600f = z2;
        this.f153601g = str;
        this.f153602h = bVar;
        this.f153603i = n5Var;
        this.f153604j = r1Var;
        this.f153605n = ej02;
        this.f153606o = tVar;
        this.f153607p = i2;
        this.f153608q = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "createLive success:"
            r3.append(r4)
            boolean r4 = r0.f153598d
            r3.append(r4)
            java.lang.String r4 = ", errCode:"
            r3.append(r4)
            int r4 = r0.f153599e
            r3.append(r4)
            java.lang.String r4 = " needFaceVerify:"
            r3.append(r4)
            boolean r4 = r0.f153600f
            r3.append(r4)
            java.lang.String r4 = " verifyUrl:"
            r3.append(r4)
            java.lang.String r4 = r0.f153601g
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveExternalHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r0.f153598d
            r5 = 0
            if (r3 == 0) goto L_0x0171
            fj1.b r3 = r0.f153602h
            androidx.lifecycle.i0 r3 = r3.mo71262a(r2)
            cl1.o r3 = (cl1.C54991o) r3
            fe1.q r3 = r3.f154259T2
            if (r3 != 0) goto L_0x0059
            fe1.d$b r3 = fe1.C58961d.f168673a
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            fe1.q r3 = r3.mo84155b(r6)
        L_0x0059:
            if (r3 == 0) goto L_0x0097
            fj1.b r6 = r0.f153602h
            androidx.lifecycle.i0 r7 = r6.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            androidx.lifecycle.i0 r8 = r6.mo71262a(r2)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154354q
            r8 = r8 & -257(0xfffffffffffffeff, float:NaN)
            r7.f154354q = r8
            androidx.lifecycle.i0 r7 = r6.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            androidx.lifecycle.i0 r8 = r6.mo71262a(r2)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154354q
            long r8 = (long) r8
            r7.mo75982R4(r8)
            androidx.lifecycle.i0 r7 = r6.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            long r8 = r3.field_liveSwitchFlag
            r7.mo75983S4(r8)
            androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
            cl1.o r6 = (cl1.C54991o) r6
            long r7 = r3.field_liveSwitchFlag
            r6.mo75976O4(r7)
        L_0x0097:
            nk1.o r6 = nk1.C61791o.f175673a
            fj1.b r7 = r0.f153602h
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.f154354q
            java.lang.String r8 = "postLive"
            r6.mo86722d(r8, r7)
            cj1.n5 r9 = r0.f153603i
            fj1.b r6 = r0.f153602h
            androidx.lifecycle.i0 r6 = r6.mo71262a(r1)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r10 = r6.f182392d
            fj1.b r6 = r0.f153602h
            androidx.lifecycle.i0 r6 = r6.mo71262a(r1)
            cl1.u r6 = (cl1.C55001u) r6
            long r12 = r6.f154416j
            fj1.b r6 = r0.f153602h
            androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
            cl1.o r6 = (cl1.C54991o) r6
            int r14 = r6.f154354q
            r15 = 0
            r16 = 0
            r17 = 24
            r18 = 0
            cj1.C54795n5.C54796a.m61726d(r9, r10, r12, r14, r15, r16, r17, r18)
            cj1.y1 r6 = cj1.C0639y1.f1510a
            r6.mo617i()
            cj1.r1 r6 = r0.f153604j
            te3.ey0 r6 = r6.f153637b
            te3.ej0 r7 = r0.f153605n
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f132950d
            if (r7 == 0) goto L_0x00e6
            java.lang.String r7 = r7.wxa_game_export_id
            goto L_0x00e7
        L_0x00e6:
            r7 = r5
        L_0x00e7:
            r6.f183050i = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "before joinLive: anchorStatusFlag:"
            r6.append(r7)
            fj1.b r7 = r0.f153602h
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.f154354q
            r6.append(r7)
            java.lang.String r7 = ", switchFlag:"
            r6.append(r7)
            if (r3 == 0) goto L_0x010e
            long r7 = r3.field_liveSwitchFlag
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x010f
        L_0x010e:
            r3 = r5
        L_0x010f:
            r6.append(r3)
            java.lang.String r3 = " giftFuncEnabel:"
            r6.append(r3)
            fj1.b r3 = r0.f153602h
            androidx.lifecycle.i0 r2 = r3.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154243Q1
            r6.append(r2)
            java.lang.String r2 = ", linkMicFuncEnabel:"
            r6.append(r2)
            fj1.b r2 = r0.f153602h
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.f154080w
            r6.append(r2)
            java.lang.String r2 = ", wxaGameExportId:"
            r6.append(r2)
            te3.ej0 r2 = r0.f153605n
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f132950d
            if (r2 == 0) goto L_0x0145
            java.lang.String r5 = r2.wxa_game_export_id
        L_0x0145:
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            cj1.n5 r5 = r0.f153603i
            if (r5 == 0) goto L_0x0205
            r6 = 0
            fj1.b r2 = r0.f153602h
            androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r7 = r1.f182392d
            r9 = 1
            cj1.l1 r10 = new cj1.l1
            fy3.t<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, android.os.Bundle, te3.ej0, rx3.b0> r1 = r0.f153606o
            cj1.r1 r2 = r0.f153604j
            fj1.b r3 = r0.f153602h
            r10.<init>(r1, r2, r3)
            r5.mo75734f0(r6, r7, r9, r10)
            goto L_0x0205
        L_0x0171:
            boolean r1 = r0.f153600f
            if (r1 == 0) goto L_0x01b4
            java.lang.String r1 = r0.f153601g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01b4
            er1.c5 r6 = er1.C58704c5.f168044a
            er1.e5$c r1 = er1.C58713e5.f168094v
            java.lang.String r7 = r1.f168101b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            er1.C58704c5.m68184a(r6, r7, r8, r9, r10, r11, r12)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r0.f153601g
            fy3.t<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, android.os.Bundle, te3.ej0, rx3.b0> r13 = r0.f153606o
            int r3 = r0.f153599e
            int r4 = r0.f153607p
            java.lang.String r5 = r0.f153608q
            java.lang.String r6 = "EXT_INFO_KEY_REAL_NAME_URL"
            r1.putString(r6, r2)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r19 = 0
            r17 = r5
            r18 = r1
            r13.mo14122L(r14, r15, r16, r17, r18, r19)
            goto L_0x0205
        L_0x01b4:
            er1.c5 r6 = er1.C58704c5.f168044a
            er1.e5$c r1 = er1.C58713e5.f168093u
            java.lang.String r7 = r1.f168101b
            er1.j4 r1 = er1.C58739j4.f168176a
            te3.zo2 r2 = new te3.zo2
            r2.<init>()
            int r3 = r0.f153599e
            java.lang.String r4 = r0.f153608q
            r2.f186779e = r3
            r2.f186780f = r4
            rx3.b0 r3 = rx3.C13598b0.f38549a
            pe3.b r8 = r1.mo83710g0(r2)
            r9 = 0
            r10 = 1
            r11 = 4
            r12 = 0
            er1.C58704c5.m68184a(r6, r7, r8, r9, r10, r11, r12)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            te3.ej0 r2 = r0.f153605n
            fy3.t<java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, android.os.Bundle, te3.ej0, rx3.b0> r13 = r0.f153606o
            int r3 = r0.f153599e
            int r4 = r0.f153607p
            java.lang.String r6 = r0.f153608q
            te3.ay0 r7 = r2.f132952f
            if (r7 == 0) goto L_0x01ed
            byte[] r5 = r7.toByteArray()
        L_0x01ed:
            java.lang.String r7 = "EXT_INFO_KEY_ERROR_PAGE"
            r1.putByteArray(r7, r5)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r17 = r6
            r18 = r1
            r19 = r2
            r13.mo14122L(r14, r15, r16, r17, r18, r19)
        L_0x0205:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54791m1.invoke():java.lang.Object");
    }
}
