package com.tencent.p014mm.plugin.finder.view.manager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderAutoScrollLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderAutoScrollLayoutManager */
public final class FinderAutoScrollLayoutManager extends LinearLayoutManager {

    /* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderAutoScrollLayoutManager$a */
    public static final class C56638a extends C54256s {
        public C56638a(Context context) {
            super(context);
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            int i = mo74664i(view, mo65616n());
            int j = mo74665j(view, mo10341o());
            double d = (double) j;
            int m = mo10340m((int) Math.sqrt(((double) (i * i)) + (d * d)));
            if (m > 0) {
                aVar.mo17388b(-i, -j, m, this.f152289h);
            }
        }

        /* renamed from: h */
        public int mo6715h(int i, int i2, int i3, int i4, int i5) {
            return i4 - i2;
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 4000.0f / ((float) displayMetrics.widthPixels);
        }

        /* renamed from: l */
        public int mo10339l(int i) {
            return mo10340m(i);
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C56638a aVar = new C56638a(recyclerView != null ? recyclerView.getContext() : null);
        if (i >= 0) {
            aVar.f44872a = i;
            startSmoothScroll(aVar);
            return;
        }
        Log.m105920e("Finder.AutoScrollLayoutManager", "Invalid target position");
    }
}
