package il1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import m53.C10757d;
import qj1.C12677tg;
import qj1.C62660c;
import qo3.C12925w;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: il1.z2 */
public final class C9184z2 extends C9120u0 implements View.OnClickListener {

    /* renamed from: y */
    public static final /* synthetic */ int f28896y = 0;

    /* renamed from: h */
    public C32226l<? super C12677tg.C12678a, C13598b0> f28897h;

    /* renamed from: i */
    public C32227p<? super C12677tg.C12678a, ? super Boolean, C13598b0> f28898i;

    /* renamed from: j */
    public C12925w f28899j;

    /* renamed from: n */
    public final View f28900n;

    /* renamed from: o */
    public final View f28901o;

    /* renamed from: p */
    public final TextView f28902p;

    /* renamed from: q */
    public final TextView f28903q;

    /* renamed from: r */
    public final TextView f28904r;

    /* renamed from: s */
    public final ImageView f28905s;

    /* renamed from: t */
    public final TextView f28906t;

    /* renamed from: u */
    public C0000n0 f28907u = C53930o0.m60555b();

    /* renamed from: v */
    public C8916d f28908v;

    /* renamed from: w */
    public C12677tg.C12678a f28909w = C12677tg.C12678a.DEFAULT;

    /* renamed from: x */
    public long f28910x;

    /* renamed from: il1.z2$a */
    public static final class C9185a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9184z2 f28911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9185a(C9184z2 z2Var) {
            super(0);
            this.f28911d = z2Var;
        }

        public Object invoke() {
            C32226l<C12677tg.C12678a, C13598b0> wecoinClickCallBack;
            C9184z2 z2Var = this.f28911d;
            if (z2Var.f28899j == null && (wecoinClickCallBack = z2Var.getWecoinClickCallBack()) != null) {
                wecoinClickCallBack.invoke(this.f28911d.f28909w);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.z2$b */
    public static final class C9186b implements C10757d.C10758a {

        /* renamed from: a */
        public final /* synthetic */ C9184z2 f28912a;

        public C9186b(C9184z2 z2Var) {
            this.f28912a = z2Var;
        }

        /* renamed from: a */
        public final void mo9998a(C10757d dVar, Boolean bool) {
            C32226l<C12677tg.C12678a, C13598b0> wecoinClickCallBack;
            C9184z2 z2Var = this.f28912a;
            if (z2Var.f28899j == null && (wecoinClickCallBack = z2Var.getWecoinClickCallBack()) != null) {
                wecoinClickCallBack.invoke(this.f28912a.f28909w);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9184z2(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ag5, this, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…n_widget_ui, this, false)");
        this.f28900n = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.ctu);
        this.f28901o = findViewById;
        this.f28902p = (TextView) inflate.findViewById(C0966R.C0970id.ctw);
        this.f28903q = (TextView) inflate.findViewById(C0966R.C0970id.fe6);
        this.f28904r = (TextView) inflate.findViewById(C0966R.C0970id.f358486fe2);
        this.f28905s = (ImageView) inflate.findViewById(C0966R.C0970id.fe4);
        this.f28906t = (TextView) inflate.findViewById(C0966R.C0970id.fe5);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358485fe1);
        ((ImageView) inflate.findViewById(C0966R.C0970id.css)).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        textView.setOnClickListener(this);
        setTextBold(textView);
    }

    /* renamed from: b */
    public final void mo9999b(int i) {
        C10757d dVar;
        C54795n5 D0;
        if (this.f28900n.getContext() instanceof FragmentActivity) {
            C62660c basePlugin = getBasePlugin();
            if (basePlugin == null || (D0 = basePlugin.mo14476D0()) == null) {
                dVar = null;
            } else {
                Context context = this.f28900n.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                dVar = D0.mo75699C((FragmentActivity) context, i, new C9185a(this));
            }
            if (dVar != null) {
                dVar.mo11002a(new C9186b(this));
            }
        }
    }

    public final C32227p<C12677tg.C12678a, Boolean, C13598b0> getJoinCallBack() {
        return this.f28898i;
    }

    public final C32226l<C12677tg.C12678a, C13598b0> getWecoinClickCallBack() {
        return this.f28897h;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.css) {
            C12925w wVar = this.f28899j;
            if (wVar != null) {
                wVar.mo5085n();
            }
            this.f28899j = null;
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ctu) {
            C12925w wVar2 = this.f28899j;
            if (wVar2 != null) {
                wVar2.mo5085n();
            }
            this.f28899j = null;
            mo9999b(1);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358485fe1) {
            if (C58739j4.f168176a.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Yx0((C54116w) c, C54067f0.C0069t0.JOIN_GIFT_CLICK, (Boolean) null, this.f28909w, 2, (Object) null);
            C53895h.m60466d(this.f28907u, (C66212f) null, (C53934p0) null, new C9156w2(this, (C15601d<? super C9156w2>) null), 3, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setJoinCallBack(C32227p<? super C12677tg.C12678a, ? super Boolean, C13598b0> pVar) {
        this.f28898i = pVar;
    }

    public final void setWecoinClickCallBack(C32226l<? super C12677tg.C12678a, C13598b0> lVar) {
        this.f28897h = lVar;
    }
}
