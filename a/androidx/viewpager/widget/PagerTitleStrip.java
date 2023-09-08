package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C103852e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: u */
    public static final int[] f306808u = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: v */
    public static final int[] f306809v = {16843660};

    /* renamed from: d */
    public ViewPager f306810d;

    /* renamed from: e */
    public TextView f306811e;

    /* renamed from: f */
    public TextView f306812f;

    /* renamed from: g */
    public TextView f306813g;

    /* renamed from: h */
    public int f306814h = -1;

    /* renamed from: i */
    public float f306815i = -1.0f;

    /* renamed from: j */
    public int f306816j;

    /* renamed from: n */
    public int f306817n;

    /* renamed from: o */
    public boolean f306818o;

    /* renamed from: p */
    public boolean f306819p;

    /* renamed from: q */
    public final C103842a f306820q = new C103842a();

    /* renamed from: r */
    public WeakReference<C103853a> f306821r;

    /* renamed from: s */
    public int f306822s;

    /* renamed from: t */
    public int f306823t;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C103842a extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.C103849g {

        /* renamed from: d */
        public int f306824d;

        public C103842a() {
        }

        /* renamed from: a */
        public void mo145400a(ViewPager viewPager, C103853a aVar, C103853a aVar2) {
            PagerTitleStrip.this.mo145389a(aVar, aVar2);
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo145390b(pagerTitleStrip.f306810d.getCurrentItem(), PagerTitleStrip.this.f306810d.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f306815i;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo145373c(pagerTitleStrip2.f306810d.getCurrentItem(), f, true);
        }

        public void onPageScrollStateChanged(int i) {
            this.f306824d = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo145373c(i, f, false);
        }

        public void onPageSelected(int i) {
            if (this.f306824d == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo145390b(pagerTitleStrip.f306810d.getCurrentItem(), PagerTitleStrip.this.f306810d.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f306815i;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo145373c(pagerTitleStrip2.f306810d.getCurrentItem(), f, true);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C103843b extends SingleLineTransformationMethod {

        /* renamed from: d */
        public Locale f306826d;

        public C103843b(Context context) {
            this.f306826d = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f306826d);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.f306811e = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f306812f = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f306813g = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f306808u);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C103733h.m138110g(this.f306811e, resourceId);
            C103733h.m138110g(this.f306812f, resourceId);
            C103733h.m138110g(this.f306813g, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            this.f306811e.setTextSize(0, f);
            this.f306812f.setTextSize(0, f);
            this.f306813g.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f306811e.setTextColor(color);
            this.f306812f.setTextColor(color);
            this.f306813g.setTextColor(color);
        }
        this.f306817n = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f306823t = this.f306812f.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f306811e.setEllipsize(TextUtils.TruncateAt.END);
        this.f306812f.setEllipsize(TextUtils.TruncateAt.END);
        this.f306813g.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f306809v);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f306811e);
            setSingleLineAllCaps(this.f306812f);
            setSingleLineAllCaps(this.f306813g);
        } else {
            this.f306811e.setSingleLine();
            this.f306812f.setSingleLine();
            this.f306813g.setSingleLine();
        }
        this.f306816j = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C103843b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo145389a(C103853a aVar, C103853a aVar2) {
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.f306820q);
            this.f306821r = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(this.f306820q);
            this.f306821r = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f306810d;
        if (viewPager != null) {
            this.f306814h = -1;
            this.f306815i = -1.0f;
            mo145390b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo145390b(int i, C103853a aVar) {
        int count = aVar != null ? aVar.getCount() : 0;
        this.f306818o = true;
        CharSequence charSequence = null;
        this.f306811e.setText((i < 1 || aVar == null) ? null : aVar.getPageTitle(i - 1));
        this.f306812f.setText((aVar == null || i >= count) ? null : aVar.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && aVar != null) {
            charSequence = aVar.getPageTitle(i2);
        }
        this.f306813g.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f306811e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f306812f.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f306813g.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f306814h = i;
        if (!this.f306819p) {
            mo145373c(i, this.f306815i, false);
        }
        this.f306818o = false;
    }

    /* renamed from: c */
    public void mo145373c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f306814h) {
            mo145390b(i6, this.f306810d.getAdapter());
        } else if (!z && f2 == this.f306815i) {
            return;
        }
        this.f306819p = true;
        int measuredWidth = this.f306811e.getMeasuredWidth();
        int measuredWidth2 = this.f306812f.getMeasuredWidth();
        int measuredWidth3 = this.f306813g.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i15 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i16 = measuredWidth2 + i15;
        int baseline = this.f306811e.getBaseline();
        int baseline2 = this.f306812f.getBaseline();
        int baseline3 = this.f306813g.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i17 = max - baseline;
        int i18 = max - baseline2;
        int i19 = max - baseline3;
        int i25 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f306811e.getMeasuredHeight() + i17, this.f306812f.getMeasuredHeight() + i18), this.f306813g.getMeasuredHeight() + i19);
        int i26 = this.f306817n & 112;
        if (i26 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i26 != 80) {
            i4 = i17 + paddingTop;
            i2 = i18 + paddingTop;
            i3 = paddingTop + i19;
            TextView textView = this.f306812f;
            textView.layout(i15, i2, i16, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i15 - this.f306816j) - measuredWidth);
            TextView textView2 = this.f306811e;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i25, i16 + this.f306816j);
            TextView textView3 = this.f306813g;
            textView3.layout(max3, i3, max3 + i25, textView3.getMeasuredHeight() + i3);
            this.f306815i = f;
            this.f306819p = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i17 + i5;
        i2 = i18 + i5;
        i3 = i5 + i19;
        TextView textView4 = this.f306812f;
        textView4.layout(i15, i2, i16, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i15 - this.f306816j) - measuredWidth);
        TextView textView22 = this.f306811e;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i25, i16 + this.f306816j);
        TextView textView32 = this.f306813g;
        textView32.layout(max32, i3, max32 + i25, textView32.getMeasuredHeight() + i3);
        this.f306815i = f;
        this.f306819p = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f306816j;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C103853a adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f306820q);
            viewPager.addOnAdapterChangeListener(this.f306820q);
            this.f306810d = viewPager;
            WeakReference<C103853a> weakReference = this.f306821r;
            mo145389a(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f306810d;
        if (viewPager != null) {
            mo145389a(viewPager.getAdapter(), (C103853a) null);
            this.f306810d.setInternalPageChangeListener((ViewPager.OnPageChangeListener) null);
            this.f306810d.removeOnAdapterChangeListener(this.f306820q);
            this.f306810d = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f306810d != null) {
            float f = this.f306815i;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo145373c(this.f306814h, f, true);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f306811e.measure(childMeasureSpec2, childMeasureSpec);
            this.f306812f.measure(childMeasureSpec2, childMeasureSpec);
            this.f306813g.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f306812f.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f306812f.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f306818o) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f306817n = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f306822s = i;
        int i2 = (i << 24) | (this.f306823t & 16777215);
        this.f306811e.setTextColor(i2);
        this.f306813g.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f306823t = i;
        this.f306812f.setTextColor(i);
        int i2 = (this.f306822s << 24) | (this.f306823t & 16777215);
        this.f306811e.setTextColor(i2);
        this.f306813g.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f306816j = i;
        requestLayout();
    }
}
