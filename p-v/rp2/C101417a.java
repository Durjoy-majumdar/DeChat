package rp2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import java.util.LinkedList;
import lo2.C34323y0;
import te3.C49091d4;

/* renamed from: rp2.a */
public final class C101417a {

    /* renamed from: a */
    public static final C101417a f297059a = new C101417a();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[Catch:{ all -> 0x0165 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m133069b(te3.u84 r14) {
        /*
            java.lang.String r0 = "position"
            java.lang.String r1 = "AdLiftHelper"
            java.lang.String r2 = "tryLiftAd"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "isAdLiftEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            r5 = 0
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x003a }
            h81.h r6 = (h81.C32735h) r6     // Catch:{ all -> 0x003a }
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_sns_ad_lift_android     // Catch:{ all -> 0x003a }
            int r6 = r6.mo58779Qe(r7, r5)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r7.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r8 = "isAdLiftEnable called "
            r7.append(r8)     // Catch:{ all -> 0x0038 }
            r7.append(r6)     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0038 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)     // Catch:{ all -> 0x0038 }
            goto L_0x0052
        L_0x0038:
            r7 = move-exception
            goto L_0x003d
        L_0x003a:
            r6 = move-exception
            r7 = r6
            r6 = 0
        L_0x003d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "isAdLiftEnable, exp="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x0052:
            r7 = 1
            if (r6 <= 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r6 != 0) goto L_0x0061
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0061:
            if (r14 != 0) goto L_0x0067
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0067:
            java.util.LinkedList<te3.d4> r4 = r14.f299609z
            int r6 = r14.f299608y
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r8 = r14.f299592f
            java.util.LinkedList<te3.c4> r14 = r14.f299598o
            if (r14 == 0) goto L_0x0079
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0079
            r14 = 1
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            if (r6 == 0) goto L_0x0161
            if (r4 == 0) goto L_0x0087
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0165 }
            if (r6 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r6 = 0
            goto L_0x0088
        L_0x0087:
            r6 = 1
        L_0x0088:
            if (r6 == 0) goto L_0x008c
            goto L_0x0161
        L_0x008c:
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0165 }
            te3.d4 r4 = (te3.C49091d4) r4     // Catch:{ all -> 0x0165 }
            rp2.a r5 = f297059a     // Catch:{ all -> 0x0165 }
            java.lang.String r6 = "operationObj"
            gy3.C87412m.m108593f(r4, r6)     // Catch:{ all -> 0x0165 }
            boolean r14 = r5.mo140927a(r4, r14, r8)     // Catch:{ all -> 0x0165 }
            if (r14 == 0) goto L_0x00a4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0165 }
            return
        L_0x00a4:
            if (r8 != 0) goto L_0x00aa
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0165 }
            return
        L_0x00aa:
            long r5 = r4.f132102e     // Catch:{ all -> 0x0165 }
            c30.g r14 = new c30.g     // Catch:{ all -> 0x0165 }
            te3.qv3 r4 = r4.f132103f     // Catch:{ all -> 0x0165 }
            java.lang.String r4 = sf0.C48374j0.m53717f(r4)     // Catch:{ all -> 0x0165 }
            r14.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0165 }
            os2.j r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ all -> 0x0165 }
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r4 = r4.mo139864jo(r5)     // Catch:{ all -> 0x0165 }
            java.lang.String r9 = ""
            if (r4 != 0) goto L_0x00cc
            r14 = 9
            lo2.C34323y0.m40327b(r9, r14, r5)     // Catch:{ all -> 0x0165 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0165 }
            return
        L_0x00cc:
            boolean r10 = r4.isExposured()     // Catch:{ all -> 0x0165 }
            if (r10 == 0) goto L_0x00e4
            java.lang.String r10 = "supportExposedFeed"
            int r10 = r14.optInt(r10)     // Catch:{ all -> 0x0165 }
            if (r10 != 0) goto L_0x00e4
            r14 = 10
            lo2.C34323y0.m40327b(r9, r14, r5)     // Catch:{ all -> 0x0165 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0165 }
            return
        L_0x00e4:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0165 }
            r12 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r12     // Catch:{ all -> 0x0165 }
            long r10 = r10 / r12
            int r11 = (int) r10     // Catch:{ all -> 0x0165 }
            r4.field_createAdTime = r11     // Catch:{ all -> 0x0165 }
            r10 = 4
            boolean r11 = r14.has(r0)     // Catch:{ all -> 0x0165 }
            if (r11 == 0) goto L_0x00fa
            int r10 = r14.getInt(r0)     // Catch:{ all -> 0x0165 }
        L_0x00fa:
            int r14 = r8.size()     // Catch:{ all -> 0x0165 }
            int r14 = r14 - r7
            java.lang.Object r14 = r8.get(r14)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "snslist[snslist.size - 1]"
            gy3.C87412m.m108593f(r14, r0)     // Catch:{ all -> 0x0165 }
            com.tencent.mm.protocal.protobuf.SnsObject r14 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r14     // Catch:{ all -> 0x0165 }
            int r14 = com.tencent.p014mm.plugin.sns.model.C94833a.m120154g(r14)     // Catch:{ all -> 0x0165 }
            int r14 = r14 + r7
            int r0 = r8.size()     // Catch:{ all -> 0x0165 }
            if (r10 >= r0) goto L_0x0145
            if (r10 < 0) goto L_0x0145
            java.lang.Object r14 = r8.get(r10)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "snslist[pos]"
            gy3.C87412m.m108593f(r14, r0)     // Catch:{ all -> 0x0165 }
            com.tencent.mm.protocal.protobuf.SnsObject r14 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r14     // Catch:{ all -> 0x0165 }
            int r14 = com.tencent.p014mm.plugin.sns.model.C94833a.m120154g(r14)     // Catch:{ all -> 0x0165 }
            int r14 = r14 + r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r0.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = "create ad time  "
            r0.append(r7)     // Catch:{ all -> 0x0165 }
            r0.append(r14)     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = " pos "
            r0.append(r7)     // Catch:{ all -> 0x0165 }
            r0.append(r10)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0165 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x0165 }
        L_0x0145:
            r4.field_createTime = r14     // Catch:{ all -> 0x0165 }
            os2.j r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ all -> 0x0165 }
            r14.mo139861Ow(r5, r4)     // Catch:{ all -> 0x0165 }
            com.tencent.mm.plugin.sns.storage.ADInfo r14 = r4.getAdInfo()     // Catch:{ all -> 0x0165 }
            if (r14 == 0) goto L_0x0157
            java.lang.String r14 = r14.uxInfo     // Catch:{ all -> 0x0165 }
            goto L_0x0158
        L_0x0157:
            r14 = 0
        L_0x0158:
            if (r14 != 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r9 = r14
        L_0x015c:
            r14 = 5
            lo2.C34323y0.m40327b(r9, r14, r5)     // Catch:{ all -> 0x0165 }
            goto L_0x017f
        L_0x0161:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0165 }
            return
        L_0x0165:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "tryLiftAd error"
            r0.append(r4)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
        L_0x017f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rp2.C101417a.m133069b(te3.u84):void");
    }

    /* renamed from: a */
    public final boolean mo140927a(C49091d4 d4Var, boolean z, LinkedList<SnsObject> linkedList) {
        SnsMethodCalculate.markStartTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
        if (d4Var.f132101d != 1) {
            SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
            return true;
        }
        long j = d4Var.f132102e;
        if (j == 0) {
            C34323y0.m40327b("", 6, j);
            SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
            return true;
        } else if (z) {
            C34323y0.m40327b("", 7, j);
            SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
            return true;
        } else {
            if (linkedList == null || linkedList.isEmpty()) {
                C34323y0.m40327b("", 8, j);
                SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
                return true;
            } else if (!C94866e1.zx0().mo139862Yt(j)) {
                C34323y0.m40327b("", 9, j);
                SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
                return true;
            } else {
                SnsMethodCalculate.markEndTimeMs("cannotLiftOp", "com.tencent.mm.plugin.sns.ad.timeline.adlift.AdLiftHelper");
                return false;
            }
        }
    }
}
