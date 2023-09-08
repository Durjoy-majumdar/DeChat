package kj1;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import al1.C54130j;
import android.view.View;
import android.widget.TextView;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9247b;
import it1.C9252f;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import lj1.C10535c;
import lj1.C10536d;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import wi1.C15408c;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.m */
public final class C10189m extends C10535c {

    /* renamed from: h */
    public final String f31158h;

    /* renamed from: kj1.m$a */
    public static final class C10190a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10190a(C10125e1 e1Var) {
            super(0);
            this.f31159d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C61926c.m72696u(((C54991o) this.f31159d.mo10534b(C54991o.class)).f154354q, 16384));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorMicIntercomOption$addItem$1$2", mo125469f = "AnchorMicIntercomOption.kt", mo125470l = {124}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.m$b */
    public static final class C10191b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31160d;

        /* renamed from: e */
        public Object f31161e;

        /* renamed from: f */
        public int f31162f;

        /* renamed from: g */
        public /* synthetic */ boolean f31163g;

        /* renamed from: h */
        public final /* synthetic */ C10189m f31164h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f31165i;

        /* renamed from: kj1.m$b$a */
        public static final class C10192a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31166d;

            /* renamed from: e */
            public final /* synthetic */ C53916l<Boolean> f31167e;

            /* renamed from: f */
            public final /* synthetic */ boolean f31168f;

            /* renamed from: g */
            public final /* synthetic */ C10189m f31169g;

            /* renamed from: h */
            public final /* synthetic */ SafeResume<Boolean> f31170h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10192a(C10125e1 e1Var, C53916l<? super Boolean> lVar, boolean z, C10189m mVar, SafeResume<Boolean> safeResume) {
                super(0);
                this.f31166d = e1Var;
                this.f31167e = lVar;
                this.f31168f = z;
                this.f31169g = mVar;
                this.f31170h = safeResume;
            }

