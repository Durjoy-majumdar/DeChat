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
import p866v9.C111492a;
import sx3.C110821n;
import vo3.C111565e;
import vo3.C111566g;
import vo3.C111567h;
import vo3.C111576j;
import vo3.C111578l;
import vo3.C78461f;
import yo3.C79142a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0001LB\u001b\u0012\u0006\u0010G\u001a\u00020F\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0011\u001a\u00020\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\t8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0004X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\"\u0010@\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010\f\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R\"\u0010B\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010\f\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\"\u0010D\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010\f\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010\u0010¨\u0006M"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/pulldown/HorizontalNestedBounceView;", "Landroid/widget/FrameLayout;", "Le3/m;", "", "Lvo3/h;", "", "enable", "Lrx3/b0;", "setBounce", "", "getNestedScrollAxes", "d", "Z", "getMIsEnabled", "()Z", "setMIsEnabled", "(Z)V", "mIsEnabled", "n", "I", "getMPullDownEnableFlag", "()I", "setMPullDownEnableFlag", "(I)V", "mPullDownEnableFlag", "Lvo3/g;", "o", "Lvo3/g;", "getCustomNestedChild", "()Lvo3/g;", "setCustomNestedChild", "(Lvo3/g;)V", "customNestedChild", "Ljava/util/LinkedList;", "Lvo3/f$a;", "p", "Ljava/util/LinkedList;", "getMBounceOffsetChangedListeners", "()Ljava/util/LinkedList;", "mBounceOffsetChangedListeners", "Lvo3/e;", "q", "Lvo3/e;", "getMOverscrollListener", "()Lvo3/e;", "mOverscrollListener", "r", "Lvo3/h;", "getScrollMode", "()Lvo3/h;", "scrollMode", "Landroid/widget/ScrollView;", "s", "Landroid/widget/ScrollView;", "getMCompatScrollViewChild", "()Landroid/widget/ScrollView;", "setMCompatScrollViewChild", "(Landroid/widget/ScrollView;)V", "mCompatScrollViewChild", "u", "getLastType", "setLastType", "lastType", "v", "isFlinging", "setFlinging", "isAtStartWhenIntercept", "setAtStartWhenIntercept", "isAtEndWhenIntercept", "setAtEndWhenIntercept", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView */
public class HorizontalNestedBounceView extends FrameLayout implements C107201m, C111567h {

    /* renamed from: d */
    public boolean f319662d = true;

    /* renamed from: e */
    public final Interpolator f319663e;

    /* renamed from: f */
    public ValueAnimator f319664f;

    /* renamed from: g */
    public OverScroller f319665g;

    /* renamed from: h */
    public int f319666h;

    /* renamed from: i */
    public int f319667i;

    /* renamed from: j */
    public View f319668j;

    /* renamed from: n */
    public int f319669n;

    /* renamed from: o */
    public C111566g f319670o;

    /* renamed from: p */
    public final LinkedList<C78461f.C78462a> f319671p;

    /* renamed from: q */
    public final C111565e f319672q;

    /* renamed from: r */
    public final C111567h f319673r;

    /* renamed from: s */
    public ScrollView f319674s;

    /* renamed from: t */
    public final C107203p f319675t;

    /* renamed from: u */
    public int f319676u;

    /* renamed from: v */
    public boolean f319677v;

    /* renamed from: w */
    public C106821a f319678w;

    /* renamed from: com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView$a */
    public final class C106821a implements Runnable {

        /* renamed from: d */
        public final OverScroller f319679d;

        /* renamed from: e */
        public final View f319680e;

        /* renamed from: f */
        public int f319681f;

        /* renamed from: g */
        public final /* synthetic */ HorizontalNestedBounceView f319682g;

        public C106821a(HorizontalNestedBounceView horizontalNestedBounceView, OverScroller overScroller, View view) {
            C87412m.m108594g(overScroller, "mScroller");
            C87412m.m108594g(view, "target");
            this.f319682g = horizontalNestedBounceView;
            this.f319679d = overScroller;
            this.f319680e = view;
            this.f319681f = overScroller.getCurrX();
        }

