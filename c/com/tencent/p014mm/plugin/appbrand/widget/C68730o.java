package com.tencent.p014mm.plugin.appbrand.widget;

import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.o */
public class C68730o implements View.OnApplyWindowInsetsListener {

    /* renamed from: d */
    public final /* synthetic */ C68731p f197404d;

    /* renamed from: e */
    public final /* synthetic */ View f197405e;

    public C68730o(C68731p pVar, View view) {
        this.f197404d = pVar;
        this.f197405e = view;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f197404d.f197407a.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(view);
        return this.f197405e == view ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
