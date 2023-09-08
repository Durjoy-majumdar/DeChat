package com.tencent.p014mm.p136ui.widget.pulldown;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.Metadata;
import p282z2.C16095a;
import p849e3.C107201m;
import p849e3.C107203p;
import p849e3.C107207u;
import sx3.C110821n;
import vo3.C111566g;
import vo3.C111567h;
import vo3.C111576j;
import vo3.C111577k;
import vo3.C111578l;
import vo3.C78461f;
import yo3.C79142a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0001MB\u001b\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0011\u001a\u00020\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\t8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0004X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00107\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010\f\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010\u0010R\"\u0010:\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010\f\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\"\u0010?\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0013\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R\"\u0010A\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000e\"\u0004\bB\u0010\u0010R\"\u0010F\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0013\u001a\u0004\bD\u0010\u0015\"\u0004\bE\u0010\u0017¨\u0006N"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;", "Landroid/widget/FrameLayout;", "Le3/m;", "", "Lvo3/h;", "", "enable", "Lrx3/b0;", "setBounce", "", "getNestedScrollAxes", "d", "Z", "getMIsEnabled", "()Z", "setMIsEnabled", "(Z)V", "mIsEnabled", "n", "I", "getMPullDownEnableFlag", "()I", "setMPullDownEnableFlag", "(I)V", "mPullDownEnableFlag", "Lvo3/g;", "o", "Lvo3/g;", "getCustomNestedChild", "()Lvo3/g;", "setCustomNestedChild", "(Lvo3/g;)V", "customNestedChild", "Ljava/util/LinkedList;", "Lvo3/f$a;", "p", "Ljava/util/LinkedList;", "getMBounceOffsetChangedListeners", "()Ljava/util/LinkedList;", "mBounceOffsetChangedListeners", "Lvo3/k;", "q", "Lvo3/k;", "getMOverscrollListener", "()Lvo3/k;", "mOverscrollListener", "Landroid/widget/ScrollView;", "w", "Landroid/widget/ScrollView;", "getMCompatScrollViewChild", "()Landroid/widget/ScrollView;", "setMCompatScrollViewChild", "(Landroid/widget/ScrollView;)V", "mCompatScrollViewChild", "x", "isAtStartWhenIntercept", "setAtStartWhenIntercept", "y", "isAtEndWhenIntercept", "setAtEndWhenIntercept", "C", "getLastType", "setLastType", "lastType", "D", "isFlinging", "setFlinging", "F", "getLastOffset", "setLastOffset", "lastOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.pulldown.NestedBounceView */
public class NestedBounceView extends FrameLayout implements C107201m, C111567h {

    /* renamed from: A */
    public int f319686A;

    /* renamed from: B */
    public final C107203p f319687B;

    /* renamed from: C */
    public int f319688C;

    /* renamed from: D */
    public boolean f319689D;

    /* renamed from: E */
    public C106824a f319690E;

    /* renamed from: F */
    public int f319691F;

    /* renamed from: d */
    public boolean f319692d = true;

    /* renamed from: e */
    public final Interpolator f319693e;

    /* renamed from: f */
    public ValueAnimator f319694f;

    /* renamed from: g */
    public OverScroller f319695g;

    /* renamed from: h */
    public int f319696h;

    /* renamed from: i */
    public int f319697i;

    /* renamed from: j */
    public View f319698j;

    /* renamed from: n */
    public int f319699n;

    /* renamed from: o */
    public C111566g f319700o;

    /* renamed from: p */
    public final LinkedList<C78461f.C78462a> f319701p;

    /* renamed from: q */
    public final C111577k f319702q;

    /* renamed from: r */
    public final int f319703r;

    /* renamed from: s */
    public boolean f319704s;

    /* renamed from: t */
    public boolean f319705t;

    /* renamed from: u */
    public boolean f319706u;

    /* renamed from: v */
    public int f319707v;

    /* renamed from: w */
    public ScrollView f319708w;

    /* renamed from: x */
    public boolean f319709x;

    /* renamed from: y */
    public boolean f319710y;

    /* renamed from: z */
    public int f319711z;

    /* renamed from: com.tencent.mm.ui.widget.pulldown.NestedBounceView$b */
    public static final class C75012b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ NestedBounceView f220714d;

        /* renamed from: e */
        public final /* synthetic */ View f220715e;

