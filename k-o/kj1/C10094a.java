package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import lj1.C10535c;
import lj1.C10536d;
import nk1.C61791o;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.a */
public final class C10094a extends C10535c {

    /* renamed from: h */
    public final String f30889h;

    /* renamed from: kj1.a$a */
    public static final class C10095a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10094a f30890d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f30891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10095a(C10094a aVar, C10125e1 e1Var) {
            super(0);
            this.f30890d = aVar;
            this.f30891e = e1Var;
        }

        public Object invoke() {
            C10094a aVar = this.f30890d;
            C10125e1 e1Var = this.f30891e;
            aVar.getClass();
            C87412m.m108594g(e1Var, "<this>");
            return Boolean.valueOf(C61926c.m72696u(((C54991o) e1Var.mo10534b(C54991o.class)).f154354q, 8192));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorAnonymousOption$addItem$1$2", mo125469f = "AnchorAnonymousOption.kt", mo125470l = {120}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.a$b */
    public static final class C10096b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f30892d;

        /* renamed from: e */
        public /* synthetic */ boolean f30893e;

        /* renamed from: f */
        public final /* synthetic */ C10094a f30894f;

        /* renamed from: g */
        public final /* synthetic */ C10125e1 f30895g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10096b(C10094a aVar, C10125e1 e1Var, C15601d<? super C10096b> dVar) {
            super(2, dVar);
            this.f30894f = aVar;
            this.f30895g = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10096b bVar = new C10096b(this.f30894f, this.f30895g, dVar);
            bVar.f30893e = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10096b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30892d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f30893e;
                C10536d.m10457e(this.f30894f, false, 1, (Object) null);
                C10094a aVar2 = this.f30894f;
                C10125e1 e1Var = this.f30895g;
                boolean j = aVar2.mo10805j();
                this.f30892d = 1;
                aVar2.getClass();
                Class cls = C55001u.class;
                Class cls2 = C54991o.class;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                SafeResume safeResume = new SafeResume(mVar);
                Log.m105924i(e1Var.f30980a, "switchVisitorAnonymous isEnable:" + z + ", isLiving:" + j);
                if (z) {
                    ((C54991o) e1Var.mo10534b(cls2)).f154354q |= 8192;
                } else {
                    ((C54991o) e1Var.mo10534b(cls2)).f154354q &= -8193;
                }
                if (j) {
                    int i2 = z ? 2 : 3;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("element", 6);
                    jSONObject.put("type", 0);
                    jSONObject.put("sub_element", 1);
                    jSONObject.put("sub_type", i2);
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
                }
                if (!j) {
                    safeResume.resume(Boolean.TRUE);
                } else {
                    C10101b bVar = new C10101b(e1Var, safeResume);
                    C61791o.f175673a.mo86722d("VisitorAnonymous", ((C54991o) e1Var.mo10534b(cls2)).f154354q);
                    FinderLiveService.f159376d.getClass();
                    C54795n5 n5Var = FinderLiveService.f159396y;
                    if (n5Var != null) {
                        C54795n5.C54796a.m61727e(n5Var, ((C55001u) e1Var.mo10534b(cls)).f154420q.f182392d, ((C55001u) e1Var.mo10534b(cls)).f154416j, ((C54991o) e1Var.mo10534b(cls2)).f154354q, 8192, 0, bVar, 16, (Object) null);
                    }
                }
                Object o = mVar.mo74608o();
                return o == aVar ? aVar : o;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10094a(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30889h = mo10805j() ? "anchorlive.more.morefunction.hidenick" : "startlive.more.morefunction.hidenick";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30889h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r0 = r0.mo10555b();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10519k() {
        /*
            r2 = this;
            boolean r0 = r2.mo10805j()
            if (r0 == 0) goto L_0x0013
            kj1.e1 r0 = r2.f31809a
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo10534b(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154378w
            goto L_0x002b
        L_0x0013:
            kj1.e1 r0 = r2.f31809a
            kj1.e1$d r0 = r0.f30989h
            if (r0 == 0) goto L_0x0022
            fe1.q r0 = r0.mo10555b()
            if (r0 == 0) goto L_0x0022
            long r0 = r0.field_liveSwitchFlag
            goto L_0x0024
        L_0x0022:
            r0 = 0
        L_0x0024:
            int r1 = (int) r0
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = o40.C61926c.m72696u(r1, r0)
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10094a.mo10519k():boolean");
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C10125e1 e1Var2 = e1Var;
        C4191v0 v0Var2 = v0Var;
        C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var2, "<this>");
        C87412m.m108594g(v0Var2, "bottomSheet");
        View view = v0Var2.f18463f;
        boolean u = C61926c.m72696u(((C54991o) e1Var2.mo10534b(C54991o.class)).f154354q, 8192);
        if (mo10519k()) {
            View findViewById = view.findViewById(C0966R.C0970id.cik);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = view.findViewById(C0966R.C0970id.lkd);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            LoadingSwitchBtn d = e1Var2.mo10536d(view, C0966R.C0970id.o3z, u);
            C0000n0 h = mo10803h();
            if (h != null) {
                d.mo4816f(h, new C10095a(this, e1Var2), new C10096b(this, e1Var2, (C15601d<? super C10096b>) null));
            }
            if (u) {
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.SHOW_AUDIENCE_NICKNAME, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
            } else {
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.HIDE_AUDIENCE_NICKNAME, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
            }
            if (mo10805j()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("element", 6);
                jSONObject.put("type", 0);
                jSONObject.put("sub_element", 1);
                jSONObject.put("sub_type", 1);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
                return;
            }
            return;
        }
        View findViewById3 = view.findViewById(C0966R.C0970id.cik);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view4 = findViewById3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = view.findViewById(C0966R.C0970id.lkd);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view5 = findViewById4;
        C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.aeu);
    }
}
