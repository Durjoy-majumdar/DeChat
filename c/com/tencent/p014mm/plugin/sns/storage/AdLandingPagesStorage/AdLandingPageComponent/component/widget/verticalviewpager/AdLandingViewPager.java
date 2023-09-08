package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.widget.C103726d;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import junit.framework.Assert;
import p1108f3.C107453d;
import p834a3.C103300f;
import p834a3.C103301g;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C107222v;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager */
public class AdLandingViewPager extends ViewGroup {

    /* renamed from: W0 */
    public static final int[] f316205W0 = {16842931};

    /* renamed from: X0 */
    public static final Comparator<C106159d> f316206X0 = new C106156a();

    /* renamed from: Y0 */
    public static final Interpolator f316207Y0 = new C106157b();

    /* renamed from: Z0 */
    public static final C106163h f316208Z0 = new C106163h();

    /* renamed from: A */
    public boolean f316209A;

    /* renamed from: B */
    public int f316210B = 1;

    /* renamed from: C */
    public boolean f316211C;

    /* renamed from: D */
    public boolean f316212D;

    /* renamed from: E */
    public int f316213E;

    /* renamed from: F */
    public int f316214F;

    /* renamed from: G */
    public int f316215G;

    /* renamed from: H */
    public float f316216H;

    /* renamed from: I */
    public float f316217I;

    /* renamed from: J */
    public float f316218J;

    /* renamed from: K */
    public float f316219K;

    /* renamed from: L */
    public int f316220L = -1;

    /* renamed from: M */
    public VelocityTracker f316221M;

    /* renamed from: N */
    public int f316222N;

    /* renamed from: P */
    public int f316223P;

    /* renamed from: Q */
    public int f316224Q;

    /* renamed from: Q0 */
    public ViewPager.C0133h f316225Q0;

    /* renamed from: R */
    public int f316226R;

    /* renamed from: R0 */
    public Method f316227R0;

    /* renamed from: S */
    public boolean f316228S;

    /* renamed from: S0 */
    public int f316229S0;

    /* renamed from: T */
    public long f316230T;

    /* renamed from: T0 */
    public ArrayList<View> f316231T0;

    /* renamed from: U */
    public C103726d f316232U;

    /* renamed from: U0 */
    public final Runnable f316233U0 = new C106158c();

    /* renamed from: V */
    public C103726d f316234V;

    /* renamed from: V0 */
    public int f316235V0 = 0;

    /* renamed from: W */
    public boolean f316236W = true;

    /* renamed from: d */
    public int f316237d;

    /* renamed from: e */
    public final ArrayList<C106159d> f316238e = new ArrayList<>();

    /* renamed from: f */
    public final C106159d f316239f = new C106159d();

    /* renamed from: g */
    public final Rect f316240g = new Rect();

    /* renamed from: h */
    public C103853a f316241h;

    /* renamed from: i */
    public int f316242i;

    /* renamed from: j */
    public int f316243j = -1;

    /* renamed from: n */
    public Parcelable f316244n = null;

    /* renamed from: o */
    public ClassLoader f316245o = null;

    /* renamed from: p */
    public Scroller f316246p;

    /* renamed from: p0 */
    public boolean f316247p0;

    /* renamed from: q */
    public C106162g f316248q;

    /* renamed from: r */
    public int f316249r;

    /* renamed from: s */
    public Drawable f316250s;

    /* renamed from: t */
    public int f316251t;

    /* renamed from: u */
    public int f316252u;

    /* renamed from: v */
    public float f316253v = -3.4028235E38f;

    /* renamed from: w */
    public float f316254w = Float.MAX_VALUE;

    /* renamed from: x */
    public int f316255x;

    /* renamed from: x0 */
    public int f316256x0;

    /* renamed from: y */
    public boolean f316257y;

    /* renamed from: y0 */
    public ViewPager.OnPageChangeListener f316258y0;

    /* renamed from: z */
    public boolean f316259z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103300f(new C106155a());

        /* renamed from: d */
        public int f316266d;

        /* renamed from: e */
        public Parcelable f316267e;

