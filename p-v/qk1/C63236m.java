package qk1;

import android.view.View;
import android.widget.TextView;
import cj1.C54768h6;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import qk1.C63232l;

/* renamed from: qk1.m */
public final class C63236m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63232l f179446d;

    /* renamed from: e */
    public final /* synthetic */ C63232l.C63233a f179447e;

    /* renamed from: f */
    public final /* synthetic */ C54768h6 f179448f;

    public C63236m(C63232l lVar, C63232l.C63233a aVar, C54768h6 h6Var) {
        this.f179446d = lVar;
        this.f179447e = aVar;
        this.f179448f = h6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f179446d.f179439d.mo90115U0()) {
            C76912y0.makeText(this.f179447e.f44854d.getContext(), (CharSequence) this.f179447e.f44854d.getContext().getResources().getString(C0966R.string.f360530dg0), 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C54768h6 h6Var = this.f179448f;
        h6Var.f153500c = 51;
        this.f179446d.f179439d.mo90118w(h6Var);
        C63232l lVar = this.f179446d;
        TextView textView = this.f179447e.f179441A;
        C87412m.m108593f(textView, "holder.musicFavTips");
        lVar.mo88139F4(textView, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
