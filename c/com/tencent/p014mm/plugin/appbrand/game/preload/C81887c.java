package com.tencent.p014mm.plugin.appbrand.game.preload;

import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fu3.C116901a;
import gt0.C87375o0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import junit.framework.Assert;
import li0.C88508b;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.c */
public final class C81887c implements C82554k {

    /* renamed from: d */
    public AppBrandRuntime f240189d;

    /* renamed from: e */
    public final LinkedHashSet<C1727m> f240190e = new LinkedHashSet<>();

    public C81887c(AppBrandRuntime appBrandRuntime) {
        this.f240189d = appBrandRuntime;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        return false;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
    }

    public String getAppId() {
        return this.f240189d.f238147j;
    }

    public C88508b getAppState() {
        AppBrandRuntime appBrandRuntime = this.f240189d;
        return appBrandRuntime == null ? C88508b.DESTROYED : appBrandRuntime.f238113K.mo122980c();
    }

    public /* synthetic */ C116901a getAsyncHandler() {
        return null;
    }

    public int getComponentId() {
        return 0;
    }

    public Context getContext() {
        return null;
    }

    public C87375o0 getDialogContainer() {
        return null;
    }

    public C81415h0 getFileSystem() {
        return null;
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        return null;
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    public AppBrandRuntime getRuntime() {
        return this.f240189d;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        return null;
    }

    public boolean isRunning() {
        return false;
    }

    /* renamed from: k */
    public ICommLibReader mo114272k() {
        return null;
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        return null;
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        if (runnable != null) {
            if (j < 0) {
                j = 0;
            }
            MMHandlerThread.postToMainThreadDelayed(runnable, j);
        }
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        T t;
        Iterator<C1727m> it = this.f240190e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = (C1727m) it.next();
            if (cls.isInstance(t)) {
                break;
            }
        }
        boolean z = true;
        if (t == null) {
            try {
                t = (C1727m) cls.newInstance();
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.WAGamePreloadComponent", "Make sure %s has default constructor", cls.getName());
            }
        }
        if (t == null) {
            z = false;
        }
        Assert.assertTrue(z);
        return t;
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        return false;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        if (runnable != null) {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
    }
}
