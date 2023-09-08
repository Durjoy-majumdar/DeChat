package sq3;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import mq3.C21524b;
import oq3.C21803b;
import rq3.C22243b;
import zp3.C79406f;

/* renamed from: sq3.b */
public final class C22387b {

    /* renamed from: a */
    public final WxRefreshLayout f63473a;

    /* renamed from: b */
    public final C22386a f63474b;

    /* renamed from: c */
    public C21524b f63475c;

    /* renamed from: d */
    public Runnable f63476d;

    /* renamed from: e */
    public ValueAnimator f63477e;

    /* renamed from: sq3.b$a */
    public final class C22388a implements Runnable {

        /* renamed from: d */
        public float f63478d;

        /* renamed from: e */
        public int f63479e;

        /* renamed from: f */
        public int f63480f;

        /* renamed from: g */
        public long f63481g = AnimationUtils.currentAnimationTimeMillis();

        /* renamed from: h */
        public float f63482h;

        public C22388a(float f, int i) {
            this.f63478d = f;
            this.f63479e = i;
            C22387b.this.f63473a.getMainHandler().postDelayed(this, (long) 10);
            if (this.f63478d > 0.0f) {
                C22387b.this.f63474b.mo35533e(C22243b.PullDownToRefresh);
            } else {
                C22387b.this.f63474b.mo35533e(C22243b.PullUpToLoad);
            }
        }

        public void run() {
            double d;
            C22387b bVar = C22387b.this;
            if (bVar.f63476d == this && !bVar.f63474b.f63470b.f63048h) {
                float f = this.f63478d;
                C21524b bVar2 = bVar.f63475c;
                if (bVar2 != null) {
                    if (Math.abs(bVar2.f60959b) < Math.abs(this.f63479e)) {
                        int i = this.f63480f + 1;
                        this.f63480f = i;
                        d = Math.pow(0.95d, (double) (i * 2));
                    } else if (this.f63479e != 0) {
                        int i2 = this.f63480f + 1;
                        this.f63480f = i2;
                        d = Math.pow(0.45d, (double) (i2 * 2));
                    } else {
                        int i3 = this.f63480f + 1;
                        this.f63480f = i3;
                        d = Math.pow(0.85d, (double) (i3 * 2));
                    }
                    this.f63478d = f * ((float) d);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float f2 = this.f63478d * ((((float) (currentAnimationTimeMillis - this.f63481g)) * 1.0f) / ((float) 1000));
                    if (Math.abs(f2) >= 1.0f) {
                        this.f63481g = currentAnimationTimeMillis;
                        float f3 = this.f63482h + f2;
                        this.f63482h = f3;
                        C22387b.this.f63473a.mo26638t(f3);
                        C22387b.this.f63473a.getMainHandler().postDelayed(this, (long) 10);
                        return;
                    }
                    C22386a aVar = C22387b.this.f63474b;
                    C22243b bVar3 = aVar.f63471c;
                    boolean z = bVar3.f63046f;
                    if (z && bVar3.f63044d) {
                        aVar.mo35533e(C22243b.PullDownCanceled);
                    } else if (z && bVar3.f63045e) {
                        aVar.mo35533e(C22243b.PullUpCanceled);
                    }
                    C22387b bVar4 = C22387b.this;
                    bVar4.f63476d = null;
                    C21524b bVar5 = bVar4.f63475c;
                    if (bVar5 == null) {
                        C87412m.m108603p("cValues");
                        throw null;
                    } else if (Math.abs(bVar5.f60959b) >= Math.abs(this.f63479e)) {
                        Context context = C22387b.this.f63473a.getContext();
                        C21524b bVar6 = C22387b.this.f63475c;
                        if (bVar6 != null) {
                            int min = 10 * Math.min(Math.max((int) C79406f.m96348b(context, (float) Math.abs(bVar6.f60959b - this.f63479e)), 30), 100);
                            C22387b bVar7 = C22387b.this;
                            bVar7.mo35534a(this.f63479e, 0, bVar7.f63473a.getInterpolator(), min);
                            return;
                        }
                        C87412m.m108603p("cValues");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cValues");
                    throw null;
                }
            }
        }
    }

