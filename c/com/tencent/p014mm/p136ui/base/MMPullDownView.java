package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.base.MMPullDownView */
public class MMPullDownView extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: S */
    public static final int f214851S = Color.parseColor("#00000000");

    /* renamed from: A */
    public View f214852A;

    /* renamed from: B */
    public int f214853B;

    /* renamed from: C */
    public int f214854C;

    /* renamed from: D */
    public int f214855D;

    /* renamed from: E */
    public boolean f214856E;

    /* renamed from: F */
    public boolean f214857F;

    /* renamed from: G */
    public boolean f214858G;

    /* renamed from: H */
    public boolean f214859H;

    /* renamed from: I */
    public boolean f214860I;

    /* renamed from: J */
    public C44709b f214861J;

    /* renamed from: K */
    public boolean f214862K;

    /* renamed from: L */
    public int f214863L;

    /* renamed from: M */
    public int f214864M;

    /* renamed from: N */
    public MMHandler f214865N;

    /* renamed from: P */
    public boolean f214866P;

    /* renamed from: Q */
    public int f214867Q;

    /* renamed from: R */
    public C44710c f214868R;

    /* renamed from: d */
    public Scroller f214869d;

    /* renamed from: e */
    public int f214870e;

    /* renamed from: f */
    public int f214871f;

    /* renamed from: g */
    public C73180h f214872g;

    /* renamed from: h */
    public C73179f f214873h;

    /* renamed from: i */
    public int f214874i;

    /* renamed from: j */
    public int f214875j;

    /* renamed from: n */
    public boolean f214876n;

    /* renamed from: o */
    public boolean f214877o;

    /* renamed from: p */
    public boolean f214878p;

    /* renamed from: q */
    public boolean f214879q;

    /* renamed from: r */
    public boolean f214880r;

    /* renamed from: s */
    public boolean f214881s;

    /* renamed from: t */
    public boolean f214882t;

    /* renamed from: u */
    public boolean f214883u;

    /* renamed from: v */
    public GestureDetector f214884v;

    /* renamed from: w */
    public C73177d f214885w;

    /* renamed from: x */
    public C73178e f214886x;

    /* renamed from: y */
    public Context f214887y;

    /* renamed from: z */
    public View f214888z;

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$b */
    public interface C44709b {
        /* renamed from: a */
        boolean mo64359a(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$c */
    public interface C44710c {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$g */
    public interface C44711g {
        /* renamed from: a */
        void mo69908a();

        /* renamed from: b */
        void mo69909b(float f);
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$a */
    public class C73176a extends MMHandler {
        public C73176a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            MMPullDownView mMPullDownView = MMPullDownView.this;
            int i = mMPullDownView.f214853B;
            if (i == 0) {
                C73180h hVar = mMPullDownView.f214872g;
                if (hVar != null) {
                    mMPullDownView.f214880r = hVar.mo96020a();
                }
                MMPullDownView mMPullDownView2 = MMPullDownView.this;
                if (mMPullDownView2.f214880r && mMPullDownView2.f214888z.getVisibility() == 0) {
                    MMPullDownView mMPullDownView3 = MMPullDownView.this;
                    mMPullDownView3.scrollTo(0, mMPullDownView3.f214874i);
                }
            } else if (i == 1) {
                C73179f fVar = mMPullDownView.f214873h;
                if (fVar != null) {
                    mMPullDownView.f214880r = fVar.mo64409C7();
                }
                MMPullDownView mMPullDownView4 = MMPullDownView.this;
                if (mMPullDownView4.f214880r && mMPullDownView4.f214852A.getVisibility() == 0) {
                    MMPullDownView mMPullDownView5 = MMPullDownView.this;
                    mMPullDownView5.scrollTo(0, mMPullDownView5.f214874i);
                }
            }
            Log.m105925i("MicroMsg.MMPullDownView", "updateDelayHandler handleMessage loadDataType[%d] loadDataEnd[%b]", Integer.valueOf(MMPullDownView.this.f214853B), Boolean.valueOf(MMPullDownView.this.f214880r));
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$d */
    public interface C73177d {
        /* renamed from: q0 */
        boolean mo64384q0();
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$e */
    public interface C73178e {
        /* renamed from: b0 */
        boolean mo64386b0();
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$f */
    public interface C73179f {
        /* renamed from: C7 */
        boolean mo64409C7();
    }

    /* renamed from: com.tencent.mm.ui.base.MMPullDownView$h */
    public interface C73180h {
        /* renamed from: a */
        boolean mo96020a();
    }

    public MMPullDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private void m86156g() {
        if (getScrollY() - this.f214874i < 0) {
            if (this.f214882t) {
                this.f214869d.startScroll(0, getScrollY(), 0, this.f214874i + (-getScrollY()), 200);
            } else if (!this.f214862K) {
                if (this.f214888z.getVisibility() == 4) {
                    this.f214869d.startScroll(0, getScrollY(), 0, this.f214874i + (-getScrollY()), 200);
                }
                if (this.f214888z.getVisibility() == 0) {
                    this.f214869d.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
                }
                this.f214853B = 0;
                this.f214879q = true;
                this.f214880r = false;
            }
            postInvalidate();
        }
        if (getScrollY() > this.f214875j) {
            if (this.f214883u) {
                this.f214869d.startScroll(0, getScrollY(), 0, this.f214875j - getScrollY(), 200);
            } else {
                if (this.f214852A.getVisibility() == 4) {
                    this.f214869d.startScroll(0, getScrollY(), 0, this.f214875j - getScrollY(), 200);
                }
                if (this.f214852A.getVisibility() == 0) {
                    this.f214869d.startScroll(0, getScrollY(), 0, (this.f214875j - getScrollY()) + this.f214875j, 200);
                }
                this.f214853B = 1;
                this.f214879q = true;
                this.f214880r = false;
            }
            postInvalidate();
        }
        this.f214878p = false;
    }

    /* renamed from: b */
    public final void mo101738b(ViewGroup viewGroup, int i) {
        Log.m105924i("MicroMsg.MMPullDownView", "fix android O progress bar bug. visibility=" + i);
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            if (viewGroup.getTag() == null) {
                viewGroup.setTag(viewGroup.findViewById(C0966R.C0970id.b7_));
            }
            View view = (View) viewGroup.getTag();
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: c */
    public void mo101739c(boolean z) {
        Log.m105925i("MicroMsg.MMPullDownView", "forceBottomLoadData start[%b] loadDataBegin[%b] loadDataEnd[%b], isBottomShowAll[%b], getScrollY[%d]", Boolean.valueOf(z), Boolean.valueOf(this.f214879q), Boolean.valueOf(this.f214880r), Boolean.valueOf(this.f214883u), Integer.valueOf(getScrollY()));
        if (z) {
            View view = this.f214852A;
            if (view != null) {
                int i = this.f214855D;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f214883u) {
                this.f214869d.startScroll(0, getScrollY(), 0, this.f214875j - getScrollY(), 200);
            } else {
                View view3 = this.f214852A;
                if (view3 != null && view3.getVisibility() == 4) {
                    this.f214869d.startScroll(0, getScrollY(), 0, this.f214875j - getScrollY(), 200);
                }
                View view4 = this.f214852A;
                if (view4 != null && view4.getVisibility() == 0) {
                    this.f214869d.startScroll(0, getScrollY(), 0, (this.f214875j - getScrollY()) + this.f214875j, 200);
                }
                this.f214853B = 1;
                this.f214879q = true;
                this.f214880r = false;
            }
            postInvalidate();
            return;
        }
        if (!this.f214880r) {
            this.f214880r = true;
            this.f214879q = false;
        }
        View view5 = this.f214852A;
        if (view5 != null && view5.getVisibility() == 0) {
            Log.m105924i("MicroMsg.MMPullDownView", "forceBottomLoadData false bottomView VISIBLE scroll to 0");
            scrollTo(0, this.f214874i);
        }
        View view6 = this.f214852A;
        if (view6 != null && view6.getVisibility() == 0) {
            View view7 = this.f214852A;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void computeScroll() {
        if (this.f214869d.computeScrollOffset()) {
            scrollTo(this.f214869d.getCurrX(), this.f214869d.getCurrY());
            postInvalidate();
        } else if (this.f214879q) {
            Log.m105924i("MicroMsg.MMPullDownView", "computeScroll loadDataBegin true UPDATE_DELAY");
            this.f214879q = false;
            this.f214865N.sendEmptyMessageDelayed(0, (long) 400);
            mo101738b((ViewGroup) this.f214888z, 0);
            mo101738b((ViewGroup) this.f214852A, 0);
        }
        this.f214869d.isFinished();
    }

    /* renamed from: d */
    public void mo101741d(boolean z) {
        mo101743e(z, 200);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!this.f214858G) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f214880r) {
            return true;
        }
        C73178e eVar = this.f214886x;
        if (eVar == null) {
            this.f214876n = false;
        } else {
            this.f214876n = eVar.mo64386b0();
        }
        C73177d dVar = this.f214885w;
        if (dVar == null) {
            this.f214877o = false;
        } else {
            this.f214877o = dVar.mo64384q0();
        }
        if (this.f214855D == 0) {
            if (this.f214882t) {
                View view = this.f214888z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view2 = this.f214888z;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f214854C == 0) {
            if (this.f214883u) {
                View view4 = this.f214852A;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view6 = this.f214852A;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (motionEvent.getAction() == 1) {
            m86156g();
            return super.dispatchTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 3) {
            m86156g();
            if (this.f214860I) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        } else {
            GestureDetector gestureDetector = this.f214884v;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(motionEvent2);
            C117292a.m165358d(gestureDetector, aVar5.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar5.mo10231a(0));
            C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (onTouchEvent) {
                motionEvent2.setAction(3);
                return super.dispatchTouchEvent(motionEvent);
            }
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMPullDownView", e, "", new Object[0]);
                return true;
            }
        }
    }

    /* renamed from: e */
    public void mo101743e(boolean z, int i) {
        Log.m105925i("MicroMsg.MMPullDownView", "forceTopLoadData start[%b] loadDataBegin[%b], loadDataEnd[%b], isTopShowAll[%b], getScrollY[%d]", Boolean.valueOf(z), Boolean.valueOf(this.f214879q), Boolean.valueOf(this.f214880r), Boolean.valueOf(this.f214882t), Integer.valueOf(getScrollY()));
        if (z) {
            View view = this.f214888z;
            if (view != null) {
                int i2 = this.f214855D;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f214882t) {
                this.f214869d.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f214874i, i);
            } else {
                View view3 = this.f214888z;
                if (view3 != null && view3.getVisibility() == 4) {
                    this.f214869d.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f214874i, i);
                }
                View view4 = this.f214888z;
                if (view4 != null && view4.getVisibility() == 0) {
                    this.f214869d.startScroll(0, getScrollY(), 0, -getScrollY(), i);
                }
                this.f214853B = 0;
                this.f214879q = true;
                this.f214880r = false;
            }
            postInvalidate();
        } else {
            if (!this.f214880r) {
                this.f214880r = true;
                this.f214879q = false;
                View view5 = this.f214888z;
                if (view5 != null && view5.getVisibility() == 0) {
                    scrollTo(0, this.f214874i);
                }
            }
            View view6 = this.f214888z;
            if (view6 != null && view6.getVisibility() == 0) {
                View view7 = this.f214888z;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!this.f214882t) {
            mo101738b((ViewGroup) this.f214888z, 0);
            mo101738b((ViewGroup) this.f214852A, 0);
        }
    }

    /* renamed from: f */
    public void mo94704f() {
        View inflate = View.inflate(this.f214887y, C0966R.C0971layout.f359862b81, (ViewGroup) null);
        View inflate2 = View.inflate(this.f214887y, C0966R.C0971layout.f359862b81, (ViewGroup) null);
        addView(inflate, 0, new FrameLayout.LayoutParams(-1, -2));
        addView(inflate2, new FrameLayout.LayoutParams(-1, -2));
    }

    public int getBottomHeight() {
        return this.f214875j;
    }

    public int getCurScreen() {
        return this.f214870e;
    }

    public boolean getIsTopShowAll() {
        return this.f214882t;
    }

    public int getTopHeight() {
        return this.f214874i;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.f214869d.isFinished()) {
            return false;
        }
        this.f214869d.abortAnimation();
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Log.m105927v("MicroMsg.MMPullDownView", "on fling, velocityX %f velocityY %f", Float.valueOf(f), Float.valueOf(f2));
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C44709b bVar = this.f214861J;
        if (bVar != null) {
            bVar.mo64359a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.MMPullDownView", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                try {
                    childAt.layout(0, i5, childAt.getMeasuredWidth(), i5 + measuredHeight);
                } catch (ArrayIndexOutOfBoundsException e) {
                    Log.printErrStackTrace("MicroMsg.MMPullDownView", e, "childCount: %d, i:%d, childHeight:%d", Integer.valueOf(childCount), Integer.valueOf(i6), Integer.valueOf(measuredHeight));
                }
                i5 += measuredHeight;
            }
        }
        this.f214888z = getChildAt(0);
        this.f214852A = getChildAt(getChildCount() - 1);
        View view = this.f214888z;
        int i7 = this.f214855D;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i7));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f214852A;
        int i8 = this.f214854C;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i8));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f214874i = this.f214888z.getHeight();
        this.f214875j = this.f214852A.getHeight();
        int i9 = this.f214874i;
        this.f214867Q = i9;
        if (!this.f214881s && i9 != 0) {
            this.f214881s = true;
            scrollTo(0, i9);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public void onMeasure(int i, int i2) {
        if (!this.f214856E) {
            mo94704f();
            this.f214856E = true;
        }
        super.onMeasure(i, i2);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            this.f214878p = true;
        } else {
            this.f214878p = false;
        }
        boolean z = Math.abs(f2) > Math.abs(f);
        int i3 = -1;
        if (!this.f214877o || ((!this.f214878p && getScrollY() - this.f214874i <= 0) || !z)) {
            if (!this.f214876n || ((this.f214878p && getScrollY() - this.f214874i >= 0) || !z)) {
                return false;
            }
            if (!this.f214857F && (this.f214888z.getVisibility() != 0 || (!this.f214878p && getScrollY() <= 0))) {
                return !this.f214859H;
            }
            int i4 = (int) (((double) f2) * 0.5d);
            if (i4 == 0) {
                if (i2 > 0) {
                    i3 = 1;
                }
                i4 = i3;
            }
            int scrollY = getScrollY() + i4;
            int i5 = this.f214874i;
            if (scrollY > i5) {
                i4 = i5 - getScrollY();
            } else if (!this.f214857F && getScrollY() + i4 < 0) {
                i4 = -getScrollY();
            }
            scrollBy(0, i4);
            return true;
        } else if (!this.f214857F && (this.f214852A.getVisibility() != 0 || (this.f214878p && getScrollY() >= this.f214874i * 2))) {
            return !this.f214859H;
        } else {
            int i6 = (int) (((double) f2) * 0.5d);
            if (i6 == 0) {
                if (i2 > 0) {
                    i3 = 1;
                }
                i6 = i3;
            }
            Log.m105926v("check", "moveUp:" + i6 + " distanceY:" + f2 + " scrollY:" + getScrollY());
            int scrollY2 = getScrollY() + i6;
            int i7 = this.f214874i;
            if (scrollY2 >= i7 || this.f214878p) {
                if (!this.f214857F) {
                    int scrollY3 = getScrollY() + i6;
                    int i8 = this.f214874i;
                    if (scrollY3 >= i8 * 2) {
                        i7 = i8 * 2;
                        i = getScrollY();
                    }
                }
                scrollBy(0, i6);
                return true;
            }
            i = getScrollY();
            i6 = i7 - i;
            scrollBy(0, i6);
            return true;
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        C44710c cVar = this.f214868R;
        if (cVar != null) {
            cVar.onScrollChanged(i, i2, i3, i4);
        }
        if (this.f214866P) {
            if (this.f214867Q == Integer.MIN_VALUE) {
                this.f214867Q = this.f214874i;
                Log.m105918d("MicroMsg.MMPullDownView", "onScrollChanged static y:" + this.f214867Q);
            }
            int i6 = this.f214867Q;
            if (i2 <= i6 && this.f214864M != (i5 = f214851S)) {
                setBackgroundResource(C0966R.C0969drawable.ags);
                this.f214864M = i5;
                Log.m105918d("MicroMsg.MMPullDownView", "onScrollChanged full");
            } else if (i2 > i6 && this.f214864M != this.f214863L) {
                Log.m105918d("MicroMsg.MMPullDownView", "onScrollChanged white");
                setBackgroundColor(this.f214863L);
                this.f214864M = this.f214863L;
            }
        }
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (getScrollY() - this.f214874i < 0) {
                this.f214876n = true;
            }
            if (getScrollY() > this.f214875j) {
                this.f214877o = true;
            }
            m86156g();
        }
        return true;
    }

    public void setAtBottomCallBack(C73177d dVar) {
        this.f214885w = dVar;
    }

    public void setAtTopCallBack(C73178e eVar) {
        this.f214886x = eVar;
    }

    public void setBgColor(int i) {
        this.f214863L = i;
        this.f214864M = i;
    }

    public void setBottomView(View view) {
        if (view == null) {
            this.f214854C = 4;
            View view2 = this.f214852A;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        this.f214852A = view;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f214854C = 0;
        removeViewAt(getChildCount() - 1);
        addView(this.f214852A, new FrameLayout.LayoutParams(-1, -2));
        this.f214875j = 0;
    }

    public void setBottomViewVisible(boolean z) {
        int i = z ? 0 : 4;
        this.f214854C = i;
        View view = this.f214852A;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Log.m105925i("MicroMsg.MMPullDownView", "setBottomViewVisible visible[%b], stack[%s]", Boolean.valueOf(z), Util.getStack());
    }

    public void setCanOverScrool(boolean z) {
        this.f214857F = z;
    }

    public void setEnableGesture(boolean z) {
        this.f214858G = z;
    }

    public void setIsBottomShowAll(boolean z) {
        Log.m105925i("MicroMsg.MMPullDownView", "setIsBottomShowAll showAll[%b], isBottomShowAll[%b], stack[%s]", Boolean.valueOf(z), Boolean.valueOf(this.f214883u), Util.getStack());
        this.f214883u = z;
    }

    public void setIsIgnoreActionUpForceTopLoad(boolean z) {
        this.f214862K = z;
    }

    public void setIsReturnSuperDispatchWhenCancel(boolean z) {
        this.f214860I = z;
    }

    public void setIsTopShowAll(boolean z) {
        Log.m105925i("MicroMsg.MMPullDownView", "setIsTopShowAll showAll[%b], isTopShowAll[%b], stack[%s]", Boolean.valueOf(z), Boolean.valueOf(this.f214882t), Util.getStack());
        this.f214882t = z;
    }

    public void setNestedOverScrollEnabled(boolean z) {
        this.f214859H = z;
    }

    public void setOnBottomLoadDataListener(C73179f fVar) {
        this.f214873h = fVar;
    }

    public void setOnInterceptTouchEventListener(C44709b bVar) {
        this.f214861J = bVar;
    }

    public void setOnScrollChangedListener(C44710c cVar) {
        this.f214868R = cVar;
    }

    public void setOnSrcollDistance(C44711g gVar) {
    }

    public void setOnTopLoadDataListener(C73180h hVar) {
        this.f214872g = hVar;
    }

    public void setShowBackground(boolean z) {
        this.f214866P = z;
    }

    public void setTopView(View view) {
        if (view == null) {
            this.f214855D = 4;
            View view2 = this.f214888z;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        removeViewAt(0);
        this.f214888z = view;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f214855D = 0;
        addView(this.f214888z, 0, new FrameLayout.LayoutParams(-1, -2));
        this.f214874i = 0;
    }

    public void setTopViewVisible(boolean z) {
        int i = z ? 0 : 4;
        this.f214855D = i;
        View view = this.f214888z;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Log.m105925i("MicroMsg.MMPullDownView", "setTopViewVisible visible[%b]", Boolean.valueOf(z));
    }

    public MMPullDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214871f = 1;
        this.f214876n = false;
        this.f214877o = false;
        this.f214878p = false;
        this.f214879q = false;
        this.f214880r = true;
        this.f214881s = false;
        this.f214882t = true;
        this.f214883u = true;
        this.f214854C = 4;
        this.f214855D = 4;
        this.f214856E = false;
        this.f214857F = true;
        this.f214858G = true;
        this.f214859H = false;
        this.f214860I = false;
        this.f214862K = false;
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.al6);
        this.f214863L = color;
        this.f214864M = color;
        this.f214865N = new C73176a();
        this.f214866P = false;
        this.f214867Q = Integer.MIN_VALUE;
        this.f214869d = new Scroller(context, new AccelerateInterpolator());
        this.f214870e = this.f214871f;
        this.f214884v = new GestureDetector(context, this);
        this.f214887y = context;
        int color2 = context.getResources().getColor(C0966R.color.al6);
        this.f214863L = color2;
        this.f214864M = color2;
    }
}
