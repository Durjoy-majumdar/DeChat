package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
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
import rx3.C13598b0;
import te3.C50415mk1;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.f0 */
public final class C10140f0 extends C10535c {

    /* renamed from: h */
    public final String f31056h = "assistant.more.morefunction.like";

    /* renamed from: kj1.f0$a */
    public static final class C10141a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10141a(C10125e1 e1Var) {
            super(0);
            this.f31057d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C62042e.f176370a.mo87078f1(this.f31057d.f30982b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AssistantLikeOption$addItem$1$2", mo125469f = "AssistantLikeOption.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.f0$b */
    public static final class C10142b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31058d;

        /* renamed from: e */
        public int f31059e;

        /* renamed from: f */
        public /* synthetic */ boolean f31060f;

        /* renamed from: g */
        public final /* synthetic */ C10140f0 f31061g;

        /* renamed from: h */
        public final /* synthetic */ C10125e1 f31062h;

        /* renamed from: kj1.f0$b$a */
        public static final class C10143a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f31063d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f31064e;

            /* renamed from: f */
            public final /* synthetic */ SafeResume<Boolean> f31065f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10143a(boolean z, C10125e1 e1Var, SafeResume<Boolean> safeResume) {
                super(2);
                this.f31063d = z;
                this.f31064e = e1Var;
                this.f31065f = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                Resources resources;
                int i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                Class cls = C54116w.class;
                Class cls2 = C54108o.class;
                if (booleanValue) {
                    String string = this.f31063d ? this.f31064e.f30985d.getResources().getString(C0966R.string.dwu) : this.f31064e.f30985d.getResources().getString(C0966R.string.f360637dx2);
                    C87412m.m108593f(string, "if (check) {\n           …                        }");
                    if (!this.f31063d) {
                        C76912y0.m92768g(this.f31064e.f30985d, string);
                    }
                    Bundle bundle = new Bundle();
                    boolean z = this.f31063d;
                    C10125e1 e1Var = this.f31064e;
                    bundle.putBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", z);
                    e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_LIKE_SWITCH, bundle);
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f31063d ? C54067f0.C0064m.LIKE_OPEN : C54067f0.C0064m.LIKE_CLOSE, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
                    if (this.f31063d) {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c2).Hx0(10, (String) null);
                    } else {
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c3).Hx0(9, (String) null);
                    }
                } else {
                    if (this.f31063d) {
                        resources = this.f31064e.f30985d.getResources();
                        i = C0966R.string.dwt;
                    } else {
                        resources = this.f31064e.f30985d.getResources();
                        i = C0966R.string.f360636dx1;
                    }
                    String string2 = resources.getString(i);
                    C87412m.m108593f(string2, "if (check) context.resou…ive_more_action_ban_like)");
                    MMActivity mMActivity = this.f31064e.f30985d;
                    C76912y0.m92763b(mMActivity, string2 + MMApplicationContext.getContext().getResources().getString(C0966R.string.f360496d80));
                }
                this.f31065f.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10142b(C10140f0 f0Var, C10125e1 e1Var, C15601d<? super C10142b> dVar) {
            super(2, dVar);
            this.f31061g = f0Var;
            this.f31062h = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10142b bVar = new C10142b(this.f31061g, this.f31062h, dVar);
            bVar.f31060f = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10142b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31059e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f31060f;
                C10536d.m10457e(this.f31061g, false, 1, (Object) null);
                C10125e1 e1Var = this.f31062h;
                this.f31058d = e1Var;
                this.f31060f = z;
                this.f31059e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                e1Var.mo10537e(512, !z, true, new C10143a(z, e1Var, new SafeResume(mVar)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10125e1 e1Var2 = (C10125e1) this.f31058d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10140f0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31056h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return ((C54991o) this.f31809a.mo10534b(C54991o.class)).f154392z;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        View view = v0Var.f18463f;
        boolean f1 = C62042e.f176370a.mo87078f1(e1Var.f30982b);
        View findViewById = view.findViewById(C0966R.C0970id.ck_);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.lkj);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AssistantLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.f359329o41, f1);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10141a(e1Var), new C10142b(this, e1Var, (C15601d<? super C10142b>) null));
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.k_v);
    }
}
