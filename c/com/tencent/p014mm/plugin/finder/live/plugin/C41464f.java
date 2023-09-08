package com.tencent.p014mm.plugin.finder.live.plugin;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C39975j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;
import vg1.C52899g;
import vg1.C52903i;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.f */
public final class C41464f extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBoxCommentPlugin f111654d;

    public C41464f(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
        this.f111654d = finderLiveBoxCommentPlugin;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = this.f111654d.mo64542Z0().getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int E = ((LinearLayoutManager) layoutManager).mo16959E();
        C52899g c1 = this.f111654d.mo64545c1();
        long j = (long) E;
        long j2 = this.f111654d.mo64545c1().f147730c;
        if (j < j2) {
            j = j2;
        }
        c1.f147730c = j;
        ((C39975j) this.f111654d.mo87696x0(C39975j.class)).mo62584l3(E == this.f111654d.mo64544b1() - 1);
        if (E == this.f111654d.mo64544b1() - 1) {
            Object value = ((C36570n) ((C52903i) ((C36570n) this.f111654d.f111641z).getValue()).f147737c).getValue();
            C87412m.m108593f(value, "<get-newTipGroup>(...)");
            ((ViewGroup) value).setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBoxCommentPlugin$scrollListener$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
