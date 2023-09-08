package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandFileCleanEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/AppBrandFileCleaner$Companion$cleanEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AppBrandFileCleanEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$Companion$cleanEvent$1 */
public final class AppBrandFileCleaner$Companion$cleanEvent$1 extends IListener<AppBrandFileCleanEvent> {
    public AppBrandFileCleaner$Companion$cleanEvent$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent r9 = (com.tencent.p014mm.autogen.events.AppBrandFileCleanEvent) r9
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a r0 = r9.f236127d
            java.lang.String r0 = r0.f236128a
            r1 = 0
            if (r0 == 0) goto L_0x0142
            int r2 = r0.hashCode()
            java.lang.String r3 = "MicroMsg.AppBrandFileCleaner"
            r4 = 1
            switch(r2) {
                case -1759879326: goto L_0x012c;
                case 963039396: goto L_0x0115;
                case 1478524684: goto L_0x005c;
                case 1899942826: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0142
        L_0x001a:
            java.lang.String r9 = "ACTION_CLEAN_ALL_APPBRAND_SPACE"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0024
            goto L_0x0142
        L_0x0024:
            java.lang.String r9 = "on receive deep clean event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$a r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.f238096a
            java.lang.String r9 = "reset WxaCommLibVersionChecker check timestamp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.p014mm.plugin.appbrand.appcache.C81285k2.m99659c(r4)
            com.tencent.mm.plugin.appbrand.q3 r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81064c.f238101a
            java.lang.String r9 = "prepare reset wxapkg file ref count"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.n0> r9 = com.tencent.p014mm.plugin.appbrand.appcache.C81295n0.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            com.tencent.mm.plugin.appbrand.appcache.n0 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81295n0) r9
            java.lang.String[] r0 = r9.Ow0()
            if (r0 == 0) goto L_0x0142
            int r2 = r0.length
            r3 = 0
        L_0x004c:
            if (r3 >= r2) goto L_0x0142
            r4 = r0[r3]
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r5 != 0) goto L_0x0059
            r9.mo56504vC(r4)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x005c:
            java.lang.String r9 = "ACTION_CLEAN_APPBRAND_COMMON_SPACE"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0066
            goto L_0x0142
        L_0x0066:
            java.lang.String r9 = "on receive common space clean event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.appbrand.q3 r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81064c.f238101a
            com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$a r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.f238096a
            java.lang.String r9 = "prepare clean appbrand common space file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            java.lang.String r9 = "wcf://WxaJsCodeCache/"
            com.tencent.p014mm.vfs.C86013q1.m106445f(r9)
            java.lang.String r9 = "wcf://WxaSnapshotJsCodeCache/"
            com.tencent.p014mm.vfs.C86013q1.m106445f(r9)
            java.lang.String r9 = "wcf://WxaWASMCache/"
            com.tencent.p014mm.vfs.C86013q1.m106445f(r9)
            com.tencent.mm.plugin.appbrand.appstorage.t0 r9 = new com.tencent.mm.plugin.appbrand.appstorage.t0     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "wxsdk"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101178d(r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = "wxfile://sdk"
            r9.<init>(r0, r2)     // Catch:{ Exception -> 0x009e }
            r9.cleanupDirectory()     // Catch:{ Exception -> 0x009e }
            goto L_0x00a8
        L_0x009e:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r1] = r9
            java.lang.String r9 = "clean SafeMode NotFlatten e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r9, r0)
        L_0x00a8:
            com.tencent.mm.plugin.appbrand.q3 r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81064c.f238101a
            r9.getClass()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            r0.getClass()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "AppBrandWxaPkgManifestRecord"
            r5[r1] = r6
            java.lang.String r6 = "appId"
            r5[r4] = r6
            r6 = 2
            java.lang.String r7 = "%$__PLUGINCODE__"
            r5[r6] = r7
            java.lang.String r6 = "delete from %s where %s like '%s'"
            java.lang.String r2 = java.lang.String.format(r2, r6, r5)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f238664d
            r5 = 0
            android.database.Cursor r0 = r0.rawQuery(r2, r5)
            if (r0 == 0) goto L_0x00fc
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00fc
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00f2 }
            r2.<init>()     // Catch:{ all -> 0x00f2 }
        L_0x00e1:
            java.lang.String r5 = r0.getString(r1)     // Catch:{ all -> 0x00f2 }
            r2.add(r5)     // Catch:{ all -> 0x00f2 }
            boolean r5 = r0.moveToNext()     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x00e1
            r0.close()
            goto L_0x0102
        L_0x00f2:
            r9 = move-exception
            r0.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r0 = move-exception
            r9.addSuppressed(r0)
        L_0x00fb:
            throw r9
        L_0x00fc:
            if (r0 == 0) goto L_0x0101
            r0.close()
        L_0x0101:
            r4 = 0
        L_0x0102:
            if (r4 == 0) goto L_0x0108
            r9.mo116743e()
            goto L_0x010f
        L_0x0108:
            java.lang.String r9 = "MicroMsg.AppBrand.PkgCleanupLogic"
            java.lang.String r0 = "clean plugin pkg failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x010f:
            java.lang.String r9 = "clean appbrand common space file finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x0142
        L_0x0115:
            java.lang.String r2 = "ACTION_PACKAGE_CALCULATE"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011e
            goto L_0x0142
        L_0x011e:
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a r9 = r9.f236127d
            boolean r9 = r9.f236129b
            if (r9 == 0) goto L_0x0142
            com.tencent.mm.plugin.appbrand.p3 r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81063b.f238100a
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f244377a
            r9.set(r4)
            goto L_0x0142
        L_0x012c:
            java.lang.String r2 = "ACTION_PACKAGE_CLEANUP"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0135
            goto L_0x0142
        L_0x0135:
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a r9 = r9.f236127d
            boolean r9 = r9.f236129b
            if (r9 == 0) goto L_0x0142
            com.tencent.mm.plugin.appbrand.q3 r9 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81064c.f238101a
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.f245491a
            r9.set(r4)
        L_0x0142:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner$Companion$cleanEvent$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
