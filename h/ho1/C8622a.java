package ho1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ho1.a */
public final class C8622a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8623b f27732d;

    public C8622a(C8623b bVar) {
        this.f27732d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderProfilePoiDrawer a = this.f27732d.mo9496a();
        int i = RecyclerViewDrawer.f165670y;
        a.mo82540h(true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
