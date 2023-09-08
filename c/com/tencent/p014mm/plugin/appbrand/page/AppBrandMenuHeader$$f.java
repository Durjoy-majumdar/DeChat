package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$f */
public class AppBrandMenuHeader$$f extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ List f244397d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandMenuHeader f244398e;

    public AppBrandMenuHeader$$f(AppBrandMenuHeader appBrandMenuHeader, List list) {
        this.f244398e = appBrandMenuHeader;
        this.f244397d = list;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        super.mo21g(rect, view, recyclerView, wVar);
        rect.set(0, 0, 0, ((RecyclerView.LayoutParams) view.getLayoutParams()).mo17280b() == this.f244397d.size() + -1 ? 0 : C79406f.m96347a(this.f244398e.getContext(), 8.0f));
    }
}
