package com.tencent.p014mm.plugin.finder.live.widget.manager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54943a1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/manager/FinderLiveMsgLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager */
public final class FinderLiveMsgLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final String f160136v = "FinderLiveMsgLinearLayoutManager";

    /* renamed from: w */
    public Context f160137w;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager$a */
    public static final class C56147a extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ FinderLiveMsgLinearLayoutManager f160138n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56147a(FinderLiveMsgLinearLayoutManager finderLiveMsgLinearLayoutManager, Context context) {
            super(context);
            this.f160138n = finderLiveMsgLinearLayoutManager;
        }

        /* renamed from: j */
        public int mo74665j(View view, int i) {
            int j = super.mo74665j(view, i);
            String str = this.f160138n.f160136v;
            Log.m105924i(str, "[calculateDyToMakeVisible] dy = " + j);
            return j;
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            int i = C54943a1.f153974o;
            return ((float) C54943a1.f153974o) / ((float) displayMetrics.densityDpi);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMsgLinearLayoutManager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f160137w = context;
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        Context context = this.f160137w;
        if (context != null) {
            C56147a aVar = new C56147a(this, context);
            aVar.f44872a = i;
            startSmoothScroll(aVar);
            return;
        }
        C87412m.m108603p("context");
        throw null;
    }
}
