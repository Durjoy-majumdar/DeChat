package ib3;

import android.view.View;
import cb3.C92400k;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ib3.l */
public final class C98645l implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f289227d;

    /* renamed from: e */
    public final /* synthetic */ int f289228e;

    public C98645l(int i, int i2) {
        this.f289227d = i;
        this.f289228e = i2;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i = this.f289227d + 1;
        C92400k h = C92400k.m116191h();
        int i2 = this.f289228e;
        h.mo126398y(i2, i, i2, i);
        C92400k.m116191h().mo126396w();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
