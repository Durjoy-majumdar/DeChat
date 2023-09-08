package mf1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import pf1.C11920q;
import pf1.C62262d0;
import rf1.C12982a;
import te3.C52286zn2;
import te3.uc4;

/* renamed from: mf1.a0 */
public final class C10785a0 extends C12982a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: cm1.i2} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11020b(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r22, jq3.C60905o r23, android.view.View r24, pf1.C11920q r25, java.lang.String r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            r6 = r25
            r3 = r26
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r4 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            java.lang.String r5 = "feed"
            r7 = r22
            gy3.C87412m.m108594g(r7, r5)
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "jumpView"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = "infoEx"
            gy3.C87412m.m108594g(r6, r5)
            java.lang.String r5 = "source"
            gy3.C87412m.m108594g(r3, r5)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r6.f34827a
            te3.uc4 r7 = r0.f37017f
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r7 != 0) goto L_0x0058
            java.util.LinkedList<te3.uc4> r7 = r5.style
            java.lang.String r12 = "infoEx.jumpInfo.style"
            gy3.C87412m.m108593f(r7, r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x003d:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0054
            java.lang.Object r12 = r7.next()
            r13 = r12
            te3.uc4 r13 = (te3.uc4) r13
            int r13 = r13.f142762h
            if (r13 != r8) goto L_0x0050
            r13 = 1
            goto L_0x0051
        L_0x0050:
            r13 = 0
        L_0x0051:
            if (r13 == 0) goto L_0x003d
            goto L_0x0055
        L_0x0054:
            r12 = r9
        L_0x0055:
            r7 = r12
            te3.uc4 r7 = (te3.uc4) r7
        L_0x0058:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[onBindView] hashCode:"
            r12.append(r13)
            int r13 = r21.hashCode()
            r12.append(r13)
            java.lang.String r13 = "holder: "
            r12.append(r13)
            int r13 = r23.hashCode()
            r12.append(r13)
            java.lang.String r13 = " holder position: "
            r12.append(r13)
            int r13 = r23.mo17365l()
            r12.append(r13)
            java.lang.String r13 = " feedId="
            r12.append(r13)
            long r13 = r0.f37014c
            java.lang.String r13 = o40.C61926c.m72691p(r13)
            r12.append(r13)
            java.lang.String r13 = " showPosition="
            r12.append(r13)
            int r13 = r6.f34841o
            r12.append(r13)
            java.lang.String r13 = " showStyle="
            r12.append(r13)
            int r13 = r6.f34842p
            r12.append(r13)
            java.lang.String r13 = " businessType="
            r12.append(r13)
            int r13 = r5.business_type
            r12.append(r13)
            java.lang.String r13 = " jumpType="
            r12.append(r13)
            int r13 = r5.jumpinfo_type
            r12.append(r13)
            java.lang.String r13 = " title="
            r12.append(r13)
            java.lang.String r13 = r5.recommend_reason
            r12.append(r13)
            r13 = 124(0x7c, float:1.74E-43)
            r12.append(r13)
            java.lang.String r13 = r5.wording
            r12.append(r13)
            java.lang.String r13 = " icon_url="
            r12.append(r13)
            java.lang.String r13 = r5.icon_url
            r12.append(r13)
            java.lang.String r13 = " ext_info="
            r12.append(r13)
            java.lang.String r13 = r5.ext_info
            r12.append(r13)
            r13 = 32
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "Finder.FeedAdCommonJumperObserver"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            r12 = 2131302805(0x7f091995, float:1.8223706E38)
            android.view.View r12 = r2.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r12 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r12
            r15 = 2131302811(0x7f09199b, float:1.8223719E38)
            android.view.View r2 = r2.findViewById(r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r12.clearColorFilter()
            r12.setLayerPaint(r9)
            r12.setIconColor(r11)
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r15 = r15.getColor(r13)
            zc1.b r16 = zc1.C66785b.f191882e
            bd1.e r16 = r16.mo90673n0()
            te3.qq2 r13 = r16.mo62397b()
            te3.oi1 r13 = r13.f140461E
            if (r13 == 0) goto L_0x012b
            int r13 = r13.f139196d
            if (r13 != r10) goto L_0x012b
            r13 = 1
            goto L_0x012c
        L_0x012b:
            r13 = 0
        L_0x012c:
            pf1.d0 r8 = pf1.C62262d0.f176978a
            pf1.p r10 = new pf1.p
            r10.<init>()
            if (r7 == 0) goto L_0x013c
            te3.zn2 r9 = r7.f142766o
            if (r9 == 0) goto L_0x013c
            java.lang.String r9 = r9.f146127d
            goto L_0x013d
        L_0x013c:
            r9 = 0
        L_0x013d:
            java.lang.String r11 = r5.icon_url
            java.lang.String r9 = r0.mo12511h(r9, r11)
            r10.f34820c = r9
            int r9 = r5.business_type
            r11 = 13
            r17 = r15
            r15 = 6
            if (r9 == r15) goto L_0x015a
            if (r9 == r11) goto L_0x0151
            goto L_0x0164
        L_0x0151:
            r9 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r10.f34821d = r9
            r9 = 0
            r10.f34822e = r9
            goto L_0x0164
        L_0x015a:
            r9 = 2131756168(0x7f100488, float:1.9143236E38)
            r10.f34821d = r9
            r9 = 2131099941(0x7f060125, float:1.781225E38)
            r10.f34822e = r9
        L_0x0164:
            if (r13 == 0) goto L_0x0169
            r9 = r17
            goto L_0x016a
        L_0x0169:
            r9 = 0
        L_0x016a:
            r8.getClass()
            java.lang.Class<pl1.s0> r11 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            r18 = r14
            java.lang.String r14 = r10.f34820c
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r19 == 0) goto L_0x0184
            r8.mo87330w(r12, r10)
            r20 = r4
            r19 = r13
            r6 = 0
            goto L_0x01d1
        L_0x0184:
            r19 = r13
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r3 = r13.mo62446e(r15)
            bl3.c r3 = r3.mo62447c(r11)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            r20 = r4
            up1.y r4 = up1.C27696y.THUMB_IMAGE
            r6.<init>(r14, r4)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.LINK_THUMB
            bl3.r$a r13 = r13.mo62446e(r15)
            bl3.c r11 = r13.mo62447c(r11)
            pl1.s0 r11 = (pl1.C11990s0) r11
            n60.f r4 = r11.mo11867O2(r4)
            l60.b r3 = r3.mo85956b(r6, r4)
            pf1.j0 r4 = new pf1.j0
            r6 = 0
            r4.<init>(r6, r12, r10, r9)
            r3.getClass()
            r3.f291320d = r4
            pf1.k0 r4 = new pf1.k0
            r4.<init>(r6, r12, r10, r9)
            r3.f291324h = r4
            pf1.l0 r4 = new pf1.l0
            r4.<init>(r6, r12, r10, r9)
            r3.f291323g = r4
            l60.a r3 = (l60.C99342a) r3
            r3.mo85954d(r12)
        L_0x01d1:
            java.lang.String r3 = "holder.context"
            if (r2 != 0) goto L_0x01d6
            goto L_0x01f0
        L_0x01d6:
            if (r7 == 0) goto L_0x01df
            te3.zn2 r4 = r7.f142766o
            if (r4 == 0) goto L_0x01df
            java.lang.String r4 = r4.f146128e
            goto L_0x01e0
        L_0x01df:
            r4 = r6
        L_0x01e0:
            android.content.Context r7 = r1.f173499A
            gy3.C87412m.m108593f(r7, r3)
            java.lang.String r7 = r8.mo87315e(r7, r5)
            java.lang.String r4 = r0.mo12511h(r4, r7)
            r2.setText(r4)
        L_0x01f0:
            java.lang.Object r4 = r1.f173503E
            boolean r7 = r4 instanceof cm1.C0740i2
            if (r7 == 0) goto L_0x01f9
            cm1.i2 r4 = (cm1.C0740i2) r4
            goto L_0x01fa
        L_0x01f9:
            r4 = r6
        L_0x01fa:
            r7 = 8
            if (r4 == 0) goto L_0x02f2
            long r8 = r4.getItemId()
            int r4 = r5.business_type
            r10 = 1
            if (r4 == r10) goto L_0x02d8
            r10 = 2
            if (r4 == r10) goto L_0x02bd
            r10 = 4
            if (r4 == r10) goto L_0x02a2
            r10 = 6
            if (r4 == r10) goto L_0x0287
            r10 = 13
            if (r4 == r10) goto L_0x026c
            if (r4 == r7) goto L_0x0250
            r10 = 9
            if (r4 == r10) goto L_0x0236
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r10 = r1.f173499A
            gy3.C87412m.m108593f(r10, r3)
            bl3.r$a r4 = r4.mo62443b(r10)
            r10 = r20
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 1024(0x400, float:1.435E-42)
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x0236:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r4.mo5123k3(r8, r7)
            goto L_0x02f2
        L_0x0250:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 16
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x026c:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 512(0x200, float:7.175E-43)
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x0287:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 32
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x02a2:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 256(0x100, float:3.59E-43)
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x02bd:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 128(0x80, float:1.794E-43)
            r4.mo5123k3(r8, r10)
            goto L_0x02f2
        L_0x02d8:
            r10 = r20
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r11 = r1.f173499A
            gy3.C87412m.m108593f(r11, r3)
            bl3.r$a r4 = r4.mo62443b(r11)
            bl3.t r4 = r4.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r4
            if (r4 == 0) goto L_0x02f2
            r10 = 64
            r4.mo5123k3(r8, r10)
        L_0x02f2:
            er1.w3 r4 = er1.C58784w3.f168295a
            r8 = r25
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r8.f34830d
            if (r9 == 0) goto L_0x0306
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            if (r9 == 0) goto L_0x0306
            java.lang.String r9 = r9.getUserName()
            if (r9 != 0) goto L_0x0308
        L_0x0306:
            java.lang.String r9 = ""
        L_0x0308:
            boolean r4 = r4.mo83899R0(r9)
            if (r4 == 0) goto L_0x0321
            vd1.b r4 = vd1.C65584b.f188718a
            rx3.l r4 = r4.mo89659b(r5)
            B r4 = r4.f38556e
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto L_0x0321
            r4 = 1
            goto L_0x0322
        L_0x0321:
            r4 = 0
        L_0x0322:
            if (r2 == 0) goto L_0x0329
            java.lang.CharSequence r9 = r2.getText()
            goto L_0x032a
        L_0x0329:
            r9 = r6
        L_0x032a:
            if (r9 == 0) goto L_0x0335
            int r5 = r9.length()
            if (r5 != 0) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r5 = 0
            goto L_0x0336
        L_0x0335:
            r5 = 1
        L_0x0336:
            if (r5 != 0) goto L_0x03bb
            if (r4 == 0) goto L_0x033c
            goto L_0x03bb
        L_0x033c:
            r4 = 0
            r0.mo12512t(r4)
            if (r2 == 0) goto L_0x0348
            r4 = 1097859072(0x41700000, float:15.0)
            r5 = 1
            r2.setTextSize(r5, r4)
        L_0x0348:
            java.lang.String r4 = "comment"
            r5 = r26
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x0383
            android.content.Context r4 = r2.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100738(0x7f060442, float:1.7813866E38)
            int r4 = r4.getColor(r5)
            if (r19 == 0) goto L_0x0379
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r4 = r4.getColor(r5)
            r5 = 0
            r2.setEnabled(r5)
            r8.f34848v = r5
            goto L_0x037f
        L_0x0379:
            r5 = 1
            r2.setEnabled(r5)
            r8.f34848v = r5
        L_0x037f:
            r2.setTextColor(r4)
            goto L_0x039f
        L_0x0383:
            java.lang.String r4 = "TWO_FLOW"
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x0394
            if (r2 == 0) goto L_0x039f
            r4 = 1094713344(0x41400000, float:12.0)
            r5 = 1
            r2.setTextSize(r5, r4)
            goto L_0x039f
        L_0x0394:
            java.lang.String r4 = "#DEE9FF"
            int r4 = android.graphics.Color.parseColor(r4)
            if (r2 == 0) goto L_0x039f
            r2.setTextColor(r4)
        L_0x039f:
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            android.content.Context r4 = r1.f173499A
            gy3.C87412m.m108593f(r4, r3)
            long r5 = r0.f37014c
            java.lang.String r7 = "universal_jumpinfo"
            r1 = r2
            r2 = r4
            r3 = r5
            r5 = r7
            r6 = r25
            r1.vx0(r2, r3, r5, r6)
            goto L_0x03c6
        L_0x03bb:
            r0.mo12512t(r7)
            java.lang.String r1 = "title is null."
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10785a0.mo11020b(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, android.view.View, pf1.q, java.lang.String):void");
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        String str;
        T t;
        C52286zn2 zn22;
        boolean z;
        C87412m.m108594g(qVar, "infoEx");
        LinkedList<uc4> linkedList = qVar.f34827a.style;
        C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((uc4) t).f142762h == 2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        uc4 uc4 = (uc4) t;
        if (!(uc4 == null || (zn22 = uc4.f142766o) == null)) {
            str = zn22.f146128e;
        }
        C62262d0 d0Var = C62262d0.f176978a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        return !Util.isNullOrNil(mo12511h(str, d0Var.mo87315e(context, qVar.f34827a)));
    }
}
