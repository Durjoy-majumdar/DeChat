package vg1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bl1.C39775b;
import cj1.C0581o5;
import cj1.C0584p5;
import cl1.C0702z0;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin;
import com.tencent.p014mm.plugin.finder.live.view.LiveNeat7extView;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import de3.C75375u;
import di3.C86312j;
import er1.C58739j4;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C76875f0;
import nk1.C47272h;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import p196ln.C76705f;
import qk1.C12806i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;
import te3.C49765hx0;
import vd3.C78407r;
import wk1.C15440n;
import wk1.C15460p;
import wk1.C78605g;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: vg1.f */
public final class C52891f {

    /* renamed from: a */
    public static final C52891f f147704a = new C52891f();

    /* renamed from: b */
    public static final C13601g f147705b = C36568h.m40985a(C14866f.f40880d);

    /* renamed from: c */
    public static final C13601g f147706c = C36568h.m40985a(C14869n.f40891d);

    /* renamed from: d */
    public static final C13601g f147707d = C36568h.m40985a(C14865e.f40879d);

    /* renamed from: e */
    public static final C13601g f147708e = C36568h.m40985a(C14868m.f40890d);

    /* renamed from: f */
    public static final C13601g f147709f;

    /* renamed from: g */
    public static final int f147710g;

    /* renamed from: h */
    public static final C13601g f147711h = C36568h.m40985a(C14861a.f40875d);

    /* renamed from: i */
    public static final C13601g f147712i = C36568h.m40985a(C14864d.f40878d);

    /* renamed from: vg1.f$a */
    public static final class C14861a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14861a f40875d = new C14861a();

