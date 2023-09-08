package ib3;

import android.view.View;
import cb3.C92400k;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class o$$a implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f289250d;

    public /* synthetic */ o$$a(int i) {
        this.f289250d = i;
    }

    public final boolean onLongClick(View view) {
        int i = this.f289250d;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", obj, array);
        C92400k.m116191h().mo126398y(i, 0, i, 0);
        C92400k.m116191h().mo126396w();
        C117292a.m165362h(true, new Object(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
