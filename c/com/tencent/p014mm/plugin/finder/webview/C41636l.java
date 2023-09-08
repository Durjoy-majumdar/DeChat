package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45520t;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.finder.webview.l */
public final class C41636l extends C43558z {

    /* renamed from: b */
    public WeakReference<Context> f112077b;

    /* renamed from: c */
    public WeakReference<C45520t> f112078c;

    /* renamed from: d */
    public WeakReference<Runnable> f112079d;

    /* renamed from: e */
    public C43783b f112080e = new C43783b();

    /* renamed from: b */
    public void mo64861b(int i, String str, int i2, int i3, String str2) {
        Runnable runnable;
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "errMsg");
        super.mo64861b(i, str, i2, i3, str2);
        Log.m105924i("Finder.WebViewController", "reason:" + i + " reqUrl:" + str + " errType:" + i2 + " errCode:" + i3 + " :" + str2 + ": String) ");
        WeakReference<Runnable> weakReference = this.f112079d;
        if (weakReference != null && (runnable = weakReference.get()) != null) {
            runnable.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r3 = r3.get();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64862e() {
        /*
            r4 = this;
            r0 = 0
            java.lang.ref.WeakReference<e00.t> r1 = r4.f112078c     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002b }
            e00.t r1 = (e00.C45520t) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0035
            com.tencent.mm.plugin.webview.stub.l r1 = r1.mo67731m()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0035
            com.tencent.mm.plugin.webview.stub.b r2 = r4.f112080e     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference<e00.t> r3 = r4.f112078c     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x002b }
            e00.t r3 = (e00.C45520t) r3     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0026
            int r3 = r3.mo67719g()     // Catch:{ all -> 0x002b }
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r1.Np0(r2, r3)     // Catch:{ all -> 0x002b }
            goto L_0x0035
        L_0x002b:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Finder.WebViewController"
            java.lang.String r3 = "initWebViewController exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.webview.C41636l.mo64862e():void");
    }
}
