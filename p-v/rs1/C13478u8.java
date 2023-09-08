package rs1;

import android.view.View;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;

/* renamed from: rs1.u8 */
public final class C13478u8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38197d;

    public C13478u8(C13146c9 c9Var) {
        this.f38197d = c9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38197d.getIntent().putExtra("finder_username", this.f38197d.f37411d);
        this.f38197d.getIntent().putExtra("KEY_FINDER_SELF_FLAG", true);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f38197d.getActivity(), this.f38197d.getIntent(), 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this.f38197d.getActivity(), this.f38197d.getIntent());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
