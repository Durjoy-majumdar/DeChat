package kd1;

import android.content.Context;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import qd1.C12156a;
import vd1.C65584b;

/* renamed from: kd1.b */
public final class C9581b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f29818d;

    /* renamed from: e */
    public final /* synthetic */ C12156a f29819e;

    public C9581b(C60905o oVar, C12156a aVar) {
        this.f29818d = oVar;
        this.f29819e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65584b bVar = C65584b.f188718a;
        Context context = this.f29818d.f173499A;
        C87412m.m108593f(context, "holder.context");
        bVar.mo89660c(context, this.f29819e.f35265d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
