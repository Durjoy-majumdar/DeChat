package yh2;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: yh2.k */
public final class C53528k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79120l f150496d;

    public C53528k(C79120l lVar) {
        this.f150496d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog$initNotifySnsBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f150496d.f232345s;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f150496d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog$initNotifySnsBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
