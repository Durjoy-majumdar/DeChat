package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import t40.C77853a;
import zp3.C23571u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/B!\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b.\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016R\"\u0010\u0019\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/view/MediaBannerIndicator;", "Landroid/widget/LinearLayout;", "Lzp3/u;", "", "isShow", "Lrx3/b0;", "setShowOnlyOneIndicator", "", "value", "setCount", "getCount", "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lzp3/u$a;", "listener", "setOnSelectedPageListener", "getOnSelectedPageListener", "d", "I", "getIndicatorWidth", "()I", "setIndicatorWidth", "(I)V", "indicatorWidth", "e", "getIndicatorMargin", "setIndicatorMargin", "indicatorMargin", "Landroid/graphics/drawable/Drawable;", "f", "Landroid/graphics/drawable/Drawable;", "getSelectDrawable", "()Landroid/graphics/drawable/Drawable;", "setSelectDrawable", "(Landroid/graphics/drawable/Drawable;)V", "selectDrawable", "g", "getUnSelectDrawable", "setUnSelectDrawable", "unSelectDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.MediaBannerIndicator */
public class MediaBannerIndicator extends LinearLayout implements C23571u {

    /* renamed from: d */
    public int f220859d = ((int) getResources().getDimension(C0966R.dimen.abm));

    /* renamed from: e */
    public int f220860e = ((int) getResources().getDimension(C0966R.dimen.f3703bv));

    /* renamed from: f */
    public Drawable f220861f = getContext().getDrawable(C0966R.C0969drawable.aqj);

    /* renamed from: g */
    public Drawable f220862g = getContext().getDrawable(C0966R.C0969drawable.a8f);

    /* renamed from: h */
    public boolean f220863h;

    /* renamed from: i */
    public int f220864i;

    /* renamed from: j */
    public int f220865j;

    /* renamed from: n */
    public C23571u.C23572a f220866n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setOrientation(0);
        setGravity(17);
    }

    /* renamed from: b */
    private final void m90031b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226873s, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…erIndicator, defStyle, 0)");
        setIndicatorMargin((int) obtainStyledAttributes.getDimension(0, getResources().getDimension(C0966R.dimen.f3703bv)));
        setIndicatorWidth((int) obtainStyledAttributes.getDimension(3, getResources().getDimension(C0966R.dimen.abm)));
        if (obtainStyledAttributes.hasValue(1)) {
            setSelectDrawable(obtainStyledAttributes.getDrawable(1));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setUnSelectDrawable(obtainStyledAttributes.getDrawable(2));
        }
        obtainStyledAttributes.recycle();
    }

    public int getCount() {
        return this.f220864i;
    }

    public int getCurrentIndex() {
        return this.f220865j;
    }

    public int getIndicatorMargin() {
        return this.f220860e;
    }

    public int getIndicatorWidth() {
        return this.f220859d;
    }

    public C23571u.C23572a getOnSelectedPageListener() {
        return this.f220866n;
    }

    public Drawable getSelectDrawable() {
        return this.f220861f;
    }

    public Drawable getUnSelectDrawable() {
        return this.f220862g;
    }

    public View getView() {
        return this;
    }

    public void setCount(int i) {
        removeAllViews();
        this.f220864i = i;
        if (i > 1 || (i > 0 && this.f220863h)) {
            setVisibility(0);
            this.f220865j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (this.f220865j == i2) {
                    imageView.setImageDrawable(getSelectDrawable());
                } else {
                    imageView.setImageDrawable(getUnSelectDrawable());
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getIndicatorWidth(), getIndicatorWidth());
                layoutParams.leftMargin = getIndicatorMargin();
                layoutParams.rightMargin = getIndicatorMargin();
                layoutParams.gravity = 17;
                addView(imageView, layoutParams);
            }
            return;
        }
        setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentIndex(int r4) {
        /*
            r3 = this;
            int r0 = r3.f220865j
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof android.widget.ImageView
            r2 = 0
            if (r1 == 0) goto L_0x000e
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x002c
            android.graphics.drawable.Drawable r1 = r3.getUnSelectDrawable()
            r0.setImageDrawable(r1)
            android.view.View r0 = r3.getChildAt(r4)
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L_0x0023
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
        L_0x0023:
            if (r2 == 0) goto L_0x002c
            android.graphics.drawable.Drawable r0 = r3.getSelectDrawable()
            r2.setImageDrawable(r0)
        L_0x002c:
            r3.f220865j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.MediaBannerIndicator.setCurrentIndex(int):void");
    }

    public void setIndicatorMargin(int i) {
        this.f220860e = i;
    }

    public void setIndicatorWidth(int i) {
        this.f220859d = i;
    }

    public void setOnSelectedPageListener(C23571u.C23572a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f220866n = aVar;
    }

    public void setSelectDrawable(Drawable drawable) {
        this.f220861f = drawable;
    }

    public void setShowOnlyOneIndicator(boolean z) {
        this.f220863h = z;
    }

    public void setUnSelectDrawable(Drawable drawable) {
        this.f220862g = drawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setOrientation(0);
        setGravity(17);
        m90031b(attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setOrientation(0);
        setGravity(17);
        m90031b(attributeSet, i);
    }
}
