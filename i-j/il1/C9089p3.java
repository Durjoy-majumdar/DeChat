package il1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.p3 */
public final class C9089p3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9048l3 f28664d;

    public C9089p3(C9048l3 l3Var) {
        this.f28664d = l3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9048l3 l3Var = this.f28664d;
        l3Var.f28575o.setVisibility(0);
        l3Var.f28574n.setVisibility(8);
        View view2 = l3Var.f28579s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToInputMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToInputMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l3Var.f28575o.requestFocus();
        EditText editText = l3Var.f28575o;
        editText.setSelection(editText.getText().length());
        Object systemService = l3Var.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(l3Var.f28575o, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