            public Object invoke() {
                MMActivity mMActivity = this.f31166d.f30985d;
                String string = mMActivity.getResources().getString(C0966R.string.ett);
                C10205p pVar = C10205p.f31186d;
                C9247b bVar = new C9247b();
                bVar.f28992c = 500;
                new WeakReference(mMActivity);
                C9252f fVar = new C9252f();
                if (string != null) {
                    fVar.f28996c = string;
                }
                fVar.f28997d = pVar;
                fVar.f28999a = new WeakReference<>(mMActivity);
                bVar.f28991b = fVar;
                bVar.begin();
                this.f31167e.mo74599v(new C10197n(bVar));
                boolean z = this.f31168f;
                C10209q.f31190a = z;
                this.f31166d.mo10537e(16384, z, this.f31169g.mo10805j(), new C10201o(this.f31168f, this.f31166d, this.f31170h));
                bVar.mo8913b();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10191b(C10189m mVar, C10125e1 e1Var, C15601d<? super C10191b> dVar) {
            super(2, dVar);
            this.f31164h = mVar;
            this.f31165i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10191b bVar = new C10191b(this.f31164h, this.f31165i, dVar);
            bVar.f31163g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10191b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C54963d0.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31162f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f31163g;
                C10536d.m10457e(this.f31164h, false, 1, (Object) null);
                C10125e1 e1Var = this.f31165i;
                C10189m mVar = this.f31164h;
                this.f31160d = e1Var;
                this.f31161e = mVar;
                this.f31163g = z;
                this.f31162f = 1;
                C53921m mVar2 = new C53921m(C66447b.m78392b(this), 1);
                mVar2.mo74609p();
                SafeResume safeResume = new SafeResume(mVar2);
                List<C54130j> list = ((C54963d0) e1Var.mo10534b(cls)).f154074q;
                int size = list != null ? list.size() : 0;
                boolean u = C61926c.m72696u(((C54991o) e1Var.mo10534b(C54991o.class)).f154354q, 64);
                String str = e1Var.f30980a;
                Log.m105924i(str, "SHEET_MORE_ACTION_MIC_INTERCOM " + size + " isOpenMic: " + u + " flag: " + ((C54963d0) e1Var.mo10534b(cls)).f154079v);
                if ((u || size != 0 || C10184l.f31150a) && z) {
                    C76912y0.m92763b(e1Var.f30985d, MMApplicationContext.getContext().getResources().getString(C0966R.string.fq5));
                    safeResume.resume(Boolean.FALSE);
                    C10209q.f31190a = false;
                } else {
                    MMActivity mMActivity = e1Var.f30985d;
                    C10192a aVar2 = new C10192a(e1Var, mVar2, z, mVar, safeResume);
                    C87412m.m108594g(mMActivity, "context");
                    C85801v1 i2 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINDER_LIVE_MIC_INTERCOM_GUIDE_TYPE_INT_SYNC;
                    if (i2.mo119689j(aVar3, 0) == 0) {
                        new C15408c(mMActivity, aVar2).mo3431p();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, 1);
                    } else {
                        aVar2.invoke();
                    }
                }
                obj = mVar2.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10189m mVar3 = (C10189m) this.f31161e;
                C10125e1 e1Var2 = (C10125e1) this.f31160d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10189m(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31158h = mo10805j() ? "anchorlive.more.morefunction.mictalking" : "startlive.more.morefunction.mictalking";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31158h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10519k() {
        /*
            r6 = this;
            boolean r0 = r6.mo10805j()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0034
            ok1.e r0 = ok1.C62042e.f176370a
            kj1.e1 r3 = r6.f31809a
            fj1.b r3 = r3.f30982b
            boolean r3 = r0.mo87051W0(r3)
            if (r3 != 0) goto L_0x005f
            kj1.e1 r3 = r6.f31809a
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r3.mo10534b(r4)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154268V1
            if (r3 == 0) goto L_0x005f
            boolean r3 = r0.mo87027N0()
            if (r3 == 0) goto L_0x0030
            boolean r0 = r0.mo87030O0()
            if (r0 != 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x005f
            goto L_0x005e
        L_0x0034:
            kj1.e1 r0 = r6.f31809a
            kj1.e1$d r0 = r0.f30989h
            if (r0 == 0) goto L_0x0040
            int r3 = r0.f31035a
            if (r3 != r2) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x005f
            ok1.e r3 = ok1.C62042e.f176370a
            if (r0 == 0) goto L_0x0050
            fe1.q r0 = r0.mo10555b()
            if (r0 == 0) goto L_0x0050
            long r4 = r0.field_liveSwitchFlag
            goto L_0x0052
        L_0x0050:
            r4 = 0
        L_0x0052:
            r3.getClass()
            int r0 = (int) r4
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10189m.mo10519k():boolean");
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C10125e1 e1Var2 = e1Var;
        C4191v0 v0Var2 = v0Var;
        C87412m.m108594g(e1Var2, "<this>");
        C87412m.m108594g(v0Var2, "bottomSheet");
        View view = v0Var2.f18463f;
        boolean u = C61926c.m72696u(((C54991o) e1Var2.mo10534b(C54991o.class)).f154354q, 16384);
        String str = e1Var2.f30980a;
        StringBuilder sb = new StringBuilder();
        sb.append("isSecondDevice:");
        C62042e eVar = C62042e.f176370a;
        sb.append(eVar.mo87027N0() && !eVar.mo87030O0());
        Log.m105924i(str, sb.toString());
        View findViewById = view.findViewById(C0966R.C0970id.bst);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorMicIntercomOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMicIntercomOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.m9g);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorMicIntercomOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMicIntercomOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.bm4);
        if (textView != null) {
            textView.setText(e1Var2.f30985d.getString(C0966R.string.n9b, new Object[]{String.valueOf(C32444a.f86064I.mo60266n().intValue())}));
        }
        LoadingSwitchBtn d = e1Var2.mo10536d(view, C0966R.C0970id.o45, u);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.setDelayLoading((C9247b) null);
            d.mo4816f(h, new C10190a(e1Var2), new C10191b(this, e1Var2, (C15601d<? super C10191b>) null));
            return;
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.omv);
    }
}
