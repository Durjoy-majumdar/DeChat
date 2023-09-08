package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.p */
public final class C5018p implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<WeImageView> f20331d;

    /* renamed from: e */
    public final /* synthetic */ C42734m f20332e;

    public C5018p(C8479f0<WeImageView> f0Var, C42734m mVar) {
        this.f20331d = f0Var;
        this.f20332e = mVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            ((WeImageView) this.f20331d.f27484d).setIconColor(this.f20332e.f115727b.getResources().getColor(C0966R.color.aob));
        } else if (action == 1 || action == 3) {
            ((WeImageView) this.f20331d.f27484d).setIconColor(this.f20332e.f115727b.getResources().getColor(C0966R.color.aoa));
        }
        if (view.isClickable() || view.isLongClickable()) {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
