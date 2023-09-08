package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.tencent.mapsdk.internal.em */
public abstract class C113699em implements C113701eo {
    /* renamed from: a */
    public Rect mo171996a() {
        View[] b = mo171997b();
        Rect rect = new Rect();
        for (View a : b) {
            rect.union(C113801hf.m157136a(a));
        }
        return rect;
    }

    /* renamed from: b */
    public abstract View[] mo171997b();
}
