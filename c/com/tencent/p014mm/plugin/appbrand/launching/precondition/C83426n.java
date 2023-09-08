package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.n */
public final class C83426n extends C83410a {

    /* renamed from: o */
    public static final Map<String, C83426n> f243795o = new ConcurrentHashMap();

    /* renamed from: j */
    public final String f243796j;

    /* renamed from: n */
    public final WeakReference<Context> f243797n;

    public C83426n(Context context, String str, boolean z) {
        this.f243796j = str;
        context.getClass();
        this.f243797n = new WeakReference<>(context);
        this.f243762f = z;
        ((ConcurrentHashMap) f243795o).put(str, this);
        new n$$b(str).startTimer(TimeUnit.SECONDS.toMillis(300));
    }

    /* renamed from: j */
    public static C83426n m102381j(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return (C83426n) ((ConcurrentHashMap) f243795o).remove(str);
    }

    /* renamed from: e */
    public void mo115709e(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        super.mo115709e(appBrandInitConfigWC, appBrandStatObject);
        if (appBrandInitConfigWC != null) {
            C84128k0.f245602a.mo116793c(appBrandInitConfigWC);
        }
        MMHandlerThread.postToMainThread(new n$$a(this));
    }

    /* renamed from: g */
    public Context mo115711g() {
        return this.f243797n.get();
    }
}
