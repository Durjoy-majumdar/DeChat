package com.tencent.p014mm.p136ui.widget.listview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import to3.C78076a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView */
public class PullDownListView extends ListView implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, C111847h {

    /* renamed from: S0 */
    public static final /* synthetic */ int f220622S0 = 0;

    /* renamed from: A */
    public int f220623A;

    /* renamed from: B */
    public boolean f220624B = false;

    /* renamed from: C */
    public float f220625C;

    /* renamed from: D */
    public float f220626D;

    /* renamed from: E */
    public View f220627E;

    /* renamed from: F */
    public View f220628F;

    /* renamed from: G */
    public float f220629G = 0.0f;

    /* renamed from: H */
    public boolean f220630H = false;

    /* renamed from: I */
    public boolean f220631I = true;

    /* renamed from: J */
    public boolean f220632J = false;

    /* renamed from: K */
    public boolean f220633K = false;

    /* renamed from: L */
    public boolean f220634L = false;

    /* renamed from: M */
    public float f220635M = 0.0f;

    /* renamed from: N */
    public int f220636N = 0;

    /* renamed from: P */
    public int f220637P = 0;

    /* renamed from: Q */
    public boolean f220638Q = false;

    /* renamed from: Q0 */
    public AdapterView.OnItemLongClickListener f220639Q0;

    /* renamed from: R */
    public float f220640R = 0.0f;

    /* renamed from: R0 */
    public AdapterView.OnItemSelectedListener f220641R0;

    /* renamed from: S */
    public int f220642S = -1;

    /* renamed from: T */
    public int f220643T = 0;

    /* renamed from: U */
    public int f220644U = 0;

    /* renamed from: V */
    public boolean f220645V = false;

    /* renamed from: W */
    public long f220646W = 0;

    /* renamed from: d */
    public boolean f220647d = false;

    /* renamed from: e */
    public boolean f220648e = false;

    /* renamed from: f */
    public boolean f220649f = true;

    /* renamed from: g */
    public float f220650g = 0.05f;

    /* renamed from: h */
    public float f220651h = 0.05f;

    /* renamed from: i */
    public int f220652i = 0;

    /* renamed from: j */
    public int f220653j = 0;

    /* renamed from: n */
    public int f220654n = 0;

    /* renamed from: o */
    public float f220655o = 0.0f;

    /* renamed from: p */
    public float f220656p = 0.0f;

    /* renamed from: p0 */
    public long f220657p0 = 0;

    /* renamed from: q */
    public Vibrator f220658q;

    /* renamed from: r */
    public boolean f220659r = true;

    /* renamed from: s */
    public View f220660s;

    /* renamed from: t */
    public float f220661t;

    /* renamed from: u */
    public View f220662u;

    /* renamed from: v */
    public Rect f220663v = new Rect();

    /* renamed from: w */
    public int f220664w = 0;

    /* renamed from: x */
    public int f220665x = 0;

    /* renamed from: x0 */
    public C74996e f220666x0 = null;

    /* renamed from: y */
    public IPullDownCallback f220667y;

    /* renamed from: y0 */
    public AdapterView.OnItemClickListener f220668y0;

    /* renamed from: z */
    public int f220669z;

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback */
    public interface IPullDownCallback {
        /* renamed from: e */
        void mo96596e();

        /* renamed from: i */
        void mo96597i(int i);

        /* renamed from: n */
        void mo96598n();

        void onPostClose();

        void onPostOpen(boolean z);

        void onPreClose();

        void onPreOpen();

        /* renamed from: q */
        void mo96603q(int i);

