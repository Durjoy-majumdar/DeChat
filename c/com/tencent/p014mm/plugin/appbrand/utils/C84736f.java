package com.tencent.p014mm.plugin.appbrand.utils;

import android.view.accessibility.AccessibilityManager;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.f */
public final class C84736f implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C84733e f247136a;

    public C84736f(C84733e eVar) {
        this.f247136a = eVar;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        this.f247136a.notify(Boolean.valueOf(z));
    }
}
