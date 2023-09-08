package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import p204mr.C11078h;
import sx3.C110818d0;
import te3.C48682a91;
import te3.C49712hj1;
import te3.C52231z81;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView;", "Landroid/widget/LinearLayout;", "Lte3/hj1;", "d", "Lte3/hj1;", "getReportObj", "()Lte3/hj1;", "setReportObj", "(Lte3/hj1;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView */
public final class FinderLiveAfterPluginRecommendLiveView extends LinearLayout {

    /* renamed from: d */
    public C49712hj1 f15202d;

    /* renamed from: e */
    public SimpleLivingCardView f15203e;

    /* renamed from: f */
    public SimpleLivingCardView f15204f;

    /* renamed from: g */
    public TextView f15205g;

    /* renamed from: h */
    public View f15206h;

    /* renamed from: i */
    public TextView f15207i;

    /* renamed from: j */
    public C48682a91 f15208j;

    /* renamed from: n */
    public C11078h f15209n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAfterPluginRecommendLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.b1k, this);
        View findViewById = findViewById(C0966R.C0970id.k9b);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_one)");
        this.f15203e = (SimpleLivingCardView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k_m);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_two)");
        this.f15204f = (SimpleLivingCardView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.mmp);
        C87412m.m108593f(findViewById3, "findViewById(R.id.tv_recommend_title)");
        this.f15205g = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.mml);
        C87412m.m108593f(findViewById4, "findViewById(R.id.to_live_square_btn)");
        this.f15206h = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.mmm);
        C87412m.m108593f(findViewById5, "findViewById(R.id.to_live_square_btn_text)");
        this.f15207i = (TextView) findViewById5;
    }

    /* renamed from: a */
    public final void mo3248a() {
        C48682a91 a912;
        FinderObject finderObject;
        C11078h hVar;
        FinderObject finderObject2;
        C11078h hVar2;
        if (isShown() && (a912 = this.f15208j) != null) {
            LinkedList<C52231z81> linkedList = a912.f130381h;
            C87412m.m108593f(linkedList, "it.card_list");
            C52231z81 z812 = (C52231z81) C110818d0.m150917O(linkedList, 0);
            if (!(z812 == null || (finderObject2 = z812.f145756f) == null || (hVar2 = this.f15209n) == null)) {
                C11078h.C11079a.m10985a(hVar2, finderObject2, this.f15203e, (C32224a) null, (C32224a) null, (C32227p) null, 28, (Object) null);
            }
            LinkedList<C52231z81> linkedList2 = a912.f130381h;
            C87412m.m108593f(linkedList2, "it.card_list");
            C52231z81 z813 = (C52231z81) C110818d0.m150917O(linkedList2, 1);
            if (z813 != null && (finderObject = z813.f145756f) != null && (hVar = this.f15209n) != null) {
                C11078h.C11079a.m10985a(hVar, finderObject, this.f15204f, (C32224a) null, (C32224a) null, (C32227p) null, 28, (Object) null);
            }
        }
    }

    public final C49712hj1 getReportObj() {
        return this.f15202d;
    }

    public final void setReportObj(C49712hj1 hj12) {
        this.f15202d = hj12;
    }
}
