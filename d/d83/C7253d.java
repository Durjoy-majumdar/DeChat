package d83;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d83.d */
public final class C7253d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97448g f25317d;

    public C7253d(C97448g gVar) {
        this.f25317d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f25317d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
