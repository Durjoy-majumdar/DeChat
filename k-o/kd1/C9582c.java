package kd1;

import android.content.Context;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import vd1.C65584b;

/* renamed from: kd1.c */
public final class C9582c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f29820d;

    /* renamed from: e */
    public final /* synthetic */ String f29821e;

    public C9582c(C60905o oVar, String str) {
        this.f29820d = oVar;
        this.f29821e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65584b bVar = C65584b.f188718a;
        Context context = this.f29820d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C65584b.m77267d(bVar, context, this.f29821e, (String) null, 4, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/FinderActivityMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
