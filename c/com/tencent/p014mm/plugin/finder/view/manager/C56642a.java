package com.tencent.p014mm.plugin.finder.view.manager;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C54256s;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.manager.a */
public final class C56642a extends C54256s {

    /* renamed from: n */
    public final /* synthetic */ FinderLinearLayoutManager f162368n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56642a(FinderLinearLayoutManager finderLinearLayoutManager, Context context) {
        super(context);
        this.f162368n = finderLinearLayoutManager;
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        C87412m.m108594g(displayMetrics, "displayMetrics");
        return this.f162368n.f162360w / ((float) displayMetrics.densityDpi);
    }
}
