package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPanelIndicator;", "Landroid/widget/LinearLayout;", "", "indicatorSize", "Lrx3/b0;", "setIndicatorSize", "choosedIndicator", "setCurrentChoosedIndicator", "e", "I", "getINDICATOR_W", "()I", "INDICATOR_W", "f", "getINDICATOR_H", "INDICATOR_H", "g", "getINDICATOR_MARGIN", "INDICATOR_MARGIN", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getIndicatorList", "()Ljava/util/ArrayList;", "indicatorList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator */
public final class FinderLiveGiftPanelIndicator extends LinearLayout {

    /* renamed from: d */
    public final String f15244d = "FinderLiveGiftPanelIndicator";

    /* renamed from: e */
    public final int f15245e;

    /* renamed from: f */
    public final int f15246f;

    /* renamed from: g */
    public final int f15247g;

    /* renamed from: h */
    public final ArrayList<ImageView> f15248h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPanelIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int dimensionPixelOffset = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
        this.f15245e = dimensionPixelOffset;
        this.f15246f = dimensionPixelOffset;
        this.f15247g = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3701bu);
        this.f15248h = new ArrayList<>();
        setOrientation(0);
    }

    public final int getINDICATOR_H() {
        return this.f15246f;
    }

    public final int getINDICATOR_MARGIN() {
        return this.f15247g;
    }

    public final int getINDICATOR_W() {
        return this.f15245e;
    }

    public final ArrayList<ImageView> getIndicatorList() {
        return this.f15248h;
    }

    public final void setCurrentChoosedIndicator(int i) {
        int size = this.f15248h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                this.f15248h.get(i2).setImageResource(C0966R.C0969drawable.f5208zy);
            } else {
                this.f15248h.get(i2).setImageResource(C0966R.C0969drawable.a1o);
            }
        }
    }

    public final void setIndicatorSize(int i) {
        removeAllViews();
        this.f15248h.clear();
        String str = this.f15244d;
        Log.m105924i(str, "setIndicatorSize indicatorSize:" + i);
        if (i >= 2) {
            for (int i2 = 0; i2 < i; i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f15245e, this.f15246f);
                int i3 = this.f15247g;
                layoutParams.setMargins(i3, 0, i3, 0);
                layoutParams.gravity = 16;
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(C0966R.C0969drawable.a1o);
                imageView.setLayoutParams(layoutParams);
                addView(imageView);
                this.f15248h.add(imageView);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftPanelIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int dimensionPixelOffset = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
        this.f15245e = dimensionPixelOffset;
        this.f15246f = dimensionPixelOffset;
        this.f15247g = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3701bu);
        this.f15248h = new ArrayList<>();
        setOrientation(0);
    }
}
