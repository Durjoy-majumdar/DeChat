package com.tencent.p014mm.plugin.finder.view.tabcomp;

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
import com.google.android.material.tabs.TabItem;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ls1.C10646d;
import ls1.C109421c;
import p1114g8.C107764a;
import p1115h.C107922a;
import p1139o8.C109991k;
import p1139o8.C109992l;
import p1145q8.C110368a;
import p1162x2.C112019a;
import p329d3.C106985e;
import p329d3.C106986f;
import p329d3.C86167d;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107205s;
import p849e3.C107207u;
import rx3.C13604l;

@ViewPager.C103852e
/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout */
public class FinderTabLayout extends HorizontalScrollView {

    /* renamed from: V */
    public static final C86167d<C56654f> f312968V = new C106986f(16);

    /* renamed from: A */
    public final int f312969A;

    /* renamed from: B */
    public int f312970B;

    /* renamed from: C */
    public int f312971C;

    /* renamed from: D */
    public int f312972D;

    /* renamed from: E */
    public int f312973E;

    /* renamed from: F */
    public int f312974F;

    /* renamed from: G */
    public boolean f312975G;

    /* renamed from: H */
    public boolean f312976H;

    /* renamed from: I */
    public boolean f312977I;

    /* renamed from: J */
    public C105323c f312978J;

    /* renamed from: K */
    public final ArrayList<C105323c> f312979K;

    /* renamed from: L */
    public C105323c f312980L;

    /* renamed from: M */
    public ValueAnimator f312981M;

    /* renamed from: N */
    public ViewPager f312982N;

    /* renamed from: P */
    public C103853a f312983P;

    /* renamed from: Q */
    public DataSetObserver f312984Q;

    /* renamed from: R */
    public C56655g f312985R;

    /* renamed from: S */
    public C105322b f312986S;

    /* renamed from: T */
    public boolean f312987T;

    /* renamed from: U */
    public final C86167d<C105328h> f312988U;

    /* renamed from: d */
    public final ArrayList<C56654f> f312989d;

    /* renamed from: e */
    public C56654f f312990e;

    /* renamed from: f */
    public final RectF f312991f;

    /* renamed from: g */
    public final C105325e f312992g;

    /* renamed from: h */
    public int f312993h;

    /* renamed from: i */
    public int f312994i;

    /* renamed from: j */
    public int f312995j;

    /* renamed from: n */
    public int f312996n;

    /* renamed from: o */
    public int f312997o;

    /* renamed from: p */
    public ColorStateList f312998p;

    /* renamed from: q */
    public ColorStateList f312999q;

    /* renamed from: r */
    public ColorStateList f313000r;

    /* renamed from: s */
    public Drawable f313001s;

    /* renamed from: t */
    public PorterDuff.Mode f313002t;

    /* renamed from: u */
    public float f313003u;

    /* renamed from: v */
    public float f313004v;

    /* renamed from: w */
    public final int f313005w;

    /* renamed from: x */
    public int f313006x;

    /* renamed from: y */
    public final int f313007y;

    /* renamed from: z */
    public final int f313008z;

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$f */
    public static class C56654f {

        /* renamed from: a */
        public Object f162395a;

        /* renamed from: b */
        public Drawable f162396b;

        /* renamed from: c */
        public CharSequence f162397c;

        /* renamed from: d */
        public CharSequence f162398d;

        /* renamed from: e */
        public int f162399e = -1;

        /* renamed from: f */
        public View f162400f;

        /* renamed from: g */
        public FinderTabLayout f162401g;

        /* renamed from: h */
        public C105328h f162402h;

