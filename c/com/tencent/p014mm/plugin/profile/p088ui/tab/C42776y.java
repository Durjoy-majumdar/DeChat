package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p849e3.C58521d;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.y */
public final class C42776y implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C58521d f115821d;

    public C42776y(C58521d dVar) {
        this.f115821d = dVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f115821d.mo83434a(motionEvent);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
