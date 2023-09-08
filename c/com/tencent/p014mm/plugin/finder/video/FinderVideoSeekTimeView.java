package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;
import uc1.C14153w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoSeekTimeView;", "Landroid/widget/LinearLayout;", "", "color", "Lrx3/b0;", "setTextColor", "setHintTextColor", "sec", "setSumTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoSeekTimeView */
public final class FinderVideoSeekTimeView extends LinearLayout {

    /* renamed from: d */
    public int f17587d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f17588e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final TextView f17589f;

    /* renamed from: g */
    public final TextView f17590g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoSeekTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        TextView textView = new TextView(getContext());
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f17589f = textView;
        TextView textView2 = new TextView(getContext());
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        this.f17590g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        mo4339b(attributeSet, 0);
    }

    /* renamed from: a */
    public final String mo4338a(int i) {
        long j = (long) i;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: b */
    public final void mo4339b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14153w.f39587f, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…eekTimeView, defStyle, 0)");
        this.f17587d = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        this.f17588e = obtainStyledAttributes.getColor(0, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            float f = (float) dimensionPixelSize;
            this.f17589f.setTextSize(0, f);
            this.f17590g.setTextSize(0, f);
        }
        int i2 = this.f17587d;
        if (i2 != Integer.MIN_VALUE) {
            setTextColor(i2);
        }
        int i3 = this.f17588e;
        if (i3 != Integer.MIN_VALUE) {
            setHintTextColor(i3);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setCurrentTime(int i) {
        this.f17589f.setText(mo4338a(i));
    }

    public final void setHintTextColor(int i) {
        this.f17590g.setTextColor(i);
    }

    public final void setSumTime(int i) {
        TextView textView = this.f17590g;
        textView.setText(" / " + mo4338a(i));
    }

    public final void setTextColor(int i) {
        this.f17589f.setTextColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoSeekTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        TextView textView = new TextView(getContext());
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f17589f = textView;
        TextView textView2 = new TextView(getContext());
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        this.f17590g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        mo4339b(attributeSet, i);
    }
}
