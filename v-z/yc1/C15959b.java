package yc1;

import ad1.C39543a;
import gy3.C87412m;
import org.json.JSONObject;
import te3.C49335eu3;
import te3.C51430tq0;

/* renamed from: yc1.b */
public final class C15959b implements C39543a<C51430tq0> {
    /* renamed from: a */
    public void mo14610a(int i, int i2, String str, C49335eu3 eu32, JSONObject jSONObject) {
        C87412m.m108594g((C51430tq0) eu32, "resp");
        C87412m.m108594g(jSONObject, "reportExt");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0210  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14611b(int r10, int r11, java.lang.String r12, te3.C49335eu3 r13, org.json.JSONObject r14) {
        /*
            r9 = this;
            te3.tq0 r13 = (te3.C51430tq0) r13
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r12 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r0 = "resp"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "reportExt"
            gy3.C87412m.m108594g(r14, r0)
            if (r10 != 0) goto L_0x0280
            if (r11 == 0) goto L_0x0014
            goto L_0x0280
        L_0x0014:
            di3.d r10 = di3.C86312j.m106911c(r12)
            com.tencent.mm.plugin.FinderCommonFeatureService r10 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r10
            gf1.i r10 = r10.f157802n
            int r11 = r13.f142340g
            r0 = 5
            r1 = 0
            r10.mo84538g(r11, r0, r1)
            java.util.LinkedList<te3.mh0> r11 = r13.f142339f
            java.lang.String r2 = "resp.cmdList"
            gy3.C87412m.m108593f(r11, r2)
            r2 = 0
            r10.mo84537f(r11, r2, r0)
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r10 = r10.mo62446e(r12)
            java.lang.Class<os1.e> r11 = os1.C11737e.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            os1.e r10 = (os1.C11737e) r10
            java.util.LinkedList<te3.dl1> r11 = r13.f142354x
            java.lang.String r0 = "resp.slide_up_guide_config"
            gy3.C87412m.m108593f(r11, r0)
            r10.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[updateConfig] "
            r0.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r11, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r11.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r4.next()
            te3.dl1 r5 = (te3.C49161dl1) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r5.f132392d
            r6.append(r7)
            r7 = 44
            r6.append(r7)
            int r8 = r5.f132393e
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f132396h
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f132397i
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f132394f
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f132398j
            r6.append(r8)
            r6.append(r7)
            int r8 = r5.f132395g
            r6.append(r8)
            r6.append(r7)
            int r5 = r5.f132399n
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.add(r5)
            goto L_0x005f
        L_0x00b7:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "Finder.GuideConfigVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.LinkedList<te3.dl1> r0 = r10.f34349e
            r0.clear()
            java.util.LinkedList<te3.dl1> r10 = r10.f34349e
            r10.addAll(r11)
            java.lang.Class<tf0.q1> r10 = tf0.C13887q1.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            tf0.q1 r10 = (tf0.C13887q1) r10
            java.util.LinkedList<te3.fs0> r11 = r13.f142346p
            r10.mo13318LX(r11)
            int r10 = r13.f142347q
            long r3 = r13.f142348r
            java.lang.String r11 = "current_alias_role_type"
            r14.put(r11, r10)
            java.lang.String r11 = "next_alias_mod_available_time"
            r14.put(r11, r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "current_alias_role_type："
            r11.append(r14)
            r11.append(r10)
            java.lang.String r10 = ", next_alias_mod_available_time："
            r11.append(r10)
            r11.append(r3)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "CgiFinderInitInterceptor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.util.LinkedList<te3.fs0> r10 = r13.f142346p
            java.lang.String r14 = "NetSceneFinderInit"
            r0 = 1
            if (r10 == 0) goto L_0x0138
            java.util.Iterator r10 = r10.iterator()
        L_0x0111:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0129
            java.lang.Object r3 = r10.next()
            r4 = r3
            te3.fs0 r4 = (te3.C64373fs0) r4
            int r4 = r4.f183215f
            r5 = 2
            if (r4 != r5) goto L_0x0125
            r4 = 1
            goto L_0x0126
        L_0x0125:
            r4 = 0
        L_0x0126:
            if (r4 == 0) goto L_0x0111
            goto L_0x012a
        L_0x0129:
            r3 = r1
        L_0x012a:
            te3.fs0 r3 = (te3.C64373fs0) r3
            if (r3 == 0) goto L_0x0138
            er1.w3 r10 = er1.C58784w3.f168295a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.mo83975w1(r3, r4, r14)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x0139
        L_0x0138:
            r10 = r1
        L_0x0139:
            if (r10 != 0) goto L_0x014e
            java.util.LinkedList<te3.fs0> r10 = r13.f142346p
            if (r10 == 0) goto L_0x0147
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r0
            if (r10 != r0) goto L_0x0147
            r2 = 1
        L_0x0147:
            if (r2 == 0) goto L_0x014e
            er1.w3 r10 = er1.C58784w3.f168295a
            r10.mo83976x(r14, r1)
        L_0x014e:
            java.util.LinkedList<te3.he1> r10 = r13.f142328D
            if (r10 == 0) goto L_0x01b2
            er1.v2$a r14 = er1.C7888v2.f26513a
            r14.getClass()
            te3.ie1 r14 = new te3.ie1     // Catch:{ Exception -> 0x0197 }
            r14.<init>()     // Catch:{ Exception -> 0x0197 }
            r14.f135252d = r10     // Catch:{ Exception -> 0x0197 }
            f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0197 }
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x0197 }
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NAVIGATION_TITLE_LIST_STRING_SYNC     // Catch:{ Exception -> 0x0197 }
            byte[] r1 = r14.toByteArray()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r2 = "saveList.toByteArray()"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0197 }
            java.nio.charset.Charset r3 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0197 }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0197 }
            r10.mo119677K(r0, r2)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r10 = er1.C7888v2.C7889a.f26515b     // Catch:{ Exception -> 0x0197 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197 }
            r0.<init>()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r1 = "navigationTitleList cacheListStr:"
            r0.append(r1)     // Catch:{ Exception -> 0x0197 }
            org.json.JSONObject r14 = o40.C61937h.m72709h(r14)     // Catch:{ Exception -> 0x0197 }
            r0.append(r14)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r14 = r0.toString()     // Catch:{ Exception -> 0x0197 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)     // Catch:{ Exception -> 0x0197 }
            goto L_0x01b2
        L_0x0197:
            r10 = move-exception
            er1.j4 r14 = er1.C58739j4.f168176a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "navigationTitleList:"
            r0.append(r1)
            java.lang.String r1 = r10.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo83712h0(r10, r0)
        L_0x01b2:
            te3.sj0 r10 = r13.f142325A
            if (r10 == 0) goto L_0x020c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "carousel_config：buzz_carousel = "
            r14.append(r0)
            boolean r0 = r10.f141546d
            r14.append(r0)
            r0 = 43
            r14.append(r0)
            boolean r1 = r10.f141547e
            r14.append(r1)
            java.lang.String r1 = ", buzz_fav = "
            r14.append(r1)
            boolean r1 = r10.f141548f
            r14.append(r1)
            r14.append(r0)
            boolean r1 = r10.f141549g
            r14.append(r1)
            java.lang.String r1 = ", hot_comment = "
            r14.append(r1)
            boolean r1 = r10.f141550h
            r14.append(r1)
            r14.append(r0)
            boolean r1 = r10.f141551i
            r14.append(r1)
            java.lang.String r1 = ", ringtone = "
            r14.append(r1)
            boolean r1 = r10.f141552j
            r14.append(r1)
            r14.append(r0)
            boolean r10 = r10.f141553n
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
        L_0x020c:
            te3.ch0 r10 = r13.f142333I
            if (r10 == 0) goto L_0x0256
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "finder_check_prefetch_conf: interval_second="
            r13.append(r14)
            int r14 = r10.f131726d
            r13.append(r14)
            java.lang.String r14 = ", lastest_count="
            r13.append(r14)
            int r14 = r10.f131727e
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC
            int r14 = r10.f131726d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11.mo119677K(r13, r14)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC
            int r10 = r10.f131727e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.mo119677K(r13, r10)
        L_0x0256:
            di3.d r10 = di3.C86312j.m106911c(r12)
            com.tencent.mm.plugin.FinderCommonFeatureService r10 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r10
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r10 = r10.Nt0()
            java.lang.String r11 = "Finder.RedDotManager"
            java.lang.String r12 = "onFinderInitSuccessfully..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            com.tencent.mm.plugin.finder.extension.reddot.p0 r10 = r10.f158525b
            r10.mo2467d()
            java.lang.Class<ry0.f> r10 = ry0.C13606f.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ry0.f r10 = (ry0.C13606f) r10
            r10.mo12999Kp()
            zt3.t r10 = zt3.C119157j.f356862d
            yc1.a r11 = yc1.C15958a.f42856d
            zt3.j r10 = (zt3.C119157j) r10
            r10.mo183870a(r11)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.C15959b.mo14611b(int, int, java.lang.String, te3.eu3, org.json.JSONObject):void");
    }

    /* renamed from: c */
    public int mo14612c() {
        return 3930;
    }
}
