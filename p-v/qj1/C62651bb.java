package qj1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d60.C58124b;
import dh1.C7329b;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qg1.C62615o;
import qj1.C62966ri;
import qo3.C12925w;
import qo3.C89779i0;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63959n;
import te3.C49494g01;
import te3.C64722t51;
import te3.C64822x51;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.bb */
public final class C62651bb implements C62966ri {

    /* renamed from: d */
    public final Context f177914d;

    /* renamed from: e */
    public final C45795b f177915e;

    /* renamed from: f */
    public final C58124b f177916f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f177917g;

    /* renamed from: h */
    public C63956k f177918h;

    /* renamed from: i */
    public final String f177919i = "FinderLiveMpArticleBubble";

    /* renamed from: j */
    public ViewGroup f177920j;

    /* renamed from: n */
    public C89779i0 f177921n;

    /* renamed from: o */
    public C53973z1 f177922o;

    /* renamed from: qj1.bb$a */
    public static final class C62652a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62651bb f177923d;

        /* renamed from: e */
        public final /* synthetic */ C63959n f177924e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveMpArticleBubble$refreshView$1$1", mo125469f = "FinderLiveMpArticleBubble.kt", mo125470l = {128}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.bb$a$a */
        public static final class C62653a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f177925d;

            /* renamed from: e */
            public final /* synthetic */ C62651bb f177926e;

            /* renamed from: qj1.bb$a$a$a */
            public static final class C62654a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C62651bb f177927d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62654a(C62651bb bbVar) {
                    super(0);
                    this.f177927d = bbVar;
                }