        /* renamed from: u */
        void mo96604u(int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$a */
    public class C74992a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f220670d;

        public C74992a(View view) {
            this.f220670d = view;
        }

        public void run() {
            PullDownListView pullDownListView = PullDownListView.this;
            View view = pullDownListView.f220662u;
            if (view != null) {
                pullDownListView.f220655o = (float) (-view.getWidth());
                PullDownListView pullDownListView2 = PullDownListView.this;
                pullDownListView2.f220656p = (float) pullDownListView2.f220662u.getHeight();
                View view2 = PullDownListView.this.f220662u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f220670d.bringToFront();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$b */
    public class C74993b extends AnimatorListenerAdapter {
        public C74993b() {
        }

        public void onAnimationCancel(Animator animator) {
            View view = PullDownListView.this.f220662u;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/listview/PullDownListView$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/widget/listview/PullDownListView$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C85975v4.m106306c("MicroMsg.PullDownListView", "onAnimationCancel ", new Object[0]);
        }

        public void onAnimationEnd(Animator animator) {
            View view = PullDownListView.this.f220662u;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/listview/PullDownListView$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/widget/listview/PullDownListView$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$c */
    public class C74994c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ int f220673d;

        /* renamed from: e */
        public final /* synthetic */ int f220674e;

        /* renamed from: f */
        public final /* synthetic */ boolean f220675f;

        public C74994c(int i, int i2, boolean z) {
            this.f220673d = i;
            this.f220674e = i2;
            this.f220675f = z;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C85975v4.m106306c("MicroMsg.PullDownListView", "onAnimationCancel ", new Object[0]);
        }

        public void onAnimationEnd(Animator animator) {
            PullDownListView pullDownListView = PullDownListView.this;
            int i = PullDownListView.f220622S0;
            C85975v4.m106306c("MicroMsg.PullDownListView", "onAnimationEnd start:%s, openLimitPx():%s, closeLimitPx():%s", Integer.valueOf(this.f220673d), Integer.valueOf(pullDownListView.mo104531g()), Integer.valueOf(PullDownListView.this.mo104527c()));
            PullDownListView pullDownListView2 = PullDownListView.this;
            pullDownListView2.f220630H = false;
            pullDownListView2.f220632J = false;
            pullDownListView2.f220633K = false;
            pullDownListView2.f220634L = false;
            if (pullDownListView2.f220667y != null && this.f220673d > pullDownListView2.mo104531g() && this.f220673d < PullDownListView.this.mo104527c()) {
                PullDownListView pullDownListView3 = PullDownListView.this;
                if (pullDownListView3.f220631I) {
                    pullDownListView3.f220667y.onPostClose();
                    View view = PullDownListView.this.f220627E;
                    return;
                }
                pullDownListView3.f220667y.onPostOpen(this.f220675f);
            }
        }

        public void onAnimationStart(Animator animator) {
            PullDownListView pullDownListView = PullDownListView.this;
            int i = PullDownListView.f220622S0;
            C85975v4.m106306c("MicroMsg.PullDownListView", "onAnimationStart start:%s, openLimitPx():%s, closeLimitPx():%s", Integer.valueOf(this.f220673d), Integer.valueOf(pullDownListView.mo104531g()), Integer.valueOf(PullDownListView.this.mo104527c()));
            PullDownListView pullDownListView2 = PullDownListView.this;
            pullDownListView2.f220632J = true;
            if (this.f220674e == 0) {
                pullDownListView2.f220631I = true;
            } else {
                pullDownListView2.f220631I = false;
            }
            if (pullDownListView2.f220667y != null && this.f220673d > pullDownListView2.mo104531g() && this.f220673d < PullDownListView.this.mo104527c()) {
                PullDownListView pullDownListView3 = PullDownListView.this;
                if (pullDownListView3.f220631I) {
                    pullDownListView3.f220667y.onPreClose();
                } else {
                    pullDownListView3.f220667y.onPreOpen();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$d */
    public class C74995d implements ValueAnimator.AnimatorUpdateListener {
        public C74995d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) PullDownListView.this.f220628F.getLayoutParams();
            marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PullDownListView.this.f220628F.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$e */
    public interface C74996e {
        /* renamed from: a */
        void mo96754a(float f);
    }

    public PullDownListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnItemClickListener(this);
        super.setOnItemLongClickListener(this);
        super.setOnItemSelectedListener(this);
        C75044y4.m89990b(context);
        this.f220654n = C75044y4.m89990b(context).y;
        this.f220658q = (Vibrator) getContext().getSystemService("vibrator");
        post(new C78076a(this));
    }

    /* renamed from: b */
    public final boolean mo104526b(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (this.f220662u == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 1 && this.f220657p0 < 200) {
            return false;
        }
        if (this.f220626D < ((float) this.f220662u.getRight())) {
            if (rawX <= ((float) this.f220662u.getLeft()) || rawX >= ((float) this.f220662u.getRight()) || rawY <= ((float) (this.f220662u.getTop() - (this.f220662u.getHeight() / 2))) || rawY >= ((float) (this.f220662u.getBottom() + this.f220665x))) {
                return false;
            }
        } else if (rawX <= ((float) this.f220662u.getLeft()) || rawX >= ((float) this.f220662u.getRight()) || rawY <= ((float) this.f220662u.getTop()) || rawY >= ((float) (this.f220662u.getBottom() + this.f220665x))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo104527c() {
        if (this.f220653j == 0) {
            this.f220653j = (int) (((float) (this.f220654n - this.f220637P)) * (1.0f - this.f220651h));
        }
        return this.f220653j;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final ValueAnimator mo104529e(int i, int i2) {
        C85975v4.m106304a("MicroMsg.PullDownListView", "startStoryGalleryOpenAnim start:%s, end:%s", Integer.valueOf(i), Integer.valueOf(i2));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C74995d());
        return ofInt;
    }

    /* renamed from: f */
    public final void mo104530f() {
        View view = this.f220662u;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public final int mo104531g() {
        if (this.f220652i == 0) {
            this.f220652i = (int) (((float) this.f220654n) * this.f220650g);
        }
        return this.f220652i;
    }

    /* renamed from: h */
    public void mo104532h() {
        this.f220664w = 0;
        C85975v4.m106304a("MicroMsg.PullDownListView", "startAnimation %s %s %s %s", Integer.valueOf(this.f220660s.getLeft()), Integer.valueOf(this.f220660s.getTop()), Integer.valueOf(this.f220660s.getRight()), Integer.valueOf(this.f220660s.getBottom()));
    }

    /* renamed from: i */
    public final void mo104533i() {
        View view = this.f220662u;
        if (view != null) {
            view.setTranslationX(this.f220655o);
            this.f220662u.setTranslationY(this.f220656p);
            View view2 = this.f220662u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: j */
    public final int mo104534j(int i) {
        float f = (float) i;
        int abs = (int) Math.abs((f / ((float) this.f220654n)) * ((float) this.f220636N));
        C85975v4.m106304a("MicroMsg.PullDownListView", "offset:%s,  ((float) offset / screenHeight):%s,  Math.abs(mCoordinationAnimThreshold):%s,  result:%s", Integer.valueOf(i), Float.valueOf(f / ((float) this.f220654n)), Integer.valueOf(Math.abs(this.f220636N)), Integer.valueOf(abs));
        return abs;
    }

    /* renamed from: k */
    public final void mo104535k(int i, int i2, boolean z) {
        C85975v4.m106306c("MicroMsg.PullDownListView", "story_cat animation: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", Integer.valueOf(this.f220663v.left), Integer.valueOf(this.f220663v.top), Integer.valueOf(this.f220663v.right), Integer.valueOf(this.f220663v.bottom), Integer.valueOf(getLeft()), Integer.valueOf(getTop()), Integer.valueOf(getRight()), Integer.valueOf(getBottom()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(mo104531g()), Integer.valueOf(mo104527c()), Boolean.valueOf(z));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float f = (float) i;
        float f2 = (float) i2;
        arrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[]{f, f2}));
        if (this.f220627E != null && i > mo104531g() && i < mo104527c()) {
            if (i2 != 0) {
                arrayList.add(ObjectAnimator.ofFloat(this.f220627E, "translationY", new float[]{f, f2}));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f220627E, "translationY", new float[]{f, (float) (i2 - this.f220665x)}));
            }
        }
        if (this.f220628F != null) {
            if (i2 >= getBottom()) {
                arrayList.add(mo104529e(((ViewGroup.MarginLayoutParams) this.f220628F.getLayoutParams()).topMargin, 0));
            } else {
                arrayList.add(mo104529e(((ViewGroup.MarginLayoutParams) this.f220628F.getLayoutParams()).topMargin, this.f220636N));
            }
        }
        animatorSet.addListener(new C74994c(i, i2, z));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300);
        animatorSet.start();
        mo104532h();
    }

    /* renamed from: l */
    public final void mo104536l(int i, int i2, boolean z) {
        C85975v4.m106306c("MicroMsg.PullDownListView", "story_cat animation: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", Integer.valueOf(this.f220663v.left), Integer.valueOf(this.f220663v.top), Integer.valueOf(this.f220663v.right), Integer.valueOf(this.f220663v.bottom), Integer.valueOf(getLeft()), Integer.valueOf(getTop()), Integer.valueOf(getRight()), Integer.valueOf(getBottom()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(mo104531g()), Integer.valueOf(mo104527c()), Boolean.valueOf(z));
        float f = (float) i2;
        setTranslationY(f);
        if (this.f220627E != null && i > mo104531g() && i < mo104527c()) {
            if (i2 != 0) {
                this.f220627E.setTranslationY(f);
            } else {
                this.f220627E.setTranslationY((float) (i2 - this.f220665x));
            }
        }
        C85975v4.m106306c("MicroMsg.PullDownListView", "onImmeStart start:%s, openLimitPx():%s, closeLimitPx():%s", Integer.valueOf(i), Integer.valueOf(mo104531g()), Integer.valueOf(mo104527c()));
        this.f220632J = true;
        if (i2 == 0) {
            this.f220631I = true;
        } else {
            this.f220631I = false;
        }
        if (this.f220667y != null && i > mo104531g() && i < mo104527c()) {
            if (this.f220631I) {
                this.f220667y.onPreClose();
            } else {
                this.f220667y.onPreOpen();
            }
        }
        C85975v4.m106306c("MicroMsg.PullDownListView", "onImmeEnd start:%s, openLimitPx():%s, closeLimitPx():%s", Integer.valueOf(i), Integer.valueOf(mo104531g()), Integer.valueOf(mo104527c()));
        this.f220630H = false;
        this.f220632J = false;
        this.f220633K = false;
        this.f220634L = false;
        if (this.f220667y != null && i > mo104531g() && i < mo104527c()) {
            if (this.f220631I) {
                this.f220667y.onPostClose();
            } else {
                this.f220667y.onPostOpen(z);
            }
        }
        mo104532h();
    }

    /* renamed from: m */
    public final void mo104537m() {
        View view = this.f220662u;
        if (view != null) {
            float translationX = view.getTranslationX();
            float translationY = this.f220662u.getTranslationY();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f220662u, "translationX", new float[]{translationX, this.f220655o});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f220662u, "translationY", new float[]{translationY, this.f220656p});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new C74993b());
            animatorSet.start();
        }
    }

    /* renamed from: n */
    public void mo104538n() {
        C85975v4.m106306c("MicroMsg.PullDownListView", "switchNormalStatus", new Object[0]);
        if (this.f220631I) {
            return;
        }
        if (this.f220648e) {
            mo104535k((int) (((float) this.f220669z) * (1.0f - this.f220651h)), 0, false);
        } else {
            mo104535k(mo104527c() - 1, 0, false);
        }
    }

    /* renamed from: o */
    public void mo104539o() {
        C85975v4.m106306c("MicroMsg.PullDownListView", "switchNormalStatusImme", new Object[0]);
        if (this.f220631I) {
            return;
        }
        if (this.f220648e) {
            mo104536l((int) (((float) this.f220669z) * (1.0f - this.f220651h)), 0, false);
        } else {
            mo104536l(mo104527c() - 1, 0, false);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f220660s = this;
        getTranslationY();
        C85975v4.m106304a("MicroMsg.PullDownListView", "onFinishInflate %s %s %s %s", Integer.valueOf(this.f220660s.getLeft()), Integer.valueOf(this.f220660s.getTop()), Integer.valueOf(this.f220660s.getRight()), Integer.valueOf(this.f220660s.getBottom()));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f220631I || !this.f220648e || motionEvent.getRawY() <= ((float) this.f220623A)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C85975v4.m106306c("MicroMsg.PullDownListView", "onItemClick isMove:%s isVisible:%s mIsNeedHover:%s position:%s mItemSelectedListener:%s", Boolean.valueOf(this.f220630H), Boolean.valueOf(this.f220631I), Boolean.valueOf(this.f220648e), Integer.valueOf(i), this.f220641R0);
        AdapterView.OnItemClickListener onItemClickListener = this.f220668y0;
        if (onItemClickListener != null && !this.f220630H && this.f220631I && !this.f220632J) {
            this.f220624B = true;
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = this.f220639Q0;
        if (onItemLongClickListener == null) {
            return false;
        }
        if (!this.f220631I && !this.f220648e) {
            return false;
        }
        this.f220624B = true;
        return onItemLongClickListener.onItemLongClick(adapterView, view, i, j);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        AdapterView<?> adapterView2 = adapterView;
        arrayList.add(adapterView);
        View view2 = view;
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f220641R0;
        if (onItemSelectedListener != null && !this.f220630H && this.f220631I && !this.f220632J) {
            this.f220624B = true;
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f220641R0;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:188:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0621 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0622 A[SYNTHETIC, Splitter:B:196:0x0622] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            boolean r4 = r1.f220647d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r21.getScrollY()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "MicroMsg.PullDownListView"
            java.lang.String r7 = "dancy test onTouchEvent, supportOverscroll:%s, scrollY:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r7, r3)
            boolean r3 = r1.f220647d
            if (r3 == 0) goto L_0x066e
            android.view.View r3 = r1.f220660s
            if (r3 == 0) goto L_0x066e
            boolean r3 = r1.f220632J
            if (r3 == 0) goto L_0x0030
            goto L_0x066e
        L_0x0030:
            int r3 = r22.getActionMasked()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7[r5] = r8
            java.lang.String r8 = "onTouchEvent %s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r7)
            r7 = 0
            r9 = 0
            r10 = 3
            if (r3 == 0) goto L_0x05b2
            r11 = -1
            r12 = 4
            if (r3 == r6) goto L_0x04ac
            r13 = 5
            if (r3 == r2) goto L_0x00bc
            if (r3 == r10) goto L_0x009c
            if (r3 == r13) goto L_0x0086
            r7 = 6
            if (r3 == r7) goto L_0x0057
            goto L_0x0603
        L_0x0057:
            int r7 = r22.getActionIndex()
            int r8 = r0.getPointerId(r7)
            int r9 = r1.f220642S
            if (r8 != r9) goto L_0x0076
            if (r7 != 0) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            float r8 = r0.getY(r7)
            int r8 = (int) r8
            float r8 = (float) r8
            r1.f220661t = r8
            int r7 = r0.getPointerId(r7)
            r1.f220642S = r7
        L_0x0076:
            int r7 = r22.getActionIndex()
            if (r7 == r11) goto L_0x0603
            float r7 = r0.getY(r7)
            int r7 = (int) r7
            float r7 = (float) r7
            r1.f220661t = r7
            goto L_0x0603
        L_0x0086:
            int r7 = r22.getActionIndex()
            if (r7 == r11) goto L_0x0603
            float r8 = r0.getY(r7)
            int r8 = (int) r8
            float r8 = (float) r8
            r1.f220661t = r8
            int r7 = r0.getPointerId(r7)
            r1.f220642S = r7
            goto L_0x0603
        L_0x009c:
            r21.mo104537m()
            r1.f220638Q = r5
            r1.f220624B = r5
            r1.f220661t = r9
            r1.f220640R = r9
            r1.f220633K = r5
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r9 = r1.f220667y
            if (r9 == 0) goto L_0x00b0
            r21.mo104532h()
        L_0x00b0:
            r1.f220643T = r5
            r1.f220642S = r11
            r1.f220645V = r5
            r1.f220657p0 = r7
            r1.f220646W = r7
            goto L_0x0603
        L_0x00bc:
            r1.f220630H = r6
            boolean r7 = r1.f220638Q
            if (r7 != 0) goto L_0x0123
            boolean r7 = r1.f220631I
            if (r7 != 0) goto L_0x00f2
            int r7 = r0.getPointerId(r5)
            r1.f220642S = r7
            float r7 = r0.getY(r5)
            r1.f220661t = r7
            float r7 = r0.getY(r5)
            r1.f220625C = r7
            boolean r7 = r1.f220648e
            if (r7 == 0) goto L_0x00e2
            int r7 = r1.f220669z
            float r7 = (float) r7
            r1.f220635M = r7
            goto L_0x00ea
        L_0x00e2:
            int r7 = r1.f220654n
            int r8 = r1.f220637P
            int r7 = r7 - r8
            float r7 = (float) r7
            r1.f220635M = r7
        L_0x00ea:
            float r7 = r1.f220635M
            int r7 = (int) r7
            r1.f220643T = r7
            r1.f220638Q = r6
            goto L_0x0123
        L_0x00f2:
            int r7 = r0.getPointerId(r5)
            r1.f220642S = r7
            r21.mo104530f()
            r1.f220624B = r5
            float r7 = r0.getY(r5)
            r1.f220661t = r7
            r1.f220629G = r7
            r0.getX(r5)
            android.graphics.Rect r7 = r1.f220663v
            r7.setEmpty()
            float r7 = r0.getY(r5)
            r1.f220625C = r7
            float r7 = r0.getX(r5)
            r1.f220626D = r7
            r1.f220635M = r9
            int r7 = (int) r9
            r1.f220643T = r7
            r1.f220638Q = r6
            r21.mo104533i()
        L_0x0123:
            int r7 = r1.f220642S
            int r7 = r0.findPointerIndex(r7)
            if (r7 != r11) goto L_0x012d
            goto L_0x0603
        L_0x012d:
            float r8 = r0.getY(r7)
            r1.f220629G = r8
            r0.getX(r7)
            float r8 = r1.f220629G
            float r11 = r1.f220625C
            float r8 = r8 - r11
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0142
            r1.f220644U = r2
            goto L_0x0144
        L_0x0142:
            r1.f220644U = r6
        L_0x0144:
            int r8 = r21.getChildCount()
            if (r8 <= 0) goto L_0x017a
            boolean r11 = r1.f220631I
            if (r11 == 0) goto L_0x017a
            int r11 = r1.f220644U
            if (r11 != r2) goto L_0x0162
            android.view.View r8 = r1.getChildAt(r5)
            int r8 = r8.getTop()
            int r11 = r21.getPaddingTop()
            int r11 = r11 + r5
            if (r8 >= r11) goto L_0x017a
            goto L_0x0178
        L_0x0162:
            if (r11 != r6) goto L_0x017a
            int r8 = r8 - r6
            android.view.View r8 = r1.getChildAt(r8)
            int r8 = r8.getBottom()
            int r11 = r21.getHeight()
            int r14 = r21.getPaddingBottom()
            int r11 = r11 - r14
            if (r8 < r11) goto L_0x017a
        L_0x0178:
            r8 = 1
            goto L_0x017b
        L_0x017a:
            r8 = 0
        L_0x017b:
            if (r8 == 0) goto L_0x017f
            r1.f220645V = r6
        L_0x017f:
            boolean r8 = r1.f220645V
            if (r8 != 0) goto L_0x04a5
            java.lang.Object[] r8 = new java.lang.Object[r12]
            float r11 = r22.getRawY()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r5] = r11
            float r11 = r22.getRawX()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r6] = r11
            float r11 = r0.getY(r7)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r2] = r11
            float r11 = r0.getX(r7)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r10] = r11
            java.lang.String r11 = "rawY:%s, rawX:%s, indexY:%s, indexX:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r11, r8)
            float r8 = r1.f220661t
            float r11 = r1.f220629G
            float r8 = r8 - r11
            int r8 = (int) r8
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r5] = r8
            boolean r8 = r1.f220632J
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r11[r6] = r8
            int r8 = r1.f220664w
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r2] = r8
            boolean r8 = r1.f220624B
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r11[r10] = r8
            float r8 = r1.f220635M
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r11[r12] = r8
            java.lang.String r8 = "move deltaY:%s, isAnima:%s, mDeltaY:%s, mIsIgnoreCallBack:%s translateBaseY:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r11)
            boolean r8 = r1.f220624B
            if (r8 != 0) goto L_0x04a5
            boolean r8 = r1.f220632J
            if (r8 != 0) goto L_0x04a5
            android.graphics.Rect r8 = r1.f220663v
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x024c
            r21.getTranslationY()
            android.graphics.Rect r8 = r1.f220663v
            android.view.View r11 = r1.f220660s
            int r11 = r11.getLeft()
            android.view.View r13 = r1.f220660s
            int r13 = r13.getTop()
            android.view.View r14 = r1.f220660s
            int r14 = r14.getRight()
            android.view.View r15 = r1.f220660s
            int r15 = r15.getBottom()
            r8.set(r11, r13, r14, r15)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            android.view.View r11 = r1.f220660s
            int r11 = r11.getLeft()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r5] = r11
            android.view.View r11 = r1.f220660s
            int r11 = r11.getTop()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r6] = r11
            android.view.View r11 = r1.f220660s
            int r11 = r11.getRight()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r2] = r11
            android.view.View r11 = r1.f220660s
            int r11 = r11.getBottom()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r10] = r11
            java.lang.String r11 = "mRect.isEmpty() %s %s %s %s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r11, r8)
        L_0x024c:
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r8[r5] = r11
            float r11 = r0.getY(r7)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r6] = r11
            float r11 = r1.f220625C
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r8[r2] = r11
            float r7 = r0.getY(r7)
            float r11 = r1.f220625C
            float r7 = r7 - r11
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8[r10] = r7
            java.lang.String r7 = "eventIndex:%s, ev.getY():%s, y_down:%s, ev.getY()-y_down:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r7, r8)
            int r7 = r1.f220643T
            float r8 = r1.f220629G
            float r11 = r1.f220661t
            float r8 = r8 - r11
            int r8 = (int) r8
            float r8 = (float) r8
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            int r8 = (int) r8
            int r7 = r7 + r8
            r1.f220643T = r7
            int r7 = java.lang.Math.max(r5, r7)
            r1.f220664w = r7
            java.lang.Object[] r7 = new java.lang.Object[r12]
            android.view.View r8 = r1.f220660s
            int r8 = r8.getTop()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            android.view.View r8 = r1.f220660s
            int r8 = r8.getBottom()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r6] = r8
            int r8 = r1.f220664w
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            int r8 = r1.f220643T
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r10] = r8
            java.lang.String r8 = "top %s, bottom:%s, mDeltaY %s, deltaOverScrollY:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r7)
            int r7 = r1.f220643T
            int r7 = java.lang.Math.abs(r7)
            r8 = 50
            if (r7 <= r8) goto L_0x0314
            boolean r7 = r1.f220633K
            if (r7 != 0) goto L_0x02ee
            int r7 = r1.f220664w
            int r8 = r21.mo104531g()
            if (r7 < r8) goto L_0x02ee
            int r7 = r1.f220664w
            int r8 = r21.mo104527c()
            if (r7 > r8) goto L_0x02ee
            boolean r7 = r1.f220649f
            if (r7 == 0) goto L_0x02e7
            android.os.Vibrator r7 = r1.f220658q
            r13 = 10
            r7.vibrate(r13)
        L_0x02e7:
            r1.f220633K = r6
            int r7 = r1.f220643T
            float r7 = (float) r7
            r1.f220640R = r7
        L_0x02ee:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            android.graphics.Rect r8 = r1.f220663v
            int r8 = r8.top
            int r11 = r1.f220664w
            int r8 = r8 + r11
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            boolean r8 = r1.f220624B
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r6] = r8
            boolean r8 = r1.f220631I
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r2] = r8
            java.lang.String r8 = "OverScroll top %s, mIsIgnoreCallBack:%s, isVisible:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r7)
            r7 = 1
            goto L_0x0315
        L_0x0314:
            r7 = 0
        L_0x0315:
            android.view.View r8 = r1.f220660s
            int r11 = r1.f220664w
            float r11 = (float) r11
            r8.setTranslationY(r11)
            boolean r8 = r1.f220631I
            if (r8 == 0) goto L_0x0375
            int r8 = r1.f220664w
            float r11 = r1.f220635M
            int r11 = (int) r11
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r8, r5)
            int r8 = r1.mo104534j(r8)
            android.view.View r11 = r1.f220628F
            if (r11 == 0) goto L_0x035a
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r13 = r1.f220636N
            int r8 = r8 + r13
            int r8 = java.lang.Math.min(r5, r8)
            int r8 = java.lang.Math.max(r13, r8)
            r11.topMargin = r8
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r13 = r11.bottomMargin
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r5] = r13
            java.lang.String r13 = "openingCoordinationView params.bottomMargin:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r13, r8)
            android.view.View r8 = r1.f220628F
            r8.setLayoutParams(r11)
        L_0x035a:
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r8 = r1.f220667y
            if (r8 == 0) goto L_0x03c4
            int r11 = r1.f220664w
            int r13 = r21.mo104531g()
            int r11 = r11 - r13
            float r13 = r1.f220635M
            int r13 = (int) r13
            int r11 = r11 - r13
            int r11 = java.lang.Math.max(r11, r5)
            int r11 = r1.mo104534j(r11)
            r8.mo96604u(r11)
            goto L_0x03c4
        L_0x0375:
            float r8 = r1.f220635M
            int r8 = (int) r8
            int r11 = r1.f220664w
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r8, r5)
            int r8 = r1.mo104534j(r8)
            android.view.View r11 = r1.f220628F
            if (r11 == 0) goto L_0x03ae
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r13 = r1.f220636N
            int r8 = -r8
            int r8 = java.lang.Math.max(r13, r8)
            int r8 = java.lang.Math.min(r5, r8)
            r11.topMargin = r8
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r13 = r11.bottomMargin
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r5] = r13
            java.lang.String r13 = "closingCoordinationView params.bottomMargin:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r13, r8)
            android.view.View r8 = r1.f220628F
            r8.setLayoutParams(r11)
        L_0x03ae:
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r8 = r1.f220667y
            if (r8 == 0) goto L_0x03c4
            int r11 = r21.mo104527c()
            int r13 = r1.f220664w
            int r11 = r11 - r13
            int r11 = java.lang.Math.max(r11, r5)
            int r11 = r1.mo104534j(r11)
            r8.mo96603q(r11)
        L_0x03c4:
            float r8 = r1.f220640R
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x046d
            int r11 = r1.f220643T
            float r11 = (float) r11
            float r11 = r11 - r8
            int r8 = (int) r11
            float r8 = (float) r8
            r11 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r11
            int r8 = (int) r8
            boolean r11 = r1.f220631I
            if (r11 == 0) goto L_0x046a
            if (r8 <= 0) goto L_0x046a
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r11 = r1.f220667y
            if (r11 == 0) goto L_0x046a
            float r8 = (float) r8
            android.view.View r11 = r1.f220662u
            if (r11 == 0) goto L_0x043a
            float r13 = r1.f220655o
            float r13 = r13 + r8
            float r13 = java.lang.Math.min(r13, r9)
            r11.setTranslationX(r13)
            android.view.View r11 = r1.f220662u
            float r13 = r1.f220656p
            float r13 = r13 - r8
            float r8 = java.lang.Math.max(r13, r9)
            r11.setTranslationY(r8)
            android.view.View r8 = r1.f220662u
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r9.mo10233c(r11)
            java.lang.Object[] r14 = r9.mo10232b()
            java.lang.String r15 = "com/tencent/mm/ui/widget/listview/PullDownListView"
            java.lang.String r16 = "showMuteViewVisible"
            java.lang.String r17 = "(F)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r8
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.setVisibility(r9)
            java.lang.String r14 = "com/tencent/mm/ui/widget/listview/PullDownListView"
            java.lang.String r15 = "showMuteViewVisible"
            java.lang.String r16 = "(F)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x043a:
            boolean r8 = r1.f220634L
            if (r8 != 0) goto L_0x0452
            boolean r8 = r21.mo104526b(r22)
            if (r8 == 0) goto L_0x0452
            boolean r8 = r1.f220649f
            if (r8 == 0) goto L_0x044f
            android.os.Vibrator r8 = r1.f220658q
            r13 = 20
            r8.vibrate(r13)
        L_0x044f:
            r1.f220634L = r6
            goto L_0x045a
        L_0x0452:
            boolean r8 = r21.mo104526b(r22)
            if (r8 != 0) goto L_0x045a
            r1.f220634L = r5
        L_0x045a:
            boolean r8 = r1.f220634L
            if (r8 == 0) goto L_0x0464
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r8 = r1.f220667y
            r8.mo96596e()
            goto L_0x046d
        L_0x0464:
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r8 = r1.f220667y
            r8.mo96598n()
            goto L_0x046d
        L_0x046a:
            r21.mo104530f()
        L_0x046d:
            java.lang.Object[] r8 = new java.lang.Object[r12]
            android.view.View r9 = r1.f220660s
            int r9 = r9.getLeft()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r5] = r9
            android.view.View r9 = r1.f220660s
            int r9 = r9.getTop()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            android.view.View r9 = r1.f220660s
            int r9 = r9.getRight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r2] = r9
            android.view.View r9 = r1.f220660s
            int r9 = r9.getBottom()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r10] = r9
            java.lang.String r9 = "mThis.layout %s %s %s %s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r9, r8)
            goto L_0x04a6
        L_0x04a5:
            r7 = 0
        L_0x04a6:
            float r8 = r1.f220629G
            r1.f220661t = r8
            goto L_0x0604
        L_0x04ac:
            int r13 = r1.f220642S
            int r13 = r0.findPointerIndex(r13)
            if (r13 != r11) goto L_0x04b6
            goto L_0x0603
        L_0x04b6:
            float r14 = r0.getY(r13)
            r1.f220629G = r14
            r0.getX(r13)
            r21.mo104537m()
            r1.f220661t = r9
            r1.f220640R = r9
            r1.f220633K = r5
            long r13 = java.lang.System.currentTimeMillis()
            long r7 = r1.f220646W
            long r13 = r13 - r7
            r1.f220657p0 = r13
            java.lang.Object[] r7 = new java.lang.Object[r12]
            int r8 = r1.f220664w
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            int r8 = r21.mo104527c()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r6] = r8
            android.view.View r8 = r1.f220660s
            int r8 = r8.getBottom()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            long r12 = r1.f220657p0
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r7[r10] = r8
            java.lang.String r8 = "dancy test action up, mDeltaY:%s, closeLimitPx:%s, bottom:%s, mPullDownDuration%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r7)
            android.graphics.Rect r7 = r1.f220663v
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0510
            int r7 = r1.f220664w
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= 0) goto L_0x0510
            r7 = 1
            goto L_0x0511
        L_0x0510:
            r7 = 0
        L_0x0511:
            if (r7 == 0) goto L_0x059f
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r7 = r1.f220667y
            if (r7 == 0) goto L_0x059f
            boolean r7 = r1.f220632J
            if (r7 != 0) goto L_0x059f
            boolean r7 = r1.f220659r
            if (r7 == 0) goto L_0x059f
            boolean r7 = r1.f220645V
            if (r7 != 0) goto L_0x059f
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r8 = r1.f220643T
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            float r8 = r1.f220635M
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7[r6] = r8
            java.lang.String r8 = "dancy test action up, deltaOverScrollY:%s, translateBaseY:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r7)
            int r7 = r1.f220643T
            float r8 = (float) r7
            float r12 = r1.f220635M
            float r8 = r8 - r12
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0546
            r8 = 1
            goto L_0x0547
        L_0x0546:
            r8 = 0
        L_0x0547:
            if (r8 == 0) goto L_0x057c
            boolean r7 = r1.f220631I
            if (r7 == 0) goto L_0x0555
            int r7 = r1.f220664w
            int r8 = r21.mo104531g()
            if (r7 >= r8) goto L_0x0561
        L_0x0555:
            boolean r7 = r1.f220631I
            if (r7 != 0) goto L_0x0571
            int r7 = r1.f220664w
            int r8 = r21.mo104527c()
            if (r7 < r8) goto L_0x0571
        L_0x0561:
            android.view.View r7 = r1.f220660s
            int r7 = r7.getBottom()
            int r8 = r1.f220665x
            int r7 = r7 + r8
            boolean r8 = r1.f220648e
            if (r8 == 0) goto L_0x0572
            int r7 = r1.f220669z
            goto L_0x0572
        L_0x0571:
            r7 = 0
        L_0x0572:
            int r8 = r1.f220664w
            boolean r9 = r21.mo104526b(r22)
            r1.mo104535k(r8, r7, r9)
            goto L_0x059f
        L_0x057c:
            float r7 = (float) r7
            float r7 = r7 - r12
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0584
            r7 = 1
            goto L_0x0585
        L_0x0584:
            r7 = 0
        L_0x0585:
            if (r7 == 0) goto L_0x059f
            int r7 = r1.f220664w
            if (r7 >= 0) goto L_0x058c
            goto L_0x0599
        L_0x058c:
            int r8 = r21.mo104527c()
            if (r7 < r8) goto L_0x0599
            android.view.View r7 = r1.f220660s
            int r7 = r7.getBottom()
            goto L_0x059a
        L_0x0599:
            r7 = 0
        L_0x059a:
            int r8 = r1.f220664w
            r1.mo104535k(r8, r7, r5)
        L_0x059f:
            r1.f220630H = r5
            r1.f220624B = r5
            r1.f220638Q = r5
            r1.f220643T = r5
            r1.f220642S = r11
            r1.f220645V = r5
            r7 = 0
            r1.f220657p0 = r7
            r1.f220646W = r7
            goto L_0x0603
        L_0x05b2:
            boolean r7 = r1.f220638Q
            if (r7 != 0) goto L_0x0603
            int r7 = r0.getPointerId(r5)
            r1.f220642S = r7
            r21.mo104530f()
            r1.f220624B = r5
            float r7 = r0.getY(r5)
            r1.f220661t = r7
            r1.f220629G = r7
            r0.getX(r5)
            android.graphics.Rect r7 = r1.f220663v
            r7.setEmpty()
            float r7 = r0.getY(r5)
            r1.f220625C = r7
            float r7 = r0.getX(r5)
            r1.f220626D = r7
            r1.f220635M = r9
            boolean r7 = r1.f220648e
            if (r7 == 0) goto L_0x05ed
            boolean r7 = r1.f220631I
            if (r7 != 0) goto L_0x05ed
            float r7 = r21.getTranslationY()
            r1.f220635M = r7
        L_0x05ed:
            float r7 = r1.f220635M
            int r7 = (int) r7
            r1.f220643T = r7
            r1.f220638Q = r6
            r1.f220645V = r5
            long r7 = java.lang.System.currentTimeMillis()
            r1.f220646W = r7
            r7 = 0
            r1.f220657p0 = r7
            r21.mo104533i()
        L_0x0603:
            r7 = 0
        L_0x0604:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r8[r5] = r9
            java.lang.String r9 = "consumed: %b"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r9, r8)
            if (r7 == 0) goto L_0x0616
            r0.setAction(r10)
        L_0x0616:
            boolean r8 = r1.f220631I
            if (r8 != 0) goto L_0x061f
            boolean r8 = r1.f220648e
            if (r8 == 0) goto L_0x061f
            r7 = 1
        L_0x061f:
            if (r7 == 0) goto L_0x0622
            return r6
        L_0x0622:
            boolean r0 = super.onTouchEvent(r22)     // Catch:{ Exception -> 0x0659 }
            java.lang.String r8 = "super.onTouchEvent(): %b"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0659 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0659 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0659 }
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r8, r9)     // Catch:{ Exception -> 0x0659 }
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r8 = r1.f220667y     // Catch:{ Exception -> 0x0659 }
            if (r8 == 0) goto L_0x0658
            int r8 = r21.getChildCount()     // Catch:{ Exception -> 0x0659 }
            if (r8 <= 0) goto L_0x0658
            android.view.View r8 = r1.getChildAt(r5)     // Catch:{ Exception -> 0x0659 }
            int r8 = r8.getTop()     // Catch:{ Exception -> 0x0659 }
            java.lang.String r9 = "scrolled %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0659 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0659 }
            r10[r5] = r11     // Catch:{ Exception -> 0x0659 }
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r4, r9, r10)     // Catch:{ Exception -> 0x0659 }
            com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback r9 = r1.f220667y     // Catch:{ Exception -> 0x0659 }
            r9.mo96597i(r8)     // Catch:{ Exception -> 0x0659 }
        L_0x0658:
            return r0
        L_0x0659:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2[r5] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "%b, %d"
            com.tencent.p014mm.p136ui.C85975v4.m106307d(r4, r0, r3, r2)
            return r6
        L_0x066e:
            boolean r0 = super.onTouchEvent(r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.listview.PullDownListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo104547p() {
        setSelectionFromTop(0, 0);
        C85975v4.m106306c("MicroMsg.PullDownListView", "switchPullDownStatus", new Object[0]);
        if (!this.f220631I) {
            return;
        }
        if (this.f220648e) {
            mo104535k(mo104531g() + 1, this.f220669z, false);
            return;
        }
        mo104535k(mo104531g() + 1, this.f220660s.getBottom() + this.f220665x, false);
    }

    public void setMuteView(View view) {
        if (view != null) {
            post(new C74992a(view));
        } else {
            this.f220655o = 0.0f;
            this.f220656p = 0.0f;
        }
        this.f220662u = view;
    }

    public void setNavigationBarHeight(int i) {
        C85975v4.m106306c("MicroMsg.PullDownListView", "setNavigationBarHeight=%s", Integer.valueOf(i));
        this.f220665x = i;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f220668y0 = onItemClickListener;
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f220639Q0 = onItemLongClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f220641R0 = onItemSelectedListener;
    }

    public void setSupportOverscroll(boolean z) {
        this.f220647d = z;
    }

    public void setTabView(View view) {
        this.f220627E = view;
    }

    public void setTranslationListener(C74996e eVar) {
        this.f220666x0 = eVar;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C74996e eVar = this.f220666x0;
        if (eVar != null) {
            eVar.mo96754a(f);
        }
    }
}
