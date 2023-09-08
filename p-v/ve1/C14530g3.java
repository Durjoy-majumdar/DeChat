package ve1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import pf1.C11929x;

/* renamed from: ve1.g3 */
public final class C14530g3 implements C11929x {

    /* renamed from: a */
    public final /* synthetic */ BaseFinderFeed f40277a;

    public C14530g3(BaseFinderFeed baseFinderFeed) {
        this.f40277a = baseFinderFeed;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x006a A[EDGE_INSN: B:57:0x006a->B:22:0x006a ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2364a(int r13, java.util.List<? extends com.tencent.p014mm.protocal.protobuf.FinderJumpInfo> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "list"
            gy3.C87412m.m108594g(r14, r0)
            pf1.d0 r0 = pf1.C62262d0.f176978a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r12.f40277a
            r0.getClass()
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r1, r0)
            java.util.Iterator r0 = r14.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r0.next()
            r6 = r2
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r6
            pf1.d0 r7 = pf1.C62262d0.f176978a
            r7.getClass()
            java.lang.String r7 = "info"
            gy3.C87412m.m108594g(r6, r7)
            int r7 = r6.business_type
            r8 = 8
            if (r7 != r8) goto L_0x0065
            java.util.LinkedList<te3.uc4> r6 = r6.style
            java.lang.String r7 = "info.style"
            gy3.C87412m.m108593f(r6, r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0043
            goto L_0x0060
        L_0x0043:
            java.util.Iterator r6 = r6.iterator()
        L_0x0047:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r6.next()
            te3.uc4 r7 = (te3.uc4) r7
            int r7 = r7.f142760f
            r8 = 11
            if (r7 != r8) goto L_0x005b
            r7 = 1
            goto L_0x005c
        L_0x005b:
            r7 = 0
        L_0x005c:
            if (r7 == 0) goto L_0x0047
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            if (r6 == 0) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            if (r6 == 0) goto L_0x0015
            goto L_0x006a
        L_0x0069:
            r2 = r3
        L_0x006a:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r2
            if (r2 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            org.json.JSONObject r6 = r1.mo3471E()
            r7 = -1
            java.lang.String r8 = "if_red_packet"
            int r6 = r6.optInt(r8, r7)
            if (r6 != r4) goto L_0x0081
            if (r0 != 0) goto L_0x0081
            r0 = r6
        L_0x0081:
            java.lang.String r4 = "coverid"
            if (r2 == 0) goto L_0x00ad
            pf1.d0 r7 = pf1.C62262d0.f176978a
            r7.getClass()
            java.lang.String r2 = r2.report_info
            if (r2 == 0) goto L_0x00ad
            byte[] r2 = android.util.Base64.decode(r2, r5)
            java.lang.String r5 = "decode(it, Base64.DEFAULT)"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r7 = z04.C119027c.f356488a
            r5.<init>(r2, r7)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ad }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r2 = r2.optString(r4)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r5 = "coverId"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00af
        L_0x00ad:
            java.lang.String r2 = ""
        L_0x00af:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[addRedPacketCoverReportInfo] "
            r5.append(r7)
            long r9 = r1.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r9)
            r5.append(r7)
            r7 = 32
            r5.append(r7)
            fe1.q r7 = r1.mo3507l()
            if (r7 == 0) goto L_0x00d4
            java.lang.String r7 = r7.getNickname()
            goto L_0x00d5
        L_0x00d4:
            r7 = r3
        L_0x00d5:
            r5.append(r7)
            java.lang.String r7 = " position="
            r5.append(r7)
            r5.append(r13)
            java.lang.String r13 = " last:"
            r5.append(r13)
            r5.append(r6)
            java.lang.String r13 = " ifRedPacket:"
            r5.append(r13)
            r5.append(r0)
            java.lang.String r13 = " coverId:"
            r5.append(r13)
            r5.append(r2)
            java.lang.String r13 = " list="
            r5.append(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r6 = 10
            int r6 = sx3.C36907w.m41090l(r14, r6)
            r13.<init>(r6)
            java.util.Iterator r14 = r14.iterator()
        L_0x010c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x0164
            java.lang.Object r6 = r14.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r9 = r6.business_type
            r7.append(r9)
            java.lang.String r9 = " -> "
            r7.append(r9)
            java.util.LinkedList<te3.uc4> r10 = r6.style
            java.lang.String r11 = "it.style"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            te3.uc4 r10 = (te3.uc4) r10
            if (r10 == 0) goto L_0x013d
            int r10 = r10.f142760f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x013e
        L_0x013d:
            r10 = r3
        L_0x013e:
            r7.append(r10)
            r7.append(r9)
            java.util.LinkedList<te3.uc4> r6 = r6.style
            gy3.C87412m.m108593f(r6, r11)
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            te3.uc4 r6 = (te3.uc4) r6
            if (r6 == 0) goto L_0x0158
            int r6 = r6.f142762h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0159
        L_0x0158:
            r6 = r3
        L_0x0159:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r13.add(r6)
            goto L_0x010c
        L_0x0164:
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            java.lang.String r14 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            org.json.JSONObject r13 = r1.mo3471E()
            r13.put(r8, r0)
            org.json.JSONObject r13 = r1.mo3471E()
            r13.put(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14530g3.mo2364a(int, java.util.List):void");
    }
}