                public Object invoke() {
                    C62651bb bbVar = this.f177927d;
                    Context context = bbVar.f177914d;
                    bbVar.f177921n = C89779i0.m112248e(context, context.getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62653a(C62651bb bbVar, C15601d<? super C62653a> dVar) {
                super(2, dVar);
                this.f177926e = bbVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C62653a(this.f177926e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62653a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f177925d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f177925d = 1;
                    if (C53965x0.m60607b(1000, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C61926c.m72668M(new C62654a(this.f177926e));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qj1.bb$a$b */
        public static final class C62655b<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C62651bb f177928a;

            /* renamed from: b */
            public final /* synthetic */ C63959n f177929b;

            public C62655b(C62651bb bbVar, C63959n nVar) {
                this.f177928a = bbVar;
                this.f177929b = nVar;
            }

            public Object call(Object obj) {
                C13598b0 b0Var;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                C53973z1 z1Var = this.f177928a.f177922o;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C89779i0 i0Var = this.f177928a.f177921n;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C89349b bVar = ((C49494g01) cVar.f256796d).f133757d;
                    if (bVar == null) {
                        return null;
                    }
                    C63959n nVar = this.f177929b;
                    C62651bb bbVar = this.f177928a;
                    C64722t51 t512 = new C64722t51();
                    t512.parseFrom(bVar.mo123703f());
                    nVar.getClass();
                    nVar.f181311s = t512;
                    ((C54979h1) bbVar.f177915e.mo71262a(C54979h1.class)).mo75948o3(nVar);
                    String str = ((C49494g01) cVar.f256796d).f133758e;
                    if (!(str == null || str.length() == 0) || ((Boolean) C32444a.f86204u2.mo60266n()).booleanValue()) {
                        C12925w wVar = new C12925w(bbVar.f177914d);
                        wVar.mo12469i(true);
                        wVar.mo12472l(Boolean.TRUE);
                        View inflate = View.inflate(bbVar.f177914d, C0966R.C0971layout.cx8, (ViewGroup) null);
                        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
                        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
                        TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.mr9);
                        TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.mr8);
                        if (((Boolean) C32444a.f86204u2.mo60266n()).booleanValue()) {
                            textView.setText("这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案");
                        } else {
                            textView.setText(((C49494g01) cVar.f256796d).f133758e);
                        }
                        textView2.setOnClickListener(new C62673cb(nVar, wVar, bbVar));
                        wVar.mo12471k(roundedCornerFrameLayout);
                        wVar.mo5086o();
                        b0Var = C13598b0.f38549a;
                    } else {
                        String str2 = nVar.f181311s.f185504g;
                        if (str2 == null) {
                            return null;
                        }
                        C62651bb.m73629a(bbVar, str2);
                        b0Var = C13598b0.f38549a;
                    }
                    return b0Var;
                }
                String str3 = this.f177929b.f181311s.f185504g;
                if (str3 == null) {
                    return null;
                }
                C62651bb.m73629a(this.f177928a, str3);
                return C13598b0.f38549a;
            }
        }

        public C62652a(C62651bb bbVar, C63959n nVar) {
            this.f177923d = bbVar;
            this.f177924e = nVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f177923d.f177919i;
            Log.m105924i(str, "click to mp article,url:" + this.f177924e.f181311s.f185504g);
            C32226l<? super C63956k, C13598b0> lVar = this.f177923d.f177917g;
            if (lVar != null) {
                lVar.invoke(this.f177924e);
            }
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f177923d.f177915e;
            String str2 = this.f177924e.f181311s.f185504g;
            if (str2 == null) {
                str2 = "";
            }
            C7329b.m7474c(bVar, bVar2, 5, 2, str2, 0, (String) null, 0, 112, (Object) null);
            if (((C54991o) this.f177923d.f177915e.mo71262a(C54991o.class)).mo75990Y3()) {
                C58124b bVar3 = this.f177923d.f177916f;
                C56032b bVar4 = bVar3 instanceof C56032b ? (C56032b) bVar3 : null;
                if (!(bVar4 == null || (dVar = (C60085d) bVar4.getPlugin(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                    eVar.mo84956b();
                }
            }
            C53973z1 z1Var = this.f177923d.f177922o;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C89779i0 i0Var = this.f177923d.f177921n;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C63959n nVar = this.f177924e;
            if (nVar.f181294g) {
                C62651bb bbVar = this.f177923d;
                bbVar.f177922o = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C62653a(bbVar, (C15601d<? super C62653a>) null), 3, (Object) null);
                C55001u uVar = (C55001u) this.f177923d.f177915e.mo71262a(C55001u.class);
                C63959n nVar2 = this.f177924e;
                new C62615o(uVar.f154416j, uVar.f154420q.f182392d, 2, nVar2.f181293f, new C89349b(nVar2.f181311s.toByteArray()), (String) null, (String) null, (String) null, 128, (C8480h) null).mo9225i().mo123420E(new C62655b(this.f177923d, nVar2));
            } else {
                String str3 = nVar.f181311s.f185504g;
                if (str3 != null) {
                    C62651bb.m73629a(this.f177923d, str3);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.bb$b */
    public static final class C62656b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62651bb f177930d;

        /* renamed from: e */
        public final /* synthetic */ C63959n f177931e;

        public C62656b(C62651bb bbVar, C63959n nVar) {
            this.f177930d = bbVar;
            this.f177931e = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f177930d.f177919i;
            Log.m105924i(str, "close promote, url:" + this.f177931e.f181311s.f185504g);
            C7329b.m7474c(C7329b.f25441a, this.f177930d.f177915e, 2, 2, (String) null, 0, (String) null, 0, 120, (Object) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63959n nVar = this.f177931e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = nVar.f181291d;
                x512.f186254d = 2;
                x512.f186256f = new C89349b(nVar.f181311s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C62651bb(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f177914d = context;
        this.f177915e = bVar;
        this.f177916f = bVar2;
        this.f177917g = lVar;
        this.f177918h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.aez, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f177920j = (ViewGroup) inflate;
    }

    /* renamed from: a */
    public static final void m73629a(C62651bb bbVar, String str) {
        bbVar.getClass();
        Intent intent = new Intent();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C87412m.m108593f(buildUpon, "parse(url).buildUpon()");
        buildUpon.appendQueryParameter(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "221");
        String uri = buildUpon.build().toString();
        C87412m.m108593f(uri, "builder.build().toString()");
        if (C58739j4.f168176a.mo83692U()) {
            Context context = bbVar.f177914d;
            C76912y0.makeText(context, (CharSequence) "url: " + uri, 0).show();
        }
        intent.putExtra("rawUrl", uri);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(bbVar.f177914d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63959n) {
            C63959n nVar = (C63959n) obj;
            mo87679b(nVar);
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f177915e;
            String str = nVar.f181311s.f185504g;
            if (str == null) {
                str = "";
            }
            C7329b.m7474c(bVar, bVar2, 1, 2, str, 0, (String) null, 0, 112, (Object) null);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f177918h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: b */
    public final void mo87679b(C63959n nVar) {
        C63959n nVar2 = nVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ViewGroup viewGroup = this.f177920j;
        if (viewGroup != null) {
            ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.dte);
            ViewGroup viewGroup2 = this.f177920j;
            if (viewGroup2 != null) {
                TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.f358219dx2);
                ViewGroup viewGroup3 = this.f177920j;
                if (viewGroup3 != null) {
                    TextView textView2 = (TextView) viewGroup3.findViewById(C0966R.C0970id.f358218dx1);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    ViewGroup viewGroup4 = this.f177920j;
                    if (viewGroup4 != null) {
                        View findViewById = viewGroup4.findViewById(C0966R.C0970id.f358111dh0);
                        C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                        C11984n0 n0Var = new C11984n0(nVar2.f181311s.f185503f, C27696y.RAW_IMAGE);
                        C87412m.m108593f(imageView, "thumbView");
                        f2.mo85957c(n0Var, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MP_ARTICE));
                        textView.setText(nVar2.f181311s.f185501d);
                        textView2.setText(nVar2.f181311s.f185505h);
                        ViewGroup viewGroup5 = this.f177920j;
                        if (viewGroup5 != null) {
                            viewGroup5.setOnClickListener(new C62652a(this, nVar2));
                            if (C62042e.f176370a.mo87032P0(this.f177915e)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = findViewById;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setOnClickListener(new C62656b(this, nVar2));
                            return;
                        }
                        C87412m.m108603p("root");
                        throw null;
                    }
                    C87412m.m108603p("root");
                    throw null;
                }
                C87412m.m108603p("root");
                throw null;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f177920j;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63959n) {
            mo87679b((C63959n) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
