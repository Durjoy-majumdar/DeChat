package lo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import lo3.C109405a;
import ro3.C110588j;

/* renamed from: lo3.b */
public class C109411b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109405a.C109409d f327525d;

    public C109411b(C109405a.C109409d dVar) {
        this.f327525d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null || (view.getTag() instanceof C110588j.C110589b)) {
            int selectionStart = C109405a.this.f327510i.getSelectionStart();
            int selectionEnd = C109405a.this.f327510i.getSelectionEnd();
            String charSequence = C109405a.this.f327510i.getText().subSequence(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd)).toString();
            this.f327525d.f327522e.mo14786b(view, (C110588j.C110589b) view.getTag(), charSequence);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
