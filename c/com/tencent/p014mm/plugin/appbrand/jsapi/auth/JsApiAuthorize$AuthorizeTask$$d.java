package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d */
public class JsApiAuthorize$AuthorizeTask$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f240802d;

    /* renamed from: e */
    public final /* synthetic */ JsApiAuthorize.AuthorizeTask f240803e;

    public JsApiAuthorize$AuthorizeTask$$d(JsApiAuthorize.AuthorizeTask authorizeTask, LinkedList linkedList) {
        this.f240803e = authorizeTask;
        this.f240802d = linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.util.LinkedList r0 = r14.f240802d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            te3.rw3 r0 = (te3.C90437rw3) r0
            com.tencent.mm.plugin.appbrand.jsapi.auth.l r2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.l
            java.lang.String r3 = r0.f259822d
            r2.<init>(r3)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r3 = r14.f240803e
            com.tencent.mm.plugin.appbrand.g r3 = r3.f240775g
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r3.getRuntime()
            java.lang.String r4 = r0.f259822d
            wi0.l r5 = r3.mo113051d0()
            boolean r4 = wq0.C91084u.m114265b(r4, r5)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r5 = r14.f240803e
            com.tencent.mm.plugin.appbrand.g r5 = r5.f240775g
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$b r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$b
            r6.<init>(r14, r2)
            java.util.LinkedList r7 = r14.f240802d
            yq0.l r5 = yq0.C91566l.C91567a.m114904a(r5, r6, r7)
            wi0.l r6 = r3.mo113051d0()
            java.lang.String r6 = r6.f261061d
            r5.setAppBrandName(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r6 = r6.f240789x
            r5.setApplyWording(r6)
            java.lang.String r6 = r0.f259823e
            r5.setRequestDesc(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r6 = r6.f240790y
            r5.setNegativeButtonText(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r6 = r6.f240791z
            r5.setPositiveButtonText(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r6 = r6.f240788w
            r5.setIconUrl(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            com.tencent.mm.plugin.appbrand.g r6 = r6.f240775g
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.j0> r7 = com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0.class
            ra.b r6 = r6.mo109668l(r7)
            com.tencent.mm.plugin.appbrand.jsapi.j0 r6 = (com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0) r6
            r5.setIExternalToolsHelper(r6)
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r6 == 0) goto L_0x007c
            r6 = r3
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r6 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r6
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r6.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r6 = r6.f234815R0
            boolean r6 = r6.mo76931c()
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            r7 = 1
            if (r6 != 0) goto L_0x009a
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            boolean r8 = r6.f240759A
            if (r8 == 0) goto L_0x009a
            java.lang.String r6 = r6.f240760B
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x009a
            r5.mo121473t(r7)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$c r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$c
            r6.<init>(r14, r5)
            r5.setExplainOnClickListener(r6)
            goto L_0x009d
        L_0x009a:
            r5.mo121473t(r1)
        L_0x009d:
            java.lang.String r6 = r0.f259822d
            java.lang.String r8 = "scope.userInfo"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00d7
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            com.tencent.mm.plugin.appbrand.g r6 = r6.f240775g
            android.content.Context r10 = r6.getContext()
            java.lang.Class<ln.i> r6 = p196ln.C76708i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.i r6 = (p196ln.C76708i) r6
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r8 = r14.f240803e
            java.lang.String r8 = r8.f240761C
            r9 = 0
            android.graphics.Bitmap r12 = r6.Wd0(r8, r9)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r9 = r6.f240762D
            java.lang.String r11 = r0.f259822d
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r10, r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.i$c$a r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.i$c$a
            r8 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)
            goto L_0x013b
        L_0x00d7:
            java.util.LinkedList r6 = r14.f240802d
            int r6 = r6.size()
            if (r6 <= r7) goto L_0x0136
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            gt0.d0$a r8 = new gt0.d0$a
            java.util.LinkedList r9 = r14.f240802d
            java.lang.Object r9 = r9.get(r1)
            te3.rw3 r9 = (te3.C90437rw3) r9
            java.lang.String r9 = r9.f259828j
            java.util.LinkedList r10 = r14.f240802d
            java.lang.Object r10 = r10.get(r1)
            te3.rw3 r10 = (te3.C90437rw3) r10
            java.lang.String r10 = r10.f259822d
            r8.<init>(r7, r9, r10, r7)
            r6.add(r8)
            r8 = 1
        L_0x0101:
            java.util.LinkedList r9 = r14.f240802d
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0128
            gt0.d0$a r9 = new gt0.d0$a
            java.util.LinkedList r10 = r14.f240802d
            java.lang.Object r10 = r10.get(r8)
            te3.rw3 r10 = (te3.C90437rw3) r10
            java.lang.String r10 = r10.f259828j
            java.util.LinkedList r11 = r14.f240802d
            java.lang.Object r11 = r11.get(r8)
            te3.rw3 r11 = (te3.C90437rw3) r11
            java.lang.String r11 = r11.f259822d
            r9.<init>(r7, r10, r11, r1)
            r6.add(r9)
            int r8 = r8 + 1
            goto L_0x0101
        L_0x0128:
            r8 = 8
            r5.setFunctionButtonVisibility(r8)
            r5.setSelectListItem(r6)
            java.lang.String r6 = ""
            r5.setScope(r6)
            goto L_0x013b
        L_0x0136:
            java.lang.String r6 = r0.f259822d
            r5.setScope(r6)
        L_0x013b:
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r6 = r14.f240803e
            java.lang.String r6 = r6.f240765G
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r8 = "MicroMsg.JsApiAuthorize"
            if (r6 != 0) goto L_0x014f
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r3 = r14.f240803e
            java.lang.String r3 = r3.f240765G
            r5.setSimpleDetailDesc(r3)
            goto L_0x0173
        L_0x014f:
            if (r4 == 0) goto L_0x0173
            java.lang.String r4 = r0.f259822d
            java.lang.String r4 = wq0.C91084u.m114264a(r4, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x016a
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r0 = r14.f240803e
            java.lang.String r1 = "fail:require permission desc"
            r0.mo114535t(r1)
            java.lang.String r0 = "error = fail:require permission desc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        L_0x016a:
            java.lang.String r4 = r0.f259822d
            java.lang.String r3 = wq0.C91084u.m114264a(r4, r3)
            r5.setSimpleDetailDesc(r3)
        L_0x0173:
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r3 = r14.f240803e
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo r3 = r3.f240773P
            boolean r4 = r3.f240927d
            if (r4 == 0) goto L_0x0186
            java.lang.String r3 = r3.f240928e
            boolean r3 = z04.C112551y.m153811k(r3)
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0186
            r3 = 1
            goto L_0x0187
        L_0x0186:
            r3 = 0
        L_0x0187:
            if (r3 == 0) goto L_0x019c
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r3 = r14.f240803e
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo r3 = r3.f240773P
            java.lang.String r3 = r3.f240928e
            r5.setUserAgreementCheckBoxWording(r3)
            r2.f80376b = r7
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$a r3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$a
            r3.<init>(r2)
            r5.setUserAgreementCheckedAlertListener(r3)
        L_0x019c:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r0.f259822d
            r2[r1] = r3
            java.lang.String r1 = r0.f259823e
            r2[r7] = r1
            r1 = 2
            java.lang.String r3 = r0.f259826h
            r2[r1] = r3
            r1 = 3
            java.lang.String r0 = r0.f259825g
            r2[r1] = r0
            java.lang.String r0 = "Confirm dialog scope=%s desc =%s auth_desc=%s ext_desc=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r2)
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask r0 = r14.f240803e
            com.tencent.mm.plugin.appbrand.g r0 = r0.f240775g
            r5.mo121451o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d.run():void");
    }
}
