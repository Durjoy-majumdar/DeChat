package ce1;

import android.app.Activity;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import kd1.C9585g;
import te3.C51270sn1;

/* renamed from: ce1.e */
public final class C0460e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0465g f1095d;

    public C0460e(C0465g gVar) {
        this.f1095d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9585g gVar = C9585g.f29823a;
        Activity context = this.f1095d.getContext();
        C0465g gVar2 = this.f1095d;
        long j = gVar2.f1127R;
        C51270sn1 sn12 = (C51270sn1) gVar2.f33564d;
        C9585g.m9267b(gVar, context, j, sn12 != null ? sn12.f141633w : null, (String) null, 8, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$initHeaderView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