        public C75012b(NestedBounceView nestedBounceView, View view) {
            this.f220714d = nestedBounceView;
            this.f220715e = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f220714d.mo89642a(this.f220715e, ((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.pulldown.NestedBounceView$a */
    public final class C106824a implements Runnable {

        /* renamed from: d */
        public final OverScroller f319712d;

        /* renamed from: e */
        public final View f319713e;

        /* renamed from: f */
        public int f319714f;

        /* renamed from: g */
        public final /* synthetic */ NestedBounceView f319715g;

        public C106824a(NestedBounceView nestedBounceView, OverScroller overScroller, View view) {
            C87412m.m108594g(overScroller, "mScroller");
            C87412m.m108594g(view, "target");
            this.f319715g = nestedBounceView;
            this.f319712d = overScroller;
            this.f319713e = view;
            this.f319714f = overScroller.getCurrY();
        }

        public void run() {
            OverScroller overScroller = this.f319712d;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currY = overScroller.getCurrY();
            int i = currY - this.f319714f;
            View view = this.f319713e;
            if ((view instanceof AbsListView) || (view instanceof ScrollView)) {
                if (C111576j.f334006j) {
                    overScroller.getCurrVelocity();
                    C111578l.m152105b(this.f319713e);
                    C111578l.m152104a(this.f319713e);
                }
                if (computeScrollOffset) {
                    if (i < 0 && C111578l.m152105b(this.f319713e)) {
                        this.f319715g.mo154631l(this.f319713e, i, 1, new int[2]);
                    } else if (i > 0 && C111578l.m152104a(this.f319713e)) {
                        this.f319715g.mo154631l(this.f319713e, i, 1, new int[2]);
                    }
                    this.f319714f = currY;
                    this.f319715g.postOnAnimation(this);
                    return;
                }
                this.f319715g.mo77718i(this.f319713e, 1);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedBounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232410i);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NestedBounceView)");
        this.f319692d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.f319693e = new DecelerateInterpolator(C111576j.f333997a);
        this.f319699n = 3;
        this.f319701p = new LinkedList<>();
        this.f319702q = new C111577k();
        this.f319703r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f319687B = new C107203p(this);
    }

    private static /* synthetic */ void getMDirectionToEnd$annotations() {
    }

    /* renamed from: m */
    private final int m144435m(View view, int i, int i2, int i3) {
        int b;
        int b2 = mo89643b(view);
        C87412m.m108594g(view, "child");
        this.f319702q.getClass();
        float f = 1.0f;
        float abs = (((float) Math.abs(mo89643b(view))) * 1.0f) / ((float) view.getHeight());
        int i4 = C111576j.f334000d;
        float f2 = ((float) i4) + (((float) (C111576j.f334001e - i4)) * abs);
        boolean z = true;
        if (!(f2 == 0.0f)) {
            f = f2;
        }
        int i5 = b2 - ((int) ((((float) i) / f) + 0.5f));
        int b3 = mo89643b(view);
        if (i2 > b3 || b3 > i3) {
            z = false;
        }
        if (!z || b3 == (b = C16095a.m14980b(i5, i2, i3))) {
            return 0;
        }
        mo89642a(view, b);
        return b3 - b;
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        if (C111576j.f334006j) {
            C111578l.m152105b(view);
            C111578l.m152104a(view);
        }
        if (!this.f319692d) {
            return false;
        }
        this.f319688C = i2;
        this.f319689D = false;
        return (i & 2) != 0;
    }

    /* renamed from: a */
    public void mo89642a(View view, int i) {
        if (C111576j.f334006j && view != null) {
            view.hashCode();
        }
        (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89642a(view, i);
        mo154648h(i);
    }

    /* renamed from: b */
    public int mo89643b(View view) {
        return (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89643b(view);
    }

    /* renamed from: c */
    public int mo89644c(View view) {
        return (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89644c(view);
    }

    /* renamed from: d */
    public int mo89645d(View view) {
        return (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89645d(view);
    }

    /* renamed from: e */
    public void mo154637e(C78461f.C78462a aVar) {
        if (aVar != null && !this.f319701p.contains(aVar)) {
            this.f319701p.add(aVar);
        }
    }

    /* renamed from: f */
    public void mo154638f(boolean z) {
        this.f319699n = z ? this.f319699n | 1 : this.f319699n & -2;
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        OverScroller overScroller;
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        this.f319687B.mo157675a(view, view2, i, i2);
        if (C111576j.f334006j) {
            view2.toString();
            view2.isNestedScrollingEnabled();
        }
        this.f319698j = view2;
        if (i2 == 0) {
            mo154657p(view);
        }
        if (i2 == 0 && (overScroller = this.f319695g) != null) {
            overScroller.forceFinished(true);
        }
        if ((i & 2) != 0) {
            this.f319696h = 2;
            this.f319697i = 1;
            return;
        }
        this.f319696h = 8;
        this.f319697i = 4;
    }

    public final C111566g getCustomNestedChild() {
        return this.f319700o;
    }

    public final int getLastOffset() {
        return this.f319691F;
    }

    public final int getLastType() {
        return this.f319688C;
    }

    public final LinkedList<C78461f.C78462a> getMBounceOffsetChangedListeners() {
        return this.f319701p;
    }

    public final ScrollView getMCompatScrollViewChild() {
        return this.f319708w;
    }

    public final boolean getMIsEnabled() {
        return this.f319692d;
    }

    public final C111577k getMOverscrollListener() {
        return this.f319702q;
    }

    public final int getMPullDownEnableFlag() {
        return this.f319699n;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f319687B;
        return pVar.f320806b | pVar.f320805a;
    }

    /* renamed from: h */
    public final void mo154648h(int i) {
        if (i != 0 && this.f319691F == 0) {
            int i2 = i > 0 ? 1 : 0;
            Iterator<C78461f.C78462a> it = this.f319701p.iterator();
            while (it.hasNext()) {
                it.next().mo6474w4(i2);
            }
        }
        this.f319691F = i;
        Iterator<C78461f.C78462a> it4 = this.f319701p.iterator();
        while (it4.hasNext()) {
            it4.next().mo6473c3(i);
        }
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        if (C111576j.f334006j) {
            view.hashCode();
            mo89643b(view);
        }
        this.f319687B.mo157676b(view, i);
        OverScroller overScroller = this.f319695g;
        if (i == 0) {
            if (C111576j.f334006j) {
                if (overScroller != null) {
                    overScroller.computeScrollOffset();
                }
                if (overScroller != null) {
                    overScroller.getCurrVelocity();
                }
                if (overScroller != null) {
                    overScroller.getCurrY();
                }
                if (overScroller != null) {
                    overScroller.getStartY();
                }
            }
            if (mo89643b(view) != 0) {
                if (overScroller == null) {
                    mo154649o(view);
                } else if (!overScroller.computeScrollOffset()) {
                    mo154649o(view);
                } else if (this.f319689D) {
                    mo154649o(view);
                }
            } else if (this.f319689D && overScroller != null && overScroller.computeScrollOffset()) {
                if (this.f319690E == null) {
                    this.f319690E = new C106824a(this, overScroller, view);
                }
                C106824a aVar = this.f319690E;
                if (aVar != null) {
                    aVar.f319714f = aVar.f319712d.getCurrY();
                    aVar.f319715g.postOnAnimation(aVar);
                }
            }
        } else if (mo89643b(view) != 0) {
            mo154649o(view);
        }
        this.f319698j = null;
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        mo154631l(view, i4, i5, (int[]) null);
    }

    /* renamed from: k */
    public int mo154630k(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int b;
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        C111577k kVar = this.f319702q;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            kVar.getClass();
            i5 = mo89643b(view);
            i4 = 0;
        } else {
            kVar.getClass();
            i4 = mo89643b(view);
            i5 = 0;
        }
        if (i5 >= i4) {
            return 0;
        }
        int b2 = mo89643b(view) - i2;
        int b3 = mo89643b(view);
        if (!(i5 <= b3 && b3 <= i4) || b3 == (b = C16095a.m14980b(b2, i5, i4))) {
            return 0;
        }
        mo89642a(view, b);
        return b3 - b;
    }

    /* renamed from: l */
    public void mo154631l(View view, int i, int i2, int[] iArr) {
        C87412m.m108594g(view, "target");
        if (C111576j.f334006j) {
            Objects.toString(iArr != null ? C110821n.m150957d(iArr) : null);
        }
        this.f319689D = false;
        C111577k kVar = this.f319702q;
        if (i != 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (i < 0) {
            kVar.getClass();
            if (i2 == 0) {
                m144435m(view, i, 0, mo89645d(view));
                return;
            }
            OverScroller overScroller = this.f319695g;
            if (overScroller != null) {
                overScroller.computeScrollOffset();
            }
            if (overScroller != null) {
                overScroller.getCurrVelocity();
            }
            int a = kVar.mo163256a(this, view, this.f319696h);
            int b = mo89643b(view);
            int abs = Math.abs(kVar.mo163257b(this, view, this.f319696h));
            if (overScroller == null || !overScroller.computeScrollOffset() || Math.abs(overScroller.getCurrVelocity()) < ((float) abs) || b >= a) {
                C107207u.m145171l(view, 1);
                if (overScroller != null) {
                    overScroller.forceFinished(true);
                    return;
                }
                return;
            }
            m144435m(view, i, b, kVar.mo163256a(this, view, this.f319696h));
        } else if (i > 0) {
            kVar.getClass();
            if (i2 == 0) {
                m144435m(view, i, mo89644c(view), 0);
                return;
            }
            OverScroller overScroller2 = this.f319695g;
            if (overScroller2 == null || !overScroller2.computeScrollOffset() || Math.abs(overScroller2.getCurrVelocity()) < ((float) Math.abs(kVar.mo163257b(this, view, this.f319697i))) || mo89643b(view) <= kVar.mo163256a(this, view, this.f319697i)) {
                C107207u.m145171l(view, 1);
                if (overScroller2 != null) {
                    overScroller2.forceFinished(true);
                    return;
                }
                return;
            }
            m144435m(view, i, kVar.mo163256a(this, view, this.f319697i), mo89643b(view));
        }
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        int i4 = iArr[1];
        iArr[1] = mo154630k(view, i, i2, iArr, i3);
        if (C111576j.f334006j) {
            C110821n.m150957d(iArr).toString();
        }
    }

    /* renamed from: o */
    public void mo154649o(View view) {
        C87412m.m108594g(view, "child");
        if (C111576j.f334006j) {
            view.hashCode();
        }
        int b = mo89643b(view);
        if (b != 0) {
            this.f319702q.getClass();
            if (this.f319694f == null) {
                this.f319694f = ValueAnimator.ofInt(new int[0]);
            }
            ValueAnimator valueAnimator = this.f319694f;
            if (!(valueAnimator != null && valueAnimator.isStarted())) {
                ValueAnimator valueAnimator2 = this.f319694f;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.f319694f;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new C75012b(this, view));
                }
                float abs = ((((float) Math.abs(b)) * 1.0f) / ((float) mo89645d(view))) * ((float) C111576j.f333998b);
                ValueAnimator valueAnimator4 = this.f319694f;
                if (valueAnimator4 != null) {
                    valueAnimator4.setDuration((long) Math.max((int) abs, C111576j.f333999c));
                }
                ValueAnimator valueAnimator5 = this.f319694f;
                if (valueAnimator5 != null) {
                    valueAnimator5.setInterpolator(this.f319693e);
                }
                ValueAnimator valueAnimator6 = this.f319694f;
                if (valueAnimator6 != null) {
                    valueAnimator6.setIntValues(new int[]{b, 0});
                }
                ValueAnimator valueAnimator7 = this.f319694f;
                if (valueAnimator7 != null) {
                    valueAnimator7.start();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008d, code lost:
        if (r0 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a5, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            android.view.View r0 = r11.f319698j
            boolean r1 = r0 instanceof android.widget.AbsListView
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000f
            boolean r1 = r0 instanceof android.widget.ScrollView
            if (r1 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r1 = 0
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            android.widget.ScrollView r4 = r11.f319708w
            if (r4 == 0) goto L_0x0018
            if (r0 != 0) goto L_0x0018
            r5 = 1
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r6 = 0
            goto L_0x0021
        L_0x0020:
            r6 = 1
        L_0x0021:
            vo3.g r7 = r11.f319700o
            if (r7 == 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            boolean r9 = r11.f319692d
            if (r9 == 0) goto L_0x01c7
            if (r6 != 0) goto L_0x0030
            if (r8 == 0) goto L_0x01c7
        L_0x0030:
            r8 = 0
            if (r6 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x0036
            goto L_0x007b
        L_0x0036:
            if (r5 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0065
            if (r12 == 0) goto L_0x0060
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.getGlobalVisibleRect(r0)
            float r1 = r12.getX()
            int r1 = (int) r1
            float r4 = r12.getY()
            int r4 = (int) r4
            boolean r1 = r0.contains(r1, r4)
            if (r1 == 0) goto L_0x0060
            boolean r1 = vo3.C111576j.f334006j
            if (r1 == 0) goto L_0x005e
            r0.toString()
            r12.toString()
        L_0x005e:
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            if (r0 != r2) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x007a
            android.widget.ScrollView r0 = r11.f319708w
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            android.widget.ScrollView r0 = r11.f319708w
            goto L_0x007b
        L_0x007a:
            r0 = r8
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            boolean r1 = vo3.C111578l.m152105b(r0)
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x008a
            boolean r0 = vo3.C111578l.m152104a(r0)
            goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            if (r1 == 0) goto L_0x00a8
            if (r0 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x0090:
            if (r7 == 0) goto L_0x0098
            boolean r0 = r7.mo69091b()
            r1 = r0
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            vo3.g r0 = r11.f319700o
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.mo69090a()
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r1 != 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r4 = 0
            goto L_0x00ab
        L_0x00aa:
            r4 = 1
        L_0x00ab:
            boolean r5 = r11.f319705t
            r6 = 2
            if (r5 == 0) goto L_0x00be
            if (r12 == 0) goto L_0x00b8
            float r5 = r12.getY()
            int r5 = (int) r5
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            r11.f319686A = r5
            boolean r5 = r11.f319705t
            goto L_0x0110
        L_0x00be:
            if (r12 == 0) goto L_0x00c9
            int r5 = r12.getAction()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00ca
        L_0x00c9:
            r5 = r8
        L_0x00ca:
            if (r5 != 0) goto L_0x00cd
            goto L_0x00e2
        L_0x00cd:
            int r7 = r5.intValue()
            if (r7 != 0) goto L_0x00e2
            float r5 = r12.getX()
            int r5 = (int) r5
            r11.f319711z = r5
            float r5 = r12.getY()
            int r5 = (int) r5
            r11.f319686A = r5
            goto L_0x010f
        L_0x00e2:
            if (r5 != 0) goto L_0x00e5
            goto L_0x010f
        L_0x00e5:
            int r5 = r5.intValue()
            if (r5 != r6) goto L_0x010f
            float r5 = r12.getX()
            int r5 = (int) r5
            float r7 = r12.getY()
            int r7 = (int) r7
            int r9 = r11.f319711z
            int r5 = r5 - r9
            int r9 = r11.f319686A
            int r7 = r7 - r9
            int r9 = java.lang.Math.abs(r7)
            int r10 = r11.f319703r
            if (r9 <= r10) goto L_0x010f
            int r7 = java.lang.Math.abs(r7)
            int r5 = java.lang.Math.abs(r5)
            if (r7 <= r5) goto L_0x010f
            r5 = 1
            goto L_0x0110
        L_0x010f:
            r5 = 0
        L_0x0110:
            r11.f319705t = r5
            boolean r5 = vo3.C111576j.f334006j
            if (r5 == 0) goto L_0x0121
            if (r12 == 0) goto L_0x011d
            int r5 = r12.getAction()
            goto L_0x011e
        L_0x011d:
            r5 = -1
        L_0x011e:
            android.view.MotionEvent.actionToString(r5)
        L_0x0121:
            if (r4 == 0) goto L_0x01be
            if (r12 == 0) goto L_0x012d
            int r4 = r12.getAction()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
        L_0x012d:
            if (r8 != 0) goto L_0x0130
            goto L_0x013d
        L_0x0130:
            int r4 = r8.intValue()
            if (r4 != 0) goto L_0x013d
            r11.f319704s = r3
            r11.f319706u = r2
        L_0x013a:
            r2 = 0
            goto L_0x01b4
        L_0x013d:
            if (r8 != 0) goto L_0x0140
            goto L_0x0193
        L_0x0140:
            int r4 = r8.intValue()
            if (r4 != r6) goto L_0x0193
            boolean r4 = r11.f319704s
            if (r4 == 0) goto L_0x014c
            goto L_0x01b4
        L_0x014c:
            boolean r4 = r11.f319706u
            if (r4 != 0) goto L_0x0155
            r11.f319704s = r3
            r11.f319706u = r2
            goto L_0x013a
        L_0x0155:
            float r4 = r12.getY()
            int r4 = (int) r4
            int r5 = r11.f319707v
            int r5 = r4 - r5
            boolean r7 = r11.f319705t
            if (r7 == 0) goto L_0x0184
            if (r5 <= 0) goto L_0x0166
            if (r1 != 0) goto L_0x016a
        L_0x0166:
            if (r5 >= 0) goto L_0x016c
            if (r0 == 0) goto L_0x016c
        L_0x016a:
            r7 = 1
            goto L_0x016d
        L_0x016c:
            r7 = 0
        L_0x016d:
            if (r7 == 0) goto L_0x0184
            if (r5 <= 0) goto L_0x0176
            int r7 = r11.f319699n
            r7 = r7 & r2
            if (r7 != 0) goto L_0x017d
        L_0x0176:
            if (r5 >= 0) goto L_0x017f
            int r5 = r11.f319699n
            r5 = r5 & r6
            if (r5 == 0) goto L_0x017f
        L_0x017d:
            r5 = 1
            goto L_0x0180
        L_0x017f:
            r5 = 0
        L_0x0180:
            if (r5 == 0) goto L_0x0184
            r5 = 1
            goto L_0x0185
        L_0x0184:
            r5 = 0
        L_0x0185:
            if (r5 == 0) goto L_0x0191
            r11.f319707v = r4
            r11.f319704s = r2
            r11.f319706u = r3
            r11.f319709x = r1
            r11.f319710y = r0
        L_0x0191:
            r2 = r5
            goto L_0x01b4
        L_0x0193:
            r0 = 3
            if (r8 != 0) goto L_0x0197
            goto L_0x019e
        L_0x0197:
            int r1 = r8.intValue()
            if (r1 != r0) goto L_0x019e
            goto L_0x01a9
        L_0x019e:
            if (r8 != 0) goto L_0x01a1
            goto L_0x01a8
        L_0x01a1:
            int r0 = r8.intValue()
            if (r0 != r2) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r2 = 0
        L_0x01a9:
            if (r2 == 0) goto L_0x01b2
            r11.f319704s = r3
            r11.f319706u = r3
            r11.f319705t = r3
            goto L_0x013a
        L_0x01b2:
            boolean r2 = r11.f319704s
        L_0x01b4:
            if (r12 == 0) goto L_0x01bb
            float r12 = r12.getY()
            int r3 = (int) r12
        L_0x01bb:
            r11.f319707v = r3
            return r2
        L_0x01be:
            if (r12 == 0) goto L_0x01c5
            float r0 = r12.getY()
            int r3 = (int) r0
        L_0x01c5:
            r11.f319707v = r3
        L_0x01c7:
            boolean r12 = super.onInterceptTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C87412m.m108594g(view, "target");
        return super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        if (this.f319695g == null) {
            this.f319695g = new OverScroller(getContext());
        }
        OverScroller overScroller = this.f319695g;
        if (overScroller != null) {
            overScroller.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        this.f319689D = true;
        return super.onNestedPreFling(view, f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        mo77719n(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "target");
        mo77727j(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        mo77725g(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return mo77716Z(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        C87412m.m108594g(view, "target");
        mo77718i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != 3) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r13, r0)
            boolean r0 = vo3.C111576j.f334006j
            if (r0 == 0) goto L_0x0010
            int r0 = r13.getAction()
            android.view.MotionEvent.actionToString(r0)
        L_0x0010:
            int r0 = r13.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x001e
            int r0 = r13.getEdgeFlags()
            if (r0 == 0) goto L_0x001e
            return r1
        L_0x001e:
            int r0 = r13.getAction()
            r2 = 1
            if (r0 == r2) goto L_0x00bc
            r3 = 2
            if (r0 == r3) goto L_0x002d
            r2 = 3
            if (r0 == r2) goto L_0x00bc
            goto L_0x00d0
        L_0x002d:
            boolean r0 = r12.f319704s
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r12.f319706u
            if (r0 != 0) goto L_0x0049
            float r13 = r13.getY()
            int r13 = (int) r13
            r12.f319707v = r13
            r12.f319706u = r2
            r12.mo154657p(r12)
            android.widget.OverScroller r13 = r12.f319695g
            if (r13 == 0) goto L_0x0048
            r13.forceFinished(r2)
        L_0x0048:
            return r2
        L_0x0049:
            int r0 = r12.f319707v
            float r4 = r13.getY()
            int r4 = (int) r4
            int r0 = r0 - r4
            float r4 = r13.getY()
            int r4 = (int) r4
            r12.f319707v = r4
            vo3.g r4 = r12.f319700o
            if (r4 == 0) goto L_0x0062
            android.view.View r4 = r4.mo69092c()
            if (r4 != 0) goto L_0x0063
        L_0x0062:
            r4 = r12
        L_0x0063:
            int r5 = r12.mo89643b(r4)
            int r6 = r5 - r0
            if (r5 != 0) goto L_0x007d
            if (r6 <= 0) goto L_0x0072
            boolean r5 = r12.f319709x
            if (r5 == 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            if (r6 >= 0) goto L_0x007a
            boolean r5 = r12.f319710y
            if (r5 == 0) goto L_0x007a
        L_0x0078:
            r5 = r0
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            r11 = r5
            goto L_0x0099
        L_0x007d:
            if (r5 >= 0) goto L_0x0081
            r7 = 1
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            if (r6 >= 0) goto L_0x0086
            r8 = 1
            goto L_0x0087
        L_0x0086:
            r8 = 0
        L_0x0087:
            if (r7 == r8) goto L_0x0078
            if (r6 <= 0) goto L_0x0090
            boolean r7 = r12.f319709x
            if (r7 == 0) goto L_0x0090
            goto L_0x0078
        L_0x0090:
            if (r6 >= 0) goto L_0x0097
            boolean r6 = r12.f319710y
            if (r6 == 0) goto L_0x0097
            goto L_0x0078
        L_0x0097:
            int r5 = r5 + r1
            goto L_0x007b
        L_0x0099:
            if (r11 == r0) goto L_0x00a8
            int r0 = r13.getAction()
            r13.setAction(r1)
            r12.dispatchTouchEvent(r13)
            r13.setAction(r0)
        L_0x00a8:
            r7 = 0
            int[] r9 = new int[r3]
            r10 = 0
            r5 = r12
            r6 = r4
            r8 = r11
            int r13 = r5.mo154630k(r6, r7, r8, r9, r10)
            int r11 = r11 - r13
            if (r11 == 0) goto L_0x00bb
            int[] r13 = new int[r3]
            r12.mo154631l(r4, r11, r1, r13)
        L_0x00bb:
            return r2
        L_0x00bc:
            r12.f319706u = r1
            r12.f319704s = r1
            r12.f319705t = r1
            vo3.g r0 = r12.f319700o
            if (r0 == 0) goto L_0x00cc
            android.view.View r0 = r0.mo69092c()
            if (r0 != 0) goto L_0x00cd
        L_0x00cc:
            r0 = r12
        L_0x00cd:
            r12.mo77718i(r0, r1)
        L_0x00d0:
            boolean r13 = super.onTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo154657p(View view) {
        ValueAnimator valueAnimator;
        C87412m.m108594g(view, "child");
        ValueAnimator valueAnimator2 = this.f319694f;
        if (valueAnimator2 != null) {
            boolean z = true;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                z = false;
            }
            if (z && (valueAnimator = this.f319694f) != null) {
                valueAnimator.cancel();
            }
        }
        this.f319702q.getClass();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setAtEndWhenIntercept(boolean z) {
        this.f319710y = z;
    }

    public final void setAtStartWhenIntercept(boolean z) {
        this.f319709x = z;
    }

    public final void setBounce(boolean z) {
        this.f319692d = z;
    }

    public final void setCustomNestedChild(C111566g gVar) {
        this.f319700o = gVar;
    }

    public final void setFlinging(boolean z) {
        this.f319689D = z;
    }

    public final void setLastOffset(int i) {
        this.f319691F = i;
    }

    public final void setLastType(int i) {
        this.f319688C = i;
    }

    public final void setMCompatScrollViewChild(ScrollView scrollView) {
        this.f319708w = scrollView;
    }

    public final void setMIsEnabled(boolean z) {
        this.f319692d = z;
    }

    public final void setMPullDownEnableFlag(int i) {
        this.f319699n = i;
    }
}