        public void run() {
            OverScroller overScroller = this.f319679d;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int i = currX - this.f319681f;
            View view = this.f319680e;
            if ((view instanceof AbsListView) || (view instanceof ScrollView)) {
                if (C111576j.f334006j) {
                    overScroller.getCurrVelocity();
                    C111578l.m152105b(this.f319680e);
                    C111578l.m152104a(this.f319680e);
                }
                if (computeScrollOffset) {
                    if (i < 0 && C111578l.m152105b(this.f319680e)) {
                        this.f319682g.mo154599e(this.f319680e, i, 1, new int[2]);
                    } else if (i > 0 && C111578l.m152104a(this.f319680e)) {
                        this.f319682g.mo154599e(this.f319680e, i, 1, new int[2]);
                    }
                    this.f319681f = currX;
                    this.f319682g.postOnAnimation(this);
                    return;
                }
                this.f319682g.mo77718i(this.f319680e, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView$b */
    public static final class C106822b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ HorizontalNestedBounceView f319683d;

        /* renamed from: e */
        public final /* synthetic */ View f319684e;

        public C106822b(HorizontalNestedBounceView horizontalNestedBounceView, View view) {
            this.f319683d = horizontalNestedBounceView;
            this.f319684e = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f319683d.mo89642a(this.f319684e, ((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalNestedBounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232410i);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NestedBounceView)");
        this.f319662d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.f319663e = new DecelerateInterpolator(C111576j.f333997a);
        this.f319669n = 3;
        this.f319671p = new LinkedList<>();
        this.f319672q = new C111565e();
        this.f319673r = C111576j.f334005i;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.f319675t = new C107203p(this);
    }

    private static /* synthetic */ void getMDirectionToEnd$annotations() {
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        if (C111576j.f334006j) {
            C111578l.m152105b(view);
            C111578l.m152104a(view);
        }
        if (!this.f319662d) {
            return false;
        }
        this.f319676u = i2;
        this.f319677v = false;
        return (i & 1) != 0;
    }

    /* renamed from: a */
    public void mo89642a(View view, int i) {
        if (C111576j.f334006j && view != null) {
            view.hashCode();
        }
        ((C111492a) this.f319673r).mo89642a(view, i);
        Iterator<C78461f.C78462a> it = this.f319671p.iterator();
        while (it.hasNext()) {
            it.next().mo6473c3(i);
        }
    }

    /* renamed from: b */
    public int mo89643b(View view) {
        return ((C111492a) this.f319673r).mo89643b(view);
    }

    /* renamed from: c */
    public int mo89644c(View view) {
        return ((C111492a) this.f319673r).mo89644c(view);
    }

    /* renamed from: d */
    public int mo89645d(View view) {
        return ((C111492a) this.f319673r).mo89645d(view);
    }

    /* renamed from: e */
    public void mo154599e(View view, int i, int i2, int[] iArr) {
        C87412m.m108594g(view, "target");
        if (C111576j.f334006j) {
            Objects.toString(iArr != null ? C110821n.m150957d(iArr) : null);
        }
        this.f319677v = false;
        C111565e eVar = this.f319672q;
        if (i != 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (i < 0) {
            eVar.getClass();
            if (i2 == 0) {
                mo154600f(view, i, 0, mo89645d(view));
                return;
            }
            OverScroller overScroller = this.f319665g;
            if (overScroller != null) {
                overScroller.computeScrollOffset();
            }
            if (overScroller != null) {
                overScroller.getCurrVelocity();
            }
            int a = eVar.mo163253a(this, view, this.f319666h);
            int b = mo89643b(view);
            int abs = Math.abs(eVar.mo163254b(this, view, this.f319666h));
            if (overScroller == null || !overScroller.computeScrollOffset() || Math.abs(overScroller.getCurrVelocity()) < ((float) abs) || b >= a) {
                C107207u.m145171l(view, 1);
                if (overScroller != null) {
                    overScroller.forceFinished(true);
                    return;
                }
                return;
            }
            mo154600f(view, i, b, eVar.mo163253a(this, view, this.f319666h));
        } else if (i > 0) {
            eVar.getClass();
            if (i2 == 0) {
                mo154600f(view, i, mo89644c(view), 0);
                return;
            }
            OverScroller overScroller2 = this.f319665g;
            if (overScroller2 == null || !overScroller2.computeScrollOffset() || Math.abs(overScroller2.getCurrVelocity()) < ((float) Math.abs(eVar.mo163254b(this, view, this.f319667i))) || mo89643b(view) <= eVar.mo163253a(this, view, this.f319667i)) {
                C107207u.m145171l(view, 1);
                if (overScroller2 != null) {
                    overScroller2.forceFinished(true);
                    return;
                }
                return;
            }
            mo154600f(view, i, eVar.mo163253a(this, view, this.f319667i), mo89643b(view));
        }
    }

    /* renamed from: f */
    public final int mo154600f(View view, int i, int i2, int i3) {
        int b;
        int b2 = mo89643b(view);
        C87412m.m108594g(view, "child");
        this.f319672q.getClass();
        float f = 1.0f;
        float abs = (((float) Math.abs(mo89643b(view))) * 1.0f) / ((float) view.getWidth());
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

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        OverScroller overScroller;
        ValueAnimator valueAnimator;
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        this.f319675t.mo157675a(view, view2, i, i2);
        if (C111576j.f334006j) {
            view2.toString();
            view2.isNestedScrollingEnabled();
        }
        this.f319668j = view2;
        if (i2 == 0) {
            ValueAnimator valueAnimator2 = this.f319664f;
            if (valueAnimator2 != null) {
                if ((valueAnimator2.isRunning()) && (valueAnimator = this.f319664f) != null) {
                    valueAnimator.cancel();
                }
            }
            this.f319672q.getClass();
        }
        if (i2 == 0 && (overScroller = this.f319665g) != null) {
            overScroller.forceFinished(true);
        }
        if ((i & 2) != 0) {
            this.f319666h = 2;
            this.f319667i = 1;
            return;
        }
        this.f319666h = 8;
        this.f319667i = 4;
    }

    public final C111566g getCustomNestedChild() {
        return this.f319670o;
    }

    public final int getLastType() {
        return this.f319676u;
    }

    public final LinkedList<C78461f.C78462a> getMBounceOffsetChangedListeners() {
        return this.f319671p;
    }

    public final ScrollView getMCompatScrollViewChild() {
        return this.f319674s;
    }

    public final boolean getMIsEnabled() {
        return this.f319662d;
    }

    public final C111565e getMOverscrollListener() {
        return this.f319672q;
    }

    public final int getMPullDownEnableFlag() {
        return this.f319669n;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f319675t;
        return pVar.f320806b | pVar.f320805a;
    }

    public final C111567h getScrollMode() {
        return this.f319673r;
    }

    /* renamed from: h */
    public void mo154610h(View view) {
        C87412m.m108594g(view, "child");
        if (C111576j.f334006j) {
            view.hashCode();
        }
        int b = mo89643b(view);
        if (b != 0) {
            this.f319672q.getClass();
            if (this.f319664f == null) {
                this.f319664f = ValueAnimator.ofInt(new int[0]);
            }
            ValueAnimator valueAnimator = this.f319664f;
            if (!(valueAnimator != null && valueAnimator.isStarted())) {
                ValueAnimator valueAnimator2 = this.f319664f;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.f319664f;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new C106822b(this, view));
                }
                float abs = ((((float) Math.abs(b)) * 1.0f) / ((float) mo89645d(view))) * ((float) C111576j.f333998b);
                ValueAnimator valueAnimator4 = this.f319664f;
                if (valueAnimator4 != null) {
                    valueAnimator4.setDuration((long) Math.max((int) abs, C111576j.f333999c));
                }
                ValueAnimator valueAnimator5 = this.f319664f;
                if (valueAnimator5 != null) {
                    valueAnimator5.setInterpolator(this.f319663e);
                }
                ValueAnimator valueAnimator6 = this.f319664f;
                if (valueAnimator6 != null) {
                    valueAnimator6.setIntValues(new int[]{b, 0});
                }
                ValueAnimator valueAnimator7 = this.f319664f;
                if (valueAnimator7 != null) {
                    valueAnimator7.start();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        if (C111576j.f334006j) {
            view.hashCode();
            mo89643b(view);
        }
        this.f319675t.mo157676b(view, i);
        OverScroller overScroller = this.f319665g;
        if (i == 0) {
            if (C111576j.f334006j) {
                if (overScroller != null) {
                    overScroller.computeScrollOffset();
                }
                if (overScroller != null) {
                    overScroller.getCurrVelocity();
                }
                if (overScroller != null) {
                    overScroller.getCurrX();
                }
                if (overScroller != null) {
                    overScroller.getStartX();
                }
            }
            if (mo89643b(view) != 0) {
                if (overScroller == null) {
                    mo154610h(view);
                } else if (!overScroller.computeScrollOffset()) {
                    mo154610h(view);
                } else if (this.f319677v) {
                    mo154610h(view);
                }
            } else if (this.f319677v && overScroller != null && overScroller.computeScrollOffset()) {
                if (this.f319678w == null) {
                    this.f319678w = new C106821a(this, overScroller, view);
                }
                C106821a aVar = this.f319678w;
                if (aVar != null) {
                    aVar.f319681f = aVar.f319679d.getCurrX();
                    aVar.f319682g.postOnAnimation(aVar);
                }
            }
        } else if (mo89643b(view) != 0) {
            mo154610h(view);
        }
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        mo154599e(view, i3, i5, (int[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77719n(android.view.View r4, int r5, int r6, int[] r7, int r8) {
        /*
            r3 = this;
            java.lang.String r6 = "target"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "consumed"
            gy3.C87412m.m108594g(r7, r6)
            r6 = 0
            r8 = r7[r6]
            vo3.e r8 = r3.f319672q
            if (r5 == 0) goto L_0x0044
            if (r5 >= 0) goto L_0x001c
            r8.getClass()
            int r8 = r3.mo89643b(r4)
            r0 = 0
            goto L_0x0025
        L_0x001c:
            r8.getClass()
            int r8 = r3.mo89643b(r4)
            r0 = r8
            r8 = 0
        L_0x0025:
            if (r8 >= r0) goto L_0x0044
            int r1 = r3.mo89643b(r4)
            int r1 = r1 - r5
            int r5 = r3.mo89643b(r4)
            if (r8 > r5) goto L_0x0036
            if (r5 > r0) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0044
            int r8 = p282z2.C16095a.m14980b(r1, r8, r0)
            if (r5 == r8) goto L_0x0044
            r3.mo89642a(r4, r8)
            int r5 = r5 - r8
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            r7[r6] = r5
            boolean r4 = vo3.C111576j.f334006j
            if (r4 == 0) goto L_0x0052
            java.util.List r4 = sx3.C110821n.m150957d(r7)
            r4.toString()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.pulldown.HorizontalNestedBounceView.mo77719n(android.view.View, int, int, int[], int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C87412m.m108594g(view, "target");
        return super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        if (this.f319665g == null) {
            this.f319665g = new OverScroller(getContext());
        }
        OverScroller overScroller = this.f319665g;
        if (overScroller != null) {
            overScroller.fling(0, 0, (int) f, 0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        this.f319677v = true;
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

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setAtEndWhenIntercept(boolean z) {
    }

    public final void setAtStartWhenIntercept(boolean z) {
    }

    public final void setBounce(boolean z) {
        this.f319662d = z;
    }

    public final void setCustomNestedChild(C111566g gVar) {
        this.f319670o = gVar;
    }

    public final void setFlinging(boolean z) {
        this.f319677v = z;
    }

    public final void setLastType(int i) {
        this.f319676u = i;
    }

    public final void setMCompatScrollViewChild(ScrollView scrollView) {
        this.f319674s = scrollView;
    }

    public final void setMIsEnabled(boolean z) {
        this.f319662d = z;
    }

    public final void setMPullDownEnableFlag(int i) {
        this.f319669n = i;
    }
}
