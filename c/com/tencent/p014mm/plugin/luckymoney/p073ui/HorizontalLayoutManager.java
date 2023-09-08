package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/HorizontalLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.HorizontalLayoutManager */
public final class HorizontalLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public int f162895v;

    /* renamed from: w */
    public boolean f162896w = true;

    public HorizontalLayoutManager(Context context) {
        super(context);
        mo16974W(0);
        setItemPrefetchEnabled(true);
        this.f44689u = 4;
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        C87412m.m108594g(wVar, "state");
        int i = this.f162895v;
        return i > 0 ? i : super.mo16966M(wVar);
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        super.mo16973V(i, i2);
    }

    public boolean canScrollHorizontally() {
        if (this.f162896w) {
            return true;
        }
        return super.canScrollHorizontally();
    }

    public boolean canScrollVertically() {
        return false;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return super.scrollHorizontallyBy(i, rVar, wVar);
    }

    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return super.scrollVerticallyBy(i, rVar, wVar);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
    }
}
