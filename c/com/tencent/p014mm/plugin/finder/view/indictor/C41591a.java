package com.tencent.p014mm.plugin.finder.view.indictor;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.indictor.FinderMediaGestureIndicator;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.indictor.a */
public final class C41591a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaGestureIndicator.C41588a f111952d;

    public C41591a(FinderMediaGestureIndicator.C41588a aVar, FinderMediaGestureIndicator.C41589b bVar, int i) {
        this.f111952d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f111952d.getClass();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
