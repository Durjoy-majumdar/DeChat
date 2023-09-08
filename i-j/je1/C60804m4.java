package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import it1.C60628i;
import java.util.ArrayList;
import java.util.LinkedList;
import kj2.C117407d;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49842ig0;
import te3.C50821pf1;
import te3.C51978xi1;
import te3.C52252ze1;
import te3.C64233an1;
import te3.C64259bh0;
import te3.C64586nn1;
import te3.C64884zm1;
import vp1.C65834e;

/* renamed from: je1.m4 */
public final class C60804m4 extends C60628i {

    /* renamed from: g */
    public C47350c f173183g;

    /* renamed from: h */
    public C11385n f173184h;

    /* renamed from: i */
    public int f173185i;

    /* renamed from: j */
    public C46744d f173186j = C46744d.Disable;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v104, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v105, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v106, resolved type: java.lang.Long} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60804m4(java.lang.String r32, java.util.List<java.lang.String> r33, byte[] r34, int r35, int r36, gf1.C59418i.C59419a r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            java.lang.Class<gh0.b> r6 = gh0.C59438b.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r7 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r8 = "multiFinderUsernames"
            gy3.C87412m.m108594g(r2, r8)
            r8 = 0
            r9 = 1
            r0.<init>(r8, r9, r8)
            kt1.d r10 = kt1.C46744d.Disable
            r0.f173186j = r10
            r0.f173185i = r4
            ob0.c$b r10 = new ob0.c$b
            r10.<init>()
            r11 = 3565(0xded, float:4.996E-42)
            r10.f127069d = r11
            java.lang.String r12 = "/cgi-bin/micromsg-bin/findersync"
            r10.f127068c = r12
            java.lang.String r14 = "FinderLiveEntrance"
            java.lang.String r15 = ""
            java.lang.String r9 = "FinderEntrance"
            java.lang.String r13 = "Finder.NetSceneFinderSync"
            if (r5 != 0) goto L_0x0041
            r21 = r6
            r24 = r7
            r19 = r9
            r20 = r10
            goto L_0x04c6
        L_0x0041:
            di3.d r16 = di3.C86312j.m106911c(r7)
            com.tencent.mm.plugin.FinderCommonFeatureService r16 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r16
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r8 = r16.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r11 = r8.mo77227G5(r9)
            if (r11 == 0) goto L_0x005e
            te3.xi1 r11 = r11.field_ctrInfo
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r11.f144673h
            if (r11 != 0) goto L_0x005a
            r11 = r15
        L_0x005a:
            r5.f169843a = r11
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x005e:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r11 = r8.mo77227G5(r9)
            r18 = -1
            if (r11 == 0) goto L_0x00a2
            java.util.LinkedList<te3.xi1> r12 = r5.f169844b
            java.util.Iterator r12 = r12.iterator()
            r19 = 0
        L_0x006e:
            boolean r20 = r12.hasNext()
            if (r20 == 0) goto L_0x0092
            java.lang.Object r20 = r12.next()
            r21 = r12
            r12 = r20
            te3.xi1 r12 = (te3.C51978xi1) r12
            r20 = r10
            java.lang.String r10 = r11.field_tipsId
            java.lang.String r12 = r12.f144673h
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            int r19 = r19 + 1
            r10 = r20
            r12 = r21
            goto L_0x006e
        L_0x0092:
            r20 = r10
            r19 = -1
        L_0x0096:
            if (r19 >= 0) goto L_0x009f
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            te3.xi1 r11 = r11.field_ctrInfo
            r10.add(r11)
        L_0x009f:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x00a4
        L_0x00a2:
            r20 = r10
        L_0x00a4:
            java.lang.String r10 = "FinderMentionEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = r8.mo77227G5(r10)
            if (r10 == 0) goto L_0x00e6
            java.util.LinkedList<te3.xi1> r11 = r5.f169844b
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x00b3:
            boolean r19 = r11.hasNext()
            if (r19 == 0) goto L_0x00d7
            java.lang.Object r19 = r11.next()
            r21 = r11
            r11 = r19
            te3.xi1 r11 = (te3.C51978xi1) r11
            r19 = r9
            java.lang.String r9 = r10.field_tipsId
            java.lang.String r11 = r11.f144673h
            boolean r9 = gy3.C87412m.m108589b(r9, r11)
            if (r9 == 0) goto L_0x00d0
            goto L_0x00da
        L_0x00d0:
            int r12 = r12 + 1
            r9 = r19
            r11 = r21
            goto L_0x00b3
        L_0x00d7:
            r19 = r9
            r12 = -1
        L_0x00da:
            if (r12 >= 0) goto L_0x00e3
            java.util.LinkedList<te3.xi1> r9 = r5.f169844b
            te3.xi1 r10 = r10.field_ctrInfo
            r9.add(r10)
        L_0x00e3:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x00e8
        L_0x00e6:
            r19 = r9
        L_0x00e8:
            java.lang.String r9 = "TLFollow"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = r8.mo77227G5(r9)
            if (r9 == 0) goto L_0x0121
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x00f7:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0115
            java.lang.Object r12 = r10.next()
            te3.xi1 r12 = (te3.C51978xi1) r12
            r21 = r10
            java.lang.String r10 = r9.field_tipsId
            java.lang.String r12 = r12.f144673h
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            int r11 = r11 + 1
            r10 = r21
            goto L_0x00f7
        L_0x0115:
            r11 = -1
        L_0x0116:
            if (r11 >= 0) goto L_0x011f
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            te3.xi1 r9 = r9.field_ctrInfo
            r10.add(r9)
        L_0x011f:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x0121:
            java.lang.String r9 = "TLRecommendTab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = r8.mo77227G5(r9)
            if (r9 == 0) goto L_0x015a
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0130:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x014e
            java.lang.Object r12 = r10.next()
            te3.xi1 r12 = (te3.C51978xi1) r12
            r21 = r10
            java.lang.String r10 = r9.field_tipsId
            java.lang.String r12 = r12.f144673h
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x0149
            goto L_0x014f
        L_0x0149:
            int r11 = r11 + 1
            r10 = r21
            goto L_0x0130
        L_0x014e:
            r11 = -1
        L_0x014f:
            if (r11 >= 0) goto L_0x0158
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            te3.xi1 r9 = r9.field_ctrInfo
            r10.add(r9)
        L_0x0158:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x015a:
            java.lang.String r9 = "finder_tl_hot_tab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = r8.mo77227G5(r9)
            if (r9 == 0) goto L_0x0193
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0169:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0187
            java.lang.Object r12 = r10.next()
            te3.xi1 r12 = (te3.C51978xi1) r12
            r21 = r10
            java.lang.String r10 = r9.field_tipsId
            java.lang.String r12 = r12.f144673h
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x0182
            goto L_0x0188
        L_0x0182:
            int r11 = r11 + 1
            r10 = r21
            goto L_0x0169
        L_0x0187:
            r11 = -1
        L_0x0188:
            if (r11 >= 0) goto L_0x0191
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            te3.xi1 r9 = r9.field_ctrInfo
            r10.add(r9)
        L_0x0191:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x0193:
            java.lang.String r9 = "finder_tl_nearby_tab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r9 = r8.mo77227G5(r9)
            if (r9 == 0) goto L_0x01cc
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x01a2:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01c0
            java.lang.Object r12 = r10.next()
            te3.xi1 r12 = (te3.C51978xi1) r12
            r21 = r10
            java.lang.String r10 = r9.field_tipsId
            java.lang.String r12 = r12.f144673h
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x01bb
            goto L_0x01c1
        L_0x01bb:
            int r11 = r11 + 1
            r10 = r21
            goto L_0x01a2
        L_0x01c0:
            r11 = -1
        L_0x01c1:
            if (r11 >= 0) goto L_0x01ca
            java.util.LinkedList<te3.xi1> r10 = r5.f169844b
            te3.xi1 r9 = r9.field_ctrInfo
            r10.add(r9)
        L_0x01ca:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x01cc:
            up1.f r9 = up1.C37521f.f99374d
            r9.getClass()
            pe1.c<java.lang.String> r9 = up1.C37521f.f99361b4
            java.lang.Object r9 = r9.mo60266n()
            r21 = r9
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            java.lang.String r9 = ";"
            java.lang.String[] r22 = new java.lang.String[]{r9}
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            java.util.List r10 = z04.C112550d0.m153785U(r21, r22, r23, r24, r25, r26)
            java.util.Iterator r10 = r10.iterator()
        L_0x01f1:
            boolean r11 = r10.hasNext()
            java.lang.String r12 = " ctrlInfo="
            r21 = r6
            java.lang.String r6 = " isExist="
            if (r11 == 0) goto L_0x0289
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r22 = r10
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = r8.mo77227G5(r11)
            if (r10 == 0) goto L_0x027f
            java.util.LinkedList<te3.xi1> r2 = r5.f169844b
            java.util.Iterator r2 = r2.iterator()
            r23 = 0
        L_0x0213:
            boolean r24 = r2.hasNext()
            if (r24 == 0) goto L_0x0237
            java.lang.Object r24 = r2.next()
            r25 = r2
            r2 = r24
            te3.xi1 r2 = (te3.C51978xi1) r2
            r24 = r7
            java.lang.String r7 = r10.field_tipsId
            java.lang.String r2 = r2.f144673h
            boolean r2 = gy3.C87412m.m108589b(r7, r2)
            if (r2 == 0) goto L_0x0230
            goto L_0x023b
        L_0x0230:
            int r23 = r23 + 1
            r7 = r24
            r2 = r25
            goto L_0x0213
        L_0x0237:
            r24 = r7
            r23 = -1
        L_0x023b:
            if (r23 < 0) goto L_0x023f
            r2 = 1
            goto L_0x0240
        L_0x023f:
            r2 = 0
        L_0x0240:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = "[FINDER_REDDOT_SYNC_PATH_LIST] path="
            r7.append(r4)
            r7.append(r11)
            r7.append(r6)
            r7.append(r2)
            r7.append(r12)
            com.tencent.mm.plugin.finder.extension.reddot.q0 r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0.f158580a
            te3.xi1 r6 = r10.field_ctrInfo
            java.lang.String r4 = r4.mo77303e(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            if (r2 != 0) goto L_0x0271
            java.util.LinkedList<te3.xi1> r2 = r5.f169844b
            te3.xi1 r4 = r10.field_ctrInfo
            r2.add(r4)
        L_0x0271:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r2 = r33
            r4 = r36
            r6 = r21
            r10 = r22
            r7 = r24
            goto L_0x01f1
        L_0x027f:
            r2 = r33
            r4 = r36
            r6 = r21
            r10 = r22
            goto L_0x01f1
        L_0x0289:
            r24 = r7
            java.lang.String r2 = "NearbyEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r8.mo77227G5(r2)
            if (r4 == 0) goto L_0x02a0
            te3.xi1 r4 = r4.field_ctrInfo
            if (r4 == 0) goto L_0x02a0
            java.lang.String r4 = r4.f144673h
            if (r4 != 0) goto L_0x029c
            r4 = r15
        L_0x029c:
            r5.f169845c = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x02a0:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r8.mo77227G5(r14)
            if (r4 == 0) goto L_0x02b3
            te3.xi1 r4 = r4.field_ctrInfo
            if (r4 == 0) goto L_0x02b3
            java.lang.String r4 = r4.f144673h
            if (r4 != 0) goto L_0x02af
            r4 = r15
        L_0x02af:
            r5.f169845c = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x02b3:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r8.mo77227G5(r2)
            if (r2 == 0) goto L_0x02e6
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x02c0:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x02da
            java.lang.Object r10 = r4.next()
            te3.xi1 r10 = (te3.C51978xi1) r10
            java.lang.String r11 = r2.field_tipsId
            java.lang.String r10 = r10.f144673h
            boolean r10 = gy3.C87412m.m108589b(r11, r10)
            if (r10 == 0) goto L_0x02d7
            goto L_0x02db
        L_0x02d7:
            int r7 = r7 + 1
            goto L_0x02c0
        L_0x02da:
            r7 = -1
        L_0x02db:
            if (r7 >= 0) goto L_0x02e4
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            te3.xi1 r2 = r2.field_ctrInfo
            r4.add(r2)
        L_0x02e4:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x02e6:
            java.lang.String r2 = "NearbyFeedTab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r8.mo77227G5(r2)
            if (r2 == 0) goto L_0x031b
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x02f5:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x030f
            java.lang.Object r10 = r4.next()
            te3.xi1 r10 = (te3.C51978xi1) r10
            java.lang.String r11 = r2.field_tipsId
            java.lang.String r10 = r10.f144673h
            boolean r10 = gy3.C87412m.m108589b(r11, r10)
            if (r10 == 0) goto L_0x030c
            goto L_0x0310
        L_0x030c:
            int r7 = r7 + 1
            goto L_0x02f5
        L_0x030f:
            r7 = -1
        L_0x0310:
            if (r7 >= 0) goto L_0x0319
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            te3.xi1 r2 = r2.field_ctrInfo
            r4.add(r2)
        L_0x0319:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x031b:
            java.lang.String r2 = "NearbyLiveTab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r8.mo77227G5(r2)
            if (r2 == 0) goto L_0x0350
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x032a:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0344
            java.lang.Object r10 = r4.next()
            te3.xi1 r10 = (te3.C51978xi1) r10
            java.lang.String r11 = r2.field_tipsId
            java.lang.String r10 = r10.f144673h
            boolean r10 = gy3.C87412m.m108589b(r11, r10)
            if (r10 == 0) goto L_0x0341
            goto L_0x0345
        L_0x0341:
            int r7 = r7 + 1
            goto L_0x032a
        L_0x0344:
            r7 = -1
        L_0x0345:
            if (r7 >= 0) goto L_0x034e
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            te3.xi1 r2 = r2.field_ctrInfo
            r4.add(r2)
        L_0x034e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0350:
            java.lang.String r2 = "NearbyPeopleTab"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r8.mo77227G5(r2)
            if (r2 == 0) goto L_0x0385
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L_0x035f:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0379
            java.lang.Object r10 = r4.next()
            te3.xi1 r10 = (te3.C51978xi1) r10
            java.lang.String r11 = r2.field_tipsId
            java.lang.String r10 = r10.f144673h
            boolean r10 = gy3.C87412m.m108589b(r11, r10)
            if (r10 == 0) goto L_0x0376
            goto L_0x037a
        L_0x0376:
            int r7 = r7 + 1
            goto L_0x035f
        L_0x0379:
            r7 = -1
        L_0x037a:
            if (r7 >= 0) goto L_0x0383
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            te3.xi1 r2 = r2.field_ctrInfo
            r4.add(r2)
        L_0x0383:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0385:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.String> r2 = up1.C37521f.f99369c4
            java.lang.Object r2 = r2.mo60266n()
            r25 = r2
            java.lang.CharSequence r25 = (java.lang.CharSequence) r25
            java.lang.String[] r26 = new java.lang.String[]{r9}
            r27 = 0
            r28 = 0
            r29 = 6
            r30 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r25, r26, r27, r28, r29, r30)
            java.util.Iterator r2 = r2.iterator()
        L_0x03a8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x041d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.tencent.mm.plugin.finder.extension.reddot.s0 r7 = r8.mo77227G5(r4)
            if (r7 == 0) goto L_0x03a8
            java.util.LinkedList<te3.xi1> r9 = r5.f169846d
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x03c1:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x03df
            java.lang.Object r11 = r9.next()
            te3.xi1 r11 = (te3.C51978xi1) r11
            r22 = r2
            java.lang.String r2 = r7.field_tipsId
            java.lang.String r11 = r11.f144673h
            boolean r2 = gy3.C87412m.m108589b(r2, r11)
            if (r2 == 0) goto L_0x03da
            goto L_0x03e2
        L_0x03da:
            int r10 = r10 + 1
            r2 = r22
            goto L_0x03c1
        L_0x03df:
            r22 = r2
            r10 = -1
        L_0x03e2:
            if (r10 < 0) goto L_0x03e6
            r2 = 1
            goto L_0x03e7
        L_0x03e6:
            r2 = 0
        L_0x03e7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[FINDER_LIVE_REDDOT_SYNC_PATH_LIST] path="
            r9.append(r10)
            r9.append(r4)
            r9.append(r6)
            r9.append(r2)
            r9.append(r12)
            com.tencent.mm.plugin.finder.extension.reddot.q0 r4 = com.tencent.p014mm.plugin.finder.extension.reddot.C55716q0.f158580a
            te3.xi1 r10 = r7.field_ctrInfo
            java.lang.String r4 = r4.mo77303e(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            if (r2 != 0) goto L_0x0418
            java.util.LinkedList<te3.xi1> r2 = r5.f169846d
            te3.xi1 r4 = r7.field_ctrInfo
            r2.add(r4)
        L_0x0418:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r2 = r22
            goto L_0x03a8
        L_0x041d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "FINDER_REDDOT_SYNC_PATH_LIST="
            r2.append(r4)
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.String> r4 = up1.C37521f.f99361b4
            java.lang.Object r4 = r4.mo60266n()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = " FINDER_LIVE_REDDOT_SYNC_PATH_LIST="
            r2.append(r4)
            pe1.c<java.lang.String> r4 = up1.C37521f.f99369c4
            java.lang.Object r4 = r4.mo60266n()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[fillRedDotArgs] finderCtrlInfoList="
            r2.append(r4)
            java.util.LinkedList<te3.xi1> r4 = r5.f169844b
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = sx3.C36907w.m41090l(r4, r7)
            r6.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x0469:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x047b
            java.lang.Object r7 = r4.next()
            te3.xi1 r7 = (te3.C51978xi1) r7
            java.lang.String r7 = r7.f144673h
            r6.add(r7)
            goto L_0x0469
        L_0x047b:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[fillRedDotArgs] nearbyCtrlInfoList="
            r2.append(r4)
            java.util.LinkedList<te3.xi1> r4 = r5.f169846d
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = sx3.C36907w.m41090l(r4, r7)
            r6.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x04a0:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x04b2
            java.lang.Object r7 = r4.next()
            te3.xi1 r7 = (te3.C51978xi1) r7
            java.lang.String r7 = r7.f144673h
            r6.add(r7)
            goto L_0x04a0
        L_0x04b2:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.util.LinkedList<te3.xi1> r2 = r5.f169844b
            r0.mo85727m1(r2)
            java.util.LinkedList<te3.xi1> r2 = r5.f169846d
            r0.mo85727m1(r2)
        L_0x04c6:
            te3.zm1 r2 = new te3.zm1
            r2.<init>()
            r2.f186709d = r3
            r2.f186713h = r1
            te3.qv3 r4 = sf0.C48374j0.m53712a(r34)
            r2.f186710e = r4
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC
            java.lang.String r4 = r4.mo119675I(r6, r15)
            pe3.b r6 = new pe3.b
            byte[] r4 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r4)
            r6.<init>(r4)
            r2.f186708A = r6
            je1.h2 r4 = je1.C46523h2.f125330a
            if (r5 == 0) goto L_0x04f5
            te3.hj1 r6 = r5.f169847e
            goto L_0x04f6
        L_0x04f5:
            r6 = 0
        L_0x04f6:
            r7 = 3565(0xded, float:4.996E-42)
            te3.ig0 r4 = r4.mo71860b(r7, r6)
            r2.f186714i = r4
            r7 = r36
            switch(r7) {
                case 1: goto L_0x0536;
                case 2: goto L_0x0534;
                case 3: goto L_0x0532;
                case 4: goto L_0x0534;
                case 5: goto L_0x0530;
                case 6: goto L_0x0530;
                case 7: goto L_0x052e;
                case 8: goto L_0x052c;
                case 9: goto L_0x052a;
                case 10: goto L_0x0527;
                case 11: goto L_0x0524;
                case 12: goto L_0x0521;
                case 13: goto L_0x051e;
                case 14: goto L_0x051b;
                case 15: goto L_0x0518;
                case 16: goto L_0x0515;
                case 17: goto L_0x0512;
                case 18: goto L_0x050f;
                case 19: goto L_0x050c;
                case 20: goto L_0x0509;
                default: goto L_0x0503;
            }
        L_0x0503:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r7 < r6) goto L_0x0902
            r6 = r7
            goto L_0x0537
        L_0x0509:
            r6 = 18
            goto L_0x0537
        L_0x050c:
            r6 = 17
            goto L_0x0537
        L_0x050f:
            r6 = 16
            goto L_0x0537
        L_0x0512:
            r6 = 15
            goto L_0x0537
        L_0x0515:
            r6 = 14
            goto L_0x0537
        L_0x0518:
            r6 = 13
            goto L_0x0537
        L_0x051b:
            r6 = 12
            goto L_0x0537
        L_0x051e:
            r6 = 11
            goto L_0x0537
        L_0x0521:
            r6 = 10
            goto L_0x0537
        L_0x0524:
            r6 = 9
            goto L_0x0537
        L_0x0527:
            r6 = 8
            goto L_0x0537
        L_0x052a:
            r6 = 7
            goto L_0x0537
        L_0x052c:
            r6 = 6
            goto L_0x0537
        L_0x052e:
            r6 = 1
            goto L_0x0537
        L_0x0530:
            r6 = 4
            goto L_0x0537
        L_0x0532:
            r6 = 3
            goto L_0x0537
        L_0x0534:
            r6 = 2
            goto L_0x0537
        L_0x0536:
            r6 = 5
        L_0x0537:
            r4.f135313e = r6
            te3.ow r4 = r4.f135316h
            if (r4 == 0) goto L_0x0540
            java.lang.String r4 = r4.f139398f
            goto L_0x0541
        L_0x0540:
            r4 = 0
        L_0x0541:
            if (r4 == 0) goto L_0x054c
            int r4 = r4.length()
            if (r4 != 0) goto L_0x054a
            goto L_0x054c
        L_0x054a:
            r4 = 0
            goto L_0x054d
        L_0x054c:
            r4 = 1
        L_0x054d:
            if (r4 == 0) goto L_0x059f
            te3.ig0 r4 = r2.f186714i
            if (r4 == 0) goto L_0x0556
            te3.ow r6 = r4.f135316h
            goto L_0x0557
        L_0x0556:
            r6 = 0
        L_0x0557:
            if (r6 != 0) goto L_0x0563
            if (r4 != 0) goto L_0x055c
            goto L_0x0563
        L_0x055c:
            te3.ow r6 = new te3.ow
            r6.<init>()
            r4.f135316h = r6
        L_0x0563:
            java.lang.Class<h81.i> r4 = h81.C59774i.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.i r4 = (h81.C59774i) r4
            java.lang.String r4 = r4.mo84751Wb()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r8 = "sessionId"
            r6.put(r8, r4)
            te3.ig0 r8 = r2.f186714i
            if (r8 == 0) goto L_0x0581
            te3.ow r8 = r8.f135316h
            goto L_0x0582
        L_0x0581:
            r8 = 0
        L_0x0582:
            if (r8 != 0) goto L_0x0585
            goto L_0x058b
        L_0x0585:
            java.lang.String r6 = r6.toString()
            r8.f139398f = r6
        L_0x058b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "NetSceneFinderSync init put sessionId = "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
        L_0x059f:
            bl3.r r4 = bl3.C39818r.f106831a
            r6 = r24
            bl3.r$a r4 = r4.mo62446e(r6)
            java.util.LinkedList<java.lang.String> r6 = r2.f186726x
            r8 = r33
            r6.addAll(r8)
            if (r5 == 0) goto L_0x05b3
            java.lang.String r6 = r5.f169843a
            goto L_0x05b4
        L_0x05b3:
            r6 = 0
        L_0x05b4:
            r2.f186717o = r6
            if (r5 == 0) goto L_0x05bb
            java.util.LinkedList<te3.xi1> r6 = r5.f169844b
            goto L_0x05bc
        L_0x05bb:
            r6 = 0
        L_0x05bc:
            r2.f186716n = r6
            if (r5 == 0) goto L_0x05c3
            java.lang.String r6 = r5.f169845c
            goto L_0x05c4
        L_0x05c3:
            r6 = 0
        L_0x05c4:
            r2.f186719q = r6
            if (r5 == 0) goto L_0x05cb
            java.util.LinkedList<te3.xi1> r5 = r5.f169846d
            goto L_0x05cc
        L_0x05cb:
            r5 = 0
        L_0x05cc:
            r2.f186718p = r5
            java.lang.Class<os1.f> r5 = os1.C11739f.class
            androidx.lifecycle.i0 r5 = r4.mo75002a(r5)
            os1.f r5 = (os1.C11739f) r5
            int r5 = r5.f34363j
            r2.f186720r = r5
            te3.mm1 r5 = new te3.mm1
            r5.<init>()
            er1.w3 r6 = er1.C58784w3.f168295a
            r6.getClass()
            er1.r3 r9 = er1.C7865r3.f26468a
            int r9 = r9.mo8970c()
            android.content.res.Resources r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r11 = 2131825947(0x7f11151b, float:1.9284765E38)
            java.lang.String r11 = r10.getString(r11)
            java.lang.String r12 = "resources.getString(com.…g.find_friends_by_finder)"
            gy3.C87412m.m108593f(r11, r12)
            android.text.TextPaint r12 = new android.text.TextPaint
            r12.<init>()
            r15 = 2131165203(0x7f070013, float:1.7944616E38)
            float r15 = r6.mo83953o0(r15)
            r12.setTextSize(r15)
            float r11 = r12.measureText(r11)
            float r9 = (float) r9
            float r9 = r9 - r11
            r12 = 2131165299(0x7f070073, float:1.7944811E38)
            float r10 = r10.getDimension(r12)
            float r9 = r9 - r10
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r12 = 2131165645(0x7f0701cd, float:1.7945513E38)
            float r6 = r6.mo83953o0(r12)
            r10.setTextSize(r6)
            java.lang.String r6 = "我"
            float r6 = r10.measureText(r6)
            float r10 = r9 / r6
            int r10 = (int) r10
            java.lang.String r12 = er1.C58784w3.f168296b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "measureSingleLineMaxWords maxWords:"
            r15.append(r8)
            r15.append(r10)
            java.lang.String r8 = " titleWidth:"
            r15.append(r8)
            r15.append(r11)
            java.lang.String r8 = " wordWith:"
            r15.append(r8)
            r15.append(r6)
            java.lang.String r6 = " availableWidth:"
            r15.append(r6)
            r15.append(r9)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "count2: "
            r6.append(r8)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            int r6 = r10 * 2
            r5.f184355d = r6
            r5.f184356e = r10
            r2.f186724v = r5
            te3.nm1 r5 = new te3.nm1
            r5.<init>()
            di3.d r6 = di3.C86312j.m106911c(r21)
            gh0.b r6 = (gh0.C59438b) r6
            boolean r6 = r6.i10()
            r5.f184495d = r6
            java.lang.Class<os1.m> r6 = os1.C62163m.class
            androidx.lifecycle.i0 r6 = r4.mo75002a(r6)
            os1.m r6 = (os1.C62163m) r6
            boolean r8 = r6.mo87214j3()
            if (r8 != 0) goto L_0x069c
            r8 = 0
            r9 = 0
            goto L_0x06c9
        L_0x069c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[getRedDotSession] syncLocalScene="
            r8.append(r9)
            r8.append(r7)
            r9 = 32
            r8.append(r9)
            te3.vp3 r9 = r6.f176738f
            if (r9 == 0) goto L_0x06b7
            java.lang.String r9 = os1.C62164n.m73026b(r9)
            goto L_0x06b8
        L_0x06b7:
            r9 = 0
        L_0x06b8:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Finder.RedDotSessionVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            te3.vp3 r8 = r6.f176738f
            r9 = 0
            r6.f176738f = r9
        L_0x06c9:
            r5.f184496e = r8
            r2.f186725w = r5
            di3.d r5 = di3.C86312j.m106911c(r21)
            gh0.b r5 = (gh0.C59438b) r5
            java.lang.String r5 = r5.mo22079Le()
            r2.f186721s = r5
            java.lang.Class<bh3.k> r5 = bh3.C113177k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            bh3.k r5 = (bh3.C113177k) r5
            bh3.k$b r6 = bh3.C113177k.C113179b.LOCAION
            bh3.k$a r8 = bh3.C113177k.C113178a.FINDER
            boolean r5 = r5.w00(r6, r8)
            rx3.l r6 = new rx3.l
            r8 = 0
            java.lang.Float r10 = java.lang.Float.valueOf(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r6.<init>(r10, r8)
            java.lang.Class<os1.d> r8 = os1.C62153d.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r8)
            java.lang.String r8 = "featureService.get(Finde…alLocationVM::class.java)"
            gy3.C87412m.m108593f(r4, r8)
            os1.d r4 = (os1.C62153d) r4
            if (r5 == 0) goto L_0x072b
            boolean r5 = r4.mo9103H()
            if (r5 == 0) goto L_0x072b
            rx3.l r6 = r4.mo9104X0()
            te3.ti0 r4 = new te3.ti0
            r4.<init>()
            A r5 = r6.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r4.f142237d = r5
            B r5 = r6.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r4.f142238e = r5
            r2.f186727y = r4
        L_0x072b:
            nt1.a r4 = nt1.C61894a.f175995a
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            te3.i90 r5 = nt1.C61894a.f175997c
            long r10 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r16
            int r8 = (int) r10
            r5.f183640g = r8
            di3.d r8 = di3.C86312j.m106911c(r4)
            ht1.t1 r8 = (ht1.C60200t1) r8
            ht1.b4 r8 = r8.Nt0()
            r10 = r19
            te3.nn1 r8 = r8.mo77246R5(r10)
            te3.aa0 r10 = r5.f183638e
            if (r10 != 0) goto L_0x0751
            goto L_0x0758
        L_0x0751:
            if (r8 != 0) goto L_0x0755
            r8 = 0
            goto L_0x0756
        L_0x0755:
            r8 = 1
        L_0x0756:
            r10.f182041d = r8
        L_0x0758:
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.b4 r4 = r4.Nt0()
            te3.nn1 r4 = r4.mo77246R5(r14)
            te3.aa0 r8 = r5.f183639f
            if (r8 != 0) goto L_0x076b
            goto L_0x0772
        L_0x076b:
            if (r4 != 0) goto L_0x076f
            r4 = 0
            goto L_0x0770
        L_0x076f:
            r4 = 1
        L_0x0770:
            r8.f182041d = r4
        L_0x0772:
            te3.aa0 r4 = r5.f183637d
            if (r4 != 0) goto L_0x0777
            goto L_0x077b
        L_0x0777:
            boolean r8 = nt1.C61894a.f175996b
            r4.f182041d = r8
        L_0x077b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "[take#"
            r4.append(r8)
            r4.append(r7)
            java.lang.String r8 = "] "
            r4.append(r8)
            int r8 = r5.f183640g
            r4.append(r8)
            java.lang.String r8 = " sns="
            r4.append(r8)
            te3.aa0 r8 = r5.f183637d
            if (r8 == 0) goto L_0x07a0
            java.lang.String r8 = nt1.C61897b.m72631a(r8)
            goto L_0x07a1
        L_0x07a0:
            r8 = r9
        L_0x07a1:
            r4.append(r8)
            java.lang.String r8 = " live="
            r4.append(r8)
            te3.aa0 r8 = r5.f183639f
            if (r8 == 0) goto L_0x07b2
            java.lang.String r8 = nt1.C61897b.m72631a(r8)
            goto L_0x07b3
        L_0x07b2:
            r8 = r9
        L_0x07b3:
            r4.append(r8)
            java.lang.String r8 = " finder="
            r4.append(r8)
            te3.aa0 r8 = r5.f183638e
            if (r8 == 0) goto L_0x07c4
            java.lang.String r8 = nt1.C61897b.m72631a(r8)
            goto L_0x07c5
        L_0x07c4:
            r8 = r9
        L_0x07c5:
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "FindMoreFriendEntranceExpose"
            com.tencent.stubs.logger.Log.m106505i(r8, r4)
            te3.i90 r4 = new te3.i90
            r4.<init>()
            te3.aa0 r8 = new te3.aa0
            r8.<init>()
            r4.f183637d = r8
            te3.aa0 r8 = new te3.aa0
            r8.<init>()
            r4.f183639f = r8
            te3.aa0 r8 = new te3.aa0
            r8.<init>()
            r4.f183638e = r8
            te3.aa0 r8 = r4.f183637d
            if (r8 != 0) goto L_0x07f0
            goto L_0x0804
        L_0x07f0:
            te3.i90 r10 = nt1.C61894a.f175997c
            te3.aa0 r10 = r10.f183637d
            if (r10 == 0) goto L_0x07fd
            long r10 = r10.f182045h
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x07fe
        L_0x07fd:
            r10 = r9
        L_0x07fe:
            long r10 = r10.longValue()
            r8.f182045h = r10
        L_0x0804:
            te3.aa0 r8 = r4.f183638e
            if (r8 != 0) goto L_0x0809
            goto L_0x081d
        L_0x0809:
            te3.i90 r10 = nt1.C61894a.f175997c
            te3.aa0 r10 = r10.f183638e
            if (r10 == 0) goto L_0x0816
            long r10 = r10.f182045h
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x0817
        L_0x0816:
            r10 = r9
        L_0x0817:
            long r10 = r10.longValue()
            r8.f182045h = r10
        L_0x081d:
            te3.aa0 r8 = r4.f183639f
            if (r8 != 0) goto L_0x0822
            goto L_0x0836
        L_0x0822:
            te3.i90 r10 = nt1.C61894a.f175997c
            te3.aa0 r10 = r10.f183639f
            if (r10 == 0) goto L_0x082f
            long r10 = r10.f182045h
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x0830
        L_0x082f:
            r10 = r9
        L_0x0830:
            long r10 = r10.longValue()
            r8.f182045h = r10
        L_0x0836:
            nt1.C61894a.f175997c = r4
            r2.f186728z = r5
            te3.an1 r4 = new te3.an1
            r4.<init>()
            te3.ja r5 = new te3.ja
            r5.<init>()
            r4.setBaseResponse(r5)
            r5 = r20
            r5.f127066a = r2
            r5.f127067b = r4
            ob0.c r4 = r5.mo72403a()
            r0.f173183g = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneFinderSync init selector="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " scene="
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = " username="
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = " multiFinderUsernames="
            r4.append(r1)
            r1 = r33
            r4.append(r1)
            java.lang.String r1 = " ctrlInfo type="
            r4.append(r1)
            java.util.LinkedList<te3.xi1> r1 = r2.f186716n
            java.lang.String r3 = "request.ctrlInfoList"
            gy3.C87412m.m108593f(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0895:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x08a7
            java.lang.Object r5 = r1.next()
            te3.xi1 r5 = (te3.C51978xi1) r5
            java.lang.String r5 = r5.f144673h
            r3.add(r5)
            goto L_0x0895
        L_0x08a7:
            r4.append(r3)
            java.lang.String r1 = " entranceTipsId="
            r4.append(r1)
            java.lang.String r1 = r2.f186717o
            r4.append(r1)
            java.lang.String r1 = " stay_display_tab_type="
            r4.append(r1)
            int r1 = r2.f186720r
            r4.append(r1)
            java.lang.String r1 = " request.client_ai_info="
            r4.append(r1)
            java.lang.String r1 = r2.f186721s
            if (r1 == 0) goto L_0x08d0
            int r1 = r1.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L_0x08d1
        L_0x08d0:
            r8 = r9
        L_0x08d1:
            r4.append(r8)
            java.lang.String r1 = " hasDiscoveryRedDot = "
            r4.append(r1)
            te3.nm1 r1 = r2.f186725w
            gy3.C87412m.m108591d(r1)
            boolean r1 = r1.f184495d
            r4.append(r1)
            java.lang.String r1 = " reddot_session = "
            r4.append(r1)
            te3.nm1 r1 = r2.f186725w
            gy3.C87412m.m108591d(r1)
            te3.vp3 r1 = r1.f184496e
            r4.append(r1)
            java.lang.String r1 = " location="
            r4.append(r1)
            r4.append(r6)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            return
        L_0x0902:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unknown this localScene("
            r2.append(r3)
            r2.append(r7)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60804m4.<init>(java.lang.String, java.util.List, byte[], int, int, gf1.i$a):void");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f173186j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173184h = nVar;
        return dispatch(gVar, this.f173183g, this);
    }

    public int getType() {
        return 3565;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C50821pf1> linkedList;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C114799u uVar2 = uVar;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC;
        Log.m105924i("Finder.NetSceneFinderSync", "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        C87412m.m108592e(uVar2, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47350c cVar = (C47350c) uVar2;
        C47465a aVar2 = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        C64233an1 an12 = (C64233an1) aVar2;
        if (i4 >= 4) {
            this.f173186j = C46744d.Default;
        }
        if (i4 == 0 && i5 == 0) {
            C89349b bVar = an12.f182092p;
            if (bVar != null) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Util.encodeHexString(bVar.f257327a));
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            }
            C117407d.INSTANCE.idkeyStat(1279, 11, 1, false);
            C64259bh0 bh02 = an12.f182090n;
            if (bh02 != null) {
                Log.m105924i("Finder.NetSceneFinderSync", "[onGYNetEnd] check_expire_info=" + C60805n4.m71188a(bh02));
                if (bh02.f182286d == 1) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, Util.encodeHexString(bh02.toByteArray()));
                }
            }
            C52252ze1 ze12 = an12.f182093q;
            if (!(ze12 == null || (linkedList = ze12.f145850d) == null)) {
                ArrayList<FinderObject> arrayList = new ArrayList<>();
                for (C50821pf1 pf12 : linkedList) {
                    FinderObject finderObject = pf12.f139743d;
                    if (finderObject != null) {
                        arrayList.add(finderObject);
                    }
                }
                for (FinderObject finderObject2 : arrayList) {
                    C65834e eVar = C65834e.f189316a;
                    FinderItem.C56324a aVar3 = FinderItem.Companion;
                    C87412m.m108593f(finderObject2, LocaleUtil.ITALIAN);
                    FinderItem a = aVar3.mo79056a(finderObject2, 0);
                    C47465a aVar4 = cVar.f127055a.f127080a;
                    C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
                    C49842ig0 ig02 = ((C64884zm1) aVar4).f186714i;
                    eVar.mo89878l(a, new C65834e.C65835a(3565, ig02 != null ? ig02.f135317i : 0));
                }
            }
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 12, 1, false);
        }
        C11385n nVar = this.f173184h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* renamed from: l1 */
    public final int mo85726l1() {
        C47465a aVar = this.f173183g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        return ((C64233an1) aVar).f182084e;
    }

    /* renamed from: m1 */
    public final void mo85727m1(LinkedList<C51978xi1> linkedList) {
        LinkedList linkedList2 = new LinkedList();
        for (C51978xi1 xi12 : linkedList) {
            C89349b bVar = xi12.f144684v;
            if (bVar != null) {
                C51978xi1 xi13 = new C51978xi1();
                xi13.f144684v = bVar;
                LinkedList<C64586nn1> linkedList3 = xi12.f144672g;
                C87412m.m108593f(linkedList3, "ctrlInfo.show_infos");
                for (C64586nn1 nn12 : linkedList3) {
                    LinkedList<C64586nn1> linkedList4 = xi13.f144672g;
                    C64586nn1 nn13 = new C64586nn1();
                    nn13.f184507i = nn12.f184507i;
                    linkedList4.add(nn13);
                }
                linkedList2.add(xi13);
                Log.m105924i("Finder.NetSceneFinderSync", "[optCtrlInfoReport] " + C55716q0.f158580a.mo77303e(xi13));
            } else {
                linkedList2.add(xi12);
            }
        }
        linkedList.clear();
        linkedList.addAll(linkedList2);
    }
}
