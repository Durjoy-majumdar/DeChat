package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.webkit.DownloadListener;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k */
public class WebViewUI$$k implements DownloadListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118639d;

    public WebViewUI$$k(WebViewUI webViewUI) {
        this.f118639d = webViewUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDownloadStart(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "edw onDownloadStart, url = "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = ", mimetype = "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r6 = ", userAgent = "
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = ", contentDisposition = "
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "MicroMsg.WebViewUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r7 = "key_download_restrict"
            r8 = 0
            int r0 = r0.getIntExtra(r7, r8)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = r1.f118639d
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r9 = "key_function_id"
            java.lang.String r7 = r7.getStringExtra(r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r10 = 2
            r11 = 3
            r12 = 1
            if (r9 != 0) goto L_0x0071
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 14596(0x3904, float:2.0453E-41)
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r14[r12] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r14[r10] = r7
            r9.mo160131h(r13, r14)
        L_0x0071:
            if (r0 != r12) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r2
            java.lang.String r2 = "not allow download file : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r0)
            return
        L_0x007d:
            if (r5 == 0) goto L_0x009f
            java.lang.String r0 = "application/vnd.android.package-archive"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r2
            java.lang.String r7 = "edw onDownloadStart, report download url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r7, r0)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            com.tencent.mm.plugin.webview.stub.l r0 = r0.f118511a1
            r7 = 11154(0x2b92, float:1.563E-41)
            java.lang.Object[] r9 = new java.lang.Object[r12]
            r9[r8] = r2
            com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6907b(r0, r7, r9)
            r7 = 1
            goto L_0x00a0
        L_0x009f:
            r7 = 0
        L_0x00a0:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            d93.h r9 = r0.f118491T0
            if (r9 != 0) goto L_0x00ac
            java.lang.String r0 = "onDownloadStart fail, wvPerm is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            return
        L_0x00ac:
            if (r5 == 0) goto L_0x016f
            r0.getClass()
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_open_webview_allow_download_file
            int r0 = r0.mo58779Qe(r13, r12)
            if (r0 != r12) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)
            r0[r8] = r14
            java.lang.String r14 = "isAllowWebViewDownLoadFile = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)
            r0[r8] = r14
            java.lang.String r14 = "onDownloadStart configOpen:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r14, r0)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            r0.getClass()
            java.lang.String r0 = "(?i)^.*filename=\"?([^\"]+)\"?.*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00fe }
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch:{ Exception -> 0x00fe }
            boolean r14 = r0.find()     // Catch:{ Exception -> 0x00fe }
            if (r14 == 0) goto L_0x0117
            int r14 = r0.groupCount()     // Catch:{ Exception -> 0x00fe }
            if (r14 != r12) goto L_0x0117
            java.lang.String r0 = r0.group(r12)     // Catch:{ Exception -> 0x00fe }
            goto L_0x0118
        L_0x00fe:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "getFileNameFromContentDisposition error "
            r14.append(r15)
            java.lang.String r0 = r0.getMessage()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0117:
            r0 = 0
        L_0x0118:
            if (r0 == 0) goto L_0x0124
            java.lang.String r14 = "(?i).*\\.(doc|ppt|xls|docx|pptx|xlsx|wps|dps|et|txt|pdf)$"
            boolean r14 = java.util.regex.Pattern.matches(r14, r0)
            if (r14 == 0) goto L_0x0124
            r14 = 1
            goto L_0x0125
        L_0x0124:
            r14 = 0
        L_0x0125:
            java.util.Set<java.lang.String> r15 = com.tencent.p014mm.plugin.webview.core.C5841e.f22024b
            java.lang.String r9 = r20.toLowerCase()
            java.util.HashSet r15 = (java.util.HashSet) r15
            boolean r9 = r15.contains(r9)
            if (r13 == 0) goto L_0x0139
            if (r14 != 0) goto L_0x0137
            if (r9 == 0) goto L_0x0139
        L_0x0137:
            r9 = 1
            goto L_0x013a
        L_0x0139:
            r9 = 0
        L_0x013a:
            if (r9 == 0) goto L_0x016e
            if (r0 == 0) goto L_0x014c
            java.lang.String r13 = ".apk"
            boolean r0 = r0.endsWith(r13)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "onDownloadStart is apk"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r9 = 0
        L_0x014c:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            com.tencent.mm.plugin.webview.stub.l r13 = r0.f118511a1
            r14 = 18111(0x46bf, float:2.5379E-41)
            r15 = 6
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r0 = r0.getCurrentURL()
            r15[r8] = r0
            r15[r12] = r2
            r15[r10] = r5
            r15[r11] = r4
            r0 = 4
            r15[r0] = r3
            r0 = 5
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            r15[r0] = r3
            com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6907b(r13, r14, r15)
        L_0x016e:
            r8 = r9
        L_0x016f:
            if (r8 != 0) goto L_0x0199
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            d93.h r0 = r0.f118491T0
            com.tencent.mm.protocal.JsapiPermissionWrapper r0 = r0.mo70860c()
            r3 = 24
            boolean r0 = r0.mo69447f(r3)
            if (r0 != 0) goto L_0x0199
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            boolean r0 = r0.f118509Z0
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = "onDownloadStart permission fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            r2 = 2131839975(0x7f114be7, float:1.9313217E38)
            java.lang.String r2 = r0.getString(r2)
            nj3.C76912y0.m92773l(r0, r2)
            return
        L_0x0199:
            if (r7 == 0) goto L_0x01bc
            java.lang.Class<ug.c0> r0 = p248ug.C52570c0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ug.c0 r0 = (p248ug.C52570c0) r0
            boolean r0 = r0.mo58182e()
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "onDownloadStart isTeenMode and can not download apk"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r1.f118639d
            r0.mo10755m4(r2)
            return
        L_0x01bc:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r1.f118639d
            r3 = 2131839976(0x7f114be8, float:1.9313219E38)
            java.lang.String r3 = r0.getString(r3)
            r4 = 0
            com.tencent.p014mm.plugin.webview.modeltools.C43741b.m47584b(r0, r2, r3, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$k.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }
}
