package io1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: io1.b */
public final class C9231b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f28973d;

    public C9231b(C12925w wVar) {
        this.f28973d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/adapter/ProfileHeaderHelper$showPositionSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28973d.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/adapter/ProfileHeaderHelper$showPositionSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
