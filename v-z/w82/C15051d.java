package w82;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: w82.d */
public final class C15051d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f41190d;

    public C15051d(C32224a<C13598b0> aVar) {
        this.f41190d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarHolder$addView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41190d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarHolder$addView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
