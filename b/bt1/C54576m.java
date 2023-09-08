package bt1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt1.m */
public final class C54576m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153031d;

    public C54576m(C54585t tVar) {
        this.f153031d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((PostMainUIC) C39818r.f106831a.mo62443b(this.f153031d.f152933a).mo75002a(PostMainUIC.class)).mo78427i3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
