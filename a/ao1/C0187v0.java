package ao1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ao1.v0 */
public final class C0187v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f652d;

    public C0187v0(PostMainUIC postMainUIC) {
        this.f652d = postMainUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostMainUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f652d.mo78428j3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
