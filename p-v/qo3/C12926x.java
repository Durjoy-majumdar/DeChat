package qo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.x */
public class C12926x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f36950d;

    public C12926x(C12925w wVar) {
        this.f36950d = wVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f36950d.mo5085n();
        this.f36950d.getClass();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
