package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.g0 */
public final class C40553g0 extends C54256s {

    /* renamed from: n */
    public final LinearLayoutManager f108934n;

    /* renamed from: o */
    public final int f108935o = 3000;

    /* renamed from: p */
    public final int f108936p;

    public C40553g0(Context context, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.f108934n = linearLayoutManager;
        this.f108936p = Math.round(((float) context.getResources().getDisplayMetrics().heightPixels) * 0.75f);
    }

    /* renamed from: a */
    public PointF mo17380a(int i) {
        return this.f108934n.mo16988f(i);
    }

    /* renamed from: m */
    public int mo10340m(int i) {
        return super.mo10340m(Math.max(this.f108936p, Math.min(this.f108935o, i)));
    }
}
