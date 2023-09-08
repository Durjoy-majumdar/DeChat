package com.tencent.p014mm.plugin.appbrand.p026ui.recommend;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C40553g0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/SmoothScrollLinerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.SmoothScrollLinerLayoutManager */
public final class SmoothScrollLinerLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final Context f108937v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmoothScrollLinerLayoutManager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f108937v = context;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C40553g0 g0Var = new C40553g0(this.f108937v, this);
        g0Var.f44872a = i;
        startSmoothScroll(g0Var);
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
