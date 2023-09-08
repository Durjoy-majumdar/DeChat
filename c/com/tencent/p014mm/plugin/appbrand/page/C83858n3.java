package com.tencent.p014mm.plugin.appbrand.page;

import gy3.C87412m;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.n3 */
public class C83858n3 implements C83816h3 {

    /* renamed from: a */
    public final C83745a<?> f244842a;

    public C83858n3(C83745a<?> aVar) {
        C87412m.m108594g(aVar, "renderer");
        this.f244842a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c6, code lost:
        if (((r2 == null || (r2 = r2.mo113051d0()) == null || !r2.f234889w) ? false : true) != false) goto L_0x01c8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo116116a(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = 1
            if (r1 == 0) goto L_0x0010
            int r4 = r17.length()
            if (r4 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r4 = 0
            goto L_0x0011
        L_0x0010:
            r4 = 1
        L_0x0011:
            r5 = 0
            if (r4 == 0) goto L_0x0015
            return r5
        L_0x0015:
            java.lang.String[] r4 = p1044ub.C90636f.f260396I0
            java.lang.String r6 = "SCRIPTS_LIB_FOR_WEBVIEW"
            gy3.C87412m.m108593f(r4, r6)
            boolean r7 = sx3.C110823p.m151009y(r4, r1)
            java.lang.String r8 = ""
            r9 = -1
            if (r7 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.page.a<?> r7 = r0.f244842a
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader> r10 = com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader.class
            java.lang.Object r7 = r7.mo116072t(r10)
            gy3.C87412m.m108591d(r7)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r7 = (com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader) r7
            java.lang.String r7 = r7.mo113372b(r1)
            goto L_0x0172
        L_0x0038:
            java.lang.String r7 = "app-wxss.js"
            boolean r10 = gy3.C87412m.m108589b(r1, r7)
            if (r10 == 0) goto L_0x004d
            fc.g r10 = r16.mo116418b()
            gy3.C87412m.m108591d(r10)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99556l(r10, r7)
            goto L_0x0172
        L_0x004d:
            java.lang.String r7 = "page-frame.html"
            boolean r10 = gy3.C87412m.m108589b(r1, r7)
            if (r10 == 0) goto L_0x0067
            fc.g r10 = r16.mo116418b()
            gy3.C87412m.m108591d(r10)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99556l(r10, r7)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.page.C68629q1.m80872a(r7)
            goto L_0x0172
        L_0x0067:
            com.tencent.mm.plugin.appbrand.page.a<?> r7 = r0.f244842a
            java.lang.String r7 = r7.f244457j
            boolean r7 = gy3.C87412m.m108589b(r1, r7)
            if (r7 == 0) goto L_0x016a
            fc.g r7 = r16.mo116418b()
            gy3.C87412m.m108591d(r7)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99556l(r7, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "<style>"
            int r11 = r7.indexOf(r11)
            java.lang.String r12 = "</style>"
            int r12 = r7.indexOf(r12)
            if (r11 == r9) goto L_0x009a
            int r13 = -r11
            if (r12 != r13) goto L_0x0093
            goto L_0x009a
        L_0x0093:
            int r11 = r11 + 7
            java.lang.String r11 = r7.substring(r11, r12)
            goto L_0x009b
        L_0x009a:
            r11 = r8
        L_0x009b:
            java.lang.String r11 = u24.C90599h.m113523p(r11)
            java.lang.String r12 = "<page>"
            int r12 = r7.indexOf(r12)
            java.lang.String r13 = "</page>"
            int r13 = r7.indexOf(r13)
            if (r12 == r9) goto L_0x00b8
            int r14 = -r12
            if (r13 != r14) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            int r12 = r12 + 6
            java.lang.String r12 = r7.substring(r12, r13)
            goto L_0x00b9
        L_0x00b8:
            r12 = r8
        L_0x00b9:
            java.lang.String r12 = u24.C90599h.m113523p(r12)
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.page.C68629q1.m80872a(r7)
            if (r11 == 0) goto L_0x00cc
            int r13 = r11.length()
            if (r13 != 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r13 = 0
            goto L_0x00cd
        L_0x00cc:
            r13 = 1
        L_0x00cd:
            java.lang.String r14 = "\");"
            r15 = 2
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            if (r13 != 0) goto L_0x010b
            java.lang.String r13 = "var style = document.createElement('style');"
            r10.append(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "style.innerHTML = atob(\""
            r13.append(r5)
            java.lang.String r5 = "style"
            gy3.C87412m.m108593f(r11, r5)
            java.nio.charset.Charset r5 = z04.C119027c.f356488a
            byte[] r5 = r11.getBytes(r5)
            gy3.C87412m.m108593f(r5, r2)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r15)
            r13.append(r5)
            r13.append(r14)
            java.lang.String r5 = r13.toString()
            r10.append(r5)
            java.lang.String r5 = "document.head.appendChild(style);"
            r10.append(r5)
        L_0x010b:
            if (r12 == 0) goto L_0x0116
            int r5 = r12.length()
            if (r5 != 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r5 = 0
            goto L_0x0117
        L_0x0116:
            r5 = 1
        L_0x0117:
            if (r5 != 0) goto L_0x014f
            java.lang.String r5 = "var page = document.createElement('page');"
            r10.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "page.innerHTML = atob(\""
            r5.append(r11)
            java.lang.String r11 = "page"
            gy3.C87412m.m108593f(r12, r11)
            java.nio.charset.Charset r11 = z04.C119027c.f356488a
            byte[] r11 = r12.getBytes(r11)
            gy3.C87412m.m108593f(r11, r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r11, r15)
            r5.append(r2)
            r5.append(r14)
            java.lang.String r2 = r5.toString()
            r10.append(r2)
            java.lang.String r2 = "document.body.appendChild(page);"
            r10.append(r2)
        L_0x014f:
            if (r7 == 0) goto L_0x015a
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r2 = 0
            goto L_0x015b
        L_0x015a:
            r2 = 1
        L_0x015b:
            if (r2 != 0) goto L_0x0165
            r10.append(r7)
            r2 = 59
            r10.append(r2)
        L_0x0165:
            java.lang.String r7 = r10.toString()
            goto L_0x0172
        L_0x016a:
            fc.g r2 = r16.mo116418b()
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99556l(r2, r1)
        L_0x0172:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "provideScript name["
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "] source.length["
            r2.append(r5)
            if (r7 == 0) goto L_0x018b
            int r9 = r7.length()
        L_0x018b:
            r2.append(r9)
            r5 = 93
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "Luggage.WXA.MPPageScriptProviderDefaultImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r7 == 0) goto L_0x01a7
            int r2 = r7.length()
            if (r2 != 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            r2 = 0
            goto L_0x01a8
        L_0x01a7:
            r2 = 1
        L_0x01a8:
            if (r2 != 0) goto L_0x0237
            gy3.C87412m.m108593f(r4, r6)
            boolean r2 = sx3.C110823p.m151009y(r4, r1)
            if (r2 != 0) goto L_0x01c8
            fc.g r2 = r16.mo116418b()
            if (r2 == 0) goto L_0x01c5
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r2 = r2.mo113051d0()
            if (r2 == 0) goto L_0x01c5
            boolean r2 = r2.f234889w
            if (r2 != r3) goto L_0x01c5
            r2 = 1
            goto L_0x01c6
        L_0x01c5:
            r2 = 0
        L_0x01c6:
            if (r2 == 0) goto L_0x020b
        L_0x01c8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = p1044ub.C90636f.f260394G0
            r2.<init>(r4)
            fc.g r4 = r16.mo116418b()
            if (r4 != 0) goto L_0x01dc
            java.lang.String r4 = "preload/"
            r2.append(r4)
            goto L_0x0204
        L_0x01dc:
            fc.g r4 = r16.mo116418b()
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.f238147j
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            fc.g r5 = r16.mo116418b()
            gy3.C87412m.m108591d(r5)
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r5 = r5.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r5 = r5.f261072r
            int r5 = r5.pkgVersion()
            r2.append(r5)
            r2.append(r4)
        L_0x0204:
            r2.append(r1)
            java.lang.String r8 = r2.toString()
        L_0x020b:
            java.lang.String r1 = "run makeSourceURL@{\n    …      }\n                }"
            gy3.C87412m.m108593f(r8, r1)
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0219
            r2 = 1
            goto L_0x021a
        L_0x0219:
            r2 = 0
        L_0x021a:
            if (r2 == 0) goto L_0x021e
            r5 = r7
            goto L_0x0238
        L_0x021e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "\n//# sourceURL="
            r1.append(r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.utils.C84751i1.m104412a(r8)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L_0x0238
        L_0x0237:
            r5 = 0
        L_0x0238:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83858n3.mo116116a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final C86812g mo116418b() {
        return this.f244842a.mo116498d0();
    }
}
