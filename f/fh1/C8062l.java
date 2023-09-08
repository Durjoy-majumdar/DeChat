package fh1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: fh1.l */
public final class C8062l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f26808d;

    public C8062l(C12925w wVar) {
        this.f26808d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$showSettingPanel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26808d.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$showSettingPanel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
