package il1;

import ak1.C54116w;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C62660c;
import qj1.C63163zd;

/* renamed from: il1.y8 */
public final class C60556y8 implements View.OnClickListener {

    /* renamed from: d */
    public final ViewGroup f172601d;

    /* renamed from: e */
    public final C58124b f172602e;

    /* renamed from: f */
    public final C62660c f172603f;

    public C60556y8(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172601d = viewGroup;
        this.f172602e = bVar;
        this.f172603f = cVar;
        viewGroup.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.le8) {
            ((C54116w) C86312j.m106911c(C54116w.class)).Cy0(String.valueOf(2));
            C63163zd zdVar = (C63163zd) this.f172603f.mo87687E0(C63163zd.class);
            if (zdVar != null) {
                zdVar.mo88085d1(Boolean.TRUE);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