        public C14861a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf((int) (((double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).x)) * 0.4d));
        }
    }

    /* renamed from: vg1.f$b */
    public static final class C14862b extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final C15601d<C13598b0> f40876d;

        public C14862b(C15601d<? super C13598b0> dVar) {
            C87412m.m108594g(dVar, "cont");
            this.f40876d = dVar;
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            if (pAGView != null) {
                pAGView.removeListener(this);
            }
            C15601d<C13598b0> dVar = this.f40876d;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    /* renamed from: vg1.f$c */
    public static final class C14863c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14863c f40877d = new C14863c();

        public C14863c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C74942w4.m89784a(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: vg1.f$d */
    public static final class C14864d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14864d f40878d = new C14864d();

        public C14864d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf((int) (((double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).x)) * 0.75d));
        }
    }

    /* renamed from: vg1.f$e */
    public static final class C14865e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C14865e f40879d = new C14865e();

        public C14865e() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.getContext().getResources().getString(C0966R.string.dgf);
        }
    }

    /* renamed from: vg1.f$f */
    public static final class C14866f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14866f f40880d = new C14866f();

        public C14866f() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.comment.BoxCommentHelper$showLikeAnimAndPostLike$1", mo125469f = "BoxCommentHelper.kt", mo125470l = {538}, mo125471m = "invokeSuspend")
    /* renamed from: vg1.f$l */
    public static final class C14867l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f40881d;

        /* renamed from: e */
        public Object f40882e;

        /* renamed from: f */
        public Object f40883f;

        /* renamed from: g */
        public int f40884g;

        /* renamed from: h */
        public final /* synthetic */ View f40885h;

        /* renamed from: i */
        public final /* synthetic */ WeImageView f40886i;

        /* renamed from: j */
        public final /* synthetic */ PAGView f40887j;

        /* renamed from: n */
        public final /* synthetic */ TextView f40888n;

        /* renamed from: o */
        public final /* synthetic */ C32224a<C13598b0> f40889o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14867l(View view, WeImageView weImageView, PAGView pAGView, TextView textView, C32224a<C13598b0> aVar, C15601d<? super C14867l> dVar) {
            super(2, dVar);
            this.f40885h = view;
            this.f40886i = weImageView;
            this.f40887j = pAGView;
            this.f40888n = textView;
            this.f40889o = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14867l(this.f40885h, this.f40886i, this.f40887j, this.f40888n, this.f40889o, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14867l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f40884g;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                View view = this.f40885h;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f40886i.setVisibility(8);
                this.f40887j.setVisibility(0);
                TextView textView = this.f40888n;
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3415ar));
                int safeToInt = StringKtKt.safeToInt(this.f40888n.getText().toString());
                this.f40886i.setIconColor(this.f40888n.getContext().getResources().getColor(C0966R.color.f3415ar));
                PAGView pAGView = this.f40887j;
                TextView textView2 = this.f40888n;
                this.f40882e = pAGView;
                this.f40883f = textView2;
                this.f40881d = safeToInt;
                this.f40884g = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                pAGView.stop();
                pAGView.setComposition(PAGFile.Load(textView2.getContext().getAssets(), "finder_live_comment_like.pag"));
                pAGView.setRepeatCount(1);
                pAGView.addListener(new C14862b(hVar));
                pAGView.setScaleMode(1);
                pAGView.play();
                if (hVar.mo90314b() == aVar) {
                    return aVar;
                }
                i = safeToInt;
            } else if (i2 == 1) {
                i = this.f40881d;
                TextView textView3 = (TextView) this.f40883f;
                PAGView pAGView2 = (PAGView) this.f40882e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f40886i.setVisibility(0);
            this.f40888n.setText(String.valueOf(i + 1));
            this.f40888n.setVisibility(0);
            this.f40887j.setVisibility(8);
            this.f40889o.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vg1.f$m */
    public static final class C14868m extends C87413o implements C32224a<C15460p> {

        /* renamed from: d */
        public static final C14868m f40890d = new C14868m();

        public C14868m() {
            super(0);
        }

        public Object invoke() {
            int i = C15460p.f41933f;
            C15460p.C15461a aVar = new C15460p.C15461a();
            aVar.f41936a.f41950m = MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3);
            aVar.f41936a.f41940c = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6);
            aVar.f41936a.f41941d = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3817fa);
            aVar.mo14276c((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3703bv));
            C52891f fVar = C52891f.f147704a;
            String str = (String) ((C36570n) C52891f.f147707d).getValue();
            C87412m.m108593f(str, "annoucement");
            aVar.mo14278e(str);
            return aVar.mo14274a();
        }
    }

    /* renamed from: vg1.f$n */
    public static final class C14869n extends C87413o implements C32224a<ForegroundColorSpan> {

        /* renamed from: d */
        public static final C14869n f40891d = new C14869n();

        public C14869n() {
            super(0);
        }

        public Object invoke() {
            return new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3553xj));
        }
    }

    /* renamed from: vg1.f$g */
    public static final class C52892g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0581o5 f147713d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f147714e;

        /* renamed from: f */
        public final /* synthetic */ Context f147715f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52892g(C0581o5 o5Var, C45795b bVar, Context context) {
            super(0);
            this.f147713d = o5Var;
            this.f147714e = bVar;
            this.f147715f = context;
        }

        public Object invoke() {
            C47272h.f126894a.mo72304i(this.f147713d, true, this.f147714e, this.f147715f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vg1.f$h */
    public static final class C52893h implements GestureDetector.OnGestureListener {
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: vg1.f$i */
    public static final class C52894i implements GestureDetector.OnDoubleTapListener {

        /* renamed from: d */
        public final /* synthetic */ C39775b f147716d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f147717e;

        /* renamed from: f */
        public final /* synthetic */ boolean f147718f;

        /* renamed from: g */
        public final /* synthetic */ View f147719g;

        /* renamed from: vg1.f$i$a */
        public static final class C52895a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60905o f147720d;

            /* renamed from: e */
            public final /* synthetic */ C39775b f147721e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C52895a(C60905o oVar, C39775b bVar) {
                super(0);
                this.f147720d = oVar;
                this.f147721e = bVar;
            }

            public Object invoke() {
                Object tag = this.f147720d.mo85811C().getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
                if (((FinderLiveBoxCommentPlugin) tag).mo64543a1().mo73650e(this.f147721e)) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Qx0(16, 1, this.f147721e.mo62407a(), this.f147721e.getContent());
                }
                return C13598b0.f38549a;
            }
        }

        public C52894i(C39775b bVar, C60905o oVar, boolean z, View view) {
            this.f147716d = bVar;
            this.f147717e = oVar;
            this.f147718f = z;
            this.f147719g = view;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveGroupCommentHelper", "boxCommentLikeTrack onDoubleTap selfLike:" + this.f147716d.f106736g);
            if (this.f147716d.f106736g) {
                Object tag = this.f147717e.mo85811C().getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
                if (((FinderLiveBoxCommentPlugin) tag).mo64543a1().mo73649d(this.f147716d)) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Qx0(19, 1, this.f147716d.mo62407a(), this.f147716d.getContent());
                }
            } else {
                C52891f fVar = C52891f.f147704a;
                C60905o oVar = this.f147717e;
                C0000n0 n0Var = oVar.f29679z;
                View D = oVar.mo85812D(C0966R.C0970id.iox);
                C87412m.m108593f(D, "holder.getView<View>(R.id.comment_like_ui_root)");
                fVar.mo73665o(n0Var, D, new C52895a(this.f147717e, this.f147716d));
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveGroupCommentHelper", "boxCommentLikeTrack onSingleTapConfirmed selfLike:" + this.f147716d.f106736g);
            Object tag = this.f147717e.mo85811C().getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
            C52890e a1 = ((FinderLiveBoxCommentPlugin) tag).mo64543a1();
            boolean z = this.f147718f;
            C39775b bVar = this.f147716d;
            View view = this.f147719g;
            C60905o oVar = this.f147717e;
            a1.getClass();
            C87412m.m108594g(bVar, "msg");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            if (z || !a1.mo73648c(bVar)) {
                return true;
            }
            C41573e3 e3Var = C41573e3.f111902a;
            e3Var.mo64658a();
            a1.f147703d = view.getBackground();
            C52886b bVar2 = new C52886b(bVar, view, a1);
            C52887c cVar = new C52887c(oVar, a1, bVar, view);
            C52889d dVar = new C52889d(view, a1);
            C49765hx0 hx02 = bVar.f106734e.f144914s;
            boolean z2 = ((C54991o) a1.mo73647b(C54991o.class)).f154190D;
            C52887c cVar2 = cVar;
            String a = bVar.mo62407a();
            View view2 = view;
            C41573e3.C41574a aVar = new C41573e3.C41574a(view, (C41573e3.C41575b) null, hx02, z2, true, true, a, bVar.getContent(), 2, (C8480h) null);
            e3Var.mo64661d(bVar2, cVar2, dVar, aVar, new C41573e3.C41576c(true, new C76875f0(view2.getContext(), 167, 0), true));
            if (eVar.mo87105p(bVar) || eVar.mo87114s(bVar)) {
                View view3 = view2;
                view3.setBackground(view3.getContext().getDrawable(C0966R.C0969drawable.f5156yn));
                return true;
            }
            view2.setBackground(view2.getContext().getDrawable(C0966R.C0969drawable.f5167yz));
            return true;
        }
    }

    /* renamed from: vg1.f$j */
    public static final class C52896j implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ GestureDetector f147722d;

        public C52896j(GestureDetector gestureDetector) {
            this.f147722d = gestureDetector;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            ArrayList arrayList = new ArrayList();
            View view2 = view;
            arrayList.add(view);
            arrayList.add(motionEvent2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f147722d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$2$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: vg1.f$k */
    public static final class C52897k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C39775b f147723d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f147724e;

        /* renamed from: f */
        public final /* synthetic */ View f147725f;

        /* renamed from: vg1.f$k$a */
        public static final class C52898a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60905o f147726d;

            /* renamed from: e */
            public final /* synthetic */ C39775b f147727e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C52898a(C60905o oVar, C39775b bVar) {
                super(0);
                this.f147726d = oVar;
                this.f147727e = bVar;
            }

            public Object invoke() {
                Object tag = this.f147726d.mo85811C().getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
                if (((FinderLiveBoxCommentPlugin) tag).mo64543a1().mo73650e(this.f147727e)) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Qx0(15, 1, this.f147727e.mo62407a(), this.f147727e.getContent());
                }
                return C13598b0.f38549a;
            }
        }

        public C52897k(C39775b bVar, C60905o oVar, View view) {
            this.f147723d = bVar;
            this.f147724e = oVar;
            this.f147725f = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C58739j4.f168176a.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C39775b bVar = this.f147723d;
            if (bVar.f106736g) {
                Object tag = this.f147724e.mo85811C().getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
                if (((FinderLiveBoxCommentPlugin) tag).mo64543a1().mo73649d(this.f147723d)) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Qx0(18, 1, this.f147723d.mo62407a(), this.f147723d.getContent());
                }
            } else {
                C52891f fVar = C52891f.f147704a;
                C60905o oVar = this.f147724e;
                fVar.mo73665o(oVar.f29679z, this.f147725f, new C52898a(oVar, bVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        C13601g a = C36568h.m40985a(C14863c.f40877d);
        f147709f = a;
        f147710g = ((Number) ((C36570n) a).getValue()).intValue();
    }

    /* renamed from: a */
    public final String mo73651a(String str, String str2) {
        C87412m.m108594g(str, "usernameTag");
        C87412m.m108594g(str2, "content");
        String str3 = " " + str + str2;
        C87412m.m108593f(str3, "result.toString()");
        return str3;
    }

    /* renamed from: b */
    public final int mo73652b() {
        return ((Number) ((C36570n) f147705b).getValue()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r14 = r14.f134919d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo73653c(android.content.Context r12, com.tencent.p014mm.p136ui.widget.MMNeat7extView r13, bl1.C39775b r14) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "contentTv"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r14, r0)
            nk1.h r0 = nk1.C47272h.f126894a
            java.lang.String r1 = r14.mo62407a()
            java.lang.String r2 = r14.mo62408b()
            te3.xs0 r14 = r14.f106734e
            te3.hx0 r14 = r14.f144914s
            if (r14 == 0) goto L_0x0026
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
            if (r14 == 0) goto L_0x0026
            java.lang.String r14 = r14.nickname
            goto L_0x0027
        L_0x0026:
            r14 = 0
        L_0x0027:
            if (r14 != 0) goto L_0x002b
            java.lang.String r14 = ""
        L_0x002b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r7 = r0.mo72299d(r1, r2, r14, r3)
            android.content.res.Resources r14 = r12.getResources()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r4 = r1
            tf0.p1 r4 = (tf0.C64916p1) r4
            android.text.TextPaint r6 = r13.getPaint()
            java.lang.String r13 = "contentTv.paint"
            gy3.C87412m.m108593f(r6, r13)
            r8 = 0
            r9 = 8
            r10 = 0
            r5 = r12
            java.lang.CharSequence r12 = tf0.C64916p1.C64917a.m76441h(r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            r0[r13] = r12
            r12 = 2131832002(0x7f112cc2, float:1.9297046E38)
            java.lang.String r12 = r14.getString(r12, r0)
            java.lang.String r13 = "context.resources.getStr…   displayName)\n        )"
            gy3.C87412m.m108593f(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vg1.C52891f.mo73653c(android.content.Context, com.tencent.mm.ui.widget.MMNeat7extView, bl1.b):java.lang.String");
    }

    /* renamed from: d */
    public final void mo73654d(LiveNeat7extView liveNeat7extView, String str, int i, int i2, int i3, C75375u uVar) {
        C87412m.m108594g(liveNeat7extView, "contentTv");
        C87412m.m108594g(str, "username");
        C87412m.m108594g(uVar, "userMessage");
        C78407r fi = ((C76705f) C86312j.m106911c(C76705f.class)).mo106835fi(str);
        fi.setCallback(liveNeat7extView);
        fi.setBounds(0, 0, i3, i3);
        int i4 = C78605g.f230236e;
        C78605g.C53185a aVar = new C78605g.C53185a((BitmapDrawable) null, 0, 0, 7, (C8480h) null);
        aVar.f148377a = fi;
        aVar.f148379c = C15440n.f41895a.mo14261j();
        BitmapDrawable bitmapDrawable = aVar.f148377a;
        C13598b0 b0Var = null;
        C78605g gVar = bitmapDrawable != null ? new C78605g(bitmapDrawable) : null;
        if (gVar != null) {
            gVar.f230237d = aVar;
        }
        if (gVar != null) {
            uVar.mo105705b(gVar, i, i2, 33);
            liveNeat7extView.setInvalidateVerifyPassTag(str);
            liveNeat7extView.mo104279b(uVar);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("FinderLiveGroupCommentHelper", "loadWxAvatar err create drawable fail!");
        }
    }

    /* renamed from: e */
    public final boolean mo73655e(C60905o oVar, C39775b bVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        boolean z2 = false;
        if (!(list == null || list.isEmpty())) {
            for (T next : list) {
                if (next instanceof Integer) {
                    if (C87412m.m108589b(next, 101)) {
                        f147704a.mo73663m(oVar, bVar, (Integer) next);
                    } else if (!C87412m.m108589b(next, 102)) {
                    }
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: f */
    public final void mo73656f(C0000n0 n0Var, C0581o5 o5Var, View view, C45795b bVar, Context context) {
        C87412m.m108594g(o5Var, "msg");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(context, "context");
        C0702z0 z0Var = (C0702z0) bVar.mo71262a(C0702z0.class);
        String f = o5Var.mo572f();
        if (f == null) {
            f = "";
        }
        z0Var.mo673g3(new C13604l(f, 1));
        mo73657g(n0Var, o5Var, view, bVar, context, true);
    }

    /* renamed from: g */
    public final void mo73657g(C0000n0 n0Var, C0581o5 o5Var, View view, C45795b bVar, Context context, boolean z) {
        C87412m.m108594g(o5Var, "msg");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(context, "context");
        if (!(o5Var instanceof C0584p5) || o5Var.getSeq() <= 0) {
            Log.m105924i("FinderLiveGroupCommentHelper", "processCommentLikeAction seq:" + o5Var.getSeq());
            return;
        }
        C0584p5 p5Var = (C0584p5) o5Var;
        if (p5Var.mo583m()) {
            C47272h.f126894a.mo72304i(o5Var, false, bVar, context);
            boolean m = p5Var.mo583m();
            int likeCount = p5Var.getLikeCount();
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + m + ",likeCnt:" + likeCount);
            View findViewById = view.findViewById(C0966R.C0970id.iox);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.comment_like_ui_root)");
            mo73658h(findViewById, m, likeCount, (Integer) null);
        } else if (z) {
            View findViewById2 = view.findViewById(C0966R.C0970id.iox);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.comment_like_ui_root)");
            mo73665o(n0Var, findViewById2, new C52892g(o5Var, bVar, context));
        } else {
            C47272h.f126894a.mo72304i(o5Var, true, bVar, context);
        }
    }

    /* renamed from: h */
    public final void mo73658h(View view, boolean z, int i, Integer num) {
        C87412m.m108594g(view, "likeRoot");
        View findViewById = view.findViewById(C0966R.C0970id.i7n);
        C87412m.m108593f(findViewById, "likeRoot.findViewById(R.id.comment_like_icon)");
        WeImageView weImageView = (WeImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f357744i82);
        C87412m.m108593f(findViewById2, "likeRoot.findViewById(R.id.comment_like_pag)");
        PAGView pAGView = (PAGView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.i7o);
        C87412m.m108593f(findViewById3, "likeRoot.findViewById(R.id.comment_like_num)");
        TextView textView = (TextView) findViewById3;
        textView.setText(i <= 0 ? "" : String.valueOf(i));
        int i2 = C39975j.f107165v;
        int i3 = 4;
        if (i > i2) {
            if (i > 0) {
                if (z) {
                    textView.setTextColor(view.getContext().getResources().getColor(C0966R.color.f3415ar));
                    weImageView.setIconColor(view.getContext().getResources().getColor(C0966R.color.f3415ar));
                } else {
                    textView.setTextColor(view.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                    weImageView.setIconColor(view.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                }
                if (!pAGView.isPlaying()) {
                    weImageView.setVisibility(0);
                    pAGView.setVisibility(8);
                } else if (num == null) {
                    pAGView.stop();
                }
                i3 = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i2 > 1) {
            C62042e eVar = C62042e.f176370a;
            Context context = view.getContext();
            C87412m.m108593f(context, "likeRoot.context");
            eVar.mo87041S1(context, "(DEBUG)赞数达到" + C39975j.f107165v + "个才展示");
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public final boolean mo73659i(C12806i0.C12807a aVar, C0581o5 o5Var, List<Object> list) {
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        boolean z = false;
        if (!(list == null || list.isEmpty())) {
            for (T next : list) {
                if ((next instanceof Integer) && C87412m.m108589b(next, 1)) {
                    C0584p5 p5Var = o5Var instanceof C0584p5 ? (C0584p5) o5Var : null;
                    if (p5Var != null) {
                        f147704a.mo73664n(aVar, p5Var, (Integer) next);
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void mo73660j(C60905o oVar, boolean z, C39775b bVar, View view) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "msg");
        C87412m.m108594g(view, "view");
        if (oVar.mo85811C().getTag() instanceof FinderLiveBoxCommentPlugin) {
            GestureDetector gestureDetector = new GestureDetector(oVar.f173499A, new C52893h());
            gestureDetector.setOnDoubleTapListener(new C52894i(bVar, oVar, z, view));
            view.setOnTouchListener(new C52896j(gestureDetector));
        }
    }

    /* renamed from: k */
    public final void mo73661k(C60905o oVar, C39775b bVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "msg");
        View D = oVar.mo85812D(C0966R.C0970id.iox);
        C87412m.m108593f(D, "holder.getView<View>(R.id.comment_like_ui_root)");
        if (oVar.mo85811C().getTag() instanceof FinderLiveBoxCommentPlugin) {
            D.setOnClickListener(new C52897k(bVar, oVar, D));
        }
    }

    /* renamed from: l */
    public final void mo73662l(MMNeat7extView mMNeat7extView) {
        C87412m.m108594g(mMNeat7extView, "contentTv");
        mMNeat7extView.setMaxWidth(mMNeat7extView.getContext().getResources().getConfiguration().orientation == 2 ? ((Number) ((C36570n) f147711h).getValue()).intValue() : ((Number) ((C36570n) f147712i).getValue()).intValue());
    }

    /* renamed from: m */
    public final void mo73663m(C60905o oVar, C39775b bVar, Integer num) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        boolean z = bVar.f106736g;
        int i = bVar.f106735f;
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveGroupCommentHelper", "boxCommentLikeTrack content:" + bVar.getContent() + " seq:" + bVar.f106734e.f144913r + " setBoxLike isLike:" + z + ",likeCnt:" + i + ",textHeight:" + 0);
        View D = oVar.mo85812D(C0966R.C0970id.iox);
        C87412m.m108593f(D, "holder.getView<View>(R.id.comment_like_ui_root)");
        mo73658h(D, z, i, num);
    }

    /* renamed from: n */
    public final void mo73664n(C12806i0.C12807a aVar, C0584p5 p5Var, Integer num) {
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(p5Var, "msg");
        boolean m = p5Var.mo583m();
        int likeCount = p5Var.getLikeCount();
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + m + ",likeCnt:" + likeCount);
        mo73658h(aVar.f36661D, m, likeCount, num);
    }

    /* renamed from: o */
    public final void mo73665o(C0000n0 n0Var, View view, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "likeRoot");
        C87412m.m108594g(aVar, "postLikeCallback");
        View findViewById = view.findViewById(C0966R.C0970id.i7n);
        C87412m.m108593f(findViewById, "likeRoot.findViewById(R.id.comment_like_icon)");
        WeImageView weImageView = (WeImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f357744i82);
        C87412m.m108593f(findViewById2, "likeRoot.findViewById(R.id.comment_like_pag)");
        PAGView pAGView = (PAGView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.i7o);
        C87412m.m108593f(findViewById3, "likeRoot.findViewById(R.id.comment_like_num)");
        TextView textView = (TextView) findViewById3;
        if (n0Var == null) {
            Log.m105924i("FinderLiveGroupCommentHelper", "showLikeAnimAndPostLike scope is null");
        }
        if (n0Var != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C14867l(view, weImageView, pAGView, textView, aVar, (C15601d<? super C14867l>) null), 2, (Object) null);
        }
    }
}
