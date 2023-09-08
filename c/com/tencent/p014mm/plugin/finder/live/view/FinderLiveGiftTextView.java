package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kotlin.Metadata;
import ok1.C62042e;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "visibility", "Lrx3/b0;", "setVisibility", "", "getDesiredWidth", "h", "I", "getWIDTH_BROADEN", "()I", "WIDTH_BROADEN", "", "i", "Z", "getMeasureWidthGrowthOnly", "()Z", "setMeasureWidthGrowthOnly", "(Z)V", "measureWidthGrowthOnly", "j", "getCacheMeasureWidth", "setCacheMeasureWidth", "(I)V", "cacheMeasureWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView */
public final class FinderLiveGiftTextView extends AppCompatTextView {

    /* renamed from: g */
    public final String f159767g = "Finder.FinderLiveGiftTextView";

    /* renamed from: h */
    public final int f159768h = C79406f.m96347a(MMApplicationContext.getContext(), 2.0f);

    /* renamed from: i */
    public boolean f159769i;

    /* renamed from: j */
    public int f159770j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final int getCacheMeasureWidth() {
        return this.f159770j;
    }

    public final float getDesiredWidth() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = 0;
        float desiredWidth = Layout.getDesiredWidth(getText().toString(), getPaint()) + ((float) this.f159768h) + ((float) getPaddingLeft()) + ((float) getPaddingRight()) + ((float) (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0));
        if (marginLayoutParams != null) {
            i = marginLayoutParams.rightMargin;
        }
        return desiredWidth + ((float) i);
    }

    public final boolean getMeasureWidthGrowthOnly() {
        return this.f159769i;
    }

    public final int getWIDTH_BROADEN() {
        return this.f159768h;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f159769i) {
            int measuredWidth2 = getMeasuredWidth();
            int i3 = this.f159770j;
            if (measuredWidth2 > i3) {
                this.f159770j = getMeasuredWidth();
            } else {
                measuredWidth = i3;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth + this.f159768h, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), View.MeasureSpec.getMode(i2)));
        C62042e eVar = C62042e.f176370a;
        String str = this.f159767g;
        eVar.mo86998D1(str, "measureWidthGrowthOnly:" + this.f159769i + ", measuredWidth:" + getMeasuredWidth() + "-cacheMeasureWidth:" + this.f159770j + ",measuredHeight:" + getMeasuredHeight());
    }

    public final void setCacheMeasureWidth(int i) {
        this.f159770j = i;
    }

    public final void setMeasureWidthGrowthOnly(boolean z) {
        this.f159769i = z;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f159770j = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTextView(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }
}
