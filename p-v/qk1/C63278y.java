package qk1;

import android.content.Context;
import android.view.View;
import cj1.C54785k6;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63257t;
import rx3.C13598b0;

/* renamed from: qk1.y */
public final class C63278y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63257t f179591d;

    /* renamed from: e */
    public final /* synthetic */ C63257t.C63258a f179592e;

    /* renamed from: f */
    public final /* synthetic */ int f179593f;

    public C63278y(C63257t tVar, C63257t.C63258a aVar, int i) {
        this.f179591d = tVar;
        this.f179592e = aVar;
        this.f179593f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63257t tVar = this.f179591d;
        Context context = this.f179592e.f179525z.getContext();
        C87412m.m108593f(context, "holder.addMask.context");
        if (tVar.mo88161F4(context)) {
            this.f179591d.f179507g.get(this.f179593f).f153568c = 3;
            this.f179591d.notifyItemChanged(this.f179593f);
            C63257t tVar2 = this.f179591d;
            tVar2.f179515r = true;
            if (this.f179593f < tVar2.f179508h) {
                tVar2.f179507g.add(new C54785k6("", 0, 1, false, false, false, false, (String) null, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (C8480h) null));
                C63257t tVar3 = this.f179591d;
                C32226l<? super Integer, C13598b0> lVar = tVar3.f179510j;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(tVar3.f179507g.size() - 1));
                }
                C63257t tVar4 = this.f179591d;
                tVar4.notifyItemInserted(tVar4.getItemCount());
                C63257t tVar5 = this.f179591d;
                tVar5.notifyItemChanged(tVar5.getItemCount());
                this.f179592e.f179524E.setVisibility(8);
            } else {
                this.f179592e.f179524E.setVisibility(0);
                this.f179591d.getClass();
            }
            C63257t tVar6 = this.f179591d;
            C32226l<? super Integer, C13598b0> lVar2 = tVar6.f179512o;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(tVar6.f179507g.size() - 1));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
