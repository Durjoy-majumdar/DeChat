package qj1;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qj1.sa */
public final class C12661sa extends C87413o implements C32226l<C49765hx0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36262d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12661sa(C12389fa faVar) {
        super(1);
        this.f36262d = faVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r7 = r11.f134919d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            te3.hx0 r11 = (te3.C49765hx0) r11
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            qj1.fa r1 = r10.f36262d
            boolean r1 = r1.mo12069a1()
            r2 = 0
            r3 = 1
            r4 = 3
            if (r1 != 0) goto L_0x0055
            if (r11 == 0) goto L_0x0016
            int r0 = r11.f134926n
            if (r0 != r4) goto L_0x0016
            r2 = 1
        L_0x0016:
            if (r2 == 0) goto L_0x019e
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.f134919d
            if (r11 == 0) goto L_0x019e
            java.lang.String r4 = r11.username
            if (r4 == 0) goto L_0x019e
            qj1.fa r11 = r10.f36262d
            cj1.r0 r0 = cj1.C54804r0.f153631a
            com.tencent.mm.plugin.finder.live.view.b r1 = r11.mo14484z0()
            android.content.Context r1 = r1.getContext()
            fj1.b r2 = r11.mo87684A0()
            r3 = 0
            bl3.r r5 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.live.view.b r11 = r11.mo14484z0()
            android.content.Context r11 = r11.getContext()
            java.lang.String r6 = "basePluginLayout.context"
            gy3.C87412m.m108593f(r11, r6)
            bl3.r$a r11 = r5.mo62443b(r11)
            java.lang.Class<ht1.g4> r5 = ht1.C60172g4.class
            bl3.c r11 = r11.mo62447c(r5)
            ht1.g4 r11 = (ht1.C60172g4) r11
            te3.hj1 r5 = r11.mo12861q3()
            r0.mo75765g(r1, r2, r3, r4, r5)
            goto L_0x019e
        L_0x0055:
            qj1.fa r1 = r10.f36262d
            d60.b r1 = r1.f35690p
            int r1 = r1.getLiveRole()
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x006c
            di3.d r1 = di3.C86312j.m106911c(r0)
            ak1.w r1 = (ak1.C54116w) r1
            ak1.j0 r6 = ak1.C0076j0.CLICK_VISITOR_IN_HOT_LIST
            r1.nv0(r6, r5, r2)
        L_0x006c:
            qj1.fa r1 = r10.f36262d
            r1.f35686W = r11
            ok1.e r1 = ok1.C62042e.f176370a
            r6 = 0
            if (r11 == 0) goto L_0x007c
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r11.f134919d
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = r7.username
            goto L_0x007d
        L_0x007c:
            r7 = r6
        L_0x007d:
            boolean r1 = r1.mo87084h1(r7)
            if (r11 == 0) goto L_0x0086
            int r11 = r11.f134926n
            goto L_0x0087
        L_0x0086:
            r11 = 1
        L_0x0087:
            qj1.fa r7 = r10.f36262d
            java.lang.String r7 = r7.f35692q
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "itemClick username:"
            r8.append(r9)
            qj1.fa r9 = r10.f36262d
            te3.hx0 r9 = r9.f35686W
            if (r9 == 0) goto L_0x00a2
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.f134919d
            if (r9 == 0) goto L_0x00a2
            java.lang.String r9 = r9.username
            goto L_0x00a3
        L_0x00a2:
            r9 = r6
        L_0x00a3:
            r8.append(r9)
            java.lang.String r9 = ", nickname:"
            r8.append(r9)
            qj1.fa r9 = r10.f36262d
            te3.hx0 r9 = r9.f35686W
            if (r9 == 0) goto L_0x00b8
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.f134919d
            if (r9 == 0) goto L_0x00b8
            java.lang.String r9 = r9.nickname
            goto L_0x00b9
        L_0x00b8:
            r9 = r6
        L_0x00b9:
            r8.append(r9)
            java.lang.String r9 = ", disableComment:"
            r8.append(r9)
            qj1.fa r9 = r10.f36262d
            te3.hx0 r9 = r9.f35686W
            if (r9 == 0) goto L_0x00ce
            int r9 = r9.f134921f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00cf
        L_0x00ce:
            r9 = r6
        L_0x00cf:
            r8.append(r9)
            java.lang.String r9 = ",isMySelf:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = ",userRoleType:"
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            qj1.fa r7 = r10.f36262d
            boolean r7 = r7.mo12069a1()
            if (r7 == 0) goto L_0x0154
            qj1.fa r0 = r10.f36262d
            te3.hx0 r0 = r0.f35686W
            if (r0 == 0) goto L_0x00fd
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x00fd
            java.lang.String r6 = r0.username
        L_0x00fd:
            if (r6 == 0) goto L_0x0108
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r0 = 0
            goto L_0x0109
        L_0x0108:
            r0 = 1
        L_0x0109:
            if (r0 != 0) goto L_0x019e
            r0 = 4
            if (r11 == r0) goto L_0x019e
            qj1.fa r11 = r10.f36262d
            te3.hx0 r0 = r11.f35686W
            if (r0 == 0) goto L_0x011e
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = r0.username
            if (r0 != 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r5 = r0
        L_0x011e:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_USERNAME"
            r0.putString(r1, r5)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE"
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_SOURCE_TYPE"
            r0.putInt(r1, r3)
            d60.b r1 = r11.f35690p
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE
            r1.statusChange(r2, r0)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r11.f35673J
            r0.mo78802a()
            d60.b r11 = r11.f35690p
            int r11 = r11.getLiveRole()
            if (r11 != r3) goto L_0x019e
            java.lang.Class<ak1.o> r11 = ak1.C54108o.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ak1.o r11 = (ak1.C54108o) r11
            ak1.f0$h0 r0 = ak1.C54067f0.C0059h0.EXPOSE_USER_FINDER_HALF_BOARD
            r11.Zx0(r0)
            goto L_0x019e
        L_0x0154:
            if (r1 != 0) goto L_0x019e
            qj1.fa r1 = r10.f36262d
            qo3.n r6 = r1.f35687X
            if (r6 != 0) goto L_0x016b
            qo3.n r6 = new qo3.n
            com.tencent.mm.plugin.finder.live.view.b r7 = r1.mo14484z0()
            android.content.Context r7 = r7.getContext()
            r6.<init>((android.content.Context) r7, (int) r3, (boolean) r2)
            r1.f35687X = r6
        L_0x016b:
            qo3.n r6 = r1.f35687X
            if (r6 == 0) goto L_0x0172
            r6.mo107570o(r3)
        L_0x0172:
            qo3.n r3 = r1.f35687X
            if (r3 == 0) goto L_0x017d
            qj1.za r6 = new qj1.za
            r6.<init>(r1, r11)
            r3.f225771i = r6
        L_0x017d:
            if (r3 == 0) goto L_0x0183
            nj3.p0 r6 = r1.f35691p0
            r3.f225782p = r6
        L_0x0183:
            if (r3 == 0) goto L_0x018c
            qj1.ab r6 = new qj1.ab
            r6.<init>(r1)
            r3.f225761d = r6
        L_0x018c:
            if (r3 == 0) goto L_0x0191
            r3.mo107573q()
        L_0x0191:
            if (r11 != r4) goto L_0x019e
            di3.d r11 = di3.C86312j.m106911c(r0)
            ak1.w r11 = (ak1.C54116w) r11
            ak1.j0 r0 = ak1.C0076j0.EXPOSE_HALF_BOARD_HOT_LIST
            r11.nv0(r0, r5, r2)
        L_0x019e:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12661sa.invoke(java.lang.Object):java.lang.Object");
    }
}