    /* renamed from: sq3.b$b */
    public final class C22389b implements Runnable {

        /* renamed from: d */
        public float f63484d;

        /* renamed from: e */
        public int f63485e;

        /* renamed from: f */
        public long f63486f;

        /* renamed from: g */
        public long f63487g;

        public C22389b(float f) {
            this.f63484d = f;
            C21524b bVar = C22387b.this.f63475c;
            if (bVar != null) {
                this.f63485e = bVar.f60959b;
                this.f63487g = AnimationUtils.currentAnimationTimeMillis();
                return;
            }
            C87412m.m108603p("cValues");
            throw null;
        }

        public void run() {
            C22387b bVar = C22387b.this;
            if (bVar.f63476d == this && !bVar.f63474b.f63470b.f63048h) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float pow = this.f63484d * ((float) Math.pow((double) 0.98f, (double) (((float) (currentAnimationTimeMillis - this.f63486f)) / (1000.0f / ((float) 10)))));
                this.f63484d = pow;
                float f = pow * ((((float) (currentAnimationTimeMillis - this.f63487g)) * 1.0f) / ((float) 1000));
                if (Math.abs(f) > 1.0f) {
                    this.f63487g = currentAnimationTimeMillis;
                    int i = this.f63485e + ((int) f);
                    this.f63485e = i;
                    C22387b bVar2 = C22387b.this;
                    C21524b bVar3 = bVar2.f63475c;
                    if (bVar3 == null) {
                        C87412m.m108603p("cValues");
                        throw null;
                    } else if (bVar3.f60959b * i > 0) {
                        bVar2.f63473a.mo26622s(i, true);
                        C22387b.this.f63473a.getMainHandler().postDelayed(this, (long) 10);
                    } else {
                        bVar2.f63476d = null;
                        bVar2.f63473a.mo26622s(0, true);
                        C21803b contentView = C22387b.this.f63473a.getContentView();
                        View i2 = contentView != null ? contentView.mo34221i() : null;
                        int i3 = (int) (-this.f63484d);
                        if (i2 instanceof ScrollView) {
                            ((ScrollView) i2).fling(i3);
                        } else if (i2 instanceof AbsListView) {
                            ((AbsListView) i2).fling(i3);
                        } else if (i2 instanceof WebView) {
                            ((WebView) i2).flingScroll(0, i3);
                        } else if (i2 instanceof NestedScrollView) {
                            ((NestedScrollView) i2).mo144969e(i3);
                        } else if (i2 instanceof RecyclerView) {
                            ((RecyclerView) i2).mo17025K0(0, i3);
                        }
                        C21524b bVar4 = C22387b.this.f63475c;
                        if (bVar4 == null) {
                            C87412m.m108603p("cValues");
                            throw null;
                        } else if (bVar4.f60963f && f > 0.0f) {
                            if (bVar4 != null) {
                                bVar4.f60963f = false;
                            } else {
                                C87412m.m108603p("cValues");
                                throw null;
                            }
                        }
                    }
                } else {
                    C22387b.this.f63476d = null;
                }
            }
        }
    }

    /* renamed from: sq3.b$c */
    public static final class C22390c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C22387b f63489d;

