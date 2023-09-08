package aq3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: aq3.m */
public final class C54300m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92075j f152410d;

    public C54300m(C92075j jVar) {
        this.f152410d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/activity/ImageQueryGalleryBottomSheetUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f152410d.mo126061c3();
        C117292a.m165361g(this, "com/tencent/mm/view/activity/ImageQueryGalleryBottomSheetUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
