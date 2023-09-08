package de1;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import oq3.C21802a;
import p282z2.C16095a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;
import zh0.C16195a;

/* renamed from: de1.u */
public final class C7292u extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final C13601g f25390d;

    /* renamed from: e */
    public final View f25391e;

    /* renamed from: f */
    public View f25392f;

    /* renamed from: g */
    public View f25393g;

    /* renamed from: h */
    public int f25394h;

    /* renamed from: de1.u$a */
    public static final class C7293a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7292u f25395d;

        /* renamed from: de1.u$a$a */
        public static final class C7294a implements C21802a {

            /* renamed from: a */
            public final /* synthetic */ C7295b f25396a;

            public C7294a(C7295b bVar) {
                this.f25396a = bVar;
            }

            /* renamed from: a */
            public void mo8478a(int i, int i2) {
                this.f25396a.mo3719v(i, i2, 0, true, true);
            }

            /* renamed from: b */
            public void mo8479b() {
                this.f25396a.getClass();
            }
        }

        /* renamed from: de1.u$a$b */
        public static final class C7295b implements HeadFooterLayout.C57874a {

            /* renamed from: d */
            public final /* synthetic */ C7292u f25397d;

            public C7295b(C7292u uVar) {
                this.f25397d = uVar;
            }

            /* renamed from: p */
            public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
                return false;
            }

            /* renamed from: v */
            public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
                if (i2 >= 0) {
                    return false;
                }
                C7292u uVar = this.f25397d;
                if (uVar.f25394h != 0) {
                    return false;
                }
                uVar.f25394h = 1;
                C39818r rVar = C39818r.f106831a;
                Context context = uVar.getContentView().getContext();
                C87412m.m108593f(context, "contentView.context");
                C16195a aVar = (C16195a) rVar.mo62443b(context).mo62448d(C16195a.class);
                if (aVar == null) {
                    return false;
                }
                aVar.dismiss();
                return false;
            }

            /* renamed from: x */
            public void mo3720x(int i) {
            }
        }

        public C7293a(C7292u uVar) {
            this.f25395d = uVar;
        }

        public final void run() {
            C7292u uVar = this.f25395d;
            HeadFooterLayout a = uVar.mo8463a(uVar);
            C7292u uVar2 = this.f25395d;
            WxRefreshLayout b = uVar2.mo8464b(uVar2);
            if (a != null || b != null) {
                C21802a aVar = null;
                if ((a != null ? a.getOverCallback() : null) == null) {
                    if (b != null) {
                        aVar = b.getOverScrollCallback();
                    }
                    if (aVar == null) {
                        C7295b bVar = new C7295b(this.f25395d);
                        if (b != null) {
                            b.setOverScrollCallback(new C7294a(bVar));
                        }
                        if (a != null) {
                            a.setOverCallback(bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: de1.u$b */
    public static final class C7296b extends View {
        public C7296b(Context context) {
            super(context);
        }

        public void setAlpha(float f) {
            super.setAlpha(Math.min(0.8f, f));
        }
    }

    /* renamed from: de1.u$c */
    public static final class C7297c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Context f25398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7297c(Context context) {
            super(0);
            this.f25398d = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (((android.app.Activity) r0).getIntent().getBooleanExtra("key_intent_enable_drag_exit", true) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                up1.f r0 = up1.C37521f.f99374d
                r0.getClass()
                pe1.c<java.lang.Integer> r0 = up1.C37521f.f99261Q0
                java.lang.Object r0 = r0.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r1 = 1
                if (r0 != r1) goto L_0x002a
                android.content.Context r0 = r3.f25398d
                java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r0, r2)
                android.app.Activity r0 = (android.app.Activity) r0
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "key_intent_enable_drag_exit"
                boolean r0 = r0.getBooleanExtra(r2, r1)
                if (r0 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r1 = 0
            L_0x002b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C7292u.C7297c.invoke():java.lang.Object");
        }
    }

    /* renamed from: de1.u$d */
    public static final class C7298d extends C87413o implements C32224a<GestureDetector> {

        /* renamed from: d */
        public final /* synthetic */ Context f25399d;

        /* renamed from: e */
        public final /* synthetic */ C7292u f25400e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7298d(Context context, C7292u uVar) {
            super(0);
            this.f25399d = context;
            this.f25400e = uVar;
        }

        public Object invoke() {
            return new GestureDetector(this.f25399d, this.f25400e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7292u(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setBackgroundColor(0);
        this.f25390d = C36568h.m40985a(new C7298d(context, this));
        C7296b bVar = new C7296b(context);
        bVar.setBackgroundColor(-16777216);
        bVar.setAlpha(0.0f);
        addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        this.f25391e = bVar;
        C13601g a = C36568h.m40985a(new C7297c(context));
        setTag("GestureFrameLayout");
        if (((Boolean) a.getValue()).booleanValue()) {
            post(new C7293a(this));
        }
    }

    private final GestureDetector getTouchDetector() {
        return (GestureDetector) ((C36570n) this.f25390d).getValue();
    }

    /* renamed from: a */
    public final HeadFooterLayout mo8463a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C87412m.m108593f(childAt, "getChildAt(index)");
            if ((childAt instanceof ViewGroup) && !(childAt instanceof HeadFooterLayout)) {
                HeadFooterLayout a = mo8463a((ViewGroup) childAt);
                if (a != null) {
                    return a;
                }
            } else if (childAt instanceof HeadFooterLayout) {
                HeadFooterLayout headFooterLayout = (HeadFooterLayout) childAt;
                if (viewGroup.getHeight() <= headFooterLayout.getHeight()) {
                    return headFooterLayout;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final WxRefreshLayout mo8464b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C87412m.m108593f(childAt, "getChildAt(index)");
            if ((childAt instanceof ViewGroup) && !(childAt instanceof WxRefreshLayout)) {
                WxRefreshLayout b = mo8464b((ViewGroup) childAt);
                if (b != null) {
                    return b;
                }
            } else if (childAt instanceof WxRefreshLayout) {
                WxRefreshLayout wxRefreshLayout = (WxRefreshLayout) childAt;
                if (viewGroup.getHeight() <= wxRefreshLayout.getHeight()) {
                    return wxRefreshLayout;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        int i = this.f25394h;
        if (i == -1) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f25394h = 0;
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (i == 0) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            if (i == 1) {
                if (motionEvent.getRawY() >= ((float) ((getContext().getResources().getDisplayMetrics().heightPixels * 3) / 4))) {
                    this.f25394h = -1;
                    return super.dispatchTouchEvent(motionEvent);
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.dispatchTouchEvent(obtain);
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.setAction(0);
                GestureDetector touchDetector = getTouchDetector();
                C9556a aVar = new C9556a();
                aVar.mo10233c(obtain2);
                GestureDetector gestureDetector = touchDetector;
                C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                C117292a.m165360f(gestureDetector, touchDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                this.f25394h = 2;
            }
            GestureDetector touchDetector2 = getTouchDetector();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = touchDetector2;
            C117292a.m165358d(gestureDetector2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector2, touchDetector2.onTouchEvent((MotionEvent) aVar2.mo10231a(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                return true;
            }
            this.f25394h = 0;
            float a = C16095a.m14979a(1.0f - ((getContentView().getTranslationY() * 1.0f) / ((float) getContentView().getHeight())), 0.0f, 1.0f);
            Log.m105924i("GestureFrameLayout", "[onTouchCancel] scale=" + a);
            if (a > 0.8f) {
                View contentView = getContentView();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                View view = contentView;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", C90259e.C90261b.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                contentView.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", C90259e.C90261b.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                getContentView().animate().setListener((Animator.AnimatorListener) null).setUpdateListener(new C7299v(this)).translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(280).start();
                HeadFooterLayout a2 = mo8463a(this);
                if (a2 == null) {
                    return true;
                }
                a2.setTranslationY(0.0f);
                return true;
            }
            Context context = getContentView().getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
            return true;
        }
    }

    public final View getBgView() {
        return this.f25391e;
    }

    public final View getContentView() {
        View view = this.f25392f;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    public final View getSourceView() {
        return this.f25393g;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7267b.f25328d.getClass();
        View contentView = getContentView();
        contentView.setTranslationY(contentView.getTranslationY() - f2);
        View contentView2 = getContentView();
        contentView2.setTranslationX(contentView2.getTranslationX() - f);
        float a = C16095a.m14979a(1.0f - ((getContentView().getTranslationY() * 1.0f) / ((float) getContentView().getHeight())), 0.0f, 1.0f);
        View view = this.f25391e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(a));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getContentView().setScaleX(a);
        getContentView().setScaleY(a);
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f25392f = view;
    }

    public final void setSourceView(View view) {
        this.f25393g = view;
    }
}
