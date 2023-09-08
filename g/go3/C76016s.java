package go3;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMCollapsibleTextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: go3.s */
public final class C76016s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMCollapsibleTextView f222874d;

    public C76016s(MMCollapsibleTextView mMCollapsibleTextView) {
        this.f222874d = mMCollapsibleTextView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/MMCollapsibleTextView$setupCollapseButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMCollapsibleTextView.m89798s(this.f222874d);
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/MMCollapsibleTextView$setupCollapseButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
