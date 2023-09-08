package yd2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yd2.i */
public final class C15965i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79076g f42861d;

    public C15965i(C79076g gVar) {
        this.f42861d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42861d.cancel();
        C117292a.m165361g(this, "com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
