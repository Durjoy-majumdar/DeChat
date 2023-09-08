package ur1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ur1.a */
public final class C65466a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65467c f188388d;

    public C65466a(C65467c cVar) {
        this.f188388d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderFavDrawer b = this.f188388d.mo89579b();
        if (b.mo82541i()) {
            b.mo82540h(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
