package com.tencent.p014mm.plugin.finder.record.plugin;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/record/plugin/DynMarginLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.record.plugin.DynMarginLayoutManager */
public class DynMarginLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public final int f160692v;

    /* renamed from: w */
    public final int f160693w;

    /* renamed from: x */
    public final int f160694x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynMarginLayoutManager(Context context, int i) {
        super(context, 0, false);
        C87412m.m108594g(context, "context");
        this.f160692v = i;
        this.f160693w = context.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
        this.f160694x = context.getResources().getDimensionPixelSize(C0966R.dimen.f3758d_);
    }

    /* renamed from: c0 */
    public final void mo78562c0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int left = (childAt.getLeft() + childAt.getRight()) / 2;
                int i2 = this.f160692v;
                int i3 = this.f160694x;
                childAt.setTranslationX((float) (left < i2 - i3 ? -this.f160693w : left > i2 + i3 ? this.f160693w : ((left - i2) * this.f160693w) / i3));
                Log.m105918d("MicroMsg.FinderTemplateListPlugin", "center: " + left + " tx: " + childAt.getTranslationX() + " ao: " + this.f160692v + " mr: " + this.f160694x + " mo: " + this.f160693w);
            }
        }
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
        mo78562c0();
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        mo78562c0();
        return scrollHorizontallyBy;
    }
}
