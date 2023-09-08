package il1;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54405b;
import b50.C54412f;
import cj1.C54763g6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56057d0;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptMakeupView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;
import p849e3.C58521d;
import rx3.C13598b0;
import s50.C110747k;
import s50.C63699b;
import s50.C63711n;
import sn0.C90259e;
import w50.C65933h;

/* renamed from: il1.o1 */
public final class C60466o1 {

    /* renamed from: a */
    public final RelativeLayout f172379a;

    /* renamed from: b */
    public final List<C65933h.C65935b> f172380b;

    /* renamed from: c */
    public FinderLiveCameraOptMakeupView f172381c;

    /* renamed from: d */
    public C32224a<C13598b0> f172382d;

    /* renamed from: e */
    public final C58521d f172383e;

    /* renamed from: il1.o1$a */
    public static final class C60467a extends C87413o implements C32227p<C65933h.C65935b, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60467a(C60466o1 o1Var) {
            super(2);
            this.f172384d = o1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((C65933h.C65935b) obj, "m");
            C60466o1.m70704a(this.f172384d);
            C54405b.C54406a.m61097a(this.f172384d.mo85429b(), intValue, false, false, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.o1$b */
    public static final class C60468b extends C87413o implements C32227p<C65933h.C65935b, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60468b(C60466o1 o1Var) {
            super(2);
            this.f172385d = o1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C65933h.C65935b bVar = (C65933h.C65935b) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(bVar, "m");
            C54763g6.f153485a.mo75668e(bVar.f189556a, 2, intValue);
            C60466o1.m70704a(this.f172385d);
            C54405b.C54406a.m61097a(this.f172385d.mo85429b(), intValue, false, false, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.o1$c */
    public static final class C60469c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172386d;

        public C60469c(C60466o1 o1Var) {
            this.f172386d = o1Var;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            float x = motionEvent.getX() - motionEvent2.getX();
            float x2 = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(f) > 0.0f) {
                boolean z = true;
                if (x > 50.0f) {
                    this.f172386d.f172381c.mo77881j();
                } else if (x2 > 50.0f) {
                    this.f172386d.f172381c.mo77880i();
                } else {
                    z = false;
                }
                if (z) {
                    FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView = this.f172386d.f172381c;
                    RecyclerView recyclerView = finderLiveCameraOptMakeupView.f159671C;
                    if (recyclerView != null) {
                        recyclerView.postDelayed(new C56057d0(finderLiveCameraOptMakeupView), 100);
                    } else {
                        C87412m.m108603p("rv");
                        throw null;
                    }
                }
            }
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            if (motionEvent.getY() < ((float) C61926c.m72690o(this.f172386d.f172381c.getBar1())[1])) {
                this.f172386d.f172381c.mo77879h();
                this.f172386d.mo85430c(true);
                C32224a<C13598b0> aVar = this.f172386d.f172382d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$12", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: il1.o1$d */
    public static final class C60470d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172387d;

        public C60470d(C60466o1 o1Var) {
            this.f172387d = o1Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f172387d.f172383e.mo83434a(motionEvent);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: il1.o1$e */
    public static final class C60471e implements View.OnClickListener {

        /* renamed from: d */
        public static final C60471e f172388d = new C60471e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.o1$f */
    public static final class C60472f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172389d;

        public C60472f(C60466o1 o1Var) {
            this.f172389d = o1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f172389d.f172382d;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptMakeupWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.o1$g */
    public static final class C60473g extends C87413o implements C32227p<Integer, Integer, Integer> {

        /* renamed from: d */
        public static final C60473g f172390d = new C60473g();

        public C60473g() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            int intValue = ((Number) obj2).intValue();
            C54763g6 g6Var = C54763g6.f153485a;
            return Integer.valueOf(intValue == 1 ? 70 : 60);
        }
    }

    /* renamed from: il1.o1$h */
    public static final class C60474h extends C87413o implements C32226l<C65933h.C65935b, Integer> {

        /* renamed from: d */
        public static final C60474h f172391d = new C60474h();

        public C60474h() {
            super(1);
        }

        public Object invoke(Object obj) {
            C65933h.C65935b bVar = (C65933h.C65935b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(C54763g6.f153485a.mo75666c(bVar.f189556a, 1));
        }
    }

    /* renamed from: il1.o1$i */
    public static final class C60475i extends C87413o implements C32226l<C65933h.C65935b, Integer> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60475i(C60466o1 o1Var) {
            super(1);
            this.f172392d = o1Var;
        }

        public Object invoke(Object obj) {
            C65933h.C65935b bVar = (C65933h.C65935b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            boolean z = true;
            int i = 0;
            if (!this.f172392d.mo85429b().f152611f) {
                z = false;
            }
            if (!z) {
                i = C54763g6.f153485a.mo75666c(bVar.f189556a, 2);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: il1.o1$j */
    public static final class C60476j extends C87413o implements C32226l<C65933h.C65935b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60476j(C60466o1 o1Var) {
            super(1);
            this.f172393d = o1Var;
        }

        public Object invoke(Object obj) {
            C65933h.C65935b bVar = (C65933h.C65935b) obj;
            C87412m.m108594g(bVar, "m");
            C60466o1.m70704a(this.f172393d);
            C54763g6 g6Var = C54763g6.f153485a;
            g6Var.mo75667d(bVar.f189556a);
            this.f172393d.mo85429b().mo75225h(bVar.f189559d, bVar.f189560e);
            this.f172393d.mo85429b().mo75224g(g6Var.mo75666c(bVar.f189556a, 1));
            C54405b.C54406a.m61097a(this.f172393d.mo85429b(), g6Var.mo75666c(bVar.f189556a, 2), false, false, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.o1$k */
    public static final class C60477k extends C87413o implements C32227p<C65933h.C65935b, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60477k(C60466o1 o1Var) {
            super(2);
            this.f172394d = o1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((C65933h.C65935b) obj, "m");
            this.f172394d.mo85429b().mo75224g(intValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.o1$l */
    public static final class C60478l extends C87413o implements C32227p<C65933h.C65935b, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60478l(C60466o1 o1Var) {
            super(2);
            this.f172395d = o1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C65933h.C65935b bVar = (C65933h.C65935b) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(bVar, "m");
            C54763g6.f153485a.mo75668e(bVar.f189556a, 1, intValue);
            this.f172395d.mo85429b().mo75224g(intValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.o1$m */
    public static final class C60479m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60466o1 f172396d;

        public C60479m(C60466o1 o1Var) {
            this.f172396d = o1Var;
        }

        public final void run() {
            this.f172396d.f172379a.setVisibility(8);
        }
    }

    public C60466o1(RelativeLayout relativeLayout) {
        C87412m.m108594g(relativeLayout, "panelRoot");
        this.f172379a = relativeLayout;
        List<C65933h.C65935b> f = C65933h.f189544a.mo89975f();
        this.f172380b = f;
        mo85430c(false);
        relativeLayout.setOnClickListener(C60471e.f172388d);
        relativeLayout.findViewById(C0966R.C0970id.m0k).setOnClickListener(new C60472f(this));
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.m0l);
        C87412m.m108593f(findViewById, "panelRoot.findViewById(R…ive_makeup_panel_details)");
        this.f172381c = (FinderLiveCameraOptMakeupView) findViewById;
        Iterator it = ((ArrayList) f).iterator();
        while (it.hasNext()) {
            C65933h.C65935b bVar = (C65933h.C65935b) it.next();
            if (bVar.f189556a == C54763g6.f153485a.mo75665b()) {
                this.f172381c.mo77883l(bVar);
            }
        }
        this.f172381c.setEffectItems(this.f172380b);
        this.f172381c.setOnRequestDefaultSeekByKey(C60473g.f172390d);
        this.f172381c.setOnRequestMakeupSeekByKey(C60474h.f172391d);
        this.f172381c.setOnRequestFilterSeekByKey(new C60475i(this));
        this.f172381c.setOnMakeupSuitChanged(new C60476j(this));
        this.f172381c.setOnMakeupSeekChanging(new C60477k(this));
        this.f172381c.setOnMakeupSeekDone(new C60478l(this));
        this.f172381c.setOnFilterSeekChanging(new C60467a(this));
        this.f172381c.setOnFilterSeekDone(new C60468b(this));
        this.f172383e = new C58521d(this.f172379a.getContext(), new C60469c(this));
        this.f172379a.setLongClickable(true);
        this.f172379a.setOnTouchListener(new C60470d(this));
    }

    /* renamed from: a */
    public static final void m70704a(C60466o1 o1Var) {
        o1Var.getClass();
        FinderLiveService.f159376d.getClass();
        C63699b bVar = FinderLiveService.f159393w;
        if (bVar != null) {
            bVar.f180566a = -1;
        }
        if (bVar != null) {
            bVar.f180567b = null;
        }
        if (bVar != null) {
            bVar.f180568c = 0;
        }
        C54412f b = o1Var.mo85429b();
        C63699b bVar2 = FinderLiveService.f159393w;
        C110747k kVar = b.f152607b;
        kVar.getClass();
        kVar.mo148312q(new C63711n(kVar, bVar2));
    }

    /* renamed from: b */
    public final C54412f mo85429b() {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C54405b bVar = aVar != null ? aVar.f173032r : null;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.live.core.core.LiveCameraOptManager");
        return (C54412f) bVar;
    }

    /* renamed from: c */
    public final void mo85430c(boolean z) {
        Log.m105924i("Finder.FinderLiveCameraOptMakeupWidget", "#hidePanel isAnimation=" + z);
        if (!z) {
            RelativeLayout relativeLayout = this.f172379a;
            relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
            this.f172379a.setVisibility(8);
            return;
        }
        this.f172379a.animate().translationY((float) C75044y4.m89990b(this.f172379a.getContext()).y).setDuration(200).start();
        this.f172379a.postDelayed(new C60479m(this), 200);
    }

    /* renamed from: d */
    public final void mo85431d() {
        Log.m105924i("Finder.FinderLiveCameraOptMakeupWidget", "#showBeautyPanel");
        this.f172379a.setVisibility(0);
        this.f172379a.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
        this.f172381c.mo77868g();
    }
}