        public C22390c(C22387b bVar) {
            this.f63489d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            r0 = r6.f63474b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationEnd(android.animation.Animator r6) {
            /*
                r5 = this;
                r0 = 0
                if (r6 == 0) goto L_0x000e
                long r1 = r6.getDuration()
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 != 0) goto L_0x000e
                r0 = 1
            L_0x000e:
                if (r0 == 0) goto L_0x0011
                return
            L_0x0011:
                sq3.b r6 = r5.f63489d
                r0 = 0
                r6.f63477e = r0
                mq3.b r1 = r6.f63475c
                if (r1 == 0) goto L_0x003e
                int r0 = r1.f60959b
                if (r0 != 0) goto L_0x0032
                sq3.a r0 = r6.f63474b
                rq3.b r1 = r0.f63470b
                rq3.b r2 = rq3.C22243b.None
                if (r1 == r2) goto L_0x0032
                boolean r3 = r1.f63047g
                if (r3 != 0) goto L_0x0032
                boolean r1 = r1.f63046f
                if (r1 != 0) goto L_0x0032
                r0.mo35531c(r2)
                goto L_0x003d
            L_0x0032:
                sq3.a r6 = r6.f63474b
                rq3.b r0 = r6.f63470b
                rq3.b r1 = r6.f63471c
                if (r0 == r1) goto L_0x003d
                r6.mo35532d(r0)
            L_0x003d:
                return
            L_0x003e:
                java.lang.String r6 = "cValues"
                gy3.C87412m.m108603p(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sq3.C22387b.C22390c.onAnimationEnd(android.animation.Animator):void");
        }
    }

    /* renamed from: sq3.b$d */
    public static final class C22391d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C22387b f63490d;

        public C22391d(C22387b bVar) {
            this.f63490d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WxRefreshLayout wxRefreshLayout = this.f63490d.f63473a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            wxRefreshLayout.mo26622s(((Integer) animatedValue).intValue(), false);
        }
    }

    public C22387b(WxRefreshLayout wxRefreshLayout, C22386a aVar) {
        C87412m.m108594g(wxRefreshLayout, "layout");
        C87412m.m108594g(aVar, "stateCenter");
        this.f63473a = wxRefreshLayout;
        this.f63474b = aVar;
    }

    /* renamed from: a */
    public final ValueAnimator mo35534a(int i, int i2, Interpolator interpolator, int i3) {
        C21524b bVar = this.f63475c;
        if (bVar == null) {
            C87412m.m108603p("cValues");
            throw null;
        } else if (bVar.f60959b == i) {
            return null;
        } else {
            mo35535b();
            this.f63476d = null;
            int[] iArr = new int[2];
            C21524b bVar2 = this.f63475c;
            if (bVar2 != null) {
                iArr[0] = bVar2.f60959b;
                iArr[1] = i;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                ofInt.setDuration((long) i3);
                ofInt.setInterpolator(interpolator);
                ofInt.addListener(new C22390c(this));
                ofInt.addUpdateListener(new C22391d(this));
                ofInt.setStartDelay((long) i2);
                ofInt.start();
                this.f63477e = ofInt;
                return ofInt;
            }
            C87412m.m108603p("cValues");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo35535b() {
        ValueAnimator valueAnimator = this.f63477e;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0);
            valueAnimator.cancel();
            this.f63477e = null;
        }
    }

    /* renamed from: c */
    public final boolean mo35536c(int i) {
        if (i == 0) {
            ValueAnimator valueAnimator = this.f63477e;
            if (valueAnimator != null) {
                C22386a aVar = this.f63474b;
                C22243b bVar = aVar.f63470b;
                if (!bVar.f63048h) {
                    if (!(bVar == C22243b.RefreshReleased)) {
                        if (!(bVar == C22243b.LoadReleased)) {
                            if (bVar == C22243b.PullDownCanceled) {
                                aVar.mo35533e(C22243b.PullDownToRefresh);
                            } else {
                                if (bVar == C22243b.PullUpCanceled) {
                                    aVar.mo35533e(C22243b.PullUpToLoad);
                                }
                            }
                            valueAnimator.setDuration(0);
                            valueAnimator.cancel();
                            this.f63477e = null;
                        }
                    }
                }
                return true;
            }
            this.f63476d = null;
        }
        return this.f63477e != null;
    }
}
