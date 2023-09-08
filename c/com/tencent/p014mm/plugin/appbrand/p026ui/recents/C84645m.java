package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.m */
public class C84645m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherRecentsList f246953d;

    public C84645m(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f246953d = appBrandLauncherRecentsList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r3.f246953d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r0 = r3.f246953d
            com.tencent.mm.plugin.appbrand.ui.recents.x r0 = r0.f246818H
            android.view.View r0 = r0.f246975a
            if (r0 == 0) goto L_0x002f
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x002f
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r0 = r3.f246953d
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r1 = r0.f246849w
            if (r1 != 0) goto L_0x0015
            goto L_0x002f
        L_0x0015:
            r2 = 0
            com.tencent.mm.plugin.appbrand.ui.recents.x r0 = r0.f246818H     // Catch:{ IndexOutOfBoundsException -> 0x0022 }
            android.view.View r0 = r0.f246975a     // Catch:{ IndexOutOfBoundsException -> 0x0022 }
            int r0 = r0.getHeight()     // Catch:{ IndexOutOfBoundsException -> 0x0022 }
            r1.scrollBy(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0022 }
            goto L_0x002f
        L_0x0022:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.AppBrandLauncherRecentsList"
            java.lang.String r2 = "makeFooterFullyVisible scrollBy e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84645m.run():void");
    }
}
