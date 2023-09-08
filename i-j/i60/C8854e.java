package i60;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i60.e */
public final class C8854e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46170d f28105d;

    public C8854e(C46170d dVar, int i) {
        this.f28105d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/view/adapter/LiveCommentAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28105d.getClass();
        C117292a.m165361g(this, "com/tencent/mm/live/view/adapter/LiveCommentAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
