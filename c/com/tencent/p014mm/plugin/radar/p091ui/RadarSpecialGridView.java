package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$a;", "i", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$a;", "getOnItemClickListener", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$a;", "setOnItemClickListener", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$a;)V", "onItemClickListener", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "j", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "getMTable", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "setMTable", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;)V", "mTable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialGridView */
public final class RadarSpecialGridView extends RadarSpecialSmoothScrollView implements C111847h {

    /* renamed from: i */
    public C5030a f20347i;

    /* renamed from: j */
    public RadarSpecialTableLayout f20348j;

    /* renamed from: n */
    public int f20349n;

    /* renamed from: o */
    public int f20350o;

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialGridView$a */
    public interface C5030a {
        /* renamed from: a */
        void mo5988a(int i, View view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarSpecialGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        setMTable(new RadarSpecialTableLayout(context2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        getMTable().setLayoutParams(layoutParams);
        getMTable().setStretchAllColumns(true);
        getMTable().setShrinkAllColumns(true);
        getMTable().setGravity(80);
        addView(getMTable());
    }

    public final RadarSpecialTableLayout getMTable() {
        RadarSpecialTableLayout radarSpecialTableLayout = this.f20348j;
        if (radarSpecialTableLayout != null) {
            return radarSpecialTableLayout;
        }
        C87412m.m108603p("mTable");
        throw null;
    }

    public final C5030a getOnItemClickListener() {
        return this.f20347i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i5 = (getScrollX() + childAt.getWidth()) - this.f20350o;
            this.f20350o = childAt.getWidth();
            if (i5 <= 0) {
                i5 = 0;
            }
        } else {
            i5 = getScrollX();
        }
        if (getChildCount() > 0) {
            View childAt2 = getChildAt(0);
            int scrollY = (getScrollY() + childAt2.getHeight()) - this.f20349n;
            this.f20349n = childAt2.getHeight();
            if (scrollY > 0) {
                i6 = scrollY;
            }
        } else {
            i6 = getScrollY();
        }
        scrollTo(i5, i6);
    }

    public final void setMTable(RadarSpecialTableLayout radarSpecialTableLayout) {
        C87412m.m108594g(radarSpecialTableLayout, "<set-?>");
        this.f20348j = radarSpecialTableLayout;
    }

    public final void setOnItemClickListener(C5030a aVar) {
        this.f20347i = aVar;
    }
}
