package nb2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import sb2.C63807m;

/* renamed from: nb2.y */
public final class C61673y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63807m f175365d;

    /* renamed from: e */
    public final /* synthetic */ C61646d f175366e;

    public C61673y(C63807m mVar, C61646d dVar) {
        this.f175365d = mVar;
        this.f175366e = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f175365d.mo88605i3(this.f175366e.f175298d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
