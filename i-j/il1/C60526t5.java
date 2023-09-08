package il1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import mj1.C61491e;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: il1.t5 */
public final class C60526t5 {

    /* renamed from: a */
    public final ViewGroup f172514a;

    /* renamed from: b */
    public final C58124b f172515b;

    /* renamed from: c */
    public final C62660c f172516c;

    /* renamed from: d */
    public boolean f172517d = true;

    /* renamed from: e */
    public final String f172518e = "anchorlive.bottom.multiangle";

    /* renamed from: f */
    public final View f172519f;

    /* renamed from: il1.t5$a */
    public static final class C60527a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60526t5 f172520d;

        public C60527a(C60526t5 t5Var) {
            this.f172520d = t5Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMultiStreamBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61491e.m72198b(C61491e.f174819a, 3, (String) null, (String) null, 6, (Object) null);
            ((C55004v1) this.f172520d.f172516c.mo87696x0(C55004v1.class)).f154435f.postValue(Boolean.TRUE);
            C16217b.f43438a.mo14745b(this.f172520d.f172518e, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMultiStreamBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60526t5(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172514a = viewGroup;
        this.f172515b = bVar;
        this.f172516c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.onb);
        this.f172519f = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.ona);
        viewGroup.setOnClickListener(new C60527a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.multiangle", findViewById, textView, (TextView) null, 16, (Object) null);
    }

    /* renamed from: a */
    public final void mo85493a(boolean z) {
        if (!z || ((C55004v1) this.f172516c.mo87696x0(C55004v1.class)).f154438i.size() <= 1) {
            this.f172514a.setVisibility(8);
            return;
        }
        this.f172514a.setVisibility(0);
        if (this.f172517d) {
            C61491e.m72198b(C61491e.f174819a, 2, (String) null, (String) null, 6, (Object) null);
            this.f172517d = false;
            C16217b.f43438a.mo14751g(this.f172518e);
        }
    }
}
