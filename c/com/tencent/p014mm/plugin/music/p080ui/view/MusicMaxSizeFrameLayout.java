package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ca2.C0441d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicMaxSizeFrameLayout;", "Landroid/widget/FrameLayout;", "", "maxHeight", "Lrx3/b0;", "setMaxHeight", "maxWidth", "setMaxWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicMaxSizeFrameLayout */
public final class MusicMaxSizeFrameLayout extends FrameLayout {

    /* renamed from: d */
    public int f20043d;

    /* renamed from: e */
    public int f20044e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMaxSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo5840a(attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo5840a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0441d.f1066b, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FrameLayout, defStyle, 0)");
            this.f20043d = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            this.f20044e = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
            Log.m105924i("Music.MusicMaxSizeFrameLayout", "[initAttribute],maxHeight:" + this.f20043d + ", maxWidth:" + this.f20044e);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f20043d >= 0 || this.f20044e >= 0) {
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int i3 = this.f20043d;
            if (measuredHeight2 > i3) {
                measuredHeight = i3;
            }
            int measuredWidth2 = getMeasuredWidth();
            int i4 = this.f20044e;
            if (measuredWidth2 > i4) {
                measuredWidth = i4;
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public final void setMaxHeight(int i) {
        this.f20043d = i;
    }

    public final void setMaxWidth(int i) {
        this.f20044e = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMaxSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo5840a(attributeSet, i);
    }
}
