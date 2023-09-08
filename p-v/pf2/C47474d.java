package pf2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49699hg;

/* renamed from: pf2.d */
public final class C47474d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49699hg f127342d;

    /* renamed from: e */
    public final /* synthetic */ C47476e f127343e;

    public C47474d(C49699hg hgVar, C47476e eVar) {
        this.f127342d = hgVar;
        this.f127343e = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/ExpandViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f127342d.f134607i.f137968d.f136680i = true;
        this.f127343e.f127349z.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ExpandViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
