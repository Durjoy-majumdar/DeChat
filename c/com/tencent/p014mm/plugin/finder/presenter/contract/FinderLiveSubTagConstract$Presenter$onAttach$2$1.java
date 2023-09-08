package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55036w0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import te3.C64848y91;
import ve1.C65666s4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter$onAttach$2$1", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$2$1 */
public final class FinderLiveSubTagConstract$Presenter$onAttach$2$1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSubTagConstract.Presenter f160354d;

    public FinderLiveSubTagConstract$Presenter$onAttach$2$1(FinderLiveSubTagConstract.Presenter presenter) {
        this.f160354d = presenter;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        String str;
        C64848y91 y912;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        if (oVar.f173503E != null) {
            FinderLiveSubTagConstract.Presenter presenter = this.f160354d;
            C64848y91 y913 = new C64848y91();
            FinderLiveSubTagConstract.Presenter presenter2 = this.f160354d;
            C64848y91 y914 = presenter2.f160339d;
            int i2 = 0;
            y913.f186453d = y914 != null ? y914.f186453d : 0;
            if (y914 == null || (str = y914.f186454e) == null) {
                str = "";
            }
            y913.f186454e = str;
            String str2 = null;
            y913.f186455f = y914 != null ? y914.f186455f : null;
            y913.f186456g = ((C55036w0) oVar.f173503E).f154513d;
            if (y914 != null) {
                i2 = y914.f186458i;
            }
            y913.f186458i = i2;
            presenter.f160344i = y913;
            FinderLiveSubTagConstract.ViewCallback viewCallback = presenter2.f160346n;
            if (viewCallback != null) {
                viewCallback.mo78464p();
            }
            FinderLiveSubTagConstract.Presenter presenter3 = this.f160354d;
            C65666s4 s4Var = presenter3.f160345j;
            if (s4Var != null) {
                s4Var.f188949e = presenter3.f160344i;
                eVar.notifyDataSetChanged();
                StringBuilder sb = new StringBuilder();
                sb.append("sub tag item click. selectedTag:[");
                C64848y91 y915 = this.f160354d.f160344i;
                sb.append(y915 != null ? y915.f186454e : null);
                sb.append('-');
                C64848y91 y916 = this.f160354d.f160344i;
                if (!(y916 == null || (y912 = y916.f186456g) == null)) {
                    str2 = y912.f186454e;
                }
                sb.append(str2);
                sb.append(']');
                Log.m105924i("FinderLiveSubTagConstract.Presenter", sb.toString());
                return;
            }
            C87412m.m108603p("convert");
            throw null;
        }
    }
}