        /* renamed from: a */
        public void mo79993a() {
            FinderTabLayout finderTabLayout = this.f162401g;
            if (finderTabLayout != null) {
                finderTabLayout.mo149835l(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$g */
    public static class C56655g implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final WeakReference<FinderTabLayout> f162403d;

        /* renamed from: e */
        public int f162404e;

        /* renamed from: f */
        public int f162405f;

        public C56655g(FinderTabLayout finderTabLayout) {
            this.f162403d = new WeakReference<>(finderTabLayout);
        }

        public void onPageScrollStateChanged(int i) {
            this.f162404e = this.f162405f;
            this.f162405f = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            FinderTabLayout finderTabLayout = this.f162403d.get();
            if (finderTabLayout != null) {
                int i3 = this.f162405f;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f162404e == 1;
                if (!(i3 == 2 && this.f162404e == 0)) {
                    z = true;
                }
                finderTabLayout.mo149837n(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            FinderTabLayout finderTabLayout = this.f162403d.get();
            if (finderTabLayout != null && finderTabLayout.getSelectedTabPosition() != i && i < finderTabLayout.getTabCount()) {
                int i2 = this.f162405f;
                finderTabLayout.mo149835l(finderTabLayout.mo149831h(i), i2 == 0 || (i2 == 2 && this.f162404e == 0));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$i */
    public static class C56656i implements C105323c {

        /* renamed from: a */
        public final ViewPager f162406a;

        public C56656i(ViewPager viewPager) {
            this.f162406a = viewPager;
        }

        /* renamed from: a */
        public void mo79994a(C56654f fVar) {
        }

        /* renamed from: b */
        public void mo79995b(C56654f fVar) {
            this.f162406a.setCurrentItem(fVar.f162399e);
        }

        /* renamed from: c */
        public void mo79996c(C56654f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$a */
    public class C105321a implements ValueAnimator.AnimatorUpdateListener {
        public C105321a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$b */
    public class C105322b implements ViewPager.C103849g {

        /* renamed from: d */
        public boolean f313010d;

        public C105322b() {
        }

        /* renamed from: a */
        public void mo145400a(ViewPager viewPager, C103853a aVar, C103853a aVar2) {
            FinderTabLayout finderTabLayout = FinderTabLayout.this;
            if (finderTabLayout.f312982N == viewPager) {
                finderTabLayout.mo149836m(aVar2, this.f313010d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$c */
    public interface C105323c<T extends C56654f> {
        /* renamed from: a */
        void mo79994a(T t);

        /* renamed from: b */
        void mo79995b(T t);

        /* renamed from: c */
        void mo79996c(T t);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$d */
    public class C105324d extends DataSetObserver {
        public C105324d() {
        }

        public void onChanged() {
            FinderTabLayout.this.mo149833j();
        }

        public void onInvalidated() {
            FinderTabLayout.this.mo149833j();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e */
    public class C105325e extends LinearLayout {

        /* renamed from: d */
        public int f313013d;

        /* renamed from: e */
        public final Paint f313014e;

        /* renamed from: f */
        public final GradientDrawable f313015f;

        /* renamed from: g */
        public int f313016g = -1;

        /* renamed from: h */
        public float f313017h;

        /* renamed from: i */
        public int f313018i = -1;

        /* renamed from: j */
        public int f313019j = -1;

        /* renamed from: n */
        public int f313020n = -1;

        /* renamed from: o */
        public ValueAnimator f313021o;

        /* renamed from: p */
        public boolean f313022p = false;

        /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$a */
        public class C105326a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ int f313024d;

            /* renamed from: e */
            public final /* synthetic */ int f313025e;

            /* renamed from: f */
            public final /* synthetic */ int f313026f;

            /* renamed from: g */
            public final /* synthetic */ int f313027g;

            public C105326a(int i, int i2, int i3, int i4) {
                this.f313024d = i;
                this.f313025e = i2;
                this.f313026f = i3;
                this.f313027g = i4;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C105325e eVar = C105325e.this;
                int i = this.f313024d;
                int i2 = this.f313025e;
                TimeInterpolator timeInterpolator = C109421c.f327541a;
                int round = i + Math.round(((float) (i2 - i)) * animatedFraction);
                int i3 = this.f313026f;
                int round2 = i3 + Math.round(animatedFraction * ((float) (this.f313027g - i3)));
                if (round != eVar.f313019j || round2 != eVar.f313020n) {
                    eVar.f313019j = round;
                    eVar.f313020n = round2;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145183k(eVar);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$b */
        public class C105327b extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ int f313029d;

            public C105327b(int i) {
                this.f313029d = i;
            }

            public void onAnimationEnd(Animator animator) {
                C105325e eVar = C105325e.this;
                eVar.f313016g = this.f313029d;
                eVar.f313017h = 0.0f;
            }

            public void onAnimationStart(Animator animator, boolean z) {
            }
        }

        public C105325e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f313014e = new Paint();
            this.f313015f = new GradientDrawable();
        }

        /* renamed from: a */
        public static void m141454a(C105325e eVar, boolean z, int i) {
            if (z) {
                FinderTabLayout finderTabLayout = FinderTabLayout.this;
                int i2 = finderTabLayout.f312994i;
                int i3 = finderTabLayout.f312995j;
                int i4 = finderTabLayout.f312996n;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107209c.m145202k(eVar, i, i2, i3, i4);
                return;
            }
            FinderTabLayout finderTabLayout2 = FinderTabLayout.this;
            int i5 = finderTabLayout2.f312993h;
            int i6 = finderTabLayout2.f312994i;
            int i7 = finderTabLayout2.f312996n;
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107209c.m145202k(eVar, i5, i6, i, i7);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo149870b(int r10, int r11) {
            /*
                r9 = this;
                android.animation.ValueAnimator r0 = r9.f313021o
                if (r0 == 0) goto L_0x000f
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L_0x000f
                android.animation.ValueAnimator r0 = r9.f313021o
                r0.cancel()
            L_0x000f:
                android.view.View r0 = r9.getChildAt(r10)
                if (r0 != 0) goto L_0x001a
                r9.mo149874e()
                goto L_0x00bc
            L_0x001a:
                boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h
                if (r1 == 0) goto L_0x002d
                r2 = r0
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$h r2 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h) r2
                android.view.View r2 = r2.f313035g
                java.lang.Object r2 = r2.getTag()
                boolean r2 = r2 instanceof ls1.C10646d
                if (r2 == 0) goto L_0x002d
                r2 = 1
                goto L_0x002e
            L_0x002d:
                r2 = 0
            L_0x002e:
                if (r2 == 0) goto L_0x005b
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r1 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                boolean r2 = r1.f312976H
                if (r2 != 0) goto L_0x0052
                r2 = r0
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$h r2 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h) r2
                android.graphics.RectF r1 = r1.f312991f
                boolean r1 = r9.mo149871c(r2, r1)
                if (r1 != 0) goto L_0x0048
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r1 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                android.graphics.RectF r1 = r1.f312991f
                r9.mo149872d(r2, r1)
            L_0x0048:
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r1 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                android.graphics.RectF r1 = r1.f312991f
                float r2 = r1.left
                int r2 = (int) r2
                float r1 = r1.right
                goto L_0x0074
            L_0x0052:
                int r2 = r0.getLeft()
                int r1 = r0.getRight()
                goto L_0x007e
            L_0x005b:
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r2 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                boolean r3 = r2.f312976H
                if (r3 != 0) goto L_0x0076
                if (r1 == 0) goto L_0x0076
                r1 = r0
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$h r1 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h) r1
                android.graphics.RectF r2 = r2.f312991f
                r9.mo149872d(r1, r2)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r1 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                android.graphics.RectF r1 = r1.f312991f
                float r2 = r1.left
                int r2 = (int) r2
                float r1 = r1.right
            L_0x0074:
                int r1 = (int) r1
                goto L_0x007e
            L_0x0076:
                int r2 = r0.getLeft()
                int r1 = r0.getRight()
            L_0x007e:
                r8 = r1
                r6 = r2
                r0.getLeft()
                r0.getRight()
                int r5 = r9.f313019j
                int r7 = r9.f313020n
                if (r5 != r6) goto L_0x008e
                if (r7 == r8) goto L_0x00bc
            L_0x008e:
                android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
                r0.<init>()
                r9.f313021o = r0
                android.animation.TimeInterpolator r1 = ls1.C109421c.f327541a
                r0.setInterpolator(r1)
                long r1 = (long) r11
                r0.setDuration(r1)
                r11 = 2
                float[] r11 = new float[r11]
                r11 = {0, 1065353216} // fill-array
                r0.setFloatValues(r11)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$a r11 = new com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$a
                r3 = r11
                r4 = r9
                r3.<init>(r5, r6, r7, r8)
                r0.addUpdateListener(r11)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$b r11 = new com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e$b
                r11.<init>(r10)
                r0.addListener(r11)
                r0.start()
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105325e.mo149870b(int, int):void");
        }

        /* renamed from: c */
        public final boolean mo149871c(C105328h hVar, RectF rectF) {
            C13604l lVar;
            if (hVar != null && (hVar.f313035g.getTag() instanceof C10646d)) {
                C10646d dVar = (C10646d) hVar.f313035g.getTag();
                View view = dVar.f32057j;
                if (view != null) {
                    int[] iArr = {0, 0};
                    view.getLocationOnScreen(iArr);
                    int[] iArr2 = {0, 0};
                    int[] iArr3 = {0, 0};
                    View o = dVar.mo10905o();
                    View m = dVar.mo10904m();
                    if (o != null) {
                        o.getLocationOnScreen(iArr2);
                    }
                    if (m != null) {
                        m.getLocationOnScreen(iArr3);
                    }
                    int i = iArr2[0];
                    int i2 = iArr[0];
                    if (i < i2) {
                        i = i2;
                    }
                    int width = iArr3[0] + (m != null ? m.getWidth() : 0);
                    if (width > iArr[0] + view.getWidth()) {
                        width = iArr[0] + view.getWidth();
                    }
                    int[] n = dVar.mo10704n();
                    int i3 = width - i;
                    if (i3 <= 0) {
                        i3 = 0;
                    }
                    int i4 = n[0];
                    int i5 = (i3 - i4) - n[1];
                    if (i5 > 0) {
                        i += i4;
                        i3 = i5;
                    }
                    int left = view.getLeft() + (i - iArr[0]);
                    int i6 = i3 + left;
                    if (i6 > view.getRight()) {
                        i6 = view.getRight();
                    }
                    lVar = new C13604l(Integer.valueOf(left), Integer.valueOf(i6));
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    rectF.set((float) ((Integer) lVar.f38555d).intValue(), 0.0f, (float) ((Integer) lVar.f38556e).intValue(), 0.0f);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo149872d(C105328h hVar, RectF rectF) {
            int a = hVar.getContentWidth();
            if (a < FinderTabLayout.this.mo149818f(24)) {
                a = FinderTabLayout.this.mo149818f(24);
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            int i = a / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        public void draw(Canvas canvas) {
            Drawable drawable = FinderTabLayout.this.f313001s;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.f313013d;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = FinderTabLayout.this.f312973E;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                intrinsicHeight = i3 != 3 ? 0 : getHeight();
            }
            int i4 = this.f313019j;
            if (i4 >= 0 && this.f313020n > i4) {
                Drawable drawable2 = FinderTabLayout.this.f313001s;
                if (drawable2 == null) {
                    drawable2 = this.f313015f;
                }
                Drawable g = C112019a.m152749g(drawable2);
                g.setBounds(this.f313019j, i, this.f313020n, intrinsicHeight);
                Paint paint = this.f313014e;
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

        /* renamed from: e */
        public final void mo149874e() {
            int i;
            View childAt = getChildAt(this.f313016g);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                FinderTabLayout finderTabLayout = FinderTabLayout.this;
                if (!finderTabLayout.f312976H && (childAt instanceof C105328h)) {
                    C105328h hVar = (C105328h) childAt;
                    if (!mo149871c(hVar, finderTabLayout.f312991f)) {
                        mo149872d(hVar, FinderTabLayout.this.f312991f);
                    }
                    RectF rectF = FinderTabLayout.this.f312991f;
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.f313017h <= 0.0f || this.f313016g >= getChildCount() - 1) {
                    i2 = left;
                    i = right;
                } else {
                    View childAt2 = getChildAt(this.f313016g + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    FinderTabLayout finderTabLayout2 = FinderTabLayout.this;
                    if (!finderTabLayout2.f312976H && (childAt2 instanceof C105328h)) {
                        mo149872d((C105328h) childAt2, finderTabLayout2.f312991f);
                        RectF rectF2 = FinderTabLayout.this.f312991f;
                        left2 = (int) rectF2.left;
                        right2 = (int) rectF2.right;
                    }
                    float f = this.f313017h;
                    float f2 = 1.0f - f;
                    i2 = (int) ((((float) left2) * f) + (((float) left) * f2));
                    i = (int) ((((float) right2) * f) + (f2 * ((float) right)));
                }
            }
            if (i2 != this.f313019j || i != this.f313020n) {
                this.f313019j = i2;
                this.f313020n = i;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
        }

        public float getIndicatorPosition() {
            return ((float) this.f313016g) + this.f313017h;
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f313021o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo149874e();
            } else {
                this.f313021o.cancel();
                mo149870b(this.f313016g, Math.round((1.0f - this.f313021o.getAnimatedFraction()) * ((float) this.f313021o.getDuration())));
            }
            if (!this.f313022p) {
                post(new C105329a(this));
                this.f313022p = true;
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                FinderTabLayout finderTabLayout = FinderTabLayout.this;
                boolean z = true;
                if (finderTabLayout.f312974F == 1 && finderTabLayout.f312971C == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount > getMeasuredWidth() - (FinderTabLayout.this.mo149818f(16) * 2)) {
                            FinderTabLayout finderTabLayout2 = FinderTabLayout.this;
                            finderTabLayout2.f312971C = 0;
                            finderTabLayout2.mo149844p(false);
                        } else {
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
            if (Build.VERSION.SDK_INT < 23 && this.f313018i != i) {
                requestLayout();
                this.f313018i = i;
            }
        }

        public void setSelectedIndicatorColor(int i) {
            if (this.f313014e.getColor() != i) {
                this.f313014e.setColor(i);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
        }

        public void setSelectedIndicatorHeight(int i) {
            if (this.f313013d != i) {
                this.f313013d = i;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$h */
    public class C105328h extends LinearLayout {

        /* renamed from: p */
        public static final /* synthetic */ int f313031p = 0;

        /* renamed from: d */
        public C56654f f313032d;

        /* renamed from: e */
        public TextView f313033e;

        /* renamed from: f */
        public ImageView f313034f;

        /* renamed from: g */
        public View f313035g;

        /* renamed from: h */
        public TextView f313036h;

        /* renamed from: i */
        public ImageView f313037i;

        /* renamed from: j */
        public Drawable f313038j;

        /* renamed from: n */
        public int f313039n = 2;

        public C105328h(Context context) {
            super(context);
            mo149885c(context);
            int i = FinderTabLayout.this.f312993h;
            int i2 = FinderTabLayout.this.f312994i;
            int i3 = FinderTabLayout.this.f312995j;
            int i4 = FinderTabLayout.this.f312996n;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107209c.m145202k(this, i, i2, i3, i4);
            setGravity(17);
            setOrientation(FinderTabLayout.this.f312975G ^ true ? 1 : 0);
            setClickable(true);
            C107207u.m145170k(this, C107205s.m145159a(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f313033e, this.f313034f, this.f313035g};
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
            return i - i2;
        }

        /* renamed from: b */
        public final void mo149884b() {
            Drawable drawable;
            C56654f fVar = this.f313032d;
            Drawable drawable2 = null;
            View view = fVar != null ? fVar.f162400f : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f313035g = view;
                TextView textView = this.f313033e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f313034f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f313034f.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f313036h = textView2;
                if (textView2 != null) {
                    this.f313039n = textView2.getMaxLines();
                }
                this.f313037i = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f313035g;
                if (view2 != null) {
                    removeView(view2);
                    this.f313035g = null;
                }
                this.f313036h = null;
                this.f313037i = null;
            }
            boolean z = false;
            if (this.f313035g == null) {
                if (this.f313034f == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7126z4, this, false);
                    addView(imageView2, 0);
                    this.f313034f = imageView2;
                }
                if (!(fVar == null || (drawable = fVar.f162396b) == null)) {
                    drawable2 = C112019a.m152749g(drawable).mutate();
                }
                if (drawable2 != null) {
                    drawable2.setTintList(FinderTabLayout.this.f312999q);
                    PorterDuff.Mode mode = FinderTabLayout.this.f313002t;
                    if (mode != null) {
                        drawable2.setTintMode(mode);
                    }
                }
                if (this.f313033e == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7127z5, this, false);
                    addView(textView3);
                    this.f313033e = textView3;
                    this.f313039n = textView3.getMaxLines();
                }
                C103733h.m138110g(this.f313033e, FinderTabLayout.this.f312997o);
                ColorStateList colorStateList = FinderTabLayout.this.f312998p;
                if (colorStateList != null) {
                    this.f313033e.setTextColor(colorStateList);
                }
                mo149886d(this.f313033e, this.f313034f);
            } else {
                TextView textView4 = this.f313036h;
                if (!(textView4 == null && this.f313037i == null)) {
                    mo149886d(textView4, this.f313037i);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f162398d)) {
                setContentDescription(fVar.f162398d);
            }
            if (fVar != null) {
                FinderTabLayout finderTabLayout = fVar.f162401g;
                if (finderTabLayout != null) {
                    if (finderTabLayout.getSelectedTabPosition() == fVar.f162399e) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
                }
            }
            setSelected(z);
        }

        /* JADX WARNING: type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo149885c(android.content.Context r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r0 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                int r0 = r0.f313005w
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r8 = p1115h.C107922a.m146228b(r8, r0)
                r7.f313038j = r8
                if (r8 == 0) goto L_0x0021
                boolean r8 = r8.isStateful()
                if (r8 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r8 = r7.f313038j
                int[] r0 = r7.getDrawableState()
                r8.setState(r0)
                goto L_0x0021
            L_0x001f:
                r7.f313038j = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
                r8.<init>()
                r0 = 0
                r8.setColor(r0)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r2 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                android.content.res.ColorStateList r2 = r2.f313000r
                if (r2 == 0) goto L_0x0077
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r3 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                android.content.res.ColorStateList r3 = r3.f313000r
                r4 = 2
                int[][] r5 = new int[r4][]
                int[] r4 = new int[r4]
                int[] r6 = ls1.C109422o.f327544c
                r5[r0] = r6
                int[] r6 = ls1.C109422o.f327543b
                int r6 = ls1.C109422o.m148597a(r3, r6)
                r4[r0] = r6
                r0 = 1
                int[] r6 = android.util.StateSet.NOTHING
                r5[r0] = r6
                int[] r6 = ls1.C109422o.f327542a
                int r3 = ls1.C109422o.m148597a(r3, r6)
                r4[r0] = r3
                android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
                r0.<init>(r5, r4)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r4 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                boolean r4 = r4.f312977I
                if (r4 == 0) goto L_0x006f
                r8 = r1
            L_0x006f:
                if (r4 == 0) goto L_0x0072
                goto L_0x0073
            L_0x0072:
                r1 = r2
            L_0x0073:
                r3.<init>(r0, r8, r1)
                r8 = r3
            L_0x0077:
                java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145189q(r7, r8)
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r8 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                r8.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h.mo149885c(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f162396b;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo149886d(android.widget.TextView r6, android.widget.ImageView r7) {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$f r0 = r5.f313032d
                r1 = 0
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = r0.f162396b
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = p1162x2.C112019a.m152749g(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x0013
            L_0x0012:
                r0 = r1
            L_0x0013:
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$f r2 = r5.f313032d
                if (r2 == 0) goto L_0x001a
                java.lang.CharSequence r2 = r2.f162397c
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
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r2 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                int r2 = r2.mo149818f(r3)
                goto L_0x0064
            L_0x0063:
                r2 = 0
            L_0x0064:
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r3 = com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.this
                boolean r3 = r3.f312975G
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
                com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$f r6 = r5.f313032d
                if (r6 == 0) goto L_0x0092
                java.lang.CharSequence r6 = r6.f162398d
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h.mo149886d(android.widget.TextView, android.widget.ImageView):void");
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f313038j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f313038j.setState(drawableState);
            }
            if (z) {
                invalidate();
                FinderTabLayout.this.invalidate();
            }
        }

        public C56654f getTab() {
            return this.f313032d;
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
            int tabMaxWidth = FinderTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(FinderTabLayout.this.f313006x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f313033e != null) {
                float f = FinderTabLayout.this.f313003u;
                int i3 = this.f313039n;
                ImageView imageView = this.f313034f;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f313033e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = FinderTabLayout.this.f313004v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f313033e.getTextSize();
                int lineCount = this.f313033e.getLineCount();
                int maxLines = this.f313033e.getMaxLines();
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (FinderTabLayout.this.f312974F == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f313033e.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f313033e.setTextSize(0, f);
                        this.f313033e.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f313032d == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f313032d.mo79993a();
            return true;
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f313033e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f313034f;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f313035g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C56654f fVar) {
            if (fVar != this.f313032d) {
                this.f313032d = fVar;
                mo149884b();
            }
        }
    }

    public FinderTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a3e);
    }

    private int getDefaultHeight() {
        int size = this.f312989d.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C56654f fVar = this.f312989d.get(i);
                if (fVar != null && fVar.f162396b != null && !TextUtils.isEmpty(fVar.f162397c)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f312975G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f313007y;
        if (i != -1) {
            return i;
        }
        if (this.f312974F == 0) {
            return this.f312969A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f312992g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f312992g.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f312992g.getChildAt(i2);
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
    public void mo149809a(C56654f fVar, int i, boolean z) {
        if (fVar.f162401g == this) {
            fVar.f162399e = i;
            this.f312989d.add(i, fVar);
            int size = this.f312989d.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                this.f312989d.get(i).f162399e = i;
            }
            C105328h hVar = fVar.f162402h;
            C105325e eVar = this.f312992g;
            int i2 = fVar.f162399e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f312974F == 1 && this.f312971C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            eVar.addView(hVar, i2, layoutParams);
            if (z) {
                fVar.mo79993a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different CustomTabLayout.");
    }

    public void addView(View view) {
        mo149814b(view);
    }

    /* renamed from: b */
    public final void mo149814b(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C56654f i = mo149832i();
            CharSequence charSequence = tabItem.f309477d;
            if (charSequence != null) {
                if (TextUtils.isEmpty(i.f162398d) && !TextUtils.isEmpty(charSequence)) {
                    i.f162402h.setContentDescription(charSequence);
                }
                i.f162397c = charSequence;
                C105328h hVar = i.f162402h;
                if (hVar != null) {
                    hVar.mo149884b();
                }
            }
            Drawable drawable = tabItem.f309478e;
            if (drawable != null) {
                i.f162396b = drawable;
                C105328h hVar2 = i.f162402h;
                if (hVar2 != null) {
                    hVar2.mo149884b();
                }
            }
            int i2 = tabItem.f309479f;
            if (i2 != 0) {
                i.f162400f = LayoutInflater.from(i.f162402h.getContext()).inflate(i2, i.f162402h, false);
                C105328h hVar3 = i.f162402h;
                if (hVar3 != null) {
                    hVar3.mo149884b();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i.f162398d = tabItem.getContentDescription();
                C105328h hVar4 = i.f162402h;
                if (hVar4 != null) {
                    hVar4.mo149884b();
                }
            }
            mo149809a(i, this.f312989d.size(), this.f312989d.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to CustomTabLayout");
    }

    /* renamed from: c */
    public final void mo149815c(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145208c(this)) {
                    C105325e eVar = this.f312992g;
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
                        int e = mo149817e(i, 0.0f);
                        if (scrollX != e) {
                            mo149819g();
                            this.f312981M.setIntValues(new int[]{scrollX, e});
                            this.f312981M.start();
                        }
                        this.f312992g.mo149870b(i, this.f312972D);
                        return;
                    }
                }
            }
            mo149837n(i, 0.0f, true, true);
        }
    }

    /* renamed from: d */
    public final void mo149816d() {
        int max = this.f312974F == 0 ? Math.max(0, this.f312970B - this.f312993h) : 0;
        C105325e eVar = this.f312992g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107209c.m145202k(eVar, max, 0, 0, 0);
        int i = this.f312974F;
        if (i == 0) {
            this.f312992g.setGravity(8388611);
        } else if (i == 1) {
            this.f312992g.setGravity(1);
        }
        mo149844p(true);
    }

    /* renamed from: e */
    public final int mo149817e(int i, float f) {
        int i2 = 0;
        if (this.f312974F != 0) {
            return 0;
        }
        View childAt = this.f312992g.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f312992g.getChildCount() ? this.f312992g.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(this) == 0 ? left + i4 : left - i4;
    }

    /* renamed from: f */
    public int mo149818f(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: g */
    public final void mo149819g() {
        if (this.f312981M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f312981M = valueAnimator;
            valueAnimator.setInterpolator(C109421c.f327541a);
            this.f312981M.setDuration((long) this.f312972D);
            this.f312981M.addUpdateListener(new C105321a());
        }
    }

    public int getSelectedTabPosition() {
        C56654f fVar = this.f312990e;
        if (fVar != null) {
            return fVar.f162399e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f312989d.size();
    }

    public int getTabGravity() {
        return this.f312971C;
    }

    public ColorStateList getTabIconTint() {
        return this.f312999q;
    }

    public int getTabIndicatorGravity() {
        return this.f312973E;
    }

    public int getTabMaxWidth() {
        return this.f313006x;
    }

    public int getTabMode() {
        return this.f312974F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f313000r;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f313001s;
    }

    public ColorStateList getTabTextColors() {
        return this.f312998p;
    }

    /* renamed from: h */
    public C56654f mo149831h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f312989d.get(i);
    }

    /* renamed from: i */
    public C56654f mo149832i() {
        C56654f fVar = (C56654f) ((C106986f) f312968V).mo157419a();
        if (fVar == null) {
            fVar = new C56654f();
        }
        fVar.f162401g = this;
        C86167d<C105328h> dVar = this.f312988U;
        C105328h hVar = dVar != null ? (C105328h) ((C106985e) dVar).mo157419a() : null;
        if (hVar == null) {
            hVar = new C105328h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f162398d)) {
            hVar.setContentDescription(fVar.f162397c);
        } else {
            hVar.setContentDescription(fVar.f162398d);
        }
        fVar.f162402h = hVar;
        return fVar;
    }

    /* renamed from: j */
    public void mo149833j() {
        int currentItem;
        int childCount = this.f312992g.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            mo149834k(childCount);
        }
        Iterator<C56654f> it = this.f312989d.iterator();
        while (it.hasNext()) {
            C56654f next = it.next();
            it.remove();
            next.f162401g = null;
            next.f162402h = null;
            next.f162395a = null;
            next.f162396b = null;
            next.f162397c = null;
            next.f162398d = null;
            next.f162399e = -1;
            next.f162400f = null;
            ((C106986f) f312968V).mo157420b(next);
        }
        this.f312990e = null;
        C103853a aVar = this.f312983P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                C56654f i2 = mo149832i();
                CharSequence pageTitle = this.f312983P.getPageTitle(i);
                if (TextUtils.isEmpty(i2.f162398d) && !TextUtils.isEmpty(pageTitle)) {
                    i2.f162402h.setContentDescription(pageTitle);
                }
                i2.f162397c = pageTitle;
                C105328h hVar = i2.f162402h;
                if (hVar != null) {
                    hVar.mo149884b();
                }
                mo149809a(i2, this.f312989d.size(), false);
            }
            ViewPager viewPager = this.f312982N;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo149835l(mo149831h(currentItem), true);
            }
        }
    }

    /* renamed from: k */
    public final void mo149834k(int i) {
        C105328h hVar = (C105328h) this.f312992g.getChildAt(i);
        this.f312992g.removeViewAt(i);
        if (hVar != null) {
            hVar.setTab((C56654f) null);
            hVar.setSelected(false);
            ((C106985e) this.f312988U).mo157420b(hVar);
        }
        requestLayout();
    }

    /* renamed from: l */
    public void mo149835l(C56654f fVar, boolean z) {
        C56654f fVar2 = this.f312990e;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f162399e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f162399e == -1) && i != -1) {
                    mo149837n(i, 0.0f, true, true);
                } else {
                    mo149815c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f312990e = fVar;
            if (fVar2 != null) {
                for (int size = this.f312979K.size() - 1; size >= 0; size--) {
                    this.f312979K.get(size).mo79996c(fVar2);
                }
            }
            if (fVar != null) {
                for (int size2 = this.f312979K.size() - 1; size2 >= 0; size2--) {
                    this.f312979K.get(size2).mo79995b(fVar);
                }
            }
        } else if (fVar2 != null) {
            for (int size3 = this.f312979K.size() - 1; size3 >= 0; size3--) {
                this.f312979K.get(size3).mo79994a(fVar);
            }
            mo149815c(fVar.f162399e);
        }
    }

    /* renamed from: m */
    public void mo149836m(C103853a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C103853a aVar2 = this.f312983P;
        if (!(aVar2 == null || (dataSetObserver = this.f312984Q) == null)) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f312983P = aVar;
        if (z && aVar != null) {
            if (this.f312984Q == null) {
                this.f312984Q = new C105324d();
            }
            aVar.registerDataSetObserver(this.f312984Q);
        }
        mo149833j();
    }

    /* renamed from: n */
    public void mo149837n(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f312992g.getChildCount()) {
            if (z2) {
                C105325e eVar = this.f312992g;
                ValueAnimator valueAnimator = eVar.f313021o;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.f313021o.cancel();
                }
                eVar.f313016g = i;
                eVar.f313017h = f;
                eVar.mo149874e();
            }
            ValueAnimator valueAnimator2 = this.f312981M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f312981M.cancel();
            }
            scrollTo(mo149817e(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: o */
    public final void mo149838o(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f312982N;
        if (viewPager2 != null) {
            C56655g gVar = this.f312985R;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C105322b bVar = this.f312986S;
            if (bVar != null) {
                this.f312982N.removeOnAdapterChangeListener(bVar);
            }
        }
        C105323c cVar = this.f312980L;
        if (cVar != null) {
            this.f312979K.remove(cVar);
            this.f312980L = null;
        }
        if (viewPager != null) {
            this.f312982N = viewPager;
            if (this.f312985R == null) {
                this.f312985R = new C56655g(this);
            }
            C56655g gVar2 = this.f312985R;
            gVar2.f162405f = 0;
            gVar2.f162404e = 0;
            viewPager.addOnPageChangeListener(gVar2);
            C56656i iVar = new C56656i(viewPager);
            this.f312980L = iVar;
            if (!this.f312979K.contains(iVar)) {
                this.f312979K.add(iVar);
            }
            C103853a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo149836m(adapter, z);
            }
            if (this.f312986S == null) {
                this.f312986S = new C105322b();
            }
            C105322b bVar2 = this.f312986S;
            bVar2.f313010d = z;
            viewPager.addOnAdapterChangeListener(bVar2);
            mo149837n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f312982N = null;
            mo149836m((C103853a) null, false);
        }
        this.f312987T = z2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f312982N == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo149838o((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f312987T) {
            setupWithViewPager((ViewPager) null);
            this.f312987T = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e r1 = r7.f312992g
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$e r1 = r7.f312992g
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h
            if (r2 == 0) goto L_0x0031
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$h r1 = (com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.C105328h) r1
            android.graphics.drawable.Drawable r2 = r1.f313038j
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f313038j
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.onDraw(android.graphics.Canvas):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
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
            int r0 = r5.mo149818f(r0)
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
            int r1 = r5.f313008z
            if (r1 <= 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            r1 = 56
            int r1 = r5.mo149818f(r1)
            int r1 = r0 - r1
        L_0x0047:
            r5.f313006x = r1
        L_0x0049:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0097
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f312974F
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public void mo149844p(boolean z) {
        for (int i = 0; i < this.f312992g.getChildCount(); i++) {
            View childAt = this.f312992g.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f312974F == 1 && this.f312971C == 0) {
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

    public void setInlineLabel(boolean z) {
        if (this.f312975G != z) {
            this.f312975G = z;
            for (int i = 0; i < this.f312992g.getChildCount(); i++) {
                View childAt = this.f312992g.getChildAt(i);
                if (childAt instanceof C105328h) {
                    C105328h hVar = (C105328h) childAt;
                    hVar.setOrientation(FinderTabLayout.this.f312975G ^ true ? 1 : 0);
                    TextView textView = hVar.f313036h;
                    if (textView == null && hVar.f313037i == null) {
                        hVar.mo149886d(hVar.f313033e, hVar.f313034f);
                    } else {
                        hVar.mo149886d(textView, hVar.f313037i);
                    }
                }
            }
            mo149816d();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C105323c cVar) {
        C105323c cVar2 = this.f312978J;
        if (cVar2 != null) {
            this.f312979K.remove(cVar2);
        }
        this.f312978J = cVar;
        if (cVar != null && !this.f312979K.contains(cVar)) {
            this.f312979K.add(cVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo149819g();
        this.f312981M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f313001s != drawable) {
            this.f313001s = drawable;
            C105325e eVar = this.f312992g;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f312992g.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f312973E != i) {
            this.f312973E = i;
            C105325e eVar = this.f312992g;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(eVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f312992g.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.f312971C != i) {
            this.f312971C = i;
            mo149816d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f312999q != colorStateList) {
            this.f312999q = colorStateList;
            int size = this.f312989d.size();
            for (int i = 0; i < size; i++) {
                C105328h hVar = this.f312989d.get(i).f162402h;
                if (hVar != null) {
                    hVar.mo149884b();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C107922a.m146227a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f312976H = z;
        C105325e eVar = this.f312992g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(eVar);
    }

    public void setTabMode(int i) {
        if (i != this.f312974F) {
            this.f312974F = i;
            mo149816d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f313000r != colorStateList) {
            this.f313000r = colorStateList;
            for (int i = 0; i < this.f312992g.getChildCount(); i++) {
                View childAt = this.f312992g.getChildAt(i);
                if (childAt instanceof C105328h) {
                    Context context = getContext();
                    int i2 = C105328h.f313031p;
                    ((C105328h) childAt).mo149885c(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C107922a.m146227a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f312998p != colorStateList) {
            this.f312998p = colorStateList;
            int size = this.f312989d.size();
            for (int i = 0; i < size; i++) {
                C105328h hVar = this.f312989d.get(i).f162402h;
                if (hVar != null) {
                    hVar.mo149884b();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C103853a aVar) {
        mo149836m(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f312977I != z) {
            this.f312977I = z;
            for (int i = 0; i < this.f312992g.getChildCount(); i++) {
                View childAt = this.f312992g.getChildAt(i);
                if (childAt instanceof C105328h) {
                    Context context = getContext();
                    int i2 = C105328h.f313031p;
                    ((C105328h) childAt).mo149885c(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo149838o(viewPager, true, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: finally extract failed */
    public FinderTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f312989d = new ArrayList<>();
        this.f312991f = new RectF();
        this.f313006x = Integer.MAX_VALUE;
        this.f312979K = new ArrayList<>();
        this.f312988U = new C106985e(12);
        setHorizontalScrollBarEnabled(false);
        C105325e eVar = new C105325e(context);
        this.f312992g = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322521u, i, C0966R.style.a3o, 22);
        eVar.setSelectedIndicatorHeight(d.getDimensionPixelSize(10, -1));
        eVar.setSelectedIndicatorColor(d.getColor(7, 0));
        setSelectedTabIndicator(C110368a.m150199b(context, d, 5));
        setSelectedTabIndicatorGravity(d.getInt(9, 0));
        setTabIndicatorFullWidth(d.getBoolean(8, true));
        int dimensionPixelSize = d.getDimensionPixelSize(15, 0);
        this.f312996n = dimensionPixelSize;
        this.f312995j = dimensionPixelSize;
        this.f312994i = dimensionPixelSize;
        this.f312993h = dimensionPixelSize;
        this.f312993h = d.getDimensionPixelSize(18, dimensionPixelSize);
        this.f312994i = d.getDimensionPixelSize(19, this.f312994i);
        this.f312995j = d.getDimensionPixelSize(17, this.f312995j);
        this.f312996n = d.getDimensionPixelSize(16, this.f312996n);
        int resourceId = d.getResourceId(22, C0966R.style.f8807wq);
        this.f312997o = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, C107593a.f321896B);
        try {
            this.f313003u = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f312998p = C110368a.m150198a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d.hasValue(23)) {
                this.f312998p = C110368a.m150198a(context, d, 23);
            }
            if (d.hasValue(21)) {
                int color = d.getColor(21, 0);
                int defaultColor = this.f312998p.getDefaultColor();
                this.f312998p = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f312999q = C110368a.m150198a(context, d, 3);
            this.f313002t = C109992l.m149512a(d.getInt(4, -1), (PorterDuff.Mode) null);
            this.f313000r = C110368a.m150198a(context, d, 20);
            this.f312972D = d.getInt(6, 300);
            this.f313007y = d.getDimensionPixelSize(13, -1);
            this.f313008z = d.getDimensionPixelSize(12, -1);
            this.f313005w = d.getResourceId(0, 0);
            this.f312970B = d.getDimensionPixelSize(1, 0);
            this.f312974F = d.getInt(14, 1);
            this.f312971C = d.getInt(2, 0);
            this.f312975G = d.getBoolean(11, false);
            this.f312977I = d.getBoolean(24, false);
            d.recycle();
            Resources resources = getResources();
            this.f313004v = (float) resources.getDimensionPixelSize(C0966R.dimen.a1c);
            this.f312969A = resources.getDimensionPixelSize(C0966R.dimen.a1a);
            mo149816d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, int i) {
        mo149814b(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo149814b(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo149814b(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C107922a.m146228b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
