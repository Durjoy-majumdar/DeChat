package ur1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ur1.d */
public final class C14376d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14378f f39929d;

    public C14376d(C14378f fVar) {
        this.f39929d = fVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f39929d.mo13678c().mo4615l();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
