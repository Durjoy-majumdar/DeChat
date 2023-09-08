package wd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76870b0;

public class a$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76870b0 f148295d;

    public a$$e(C78543a aVar, C76870b0 b0Var) {
        this.f148295d = b0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/AddContact$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f148295d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
