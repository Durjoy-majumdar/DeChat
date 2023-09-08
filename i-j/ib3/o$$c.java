package ib3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class o$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98648o f289251d;

    public o$$c(C98648o oVar) {
        this.f289251d = oVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f289251d.f289236D.mo134893x();
        this.f289251d.f289236D.requestFocus();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
