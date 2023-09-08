package jh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C55006x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7919x;
import fh1.C58999c1;
import fh1.C8036f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jh1.C60838o;
import jq3.C9506m;
import jq3.C9507n;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nk1.C11207i;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64538lx2;
import te3.C64622p31;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jh1.q */
public final class C60845q extends C9506m<C60838o.C60839a> {

    /* renamed from: e */
    public final /* synthetic */ C60838o f173350e;

    /* renamed from: jh1.q$a */
    public static final class C60846a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60838o f173351d;

        /* renamed from: e */
        public final /* synthetic */ C60838o.C60839a f173352e;

        /* renamed from: f */
        public final /* synthetic */ C64538lx2 f173353f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {182}, mo125471m = "invokeSuspend")
        /* renamed from: jh1.q$a$a */
        public static final class C60847a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f173354d;

            /* renamed from: e */
            public final /* synthetic */ C60838o f173355e;

            /* renamed from: f */
            public final /* synthetic */ C64538lx2 f173356f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60847a(C60838o oVar, C64538lx2 lx22, C15601d<? super C60847a> dVar) {
                super(2, dVar);
                this.f173355e = oVar;
                this.f173356f = lx22;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C60847a(this.f173355e, this.f173356f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C60847a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f173354d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8036f1 f1Var = this.f173355e.f173316b;
                    C64538lx2 lx22 = this.f173356f;
                    String str = lx22 != null ? lx22.f184172j : null;
                    this.f173354d = 1;
                    if (f1Var.mo9123n3(str, true, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C60846a(C60838o oVar, C60838o.C60839a aVar, C64538lx2 lx22) {
            this.f173351d = oVar;
            this.f173352e = aVar;
            this.f173353f = lx22;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f173351d.f173317c, "participatedBtn clicked");
            if (!C60838o.m71237a(this.f173351d)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C0000n0 n0Var = this.f173352e.f29679z;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C60847a(this.f173351d, this.f173353f, (C15601d<? super C60847a>) null), 3, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.q$b */
    public static final class C60848b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64538lx2 f173357d;

        /* renamed from: e */
        public final /* synthetic */ C60838o f173358e;

        /* renamed from: f */
        public final /* synthetic */ C60838o.C60839a f173359f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {196}, mo125471m = "invokeSuspend")
        /* renamed from: jh1.q$b$a */
        public static final class C60849a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f173360d;

            /* renamed from: e */
            public final /* synthetic */ C60838o f173361e;

            /* renamed from: f */
            public final /* synthetic */ C64538lx2 f173362f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60849a(C60838o oVar, C64538lx2 lx22, C15601d<? super C60849a> dVar) {
                super(2, dVar);
                this.f173361e = oVar;
                this.f173362f = lx22;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C60849a(this.f173361e, this.f173362f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C60849a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f173360d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8036f1 f1Var = this.f173361e.f173316b;
                    C64538lx2 lx22 = this.f173362f;
                    String str = lx22 != null ? lx22.f184172j : null;
                    this.f173360d = 1;
                    if (f1Var.mo9123n3(str, true, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C60848b(C64538lx2 lx22, C60838o oVar, C60838o.C60839a aVar) {
            this.f173357d = lx22;
            this.f173358e = oVar;
            this.f173359f = aVar;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9406j jVar = C9406j.f29357a;
            C64538lx2 lx22 = this.f173357d;
            if (lx22 == null || (str = lx22.f184172j) == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 25, (String) null, (String) null, (Integer) null, 28, (Object) null);
            Log.m105924i(this.f173358e.f173317c, "lotteryBtn clicked");
            if (!C60838o.m71237a(this.f173358e)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C0000n0 n0Var = this.f173359f.f29679z;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C60849a(this.f173358e, this.f173357d, (C15601d<? super C60849a>) null), 3, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.q$c */
    public static final class C60850c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64538lx2 f173363d;

        /* renamed from: e */
        public final /* synthetic */ C60838o.C60839a f173364e;

        /* renamed from: f */
        public final /* synthetic */ C60838o f173365f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$initViews$2$1$_onBindViewHolder$3$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {213}, mo125471m = "invokeSuspend")
        /* renamed from: jh1.q$c$a */
        public static final class C60851a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f173366d;

            /* renamed from: e */
            public final /* synthetic */ C60838o f173367e;

            /* renamed from: f */
            public final /* synthetic */ C64538lx2 f173368f;

            /* renamed from: g */
            public final /* synthetic */ C60838o.C60839a f173369g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60851a(C60838o oVar, C64538lx2 lx22, C60838o.C60839a aVar, C15601d<? super C60851a> dVar) {
                super(2, dVar);
                this.f173367e = oVar;
                this.f173368f = lx22;
                this.f173369g = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C60851a(this.f173367e, this.f173368f, this.f173369g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C60851a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f173366d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C60838o oVar = this.f173367e;
                    C64538lx2 lx22 = this.f173368f;
                    this.f173366d = 1;
                    obj = oVar.mo85755c(lx22, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (((Boolean) obj).booleanValue()) {
                    TextView textView = this.f173369g.f173328F;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = this.f173369g.f173327E;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C60850c(C64538lx2 lx22, C60838o.C60839a aVar, C60838o oVar) {
            this.f173363d = lx22;
            this.f173364e = aVar;
            this.f173365f = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
            r2 = r0.f184172j;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r16) {
            /*
                r15 = this;
                r6 = r15
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r16
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$3"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r15
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                jh1.j r7 = jh1.C9406j.f29357a
                te3.lx2 r0 = r6.f173363d
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x002d
                java.lang.String r2 = r0.f184172j
                if (r2 != 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                r8 = r2
                goto L_0x002e
            L_0x002d:
                r8 = r1
            L_0x002e:
                r9 = 23
                r10 = 0
                if (r0 == 0) goto L_0x003a
                java.lang.String r0 = r0.f184170h
                if (r0 != 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r11 = r0
                goto L_0x003b
            L_0x003a:
                r11 = r1
            L_0x003b:
                r12 = 0
                r13 = 20
                r14 = 0
                jh1.C9406j.m9112f(r7, r8, r9, r10, r11, r12, r13, r14)
                jh1.o$a r0 = r6.f173364e
                a14.n0 r7 = r0.f29679z
                if (r7 == 0) goto L_0x0059
                r8 = 0
                r9 = 0
                jh1.q$c$a r10 = new jh1.q$c$a
                jh1.o r1 = r6.f173365f
                te3.lx2 r2 = r6.f173363d
                r3 = 0
                r10.<init>(r1, r2, r0, r3)
                r11 = 3
                r12 = 0
                a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            L_0x0059:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$3"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r15, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.C60845q.C60850c.onClick(android.view.View):void");
        }
    }

    /* renamed from: jh1.q$d */
    public static final class C60852d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60838o f173370d;

        /* renamed from: e */
        public final /* synthetic */ C64538lx2 f173371e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {230, 233}, mo125471m = "invokeSuspend")
        /* renamed from: jh1.q$d$a */
        public static final class C60853a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f173372d;

            /* renamed from: e */
            public final /* synthetic */ C64538lx2 f173373e;

            /* renamed from: f */
            public final /* synthetic */ C60838o f173374f;

            /* renamed from: jh1.q$d$a$a */
            public static final class C60854a extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C60838o f173375d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C60854a(C60838o oVar) {
                    super(1);
                    this.f173375d = oVar;
                }

                public Object invoke(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        this.f173375d.f173316b.mo9122m3();
                    } else {
                        View view = this.f173375d.f173315a;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60853a(C64538lx2 lx22, C60838o oVar, C15601d<? super C60853a> dVar) {
                super(2, dVar);
                this.f173373e = lx22;
                this.f173374f = oVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C60853a(this.f173373e, this.f173374f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C60853a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f173372d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C64538lx2 lx22 = this.f173373e;
                    if (lx22 == null || (str = lx22.f184172j) == null) {
                        str = "";
                    }
                    Context context = this.f173374f.f173315a.getContext();
                    this.f173372d = 1;
                    obj = ((C55006x0) this.f173374f.f173316b.business(C55006x0.class)).mo76054f3(str, context, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C64622p31 p312 = (C64622p31) obj;
                if (p312 == null) {
                    return C13598b0.f38549a;
                }
                View view = this.f173374f.f173315a;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C58999c1 c1Var = (C58999c1) this.f173374f.f173316b.controller(C58999c1.class);
                if (c1Var != null) {
                    C58999c1.C59000a aVar3 = C58999c1.C59000a.CUSTOM_OPEN;
                    C60854a aVar4 = new C60854a(this.f173374f);
                    this.f173372d = 2;
                    if (c1Var.mo84228F3(aVar3, p312, false, false, aVar4, this) == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C60852d(C60838o oVar, C64538lx2 lx22) {
            this.f173370d = oVar;
            this.f173371e = lx22;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60838o oVar = this.f173370d;
            C11207i.m11071g(oVar.f173316b, (C66212f) null, (C53934p0) null, new C60853a(this.f173371e, oVar, (C15601d<? super C60853a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60845q(C60838o oVar) {
        this.f173350e = oVar;
    }

    /* renamed from: F4 */
    public void mo10187F4(C9507n nVar, int i) {
        C60838o.C60839a aVar = (C60838o.C60839a) nVar;
        C87412m.m108594g(aVar, "holder");
        mo10188G4(aVar, i, new ArrayList());
    }

    /* renamed from: O4 */
    public C9507n mo10189O4(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d_e, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        C60838o.C60839a aVar = new C60838o.C60839a(inflate);
        TextView textView = aVar.f173327E;
        if (textView != null) {
            C7919x.m8091a(textView);
        }
        TextView textView2 = aVar.f173328F;
        if (textView2 != null) {
            C7919x.m8091a(textView2);
        }
        TextView textView3 = aVar.f173330H;
        if (textView3 != null) {
            C7919x.m8091a(textView3);
        }
        TextView textView4 = aVar.f173331I;
        if (textView4 != null) {
            C7919x.m8091a(textView4);
        }
        return aVar;
    }

    public int getItemCount() {
        return this.f173350e.f173319e.size();
    }

    /* renamed from: u5 */
    public void mo10188G4(C60838o.C60839a aVar, int i, List<Object> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C60838o.C60839a aVar2 = aVar;
        int i2 = i;
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(list, "payloads");
        C64538lx2 lx22 = (C64538lx2) C110818d0.m150917O(this.f173350e.f173319e, i2);
        if (lx22 == null) {
            View view = aVar2.f44854d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String str7 = this.f173350e.f173317c;
            Log.m105920e(str7, "_onBindViewHolder position:" + i2 + " data empty, dataList size:" + this.f173350e.f173319e.size());
        } else {
            View view2 = aVar2.f44854d;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        String str8 = this.f173350e.f173317c;
        StringBuilder sb = new StringBuilder();
        sb.append("bind position:");
        sb.append(i2);
        sb.append(", time:");
        sb.append(lx22 != null ? lx22.f184168f : null);
        sb.append(", title:");
        sb.append(lx22 != null ? lx22.f184166d : null);
        sb.append("sub_title:");
        sb.append(lx22 != null ? lx22.f184167e : null);
        sb.append("status:");
        sb.append(lx22 != null ? Integer.valueOf(lx22.f184169g) : null);
        sb.append(", isAttend:");
        sb.append(lx22 != null ? Integer.valueOf(lx22.f184173n) : null);
        sb.append(", isReserved:");
        sb.append(lx22 != null ? Integer.valueOf(lx22.f184171i) : null);
        Log.m105924i(str8, sb.toString());
        TextView textView = aVar2.f173323A;
        String str9 = "";
        if (textView != null) {
            if (lx22 == null || (str6 = lx22.f184168f) == null) {
                str6 = str9;
            }
            textView.setText(str6);
        }
        TextView textView2 = aVar2.f173324B;
        if (textView2 != null) {
            if (lx22 == null || (str5 = lx22.f184166d) == null) {
                str5 = str9;
            }
            textView2.setText(str5);
        }
        TextView textView3 = aVar2.f173325C;
        if (textView3 != null) {
            if (lx22 == null || (str4 = lx22.f184167e) == null) {
                str4 = str9;
            }
            textView3.setText(str4);
        }
        View view4 = aVar2.f173326D;
        if (view4 != null) {
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView4 = aVar2.f173327E;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        TextView textView5 = aVar2.f173328F;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        TextView textView6 = aVar2.f173331I;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        View view6 = aVar2.f173329G;
        if (view6 != null) {
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z = (lx22 != null ? lx22.f184173n : 0) > 0;
        boolean z2 = (lx22 != null ? lx22.f184171i : 0) > 0;
        View view8 = aVar2.f173332J;
        if (view8 != null) {
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view10 = aVar2.f173334L;
        if (view10 != null) {
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view11 = view10;
            C117292a.m165358d(view11, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view12 = aVar2.f173333K;
        if (view12 != null) {
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view13 = view12;
            C117292a.m165358d(view13, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i2 == this.f173350e.f173319e.size() - 1) {
            View view14 = aVar2.f173335M;
            if (view14 != null) {
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(8);
                View view15 = view14;
                C117292a.m165358d(view15, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view16 = aVar2.f173335M;
            if (view16 != null) {
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(0);
                View view17 = view16;
                C117292a.m165358d(view17, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        int i3 = lx22 != null ? lx22.f184169g : 0;
        if (i3 == 2) {
            View view18 = aVar2.f173334L;
            if (view18 != null) {
                C9556a aVar12 = new C9556a();
                aVar12.mo10233c(0);
                View view19 = view18;
                C117292a.m165358d(view19, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z) {
                TextView textView7 = aVar2.f173330H;
                if (textView7 != null) {
                    textView7.setText(this.f173350e.f173315a.getContext().getString(C0966R.string.ndl));
                }
                View view20 = aVar2.f173329G;
                if (view20 != null) {
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(0);
                    View view21 = view20;
                    C117292a.m165358d(view21, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view20.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view21, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view22 = aVar2.f173329G;
                if (view22 != null) {
                    view22.setOnClickListener(new C60846a(this.f173350e, aVar2, lx22));
                    return;
                }
                return;
            }
            C9406j jVar = C9406j.f29357a;
            if (!(lx22 == null || (str = lx22.f184172j) == null)) {
                str9 = str;
            }
            C9406j.m9112f(jVar, str9, 24, (String) null, (String) null, (Integer) null, 28, (Object) null);
            TextView textView8 = aVar2.f173331I;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = aVar2.f173331I;
            if (textView9 != null) {
                textView9.setOnClickListener(new C60848b(lx22, this.f173350e, aVar2));
            }
        } else if (i3 == 3) {
            View view23 = aVar2.f173333K;
            if (view23 != null) {
                C9556a aVar14 = new C9556a();
                aVar14.mo10233c(0);
                View view24 = view23;
                C117292a.m165358d(view24, aVar14.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view23.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                C117292a.m165359e(view24, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z2) {
                TextView textView10 = aVar2.f173328F;
                if (textView10 != null) {
                    textView10.setVisibility(0);
                    return;
                }
                return;
            }
            C9406j jVar2 = C9406j.f29357a;
            if (lx22 == null || (str2 = lx22.f184172j) == null) {
                str2 = str9;
            }
            C9406j.m9112f(jVar2, str2, 22, (String) null, (lx22 == null || (str3 = lx22.f184170h) == null) ? str9 : str3, (Integer) null, 20, (Object) null);
            TextView textView11 = aVar2.f173327E;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textView12 = aVar2.f173327E;
            if (textView12 != null) {
                textView12.setOnClickListener(new C60850c(lx22, aVar2, this.f173350e));
            }
        } else if (i3 != 4) {
            String str10 = this.f173350e.f173317c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i2);
            sb4.append(" button_status Unknown:");
            sb4.append(lx22 != null ? Integer.valueOf(lx22.f184169g) : null);
            Log.m105920e(str10, sb4.toString());
            View view25 = aVar2.f173326D;
            if (view25 != null) {
                C9556a aVar15 = new C9556a();
                aVar15.mo10233c(8);
                View view26 = view25;
                C117292a.m165358d(view26, aVar15.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                C117292a.m165359e(view26, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view27 = aVar2.f173332J;
            if (view27 != null) {
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(0);
                View view28 = view27;
                C117292a.m165358d(view28, aVar16.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                C117292a.m165359e(view28, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView13 = aVar2.f173330H;
            if (textView13 != null) {
                textView13.setText(this.f173350e.f173315a.getContext().getString(C0966R.string.ndg));
            }
            View view29 = aVar2.f173329G;
            if (view29 != null) {
                C9556a aVar17 = new C9556a();
                aVar17.mo10233c(0);
                View view30 = view29;
                C117292a.m165358d(view30, aVar17.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view29.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                C117292a.m165359e(view30, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view31 = aVar2.f173329G;
            if (view31 != null) {
                view31.setOnClickListener(new C60852d(this.f173350e, lx22));
            }
        }
    }
}