        /* renamed from: f */
        public ClassLoader f316268f;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$a */
        public class C106155a implements C103301g<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SavedState savedState = new SavedState(parcel, classLoader);
                SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                return savedState;
            }

            public Object[] newArray(int i) {
                SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SavedState[] savedStateArr = new SavedState[i];
                SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState$1");
                return savedStateArr;
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            String str = "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f316266d + "}";
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            return str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f316266d);
            parcel.writeParcelable(this.f316267e, i);
            SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$SavedState");
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f316266d = parcel.readInt();
            this.f316267e = parcel.readParcelable(classLoader);
            this.f316268f = classLoader;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$a */
    public class C106156a implements Comparator<C106159d> {
        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$1");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$1");
            int i = ((C106159d) obj).f316271b - ((C106159d) obj2).f316271b;
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$1");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$b */
    public class C106157b implements Interpolator {
        public float getInterpolation(float f) {
            SnsMethodCalculate.markStartTimeMs("getInterpolation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$2");
            float f2 = f - 1.0f;
            float f3 = (f2 * f2 * f2 * f2 * f2) + 1.0f;
            SnsMethodCalculate.markEndTimeMs("getInterpolation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$2");
            return f3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$c */
    public class C106158c implements Runnable {
        public C106158c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$3");
            AdLandingViewPager.m142794a(AdLandingViewPager.this, 0);
            AdLandingViewPager.this.mo151971x();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d */
    public static class C106159d {

        /* renamed from: a */
        public Object f316270a;

        /* renamed from: b */
        public int f316271b;

        /* renamed from: c */
        public boolean f316272c;

        /* renamed from: d */
        public float f316273d;

        /* renamed from: e */
        public float f316274e;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$e */
    public class C106160e extends C107166a {
        public C106160e() {
        }

        /* renamed from: b */
        public final boolean mo151979b() {
            SnsMethodCalculate.markStartTimeMs("canScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
            boolean z = true;
            if (AdLandingViewPager.m142795b(AdLandingViewPager.this) == null || AdLandingViewPager.m142795b(AdLandingViewPager.this).getCount() <= 1) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("canScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
            return z;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            SnsMethodCalculate.markStartTimeMs("onInitializeAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(AdLandingViewPager.class.getName());
            AccessibilityRecord obtain = AccessibilityRecord.obtain();
            obtain.setScrollable(mo151979b());
            if (accessibilityEvent.getEventType() == 4096 && AdLandingViewPager.m142795b(AdLandingViewPager.this) != null) {
                obtain.setItemCount(AdLandingViewPager.m142795b(AdLandingViewPager.this).getCount());
                obtain.setFromIndex(AdLandingViewPager.m142796c(AdLandingViewPager.this));
                obtain.setToIndex(AdLandingViewPager.m142796c(AdLandingViewPager.this));
            }
            SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            SnsMethodCalculate.markStartTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.mo157852l(AdLandingViewPager.class.getName());
            dVar.mo157863v(mo151979b());
            if (AdLandingViewPager.this.canScrollHorizontally(1)) {
                dVar.mo157839a(4096);
            }
            if (AdLandingViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo157839a(8192);
            }
            SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
            if (super.performAccessibilityAction(view, i, bundle)) {
                SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                return true;
            } else if (i != 4096) {
                if (i != 8192) {
                    SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                    return false;
                } else if (AdLandingViewPager.this.canScrollHorizontally(-1)) {
                    AdLandingViewPager adLandingViewPager = AdLandingViewPager.this;
                    adLandingViewPager.setCurrentItem(AdLandingViewPager.m142796c(adLandingViewPager) - 1);
                    SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                    return true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                    return false;
                }
            } else if (AdLandingViewPager.this.canScrollHorizontally(1)) {
                AdLandingViewPager adLandingViewPager2 = AdLandingViewPager.this;
                adLandingViewPager2.setCurrentItem(AdLandingViewPager.m142796c(adLandingViewPager2) + 1);
                SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                return true;
            } else {
                SnsMethodCalculate.markEndTimeMs("performAccessibilityAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$MyAccessibilityDelegate");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$f */
    public interface C106161f {
        /* renamed from: a */
        void mo151980a(C103853a aVar, C103853a aVar2);
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$g */
    public class C106162g extends DataSetObserver {
        public C106162g(C106156a aVar) {
        }

        public void onChanged() {
            SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$PagerObserver");
            AdLandingViewPager.this.mo151937i();
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$PagerObserver");
        }

        public void onInvalidated() {
            SnsMethodCalculate.markStartTimeMs("onInvalidated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$PagerObserver");
            AdLandingViewPager.this.mo151937i();
            SnsMethodCalculate.markEndTimeMs("onInvalidated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$PagerObserver");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$h */
    public static class C106163h implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            int i;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$ViewPositionComparator");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$ViewPositionComparator");
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            boolean z = layoutParams.f316260a;
            if (z != layoutParams2.f316260a) {
                i = z ? 1 : -1;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$ViewPositionComparator");
            } else {
                i = layoutParams.f316264e - layoutParams2.f316264e;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$ViewPositionComparator");
            }
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$ViewPositionComparator");
            return i;
        }
    }

    public AdLandingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("initViewPager", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f316246p = new Scroller(context2, f316207Y0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        Method method = C107222v.f320820a;
        this.f316215G = viewConfiguration.getScaledPagingTouchSlop();
        this.f316222N = (int) (400.0f * f);
        this.f316223P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f316232U = new C103726d(context2);
        this.f316234V = new C103726d(context2);
        this.f316224Q = (int) (25.0f * f);
        this.f316226R = (int) (2.0f * f);
        this.f316213E = (int) (f * 16.0f);
        C107207u.m145168i(this, new C106160e());
        if (C107207u.C107208b.m145175c(this) == 0) {
            C107207u.C107208b.m145191s(this, 1);
        }
        SnsMethodCalculate.markEndTimeMs("initViewPager", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: a */
    public static /* synthetic */ void m142794a(AdLandingViewPager adLandingViewPager, int i) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        adLandingViewPager.setScrollState(i);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: b */
    public static /* synthetic */ C103853a m142795b(AdLandingViewPager adLandingViewPager) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C103853a aVar = adLandingViewPager.f316241h;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ int m142796c(AdLandingViewPager adLandingViewPager) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i = adLandingViewPager.f316242i;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i;
    }

    private int getClientWidth() {
        SnsMethodCalculate.markStartTimeMs("getClientWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        SnsMethodCalculate.markEndTimeMs("getClientWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return measuredWidth;
    }

    /* renamed from: k */
    private void m142797k() {
        SnsMethodCalculate.markStartTimeMs("endDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316211C = false;
        this.f316212D = false;
        VelocityTracker velocityTracker = this.f316221M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f316221M = null;
        }
        SnsMethodCalculate.markEndTimeMs("endDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: s */
    private void m142798s(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSecondaryPointerUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f316220L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f316216H = motionEvent.getX(i);
            this.f316220L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f316221M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSecondaryPointerUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void setScrollState(int i) {
        SnsMethodCalculate.markStartTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316235V0 == i) {
            SnsMethodCalculate.markEndTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        this.f316235V0 = i;
        if (this.f316225Q0 != null) {
            boolean z = i != 0;
            SnsMethodCalculate.markStartTimeMs("enableLayers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                int i3 = z ? 2 : 0;
                View childAt = getChildAt(i2);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                childAt.setLayerType(i3, (Paint) null);
            }
            SnsMethodCalculate.markEndTimeMs("enableLayers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f316258y0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        SnsMethodCalculate.markEndTimeMs("setScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    private void setScrollingCacheEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setScrollingCacheEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316259z != z) {
            this.f316259z = z;
        }
        SnsMethodCalculate.markEndTimeMs("setScrollingCacheEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: A */
    public final void mo151909A(int i, boolean z, int i2, boolean z2) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("scrollToItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C106159d q = mo151954q(i);
        int clientWidth = q != null ? (int) (((float) getClientWidth()) * Math.max(this.f316253v, Math.min(q.f316274e, this.f316254w))) : 0;
        if (z) {
            SnsMethodCalculate.markStartTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
                SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i4 = clientWidth - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    mo151936h(false);
                    mo151971x();
                    setScrollState(0);
                    SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth2 = getClientWidth();
                    int i6 = clientWidth2 / 2;
                    float f = (float) clientWidth2;
                    float min = Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f);
                    float f2 = (float) i6;
                    SnsMethodCalculate.markStartTimeMs("distanceInfluenceForSnapDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    SnsMethodCalculate.markEndTimeMs("distanceInfluenceForSnapDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    float sin = f2 + (((float) Math.sin((double) ((float) (((double) (min - 0.5f)) * 0.4712389167638204d)))) * f2);
                    int abs = Math.abs(i2);
                    this.f316246p.startScroll(scrollX, scrollY, i4, i5, Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i4)) / ((f * this.f316241h.getPageWidth(this.f316242i)) + ((float) this.f316249r))) + 3.0f) * 100.0f), 600));
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145183k(this);
                    SnsMethodCalculate.markEndTimeMs("smoothScrollTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                }
            }
            if (z2 && (onPageChangeListener2 = this.f316258y0) != null) {
                onPageChangeListener2.onPageSelected(i3);
            }
        } else {
            if (z2 && (onPageChangeListener = this.f316258y0) != null) {
                onPageChangeListener.onPageSelected(i3);
            }
            mo151936h(false);
            scrollTo(clientWidth, 0);
            mo151968v(clientWidth);
        }
        SnsMethodCalculate.markEndTimeMs("scrollToItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: B */
    public void mo151910B(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316209A = false;
        mo151911C(i, z, false);
        SnsMethodCalculate.markEndTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo151911C(int i, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        mo151912D(i, z, z2, 0);
        SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo151912D(int i, boolean z, boolean z2, int i2) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        SnsMethodCalculate.markStartTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C103853a aVar = this.f316241h;
        boolean z3 = false;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        } else if (z2 || this.f316242i != i || this.f316238e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f316241h.getCount()) {
                i = this.f316241h.getCount() - 1;
            }
            int i3 = this.f316210B;
            int i4 = this.f316242i;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f316238e.size(); i5++) {
                    this.f316238e.get(i5).f316272c = true;
                }
            }
            if (this.f316242i != i) {
                z3 = true;
            }
            if (this.f316236W) {
                this.f316242i = i;
                if (z3 && (onPageChangeListener = this.f316258y0) != null) {
                    onPageChangeListener.onPageSelected(i);
                }
                requestLayout();
            } else {
                mo151972y(i);
                mo151909A(i, z, i2, z3);
            }
            SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        } else {
            setScrollingCacheEnabled(false);
            SnsMethodCalculate.markEndTimeMs("setCurrentItemInternal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        }
    }

    /* renamed from: E */
    public final void mo151913E() {
        SnsMethodCalculate.markStartTimeMs("sortChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316229S0 != 0) {
            ArrayList<View> arrayList = this.f316231T0;
            if (arrayList == null) {
                this.f316231T0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f316231T0.add(getChildAt(i));
            }
            Collections.sort(this.f316231T0, f316208Z0);
        }
        SnsMethodCalculate.markEndTimeMs("sortChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C106159d o;
        SnsMethodCalculate.markStartTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        Assert.assertNotNull(arrayList);
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (o = mo151942o(childAt)) != null && o.f316271b == this.f316242i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if (descendantFocusability != 262144 || size == arrayList.size()) {
            if (!isFocusable()) {
                SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return;
            } else if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            } else {
                SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("addFocusables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C106159d o;
        SnsMethodCalculate.markStartTimeMs("addTouchables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (o = mo151942o(childAt)) != null && o.f316271b == this.f316242i) {
                childAt.addTouchables(arrayList);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addTouchables", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        Assert.assertNotNull(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f316260a | false;
        layoutParams2.f316260a = z;
        if (!this.f316257y) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            layoutParams2.f316263d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            throw illegalStateException;
        }
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public boolean canScrollHorizontally(int i) {
        SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z = false;
        if (this.f316241h == null) {
            SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f316253v))) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return z;
        } else if (i > 0) {
            if (scrollX < ((int) (((float) clientWidth) * this.f316254w))) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return z;
        } else {
            SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("checkLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z = (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("checkLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z;
    }

    public void computeScroll() {
        SnsMethodCalculate.markStartTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316246p.isFinished() || !this.f316246p.computeScrollOffset()) {
            mo151936h(true);
            SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f316246p.getCurrX();
        int currY = this.f316246p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!mo151968v(currX)) {
                this.f316246p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(this);
        SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: d */
    public C106159d mo151920d(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("addNewItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C106159d dVar = new C106159d();
        dVar.f316271b = i;
        dVar.f316270a = this.f316241h.instantiateItem((ViewGroup) this, i);
        dVar.f316273d = this.f316241h.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f316238e.size()) {
            this.f316238e.add(dVar);
        } else {
            this.f316238e.add(i2, dVar);
        }
        SnsMethodCalculate.markEndTimeMs("addNewItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r8 == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "dispatchKeyEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = super.dispatchKeyEvent(r8)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0056
            java.lang.String r2 = "executeKeyEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            int r5 = r8.getAction()
            if (r5 != 0) goto L_0x0050
            int r5 = r8.getKeyCode()
            r6 = 21
            if (r5 == r6) goto L_0x0049
            r6 = 22
            if (r5 == r6) goto L_0x0042
            r6 = 61
            if (r5 == r6) goto L_0x002b
            goto L_0x0050
        L_0x002b:
            boolean r5 = r8.hasNoModifiers()
            if (r5 == 0) goto L_0x0037
            r8 = 2
            boolean r8 = r7.mo151925e(r8)
            goto L_0x0051
        L_0x0037:
            boolean r8 = r8.hasModifiers(r4)
            if (r8 == 0) goto L_0x0050
            boolean r8 = r7.mo151925e(r4)
            goto L_0x0051
        L_0x0042:
            r8 = 66
            boolean r8 = r7.mo151925e(r8)
            goto L_0x0051
        L_0x0049:
            r8 = 17
            boolean r8 = r7.mo151925e(r8)
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r8 == 0) goto L_0x0057
        L_0x0056:
            r3 = 1
        L_0x0057:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C106159d o;
        SnsMethodCalculate.markStartTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (accessibilityEvent.getEventType() == 4096) {
            boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return dispatchPopulateAccessibilityEvent;
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 0 || (o = mo151942o(childAt)) == null || o.f316271b != this.f316242i || !childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                i++;
            } else {
                SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("dispatchPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return false;
    }

    public void draw(Canvas canvas) {
        C103853a aVar;
        SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.draw(canvas);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f316241h) != null && aVar.getCount() > 1)) {
            if (!this.f316232U.mo145032b()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f316253v * ((float) width));
                this.f316232U.f306420a.setSize(height, width);
                z = false | this.f316232U.f306420a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f316234V.mo145032b()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f316254w + 1.0f)) * ((float) width2));
                this.f316234V.f306420a.setSize(height2, width2);
                z |= this.f316234V.f306420a.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f316232U.f306420a.finish();
            this.f316234V.f306420a.finish();
        }
        if (z) {
            C107207u.C107208b.m145183k(this);
        }
        SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void drawableStateChanged() {
        SnsMethodCalculate.markStartTimeMs("drawableStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.drawableStateChanged();
        Drawable drawable = this.f316250s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        SnsMethodCalculate.markEndTimeMs("drawableStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo151925e(int r10) {
        /*
            r9 = this;
            java.lang.String r0 = "arrowScroll"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.view.View r2 = r9.findFocus()
            r3 = 0
            r4 = 1
            if (r2 != r9) goto L_0x0010
            goto L_0x0036
        L_0x0010:
            if (r2 == 0) goto L_0x0037
            android.view.ViewParent r5 = r2.getParent()
        L_0x0016:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0023
            if (r5 != r9) goto L_0x001e
            r5 = 1
            goto L_0x0024
        L_0x001e:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x0016
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r5 != 0) goto L_0x0037
            android.view.ViewParent r2 = r2.getParent()
        L_0x002a:
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0036
            r2.getClass()
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x002a
        L_0x0036:
            r2 = 0
        L_0x0037:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r5.findNextFocus(r9, r2, r10)
            r6 = 66
            r7 = 17
            java.lang.String r8 = "pageLeft"
            if (r5 == 0) goto L_0x009a
            if (r5 == r2) goto L_0x009a
            if (r10 != r7) goto L_0x007a
            android.graphics.Rect r6 = r9.f316240g
            android.graphics.Rect r6 = r9.mo151941n(r6, r5)
            int r6 = r6.left
            android.graphics.Rect r7 = r9.f316240g
            android.graphics.Rect r7 = r9.mo151941n(r7, r2)
            int r7 = r7.left
            if (r2 == 0) goto L_0x0074
            if (r6 < r7) goto L_0x0074
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r1)
            int r2 = r9.f316242i
            if (r2 <= 0) goto L_0x0070
            int r2 = r2 - r4
            r9.mo151910B(r2, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
        L_0x006e:
            r3 = 1
            goto L_0x00bb
        L_0x0070:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
            goto L_0x00bb
        L_0x0074:
            boolean r2 = r5.requestFocus()
        L_0x0078:
            r3 = r2
            goto L_0x00bb
        L_0x007a:
            if (r10 != r6) goto L_0x00bb
            android.graphics.Rect r3 = r9.f316240g
            android.graphics.Rect r3 = r9.mo151941n(r3, r5)
            int r3 = r3.left
            android.graphics.Rect r4 = r9.f316240g
            android.graphics.Rect r4 = r9.mo151941n(r4, r2)
            int r4 = r4.left
            if (r2 == 0) goto L_0x0095
            if (r3 > r4) goto L_0x0095
            boolean r2 = r9.mo151967t()
            goto L_0x0078
        L_0x0095:
            boolean r2 = r5.requestFocus()
            goto L_0x0078
        L_0x009a:
            if (r10 == r7) goto L_0x00a9
            if (r10 != r4) goto L_0x009f
            goto L_0x00a9
        L_0x009f:
            if (r10 == r6) goto L_0x00a4
            r2 = 2
            if (r10 != r2) goto L_0x00bb
        L_0x00a4:
            boolean r3 = r9.mo151967t()
            goto L_0x00bb
        L_0x00a9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r1)
            int r2 = r9.f316242i
            if (r2 <= 0) goto L_0x00b8
            int r2 = r2 - r4
            r9.mo151910B(r2, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
            goto L_0x006e
        L_0x00b8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
        L_0x00bb:
            if (r3 == 0) goto L_0x00c4
            int r10 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r10)
        L_0x00c4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.mo151925e(int):boolean");
    }

    /* renamed from: f */
    public boolean mo151926f() {
        SnsMethodCalculate.markStartTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316211C) {
            SnsMethodCalculate.markEndTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        this.f316228S = true;
        setScrollState(1);
        this.f316216H = 0.0f;
        this.f316218J = 0.0f;
        VelocityTracker velocityTracker = this.f316221M;
        if (velocityTracker == null) {
            this.f316221M = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f316221M.addMovement(obtain);
        obtain.recycle();
        this.f316230T = uptimeMillis;
        SnsMethodCalculate.markEndTimeMs("beginFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r15.canScrollHorizontally(-r17) != false) goto L_0x006c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo151927g(android.view.View r15, boolean r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r0 = r15
            java.lang.String r1 = "canScroll"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r0 instanceof android.view.ViewGroup
            r4 = 1
            if (r3 == 0) goto L_0x005d
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r5 = r15.getScrollX()
            int r6 = r15.getScrollY()
            int r7 = r3.getChildCount()
            int r7 = r7 - r4
        L_0x001d:
            if (r7 < 0) goto L_0x005d
            android.view.View r9 = r3.getChildAt(r7)
            int r8 = r18 + r5
            int r10 = r9.getLeft()
            if (r8 < r10) goto L_0x005a
            int r10 = r9.getRight()
            if (r8 >= r10) goto L_0x005a
            int r10 = r19 + r6
            int r11 = r9.getTop()
            if (r10 < r11) goto L_0x005a
            int r11 = r9.getBottom()
            if (r10 >= r11) goto L_0x005a
            r11 = 1
            int r12 = r9.getLeft()
            int r12 = r8 - r12
            int r8 = r9.getTop()
            int r13 = r10 - r8
            r8 = r14
            r10 = r11
            r11 = r17
            boolean r8 = r8.mo151927g(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x005a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x005a:
            int r7 = r7 + -1
            goto L_0x001d
        L_0x005d:
            if (r16 == 0) goto L_0x006b
            r3 = r17
            int r3 = -r3
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a
            boolean r0 = r15.canScrollHorizontally(r3)
            if (r0 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.mo151927g(android.view.View, boolean, int, int, int):boolean");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        SnsMethodCalculate.markStartTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        LayoutParams layoutParams = new LayoutParams();
        SnsMethodCalculate.markEndTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return layoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        SnsMethodCalculate.markEndTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return generateDefaultLayoutParams;
    }

    public C103853a getAdapter() {
        SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C103853a aVar = this.f316241h;
        SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return aVar;
    }

    public int getChildDrawingOrder(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316229S0 == 2) {
            i2 = (i - 1) - i2;
        }
        int i3 = ((LayoutParams) this.f316231T0.get(i2).getLayoutParams()).f316265f;
        SnsMethodCalculate.markEndTimeMs("getChildDrawingOrder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i3;
    }

    public int getCurrentItem() {
        SnsMethodCalculate.markStartTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i = this.f316242i;
        SnsMethodCalculate.markEndTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i;
    }

    public int getOffscreenPageLimit() {
        SnsMethodCalculate.markStartTimeMs("getOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i = this.f316210B;
        SnsMethodCalculate.markEndTimeMs("getOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i;
    }

    public int getPageMargin() {
        SnsMethodCalculate.markStartTimeMs("getPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i = this.f316249r;
        SnsMethodCalculate.markEndTimeMs("getPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i;
    }

    /* renamed from: h */
    public final void mo151936h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("completeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z2 = this.f316235V0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f316246p.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f316246p.getCurrX();
            int currY = this.f316246p.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f316209A = false;
        for (int i = 0; i < this.f316238e.size(); i++) {
            C106159d dVar = this.f316238e.get(i);
            if (dVar.f316272c) {
                dVar.f316272c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                Runnable runnable = this.f316233U0;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(this, runnable);
            } else {
                ((C106158c) this.f316233U0).run();
            }
        }
        SnsMethodCalculate.markEndTimeMs("completeScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo151937i() {
        SnsMethodCalculate.markStartTimeMs("dataSetChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int count = this.f316241h.getCount();
        this.f316237d = count;
        boolean z = this.f316238e.size() < (this.f316210B * 2) + 1 && this.f316238e.size() < count;
        int i = this.f316242i;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f316238e.size()) {
            C106159d dVar = this.f316238e.get(i2);
            int itemPosition = this.f316241h.getItemPosition(dVar.f316270a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f316238e.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f316241h.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f316241h.destroyItem((ViewGroup) this, dVar.f316271b, dVar.f316270a);
                    int i3 = this.f316242i;
                    if (i3 == dVar.f316271b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = dVar.f316271b;
                    if (i4 != itemPosition) {
                        if (i4 == this.f316242i) {
                            i = itemPosition;
                        }
                        dVar.f316271b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f316241h.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f316238e, f316206X0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f316260a) {
                    layoutParams.f316262c = 0.0f;
                }
            }
            mo151911C(i, false, true);
            requestLayout();
        }
        SnsMethodCalculate.markEndTimeMs("dataSetChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: j */
    public final int mo151938j(int i, float f, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("determineTargetPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (Math.abs(i3) <= this.f316224Q || Math.abs(i2) <= this.f316222N) {
            i = (int) (((float) i) + f + (i >= this.f316242i ? 0.85f : 0.15f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f316238e.size() > 0) {
            SnsMethodCalculate.markStartTimeMs("firstItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int i4 = this.f316238e.get(0).f316271b;
            SnsMethodCalculate.markEndTimeMs("firstItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            SnsMethodCalculate.markStartTimeMs("lastItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            ArrayList<C106159d> arrayList = this.f316238e;
            int i5 = arrayList.get(arrayList.size() - 1).f316271b;
            SnsMethodCalculate.markEndTimeMs("lastItemPosForDetermine", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            i = Math.max(i4, Math.min(i, i5));
        }
        SnsMethodCalculate.markEndTimeMs("determineTargetPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return i;
    }

    /* renamed from: l */
    public void mo151939l() {
        SnsMethodCalculate.markStartTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316228S) {
            VelocityTracker velocityTracker = this.f316221M;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f316223P);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f316220L);
            this.f316209A = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C106159d p = mo151953p();
            mo151912D(mo151938j(p.f316271b, ((((float) scrollX) / ((float) clientWidth)) - p.f316274e) / p.f316273d, xVelocity, (int) (this.f316216H - this.f316218J)), true, true, xVelocity);
            m142797k();
            this.f316228S = false;
            SnsMethodCalculate.markEndTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        SnsMethodCalculate.markEndTimeMs("endFakeDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        throw illegalStateException;
    }

    /* renamed from: m */
    public void mo151940m(float f) {
        SnsMethodCalculate.markStartTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316228S) {
            this.f316216H += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.f316253v * clientWidth;
            float f3 = this.f316254w * clientWidth;
            C106159d dVar = this.f316238e.get(0);
            ArrayList<C106159d> arrayList = this.f316238e;
            C106159d dVar2 = arrayList.get(arrayList.size() - 1);
            if (dVar.f316271b != 0) {
                f2 = dVar.f316274e * clientWidth;
            }
            if (dVar2.f316271b != this.f316241h.getCount() - 1) {
                f3 = dVar2.f316274e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f316216H += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            mo151968v(i);
            MotionEvent obtain = MotionEvent.obtain(this.f316230T, SystemClock.uptimeMillis(), 2, this.f316216H, 0.0f, 0);
            this.f316221M.addMovement(obtain);
            obtain.recycle();
            SnsMethodCalculate.markEndTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        SnsMethodCalculate.markEndTimeMs("fakeDragBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        throw illegalStateException;
    }

    /* renamed from: n */
    public final Rect mo151941n(Rect rect, View view) {
        SnsMethodCalculate.markStartTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            SnsMethodCalculate.markEndTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        SnsMethodCalculate.markEndTimeMs("getChildRectInPagerCoordinates", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return rect;
    }

    /* renamed from: o */
    public C106159d mo151942o(View view) {
        SnsMethodCalculate.markStartTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        for (int i = 0; i < this.f316238e.size(); i++) {
            C106159d dVar = this.f316238e.get(i);
            if (this.f316241h.isViewFromObject(view, dVar.f316270a)) {
                SnsMethodCalculate.markEndTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return dVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("infoForChild", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return null;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.onAttachedToWindow();
        this.f316236W = true;
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        removeCallbacks(this.f316233U0);
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "onDraw"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            super.onDraw(r20)
            int r3 = r0.f316249r
            if (r3 <= 0) goto L_0x00b8
            android.graphics.drawable.Drawable r3 = r0.f316250s
            if (r3 == 0) goto L_0x00b8
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r3 = r0.f316238e
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00b8
            androidx.viewpager.widget.a r3 = r0.f316241h
            if (r3 == 0) goto L_0x00b8
            int r3 = r19.getScrollX()
            int r4 = r19.getWidth()
            int r5 = r0.f316249r
            float r5 = (float) r5
            float r6 = (float) r4
            float r5 = r5 / r6
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r7 = r0.f316238e
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r7
            float r9 = r7.f316274e
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r10 = r0.f316238e
            int r10 = r10.size()
            int r11 = r7.f316271b
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r12 = r0.f316238e
            int r13 = r10 + -1
            java.lang.Object r12 = r12.get(r13)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r12 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r12
            int r12 = r12.f316271b
        L_0x004d:
            if (r11 >= r12) goto L_0x00b8
        L_0x004f:
            int r13 = r7.f316271b
            if (r11 <= r13) goto L_0x0060
            if (r8 >= r10) goto L_0x0060
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r7 = r0.f316238e
            int r8 = r8 + 1
            java.lang.Object r7 = r7.get(r8)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r7
            goto L_0x004f
        L_0x0060:
            if (r11 != r13) goto L_0x006d
            float r9 = r7.f316274e
            float r13 = r7.f316273d
            float r14 = r9 + r13
            float r14 = r14 * r6
            float r9 = r9 + r13
            float r9 = r9 + r5
            goto L_0x0079
        L_0x006d:
            androidx.viewpager.widget.a r13 = r0.f316241h
            float r13 = r13.getPageWidth(r11)
            float r14 = r9 + r13
            float r14 = r14 * r6
            float r13 = r13 + r5
            float r9 = r9 + r13
        L_0x0079:
            int r13 = r0.f316249r
            float r15 = (float) r13
            float r15 = r15 + r14
            r16 = r5
            float r5 = (float) r3
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a1
            android.graphics.drawable.Drawable r5 = r0.f316250s
            int r15 = (int) r14
            r17 = r6
            int r6 = r0.f316251t
            float r13 = (float) r13
            float r13 = r13 + r14
            r18 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r18
            int r13 = (int) r13
            r18 = r7
            int r7 = r0.f316252u
            r5.setBounds(r15, r6, r13, r7)
            android.graphics.drawable.Drawable r5 = r0.f316250s
            r6 = r20
            r5.draw(r6)
            goto L_0x00a7
        L_0x00a1:
            r17 = r6
            r18 = r7
            r6 = r20
        L_0x00a7:
            int r5 = r3 + r4
            float r5 = (float) r5
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00af
            goto L_0x00b8
        L_0x00af:
            int r11 = r11 + 1
            r5 = r16
            r6 = r17
            r7 = r18
            goto L_0x004d
        L_0x00b8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f316211C = false;
            this.f316212D = false;
            this.f316220L = -1;
            VelocityTracker velocityTracker = this.f316221M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f316221M = null;
            }
            SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        if (action != 0) {
            if (this.f316211C) {
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            } else if (this.f316212D) {
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f316218J = x;
            this.f316216H = x;
            float y = motionEvent.getY();
            this.f316219K = y;
            this.f316217I = y;
            this.f316220L = motionEvent2.getPointerId(0);
            this.f316212D = false;
            this.f316246p.computeScrollOffset();
            if (this.f316235V0 != 2 || Math.abs(this.f316246p.getFinalX() - this.f316246p.getCurrX()) <= this.f316226R) {
                mo151936h(false);
                this.f316211C = false;
            } else {
                this.f316246p.abortAnimation();
                this.f316209A = false;
                mo151971x();
                this.f316211C = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f316220L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f316216H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f316219K);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    float f2 = this.f316216H;
                    SnsMethodCalculate.markStartTimeMs("isGutterDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    boolean z = (f2 < ((float) this.f316214F) && i2 > 0) || (f2 > ((float) (getWidth() - this.f316214F)) && f < 0.0f);
                    SnsMethodCalculate.markEndTimeMs("isGutterDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                    if (!z) {
                        if (mo151927g(this, false, (int) f, (int) x2, (int) y2)) {
                            this.f316216H = x2;
                            this.f316217I = y2;
                            this.f316212D = true;
                            SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                            return false;
                        }
                    }
                }
                int i3 = this.f316215G;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f316211C = true;
                    setScrollState(1);
                    this.f316216H = i2 > 0 ? this.f316218J + ((float) this.f316215G) : this.f316218J - ((float) this.f316215G);
                    this.f316217I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.f316212D = true;
                }
                if (this.f316211C && mo151970w(x2)) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145183k(this);
                }
            }
        } else if (action == 6) {
            m142798s(motionEvent);
        }
        if (this.f316221M == null) {
            this.f316221M = VelocityTracker.obtain();
        }
        this.f316221M.addMovement(motionEvent2);
        boolean z2 = this.f316211C;
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "onLayout"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            int r3 = r19.getChildCount()
            int r4 = r23 - r21
            int r5 = r24 - r22
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingTop()
            int r8 = r19.getPaddingRight()
            int r9 = r19.getPaddingBottom()
            int r10 = r19.getScrollX()
            r12 = 0
            r13 = 0
        L_0x0028:
            r14 = 8
            if (r12 >= r3) goto L_0x00c8
            android.view.View r15 = r0.getChildAt(r12)
            int r11 = r15.getVisibility()
            if (r11 == r14) goto L_0x00c0
            android.view.ViewGroup$LayoutParams r11 = r15.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r11 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r11
            boolean r14 = r11.f316260a
            if (r14 == 0) goto L_0x00c0
            int r11 = r11.f316261b
            r14 = r11 & 7
            r11 = r11 & 112(0x70, float:1.57E-43)
            r16 = r1
            r1 = 1
            if (r14 == r1) goto L_0x0066
            r1 = 3
            if (r14 == r1) goto L_0x0060
            r1 = 5
            if (r14 == r1) goto L_0x0053
            r1 = r6
            goto L_0x0077
        L_0x0053:
            int r1 = r4 - r8
            int r14 = r15.getMeasuredWidth()
            int r1 = r1 - r14
            int r14 = r15.getMeasuredWidth()
            int r8 = r8 + r14
            goto L_0x0072
        L_0x0060:
            int r1 = r15.getMeasuredWidth()
            int r1 = r1 + r6
            goto L_0x0077
        L_0x0066:
            int r1 = r15.getMeasuredWidth()
            int r1 = r4 - r1
            int r1 = r1 / 2
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0072:
            r18 = r6
            r6 = r1
            r1 = r18
        L_0x0077:
            r14 = 16
            if (r11 == r14) goto L_0x0098
            r14 = 48
            if (r11 == r14) goto L_0x0092
            r14 = 80
            if (r11 == r14) goto L_0x0085
            r11 = r7
            goto L_0x00a9
        L_0x0085:
            int r11 = r5 - r9
            int r14 = r15.getMeasuredHeight()
            int r11 = r11 - r14
            int r14 = r15.getMeasuredHeight()
            int r9 = r9 + r14
            goto L_0x00a4
        L_0x0092:
            int r11 = r15.getMeasuredHeight()
            int r11 = r11 + r7
            goto L_0x00a9
        L_0x0098:
            int r11 = r15.getMeasuredHeight()
            int r11 = r5 - r11
            int r11 = r11 / 2
            int r11 = java.lang.Math.max(r11, r7)
        L_0x00a4:
            r18 = r11
            r11 = r7
            r7 = r18
        L_0x00a9:
            int r6 = r6 + r10
            int r14 = r15.getMeasuredWidth()
            int r14 = r14 + r6
            int r17 = r15.getMeasuredHeight()
            r21 = r1
            int r1 = r7 + r17
            r15.layout(r6, r7, r14, r1)
            int r13 = r13 + 1
            r6 = r21
            r7 = r11
            goto L_0x00c2
        L_0x00c0:
            r16 = r1
        L_0x00c2:
            int r12 = r12 + 1
            r1 = r16
            goto L_0x0028
        L_0x00c8:
            r16 = r1
            int r4 = r4 - r6
            int r4 = r4 - r8
            r1 = 0
        L_0x00cd:
            if (r1 >= r3) goto L_0x011c
            android.view.View r8 = r0.getChildAt(r1)
            int r10 = r8.getVisibility()
            if (r10 == r14) goto L_0x0119
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r10 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r10
            boolean r11 = r10.f316260a
            if (r11 != 0) goto L_0x0119
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r11 = r0.mo151942o(r8)
            if (r11 == 0) goto L_0x0119
            float r12 = (float) r4
            float r11 = r11.f316274e
            float r11 = r11 * r12
            int r11 = (int) r11
            int r11 = r11 + r6
            boolean r15 = r10.f316263d
            if (r15 == 0) goto L_0x010c
            r15 = 0
            r10.f316263d = r15
            float r10 = r10.f316262c
            float r12 = r12 * r10
            int r10 = (int) r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r12)
            int r15 = r5 - r7
            int r15 = r15 - r9
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r12)
            r8.measure(r10, r12)
        L_0x010c:
            int r10 = r8.getMeasuredWidth()
            int r10 = r10 + r11
            int r12 = r8.getMeasuredHeight()
            int r12 = r12 + r7
            r8.layout(r11, r7, r10, r12)
        L_0x0119:
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x011c:
            r0.f316251t = r7
            int r5 = r5 - r9
            r0.f316252u = r5
            r0.f316256x0 = r13
            boolean r1 = r0.f316236W
            if (r1 == 0) goto L_0x012e
            int r1 = r0.f316242i
            r3 = 0
            r0.mo151909A(r1, r3, r3, r3)
            goto L_0x012f
        L_0x012e:
            r3 = 0
        L_0x012f:
            r0.f316236W = r3
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "onMeasure"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            r4 = r17
            int r4 = android.view.View.getDefaultSize(r3, r4)
            r5 = r18
            int r5 = android.view.View.getDefaultSize(r3, r5)
            r0.setMeasuredDimension(r4, r5)
            int r4 = r16.getMeasuredWidth()
            int r5 = r4 / 10
            int r6 = r0.f316213E
            int r5 = java.lang.Math.min(r5, r6)
            r0.f316214F = r5
            int r5 = r16.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r16.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r16.getMeasuredHeight()
            int r6 = r16.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r16.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r16.getChildCount()
            r7 = 0
        L_0x0045:
            r8 = 8
            r9 = 1
            if (r7 >= r6) goto L_0x00c1
            android.view.View r11 = r0.getChildAt(r7)
            int r12 = r11.getVisibility()
            if (r12 == r8) goto L_0x00bd
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r8
            if (r8 == 0) goto L_0x00bd
            boolean r12 = r8.f316260a
            if (r12 == 0) goto L_0x00bd
            int r12 = r8.f316261b
            r13 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r14 = 48
            if (r12 == r14) goto L_0x0071
            r14 = 80
            if (r12 != r14) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r12 = 0
            goto L_0x0072
        L_0x0071:
            r12 = 1
        L_0x0072:
            r14 = 3
            if (r13 == r14) goto L_0x007a
            r14 = 5
            if (r13 != r14) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == 0) goto L_0x0081
            r13 = 1073741824(0x40000000, float:2.0)
            goto L_0x0086
        L_0x0081:
            if (r9 == 0) goto L_0x0086
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0088
        L_0x0086:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0088:
            int r15 = r8.width
            r3 = -1
            r10 = -2
            if (r15 == r10) goto L_0x0095
            if (r15 == r3) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r15 = r4
        L_0x0092:
            r13 = 1073741824(0x40000000, float:2.0)
            goto L_0x0096
        L_0x0095:
            r15 = r4
        L_0x0096:
            int r8 = r8.height
            if (r8 == r10) goto L_0x00a1
            if (r8 == r3) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r5
        L_0x009e:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x00a3
        L_0x00a1:
            r8 = r5
            r10 = r14
        L_0x00a3:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r13)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            r11.measure(r3, r8)
            if (r12 == 0) goto L_0x00b6
            int r3 = r11.getMeasuredHeight()
            int r5 = r5 - r3
            goto L_0x00bd
        L_0x00b6:
            if (r9 == 0) goto L_0x00bd
            int r3 = r11.getMeasuredWidth()
            int r4 = r4 - r3
        L_0x00bd:
            int r7 = r7 + 1
            r3 = 0
            goto L_0x0045
        L_0x00c1:
            r3 = 1073741824(0x40000000, float:2.0)
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r0.f316255x = r5
            r0.f316257y = r9
            r16.mo151971x()
            r3 = 0
            r0.f316257y = r3
            int r5 = r16.getChildCount()
        L_0x00d8:
            if (r3 >= r5) goto L_0x0109
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 == r8) goto L_0x0104
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r7
            if (r7 == 0) goto L_0x00f0
            boolean r9 = r7.f316260a
            if (r9 != 0) goto L_0x0104
        L_0x00f0:
            if (r7 == 0) goto L_0x0104
            float r9 = (float) r4
            float r7 = r7.f316262c
            float r9 = r9 * r7
            int r7 = (int) r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            int r10 = r0.f316255x
            r6.measure(r7, r10)
            goto L_0x0106
        L_0x0104:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x0106:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x0109:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C106159d o;
        SnsMethodCalculate.markStartTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 0 || (o = mo151942o(childAt)) == null || o.f316271b != this.f316242i || !childAt.requestFocus(i, rect)) {
                i3 += i2;
            } else {
                SnsMethodCalculate.markEndTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestFocusInDescendants", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SnsMethodCalculate.markStartTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            SnsMethodCalculate.markEndTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        C103853a aVar = this.f316241h;
        if (aVar != null) {
            aVar.restoreState(savedState.f316267e, savedState.f316268f);
            mo151911C(savedState.f316266d, false, true);
        } else {
            this.f316243j = savedState.f316266d;
            this.f316244n = savedState.f316267e;
            this.f316245o = savedState.f316268f;
        }
        SnsMethodCalculate.markEndTimeMs("onRestoreInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public Parcelable onSaveInstanceState() {
        SnsMethodCalculate.markStartTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f316266d = this.f316242i;
        C103853a aVar = this.f316241h;
        if (aVar != null) {
            savedState.f316267e = aVar.saveState();
        }
        SnsMethodCalculate.markEndTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f316249r;
            mo151973z(i, i3, i5, i5);
        }
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean e;
        boolean e2;
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316228S) {
            SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return true;
        }
        boolean z = 0;
        if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
            C103853a aVar = this.f316241h;
            if (aVar == null || aVar.getCount() == 0) {
                SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return false;
            }
            if (this.f316221M == null) {
                this.f316221M = VelocityTracker.obtain();
            }
            this.f316221M.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (!this.f316211C) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f316220L);
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f316216H);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f316217I);
                            int i = this.f316215G;
                            if (abs > ((float) i) && abs > abs2) {
                                this.f316211C = true;
                                float f = this.f316218J;
                                this.f316216H = x - f > 0.0f ? f + ((float) i) : f - ((float) i);
                                this.f316217I = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                            }
                        }
                        if (this.f316211C) {
                            z = false | mo151970w(motionEvent.getX(motionEvent.findPointerIndex(this.f316220L)));
                        }
                    } else if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f316216H = motionEvent.getX(actionIndex);
                            this.f316220L = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            m142798s(motionEvent);
                            this.f316216H = motionEvent.getX(motionEvent.findPointerIndex(this.f316220L));
                        }
                    } else if (this.f316211C) {
                        mo151909A(this.f316242i, true, 0, false);
                        this.f316220L = -1;
                        m142797k();
                        e = this.f316232U.mo145034e();
                        e2 = this.f316234V.mo145034e();
                    }
                } else if (this.f316211C) {
                    VelocityTracker velocityTracker = this.f316221M;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f316223P);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f316220L);
                    this.f316209A = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C106159d p = mo151953p();
                    int i2 = p.f316271b;
                    float f2 = ((((float) scrollX) / ((float) clientWidth)) - p.f316274e) / p.f316273d;
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f316220L);
                    if (findPointerIndex2 >= 0) {
                        z = findPointerIndex2;
                    }
                    mo151912D(mo151938j(i2, f2, xVelocity, (int) (motionEvent.getX((int) z) - this.f316218J)), true, true, xVelocity);
                    this.f316220L = -1;
                    m142797k();
                    e = this.f316232U.mo145034e();
                    e2 = this.f316234V.mo145034e();
                }
                z = e | e2;
            } else {
                this.f316246p.abortAnimation();
                this.f316209A = false;
                mo151971x();
                this.f316211C = true;
                setScrollState(1);
                float x2 = motionEvent.getX();
                this.f316218J = x2;
                this.f316216H = x2;
                float y2 = motionEvent.getY();
                this.f316219K = y2;
                this.f316217I = y2;
                this.f316220L = motionEvent.getPointerId(0);
            }
            if (z) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(this);
            }
            SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return false;
    }

    /* renamed from: p */
    public final C106159d mo151953p() {
        int i;
        SnsMethodCalculate.markStartTimeMs("infoForCurrentScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f316249r) / ((float) clientWidth) : 0.0f;
        C106159d dVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f316238e.size()) {
            C106159d dVar2 = this.f316238e.get(i3);
            if (!z && dVar2.f316271b != (i = i2 + 1)) {
                dVar2 = this.f316239f;
                dVar2.f316274e = f + f3 + f2;
                dVar2.f316271b = i;
                dVar2.f316273d = this.f316241h.getPageWidth(i);
                i3--;
            }
            f = dVar2.f316274e;
            float f4 = dVar2.f316273d + f + f2;
            if (!z && scrollX < f) {
                SnsMethodCalculate.markEndTimeMs("infoForCurrentScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return dVar;
            } else if (scrollX < f4 || i3 == this.f316238e.size() - 1) {
                SnsMethodCalculate.markEndTimeMs("infoForCurrentScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return dVar2;
            } else {
                i2 = dVar2.f316271b;
                f3 = dVar2.f316273d;
                i3++;
                dVar = dVar2;
                z = false;
            }
        }
        SnsMethodCalculate.markEndTimeMs("infoForCurrentScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return dVar;
    }

    /* renamed from: q */
    public C106159d mo151954q(int i) {
        SnsMethodCalculate.markStartTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        for (int i2 = 0; i2 < this.f316238e.size(); i2++) {
            C106159d dVar = this.f316238e.get(i2);
            if (dVar.f316271b == i) {
                SnsMethodCalculate.markEndTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return dVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("infoForPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo151955r(int r16, float r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "onPageScrolled"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            int r3 = r0.f316256x0
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0074
            int r3 = r15.getScrollX()
            int r6 = r15.getPaddingLeft()
            int r7 = r15.getPaddingRight()
            int r8 = r15.getWidth()
            int r9 = r15.getChildCount()
            r10 = 0
        L_0x0024:
            if (r10 >= r9) goto L_0x0074
            android.view.View r11 = r15.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r12 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r12
            boolean r13 = r12.f316260a
            if (r13 != 0) goto L_0x0035
            goto L_0x0071
        L_0x0035:
            int r12 = r12.f316261b
            r12 = r12 & 7
            if (r12 == r5) goto L_0x0056
            r13 = 3
            if (r12 == r13) goto L_0x0050
            r13 = 5
            if (r12 == r13) goto L_0x0043
            r12 = r6
            goto L_0x0065
        L_0x0043:
            int r12 = r8 - r7
            int r13 = r11.getMeasuredWidth()
            int r12 = r12 - r13
            int r13 = r11.getMeasuredWidth()
            int r7 = r7 + r13
            goto L_0x0062
        L_0x0050:
            int r12 = r11.getWidth()
            int r12 = r12 + r6
            goto L_0x0065
        L_0x0056:
            int r12 = r11.getMeasuredWidth()
            int r12 = r8 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r6)
        L_0x0062:
            r14 = r12
            r12 = r6
            r6 = r14
        L_0x0065:
            int r6 = r6 + r3
            int r13 = r11.getLeft()
            int r6 = r6 - r13
            if (r6 == 0) goto L_0x0070
            r11.offsetLeftAndRight(r6)
        L_0x0070:
            r6 = r12
        L_0x0071:
            int r10 = r10 + 1
            goto L_0x0024
        L_0x0074:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = r0.f316258y0
            if (r3 == 0) goto L_0x0081
            r6 = r16
            r7 = r17
            r8 = r18
            r3.onPageScrolled(r6, r7, r8)
        L_0x0081:
            androidx.viewpager.widget.ViewPager$h r3 = r0.f316225Q0
            if (r3 == 0) goto L_0x00b4
            int r3 = r15.getScrollX()
            int r6 = r15.getChildCount()
        L_0x008d:
            if (r4 >= r6) goto L_0x00b4
            android.view.View r7 = r15.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r8
            boolean r8 = r8.f316260a
            if (r8 == 0) goto L_0x009e
            goto L_0x00b1
        L_0x009e:
            int r8 = r7.getLeft()
            int r8 = r8 - r3
            float r8 = (float) r8
            int r9 = r15.getClientWidth()
            float r9 = (float) r9
            float r8 = r8 / r9
            androidx.viewpager.widget.ViewPager$h r9 = r0.f316225Q0
            xs2.a r9 = (xs2.C15894a) r9
            r9.mo14546a(r7, r8)
        L_0x00b1:
            int r4 = r4 + 1
            goto L_0x008d
        L_0x00b4:
            r0.f316247p0 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.mo151955r(int, float, int):void");
    }

    public void removeView(View view) {
        SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316257y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setAdapter(C103853a aVar) {
        SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C103853a aVar2 = this.f316241h;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.f316248q);
            this.f316241h.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f316238e.size(); i++) {
                C106159d dVar = this.f316238e.get(i);
                this.f316241h.destroyItem((ViewGroup) this, dVar.f316271b, dVar.f316270a);
            }
            this.f316241h.finishUpdate((ViewGroup) this);
            this.f316238e.clear();
            SnsMethodCalculate.markStartTimeMs("removeNonDecorViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f316260a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            SnsMethodCalculate.markEndTimeMs("removeNonDecorViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            this.f316242i = 0;
            scrollTo(0, 0);
        }
        this.f316241h = aVar;
        this.f316237d = 0;
        if (aVar != null) {
            if (this.f316248q == null) {
                this.f316248q = new C106162g((C106156a) null);
            }
            this.f316241h.registerDataSetObserver(this.f316248q);
            this.f316209A = false;
            boolean z = this.f316236W;
            this.f316236W = true;
            this.f316237d = this.f316241h.getCount();
            if (this.f316243j >= 0) {
                this.f316241h.restoreState(this.f316244n, this.f316245o);
                mo151911C(this.f316243j, false, true);
                this.f316243j = -1;
                this.f316244n = null;
                this.f316245o = null;
            } else if (!z) {
                mo151971x();
            } else {
                requestLayout();
            }
        }
        SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[Catch:{ Exception -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = "setChildrenDrawingOrderEnabledCompat"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.reflect.Method r2 = r8.f316227R0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x001f
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            java.lang.String r5 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001f }
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x001f }
            r8.f316227R0 = r2     // Catch:{ NoSuchMethodException -> 0x001f }
        L_0x001f:
            java.lang.reflect.Method r2 = r8.f316227R0     // Catch:{ Exception -> 0x002e }
            if (r2 == 0) goto L_0x002e
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x002e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x002e }
            r4[r3] = r9     // Catch:{ Exception -> 0x002e }
            r2.invoke(r8, r4)     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setCurrentItem(int i) {
        SnsMethodCalculate.markStartTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316209A = false;
        mo151911C(i, !this.f316236W, false);
        SnsMethodCalculate.markEndTimeMs("setCurrentItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOffscreenPageLimit(int i) {
        SnsMethodCalculate.markStartTimeMs("setOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (i < 1) {
            i = 1;
        }
        if (i != this.f316210B) {
            this.f316210B = i;
            mo151971x();
        }
        SnsMethodCalculate.markEndTimeMs("setOffscreenPageLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOnAdapterChangeListener(C106161f fVar) {
        SnsMethodCalculate.markStartTimeMs("setOnAdapterChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        SnsMethodCalculate.markEndTimeMs("setOnAdapterChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        SnsMethodCalculate.markStartTimeMs("setOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316258y0 = onPageChangeListener;
        SnsMethodCalculate.markEndTimeMs("setOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setPageMargin(int i) {
        SnsMethodCalculate.markStartTimeMs("setPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        int i2 = this.f316249r;
        this.f316249r = i;
        int width = getWidth();
        mo151973z(width, width, i, i2);
        requestLayout();
        SnsMethodCalculate.markEndTimeMs("setPageMargin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setPageMarginDrawable(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316250s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    public void setScroller(Scroller scroller) {
        SnsMethodCalculate.markStartTimeMs("setScroller", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        this.f316246p = scroller;
        SnsMethodCalculate.markEndTimeMs("setScroller", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo151967t() {
        SnsMethodCalculate.markStartTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        C103853a aVar = this.f316241h;
        if (aVar == null || this.f316242i >= aVar.getCount() - 1) {
            SnsMethodCalculate.markEndTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return false;
        }
        mo151910B(this.f316242i + 1, true);
        SnsMethodCalculate.markEndTimeMs("pageRight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return true;
    }

    /* renamed from: v */
    public final boolean mo151968v(int i) {
        SnsMethodCalculate.markStartTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (this.f316238e.size() == 0) {
            this.f316247p0 = false;
            mo151955r(0, 0.0f, 0);
            if (this.f316247p0) {
                SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
                return false;
            }
            IllegalStateException illegalStateException = new IllegalStateException("onPageScrolled did not call superclass implementation");
            SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            throw illegalStateException;
        }
        C106159d p = mo151953p();
        int clientWidth = getClientWidth();
        int i2 = this.f316249r;
        int i3 = clientWidth + i2;
        float f = (float) clientWidth;
        int i4 = p.f316271b;
        float f2 = ((((float) i) / f) - p.f316274e) / (p.f316273d + (((float) i2) / f));
        this.f316247p0 = false;
        mo151955r(i4, f2, (int) (((float) i3) * f2));
        if (this.f316247p0) {
            SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            return true;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("onPageScrolled did not call superclass implementation");
        SnsMethodCalculate.markEndTimeMs("pageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        throw illegalStateException2;
    }

    public boolean verifyDrawable(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("verifyDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z = super.verifyDrawable(drawable) || drawable == this.f316250s;
        SnsMethodCalculate.markEndTimeMs("verifyDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z;
    }

    /* renamed from: w */
    public final boolean mo151970w(float f) {
        boolean z;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("performDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        float f2 = this.f316216H - f;
        this.f316216H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f316253v * clientWidth;
        float f4 = this.f316254w * clientWidth;
        boolean z3 = false;
        C106159d dVar = this.f316238e.get(0);
        ArrayList<C106159d> arrayList = this.f316238e;
        C106159d dVar2 = arrayList.get(arrayList.size() - 1);
        if (dVar.f316271b != 0) {
            f3 = dVar.f316274e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (dVar2.f316271b != this.f316241h.getCount() - 1) {
            f4 = dVar2.f316274e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f316232U.mo145033c(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f316234V.mo145033c(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f316216H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        mo151968v(i);
        SnsMethodCalculate.markEndTimeMs("performDrag", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return z3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo151971x() {
        SnsMethodCalculate.markStartTimeMs("populate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        mo151972y(this.f316242i);
        SnsMethodCalculate.markEndTimeMs("populate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r12 == r13) goto L_0x0080;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo151972y(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "populate"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = r0.f316242i
            if (r4 == r1) goto L_0x001e
            if (r4 >= r1) goto L_0x0015
            r6 = 66
            goto L_0x0017
        L_0x0015:
            r6 = 17
        L_0x0017:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r4 = r0.mo151954q(r4)
            r0.f316242i = r1
            goto L_0x0020
        L_0x001e:
            r6 = 2
            r4 = 0
        L_0x0020:
            androidx.viewpager.widget.a r1 = r0.f316241h
            if (r1 != 0) goto L_0x002b
            r18.mo151913E()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x002b:
            boolean r1 = r0.f316209A
            if (r1 == 0) goto L_0x0036
            r18.mo151913E()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0036:
            android.os.IBinder r1 = r18.getWindowToken()
            if (r1 != 0) goto L_0x0040
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0040:
            androidx.viewpager.widget.a r1 = r0.f316241h
            r1.startUpdate((android.view.ViewGroup) r0)
            int r1 = r0.f316210B
            int r7 = r0.f316242i
            int r7 = r7 - r1
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            androidx.viewpager.widget.a r9 = r0.f316241h
            int r9 = r9.getCount()
            int r10 = r9 + -1
            int r11 = r0.f316242i
            int r11 = r11 + r1
            int r1 = java.lang.Math.min(r10, r11)
            int r10 = r0.f316237d
            if (r9 != r10) goto L_0x0392
            r10 = 0
        L_0x0063:
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r11 = r0.f316238e
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x007f
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r11 = r0.f316238e
            java.lang.Object r11 = r11.get(r10)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r11 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r11
            int r12 = r11.f316271b
            int r13 = r0.f316242i
            if (r12 < r13) goto L_0x007c
            if (r12 != r13) goto L_0x007f
            goto L_0x0080
        L_0x007c:
            int r10 = r10 + 1
            goto L_0x0063
        L_0x007f:
            r11 = 0
        L_0x0080:
            if (r11 != 0) goto L_0x008a
            if (r9 <= 0) goto L_0x008a
            int r11 = r0.f316242i
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r11 = r0.mo151920d(r11, r10)
        L_0x008a:
            if (r11 == 0) goto L_0x02ef
            int r13 = r10 + -1
            if (r13 < 0) goto L_0x0099
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r14 = r0.f316238e
            java.lang.Object r14 = r14.get(r13)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r14 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r14
            goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            int r15 = r18.getClientWidth()
            r16 = 1073741824(0x40000000, float:2.0)
            if (r15 > 0) goto L_0x00a4
            r5 = 0
            goto L_0x00b0
        L_0x00a4:
            float r5 = r11.f316273d
            float r5 = r16 - r5
            int r8 = r18.getPaddingLeft()
            float r8 = (float) r8
            float r12 = (float) r15
            float r8 = r8 / r12
            float r5 = r5 + r8
        L_0x00b0:
            int r8 = r0.f316242i
            int r8 = r8 + -1
            r12 = 0
        L_0x00b5:
            if (r8 < 0) goto L_0x011a
            int r17 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r17 < 0) goto L_0x00e5
            if (r8 >= r7) goto L_0x00e5
            if (r14 != 0) goto L_0x00c0
            goto L_0x011a
        L_0x00c0:
            r17 = r5
            int r5 = r14.f316271b
            if (r8 != r5) goto L_0x0115
            boolean r5 = r14.f316272c
            if (r5 != 0) goto L_0x0115
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r5 = r0.f316238e
            r5.remove(r13)
            androidx.viewpager.widget.a r5 = r0.f316241h
            java.lang.Object r14 = r14.f316270a
            r5.destroyItem((android.view.ViewGroup) r0, (int) r8, (java.lang.Object) r14)
            int r13 = r13 + -1
            int r10 = r10 + -1
            if (r13 < 0) goto L_0x0113
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r5 = r0.f316238e
            java.lang.Object r5 = r5.get(r13)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r5
            goto L_0x0114
        L_0x00e5:
            r17 = r5
            if (r14 == 0) goto L_0x00fd
            int r5 = r14.f316271b
            if (r8 != r5) goto L_0x00fd
            float r5 = r14.f316273d
            float r12 = r12 + r5
            int r13 = r13 + -1
            if (r13 < 0) goto L_0x0113
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r5 = r0.f316238e
            java.lang.Object r5 = r5.get(r13)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r5
            goto L_0x0114
        L_0x00fd:
            int r5 = r13 + 1
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r5 = r0.mo151920d(r8, r5)
            float r5 = r5.f316273d
            float r12 = r12 + r5
            int r10 = r10 + 1
            if (r13 < 0) goto L_0x0113
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r5 = r0.f316238e
            java.lang.Object r5 = r5.get(r13)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r5
            goto L_0x0114
        L_0x0113:
            r5 = 0
        L_0x0114:
            r14 = r5
        L_0x0115:
            int r8 = r8 + -1
            r5 = r17
            goto L_0x00b5
        L_0x011a:
            float r5 = r11.f316273d
            int r7 = r10 + 1
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x01b0
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0133
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            java.lang.Object r8 = r8.get(r7)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r8
            goto L_0x0134
        L_0x0133:
            r8 = 0
        L_0x0134:
            if (r15 > 0) goto L_0x0138
            r12 = 0
            goto L_0x0141
        L_0x0138:
            int r12 = r18.getPaddingRight()
            float r12 = (float) r12
            float r13 = (float) r15
            float r12 = r12 / r13
            float r12 = r12 + r16
        L_0x0141:
            int r13 = r0.f316242i
            int r13 = r13 + 1
            r14 = r7
        L_0x0146:
            if (r13 >= r9) goto L_0x01b0
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 < 0) goto L_0x0178
            if (r13 <= r1) goto L_0x0178
            if (r8 != 0) goto L_0x0151
            goto L_0x01b0
        L_0x0151:
            int r15 = r8.f316271b
            if (r13 != r15) goto L_0x01ad
            boolean r15 = r8.f316272c
            if (r15 != 0) goto L_0x01ad
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r15 = r0.f316238e
            r15.remove(r14)
            androidx.viewpager.widget.a r15 = r0.f316241h
            java.lang.Object r8 = r8.f316270a
            r15.destroyItem((android.view.ViewGroup) r0, (int) r13, (java.lang.Object) r8)
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            int r8 = r8.size()
            if (r14 >= r8) goto L_0x0176
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            java.lang.Object r8 = r8.get(r14)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r8
            goto L_0x01ad
        L_0x0176:
            r8 = 0
            goto L_0x01ad
        L_0x0178:
            if (r8 == 0) goto L_0x0194
            int r15 = r8.f316271b
            if (r13 != r15) goto L_0x0194
            float r8 = r8.f316273d
            float r5 = r5 + r8
            int r14 = r14 + 1
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            int r8 = r8.size()
            if (r14 >= r8) goto L_0x0176
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            java.lang.Object r8 = r8.get(r14)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r8
            goto L_0x01ad
        L_0x0194:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r8 = r0.mo151920d(r13, r14)
            int r14 = r14 + 1
            float r8 = r8.f316273d
            float r5 = r5 + r8
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            int r8 = r8.size()
            if (r14 >= r8) goto L_0x0176
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r8 = r0.f316238e
            java.lang.Object r8 = r8.get(r14)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r8 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r8
        L_0x01ad:
            int r13 = r13 + 1
            goto L_0x0146
        L_0x01b0:
            java.lang.String r1 = "calculatePageOffsets"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            androidx.viewpager.widget.a r5 = r0.f316241h
            int r5 = r5.getCount()
            int r8 = r18.getClientWidth()
            if (r8 <= 0) goto L_0x01c7
            int r9 = r0.f316249r
            float r9 = (float) r9
            float r8 = (float) r8
            float r9 = r9 / r8
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r4 == 0) goto L_0x025f
            int r8 = r4.f316271b
            int r12 = r11.f316271b
            if (r8 >= r12) goto L_0x021c
            float r12 = r4.f316274e
            float r4 = r4.f316273d
            float r12 = r12 + r4
            float r12 = r12 + r9
            r4 = 0
        L_0x01d7:
            int r8 = r8 + 1
            int r13 = r11.f316271b
            if (r8 > r13) goto L_0x025f
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r13 = r0.f316238e
            int r13 = r13.size()
            if (r4 >= r13) goto L_0x025f
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r13 = r0.f316238e
            java.lang.Object r13 = r13.get(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r13
        L_0x01ed:
            int r14 = r13.f316271b
            if (r8 <= r14) goto L_0x0206
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r14 = r0.f316238e
            int r14 = r14.size()
            int r14 = r14 + -1
            if (r4 >= r14) goto L_0x0206
            int r4 = r4 + 1
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r13 = r0.f316238e
            java.lang.Object r13 = r13.get(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r13
            goto L_0x01ed
        L_0x0206:
            int r14 = r13.f316271b
            if (r8 >= r14) goto L_0x0215
            androidx.viewpager.widget.a r14 = r0.f316241h
            float r14 = r14.getPageWidth(r8)
            float r14 = r14 + r9
            float r12 = r12 + r14
            int r8 = r8 + 1
            goto L_0x0206
        L_0x0215:
            r13.f316274e = r12
            float r13 = r13.f316273d
            float r13 = r13 + r9
            float r12 = r12 + r13
            goto L_0x01d7
        L_0x021c:
            if (r8 <= r12) goto L_0x025f
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r12 = r0.f316238e
            int r12 = r12.size()
            int r12 = r12 + -1
            float r4 = r4.f316274e
        L_0x0228:
            int r8 = r8 + -1
            int r13 = r11.f316271b
            if (r8 < r13) goto L_0x025f
            if (r12 < 0) goto L_0x025f
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r13 = r0.f316238e
            java.lang.Object r13 = r13.get(r12)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r13
        L_0x0238:
            int r14 = r13.f316271b
            if (r8 >= r14) goto L_0x0249
            if (r12 <= 0) goto L_0x0249
            int r12 = r12 + -1
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r13 = r0.f316238e
            java.lang.Object r13 = r13.get(r12)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r13
            goto L_0x0238
        L_0x0249:
            int r14 = r13.f316271b
            if (r8 <= r14) goto L_0x0258
            androidx.viewpager.widget.a r14 = r0.f316241h
            float r14 = r14.getPageWidth(r8)
            float r14 = r14 + r9
            float r4 = r4 - r14
            int r8 = r8 + -1
            goto L_0x0249
        L_0x0258:
            float r14 = r13.f316273d
            float r14 = r14 + r9
            float r4 = r4 - r14
            r13.f316274e = r4
            goto L_0x0228
        L_0x025f:
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r4 = r0.f316238e
            int r4 = r4.size()
            float r8 = r11.f316274e
            int r12 = r11.f316271b
            int r13 = r12 + -1
            if (r12 != 0) goto L_0x026f
            r14 = r8
            goto L_0x0272
        L_0x026f:
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0272:
            r0.f316253v = r14
            int r5 = r5 + -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r12 != r5) goto L_0x027f
            float r12 = r11.f316273d
            float r12 = r12 + r8
            float r12 = r12 - r14
            goto L_0x0282
        L_0x027f:
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0282:
            r0.f316254w = r12
            int r10 = r10 + -1
        L_0x0286:
            if (r10 < 0) goto L_0x02b2
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r12 = r0.f316238e
            java.lang.Object r12 = r12.get(r10)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r12 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r12
        L_0x0290:
            int r15 = r12.f316271b
            if (r13 <= r15) goto L_0x02a1
            androidx.viewpager.widget.a r15 = r0.f316241h
            int r16 = r13 + -1
            float r13 = r15.getPageWidth(r13)
            float r13 = r13 + r9
            float r8 = r8 - r13
            r13 = r16
            goto L_0x0290
        L_0x02a1:
            float r14 = r12.f316273d
            float r14 = r14 + r9
            float r8 = r8 - r14
            r12.f316274e = r8
            if (r15 != 0) goto L_0x02ab
            r0.f316253v = r8
        L_0x02ab:
            int r10 = r10 + -1
            int r13 = r13 + -1
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0286
        L_0x02b2:
            float r8 = r11.f316274e
            float r10 = r11.f316273d
            float r8 = r8 + r10
            float r8 = r8 + r9
            int r10 = r11.f316271b
        L_0x02ba:
            int r10 = r10 + 1
            if (r7 >= r4) goto L_0x02ec
            java.util.ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d> r12 = r0.f316238e
            java.lang.Object r12 = r12.get(r7)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r12 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.C106159d) r12
        L_0x02c6:
            int r13 = r12.f316271b
            if (r10 >= r13) goto L_0x02d6
            androidx.viewpager.widget.a r13 = r0.f316241h
            int r14 = r10 + 1
            float r10 = r13.getPageWidth(r10)
            float r10 = r10 + r9
            float r8 = r8 + r10
            r10 = r14
            goto L_0x02c6
        L_0x02d6:
            if (r13 != r5) goto L_0x02e1
            float r13 = r12.f316273d
            float r13 = r13 + r8
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 - r14
            r0.f316254w = r13
            goto L_0x02e3
        L_0x02e1:
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x02e3:
            r12.f316274e = r8
            float r12 = r12.f316273d
            float r12 = r12 + r9
            float r8 = r8 + r12
            int r7 = r7 + 1
            goto L_0x02ba
        L_0x02ec:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
        L_0x02ef:
            androidx.viewpager.widget.a r1 = r0.f316241h
            int r4 = r0.f316242i
            if (r11 == 0) goto L_0x02f8
            java.lang.Object r5 = r11.f316270a
            goto L_0x02f9
        L_0x02f8:
            r5 = 0
        L_0x02f9:
            r1.setPrimaryItem((android.view.ViewGroup) r0, (int) r4, (java.lang.Object) r5)
            androidx.viewpager.widget.a r1 = r0.f316241h
            r1.finishUpdate((android.view.ViewGroup) r0)
            int r1 = r18.getChildCount()
            r4 = 0
        L_0x0306:
            if (r4 >= r1) goto L_0x0332
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams) r7
            r7.f316265f = r4
            boolean r8 = r7.f316260a
            if (r8 != 0) goto L_0x032e
            float r8 = r7.f316262c
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x032f
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r5 = r0.mo151942o(r5)
            if (r5 == 0) goto L_0x032f
            float r8 = r5.f316273d
            r7.f316262c = r8
            int r5 = r5.f316271b
            r7.f316264e = r5
            goto L_0x032f
        L_0x032e:
            r9 = 0
        L_0x032f:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x0332:
            r18.mo151913E()
            boolean r1 = r18.hasFocus()
            if (r1 == 0) goto L_0x038e
            android.view.View r1 = r18.findFocus()
            if (r1 == 0) goto L_0x0364
            java.lang.String r4 = "infoForAnyChild"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
        L_0x0346:
            android.view.ViewParent r5 = r1.getParent()
            if (r5 == r0) goto L_0x035b
            if (r5 == 0) goto L_0x0357
            boolean r1 = r5 instanceof android.view.View
            if (r1 != 0) goto L_0x0353
            goto L_0x0357
        L_0x0353:
            r1 = r5
            android.view.View r1 = (android.view.View) r1
            goto L_0x0346
        L_0x0357:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0364
        L_0x035b:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r1 = r0.mo151942o(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r5 = r1
            goto L_0x0365
        L_0x0364:
            r5 = 0
        L_0x0365:
            if (r5 == 0) goto L_0x036d
            int r1 = r5.f316271b
            int r4 = r0.f316242i
            if (r1 == r4) goto L_0x038e
        L_0x036d:
            r8 = 0
        L_0x036e:
            int r1 = r18.getChildCount()
            if (r8 >= r1) goto L_0x038e
            android.view.View r1 = r0.getChildAt(r8)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$d r4 = r0.mo151942o(r1)
            if (r4 == 0) goto L_0x038b
            int r4 = r4.f316271b
            int r5 = r0.f316242i
            if (r4 != r5) goto L_0x038b
            boolean r1 = r1.requestFocus(r6)
            if (r1 == 0) goto L_0x038b
            goto L_0x038e
        L_0x038b:
            int r8 = r8 + 1
            goto L_0x036e
        L_0x038e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0392:
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ NotFoundException -> 0x039f }
            int r4 = r18.getId()     // Catch:{ NotFoundException -> 0x039f }
            java.lang.String r1 = r1.getResourceName(r4)     // Catch:{ NotFoundException -> 0x039f }
            goto L_0x03a7
        L_0x039f:
            int r1 = r18.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x03a7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r5.append(r6)
            int r6 = r0.f316237d
            r5.append(r6)
            java.lang.String r6 = ", found: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = " Pager id: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " Pager class: "
            r5.append(r1)
            java.lang.Class r1 = r18.getClass()
            r5.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r5.append(r1)
            androidx.viewpager.widget.a r1 = r0.f316241h
            java.lang.Class r1 = r1.getClass()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.mo151972y(int):void");
    }

    /* renamed from: z */
    public final void mo151973z(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("recomputeScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (i2 <= 0 || this.f316238e.isEmpty()) {
            C106159d q = mo151954q(this.f316242i);
            int min = (int) ((q != null ? Math.min(q.f316274e, this.f316254w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                mo151936h(false);
                scrollTo(min, getScrollY());
            }
        } else {
            int scrollX = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
            scrollTo(scrollX, getScrollY());
            if (!this.f316246p.isFinished()) {
                this.f316246p.startScroll(scrollX, 0, (int) (mo151954q(this.f316242i).f316274e * ((float) i)), 0, this.f316246p.getDuration() - this.f316246p.timePassed());
            }
        }
        SnsMethodCalculate.markEndTimeMs("recomputeScrollPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$LayoutParams */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f316260a;

        /* renamed from: b */
        public int f316261b;

        /* renamed from: c */
        public float f316262c = 0.0f;

        /* renamed from: d */
        public boolean f316263d;

        /* renamed from: e */
        public int f316264e;

        /* renamed from: f */
        public int f316265f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int[] iArr = AdLandingViewPager.f316205W0;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AdLandingViewPager.f316205W0);
            this.f316261b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        SnsMethodCalculate.markStartTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        LayoutParams layoutParams = new LayoutParams(getContext(), attributeSet);
        SnsMethodCalculate.markEndTimeMs("generateLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        return layoutParams;
    }

    public void setPageMarginDrawable(int i) {
        SnsMethodCalculate.markStartTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
        SnsMethodCalculate.markEndTimeMs("setPageMarginDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
    }
}
