package jh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import cl1.C54991o;
import cl1.C55006x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import d14.C58052j1;
import d60.C58124b;
import er1.C7919x;
import fh1.C8036f1;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C48922bx2;
import te3.C64300cx2;
import te3.C64594nx2;
import te3.C64622p31;
import te3.C64646q31;
import te3.C64773vh3;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y50.C15936n0;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jh1.n */
public final class C60834n {

    /* renamed from: a */
    public final View f173301a;

    /* renamed from: b */
    public final C8036f1 f173302b;

    /* renamed from: c */
    public final String f173303c = "Finder.MileStoneLotteryWidget";

    /* renamed from: d */
    public C32228q<? super C55006x0.C0697b, ? super Boolean, ? super Boolean, C13598b0> f173304d;

    /* renamed from: jh1.n$a */
    public static final class C9408a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64622p31 f29360d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f29361e;

        public C9408a(C64622p31 p312, C60834n nVar) {
            this.f29360d = p312;
            this.f29361e = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            String str = this.f29360d.f184746d;
            if (str == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 10, (String) null, (String) null, (Integer) null, 28, (Object) null);
            this.f29361e.f173302b.mo9124o3(this.f29360d.f184746d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$b */
    public static final class C9409b implements View.OnClickListener {

        /* renamed from: d */
        public static final C9409b f29362d = new C9409b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$c */
    public static final class C9410c implements View.OnClickListener {

        /* renamed from: d */
        public static final C9410c f29363d = new C9410c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$d */
    public static final class C9411d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64622p31 f29364d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f29365e;

        /* renamed from: f */
        public final /* synthetic */ View f29366f;

        public C9411d(C64622p31 p312, C60834n nVar, View view) {
            this.f29364d = p312;
            this.f29365e = nVar;
            this.f29366f = view;
        }

        public final void onClick(View view) {
            String str;
            Class cls = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            String str2 = this.f29364d.f184746d;
            String str3 = "";
            C9406j.m9112f(jVar, str2 == null ? str3 : str2, 2, (String) null, (String) null, (Integer) null, 28, (Object) null);
            this.f29365e.f173302b.mo9122m3();
            if (!((C54991o) this.f29365e.f173302b.business(cls)).f154370u || !((C54991o) this.f29365e.f173302b.business(cls)).f154366t) {
                C76912y0.m92773l(this.f29366f.getContext(), this.f29365e.f173301a.getContext().getResources().getString(C0966R.string.dje));
            } else {
                C48922bx2 bx22 = this.f29364d.f184750h;
                if (!(bx22 == null || (str = bx22.f131369d) == null)) {
                    str3 = str;
                }
                C8036f1 f1Var = this.f29365e.f173302b;
                C58124b.C58125b bVar = C58124b.C58125b.FINDER_LIVE_AUTO_INPUT_COMMENT;
                Bundle bundle = new Bundle();
                bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", str3);
                C13598b0 b0Var = C13598b0.f38549a;
                f1Var.mo9313k3(bVar, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$e */
    public static final class C9412e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64622p31 f29367d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f29368e;

        public C9412e(C64622p31 p312, C60834n nVar) {
            this.f29367d = p312;
            this.f29368e = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            String str = this.f29367d.f184746d;
            if (str == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 2, (String) null, (String) null, (Integer) null, 28, (Object) null);
            this.f29368e.f173302b.mo9124o3(this.f29367d.f184746d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$f */
    public static final class C9413f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64622p31 f29369d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f29370e;

        /* renamed from: f */
        public final /* synthetic */ View f29371f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneLotteryWidget$refreshBtnStatus$6$1", mo125469f = "MileStoneLotteryWidget.kt", mo125470l = {318}, mo125471m = "invokeSuspend")
        /* renamed from: jh1.n$f$a */
        public static final class C9414a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f29372d;

            /* renamed from: e */
            public final /* synthetic */ C60834n f29373e;

            /* renamed from: f */
            public final /* synthetic */ C64622p31 f29374f;

            /* renamed from: g */
            public final /* synthetic */ View f29375g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9414a(C60834n nVar, C64622p31 p312, View view, C15601d<? super C9414a> dVar) {
                super(2, dVar);
                this.f29373e = nVar;
                this.f29374f = p312;
                this.f29375g = view;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C9414a(this.f29373e, this.f29374f, this.f29375g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C9414a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f29372d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C60834n nVar = this.f29373e;
                    C64622p31 p312 = this.f29374f;
                    this.f29372d = 1;
                    if (C60834n.m71230a(nVar, p312, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f29373e.mo85751g(this.f29375g, this.f29374f);
                this.f29373e.mo85750f(this.f29375g, this.f29374f);
                return C13598b0.f38549a;
            }
        }

        public C9413f(C64622p31 p312, C60834n nVar, View view) {
            this.f29369d = p312;
            this.f29370e = nVar;
            this.f29371f = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            String str = this.f29369d.f184746d;
            if (str == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 2, (String) null, (String) null, (Integer) null, 28, (Object) null);
            C60834n nVar = this.f29370e;
            C0000n0 n0Var = nVar.f173302b.f26744r;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C9414a(nVar, this.f29369d, this.f29371f, (C15601d<? super C9414a>) null), 3, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$h */
    public static final class C9415h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f29376d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f29377e;

        public C9415h(View view, C60834n nVar) {
            this.f29376d = view;
            this.f29377e = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f29376d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C60834n nVar = this.f29377e;
            nVar.f173304d = null;
            C8036f1 f1Var = nVar.f173302b;
            Log.m105924i(f1Var.f26739j, "backToMainPage");
            C64646q31 q312 = (C64646q31) ((C58052j1) ((C55006x0) f1Var.business(C55006x0.class)).f154452g).getValue();
            if (q312 == null) {
                Log.m105924i(f1Var.f26739j, "backToMainPage but metaInfo null");
                f1Var.mo9122m3();
            } else {
                View view4 = f1Var.f26740n;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C60838o oVar = f1Var.f26741o;
                if (oVar != null) {
                    oVar.mo85754b(q312, false, true);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$k */
    public static final class C9416k implements View.OnClickListener {

        /* renamed from: d */
        public static final C9416k f29378d = new C9416k();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$l */
    public static final class C9417l implements View.OnClickListener {

        /* renamed from: d */
        public static final C9417l f29379d = new C9417l();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$m */
    public static final class C9418m extends C87413o implements C32228q<C55006x0.C0697b, Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60834n f29380d;

        /* renamed from: e */
        public final /* synthetic */ C64622p31 f29381e;

        /* renamed from: f */
        public final /* synthetic */ View f29382f;

        /* renamed from: g */
        public final /* synthetic */ TextView f29383g;

        /* renamed from: h */
        public final /* synthetic */ View f29384h;

        /* renamed from: i */
        public final /* synthetic */ TextView f29385i;

        /* renamed from: j */
        public final /* synthetic */ View f29386j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9418m(C60834n nVar, C64622p31 p312, View view, TextView textView, View view2, TextView textView2, View view3) {
            super(3);
            this.f29380d = nVar;
            this.f29381e = p312;
            this.f29382f = view;
            this.f29383g = textView;
            this.f29384h = view2;
            this.f29385i = textView2;
            this.f29386j = view3;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C55006x0.C0697b bVar = (C55006x0.C0697b) obj;
            ((Boolean) obj2).booleanValue();
            ((Boolean) obj3).booleanValue();
            C87412m.m108594g(bVar, "data");
            this.f29380d.mo85748d(this.f29381e, bVar, this.f29382f, this.f29383g);
            if (bVar.f1648a != 1) {
                this.f29380d.mo85747c(this.f29384h, this.f29385i, this.f29386j, this.f29381e);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneLotteryWidget", mo125469f = "MileStoneLotteryWidget.kt", mo125470l = {51}, mo125471m = "refreshLotteryContent")
    /* renamed from: jh1.n$g */
    public static final class C60835g extends C66704d {

        /* renamed from: d */
        public Object f173305d;

        /* renamed from: e */
        public boolean f173306e;

        /* renamed from: f */
        public boolean f173307f;

        /* renamed from: g */
        public /* synthetic */ Object f173308g;

        /* renamed from: h */
        public final /* synthetic */ C60834n f173309h;

        /* renamed from: i */
        public int f173310i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60835g(C60834n nVar, C15601d<? super C60835g> dVar) {
            super(dVar);
            this.f173309h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f173308g = obj;
            this.f173310i |= Integer.MIN_VALUE;
            return this.f173309h.mo85749e((String) null, false, false, this);
        }
    }

    /* renamed from: jh1.n$i */
    public static final class C60836i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64594nx2 f173311d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f173312e;

        public C60836i(C64594nx2 nx22, C60834n nVar) {
            this.f173311d = nx22;
            this.f173312e = nVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            C64773vh3 vh32 = this.f173311d.f184579h;
            String str3 = "";
            if (vh32 == null || (str = vh32.f185894e) == null) {
                str = str3;
            }
            if (!(vh32 == null || (str2 = vh32.f185893d) == null)) {
                str3 = str2;
            }
            jVar.mo10129g(1024, str, str3);
            C60834n.m71231b(this.f173312e, this.f173311d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.n$j */
    public static final class C60837j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64594nx2 f173313d;

        /* renamed from: e */
        public final /* synthetic */ C60834n f173314e;

        public C60837j(C64594nx2 nx22, C60834n nVar) {
            this.f173313d = nx22;
            this.f173314e = nVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            C64773vh3 vh32 = this.f173313d.f184579h;
            String str3 = "";
            if (vh32 == null || (str = vh32.f185894e) == null) {
                str = str3;
            }
            if (!(vh32 == null || (str2 = vh32.f185893d) == null)) {
                str3 = str2;
            }
            jVar.mo10129g(1024, str, str3);
            C60834n.m71231b(this.f173314e, this.f173313d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60834n(View view, C8036f1 f1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(f1Var, "controller");
        this.f173301a = view;
        this.f173302b = f1Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: te3.p31} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71230a(jh1.C60834n r11, te3.C64622p31 r12, wx3.C15601d r13) {
        /*
            r11.getClass()
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            boolean r1 = r13 instanceof jh1.C60833m
            if (r1 == 0) goto L_0x0018
            r1 = r13
            jh1.m r1 = (jh1.C60833m) r1
            int r2 = r1.f173300h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f173300h = r2
            goto L_0x001d
        L_0x0018:
            jh1.m r1 = new jh1.m
            r1.<init>(r11, r13)
        L_0x001d:
            java.lang.Object r13 = r1.f173298f
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r1.f173300h
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x005b
            if (r3 == r6) goto L_0x004d
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r11 = r1.f173296d
            bi1.e r11 = (bi1.C0287e) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x012b
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            java.lang.Object r11 = r1.f173297e
            bi1.e r11 = (bi1.C0287e) r11
            java.lang.Object r12 = r1.f173296d
            jh1.n r12 = (jh1.C60834n) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x010b
        L_0x004d:
            java.lang.Object r11 = r1.f173297e
            r12 = r11
            te3.p31 r12 = (te3.C64622p31) r12
            java.lang.Object r11 = r1.f173296d
            jh1.n r11 = (jh1.C60834n) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e9
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r13)
            te3.qv0 r13 = new te3.qv0
            r13.<init>()
            je1.h2 r3 = je1.C46523h2.f125330a
            r8 = 11395(0x2c83, float:1.5968E-41)
            te3.ig0 r3 = r3.mo71859a(r8)
            r13.f140562d = r3
            fh1.f1 r3 = r11.f173302b
            java.lang.Class<cl1.o> r9 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r3.business(r9)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            r13.f140563e = r3
            fh1.f1 r3 = r11.f173302b
            androidx.lifecycle.i0 r3 = r3.business(r0)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r3 = r3.f154417n
            pe3.b r3 = pe3.C89349b.m111674a(r3)
            r13.f140564f = r3
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            r13.f140565g = r3
            fh1.f1 r3 = r11.f173302b
            androidx.lifecycle.i0 r3 = r3.business(r0)
            cl1.u r3 = (cl1.C55001u) r3
            long r9 = r3.f154416j
            r13.f140566h = r9
            fh1.f1 r3 = r11.f173302b
            androidx.lifecycle.i0 r0 = r3.business(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r9 = r0.f182392d
            r13.f140567i = r9
            java.lang.String r0 = r12.f184746d
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = ""
        L_0x00b3:
            r13.f140568j = r0
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r0.f127069d = r8
            java.lang.String r3 = "/cgi-bin/micromsg-bin/finderliveattendmilestonelottery"
            r0.f127068c = r3
            r0.f127066a = r13
            te3.rv0 r13 = new te3.rv0
            r13.<init>()
            r0.f127067b = r13
            ob0.c r13 = r0.mo72403a()
            java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.s1 r0 = (ht1.C8802s1) r0
            ob0.b r0 = r0.mo9632ui()
            r0.mo123453j(r13)
            r1.f173296d = r11
            r1.f173297e = r12
            r1.f173300h = r6
            java.lang.Object r13 = bi1.C0283d.m245c(r0, r7, r1, r6, r7)
            if (r13 != r2) goto L_0x00e9
            goto L_0x012d
        L_0x00e9:
            bi1.e r13 = (bi1.C0287e) r13
            boolean r0 = r13 instanceof bi1.C0288f
            if (r0 == 0) goto L_0x010d
            wx3.f r0 = r13.f854a
            if (r0 != 0) goto L_0x00f7
            wx3.f r0 = r1.getContext()
        L_0x00f7:
            jh1.l r3 = new jh1.l
            r3.<init>(r13, r7, r12, r11)
            r1.f173296d = r11
            r1.f173297e = r13
            r1.f173300h = r5
            java.lang.Object r12 = a14.C53895h.m60469g(r0, r3, r1)
            if (r12 != r2) goto L_0x0109
            goto L_0x012d
        L_0x0109:
            r12 = r11
            r11 = r13
        L_0x010b:
            r13 = r11
            r11 = r12
        L_0x010d:
            boolean r12 = r13 instanceof bi1.C0281b
            if (r12 == 0) goto L_0x012b
            wx3.f r12 = r13.f854a
            if (r12 != 0) goto L_0x0119
            wx3.f r12 = r1.getContext()
        L_0x0119:
            jh1.k r0 = new jh1.k
            r0.<init>(r13, r7, r11)
            r1.f173296d = r13
            r1.f173297e = r7
            r1.f173300h = r4
            java.lang.Object r11 = a14.C53895h.m60469g(r12, r0, r1)
            if (r11 != r2) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x012d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60834n.m71230a(jh1.n, te3.p31, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.live.view.b2] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r3 = r3.f185895f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0213  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71231b(jh1.C60834n r49, te3.C64594nx2 r50) {
        /*
            r1 = r49
            r49.getClass()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            te3.fp1 r0 = new te3.fp1
            r0.<init>()
            r3 = r50
            te3.vh3 r3 = r3.f184579h
            r4 = 0
            if (r3 == 0) goto L_0x001a
            pe3.b r3 = r3.f185895f
            if (r3 == 0) goto L_0x001a
            byte[] r3 = r3.f257327a
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            java.lang.String r5 = ""
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0032
        L_0x0026:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r0)
        L_0x0031:
            r0 = r4
        L_0x0032:
            if (r0 == 0) goto L_0x0213
            fh1.f1 r3 = r1.f173302b
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = r3.getStore()
            fj1.b r3 = r3.getLiveRoomData()
            byte[] r8 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "live_list_detail"
            r9.append(r10)
            r10 = 58
            r9.append(r10)
            fh1.f1 r11 = r1.f173302b
            java.lang.Class<cl1.u> r12 = cl1.C55001u.class
            androidx.lifecycle.i0 r11 = r11.business(r12)
            cl1.u r11 = (cl1.C55001u) r11
            te3.c21 r11 = r11.f154420q
            long r11 = r11.f182392d
            r9.append(r11)
            r9.append(r10)
            fh1.f1 r11 = r1.f173302b
            androidx.lifecycle.i0 r11 = r11.business(r2)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            r9.append(r11)
            java.lang.String r11 = "::"
            r9.append(r11)
            fh1.f1 r11 = r1.f173302b
            androidx.lifecycle.i0 r11 = r11.business(r2)
            cl1.o r11 = (cl1.C54991o) r11
            long r11 = r11.f154325i1
            r9.append(r11)
            r9.append(r10)
            r9.append(r8)
            r9.append(r10)
            fh1.f1 r11 = r1.f173302b
            androidx.lifecycle.i0 r11 = r11.business(r2)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154318g2
            r9.append(r11)
            r9.append(r10)
            fh1.f1 r10 = r1.f173302b
            androidx.lifecycle.i0 r2 = r10.business(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154203G1
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            np1.v r9 = np1.C61881v.f175961a
            java.lang.String r10 = "locClickId"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.Class<cl1.h1> r10 = cl1.C54979h1.class
            java.lang.String r11 = "setSceneNote"
            gy3.C87412m.m108594g(r2, r11)
            te3.l40 r11 = r0.f183185p
            if (r11 == 0) goto L_0x00ed
            java.lang.String r12 = r11.f184031d
            if (r12 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x00d9
            androidx.lifecycle.i0 r13 = r3.mo71262a(r10)
            cl1.h1 r13 = (cl1.C54979h1) r13
            java.util.HashMap<java.lang.String, java.lang.String> r13 = r13.f154124Q
            if (r13 == 0) goto L_0x00d9
            java.lang.String r14 = r11.f184033f
            if (r14 != 0) goto L_0x00d6
            r14 = r5
        L_0x00d6:
            r13.put(r12, r14)
        L_0x00d9:
            if (r3 == 0) goto L_0x00ed
            androidx.lifecycle.i0 r10 = r3.mo71262a(r10)
            cl1.h1 r10 = (cl1.C54979h1) r10
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r10.f154125R
            if (r10 == 0) goto L_0x00ed
            java.lang.String r13 = r11.f184034g
            if (r13 != 0) goto L_0x00ea
            r13 = r5
        L_0x00ea:
            r10.put(r12, r13)
        L_0x00ed:
            if (r11 == 0) goto L_0x00f5
            int r10 = r11.f184036i
            if (r10 != r7) goto L_0x00f5
            r10 = 1
            goto L_0x00f6
        L_0x00f5:
            r10 = 0
        L_0x00f6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "showNavigationBar:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "FinderLive.MiniProgramPayloadHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            di0.o r15 = new di0.o
            r15.<init>()
            cj1.l6 r12 = new cj1.l6
            r12.<init>()
            java.lang.String r13 = r0.f183189t
            if (r13 != 0) goto L_0x011c
            r13 = r5
        L_0x011c:
            r12.f153583d = r13
            long r13 = r0.f183176d
            r12.f153584e = r13
            r12.f153587h = r5
            java.lang.String r13 = "push"
            r12.f153586g = r13
            r13 = -1
            r12.f153591o = r13
            r12.f153592p = r8
            r12.f153594r = r7
            r12.f153595s = r6
            r15.f250937i = r12
            if (r11 == 0) goto L_0x0139
            java.lang.String r6 = r11.f184031d
            if (r6 != 0) goto L_0x013a
        L_0x0139:
            r6 = r5
        L_0x013a:
            r15.f250930b = r6
            if (r11 == 0) goto L_0x0142
            java.lang.String r6 = r11.f184032e
            if (r6 != 0) goto L_0x0143
        L_0x0142:
            r6 = r5
        L_0x0143:
            r15.f250934f = r6
            r6 = 1177(0x499, float:1.65E-42)
            r15.f250939k = r6
            r15.f250940l = r2
            int r14 = r9.mo86812d()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r2 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
            if (r10 == 0) goto L_0x0156
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r6 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
            goto L_0x0158
        L_0x0156:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r6 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
        L_0x0158:
            r20 = r6
            r25 = r10 ^ 1
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r24 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.NORMAL
            er1.j4 r6 = er1.C58739j4.f168176a
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r38 = r6.mo83713i(r11)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r8 = r8.getDimension(r11)
            int r8 = (int) r8
            r39 = r8
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r8 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r12 = r8
            r13 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = -100670088(0xfffffffff9ffe578, float:-1.6608623E35)
            r47 = 1
            r48 = 0
            r11 = r15
            r15 = r2
            r22 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r11.f250912A = r8
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r2 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r2.<init>()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = r0.f183163H
            if (r10 != 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r5 = r10
        L_0x01ca:
            java.lang.String r10 = "cookies"
            r8.put(r10, r5)
            r2.f239396d = r7
            java.lang.String r5 = r8.toString()
            r2.f239399g = r5
            r11.f250947s = r2
            te3.l40 r2 = r6.mo83715j(r11)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r11.f250912A
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$b r5 = r5.mo76935f()
            sk1.x r6 = new sk1.x
            r6.<init>(r0)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r0 = r9.mo86810b(r3, r6, r2)
            r5.f158008t = r0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r5.mo76967a()
            r11.f250912A = r0
            r9.mo86813e(r11)
            cj1.r0 r0 = cj1.C54804r0.f153631a
            android.view.View r2 = r1.f173301a
            android.content.Context r2 = r2.getContext()
            java.lang.String r5 = "root.context"
            gy3.C87412m.m108593f(r2, r5)
            fh1.f1 r1 = r1.f173302b
            com.tencent.mm.plugin.finder.live.view.b2 r1 = r1.f27261e
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r5 == 0) goto L_0x020f
            r4 = r1
            com.tencent.mm.plugin.finder.live.view.b r4 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r4
        L_0x020f:
            r0.mo75767i(r2, r3, r11, r4)
            goto L_0x021a
        L_0x0213:
            java.lang.String r0 = r1.f173303c
            java.lang.String r1 = "click product, jumpInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60834n.m71231b(jh1.n, te3.nx2):void");
    }

    /* renamed from: c */
    public final void mo85747c(View view, TextView textView, View view2, C64622p31 p312) {
        int i;
        boolean z;
        int i2;
        View view3 = view;
        TextView textView2 = textView;
        View view4 = view2;
        C64622p31 p313 = p312;
        boolean u = C61926c.m72696u(p313.f184749g, 1);
        C64300cx2 cx22 = p313.f184747e;
        int i3 = cx22 != null ? cx22.f182600h : 0;
        C55006x0.C0697b e3 = ((C55006x0) this.f173302b.business(C55006x0.class)).mo76053e3();
        int i4 = e3 != null ? e3.f1648a : 1;
        boolean z2 = i4 == 1;
        String str = this.f173303c;
        Log.m105924i(str, "refreshBtnStatus isAttend:" + u + ", type:" + i3 + ", lotteryInfo.ext_flag:" + p313.f184749g + ", localStatus:" + i4 + ", isRunning:" + z2);
        if (u) {
            if (view3 == null) {
                i2 = i3;
            } else {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                i2 = i3;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) view4.findViewById(C0966R.C0970id.ogg);
            View findViewById = view4.findViewById(C0966R.C0970id.oge);
            if (i2 == 2) {
                C9406j jVar = C9406j.f29357a;
                String str2 = p313.f184746d;
                C9406j.m9112f(jVar, str2 == null ? "" : str2, 9, (String) null, (String) null, (Integer) null, 28, (Object) null);
                if (textView3 != null) {
                    textView3.setText(this.f173301a.getContext().getString(C0966R.string.ndn));
                }
                if (textView3 != null) {
                    textView3.setTextColor(this.f173301a.getContext().getResources().getColor(C0966R.color.aom));
                }
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view5 = findViewById;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view3 != null) {
                    view3.setOnClickListener(new C9408a(p313, this));
                    return;
                }
                return;
            }
            if (textView3 != null) {
                textView3.setText(this.f173301a.getContext().getString(C0966R.string.ndm));
            }
            if (textView3 != null) {
                textView3.setTextColor(this.f173301a.getContext().getResources().getColor(C0966R.color.aol));
            }
            if (findViewById != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = findViewById;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view3 != null) {
                view3.setOnClickListener(C9409b.f29362d);
                return;
            }
            return;
        }
        if (view3 == null) {
            z = z2;
            i = i3;
        } else {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            z = z2;
            i = i3;
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshBtnStatus", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (!z) {
            if (textView2 != null) {
                textView2.setText(this.f173301a.getContext().getString(C0966R.string.ndh));
            }
            if (textView2 != null) {
                textView2.setOnClickListener(C9410c.f29363d);
            }
            if (textView2 != null) {
                textView2.setBackgroundResource(C0966R.C0969drawable.cq9);
            }
            if (textView2 != null) {
                textView2.setTextColor(this.f173301a.getContext().getResources().getColor(C0966R.color.aol));
                return;
            }
            return;
        }
        if (textView2 != null) {
            textView2.setBackgroundResource(C0966R.C0969drawable.cq8);
        }
        if (textView2 != null) {
            textView2.setTextColor(this.f173301a.getContext().getResources().getColor(C0966R.color.aoo));
        }
        C9406j jVar2 = C9406j.f29357a;
        String str3 = p313.f184746d;
        C9406j.m9112f(jVar2, str3 == null ? "" : str3, 1, (String) null, (String) null, (Integer) null, 28, (Object) null);
        int i5 = i;
        if (i5 == 1) {
            if (textView2 != null) {
                textView2.setText(this.f173301a.getContext().getString(C0966R.string.ndi));
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new C9411d(p313, this, view4));
            }
        } else if (i5 != 2) {
            if (textView2 != null) {
                textView2.setText(this.f173301a.getContext().getString(C0966R.string.ndj));
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new C9413f(p313, this, view4));
            }
        } else {
            if (textView2 != null) {
                textView2.setText(this.f173301a.getContext().getString(C0966R.string.ndk));
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new C9412e(p313, this));
            }
        }
    }

    /* renamed from: d */
    public final void mo85748d(C64622p31 p312, C55006x0.C0697b bVar, View view, TextView textView) {
        C55006x0.C0697b bVar2 = bVar;
        View view2 = view;
        TextView textView2 = textView;
        boolean z = true;
        boolean u = C61926c.m72696u(p312.f184749g, 1);
        int i = bVar2.f1649b;
        if (!(1 <= i && i < 60) && !u) {
            z = false;
        }
        String str = this.f173303c;
        Log.m105924i(str, "refreshCountDownText isAttend:" + u + ", showCountDown:" + z + ", data.localRemainTime:" + bVar2.f1649b);
        TextView textView3 = view2 != null ? (TextView) view2.findViewById(C0966R.C0970id.oc7) : null;
        if (bVar2.f1649b <= 0 && u) {
            if (textView2 != null) {
                textView2.setText("");
            }
            if (textView3 != null) {
                textView3.setText(this.f173301a.getContext().getString(C0966R.string.nda));
            }
        } else if (z) {
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String a = C15936n0.C15937a.m14866a(C15936n0.f42815a, bVar2.f1649b, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null);
            if (textView2 != null) {
                textView2.setText(a);
            }
        } else if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshCountDownText", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo85749e(java.lang.String r20, boolean r21, boolean r22, wx3.C15601d<? super rx3.C13598b0> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof jh1.C60834n.C60835g
            if (r2 == 0) goto L_0x0017
            r2 = r1
            jh1.n$g r2 = (jh1.C60834n.C60835g) r2
            int r3 = r2.f173310i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f173310i = r3
            goto L_0x001c
        L_0x0017:
            jh1.n$g r2 = new jh1.n$g
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f173308g
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f173310i
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            boolean r3 = r2.f173307f
            boolean r4 = r2.f173306e
            java.lang.Object r2 = r2.f173305d
            jh1.n r2 = (jh1.C60834n) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0066
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r1)
            fh1.f1 r1 = r0.f173302b
            java.lang.Class<cl1.x0> r4 = cl1.C55006x0.class
            androidx.lifecycle.i0 r1 = r1.business(r4)
            cl1.x0 r1 = (cl1.C55006x0) r1
            android.view.View r4 = r0.f173301a
            android.content.Context r4 = r4.getContext()
            r2.f173305d = r0
            r6 = r21
            r2.f173306e = r6
            r7 = r22
            r2.f173307f = r7
            r2.f173310i = r5
            r8 = r20
            java.lang.Object r1 = r1.mo76054f3(r8, r4, r5, r2)
            if (r1 != r3) goto L_0x0063
            return r3
        L_0x0063:
            r2 = r0
            r4 = r6
            r3 = r7
        L_0x0066:
            te3.p31 r1 = (te3.C64622p31) r1
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = r2.f173303c
            java.lang.String r2 = "refreshLotteryContent lotteryInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0074:
            android.view.View r6 = r2.f173301a
            r7 = 2131308856(0x7f093138, float:1.823598E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.View r7 = r2.f173301a
            r8 = 2131308249(0x7f092ed9, float:1.8234748E38)
            android.view.View r7 = r7.findViewById(r8)
            android.view.View r8 = r2.f173301a
            r9 = 2131316612(0x7f094f84, float:1.825171E38)
            android.view.View r15 = r8.findViewById(r9)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r8)
            java.lang.Object[] r9 = r14.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r11 = "refreshLotteryContent"
            java.lang.String r12 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r8 = r6
            r20 = 8
            r13 = r16
            r5 = r14
            r14 = r17
            r21 = r15
            r15 = r18
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r15 = 0
            java.lang.Object r5 = r5.mo10231a(r15)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r10 = "refreshLotteryContent"
            java.lang.String r11 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            r5.mo10233c(r8)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r13 = "refreshLotteryContent"
            java.lang.String r14 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r21
            r9 = 0
            r15 = r8
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r8 = r21
            r8.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r12 = "refreshLotteryContent"
            java.lang.String r13 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r10 = r8
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            if (r7 != 0) goto L_0x0125
            r0 = 0
            goto L_0x0164
        L_0x0125:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r5.mo10233c(r10)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r12 = "refreshLotteryContent"
            java.lang.String r13 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r0 = 0
            r9 = r7
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget"
            java.lang.String r11 = "refreshLotteryContent"
            java.lang.String r12 = "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0164:
            java.lang.String r5 = "lotteryContent"
            if (r4 == 0) goto L_0x0172
            fh1.f1 r3 = r2.f173302b
            gy3.C87412m.m108593f(r7, r5)
            r4 = 1
            r3.mo9119F3(r6, r7, r4)
            goto L_0x017c
        L_0x0172:
            if (r3 == 0) goto L_0x017c
            fh1.f1 r3 = r2.f173302b
            gy3.C87412m.m108593f(r7, r5)
            r3.mo9119F3(r8, r7, r0)
        L_0x017c:
            r3 = 0
            if (r7 == 0) goto L_0x0187
            r4 = 2131308204(0x7f092eac, float:1.8234657E38)
            android.view.View r4 = r7.findViewById(r4)
            goto L_0x0188
        L_0x0187:
            r4 = r3
        L_0x0188:
            if (r4 == 0) goto L_0x0192
            jh1.n$h r5 = new jh1.n$h
            r5.<init>(r7, r2)
            r4.setOnClickListener(r5)
        L_0x0192:
            if (r7 == 0) goto L_0x019e
            r4 = 2131308263(0x7f092ee7, float:1.8234777E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L_0x019f
        L_0x019e:
            r4 = r3
        L_0x019f:
            if (r4 == 0) goto L_0x01a4
            er1.C7919x.m8091a(r4)
        L_0x01a4:
            te3.nx2 r4 = r1.f184748f
            if (r7 == 0) goto L_0x01b2
            r5 = 2131308229(0x7f092ec5, float:1.8234708E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            goto L_0x01b3
        L_0x01b2:
            r5 = r3
        L_0x01b3:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0201
            r5.setImageBitmap(r3)
            java.lang.String r8 = r2.f173303c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "prizeInfo?.img_url: "
            r9.append(r10)
            if (r4 == 0) goto L_0x01cb
            java.lang.String r10 = r4.f184575d
            goto L_0x01cc
        L_0x01cb:
            r10 = r3
        L_0x01cc:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            bl3.r r8 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            bl3.r$a r8 = r8.mo62446e(r9)
            java.lang.Class<pl1.s0> r9 = pl1.C11990s0.class
            bl3.c r8 = r8.mo62447c(r9)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            if (r4 == 0) goto L_0x01f2
            java.lang.String r10 = r4.f184575d
            if (r10 != 0) goto L_0x01f3
        L_0x01f2:
            r10 = r6
        L_0x01f3:
            up1.y r11 = up1.C27696y.RAW_IMAGE
            r9.<init>(r10, r11)
            l60.b r8 = r8.mo85955a(r9)
            l60.a r8 = (l60.C99342a) r8
            r8.mo85954d(r5)
        L_0x0201:
            if (r7 == 0) goto L_0x020d
            r8 = 2131300917(0x7f091235, float:1.8219877E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            goto L_0x020e
        L_0x020d:
            r8 = r3
        L_0x020e:
            if (r4 == 0) goto L_0x0218
            int r9 = r4.f184578g
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            goto L_0x0219
        L_0x0218:
            r10 = r3
        L_0x0219:
            if (r10 != 0) goto L_0x021c
            goto L_0x0255
        L_0x021c:
            int r9 = r10.intValue()
            r10 = 1
            if (r9 != r10) goto L_0x0255
            jh1.j r9 = jh1.C9406j.f29357a
            r10 = 1023(0x3ff, float:1.434E-42)
            te3.vh3 r11 = r4.f184579h
            if (r11 == 0) goto L_0x022f
            java.lang.String r12 = r11.f185894e
            if (r12 != 0) goto L_0x0230
        L_0x022f:
            r12 = r6
        L_0x0230:
            if (r11 == 0) goto L_0x0236
            java.lang.String r11 = r11.f185893d
            if (r11 != 0) goto L_0x0237
        L_0x0236:
            r11 = r6
        L_0x0237:
            r9.mo10129g(r10, r12, r11)
            if (r8 != 0) goto L_0x023d
            goto L_0x0240
        L_0x023d:
            r8.setVisibility(r0)
        L_0x0240:
            if (r5 == 0) goto L_0x024a
            jh1.n$i r0 = new jh1.n$i
            r0.<init>(r4, r2)
            r5.setOnClickListener(r0)
        L_0x024a:
            if (r8 == 0) goto L_0x026b
            jh1.n$j r0 = new jh1.n$j
            r0.<init>(r4, r2)
            r8.setOnClickListener(r0)
            goto L_0x026b
        L_0x0255:
            if (r8 != 0) goto L_0x0258
            goto L_0x025d
        L_0x0258:
            r0 = 8
            r8.setVisibility(r0)
        L_0x025d:
            if (r5 == 0) goto L_0x0264
            jh1.n$k r0 = jh1.C60834n.C9416k.f29378d
            r5.setOnClickListener(r0)
        L_0x0264:
            if (r8 == 0) goto L_0x026b
            jh1.n$l r0 = jh1.C60834n.C9417l.f29379d
            r8.setOnClickListener(r0)
        L_0x026b:
            if (r7 == 0) goto L_0x0277
            r0 = 2131308256(0x7f092ee0, float:1.8234762E38)
            android.view.View r0 = r7.findViewById(r0)
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x0277:
            if (r3 == 0) goto L_0x027c
            er1.C7919x.m8091a(r3)
        L_0x027c:
            if (r3 != 0) goto L_0x027f
            goto L_0x028b
        L_0x027f:
            te3.nx2 r0 = r1.f184748f
            if (r0 == 0) goto L_0x0288
            java.lang.String r0 = r0.f184576e
            if (r0 == 0) goto L_0x0288
            r6 = r0
        L_0x0288:
            r3.setText(r6)
        L_0x028b:
            r2.mo85751g(r7, r1)
            if (r7 == 0) goto L_0x0293
            r2.mo85750f(r7, r1)
        L_0x0293:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60834n.mo85749e(java.lang.String, boolean, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo85750f(View view, C64622p31 p312) {
        View view2 = view;
        C64622p31 p313 = p312;
        View findViewById = view2.findViewById(C0966R.C0970id.ogd);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.ogg);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
        TextView textView2 = (TextView) view2.findViewById(C0966R.C0970id.oha);
        if (textView2 != null) {
            C7919x.m8091a(textView2);
        }
        mo85747c(findViewById, textView2, view2, p313);
        View findViewById2 = view2.findViewById(C0966R.C0970id.oc6);
        TextView textView3 = (TextView) view2.findViewById(C0966R.C0970id.oc8);
        C55006x0.C0697b e3 = ((C55006x0) this.f173302b.business(C55006x0.class)).mo76053e3();
        if (e3 != null) {
            mo85748d(p313, e3, findViewById2, textView3);
        } else if (findViewById2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshParticipateStatus", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget", "refreshParticipateStatus", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f173304d = new C9418m(this, p312, findViewById2, textView3, findViewById, textView2, view);
    }

    /* renamed from: g */
    public final void mo85751g(View view, C64622p31 p312) {
        TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.ogh) : null;
        Context context = this.f173301a.getContext();
        C64594nx2 nx22 = p312.f184748f;
        long j = 0;
        long j2 = nx22 != null ? (long) nx22.f184577f : 0;
        C64300cx2 cx22 = p312.f184747e;
        boolean z = (cx22 != null ? cx22.f182602j : 0) > 0;
        C62042e eVar = C62042e.f176370a;
        String string = context.getString(C0966R.string.ndd, new Object[]{eVar.mo87005G(j2)});
        C87412m.m108593f(string, "context.getString(R.stri…formatNumber(prizeCount))");
        if (z) {
            C64300cx2 cx23 = p312.f184747e;
            if (cx23 != null) {
                j = (long) cx23.f182601i;
            }
            String string2 = context.getString(C0966R.string.nde, new Object[]{eVar.mo87005G(j)});
            C87412m.m108593f(string2, "context.getString(R.stri…ormatNumber(attendCount))");
            if (textView != null) {
                textView.setText(context.getString(C0966R.string.ndc, new Object[]{string, string2}));
            }
        } else if (textView != null) {
            textView.setText(string);
        }
    }
}
