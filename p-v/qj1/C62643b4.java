package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d60.C58124b;
import di3.C86312j;
import dj1.C45371j1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C9118u;
import kj1.C10125e1;
import nr3.C89059e;
import rx3.C13598b0;
import xk1.C15715a2;
import xk1.C53364m2;
import xk1.C66297d2;

/* renamed from: qj1.b4 */
public final class C62643b4 extends C62660c {

    /* renamed from: p */
    public final C58124b f177899p;

    /* renamed from: q */
    public C66297d2 f177900q;

    /* renamed from: r */
    public C15715a2 f177901r;

    /* renamed from: qj1.b4$a */
    public static final class C62644a extends C87413o implements C32226l<FinderObjectDesc, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62643b4 f177902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62644a(C62643b4 b4Var) {
            super(1);
            this.f177902d = b4Var;
        }

        public Object invoke(Object obj) {
            FinderObjectDesc finderObjectDesc = (FinderObjectDesc) obj;
            C87412m.m108594g(finderObjectDesc, LocaleUtil.ITALIAN);
            C58124b bVar = this.f177902d.f177899p;
            C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_STATUS_CREATE_LIVE;
            Bundle bundle = new Bundle();
            bundle.putByteArray("PARAM_KEY_POST_OBJECT_DESC", finderObjectDesc.toByteArray());
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.util.LinkedList<te3.l61>} */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62643b4(android.view.ViewGroup r26, d60.C58124b r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 0
            r0.<init>(r1, r2, r4)
            r0.f177899p = r2
            bl3.r r5 = bl3.C39818r.f106831a
            android.content.Context r6 = r26.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r6, r7)
            com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
            bl3.r$a r6 = r5.mo62444c(r6)
            java.lang.Class<xk1.d2> r8 = xk1.C66297d2.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r8)
            java.lang.String r8 = "UICProvider.of(root.cont…rLivePostUIC::class.java)"
            gy3.C87412m.m108593f(r6, r8)
            xk1.d2 r6 = (xk1.C66297d2) r6
            r0.f177900q = r6
            android.content.Context r6 = r26.getContext()
            gy3.C87412m.m108592e(r6, r7)
            com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
            bl3.r$a r6 = r5.mo62444c(r6)
            java.lang.Class<xk1.a2> r8 = xk1.C15715a2.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r8)
            java.lang.String r8 = "UICProvider.of(root.cont…oreActionUIC::class.java)"
            gy3.C87412m.m108593f(r6, r8)
            xk1.a2 r6 = (xk1.C15715a2) r6
            r0.f177901r = r6
            xk1.d2 r6 = r0.f177900q
            fj1.b r8 = r25.mo87684A0()
            qj1.b4$a r9 = new qj1.b4$a
            r9.<init>(r0)
            r6.getClass()
            java.lang.String r10 = "liveData"
            gy3.C87412m.m108594g(r8, r10)
            r6.f190850f = r2
            r6.f190866y = r8
            r6.f190851g = r1
            r6.f190840A = r9
            r9 = 2131304099(0x7f091ea3, float:1.8226331E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r6.f190852h = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x009b
            r10 = 2131304103(0x7f091ea7, float:1.822634E38)
            android.view.View r9 = r9.findViewById(r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 == 0) goto L_0x009b
            il1.u5 r10 = new il1.u5
            androidx.appcompat.app.AppCompatActivity r11 = r6.getActivity()
            gy3.C87412m.m108592e(r11, r7)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            xk1.d2$d r12 = r6.f190844E
            r10.<init>(r11, r9, r12)
            goto L_0x009c
        L_0x009b:
            r10 = r4
        L_0x009c:
            r6.f190854j = r10
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x00be
            r10 = 2131311140(0x7f093a24, float:1.8240612E38)
            android.view.View r9 = r9.findViewById(r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 == 0) goto L_0x00be
            il1.v5 r10 = new il1.v5
            androidx.appcompat.app.AppCompatActivity r11 = r6.getActivity()
            gy3.C87412m.m108592e(r11, r7)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            xk1.d2$d r12 = r6.f190844E
            r10.<init>(r11, r9, r12)
            goto L_0x00bf
        L_0x00be:
            r10 = r4
        L_0x00bf:
            r6.f190855n = r10
            il1.b6 r9 = new il1.b6
            androidx.appcompat.app.AppCompatActivity r10 = r6.getActivity()
            gy3.C87412m.m108592e(r10, r7)
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
            android.view.View r11 = r6.getRootView()
            r9.<init>(r10, r11)
            r6.f190853i = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x00e1
            r10 = 2131304058(0x7f091e7a, float:1.8226248E38)
            android.view.View r9 = r9.findViewById(r10)
            goto L_0x00e2
        L_0x00e1:
            r9 = r4
        L_0x00e2:
            r6.f190859r = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x00f2
            r10 = 2131304060(0x7f091e7c, float:1.8226252E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto L_0x00f3
        L_0x00f2:
            r9 = r4
        L_0x00f3:
            r6.f190860s = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x0101
            r10 = 2131304108(0x7f091eac, float:1.822635E38)
            android.view.View r9 = r9.findViewById(r10)
            goto L_0x0102
        L_0x0101:
            r9 = r4
        L_0x0102:
            r6.f190861t = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x0110
            r10 = 2131304102(0x7f091ea6, float:1.8226337E38)
            android.view.View r9 = r9.findViewById(r10)
            goto L_0x0111
        L_0x0110:
            r9 = r4
        L_0x0111:
            r6.f190862u = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x011f
            r10 = 2131304107(0x7f091eab, float:1.8226347E38)
            android.view.View r9 = r9.findViewById(r10)
            goto L_0x0120
        L_0x011f:
            r9 = r4
        L_0x0120:
            r6.f190863v = r9
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x013b
            r10 = 2131304316(0x7f091f7c, float:1.8226771E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x013b
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x013b
            il1.k6 r11 = new il1.k6
            r11.<init>(r9, r10)
            goto L_0x013c
        L_0x013b:
            r11 = r4
        L_0x013c:
            r6.f190864w = r11
            android.view.View r9 = r6.f190851g
            if (r9 == 0) goto L_0x0161
            r10 = 2131304111(0x7f091eaf, float:1.8226355E38)
            android.view.View r9 = r9.findViewById(r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 == 0) goto L_0x0161
            il1.u4 r10 = new il1.u4
            androidx.appcompat.app.AppCompatActivity r11 = r6.getActivity()
            gy3.C87412m.m108592e(r11, r7)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            xk1.j2 r7 = new xk1.j2
            r7.<init>(r6)
            r10.<init>(r11, r9, r7)
            goto L_0x0162
        L_0x0161:
            r10 = r4
        L_0x0162:
            r6.f190856o = r10
            android.view.View r7 = r6.f190851g
            if (r7 == 0) goto L_0x0172
            r9 = 2131304128(0x7f091ec0, float:1.822639E38)
            android.view.View r7 = r7.findViewById(r9)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r7 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView) r7
            goto L_0x0173
        L_0x0172:
            r7 = r4
        L_0x0173:
            r6.f190865x = r7
            android.view.View r7 = r6.f190851g
            if (r7 == 0) goto L_0x0183
            r9 = 2131304131(0x7f091ec3, float:1.8226396E38)
            android.view.View r7 = r7.findViewById(r9)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            goto L_0x0184
        L_0x0183:
            r7 = r4
        L_0x0184:
            r6.f190857p = r7
            android.view.View r7 = r6.f190851g
            if (r7 == 0) goto L_0x0192
            r9 = 2131304130(0x7f091ec2, float:1.8226394E38)
            android.view.View r7 = r7.findViewById(r9)
            goto L_0x0193
        L_0x0192:
            r7 = r4
        L_0x0193:
            r6.f190858q = r7
            if (r7 == 0) goto L_0x019a
            r7.setOnClickListener(r6)
        L_0x019a:
            android.view.View r7 = r6.f190861t
            r9 = 1
            if (r7 != 0) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            r7.setEnabled(r9)
        L_0x01a3:
            android.view.View r7 = r6.f190861t
            if (r7 == 0) goto L_0x01af
            xk1.k2 r10 = new xk1.k2
            r10.<init>(r6)
            r7.setOnClickListener(r10)
        L_0x01af:
            android.widget.TextView r7 = r6.f190852h
            if (r7 == 0) goto L_0x01c5
            androidx.appcompat.app.AppCompatActivity r10 = r6.getActivity()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r10 = r10.getColor(r11)
            r7.setTextColor(r10)
        L_0x01c5:
            android.widget.TextView r7 = r6.f190852h
            if (r7 == 0) goto L_0x01ce
            android.text.TextPaint r7 = r7.getPaint()
            goto L_0x01cf
        L_0x01ce:
            r7 = r4
        L_0x01cf:
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r7, r10)
            ok1.e r7 = ok1.C62042e.f176370a
            fe1.q r10 = r6.mo90416f3()
            r11 = 0
            if (r10 == 0) goto L_0x01e2
            long r13 = r10.field_liveSwitchFlag
            goto L_0x01e3
        L_0x01e2:
            r13 = r11
        L_0x01e3:
            r7.getClass()
            int r10 = (int) r13
            r13 = 4
            boolean r10 = o40.C61926c.m72696u(r10, r13)
            if (r10 != 0) goto L_0x01fe
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x01fe
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r13 = r10.f154354q
            r13 = r13 & -65
            r10.f154354q = r13
        L_0x01fe:
            nk1.o r10 = nk1.C61791o.f175673a
            fe1.q r13 = r6.mo90416f3()
            if (r13 == 0) goto L_0x0209
            long r13 = r13.field_liveSwitchFlag
            goto L_0x020a
        L_0x0209:
            r13 = r11
        L_0x020a:
            boolean r10 = r10.mo86720b(r13)
            if (r10 != 0) goto L_0x0220
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x0220
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r13 = r10.f154354q
            r13 = r13 & -129(0xffffffffffffff7f, float:NaN)
            r10.f154354q = r13
        L_0x0220:
            fe1.q r10 = r6.mo90416f3()
            if (r10 == 0) goto L_0x0229
            long r13 = r10.field_liveSwitchFlag
            goto L_0x022a
        L_0x0229:
            r13 = r11
        L_0x022a:
            int r10 = (int) r13
            r13 = 128(0x80, float:1.794E-43)
            boolean r10 = o40.C61926c.m72696u(r10, r13)
            if (r10 == 0) goto L_0x0254
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x0243
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r13 = r10.f154354q
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r10.f154354q = r13
        L_0x0243:
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x0264
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r13 = r10.f154354q
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r10.f154354q = r13
            goto L_0x0264
        L_0x0254:
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x0264
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r13 = r10.f154354q
            r13 = r13 & -1025(0xfffffffffffffbff, float:NaN)
            r10.f154354q = r13
        L_0x0264:
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x026f
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            goto L_0x0270
        L_0x026f:
            r10 = r4
        L_0x0270:
            if (r10 != 0) goto L_0x0273
            goto L_0x0286
        L_0x0273:
            fe1.q r13 = r6.mo90416f3()
            if (r13 == 0) goto L_0x027c
            long r13 = r13.field_liveSwitchFlag
            goto L_0x027d
        L_0x027c:
            r13 = r11
        L_0x027d:
            int r14 = (int) r13
            r13 = 16
            boolean r13 = o40.C61926c.m72696u(r14, r13)
            r10.f154256T = r13
        L_0x0286:
            fj1.b r10 = r6.f190866y
            r13 = 0
            if (r10 == 0) goto L_0x0299
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75999e4()
            if (r10 != r9) goto L_0x0299
            r10 = 1
            goto L_0x029a
        L_0x0299:
            r10 = 0
        L_0x029a:
            if (r10 != 0) goto L_0x02ac
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x02ac
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            int r14 = r10.f154354q
            r14 = r14 & -16385(0xffffffffffffbfff, float:NaN)
            r10.f154354q = r14
        L_0x02ac:
            fj1.b r10 = r6.f190866y
            if (r10 == 0) goto L_0x02be
            androidx.lifecycle.i0 r10 = r10.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75999e4()
            if (r10 != r9) goto L_0x02be
            r10 = 1
            goto L_0x02bf
        L_0x02be:
            r10 = 0
        L_0x02bf:
            r14 = 8
            if (r10 != 0) goto L_0x02eb
            fe1.q r10 = r6.mo90416f3()
            if (r10 == 0) goto L_0x02cb
            long r11 = r10.field_liveSwitchFlag
        L_0x02cb:
            int r10 = (int) r11
            boolean r10 = o40.C61926c.m72696u(r10, r14)
            if (r10 == 0) goto L_0x02d8
            boolean r7 = r7.mo87076f()
            if (r7 != 0) goto L_0x02eb
        L_0x02d8:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r10 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r7.putBoolean(r10, r13)
            d60.b r10 = r6.f190850f
            if (r10 == 0) goto L_0x02eb
            d60.b$b r11 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r10.statusChange(r11, r7)
        L_0x02eb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "setupConfig selfContact.anchorStatus:"
            r7.append(r10)
            fe1.q r10 = r6.mo90416f3()
            if (r10 == 0) goto L_0x0303
            long r10 = r10.field_liveAnchorStatusFlag
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x0304
        L_0x0303:
            r10 = r4
        L_0x0304:
            r7.append(r10)
            java.lang.String r10 = " switchFlag:"
            r7.append(r10)
            fe1.q r10 = r6.mo90416f3()
            if (r10 == 0) goto L_0x0319
            long r10 = r10.field_liveSwitchFlag
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x031a
        L_0x0319:
            r10 = r4
        L_0x031a:
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r10 = "Finder.FinderLivePostUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            il1.u5 r7 = r6.f190854j
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x03e6
            pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
            java.lang.Class<pl1.s0> r15 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
            fe1.d$b r9 = fe1.C58961d.f168673a
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r13 = r16.mo90662O5()
            fe1.q r9 = r9.mo84155b(r13)
            java.lang.String r13 = r7.f172526f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "setCover liveCover:"
            r4.append(r11)
            if (r9 == 0) goto L_0x0350
            java.lang.String r11 = r9.field_liveCoverImg
            goto L_0x0351
        L_0x0350:
            r11 = 0
        L_0x0351:
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            if (r9 == 0) goto L_0x0360
            java.lang.String r4 = r9.field_liveCoverImg
            goto L_0x0361
        L_0x0360:
            r4 = 0
        L_0x0361:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x039d
            if (r9 == 0) goto L_0x036c
            java.lang.String r4 = r9.field_liveCoverImg
            goto L_0x036d
        L_0x036c:
            r4 = 0
        L_0x036d:
            if (r4 != 0) goto L_0x0370
            r4 = r10
        L_0x0370:
            r7.f172530j = r4
            bl3.r$a r4 = r5.mo62446e(r14)
            bl3.c r4 = r4.mo62447c(r15)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11868R0()
            pl1.f r9 = new pl1.f
            java.lang.String r11 = r7.f172530j
            r0 = 0
            r13 = 2
            r9.<init>(r11, r0, r13, r0)
            android.widget.ImageView r0 = r7.f172527g
            bl3.r$a r11 = r5.mo62446e(r14)
            bl3.c r11 = r11.mo62447c(r15)
            pl1.s0 r11 = (pl1.C11990s0) r11
            n60.f r11 = r11.mo11867O2(r12)
            r4.mo85957c(r9, r0, r11)
            goto L_0x03df
        L_0x039d:
            if (r9 == 0) goto L_0x03a2
            java.lang.String r0 = r9.field_avatarUrl
            goto L_0x03a3
        L_0x03a2:
            r0 = 0
        L_0x03a3:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03df
            if (r9 == 0) goto L_0x03ae
            java.lang.String r0 = r9.field_avatarUrl
            goto L_0x03af
        L_0x03ae:
            r0 = 0
        L_0x03af:
            if (r0 != 0) goto L_0x03b2
            r0 = r10
        L_0x03b2:
            r7.f172529i = r0
            bl3.r$a r0 = r5.mo62446e(r14)
            bl3.c r0 = r0.mo62447c(r15)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11868R0()
            pl1.f r4 = new pl1.f
            java.lang.String r9 = r7.f172529i
            r11 = 2
            r13 = 0
            r4.<init>(r9, r13, r11, r13)
            android.widget.ImageView r9 = r7.f172527g
            bl3.r$a r13 = r5.mo62446e(r14)
            bl3.c r13 = r13.mo62447c(r15)
            pl1.s0 r13 = (pl1.C11990s0) r13
            n60.f r12 = r13.mo11867O2(r12)
            r0.mo85957c(r4, r9, r12)
            goto L_0x03e0
        L_0x03df:
            r11 = 2
        L_0x03e0:
            xk1.d2$d r0 = r7.f172525e
            r0.onChange()
            goto L_0x03e7
        L_0x03e6:
            r11 = 2
        L_0x03e7:
            il1.v5 r0 = r6.f190855n
            if (r0 == 0) goto L_0x04c4
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Object r7 = r7.mo119685f(r9, r12)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r7, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "checkLicenseState hasShowLicense:"
            r9.append(r12)
            r9.append(r7)
            java.lang.String r12 = ", licenseState:"
            r9.append(r12)
            int r12 = r0.f28817c
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "FinderLivePostLicenseWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            android.view.View r9 = r0.f28818d
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r14)
            java.lang.Object[] r18 = r12.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/widget/FinderLivePostLicenseWidget"
            java.lang.String r20 = "checkLicenseState"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r9
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9.setVisibility(r12)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/widget/FinderLivePostLicenseWidget"
            java.lang.String r19 = "checkLicenseState"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            if (r7 == 0) goto L_0x0475
            android.view.View r0 = r0.f28818d
            r0.performClick()
            goto L_0x04c4
        L_0x0475:
            di3.d r7 = di3.C86312j.m106911c(r4)
            ak1.o r7 = (ak1.C54108o) r7
            r7.getClass()
            ak1.f0 r7 = ak1.C54108o.f151869h
            boolean r9 = r7.f151444Z
            if (r9 != 0) goto L_0x04c4
            di3.d r9 = di3.C86312j.m106911c(r4)
            ak1.o r9 = (ak1.C54108o) r9
            r9.getClass()
            boolean r9 = r7.f151446a0
            if (r9 != 0) goto L_0x04c4
            int r9 = r0.f28817c
            r12 = 1
            if (r9 != r12) goto L_0x049c
            android.view.View r0 = r0.f28818d
            r0.performClick()
            r11 = 1
        L_0x049c:
            di3.d r0 = di3.C86312j.m106911c(r4)
            java.lang.String r9 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r9)
            r17 = r0
            ht1.j5 r17 = (ht1.C8777j5) r17
            r18 = 10
            java.lang.String r20 = java.lang.String.valueOf(r11)
            r21 = 0
            r22 = 4
            r23 = 0
            ht1.C8777j5.C8778a.m8600a(r17, r18, r20, r21, r22, r23)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            long r11 = (long) r11
            r7.f151435Q = r11
        L_0x04c4:
            android.view.View r0 = r6.f190862u
            if (r0 == 0) goto L_0x04d0
            xk1.e2 r4 = new xk1.e2
            r4.<init>(r6, r0)
            r0.post(r4)
        L_0x04d0:
            androidx.appcompat.app.AppCompatActivity r0 = r6.getActivity()
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<xk1.b2> r4 = xk1.C15717b2.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            xk1.b2 r0 = (xk1.C15717b2) r0
            r4 = 1
            r0.mo14441c3(r4, r1, r2, r8)
            androidx.appcompat.app.AppCompatActivity r0 = r6.getActivity()
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<xk1.z1> r7 = xk1.C15798z1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
            xk1.z1 r0 = (xk1.C15798z1) r0
            r0.mo14497c3(r4, r1, r2, r8)
            androidx.appcompat.app.AppCompatActivity r0 = r6.getActivity()
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<xk1.s1> r7 = xk1.C15775s1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
            xk1.s1 r0 = (xk1.C15775s1) r0
            r0.mo14491d3(r4, r1, r2, r8)
            androidx.appcompat.app.AppCompatActivity r0 = r6.getActivity()
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<xk1.y1> r7 = xk1.C15794y1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
            xk1.y1 r0 = (xk1.C15794y1) r0
            r0.mo14496c3(r4, r1, r2, r8)
            androidx.appcompat.app.AppCompatActivity r0 = r6.getActivity()
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<xk1.l1> r4 = xk1.C66320l1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            xk1.l1 r0 = (xk1.C66320l1) r0
            r0.getClass()
            r0.f190916e = r1
            r0.f190917f = r2
            rx3.g r4 = r0.f190918g
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r9)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC"
            java.lang.String r20 = "initPostLayout"
            java.lang.String r21 = "(ILandroid/view/View;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = 0
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC"
            java.lang.String r19 = "initPostLayout"
            java.lang.String r20 = "(ILandroid/view/View;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r4 == 0) goto L_0x0589
            com.tencent.mm.plugin.finder.live.view.b r2 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r2
            goto L_0x058a
        L_0x0589:
            r2 = 0
        L_0x058a:
            if (r2 == 0) goto L_0x05a6
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r17 = r2.getActivityScope()
            if (r17 == 0) goto L_0x05a6
            r18 = 0
            r19 = 0
            xk1.o1 r2 = new xk1.o1
            r4 = 0
            r2.<init>(r0, r4)
            r21 = 3
            r22 = 0
            r20 = r2
            a14.C53895h.m60464b(r17, r18, r19, r20, r21, r22)
            goto L_0x05a7
        L_0x05a6:
            r4 = 0
        L_0x05a7:
            qg1.r r0 = new qg1.r
            r2 = 0
            r0.<init>(r10, r2, r2)
            nr3.e r0 = r0.mo9225i()
            android.app.Activity r2 = r6.getContext()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI"
            gy3.C87412m.m108592e(r2, r5)
            com.tencent.mm.plugin.finder.ui.MMFinderUI r2 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r2
            r0.mo11397F(r2)
            xk1.i2 r2 = new xk1.i2
            r2.<init>(r6)
            r0.mo123420E(r2)
            androidx.lifecycle.i0 r0 = r8.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.LinkedList<te3.l61> r0 = r0.f154269V2
            if (r0 == 0) goto L_0x063a
            boolean r2 = r0.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x05da
            goto L_0x05db
        L_0x05da:
            r0 = r4
        L_0x05db:
            if (r0 == 0) goto L_0x063a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x05e6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0604
            java.lang.Object r3 = r0.next()
            r5 = r3
            te3.l61 r5 = (te3.C50222l61) r5
            int r5 = r5.f137222i
            r7 = -1
            if (r5 == r7) goto L_0x05fd
            if (r5 <= 0) goto L_0x05fb
            goto L_0x05fd
        L_0x05fb:
            r13 = 0
            goto L_0x05fe
        L_0x05fd:
            r13 = 1
        L_0x05fe:
            if (r13 == 0) goto L_0x05e6
            r2.add(r3)
            goto L_0x05e6
        L_0x0604:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r2, r3)
            r0.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0613:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0628
            java.lang.Object r3 = r2.next()
            te3.l61 r3 = (te3.C50222l61) r3
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$a r5 = new com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$a
            r5.<init>(r3)
            r0.add(r5)
            goto L_0x0613
        L_0x0628:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r2 = r6.f190865x
            if (r2 != 0) goto L_0x062d
            goto L_0x0631
        L_0x062d:
            r3 = 0
            r2.setVisibility(r3)
        L_0x0631:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r2 = r6.f190865x
            if (r2 == 0) goto L_0x063a
            r2.setTaskInfoList(r0)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x063a:
            if (r4 != 0) goto L_0x0647
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r0 = r6.f190865x
            if (r0 != 0) goto L_0x0641
            goto L_0x0647
        L_0x0641:
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0649
        L_0x0647:
            r2 = 8
        L_0x0649:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r0 = r6.f190865x
            if (r0 == 0) goto L_0x0652
            int r14 = r0.getVisibility()
            goto L_0x0654
        L_0x0652:
            r14 = 8
        L_0x0654:
            r6.f190845F = r14
            r6.mo90414d3()
            r0 = r25
            xk1.a2 r2 = r0.f177901r
            d60.b r3 = r0.f177899p
            fj1.b r4 = r25.mo87684A0()
            r5 = 1
            r2.mo14435c3(r5, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62643b4.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        C66297d2 d2Var = this.f177900q;
        if (i == 8) {
            FinderLiveTaskBannerView finderLiveTaskBannerView = d2Var.f190865x;
            if (finderLiveTaskBannerView != null) {
                finderLiveTaskBannerView.f160097p = false;
                finderLiveTaskBannerView.f160099r.removeMessages(finderLiveTaskBannerView.f160094j);
                return;
            }
            return;
        }
        d2Var.getClass();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        C10125e1.C10132d dVar;
        C9118u uVar;
        C10125e1 e1Var = this.f177901r.f42407i;
        if (e1Var != null && (dVar = e1Var.f30989h) != null && (uVar = dVar.f31037c) != null) {
            uVar.mo9934a(i, z);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 5) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C39622i0 a = rVar.mo62444c((MMActivity) context).mo75002a(C66297d2.class);
            C87412m.m108593f(a, "UICProvider.of(root.cont…rLivePostUIC::class.java)");
            C66297d2 d2Var = (C66297d2) a;
            View view = d2Var.f190861t;
            if (view != null) {
                view.setEnabled(true);
            }
            Class cls = C54108o.class;
            C54067f0.C0066n nVar = C54067f0.C0066n.FRAME;
            C54067f0.C0062l lVar = C54067f0.C0062l.BEFORE;
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.MORE, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
            AppCompatActivity activity = d2Var.getActivity();
            MMFinderUI mMFinderUI = activity instanceof MMFinderUI ? (MMFinderUI) activity : null;
            if (mMFinderUI != null) {
                C89059e i = new C45371j1(1, 1, 524288, 1024, 6).mo9225i();
                i.mo123420E(new C53364m2(d2Var));
                i.mo11397F(mMFinderUI);
            }
        } else if (ordinal == 172) {
            C66297d2 d2Var2 = this.f177900q;
            d2Var2.f190867z = 0;
            d2Var2.mo90415e3();
        }
    }
}
