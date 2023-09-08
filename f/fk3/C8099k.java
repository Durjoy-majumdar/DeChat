package fk3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fk3.k */
public final class C8099k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8097j f26955d;

    /* renamed from: e */
    public final /* synthetic */ int f26956e;

    public C8099k(C8097j jVar, int i) {
        this.f26955d = jVar;
        this.f26956e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQuerySugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26955d.f26953e.invoke(Integer.valueOf(this.f26956e));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQuerySugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
