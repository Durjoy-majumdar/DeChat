package p697tm;

import com.tencent.p014mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: tm.a1 */
public class C90516a1 extends IStaticListener<EventScanCodeTryPreloadWxaAttrsBeforeA8Key> {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key r12 = (com.tencent.p014mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key) r12
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x016a
        L_0x000b:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.predownload.l> r0 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81337l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.appbrand.appcache.predownload.l r0 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81337l) r0
            r0.getClass()
            com.tencent.mm.plugin.appbrand.app.z$b r0 = com.tencent.p014mm.plugin.appbrand.app.C81194z.C81196b.SCAN_WEAPP_QRCODE
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "event"
            gy3.C87412m.m108594g(r12, r3)
            java.lang.String r3 = r12.f248893e
            r4 = 1
            if (r3 == 0) goto L_0x002d
            int r3 = r3.length()
            if (r3 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0032
            goto L_0x016a
        L_0x0032:
            int r3 = r12.f248894f
            java.lang.String r5 = "event.qbarString"
            r6 = 22
            if (r3 != r6) goto L_0x0048
            di3.d r3 = di3.C86312j.m106911c(r2)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_android_appbrand_scan_preload_wxaattr_before_a8key_wxcode
            int r3 = r3.mo58779Qe(r7, r4)
            if (r3 > 0) goto L_0x00c9
        L_0x0048:
            java.lang.String r3 = r12.f248893e
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r7 = "MicroMsg.AppBrand.QRCodeDataPatternForWxa"
            r8 = 0
            java.lang.String r9 = "https://mp.weixin.qq.com/a/.*"
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0086 }
            h81.h r2 = (h81.C32735h) r2     // Catch:{ Exception -> 0x0086 }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_android_appbrand_scan_preload_wxaattr_b4_a8key_pattern     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = r2.Y60(r10, r9)     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r9.<init>()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r10 = "get by config, get pattern "
            r9.append(r10)     // Catch:{ Exception -> 0x0086 }
            r9.append(r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)     // Catch:{ Exception -> 0x0086 }
            if (r2 == 0) goto L_0x007d
            int r9 = r2.length()     // Catch:{ Exception -> 0x0086 }
            if (r9 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r9 = 0
            goto L_0x007e
        L_0x007d:
            r9 = 1
        L_0x007e:
            if (r9 == 0) goto L_0x0081
            goto L_0x009b
        L_0x0081:
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x009b
        L_0x0086:
            r2 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "get by config, get exception "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
        L_0x009b:
            if (r8 == 0) goto L_0x00aa
            java.util.regex.Matcher r2 = r8.matcher(r3)
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r2.find()
            if (r2 != r4) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r4 = 0
        L_0x00ab:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "matched:"
            r2.append(r8)
            r2.append(r4)
            java.lang.String r8 = ", str:"
            r2.append(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r4 == 0) goto L_0x0156
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "preloadByQBarRawString with string:"
            r2.append(r3)
            java.lang.String r3 = r12.f248893e
            r2.append(r3)
            java.lang.String r3 = ", codeType:"
            r2.append(r3)
            int r3 = r12.f248894f
            r2.append(r3)
            java.lang.String r3 = ", codeVersion:"
            r2.append(r3)
            int r3 = r12.f248895g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.AppBrand.PreDownloadServiceExportImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.s r2 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s.f238811a
            java.lang.String r12 = r12.f248893e
            gy3.C87412m.m108593f(r12, r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s.f238815e
            java.lang.Object r3 = r2.get(r12)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L_0x010d
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x010d:
            long r3 = r3.longValue()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            long r7 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s.f238816f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x013b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "preloadByQBarRawString with qbarString:"
            r2.append(r5)
            r2.append(r12)
            java.lang.String r12 = ", hit interval control, lastPreloadTimestamp:"
            r2.append(r12)
            r2.append(r3)
            java.lang.String r12 = r2.toString()
            java.lang.String r2 = "MicroMsg.WxaAttributesBatchPreLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            goto L_0x0152
        L_0x013b:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r12, r3)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.plugin.appbrand.appcache.predownload.v r4 = new com.tencent.mm.plugin.appbrand.appcache.predownload.v
            r4.<init>(r12, r2)
            r4.mo9225i()
        L_0x0152:
            com.tencent.p014mm.plugin.appbrand.app.C81194z.zx0(r0)
            goto L_0x016a
        L_0x0156:
            int r12 = r12.f248894f
            if (r12 != r6) goto L_0x016a
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r12 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r12 = r12.mo116962a()
            com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
            kr0.g1 r3 = kr0.C88273g1.SCAN_CODE_FOR_WXA
            r12.mo116954S(r2, r3)
            com.tencent.p014mm.plugin.appbrand.app.C81194z.zx0(r0)
        L_0x016a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p697tm.C90516a1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
