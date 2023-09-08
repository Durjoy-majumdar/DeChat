package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.view.View;
import android.widget.TextView;
import cl1.C0691u1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
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
import nj3.C76912y0;
import ok1.C62042e;
import qo3.C101218e0;
import rx3.C13598b0;
import te3.C50415mk1;
import te3.C51503u71;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.i0 */
public final class C10163i0 extends C10535c {

    /* renamed from: h */
    public final String f31101h = "assistant.more.morefunction.gift";

    /* renamed from: kj1.i0$a */
    public static final class C10164a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10164a(C10125e1 e1Var) {
            super(0);
            this.f31102d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(((C54991o) this.f31102d.mo10534b(C54991o.class)).mo75963I3());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AssistantRewardOption$addItem$1$2", mo125469f = "AssistantRewardOption.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.i0$b */
    public static final class C10165b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31103d;

        /* renamed from: e */
        public Object f31104e;

        /* renamed from: f */
        public int f31105f;

        /* renamed from: g */
        public /* synthetic */ boolean f31106g;

        /* renamed from: h */
        public final /* synthetic */ C10163i0 f31107h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f31108i;

        /* renamed from: kj1.i0$b$a */
        public static final class C10166a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f31109d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f31110e;

            /* renamed from: f */
            public final /* synthetic */ C10163i0 f31111f;

            /* renamed from: g */
            public final /* synthetic */ SafeResume<Boolean> f31112g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10166a(boolean z, C10125e1 e1Var, C10163i0 i0Var, SafeResume<Boolean> safeResume) {
                super(2);
                this.f31109d = z;
                this.f31110e = e1Var;
                this.f31111f = i0Var;
                this.f31112g = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                String str;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                Class cls = C54116w.class;
                Class cls2 = C54108o.class;
                String string = this.f31109d ? this.f31110e.f30985d.getResources().getString(C0966R.string.dol) : this.f31110e.f30985d.getResources().getString(C0966R.string.doe);
                C87412m.m108593f(string, "if (check) {\n           …                        }");
                boolean z = true;
                String str2 = null;
                if (booleanValue) {
                    if (!this.f31109d) {
                        C10163i0 i0Var = this.f31111f;
                        C10125e1 e1Var = this.f31110e;
                        i0Var.getClass();
                        Class cls3 = C0691u1.class;
                        C87412m.m108594g(e1Var, "<this>");
                        C51503u71 value = ((C0691u1) e1Var.mo10534b(cls3)).f1637f.getValue();
                        if (value == null || !value.f142641d) {
                            z = false;
                        }
                        if (z) {
                            ((C0691u1) e1Var.mo10534b(cls3)).f1640i.postValue(new C0691u1.C0692a());
                        }
                    }
                    if (!this.f31109d) {
                        C76912y0.m92768g(this.f31110e.f30985d, string);
                    }
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f31109d ? C54067f0.C0064m.GIFT_OPEN : C54067f0.C0064m.GIFT_CLOSE, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
                    if (this.f31109d) {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c2).Hx0(8, (String) null);
                    } else {
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c3).Hx0(7, (String) null);
                    }
                } else if (!(!this.f31109d || mk12 == null || (str = mk12.f138082e) == null)) {
                    if (str.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        str2 = str;
                    }
                    if (str2 != null) {
                        C10125e1 e1Var2 = this.f31110e;
                        C101218e0 e0Var = new C101218e0(e1Var2.f30985d, 2, 2, true, true);
                        e0Var.mo140677w(MMApplicationContext.getContext().getResources().getString(C0966R.string.f8028zq));
                        e0Var.mo140676v(6);
                        TextView textView = new TextView(e1Var2.f30985d);
                        textView.setPaddingRelative((int) textView.getContext().getResources().getDimension(C0966R.dimen.f3743cv), 0, 0, 0);
                        textView.setText(C0966R.string.dxf);
                        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3585yj));
                        textView.setTextSize(17.0f);
                        e0Var.mo140672r(textView);
                        TextView textView2 = new TextView(e1Var2.f30985d);
                        textView2.setText(str2);
                        textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.f3585yj));
                        textView2.setTextSize(15.0f);
                        e0Var.mo140663j(textView2);
                        e0Var.f296375F = new C10173j0(e0Var);
                        e0Var.mo140655A();
                    }
                }
                this.f31112g.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10165b(C10163i0 i0Var, C10125e1 e1Var, C15601d<? super C10165b> dVar) {
            super(2, dVar);
            this.f31107h = i0Var;
            this.f31108i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10165b bVar = new C10165b(this.f31107h, this.f31108i, dVar);
            bVar.f31106g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10165b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31105f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f31106g;
                C10536d.m10457e(this.f31107h, false, 1, (Object) null);
                C10125e1 e1Var = this.f31108i;
                C10163i0 i0Var = this.f31107h;
                this.f31103d = e1Var;
                this.f31104e = i0Var;
                this.f31106g = z;
                this.f31105f = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                e1Var.mo10537e(128, z, true, new C10166a(z, e1Var, i0Var, new SafeResume(mVar)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10163i0 i0Var2 = (C10163i0) this.f31104e;
                C10125e1 e1Var2 = (C10125e1) this.f31103d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10163i0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31101h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return !C62042e.f176370a.mo87057Y0(this.f31809a.f30982b) && ((C54991o) this.f31809a.mo10534b(C54991o.class)).f154243Q1;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        View view = v0Var.f18463f;
        boolean I3 = ((C54991o) e1Var.mo10534b(C54991o.class)).mo75963I3();
        View findViewById = view.findViewById(C0966R.C0970id.ck_);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.mbd);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.o47, I3);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10164a(e1Var), new C10165b(this, e1Var, (C15601d<? super C10165b>) null));
        }
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(I3 ? C54067f0.C0066n.GIFT_CLOSE : C54067f0.C0066n.GIFT_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.oo8);
    }
}
