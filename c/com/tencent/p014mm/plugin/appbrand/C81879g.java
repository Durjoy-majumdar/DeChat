package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.C0125s;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82559l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gt0.C87375o0;
import li0.C88508b;

/* renamed from: com.tencent.mm.plugin.appbrand.g */
public abstract class C81879g extends C82559l {
    /* renamed from: d0 */
    public final void mo114269d0(ICommLibReader iCommLibReader) {
        iCommLibReader.getClass();
        mo114850V(ICommLibReader.class, iCommLibReader);
    }

    /* renamed from: e0 */
    public C81298o0 mo114270e0() {
        AppBrandRuntime runtime = getRuntime();
        if (runtime == null) {
            return null;
        }
        return C81247g3.m99555k(runtime, false);
    }

    /* renamed from: f0 */
    public abstract C79774c mo114271f0();

    public String getAppId() {
        if (getRuntime() == null) {
            return null;
        }
        return getRuntime().f238147j;
    }

    public C88508b getAppState() {
        return !isRunning() ? C88508b.DESTROYED : getRuntime().f238113K.mo122980c();
    }

    public final Context getContext() {
        if (getRuntime() == null) {
            return MMApplicationContext.getContext();
        }
        Activity R = getRuntime().mo113026R();
        if (R != null) {
            return R;
        }
        Context context = getRuntime().f238141d;
        return context != null ? context : MMApplicationContext.getContext();
    }

    public C87375o0 getDialogContainer() {
        if (isRunning()) {
            return getRuntime().f238156u;
        }
        super.getDialogContainer();
        return C87375o0.f253226t0;
    }

    public C81415h0 getFileSystem() {
        return !isRunning() ? super.getFileSystem() : getRuntime().mo113034V();
    }

    public C0125s getLifecycleOwner() {
        return getRuntime().f238114L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = getRuntime().mo113032U(r2);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.tencent.p014mm.plugin.appbrand.jsapi.C82835n> T mo109666h(java.lang.Class<T> r2) {
        /*
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x0012
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.jsapi.n r0 = r0.mo113032U(r2)
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r0
        L_0x0012:
            com.tencent.mm.plugin.appbrand.jsapi.n r2 = super.mo109666h(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81879g.mo109666h(java.lang.Class):com.tencent.mm.plugin.appbrand.jsapi.n");
    }

    public boolean isRunning() {
        AppBrandRuntime runtime = getRuntime();
        return runtime != null && !runtime.mo113064k0();
    }

    /* renamed from: k */
    public final ICommLibReader mo114272k() {
        return (ICommLibReader) mo109668l(ICommLibReader.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = (p224ra.C12964b) r0.mo113027R0(r2);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends p224ra.C12964b> T mo109668l(java.lang.Class<T> r2) {
        /*
            r1 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader> r0 = com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader.class
            if (r0 != r2) goto L_0x0009
            ra.b r2 = super.mo109668l(r2)
            return r2
        L_0x0009:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r1.getRuntime()
            if (r0 == 0) goto L_0x0019
            k40.a r0 = r0.mo113027R0(r2)
            ra.b r0 = (p224ra.C12964b) r0
            if (r0 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return r0
        L_0x0019:
            ra.b r2 = super.mo109668l(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81879g.mo109668l(java.lang.Class):ra.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = getRuntime().mo113021O(r3, false);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.tencent.p014mm.plugin.appbrand.jsapi.C1727m> T mo109671p(java.lang.Class<T> r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r2.getRuntime()
            if (r0 == 0) goto L_0x0012
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r2.getRuntime()
            r1 = 0
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r0.mo113021O(r3, r1)
            if (r0 == 0) goto L_0x0012
            return r0
        L_0x0012:
            com.tencent.mm.plugin.appbrand.jsapi.m r3 = super.mo109671p(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81879g.mo109671p(java.lang.Class):com.tencent.mm.plugin.appbrand.jsapi.m");
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        if (!isRunning() || !getRuntime().mo113059i(nVar)) {
            return super.mo109672s(nVar);
        }
        return true;
    }
}
