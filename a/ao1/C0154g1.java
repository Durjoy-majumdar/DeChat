package ao1;

import android.view.View;
import ao1.C0157h1;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51270sn1;

/* renamed from: ao1.g1 */
public final class C0154g1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0157h1.C0158a f596d;

    /* renamed from: e */
    public final /* synthetic */ C51270sn1 f597e;

    /* renamed from: f */
    public final /* synthetic */ int f598f;

    public C0154g1(C0157h1.C0158a aVar, C51270sn1 sn12, int i) {
        this.f596d = aVar;
        this.f597e = sn12;
        this.f598f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostTopicUIC$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f596d.f609e.invoke(this.f597e.f141617d, Integer.valueOf(this.f598f + 1));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostTopicUIC$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
