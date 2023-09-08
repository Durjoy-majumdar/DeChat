package wf1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C0700z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58739j4;
import f14.C58901s;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import pe3.C89349b;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C51084rb1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wf1.i0 */
public final class C15184i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f41343d;

    /* renamed from: e */
    public final /* synthetic */ boolean f41344e;

    /* renamed from: f */
    public final /* synthetic */ C15193l f41345f;

    /* renamed from: g */
    public final /* synthetic */ TextView f41346g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {599, 601}, mo125471m = "invokeSuspend")
    /* renamed from: wf1.i0$a */
    public static final class C15185a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f41347d;

        /* renamed from: e */
        public /* synthetic */ Object f41348e;

        /* renamed from: f */
        public final /* synthetic */ C15193l f41349f;

        /* renamed from: g */
        public final /* synthetic */ TextView f41350g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1$1$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wf1.i0$a$a */
        public static final class C15186a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C13604l<Boolean, String> f41351d;

            /* renamed from: e */
            public final /* synthetic */ TextView f41352e;

            /* renamed from: f */
            public final /* synthetic */ C15193l f41353f;

            /* renamed from: wf1.i0$a$a$a */
            public static final class C15187a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C15193l f41354d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C15187a(C15193l lVar) {
                    super(0);
                    this.f41354d = lVar;
                }

                public Object invoke() {
                    LiveMutableData<Boolean> liveMutableData;
                    Log.m105924i(this.f41354d.f41381d, "buy success, finish");
                    FinderLiveService.f159376d.getClass();
                    C45795b bVar = FinderLiveService.f159348A;
                    if (!(bVar == null || (liveMutableData = ((C0700z) bVar.mo71262a(C0700z.class)).f1664p) == null)) {
                        liveMutableData.postValue(Boolean.FALSE);
                    }
                    this.f41354d.getActivity().finish();
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15186a(C13604l<Boolean, String> lVar, TextView textView, C15193l lVar2, C15601d<? super C15186a> dVar) {
                super(2, dVar);
                this.f41351d = lVar;
                this.f41352e = textView;
                this.f41353f = lVar2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15186a(this.f41351d, this.f41352e, this.f41353f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15186a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) this.f41351d.f38555d).booleanValue()) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, Boolean.TRUE);
                    C76912y0.m92769h(this.f41352e.getContext(), this.f41352e.getContext().getString(C0966R.string.n8u), C0966R.raw.icons_outlined_done);
                    C61926c.m72666K(1000, new C15187a(this.f41353f));
                } else {
                    C76912y0.m92773l(this.f41353f.getActivity(), this.f41353f.getActivity().getString(C0966R.string.n8t));
                    String str = this.f41353f.f41381d;
                    Log.m105924i(str, "[finderPayFullWholeProcess] errCode:" + ((String) this.f41351d.f38556e));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15185a(C15193l lVar, TextView textView, C15601d<? super C15185a> dVar) {
            super(2, dVar);
            this.f41349f = lVar;
            this.f41350g = textView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C15185a aVar = new C15185a(this.f41349f, this.f41350g, dVar);
            aVar.f41348e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15185a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C0000n0 n0Var;
            C0000n0 n0Var2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f41347d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var3 = (C0000n0) this.f41348e;
                C15193l lVar = this.f41349f;
                this.f41348e = n0Var3;
                this.f41347d = 1;
                Object d3 = C15193l.m14279d3(lVar, this);
                if (d3 == aVar) {
                    return aVar;
                }
                Object obj2 = d3;
                n0Var2 = n0Var3;
                obj = obj2;
            } else if (i == 1) {
                n0Var2 = (C0000n0) this.f41348e;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                n0Var = (C0000n0) this.f41348e;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C15186a((C13604l) obj, this.f41350g, this.f41349f, (C15601d<? super C15186a>) null), 2, (Object) null);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C51084rb1 rb12 = (C51084rb1) obj;
            if (rb12 != null) {
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                AppCompatActivity activity = this.f41349f.getActivity();
                C89349b bVar = rb12.f140805e;
                byte[] f = bVar != null ? bVar.mo123703f() : null;
                if (f == null) {
                    f = new byte[0];
                }
                String str = this.f41349f.f41374G;
                this.f41348e = n0Var2;
                this.f41347d = 2;
                obj = t1Var.mo76835bI(activity, f, str, this);
                if (obj == aVar) {
                    return aVar;
                }
                n0Var = n0Var2;
                C53896h0 h0Var2 = C53872d1.f151117a;
                C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C15186a((C13604l) obj, this.f41350g, this.f41349f, (C15601d<? super C15186a>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1$2", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {629}, mo125471m = "invokeSuspend")
    /* renamed from: wf1.i0$b */
    public static final class C15188b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f41355d;

        /* renamed from: e */
        public final /* synthetic */ TextView f41356e;

        /* renamed from: f */
        public final /* synthetic */ C15193l f41357f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15188b(TextView textView, C15193l lVar, C15601d<? super C15188b> dVar) {
            super(2, dVar);
            this.f41356e = textView;
            this.f41357f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15188b(this.f41356e, this.f41357f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15188b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f41355d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f41356e.getContext();
                C87412m.m108593f(context, "context");
                this.f41355d = 1;
                obj = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76811Tc(context, 0, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) ((C13604l) obj).f38555d).booleanValue()) {
                C15193l.m14280e3(this.f41357f);
            }
            return C13598b0.f38549a;
        }
    }

    public C15184i0(C77407n nVar, boolean z, C15193l lVar, TextView textView) {
        this.f41343d = nVar;
        this.f41344e = z;
        this.f41345f = lVar;
        this.f41346g = textView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f41343d.mo107572p();
        if (this.f41344e) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C15185a(this.f41345f, this.f41346g, (C15601d<? super C15185a>) null), 2, (Object) null);
        } else {
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C15188b(this.f41346g, this.f41345f, (C15601d<? super C15188b>) null), 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
