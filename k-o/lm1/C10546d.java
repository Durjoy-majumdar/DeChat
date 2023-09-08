package lm1;

import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jp3.C46566c;
import jp3.C9486a;
import lm1.C10542a;
import ln1.C21445b;
import nn1.C11233b;
import te3.C49712hj1;

/* renamed from: lm1.d */
public final class C10546d extends SupportLifecycle implements C10542a.C10543a {

    /* renamed from: g */
    public final C49712hj1 f31823g;

    /* renamed from: h */
    public C46566c<C9486a> f31824h = new C46566c<>();

    /* renamed from: i */
    public C10547a f31825i;

    /* renamed from: lm1.d$a */
    public interface C10547a {
        /* renamed from: a */
        void mo3601a(NearbyLiveFeedLoader.C3278d dVar, NearbyLiveFeedLoader.C3277c cVar);
    }

    public C10546d(C49712hj1 hj12) {
        this.f31823g = hj12;
    }

    /* JADX WARNING: type inference failed for: r3v32, types: [kf1.zb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10814N0(int r29, int r30, java.lang.String r31, te3.C50026jr0 r32, com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.C3277c r33, te3.C90420iq r34) {
        /*
            r28 = this;
            r0 = r28
            r1 = r32
            r2 = r33
            java.lang.String r3 = "resp"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "request"
            gy3.C87412m.m108594g(r2, r3)
            nn1.b$a r3 = nn1.C11233b.f33100i
            int r4 = r2.f15563d
            nn1.b r3 = r3.mo11311a(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r3.f33106e = r4
            ln1.b r3 = ln1.C21445b.f60694a
            int r4 = r2.f15564e
            pe3.b r5 = r1.f136272n
            r6 = r34
            r3.mo33616e(r4, r5, r6)
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d r3 = new com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d
            r10 = 0
            r11 = 0
            r12 = 24
            r13 = 0
            r6 = r3
            r7 = r29
            r8 = r30
            r9 = r31
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            if (r29 != 0) goto L_0x0463
            if (r30 != 0) goto L_0x0463
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r1.f136265d
            java.lang.String r6 = "resp.`object`"
            gy3.C87412m.m108593f(r5, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x004e:
            boolean r8 = r5.hasNext()
            java.lang.String r9 = "Finder.FinderLiveFriendsFeedFetcher"
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r5.next()
            r10 = r8
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
            er1.w3 r11 = er1.C58784w3.f168295a
            java.lang.String r12 = "it"
            gy3.C87412m.m108593f(r10, r12)
            boolean r9 = r11.mo83863D0(r10, r9)
            if (r9 == 0) goto L_0x004e
            r7.add(r8)
            goto L_0x004e
        L_0x006e:
            int r5 = r7.size()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r1.f136265d
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x00a0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "[onCgiBack] has filter some feed. valid="
            r5.append(r8)
            int r8 = r7.size()
            r5.append(r8)
            java.lang.String r8 = " raw="
            r5.append(r8)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r1.f136265d
            int r8 = r8.size()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r5)
        L_0x00a0:
            wp1.f$a r5 = wp1.C15585f.f42211a
            er1.w3 r8 = er1.C58784w3.f168295a
            int r10 = r2.f15564e
            int r8 = r8.mo83887M1(r10)
            te3.hj1 r10 = r0.f31823g
            java.util.List r5 = r5.mo14343f(r7, r8, r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r5, r8)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x00bf:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r8 = r5.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r8
            wp1.f$a r10 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r10.mo14348k(r8)
            r7.add(r8)
            goto L_0x00bf
        L_0x00d5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r7)
            ln1.e r7 = ln1.C10583e.f31911a
            int r8 = r2.f15565f
            r7.mo10840h(r8, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "incrementList size: "
            r7.append(r8)
            java.util.List r8 = r3.getIncrementList()
            if (r8 == 0) goto L_0x00fa
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00fb
        L_0x00fa:
            r8 = 0
        L_0x00fb:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            te3.tl1 r7 = r1.f136269h
            if (r7 == 0) goto L_0x042d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r11 = r1.f136265d
            gy3.C87412m.m108593f(r11, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r12 = r5.size()
            java.util.LinkedList<java.lang.Long> r13 = r7.f142277f
            int r13 = r13.size()
            java.lang.String r14 = " layoutInfo size:"
            if (r12 != r13) goto L_0x0143
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "handleLayoutInfo return for incrementList:"
            r6.append(r10)
            int r10 = r5.size()
            r6.append(r10)
            r6.append(r14)
            java.util.LinkedList<java.lang.Long> r7 = r7.f142277f
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            goto L_0x042d
        L_0x0143:
            java.util.LinkedList<java.lang.Long> r12 = r7.f142277f
            java.lang.String r13 = "layoutInfo.layoutIds"
            gy3.C87412m.m108593f(r12, r13)
            java.util.Iterator r12 = r12.iterator()
            r8 = 0
            r10 = 0
            r13 = 0
            r15 = 0
        L_0x0152:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x03cf
            java.lang.Object r16 = r12.next()
            r4 = r16
            java.lang.Long r4 = (java.lang.Long) r4
            java.util.Iterator r16 = r5.iterator()
        L_0x0164:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0189
            java.lang.Object r17 = r16.next()
            r18 = r17
            cm1.i2 r18 = (cm1.C0740i2) r18
            long r18 = r18.getItemId()
            if (r4 != 0) goto L_0x0179
            goto L_0x0184
        L_0x0179:
            long r20 = r4.longValue()
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 != 0) goto L_0x0184
            r18 = 1
            goto L_0x0186
        L_0x0184:
            r18 = 0
        L_0x0186:
            if (r18 == 0) goto L_0x0164
            goto L_0x018b
        L_0x0189:
            r17 = 0
        L_0x018b:
            cm1.i2 r17 = (cm1.C0740i2) r17
            if (r17 == 0) goto L_0x0191
            int r13 = r13 + 1
        L_0x0191:
            r34 = r12
            java.lang.String r12 = "handleLayoutInfo find divider: id:"
            r16 = r13
            java.lang.String r13 = " type:"
            if (r17 != 0) goto L_0x028e
            java.util.LinkedList<te3.z81> r1 = r7.f142278g
            int r1 = r1.size()
            if (r1 == 0) goto L_0x028e
            java.util.LinkedList<te3.z81> r1 = r7.f142278g
            java.lang.String r2 = "layoutInfo.live_card"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x01ae:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d7
            java.lang.Object r2 = r1.next()
            r17 = r1
            r1 = r2
            te3.z81 r1 = (te3.C52231z81) r1
            r18 = r2
            long r1 = r1.f145754d
            if (r4 != 0) goto L_0x01c4
            goto L_0x01ce
        L_0x01c4:
            long r19 = r4.longValue()
            int r21 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r21 != 0) goto L_0x01ce
            r1 = 1
            goto L_0x01cf
        L_0x01ce:
            r1 = 0
        L_0x01cf:
            if (r1 == 0) goto L_0x01d4
            r2 = r18
            goto L_0x01d8
        L_0x01d4:
            r1 = r17
            goto L_0x01ae
        L_0x01d7:
            r2 = 0
        L_0x01d8:
            te3.z81 r2 = (te3.C52231z81) r2
            if (r2 == 0) goto L_0x024d
            te3.hj1 r1 = r0.f31823g
            int r0 = r2.f145755e
            r18 = r3
            r3 = 2
            if (r0 != r3) goto L_0x0225
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r2.f145756f
            if (r0 == 0) goto L_0x0225
            an1.c r3 = new an1.c
            r26 = r11
            wp1.f$a r11 = wp1.C15585f.f42211a
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            r27 = r14
            r14 = 0
            java.util.List r0 = r11.mo14343f(r0, r14, r1)
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            r20 = r0
            com.tencent.mm.plugin.finder.storage.FinderItem r20 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r20
            te3.a91 r21 = new te3.a91
            r21.<init>()
            r22 = 1
            te3.fg0 r0 = r2.f145761n
            if (r0 == 0) goto L_0x0212
            java.lang.String r1 = r0.f133486d
            r23 = r1
            goto L_0x0214
        L_0x0212:
            r23 = 0
        L_0x0214:
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = r0.f133487e
            r24 = r0
            goto L_0x021d
        L_0x021b:
            r24 = 0
        L_0x021d:
            r25 = 2022(0x7e6, float:2.833E-42)
            r19 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25)
            goto L_0x0254
        L_0x0225:
            r26 = r11
            r27 = r14
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r2.f145756f
            if (r0 == 0) goto L_0x0253
            kf1.zb r3 = new kf1.zb
            wp1.f$a r11 = wp1.C15585f.f42211a
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            r14 = 0
            java.util.List r0 = r11.mo14343f(r0, r14, r1)
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r0
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r2.f145759i
            java.lang.String r11 = "relate_living"
            gy3.C87412m.m108593f(r1, r11)
            te3.b71 r2 = r2.f145763p
            r3.<init>(r0, r1, r2)
            goto L_0x0254
        L_0x024d:
            r18 = r3
            r26 = r11
            r27 = r14
        L_0x0253:
            r3 = 0
        L_0x0254:
            if (r3 == 0) goto L_0x028b
            boolean r0 = r3 instanceof kf1.C10072zb
            if (r0 == 0) goto L_0x028b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r4)
            r0.append(r13)
            r1 = r3
            kf1.zb r1 = (kf1.C10072zb) r1
            r2 = 2021(0x7e5, float:2.832E-42)
            r0.append(r2)
            java.lang.String r2 = " name:"
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r1.nickname
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            int r15 = r15 + 1
        L_0x028b:
            r17 = r3
            goto L_0x0294
        L_0x028e:
            r18 = r3
            r26 = r11
            r27 = r14
        L_0x0294:
            if (r17 != 0) goto L_0x0321
            java.util.LinkedList<te3.rl1> r0 = r7.f142275d
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0321
            java.util.LinkedList<te3.rl1> r0 = r7.f142275d
            java.lang.String r1 = "layoutInfo.divider"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x02a9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02c9
            java.lang.Object r1 = r0.next()
            r2 = r1
            te3.rl1 r2 = (te3.C51124rl1) r2
            long r2 = r2.f141001g
            if (r4 != 0) goto L_0x02bb
            goto L_0x02c5
        L_0x02bb:
            long r19 = r4.longValue()
            int r11 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r11 != 0) goto L_0x02c5
            r14 = 1
            goto L_0x02c6
        L_0x02c5:
            r14 = 0
        L_0x02c6:
            if (r14 == 0) goto L_0x02a9
            goto L_0x02ca
        L_0x02c9:
            r1 = 0
        L_0x02ca:
            te3.rl1 r1 = (te3.C51124rl1) r1
            if (r1 == 0) goto L_0x02d3
            cm1.i2 r0 = le1.C10496h.m10428c(r1)
            goto L_0x02d4
        L_0x02d3:
            r0 = 0
        L_0x02d4:
            if (r0 == 0) goto L_0x031f
            boolean r1 = r0 instanceof cm1.C0784u1
            if (r1 == 0) goto L_0x031f
            r1 = r0
            cm1.u1 r1 = (cm1.C0784u1) r1
            r1.f1835e = r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r4)
            r2.append(r13)
            te3.rl1 r3 = r1.f1834d
            int r3 = r3.f141000f
            r2.append(r3)
            java.lang.String r3 = " dividerSize:"
            r2.append(r3)
            java.util.LinkedList<te3.rl1> r3 = r7.f142275d
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " wording:"
            r2.append(r3)
            te3.rl1 r1 = r1.f1834d
            java.lang.String r1 = r1.f140999e
            r2.append(r1)
            java.lang.String r1 = " index:"
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            int r15 = r15 + 1
        L_0x031f:
            r17 = r0
        L_0x0321:
            if (r17 != 0) goto L_0x03b4
            java.util.LinkedList<te3.pl1> r0 = r7.f142276e
            int r0 = r0.size()
            if (r0 == 0) goto L_0x03b4
            java.util.LinkedList<te3.pl1> r0 = r7.f142276e
            java.lang.String r1 = "layoutInfo.card"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0336:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0356
            java.lang.Object r1 = r0.next()
            r2 = r1
            te3.pl1 r2 = (te3.C64629pl1) r2
            long r2 = r2.f184840d
            if (r4 != 0) goto L_0x0348
            goto L_0x0352
        L_0x0348:
            long r11 = r4.longValue()
            int r14 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x0352
            r14 = 1
            goto L_0x0353
        L_0x0352:
            r14 = 0
        L_0x0353:
            if (r14 == 0) goto L_0x0336
            goto L_0x0357
        L_0x0356:
            r1 = 0
        L_0x0357:
            te3.pl1 r1 = (te3.C64629pl1) r1
            if (r1 == 0) goto L_0x0361
            r0 = -1
            cm1.i2 r0 = le1.C10496h.m10427b(r1, r0)
            goto L_0x0362
        L_0x0361:
            r0 = 0
        L_0x0362:
            if (r0 == 0) goto L_0x03b6
            boolean r1 = r0 instanceof kf1.C9833k9
            if (r1 == 0) goto L_0x03b6
            r1 = r0
            kf1.k9 r1 = (kf1.C9833k9) r1
            r1.f30391h = r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleLayoutInfo find card: id:"
            r2.append(r3)
            r2.append(r4)
            r2.append(r13)
            int r3 = r1.mo75c()
            r2.append(r3)
            java.lang.String r3 = " pos:"
            r2.append(r3)
            int r3 = r1.f30391h
            r2.append(r3)
            java.lang.String r3 = " cardSize:"
            r2.append(r3)
            java.util.LinkedList<te3.pl1> r3 = r7.f142276e
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " size:"
            r2.append(r3)
            java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r1.f30389f
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            int r8 = r8 + 1
            goto L_0x03b6
        L_0x03b4:
            r0 = r17
        L_0x03b6:
            if (r0 == 0) goto L_0x03bd
            r6.add(r0)
            int r10 = r10 + 1
        L_0x03bd:
            r0 = r28
            r1 = r32
            r2 = r33
            r12 = r34
            r13 = r16
            r3 = r18
            r11 = r26
            r14 = r27
            goto L_0x0152
        L_0x03cf:
            r18 = r3
            r26 = r11
            r27 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleLayoutInfo mergeListSize:"
            r0.append(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.lang.String r1 = " incrementList:"
            r0.append(r1)
            int r1 = r5.size()
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            java.util.LinkedList<java.lang.Long> r1 = r7.f142277f
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " srcSize:"
            r0.append(r1)
            int r1 = r26.size()
            r0.append(r1)
            java.lang.String r1 = " feedCount:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " dividerCount:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " cardCount:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r5 = r6
            goto L_0x042f
        L_0x042d:
            r18 = r3
        L_0x042f:
            r0 = r18
            r0.setIncrementList(r5)
            r1 = r33
            int r2 = r1.f15560a
            r0.setPullType(r2)
            r2 = r32
            pe3.b r3 = r2.f136266e
            r0.setLastBuffer(r3)
            int r3 = r2.f136267f
            if (r3 == 0) goto L_0x0448
            r4 = 1
            goto L_0x0449
        L_0x0448:
            r4 = 0
        L_0x0449:
            r0.setHasMore(r4)
            te3.gr0 r3 = r2.f136270i
            r0.f15569a = r3
            int r3 = r2.f136271j
            r0.f15570b = r3
            int r2 = r2.f136273o
            r0.setRefreshInterval(r2)
            r2 = r28
            lm1.d$a r3 = r2.f31825i
            if (r3 == 0) goto L_0x0471
            r3.mo3601a(r0, r1)
            goto L_0x0471
        L_0x0463:
            r1 = r2
            r2 = r0
            r0 = r3
            r3 = 0
            r0.setHasMore(r3)
            lm1.d$a r3 = r2.f31825i
            if (r3 == 0) goto L_0x0471
            r3.mo3601a(r0, r1)
        L_0x0471:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm1.C10546d.mo10814N0(int, int, java.lang.String, te3.jr0, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$c, te3.iq):void");
    }

    /* renamed from: y1 */
    public final void mo10822y1(NearbyLiveFeedLoader.C3277c cVar, C10547a aVar, NearbyLiveFeedLoader.C3273a aVar2) {
        C87412m.m108594g(cVar, "request");
        C87412m.m108594g(aVar, "callback");
        this.f31825i = aVar;
        C11233b.f33100i.mo11311a(cVar.f15563d).f33105d = System.currentTimeMillis();
        C21445b.f60694a.mo33621j(cVar.f15560a, cVar.f15564e);
        new C10542a(cVar, this, aVar2, this.f31823g).mo9225i().mo11397F(this.f31824h);
        Log.m105924i("Finder.FinderLiveFriendsFeedFetcher", "fetchInternal request:" + cVar);
    }
}
