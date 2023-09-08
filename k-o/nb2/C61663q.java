package nb2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import sb2.C63807m;

/* renamed from: nb2.q */
public final class C61663q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63807m f175337d;

    /* renamed from: e */
    public final /* synthetic */ C61646d f175338e;

    public C61663q(C63807m mVar, C61646d dVar) {
        this.f175337d = mVar;
        this.f175338e = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f175337d.mo88605i3(this.f175338e.f175298d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
