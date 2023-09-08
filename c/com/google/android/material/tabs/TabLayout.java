package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.core.widget.C103733h;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1115h.C107922a;
import p1139o8.C109991k;
import p1139o8.C109992l;
import p1145q8.C110368a;
import p1162x2.C112019a;
import p161h8.C108164a;
import p329d3.C106985e;
import p329d3.C106986f;
import p329d3.C86167d;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107205s;
import p849e3.C107207u;

@ViewPager.C103852e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: V */
    public static final C86167d<C55061f> f309480V = new C106986f(16);

    /* renamed from: A */
    public final int f309481A;

    /* renamed from: B */
    public int f309482B;

    /* renamed from: C */
    public int f309483C;

    /* renamed from: D */
    public int f309484D;

    /* renamed from: E */
    public int f309485E;

    /* renamed from: F */
    public int f309486F;

    /* renamed from: G */
    public boolean f309487G;

    /* renamed from: H */
    public boolean f309488H;

    /* renamed from: I */
    public boolean f309489I;

    /* renamed from: J */
    public C104470c f309490J;

    /* renamed from: K */
    public final ArrayList<C104470c> f309491K;

    /* renamed from: L */
    public C104470c f309492L;

    /* renamed from: M */
    public ValueAnimator f309493M;

    /* renamed from: N */
    public ViewPager f309494N;

    /* renamed from: P */
    public C103853a f309495P;

    /* renamed from: Q */
    public DataSetObserver f309496Q;

    /* renamed from: R */
    public C39995g f309497R;

    /* renamed from: S */
    public C104469b f309498S;

    /* renamed from: T */
    public boolean f309499T;

    /* renamed from: U */
    public final C86167d<C104475h> f309500U;

    /* renamed from: d */
    public final ArrayList<C55061f> f309501d;

    /* renamed from: e */
    public C55061f f309502e;

    /* renamed from: f */
    public final RectF f309503f;

    /* renamed from: g */
    public final C104472e f309504g;

    /* renamed from: h */
    public int f309505h;

    /* renamed from: i */
    public int f309506i;

    /* renamed from: j */
    public int f309507j;

    /* renamed from: n */
    public int f309508n;

    /* renamed from: o */
    public int f309509o;

    /* renamed from: p */
    public ColorStateList f309510p;

    /* renamed from: q */
    public ColorStateList f309511q;

    /* renamed from: r */
    public ColorStateList f309512r;

    /* renamed from: s */
    public Drawable f309513s;

    /* renamed from: t */
    public PorterDuff.Mode f309514t;

    /* renamed from: u */
    public float f309515u;

    /* renamed from: v */
    public float f309516v;

    /* renamed from: w */
    public final int f309517w;

    /* renamed from: x */
    public int f309518x;

    /* renamed from: y */
    public final int f309519y;

    /* renamed from: z */
    public final int f309520z;

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C39995g implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final WeakReference<TabLayout> f107219d;

        /* renamed from: e */
        public int f107220e;

        /* renamed from: f */
        public int f107221f;

        public C39995g(TabLayout tabLayout) {
            this.f107219d = new WeakReference<>(tabLayout);
        }

        public void onPageScrollStateChanged(int i) {
            this.f107220e = this.f107221f;
            this.f107221f = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f107219d.get();
            if (tabLayout != null) {
                int i3 = this.f107221f;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f107220e == 1;
                if (!(i3 == 2 && this.f107220e == 0)) {
                    z = true;
                }
                tabLayout.mo146918r(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f107219d.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f107221f;
                tabLayout.mo146916p(tabLayout.mo146907k(i), i2 == 0 || (i2 == 2 && this.f107220e == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C39996i implements C104470c {

        /* renamed from: a */
        public final ViewPager f107222a;

        public C39996i(ViewPager viewPager) {
            this.f107222a = viewPager;
        }

        /* renamed from: a */
        public void mo9213a(C55061f fVar) {
        }

        /* renamed from: b */
        public void mo9214b(C55061f fVar) {
            this.f107222a.setCurrentItem(fVar.f154604e);
        }

        /* renamed from: c */
        public void mo9215c(C55061f fVar) {
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public static class C55061f {

        /* renamed from: a */
        public Object f154600a;

        /* renamed from: b */
        public Drawable f154601b;

        /* renamed from: c */
        public CharSequence f154602c;

        /* renamed from: d */
        public CharSequence f154603d;

        /* renamed from: e */
        public int f154604e = -1;

        /* renamed from: f */
        public View f154605f;

        /* renamed from: g */
        public TabLayout f154606g;

        /* renamed from: h */
        public C104475h f154607h;

        /* renamed from: a */
        public boolean mo76120a() {
            TabLayout tabLayout = this.f154606g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f154604e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: b */
        public void mo76121b() {
            TabLayout tabLayout = this.f154606g;
            if (tabLayout != null) {
                tabLayout.mo146916p(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: c */
        public C55061f mo76122c(int i) {
            this.f154605f = LayoutInflater.from(this.f154607h.getContext()).inflate(i, this.f154607h, false);
            mo76124e();
            return this;
        }

        /* renamed from: d */
        public C55061f mo76123d(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f154603d) && !TextUtils.isEmpty(charSequence)) {
                this.f154607h.setContentDescription(charSequence);
            }
            this.f154602c = charSequence;
            mo76124e();
            return this;
        }

        /* renamed from: e */
        public void mo76124e() {
            C104475h hVar = this.f154607h;
            if (hVar != null) {
                hVar.mo146956a();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C104468a implements ValueAnimator.AnimatorUpdateListener {
        public C104468a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C104469b implements ViewPager.C103849g {

        /* renamed from: d */
        public boolean f309522d;

        public C104469b() {
        }

        /* renamed from: a */
        public void mo145400a(ViewPager viewPager, C103853a aVar, C103853a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f309494N == viewPager) {
                tabLayout.mo146917q(aVar2, this.f309522d);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C104470c<T extends C55061f> {
        /* renamed from: a */
        void mo9213a(T t);

        /* renamed from: b */
        void mo9214b(T t);

        /* renamed from: c */
        void mo9215c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public class C104471d extends DataSetObserver {
        public C104471d() {
        }

        public void onChanged() {
            TabLayout.this.mo146909m();
        }

        public void onInvalidated() {
            TabLayout.this.mo146909m();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C104472e extends LinearLayout {

        /* renamed from: d */
        public int f309525d;

        /* renamed from: e */
        public final Paint f309526e;

        /* renamed from: f */
        public final GradientDrawable f309527f;

        /* renamed from: g */
        public int f309528g = -1;

        /* renamed from: h */
        public float f309529h;

        /* renamed from: i */
        public int f309530i = -1;

        /* renamed from: j */
        public int f309531j = -1;

        /* renamed from: n */
        public int f309532n = -1;

        /* renamed from: o */
        public ValueAnimator f309533o;

        /* renamed from: com.google.android.material.tabs.TabLayout$e$a */
        public class C104473a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ int f309535d;

            /* renamed from: e */
            public final /* synthetic */ int f309536e;

            /* renamed from: f */
            public final /* synthetic */ int f309537f;

            /* renamed from: g */
            public final /* synthetic */ int f309538g;

            public C104473a(int i, int i2, int i3, int i4) {
                this.f309535d = i;
                this.f309536e = i2;
                this.f309537f = i3;
                this.f309538g = i4;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C104472e eVar = C104472e.this;
                int i = this.f309535d;
                int i2 = this.f309536e;
                TimeInterpolator timeInterpolator = C108164a.f323890a;
                int round = i + Math.round(((float) (i2 - i)) * animatedFraction);
                int i3 = this.f309537f;
                int round2 = i3 + Math.round(animatedFraction * ((float) (this.f309538g - i3)));
                if (round != eVar.f309531j || round2 != eVar.f309532n) {
                    eVar.f309531j = round;
                    eVar.f309532n = round2;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145183k(eVar);
                }
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$e$b */
        public class C104474b extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ int f309540d;

            public C104474b(int i) {
                this.f309540d = i;
            }

            public void onAnimationEnd(Animator animator) {
                C104472e eVar = C104472e.this;
                eVar.f309528g = this.f309540d;
                eVar.f309529h = 0.0f;
            }
        }

        public C104472e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f309526e = new Paint();
            this.f309527f = new GradientDrawable();
        }

        /* renamed from: a */
        public void mo146947a(int i, int i2) {
            ValueAnimator valueAnimator = this.f309533o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f309533o.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                mo146949c();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f309488H && (childAt instanceof C104475h)) {
                mo146948b((C104475h) childAt, tabLayout.f309503f);
                RectF rectF = TabLayout.this.f309503f;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            int i3 = left;
            int i4 = right;
            int i5 = this.f309531j;
            int i6 = this.f309532n;
            if (i5 != i3 || i6 != i4) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f309533o = valueAnimator2;
                valueAnimator2.setInterpolator(C108164a.f323891b);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator2.addUpdateListener(new C104473a(i5, i3, i6, i4));
                valueAnimator2.addListener(new C104474b(i));
                valueAnimator2.start();
            }
        }

        /* renamed from: b */
        public final void mo146948b(C104475h hVar, RectF rectF) {
            View[] viewArr = {hVar.f309544e, hVar.f309545f, hVar.f309546g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            int i4 = i - i2;
            if (i4 < TabLayout.this.mo146905i(24)) {
                i4 = TabLayout.this.mo146905i(24);
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            int i5 = i4 / 2;
            rectF.set((float) (left - i5), 0.0f, (float) (left + i5), 0.0f);
        }

        /* renamed from: c */
        public final void mo146949c() {
            int i;
            View childAt = getChildAt(this.f309528g);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f309488H && (childAt instanceof C104475h)) {
                    mo146948b((C104475h) childAt, tabLayout.f309503f);
                    RectF rectF = TabLayout.this.f309503f;
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.f309529h <= 0.0f || this.f309528g >= getChildCount() - 1) {
                    i2 = left;
                    i = right;
                } else {
                    View childAt2 = getChildAt(this.f309528g + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f309488H && (childAt2 instanceof C104475h)) {
                        mo146948b((C104475h) childAt2, tabLayout2.f309503f);
                        RectF rectF2 = TabLayout.this.f309503f;
                        left2 = (int) rectF2.left;
                        right2 = (int) rectF2.right;
                    }
                    float f = this.f309529h;
                    float f2 = 1.0f - f;
                    i2 = (int) ((((float) left2) * f) + (((float) left) * f2));
                    i = (int) ((((float) right2) * f) + (f2 * ((float) right)));
                }
            }
            if (i2 != this.f309531j || i != this.f309532n) {
                this.f309531j = i2;
                this.f309532n = i;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.f309513s;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.f309525d;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.f309485E;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                intrinsicHeight = i3 != 3 ? 0 : getHeight();
            }
            int i4 = this.f309531j;
            if (i4 >= 0 && this.f309532n > i4) {
                Drawable drawable2 = TabLayout.this.f309513s;
                if (drawable2 == null) {
                    drawable2 = this.f309527f;
                }
                Drawable g = C112019a.m152749g(drawable2);
                g.setBounds(this.f309531j, i, this.f309532n, intrinsicHeight);
                Paint paint = this.f309526e;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        g.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        g.setTint(paint.getColor());
                    }
                }
                g.draw(canvas);
            }
            super.draw(canvas);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f309533o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo146949c();
                return;
            }
            this.f309533o.cancel();
            mo146947a(this.f309528g, Math.round((1.0f - this.f309533o.getAnimatedFraction()) * ((float) this.f309533o.getDuration())));
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f309486F == 1 && tabLayout.f309483C == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.mo146905i(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f309483C = 0;
                            tabLayout2.mo146943v(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f309530i != i) {
                requestLayout();
                this.f309530i = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public class C104475h extends LinearLayout {

        /* renamed from: p */
        public static final /* synthetic */ int f309542p = 0;

        /* renamed from: d */
        public C55061f f309543d;

        /* renamed from: e */
        public TextView f309544e;

        /* renamed from: f */
        public ImageView f309545f;

        /* renamed from: g */
        public View f309546g;

        /* renamed from: h */
        public TextView f309547h;

        /* renamed from: i */
        public ImageView f309548i;

        /* renamed from: j */
        public Drawable f309549j;

        /* renamed from: n */
        public int f309550n = 2;

        public C104475h(Context context) {
            super(context);
            mo146957b(context);
            int i = TabLayout.this.f309505h;
            int i2 = TabLayout.this.f309506i;
            int i3 = TabLayout.this.f309507j;
            int i4 = TabLayout.this.f309508n;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107209c.m145202k(this, i, i2, i3, i4);
            setGravity(17);
            setOrientation(TabLayout.this.f309487G ^ true ? 1 : 0);
            setClickable(true);
            C107207u.m145170k(this, C107205s.m145159a(getContext(), 1002));
        }

        /* renamed from: a */
        public final void mo146956a() {
            Drawable drawable;
            C55061f fVar = this.f309543d;
            Drawable drawable2 = null;
            View view = fVar != null ? fVar.f154605f : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f309546g = view;
                TextView textView = this.f309544e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f309545f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f309545f.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f309547h = textView2;
                if (textView2 != null) {
                    this.f309550n = textView2.getMaxLines();
                }
                this.f309548i = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f309546g;
                if (view2 != null) {
                    removeView(view2);
                    this.f309546g = null;
                }
                this.f309547h = null;
                this.f309548i = null;
            }
            boolean z = false;
            if (this.f309546g == null) {
                if (this.f309545f == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7126z4, this, false);
                    addView(imageView2, 0);
                    this.f309545f = imageView2;
                }
                if (!(fVar == null || (drawable = fVar.f154601b) == null)) {
                    drawable2 = C112019a.m152749g(drawable).mutate();
                }
                if (drawable2 != null) {
                    drawable2.setTintList(TabLayout.this.f309511q);
                    PorterDuff.Mode mode = TabLayout.this.f309514t;
                    if (mode != null) {
                        drawable2.setTintMode(mode);
                    }
                }
                if (this.f309544e == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7127z5, this, false);
                    addView(textView3);
                    this.f309544e = textView3;
                    this.f309550n = textView3.getMaxLines();
                }
                C103733h.m138110g(this.f309544e, TabLayout.this.f309509o);
                ColorStateList colorStateList = TabLayout.this.f309510p;
                if (colorStateList != null) {
                    this.f309544e.setTextColor(colorStateList);
                }
                mo146958c(this.f309544e, this.f309545f);
            } else {
                TextView textView4 = this.f309547h;
                if (!(textView4 == null && this.f309548i == null)) {
                    mo146958c(textView4, this.f309548i);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f154603d)) {
                setContentDescription(fVar.f154603d);
            }
            if (fVar != null && fVar.mo76120a()) {
                z = true;
            }
            setSelected(z);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo146957b(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f309517w
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = p1115h.C107922a.m146228b(r6, r0)
                r5.f309549j = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f309549j
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f309549j = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f309512r
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f309512r
                android.content.res.ColorStateList r2 = p1148r8.C110504a.m150442a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f309489I
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145189q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C104475h.mo146957b(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f154601b;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo146958c(android.widget.TextView r6, android.widget.ImageView r7) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r5.f309543d
                r1 = 0
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = r0.f154601b
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = p1162x2.C112019a.m152749g(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x0013
            L_0x0012:
                r0 = r1
            L_0x0013:
                com.google.android.material.tabs.TabLayout$f r2 = r5.f309543d
                if (r2 == 0) goto L_0x001a
                java.lang.CharSequence r2 = r2.f154602c
                goto L_0x001b
            L_0x001a:
                r2 = r1
            L_0x001b:
                r3 = 8
                r4 = 0
                if (r7 == 0) goto L_0x0032
                if (r0 == 0) goto L_0x002c
                r7.setImageDrawable(r0)
                r7.setVisibility(r4)
                r5.setVisibility(r4)
                goto L_0x0032
            L_0x002c:
                r7.setVisibility(r3)
                r7.setImageDrawable(r1)
            L_0x0032:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r0 = r0 ^ 1
                if (r6 == 0) goto L_0x004c
                if (r0 == 0) goto L_0x0046
                r6.setText(r2)
                r6.setVisibility(r4)
                r5.setVisibility(r4)
                goto L_0x004c
            L_0x0046:
                r6.setVisibility(r3)
                r6.setText(r1)
            L_0x004c:
                if (r7 == 0) goto L_0x008b
                android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
                if (r0 == 0) goto L_0x0063
                int r2 = r7.getVisibility()
                if (r2 != 0) goto L_0x0063
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.mo146905i(r3)
                goto L_0x0064
            L_0x0063:
                r2 = 0
            L_0x0064:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.f309487G
                if (r3 == 0) goto L_0x007c
                int r3 = r6.getMarginEnd()
                if (r2 == r3) goto L_0x008b
                r6.setMarginEnd(r2)
                r6.bottomMargin = r4
                r7.setLayoutParams(r6)
                r7.requestLayout()
                goto L_0x008b
            L_0x007c:
                int r3 = r6.bottomMargin
                if (r2 == r3) goto L_0x008b
                r6.bottomMargin = r2
                r6.setMarginEnd(r4)
                r7.setLayoutParams(r6)
                r7.requestLayout()
            L_0x008b:
                com.google.android.material.tabs.TabLayout$f r6 = r5.f309543d
                if (r6 == 0) goto L_0x0092
                java.lang.CharSequence r6 = r6.f154603d
                goto L_0x0093
            L_0x0092:
                r6 = r1
            L_0x0093:
                if (r0 == 0) goto L_0x0096
                goto L_0x0097
            L_0x0096:
                r1 = r6
            L_0x0097:
                androidx.appcompat.widget.C103542j0.m137612a(r5, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C104475h.mo146958c(android.widget.TextView, android.widget.ImageView):void");
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f309549j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f309549j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.C0110b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.C0110b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f309518x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f309544e != null) {
                float f = TabLayout.this.f309515u;
                int i3 = this.f309550n;
                ImageView imageView = this.f309545f;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f309544e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f309516v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f309544e.getTextSize();
                int lineCount = this.f309544e.getLineCount();
                int maxLines = this.f309544e.getMaxLines();
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f309486F == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f309544e.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f309544e.setTextSize(0, f);
                        this.f309544e.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f309543d == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f309543d.mo76121b();
            return true;
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f309544e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f309545f;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f309546g;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a3e);
    }

    private int getDefaultHeight() {
        int size = this.f309501d.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C55061f fVar = this.f309501d.get(i);
                if (fVar != null && fVar.f154601b != null && !TextUtils.isEmpty(fVar.f154602c)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f309487G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f309519y;
        if (i != -1) {
            return i;
        }
        if (this.f309486F == 0) {
            return this.f309481A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f309504g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f309504g.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f309504g.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void mo146882a(C104470c cVar) {
        if (!this.f309491K.contains(cVar)) {
            this.f309491K.add(cVar);
        }
    }

    public void addView(View view) {
        mo146890e(view);
    }

    /* renamed from: b */
    public void mo146887b(C55061f fVar) {
        mo146889d(fVar, this.f309501d.isEmpty());
    }

    /* renamed from: c */
    public void mo146888c(C55061f fVar, int i, boolean z) {
        if (fVar.f154606g == this) {
            fVar.f154604e = i;
            this.f309501d.add(i, fVar);
            int size = this.f309501d.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                this.f309501d.get(i).f154604e = i;
            }
            C104475h hVar = fVar.f154607h;
            C104472e eVar = this.f309504g;
            int i2 = fVar.f154604e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f309486F == 1 && this.f309483C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            eVar.addView(hVar, i2, layoutParams);
            if (z) {
                fVar.mo76121b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: d */
    public void mo146889d(C55061f fVar, boolean z) {
        mo146888c(fVar, this.f309501d.size(), z);
    }

    /* renamed from: e */
    public final void mo146890e(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C55061f l = mo146908l();
            CharSequence charSequence = tabItem.f309477d;
            if (charSequence != null) {
                l.mo76123d(charSequence);
            }
            Drawable drawable = tabItem.f309478e;
            if (drawable != null) {
                l.f154601b = drawable;
                l.mo76124e();
            }
            int i = tabItem.f309479f;
            if (i != 0) {
                l.mo76122c(i);
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                l.f154603d = tabItem.getContentDescription();
                l.mo76124e();
            }
            mo146887b(l);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: f */
    public final void mo146891f(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145208c(this)) {
                    C104472e eVar = this.f309504g;
                    int childCount = eVar.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            z = false;
                            break;
                        } else if (eVar.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        int scrollX = getScrollX();
                        int h = mo146904h(i, 0.0f);
                        if (scrollX != h) {
                            mo146906j();
                            this.f309493M.setIntValues(new int[]{scrollX, h});
                            this.f309493M.start();
                        }
                        this.f309504g.mo146947a(i, this.f309484D);
                        return;
                    }
                }
            }
            mo146918r(i, 0.0f, true, true);
        }
    }

    /* renamed from: g */
    public final void mo146892g() {
        int max = this.f309486F == 0 ? Math.max(0, this.f309482B - this.f309505h) : 0;
        C104472e eVar = this.f309504g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107209c.m145202k(eVar, max, 0, 0, 0);
        int i = this.f309486F;
        if (i == 0) {
            this.f309504g.setGravity(8388611);
        } else if (i == 1) {
            this.f309504g.setGravity(1);
        }
        mo146943v(true);
    }

    public int getSelectedTabPosition() {
        C55061f fVar = this.f309502e;
        if (fVar != null) {
            return fVar.f154604e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f309501d.size();
    }

    public int getTabGravity() {
        return this.f309483C;
    }

    public ColorStateList getTabIconTint() {
        return this.f309511q;
    }

    public int getTabIndicatorGravity() {
        return this.f309485E;
    }

    public int getTabMaxWidth() {
        return this.f309518x;
    }

    public int getTabMode() {
        return this.f309486F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f309512r;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f309513s;
    }

    public ColorStateList getTabTextColors() {
        return this.f309510p;
    }

    /* renamed from: h */
    public final int mo146904h(int i, float f) {
        int i2 = 0;
        if (this.f309486F != 0) {
            return 0;
        }
        View childAt = this.f309504g.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f309504g.getChildCount() ? this.f309504g.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(this) == 0 ? left + i4 : left - i4;
    }

    /* renamed from: i */
    public int mo146905i(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: j */
    public final void mo146906j() {
        if (this.f309493M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f309493M = valueAnimator;
            valueAnimator.setInterpolator(C108164a.f323891b);
            this.f309493M.setDuration((long) this.f309484D);
            this.f309493M.addUpdateListener(new C104468a());
        }
    }

    /* renamed from: k */
    public C55061f mo146907k(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f309501d.get(i);
    }

    /* renamed from: l */
    public C55061f mo146908l() {
        C55061f fVar = (C55061f) ((C106986f) f309480V).mo157419a();
        if (fVar == null) {
            fVar = new C55061f();
        }
        fVar.f154606g = this;
        C86167d<C104475h> dVar = this.f309500U;
        C104475h hVar = dVar != null ? (C104475h) ((C106985e) dVar).mo157419a() : null;
        if (hVar == null) {
            hVar = new C104475h(getContext());
        }
        if (fVar != hVar.f309543d) {
            hVar.f309543d = fVar;
            hVar.mo146956a();
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f154603d)) {
            hVar.setContentDescription(fVar.f154602c);
        } else {
            hVar.setContentDescription(fVar.f154603d);
        }
        fVar.f154607h = hVar;
        return fVar;
    }

    /* renamed from: m */
    public void mo146909m() {
        int currentItem;
        mo146910n();
        C103853a aVar = this.f309495P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                C55061f l = mo146908l();
                l.mo76123d(this.f309495P.getPageTitle(i));
                mo146889d(l, false);
            }
            ViewPager viewPager = this.f309494N;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo146916p(mo146907k(currentItem), true);
            }
        }
    }

    /* renamed from: n */
    public void mo146910n() {
        for (int childCount = this.f309504g.getChildCount() - 1; childCount >= 0; childCount--) {
            mo146911o(childCount);
        }
        Iterator<C55061f> it = this.f309501d.iterator();
        while (it.hasNext()) {
            C55061f next = it.next();
            it.remove();
            next.f154606g = null;
            next.f154607h = null;
            next.f154600a = null;
            next.f154601b = null;
            next.f154602c = null;
            next.f154603d = null;
            next.f154604e = -1;
            next.f154605f = null;
            ((C106986f) f309480V).mo157420b(next);
        }
        this.f309502e = null;
    }

    /* renamed from: o */
    public final void mo146911o(int i) {
        C104475h hVar = (C104475h) this.f309504g.getChildAt(i);
        this.f309504g.removeViewAt(i);
        if (hVar != null) {
            if (hVar.f309543d != null) {
                hVar.f309543d = null;
                hVar.mo146956a();
            }
            hVar.setSelected(false);
            ((C106985e) this.f309500U).mo157420b(hVar);
        }
        requestLayout();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f309494N == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo146942t((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f309499T) {
            setupWithViewPager((ViewPager) null);
            this.f309499T = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.C104475h) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$e r1 = r7.f309504g
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$e r1 = r7.f309504g
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.C104475h
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$h r1 = (com.google.android.material.tabs.TabLayout.C104475h) r1
            android.graphics.drawable.Drawable r2 = r1.f309549j
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f309549j
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.mo146905i(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x0049
            int r1 = r5.f309520z
            if (r1 <= 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            r1 = 56
            int r1 = r5.mo146905i(r1)
            int r1 = r0 - r1
        L_0x0047:
            r5.f309518x = r1
        L_0x0049:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0097
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f309486F
            if (r2 == 0) goto L_0x006a
            if (r2 == r0) goto L_0x005f
            goto L_0x0077
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0075
            goto L_0x0076
        L_0x006a:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r6 = r0
        L_0x0077:
            if (r6 == 0) goto L_0x0097
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public void mo146916p(C55061f fVar, boolean z) {
        C55061f fVar2 = this.f309502e;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f154604e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f154604e == -1) && i != -1) {
                    mo146918r(i, 0.0f, true, true);
                } else {
                    mo146891f(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f309502e = fVar;
            if (fVar2 != null) {
                for (int size = this.f309491K.size() - 1; size >= 0; size--) {
                    this.f309491K.get(size).mo9213a(fVar2);
                }
            }
            if (fVar != null) {
                for (int size2 = this.f309491K.size() - 1; size2 >= 0; size2--) {
                    this.f309491K.get(size2).mo9214b(fVar);
                }
            }
        } else if (fVar2 != null) {
            for (int size3 = this.f309491K.size() - 1; size3 >= 0; size3--) {
                this.f309491K.get(size3).mo9215c(fVar);
            }
            mo146891f(fVar.f154604e);
        }
    }

    /* renamed from: q */
    public void mo146917q(C103853a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C103853a aVar2 = this.f309495P;
        if (!(aVar2 == null || (dataSetObserver = this.f309496Q) == null)) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f309495P = aVar;
        if (z && aVar != null) {
            if (this.f309496Q == null) {
                this.f309496Q = new C104471d();
            }
            aVar.registerDataSetObserver(this.f309496Q);
        }
        mo146909m();
    }

    /* renamed from: r */
    public void mo146918r(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f309504g.getChildCount()) {
            if (z2) {
                C104472e eVar = this.f309504g;
                ValueAnimator valueAnimator = eVar.f309533o;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.f309533o.cancel();
                }
                eVar.f309528g = i;
                eVar.f309529h = f;
                eVar.mo146949c();
            }
            ValueAnimator valueAnimator2 = this.f309493M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f309493M.cancel();
            }
            scrollTo(mo146904h(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: s */
    public void mo146919s(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i}));
    }

    public void setInlineLabel(boolean z) {
        if (this.f309487G != z) {
            this.f309487G = z;
            for (int i = 0; i < this.f309504g.getChildCount(); i++) {
                View childAt = this.f309504g.getChildAt(i);
                if (childAt instanceof C104475h) {
                    C104475h hVar = (C104475h) childAt;
                    hVar.setOrientation(TabLayout.this.f309487G ^ true ? 1 : 0);
                    TextView textView = hVar.f309547h;
                    if (textView == null && hVar.f309548i == null) {
                        hVar.mo146958c(hVar.f309544e, hVar.f309545f);
                    } else {
                        hVar.mo146958c(textView, hVar.f309548i);
                    }
                }
            }
            mo146892g();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C104470c cVar) {
        C104470c cVar2 = this.f309490J;
        if (cVar2 != null) {
            this.f309491K.remove(cVar2);
        }
        this.f309490J = cVar;
        if (cVar != null) {
            mo146882a(cVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo146906j();
        this.f309493M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f309513s != drawable) {
            this.f309513s = drawable;
            C104472e eVar = this.f309504g;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C104472e eVar = this.f309504g;
        if (eVar.f309526e.getColor() != i) {
            eVar.f309526e.setColor(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f309485E != i) {
            this.f309485E = i;
            C104472e eVar = this.f309504g;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C104472e eVar = this.f309504g;
        if (eVar.f309525d != i) {
            eVar.f309525d = i;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    public void setTabGravity(int i) {
        if (this.f309483C != i) {
            this.f309483C = i;
            mo146892g();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f309511q != colorStateList) {
            this.f309511q = colorStateList;
            int size = this.f309501d.size();
            for (int i = 0; i < size; i++) {
                this.f309501d.get(i).mo76124e();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C107922a.m146227a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f309488H = z;
        C104472e eVar = this.f309504g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(eVar);
    }

    public void setTabMode(int i) {
        if (i != this.f309486F) {
            this.f309486F = i;
            mo146892g();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f309512r != colorStateList) {
            this.f309512r = colorStateList;
            for (int i = 0; i < this.f309504g.getChildCount(); i++) {
                View childAt = this.f309504g.getChildAt(i);
                if (childAt instanceof C104475h) {
                    Context context = getContext();
                    int i2 = C104475h.f309542p;
                    ((C104475h) childAt).mo146957b(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C107922a.m146227a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f309510p != colorStateList) {
            this.f309510p = colorStateList;
            int size = this.f309501d.size();
            for (int i = 0; i < size; i++) {
                this.f309501d.get(i).mo76124e();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C103853a aVar) {
        mo146917q(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f309489I != z) {
            this.f309489I = z;
            for (int i = 0; i < this.f309504g.getChildCount(); i++) {
                View childAt = this.f309504g.getChildAt(i);
                if (childAt instanceof C104475h) {
                    Context context = getContext();
                    int i2 = C104475h.f309542p;
                    ((C104475h) childAt).mo146957b(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo146942t(viewPager, true, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: t */
    public final void mo146942t(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f309494N;
        if (viewPager2 != null) {
            C39995g gVar = this.f309497R;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C104469b bVar = this.f309498S;
            if (bVar != null) {
                this.f309494N.removeOnAdapterChangeListener(bVar);
            }
        }
        C104470c cVar = this.f309492L;
        if (cVar != null) {
            this.f309491K.remove(cVar);
            this.f309492L = null;
        }
        if (viewPager != null) {
            this.f309494N = viewPager;
            if (this.f309497R == null) {
                this.f309497R = new C39995g(this);
            }
            C39995g gVar2 = this.f309497R;
            gVar2.f107221f = 0;
            gVar2.f107220e = 0;
            viewPager.addOnPageChangeListener(gVar2);
            C39996i iVar = new C39996i(viewPager);
            this.f309492L = iVar;
            mo146882a(iVar);
            C103853a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo146917q(adapter, z);
            }
            if (this.f309498S == null) {
                this.f309498S = new C104469b();
            }
            C104469b bVar2 = this.f309498S;
            bVar2.f309522d = z;
            viewPager.addOnAdapterChangeListener(bVar2);
            mo146918r(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f309494N = null;
            mo146917q((C103853a) null, false);
        }
        this.f309499T = z2;
    }

    /* renamed from: v */
    public void mo146943v(boolean z) {
        for (int i = 0; i < this.f309504g.getChildCount(); i++) {
            View childAt = this.f309504g.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f309486F == 1 && this.f309483C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309501d = new ArrayList<>();
        this.f309503f = new RectF();
        this.f309518x = Integer.MAX_VALUE;
        this.f309491K = new ArrayList<>();
        this.f309500U = new C106985e(12);
        setHorizontalScrollBarEnabled(false);
        C104472e eVar = new C104472e(context);
        this.f309504g = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322521u, i, C0966R.style.a3o, 22);
        int dimensionPixelSize = d.getDimensionPixelSize(10, -1);
        if (eVar.f309525d != dimensionPixelSize) {
            eVar.f309525d = dimensionPixelSize;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
        int color = d.getColor(7, 0);
        if (eVar.f309526e.getColor() != color) {
            eVar.f309526e.setColor(color);
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
        setSelectedTabIndicator(C110368a.m150199b(context, d, 5));
        setSelectedTabIndicatorGravity(d.getInt(9, 0));
        setTabIndicatorFullWidth(d.getBoolean(8, true));
        int dimensionPixelSize2 = d.getDimensionPixelSize(15, 0);
        this.f309508n = dimensionPixelSize2;
        this.f309507j = dimensionPixelSize2;
        this.f309506i = dimensionPixelSize2;
        this.f309505h = dimensionPixelSize2;
        this.f309505h = d.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f309506i = d.getDimensionPixelSize(19, this.f309506i);
        this.f309507j = d.getDimensionPixelSize(17, this.f309507j);
        this.f309508n = d.getDimensionPixelSize(16, this.f309508n);
        int resourceId = d.getResourceId(22, C0966R.style.f8807wq);
        this.f309509o = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, C107593a.f321896B);
        try {
            this.f309515u = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f309510p = C110368a.m150198a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d.hasValue(23)) {
                this.f309510p = C110368a.m150198a(context, d, 23);
            }
            if (d.hasValue(21)) {
                int color2 = d.getColor(21, 0);
                int defaultColor = this.f309510p.getDefaultColor();
                this.f309510p = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color2, defaultColor});
            }
            this.f309511q = C110368a.m150198a(context, d, 3);
            this.f309514t = C109992l.m149512a(d.getInt(4, -1), (PorterDuff.Mode) null);
            this.f309512r = C110368a.m150198a(context, d, 20);
            this.f309484D = d.getInt(6, 300);
            this.f309519y = d.getDimensionPixelSize(13, -1);
            this.f309520z = d.getDimensionPixelSize(12, -1);
            this.f309517w = d.getResourceId(0, 0);
            this.f309482B = d.getDimensionPixelSize(1, 0);
            this.f309486F = d.getInt(14, 1);
            this.f309483C = d.getInt(2, 0);
            this.f309487G = d.getBoolean(11, false);
            this.f309489I = d.getBoolean(24, false);
            d.recycle();
            Resources resources = getResources();
            this.f309516v = (float) resources.getDimensionPixelSize(C0966R.dimen.a1c);
            this.f309481A = resources.getDimensionPixelSize(C0966R.dimen.a1a);
            mo146892g();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, int i) {
        mo146890e(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo146890e(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo146890e(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C107922a.m146228b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
