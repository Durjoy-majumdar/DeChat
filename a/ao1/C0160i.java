package ao1;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: ao1.i */
public final class C0160i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0166l f611d;

    public C0160i(C0166l lVar) {
        this.f611d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12925w wVar = this.f611d.f619d;
        if (wVar != null) {
            CheckBox checkBox = (CheckBox) wVar.f36927f.findViewById(C0966R.C0970id.nfd);
            checkBox.setChecked(!checkBox.isChecked());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("bottomSheet");
        throw null;
    }
}
