package ro3;

import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ro3.q */
public final class C77564q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226128d;

    public C77564q(C110588j jVar) {
        this.f226128d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f226128d.f330851z) {
            C85975v4.m106306c("SelectableEditTextHelper", "onClick", new Object[0]);
            this.f226128d.mo162139j(true);
        }
        View.OnClickListener onClickListener = this.f226128d.f330843r;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
