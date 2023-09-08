package ni2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ni2.a */
public final class C11169a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47260d f32964d;

    public C11169a(C47260d dVar) {
        this.f32964d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remark/selecttext/ui/SelectTextDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32964d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/remark/selecttext/ui/SelectTextDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
