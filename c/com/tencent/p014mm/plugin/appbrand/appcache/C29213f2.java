package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.f2 */
public final class C29213f2 implements C81274j2.C81276b {

    /* renamed from: d */
    public static final C29213f2 f79862d = new C29213f2();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.f2$a */
    public static final class C29214a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ICommLibReader f79863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29214a(ICommLibReader iCommLibReader) {
            super(0);
            this.f79863d = iCommLibReader;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01c1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r23 = this;
                r0 = r23
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r0.f79863d
                java.lang.String r1 = r1.mo113377i()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0016
                java.lang.String r4 = "develop"
                boolean r1 = z04.C112550d0.m153801u(r1, r4, r3)
                if (r1 != r2) goto L_0x0016
                r1 = 1
                goto L_0x0017
            L_0x0016:
                r1 = 0
            L_0x0017:
                if (r1 != 0) goto L_0x0021
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r0.f79863d
                int r1 = r1.mo113371a()
                if (r1 != 0) goto L_0x022c
            L_0x0021:
                com.tencent.mm.plugin.appbrand.appcache.f2 r1 = com.tencent.p014mm.plugin.appbrand.appcache.C29213f2.f79862d
                r1.getClass()
                android.content.SharedPreferences r1 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
                java.lang.String r4 = "__WxaCommLibCodeCacheHelper__LAST_DEV_LIB_VERSION_NAME_KEY"
                r5 = 0
                java.lang.String r1 = r1.getString(r4, r5)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r6 = r0.f79863d
                java.lang.String r6 = r6.mo113377i()
                boolean r1 = gy3.C87412m.m108589b(r1, r6)
                if (r1 != 0) goto L_0x022c
                android.content.SharedPreferences r1 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r6 = r0.f79863d
                int r6 = r6.mo113371a()
                java.lang.String r7 = "__WxaCommLibCodeCacheHelper__LAST_DEV_LIB_VERSION_CODE_KEY"
                int r1 = r1.getInt(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "delete expired CommLib CodeCache version="
                r6.append(r8)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "MicroMsg.AppBrand.WxaCommLibCodeCacheHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                com.tencent.mm.plugin.appbrand.page.o3$a r6 = com.tencent.p014mm.plugin.appbrand.page.C83864o3.f244851c
                java.lang.String r1 = r6.mo116422b(r1)
                com.tencent.p014mm.vfs.C86013q1.m106446g(r1, r2)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r0.f79863d
                int r1 = r1.mo113371a()
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                com.tencent.mm.plugin.appbrand.jsruntime.f0 r6 = new com.tencent.mm.plugin.appbrand.jsruntime.f0
                r6.<init>(r1)
                gy3.d0 r10 = new gy3.d0
                r10.<init>()
                gy3.d0 r11 = new gy3.d0
                r11.<init>()
                java.lang.String r12 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38798a()
                java.lang.String r13 = "retrieve()"
                gy3.C87412m.m108593f(r12, r13)
                com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0.m102049b(r10, r6, r11, r12)
                java.lang.String r12 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38800c()
                com.tencent.p014mm.vfs.C86013q1.m106461v(r12)
                java.lang.String r13 = "retrieveSnapshot()"
                gy3.C87412m.m108593f(r12, r13)
                com.tencent.p014mm.plugin.appbrand.jsruntime.C83158e0.m102049b(r10, r6, r11, r12)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r12 = "deleteLibCacheByVersion("
                r6.append(r12)
                r6.append(r1)
                java.lang.String r1 = ") cost:"
                r6.append(r1)
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                long r13 = r13 - r8
                r6.append(r13)
                java.lang.String r8 = "ms, dirVisitedCount:"
                r6.append(r8)
                int r9 = r10.f27483d
                r6.append(r9)
                java.lang.String r9 = ", fileDeletedCount:"
                r6.append(r9)
                int r10 = r11.f27483d
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                java.lang.String r10 = "MicroMsg.AppBrand.V8CodeCacheCleanupLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r6 = r0.f79863d
                int r6 = r6.mo113371a()
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                com.tencent.mm.plugin.appbrand.jsruntime.k0 r13 = new com.tencent.mm.plugin.appbrand.jsruntime.k0
                r13.<init>(r6)
                java.lang.String r14 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0.m102077a()
                java.lang.Iterable r14 = com.tencent.p014mm.vfs.C86013q1.m106459t(r14, r3)
                java.lang.String r15 = "MicroMsg.AppBrand.V8WasmCacheCleanupLogic"
                if (r14 == 0) goto L_0x01db
                java.util.Iterator r14 = r14.iterator()
                r16 = 0
                r17 = 0
            L_0x00fc:
                boolean r18 = r14.hasNext()
                if (r18 == 0) goto L_0x01d6
                java.lang.Object r18 = r14.next()
                r5 = r18
                com.tencent.mm.vfs.b0 r5 = (com.tencent.p014mm.vfs.C86001b0) r5
                boolean r2 = r5.f250476f
                if (r2 == 0) goto L_0x01cb
                java.lang.String r2 = r5.f250472b
                java.lang.String r3 = "@LibraryAppId"
                boolean r2 = gy3.C87412m.m108589b(r2, r3)
                if (r2 != 0) goto L_0x011a
                goto L_0x01cb
            L_0x011a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0.m102077a()
                r2.append(r3)
                r3 = 47
                r2.append(r3)
                java.lang.String r3 = r5.f250472b
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 0
                java.lang.Iterable r20 = com.tencent.p014mm.vfs.C86013q1.m106459t(r2, r3)
                if (r20 == 0) goto L_0x01cb
                java.util.Iterator r3 = r20.iterator()
            L_0x013f:
                boolean r20 = r3.hasNext()
                if (r20 == 0) goto L_0x01cb
                java.lang.Object r20 = r3.next()
                r21 = r3
                r3 = r20
                com.tencent.mm.vfs.b0 r3 = (com.tencent.p014mm.vfs.C86001b0) r3
                r20 = r14
                boolean r14 = r5.f250476f
                if (r14 != 0) goto L_0x015a
                r14 = r20
                r3 = r21
                goto L_0x013f
            L_0x015a:
                int r16 = r16 + 1
                java.lang.String r14 = r5.f250472b
                r22 = r5
                java.lang.String r5 = "dir.name"
                gy3.C87412m.m108593f(r14, r5)
                java.lang.String r5 = "subDir"
                gy3.C87412m.m108593f(r3, r5)
                java.lang.Integer r5 = r13.invoke(r14, r2, r3)
                int r5 = r5.intValue()
                int r17 = r17 + r5
                boolean r5 = r3.f250476f
                if (r5 == 0) goto L_0x01ac
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                r14 = 47
                r5.append(r14)
                java.lang.String r14 = r3.f250472b
                r5.append(r14)
                java.lang.String r5 = r5.toString()
                r14 = 0
                java.lang.Iterable r5 = com.tencent.p014mm.vfs.C86013q1.m106459t(r5, r14)
                if (r5 == 0) goto L_0x019b
                java.util.List r5 = sx3.C110818d0.m150953y0(r5)
                goto L_0x019c
            L_0x019b:
                r5 = 0
            L_0x019c:
                if (r5 == 0) goto L_0x01a7
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x01a5
                goto L_0x01a7
            L_0x01a5:
                r5 = 0
                goto L_0x01a8
            L_0x01a7:
                r5 = 1
            L_0x01a8:
                if (r5 == 0) goto L_0x01ac
                r5 = 1
                goto L_0x01ad
            L_0x01ac:
                r5 = 0
            L_0x01ad:
                if (r5 == 0) goto L_0x01c1
                r5 = 1
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.String r5 = r3.f250471a
                r19 = 0
                r14[r19] = r5
                java.lang.String r5 = "delete relPath %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r14)
                r3.mo119954a()
                goto L_0x01c3
            L_0x01c1:
                r19 = 0
            L_0x01c3:
                r14 = r20
                r3 = r21
                r5 = r22
                goto L_0x013f
            L_0x01cb:
                r20 = r14
                r19 = 0
                r14 = r20
                r2 = 1
                r3 = 0
                r5 = 0
                goto L_0x00fc
            L_0x01d6:
                r3 = r16
                r2 = r17
                goto L_0x01df
            L_0x01db:
                r19 = 0
                r2 = 0
                r3 = 0
            L_0x01df:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r12)
                r5.append(r6)
                r5.append(r1)
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                long r12 = r12 - r10
                r5.append(r12)
                r5.append(r8)
                r5.append(r3)
                r5.append(r9)
                r5.append(r2)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                com.tencent.mm.plugin.appbrand.appcache.f2 r1 = com.tencent.p014mm.plugin.appbrand.appcache.C29213f2.f79862d
                r1.getClass()
                android.content.SharedPreferences r1 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
                android.content.SharedPreferences$Editor r1 = r1.edit()
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r0.f79863d
                java.lang.String r2 = r2.mo113377i()
                android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r0.f79863d
                int r2 = r2.mo113371a()
                android.content.SharedPreferences$Editor r1 = r1.putInt(r7, r2)
                r1.commit()
            L_0x022c:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C29213f2.C29214a.invoke():java.lang.Object");
        }
    }

    /* renamed from: o3 */
    public void mo56522o3(ICommLibReader iCommLibReader) {
        C87412m.m108594g(iCommLibReader, "reader");
        C61926c.m72656A((String) null, new C29214a(iCommLibReader));
    }
}
