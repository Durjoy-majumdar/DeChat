package ve1;

import android.view.View;
import cm1.C55032t1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;

/* renamed from: ve1.h7 */
public final class C65602h7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55032t1 f188768d;

    public C65602h7(C55032t1 t1Var) {
        this.f188768d = t1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12413f(this.f188768d.f154491d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
