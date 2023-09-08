package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardRefreshLoadMoreLayout;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CardRefreshLoadMoreLayout */
public final class CardRefreshLoadMoreLayout extends RefreshLoadMoreLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardRefreshLoadMoreLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: f */
    public void mo77109f(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i, int i2, boolean z, boolean z2, int[] iArr, int i3, boolean z3) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
        C87412m.m108594g(iArr, "consumed");
        if (i3 == 1 && mo82393d(recyclerView) && this.f165603D) {
            recyclerView.mo17155w1();
        }
        super.mo77109f(recyclerView, headFooterLayout, i, i2, z, z2, iArr, i3, z3);
    }

    /* renamed from: h */
    public void mo77110h(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
        super.mo77110h(recyclerView, headFooterLayout, i);
        if (i != 0) {
            if (i == 1 && mo82393d(recyclerView) && this.f165603D && this.f165609J) {
                recyclerView.mo17155w1();
                mo82475s(0);
            }
        } else if (RefreshLoadMoreLayout.m66895A(this, false, (String) null, 3, (Object) null) && this.f165603D && this.f165609J) {
            recyclerView.mo17155w1();
            mo82475s(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardRefreshLoadMoreLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
    }
}
