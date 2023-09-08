package vd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.z */
public final class C52811z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22744b0 f147548d;

    public C52811z(C22744b0 b0Var) {
        this.f147548d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/QBMoreFileHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147548d.f65444h.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/QBMoreFileHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
