package iu2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;

/* renamed from: iu2.c */
public final class C98801c extends C53996a<C98799a> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: iu2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01d2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d14.C45252f<ac2.C39534d<iu2.C98799a>> mo70648b(com.tencent.p014mm.sdk.coroutines.LifecycleScope r17, ac2.C53998c<iu2.C98799a> r18) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "getData"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.lang.String r0 = "scope"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r2, r0)
            ac2.d r3 = new ac2.d
            r3.<init>(r2)
            java.lang.Class<iu2.e> r0 = iu2.C60631e.class
            byte[] r4 = i40.C60247c.f171776h
            monitor-enter(r4)
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x02e9 }
            r5.mo121108c()     // Catch:{ all -> 0x02e9 }
            java.lang.Class<i40.c> r5 = i40.C60247c.class
            boolean r5 = r5.isAssignableFrom(r0)     // Catch:{ all -> 0x02e9 }
            if (r5 == 0) goto L_0x02e1
            androidx.lifecycle.k0 r5 = new androidx.lifecycle.k0     // Catch:{ all -> 0x02e9 }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x02e9 }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x02e9 }
            i40.c$a$a r7 = new i40.c$a$a     // Catch:{ all -> 0x02e9 }
            r7.<init>()     // Catch:{ all -> 0x02e9 }
            r5.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r7)     // Catch:{ all -> 0x02e9 }
            androidx.lifecycle.i0 r0 = r5.mo75002a(r0)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r4)
            iu2.e r0 = (iu2.C60631e) r0
            java.lang.Class<iu2.d> r4 = iu2.C98802d.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r4)
            r4 = r0
            iu2.d r4 = (iu2.C98802d) r4
            java.lang.Class<gu2.b> r0 = gu2.C98214b.class
            java.lang.String r5 = "getPageList"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.Object r7 = r2.f151266c
            java.lang.String r7 = (java.lang.String) r7
            com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C102654l5.f302571B
            r9 = 2
            r10 = 0
            com.tencent.mm.sdk.storage.sql.SingleCondition r8 = r8.bitAndNotEqual(r9, r10)
            if (r7 == 0) goto L_0x0071
            com.tencent.mm.sdk.storage.sql.Column r9 = p749xh.C102654l5.f302572C
            com.tencent.mm.sdk.storage.sql.SingleCondition r7 = r9.smallerThan((java.lang.String) r7)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r8 = r8.and(r7)
        L_0x0071:
            com.tencent.mm.sdk.storage.sql.SingleTable r7 = p749xh.C102654l5.f302595y
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.selectAll()
            java.lang.String r9 = "MicroMsg.Improve.DataFlow"
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.log(r9)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.where(r8)
            com.tencent.mm.sdk.storage.sql.Column r8 = p749xh.C102654l5.f302570A
            com.tencent.mm.sdk.storage.sql.ISqlOrder r8 = r8.orderDesc()
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.orderBy((com.tencent.p014mm.sdk.storage.sql.ISqlOrder) r8)
            int r8 = r2.f151265b
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r7 = r7.limit(r8, r10)
            com.tencent.mm.sdk.storage.sql.SelectSql r7 = r7.build()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r8 = r4.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r8.getDB()
            java.util.List r7 = r7.multiQuery(r8, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "getPageList size:"
            r8.append(r11)
            int r11 = r7.size()
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            boolean r8 = r7.isEmpty()
            r11 = 1
            r8 = r8 ^ r11
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.repository.ADImproveDBRepositoryKt"
            if (r8 == 0) goto L_0x0165
            java.lang.Object r8 = sx3.C110818d0.m150923U(r7)
            gu2.b r8 = (gu2.C98214b) r8
            int r8 = r8.getCreateTime()
            java.lang.Object r13 = sx3.C110818d0.m150914L(r7)
            gu2.b r13 = (gu2.C98214b) r13
            int r13 = r13.getCreateTime()
            java.lang.String r14 = "getADItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
            if (r8 > 0) goto L_0x00ec
            java.lang.String r0 = "getADItem, timeRangeDown==0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            goto L_0x0162
        L_0x00ec:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "getADItem, timeRangeDown="
            r15.append(r11)
            r15.append(r8)
            java.lang.String r11 = ", timeRangeUp="
            r15.append(r11)
            r15.append(r13)
            java.lang.String r11 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
            java.lang.String r11 = "handleAdExpire"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r15 = eb0.C75592q0.m90789s()
            lo2.C99554m.m129936a(r13, r8, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            com.tencent.mm.sdk.storage.sql.SingleTable r11 = p749xh.C102646h.TABLE
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r11.selectAll()
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r9 = r11.log(r9)
            com.tencent.mm.sdk.storage.sql.Column r11 = p749xh.C102646h.CREATETIME
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r8 = r11.between(r13, r8, r10, r10)
            com.tencent.mm.sdk.storage.sql.Column r11 = p749xh.C102646h.LOCALFLAG
            java.lang.String r13 = "getFilterList$plugin_sns_release"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            rx3.g r15 = r4.f289653d
            rx3.n r15 = (rx3.C36570n) r15
            java.lang.Object r15 = r15.getValue()
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            com.tencent.mm.sdk.storage.sql.SingleCondition r11 = r11.notInString(r15)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r8 = r8.and(r11)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r8 = r9.where(r8)
            com.tencent.mm.sdk.storage.sql.SelectSql r8 = r8.build()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r9 = r4.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.getDB()
            java.util.List r0 = r8.multiQuery(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
        L_0x0162:
            r7.addAll(r0)
        L_0x0165:
            iu2.b r0 = new iu2.b
            r0.<init>()
            java.util.List r7 = sx3.C110818d0.m150943o0(r7, r0)
            java.lang.String r8 = "adConsecutiveCheck"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r12)
            java.lang.String r9 = "removeConsecutiveAd"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            java.lang.String r0 = "isConsecutiveFilter"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)     // Catch:{ all -> 0x0194 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)     // Catch:{ all -> 0x0194 }
            boolean r0 = lo2.C99534f0.m129898g()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x01b7
            java.util.List r0 = lo2.C99534f0.m129892a(r7)     // Catch:{ all -> 0x0194 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x01bb
        L_0x0194:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "there is something wrong in removeConsecutiveAd: "
            r13.append(r14)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            java.lang.String r13 = "ConsecutiveAdDataImproveHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = "filter_ad_exp"
            java.lang.String r13 = ""
            vr2.C37817q.m41545a(r0, r13, r10, r10, r13)
        L_0x01b7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            r0 = r7
        L_0x01bb:
            if (r0 != 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r7 = r0
        L_0x01bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            boolean r0 = r7.isEmpty()
            r5 = 1
            r0 = r0 ^ r5
            r5 = 0
            if (r0 == 0) goto L_0x01cf
            goto L_0x01d0
        L_0x01cf:
            r7 = r5
        L_0x01d0:
            if (r7 == 0) goto L_0x02cb
            java.lang.String r0 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "=====request db data start key:"
            r6.append(r8)
            java.lang.Object r8 = r2.f151266c
            r6.append(r8)
            java.lang.String r8 = "====="
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            java.util.Iterator r0 = r7.iterator()
        L_0x01f3:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0265
            java.lang.Object r6 = r0.next()
            gu2.b r6 = (gu2.C98214b) r6
            java.lang.String r8 = "MicroMsg.Improve.DataFlow"
            java.lang.String r9 = java.lang.String.valueOf(r6)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            java.util.ArrayList<T> r8 = r3.f106151b
            java.util.Iterator r8 = r8.iterator()
        L_0x020e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x023b
            java.lang.Object r9 = r8.next()
            r11 = r9
            iu2.a r11 = (iu2.C98799a) r11
            gu2.b r11 = r11.mo138170b()
            long r11 = r11.mo142401p2()
            long r13 = r6.mo142401p2()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0237
            long r11 = r6.mo142401p2()
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0237
            r11 = 1
            goto L_0x0238
        L_0x0237:
            r11 = 0
        L_0x0238:
            if (r11 == 0) goto L_0x020e
            goto L_0x023c
        L_0x023b:
            r9 = r5
        L_0x023c:
            if (r9 == 0) goto L_0x025a
            java.lang.String r8 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "sth. error,delete "
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            r8 = 1
            r4.delete(r6, r10, r8)
            goto L_0x01f3
        L_0x025a:
            java.util.ArrayList<T> r8 = r3.f106151b
            iu2.a r9 = new iu2.a
            r9.<init>(r6)
            r8.add(r9)
            goto L_0x01f3
        L_0x0265:
            int r0 = r7.size()
            int r2 = r2.f151265b
            if (r0 < r2) goto L_0x026f
            r0 = 1
            goto L_0x0270
        L_0x026f:
            r0 = 0
        L_0x0270:
            r3.f106150a = r0
            java.util.ArrayList<T> r0 = r3.f106151b
            int r2 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r2)
        L_0x027c:
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L_0x0296
            java.lang.Object r2 = r0.previous()
            r4 = r2
            iu2.a r4 = (iu2.C98799a) r4
            gu2.b r4 = r4.mo138170b()
            boolean r4 = r4.isAd()
            r6 = 1
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x027c
            goto L_0x0297
        L_0x0296:
            r2 = r5
        L_0x0297:
            iu2.a r2 = (iu2.C98799a) r2
            if (r2 != 0) goto L_0x02a4
            java.util.ArrayList<T> r0 = r3.f106151b
            java.lang.Object r0 = sx3.C110818d0.m150923U(r0)
            r2 = r0
            iu2.a r2 = (iu2.C98799a) r2
        L_0x02a4:
            gu2.b r0 = r2.mo138170b()
            java.lang.String r0 = r0.getStringSeq()
            r3.f106152c = r0
            java.lang.String r0 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "=====request db data finish key:"
            r2.append(r4)
            java.lang.Object r4 = r3.f106152c
            r2.append(r4)
            java.lang.String r4 = "====="
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x02cb:
            r0 = 7
            d14.t0 r0 = d14.C58017a1.m67173b(r10, r10, r5, r0, r5)
            zb2.l$a$a r2 = new zb2.l$a$a
            r2.<init>(r0, r3, r5)
            r3 = 1
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r1, r5, r2, r3, r5)
            java.lang.String r1 = "getData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        L_0x02e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02e9 }
            java.lang.String r1 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r1)     // Catch:{ all -> 0x02e9 }
            throw r0     // Catch:{ all -> 0x02e9 }
        L_0x02e9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iu2.C98801c.mo70648b(com.tencent.mm.sdk.coroutines.LifecycleScope, ac2.c):d14.f");
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C45252f mo70650e(LifecycleScope lifecycleScope, Object obj) {
        SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        C45252f<C39534d<C98799a>> b = mo70648b(lifecycleScope, (C53998c) obj);
        SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        return b;
    }
}
