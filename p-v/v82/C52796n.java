package v82;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.n */
public final class C52796n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111474m f147499d;

    /* renamed from: e */
    public final /* synthetic */ int f147500e;

    public C52796n(C111474m mVar, int i) {
        this.f147499d = mVar;
        this.f147500e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$initNetView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111474m mVar = this.f147499d;
        if (mVar.f333764z) {
            mVar.f333745d.mo150873V(this.f147500e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$initNetView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
