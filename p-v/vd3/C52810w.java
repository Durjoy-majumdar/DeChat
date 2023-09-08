package vd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.w */
public final class C52810w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22753y f147547d;

    public C52810w(C22753y yVar) {
        this.f147547d = yVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/QBHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147547d.f65461g.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/QBHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
