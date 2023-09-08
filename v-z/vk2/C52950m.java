package vk2;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vk2.m */
public final class C52950m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C52950m f147793d = new C52950m();

    public C52950m() {
        super(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r2.f122358h != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            vk2.o r0 = vk2.C37745o.f99965a
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r2 = "alvinluo preloadBoxWebViewInner cacheWebView: %s, isDestroyed: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0086 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.box.webview.BoxWebView r4 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x001a
            boolean r4 = r4.f122358h     // Catch:{ all -> 0x0086 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0086 }
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = vk2.C37745o.f99970f     // Catch:{ all -> 0x0086 }
            monitor-enter(r1)     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0031
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = vk2.C37745o.f99966b     // Catch:{ all -> 0x0083 }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.f122358h     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0048
        L_0x0031:
            java.lang.String r2 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r3 = "alvinluo preloadBoxWebViewInner createBoxWebView"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r3)     // Catch:{ all -> 0x0083 }
            com.tencent.mm.plugin.box.webview.BoxWebView r2 = new com.tencent.mm.plugin.box.webview.BoxWebView     // Catch:{ all -> 0x0083 }
            android.content.MutableContextWrapper r3 = new android.content.MutableContextWrapper     // Catch:{ all -> 0x0083 }
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0083 }
            r3.<init>(r4)     // Catch:{ all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ all -> 0x0083 }
            vk2.C37745o.f99966b = r2     // Catch:{ all -> 0x0083 }
        L_0x0048:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 != 0) goto L_0x0064
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 != 0) goto L_0x0064
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r5 = 1
        L_0x0065:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
            if (r0 == 0) goto L_0x0080
            boolean r0 = com.tencent.xweb.XWebSdk.getDowngradeToSys()
            if (r0 != 0) goto L_0x0080
            if (r5 != 0) goto L_0x0080
            java.lang.String r0 = "MicroMsg.BoxWebViewPreloadManager"
            java.lang.String r1 = "WebView preInitChildProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.xweb.XWebSdk.preInitGpuProcess()
            com.tencent.xweb.XWebSdk.preInitRenderProcess()
        L_0x0080:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0083:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0086 }
            throw r2     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.C52950m.invoke():java.lang.Object");
    }
}
