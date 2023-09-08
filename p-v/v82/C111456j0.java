package v82;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105883g;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.ScreenCastBigView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultiTalkAvatarLayout;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76912y0;
import p626nv.C109759g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import u82.C52476a;
import w82.C111759e;
import w82.C111770k;
import x82.C112112p;
import x82.C112113q;
import z82.C112612a;

/* renamed from: v82.j0 */
public final class C111456j0 {

    /* renamed from: a */
    public final MultiTalkMainUI f333691a;

    /* renamed from: b */
    public final C13601g f333692b = C36568h.m40985a(new C90761v(this));

    /* renamed from: c */
    public final C13601g f333693c = C36568h.m40985a(new C90753e(this));

    /* renamed from: d */
    public final C13601g f333694d = C36568h.m40985a(new C111457b(this));

    /* renamed from: e */
    public final C13601g f333695e = C36568h.m40985a(new C90756n(this));

    /* renamed from: f */
    public final C13601g f333696f = C36568h.m40985a(new C90751a(this));

    /* renamed from: g */
    public final C13601g f333697g = C36568h.m40985a(new C90759t(this));

    /* renamed from: h */
    public final C13601g f333698h = C36568h.m40985a(new C90760u(this));

    /* renamed from: i */
    public final C13601g f333699i = C36568h.m40985a(new C90754k(this));

    /* renamed from: j */
    public final C13601g f333700j = C36568h.m40985a(new C111465q(this));

    /* renamed from: k */
    public final C13601g f333701k = C36568h.m40985a(new C90755l(this));

    /* renamed from: l */
    public final C13601g f333702l = C36568h.m40985a(new C111463m(this));

    /* renamed from: m */
    public final C13601g f333703m = C36568h.m40985a(new C111459f(this));

    /* renamed from: n */
    public final C111770k f333704n = new C111770k(this);

    /* renamed from: o */
    public final C13601g f333705o = C36568h.m40985a(new C90757p(this));

    /* renamed from: p */
    public final C13601g f333706p = C36568h.m40985a(new C90758s(this));

    /* renamed from: q */
    public final C13601g f333707q = C36568h.m40985a(new C90752c(this));

    /* renamed from: r */
    public String f333708r = "";

    /* renamed from: s */
    public final C0120a0<String> f333709s = new C111466r(this);

    /* renamed from: t */
    public C112612a f333710t;

    /* renamed from: u */
    public boolean f333711u = true;

    /* renamed from: v */
    public boolean f333712v;

    /* renamed from: w */
    public final C13601g f333713w = C36568h.m40985a(new C111464o(this));

    /* renamed from: x */
    public final C0120a0<Boolean> f333714x = new C111458d(this);

    /* renamed from: v82.j0$g */
    public static final class C37698g extends C87413o implements C32227p<Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C37698g f99885d = new C37698g();

        public C37698g() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            ((Boolean) obj2).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v82.j0$a */
    public static final class C90751a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90751a(C111456j0 j0Var) {
            super(0);
            this.f260645d = j0Var;
        }

        public Object invoke() {
            return this.f260645d.f333691a.findViewById(C0966R.C0970id.f358791h41);
        }
    }

    /* renamed from: v82.j0$c */
    public static final class C90752c extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90752c(C111456j0 j0Var) {
            super(0);
            this.f260646d = j0Var;
        }

        public Object invoke() {
            return (WeImageView) this.f260646d.f333691a.findViewById(C0966R.C0970id.amh);
        }
    }

    /* renamed from: v82.j0$e */
    public static final class C90753e extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90753e(C111456j0 j0Var) {
            super(0);
            this.f260647d = j0Var;
        }

        public Object invoke() {
            View findViewById = this.f260647d.f333691a.findViewById(C0966R.C0970id.kc4);
            C111456j0 j0Var = this.f260647d;
            FrameLayout frameLayout = (FrameLayout) findViewById;
            j0Var.f333691a.getLayoutInflater().inflate(C0966R.C0971layout.cjf, frameLayout, true);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += C85875k4.m106198o(j0Var.f333691a) + C76577a.m92151b(j0Var.f333691a, 12);
            frameLayout.setLayoutParams(layoutParams2);
            return frameLayout;
        }
    }

    /* renamed from: v82.j0$k */
    public static final class C90754k extends C87413o implements C32224a<WeImageButton> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90754k(C111456j0 j0Var) {
            super(0);
            this.f260648d = j0Var;
        }

        public Object invoke() {
            return (WeImageButton) this.f260648d.f333691a.findViewById(C0966R.C0970id.h4f);
        }
    }

    /* renamed from: v82.j0$l */
    public static final class C90755l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90755l(C111456j0 j0Var) {
            super(0);
            this.f260649d = j0Var;
        }

        public Object invoke() {
            return this.f260649d.f333691a.findViewById(C0966R.C0970id.h37);
        }
    }

    /* renamed from: v82.j0$n */
    public static final class C90756n extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90756n(C111456j0 j0Var) {
            super(0);
            this.f260650d = j0Var;
        }

        public Object invoke() {
            return this.f260650d.f333691a.findViewById(C0966R.C0970id.h4u);
        }
    }

    /* renamed from: v82.j0$p */
    public static final class C90757p extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90757p(C111456j0 j0Var) {
            super(0);
            this.f260651d = j0Var;
        }

        public Object invoke() {
            return (RelativeLayout) this.f260651d.f333691a.findViewById(C0966R.C0970id.j2z);
        }
    }

    /* renamed from: v82.j0$s */
    public static final class C90758s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90758s(C111456j0 j0Var) {
            super(0);
            this.f260652d = j0Var;
        }

        public Object invoke() {
            return (TextView) this.f260652d.f333691a.findViewById(C0966R.C0970id.kky);
        }
    }

    /* renamed from: v82.j0$t */
    public static final class C90759t extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90759t(C111456j0 j0Var) {
            super(0);
            this.f260653d = j0Var;
        }

        public Object invoke() {
            return this.f260653d.f333691a.findViewById(C0966R.C0970id.kr_);
        }
    }

    /* renamed from: v82.j0$u */
    public static final class C90760u extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90760u(C111456j0 j0Var) {
            super(0);
            this.f260654d = j0Var;
        }

        public Object invoke() {
            return this.f260654d.f333691a.findViewById(C0966R.C0970id.krg);
        }
    }

    /* renamed from: v82.j0$v */
    public static final class C90761v extends C87413o implements C32224a<C105883g> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f260655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90761v(C111456j0 j0Var) {
            super(0);
            this.f260655d = j0Var;
        }

        public Object invoke() {
            return (C105883g) C39818r.f106831a.mo62444c(this.f260655d.f333691a).mo75002a(C105883g.class);
        }
    }

    /* renamed from: v82.j0$b */
    public static final class C111457b extends C87413o implements C32224a<MultiTalkAvatarLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111457b(C111456j0 j0Var) {
            super(0);
            this.f333715d = j0Var;
        }

        public Object invoke() {
            return (MultiTalkAvatarLayout) ((FrameLayout) ((C36570n) this.f333715d.f333693c).getValue()).findViewById(C0966R.C0970id.kbw);
        }
    }

    /* renamed from: v82.j0$d */
    public static final class C111458d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333716d;

        public C111458d(C111456j0 j0Var) {
            this.f333716d = j0Var;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                MultiTalkAvatarLayout c = this.f333716d.mo163152c();
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                c.getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayout", "selectUser: " + s);
                C111759e eVar = c.f315084d.get(s);
                if (eVar != null) {
                    if (!(eVar.f334682h != c.f315088h)) {
                        eVar = null;
                    }
                    if (eVar != null) {
                        c.mo150986b(eVar);
                    }
                }
            }
        }
    }

    /* renamed from: v82.j0$f */
    public static final class C111459f extends C87413o implements C32224a<C111474m> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111459f(C111456j0 j0Var) {
            super(0);
            this.f333717d = j0Var;
        }

        public Object invoke() {
            C111474m mVar = new C111474m(this.f333717d.f333691a);
            mVar.f333755q = new C111472l0(this.f333717d);
            return mVar;
        }
    }

    /* renamed from: v82.j0$h */
    public /* synthetic */ class C111460h extends C24565l implements C32227p<Integer, Boolean, C13598b0> {
        public C111460h(Object obj) {
            super(2, obj, C111474m.class, "checkNeedFold", "checkNeedFold(IZ)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C111474m) this.receiver).mo163177b(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v82.j0$i */
    public static final class C111461i<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333718d;

        public C111461i(C111456j0 j0Var) {
            this.f333718d = j0Var;
        }

        public void onChanged(Object obj) {
            Object obj2;
            List list = (List) obj;
            C111770k kVar = this.f333718d.f333704n;
            C87412m.m108593f(list, LocaleUtil.ITALIAN);
            kVar.getClass();
            C8477a0 a0Var = new C8477a0();
            if (list.size() != ((ArrayList) kVar.f334706c).size()) {
                C111770k.m152391b(kVar, a0Var, list);
                return;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((C105882d) obj2).mo150900a()) {
                    break;
                }
            }
            a0Var.f27482d = obj2 != null;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!C87412m.m108589b(C110818d0.m150917O(kVar.f334706c, i), list.get(i))) {
                    C111770k.m152391b(kVar, a0Var, list);
                    return;
                }
            }
        }
    }

    /* renamed from: v82.j0$j */
    public static final class C111462j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333719d;

        public C111462j(C111456j0 j0Var) {
            this.f333719d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$inflateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f333719d.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onMiniMultitalkClicked");
            C105853x.f314823a++;
            C105851w0.zx0().mo150626C(true);
            C105853x.m142230a(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$inflateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: v82.j0$m */
    public static final class C111463m extends C87413o implements C32224a<C52476a> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111463m(C111456j0 j0Var) {
            super(0);
            this.f333720d = j0Var;
        }

        public Object invoke() {
            C111456j0 j0Var = this.f333720d;
            MultiTalkMainUI multiTalkMainUI = j0Var.f333691a;
            View h = j0Var.mo163157h();
            C87412m.m108593f(h, "multitalkScreenProjectorAction");
            View g = this.f333720d.mo163156g();
            C87412m.m108593f(g, "multiScreenProjectRedDot");
            return new C52476a(multiTalkMainUI, h, "screenShare", g);
        }
    }

    /* renamed from: v82.j0$o */
    public static final class C111464o extends C87413o implements C32224a<C0120a0<List<? extends C105882d>>> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111464o(C111456j0 j0Var) {
            super(0);
            this.f333721d = j0Var;
        }

        public Object invoke() {
            return new C111489t0(this.f333721d);
        }
    }

    /* renamed from: v82.j0$q */
    public static final class C111465q extends C87413o implements C32224a<ScreenCastBigView> {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111465q(C111456j0 j0Var) {
            super(0);
            this.f333722d = j0Var;
        }

        public Object invoke() {
            return (ScreenCastBigView) this.f333722d.f333691a.findViewById(C0966R.C0970id.kc5);
        }
    }

    /* renamed from: v82.j0$r */
    public static final class C111466r<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C111456j0 f333723d;

        public C111466r(C111456j0 j0Var) {
            this.f333723d = j0Var;
        }

        public void onChanged(Object obj) {
            C112113q qVar;
            C112112p pVar;
            String str = (String) obj;
            C112612a aVar = this.f333723d.f333710t;
            if (!(aVar == null || (qVar = aVar.f337244f) == null || (pVar = qVar.f335669h) == null)) {
                pVar.mo163842d();
            }
            if (this.f333723d.f333708r.length() == 0) {
                ((TextView) ((C36570n) this.f333723d.f333706p).getValue()).setText(str);
            }
        }
    }

    public C111456j0(MultiTalkMainUI multiTalkMainUI) {
        C87412m.m108594g(multiTalkMainUI, "mainUI");
        this.f333691a = multiTalkMainUI;
    }

    /* renamed from: a */
    public final void mo163150a() {
        if (C87412m.m108589b(mo163161l().f314939i.getValue(), Boolean.TRUE)) {
            MultiTalkMainUI multiTalkMainUI = this.f333691a;
            C76912y0.m92773l(multiTalkMainUI, multiTalkMainUI.getResources().getString(C0966R.string.ifa));
        }
        mo163161l().mo150904d3(Boolean.FALSE);
    }

    /* renamed from: b */
    public final void mo163151b() {
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "dismissView viewShowing: " + this.f333712v);
        this.f333712v = false;
        FrameLayout frameLayout = (FrameLayout) ((C36570n) this.f333693c).getValue();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            mo163152c().setOnMaxYChanged(C37698g.f99885d);
            mo163152c().setLayoutAdapter((C111770k) null);
        }
        mo163154e().f333763y = null;
        mo163162m();
        mo163161l().f314943p.removeObserver(this.f333709s);
        mo163161l().f314939i.removeObserver(this.f333714x);
    }

    /* renamed from: c */
    public final MultiTalkAvatarLayout mo163152c() {
        return (MultiTalkAvatarLayout) ((C36570n) this.f333694d).getValue();
    }

    /* renamed from: d */
    public final WeImageView mo163153d() {
        return (WeImageView) ((C36570n) this.f333707q).getValue();
    }

    /* renamed from: e */
    public final C111474m mo163154e() {
        return (C111474m) ((C36570n) this.f333703m).getValue();
    }

    /* renamed from: f */
    public final WeImageButton mo163155f() {
        return (WeImageButton) ((C36570n) this.f333699i).getValue();
    }

    /* renamed from: g */
    public final View mo163156g() {
        return (View) ((C36570n) this.f333701k).getValue();
    }

    /* renamed from: h */
    public final View mo163157h() {
        return (View) ((C36570n) this.f333695e).getValue();
    }

    /* renamed from: i */
    public final ScreenCastBigView mo163158i() {
        return (ScreenCastBigView) ((C36570n) this.f333700j).getValue();
    }

    /* renamed from: j */
    public final View mo163159j() {
        return (View) ((C36570n) this.f333697g).getValue();
    }

    /* renamed from: k */
    public final View mo163160k() {
        return (View) ((C36570n) this.f333698h).getValue();
    }

    /* renamed from: l */
    public final C105883g mo163161l() {
        return (C105883g) ((C36570n) this.f333692b).getValue();
    }

    /* renamed from: m */
    public final void mo163162m() {
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "hidePageElement: ");
        if (this.f333711u) {
            this.f333711u = false;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            View k = mo163160k();
            if (k != null) {
                k.setAnimation(alphaAnimation);
            }
            View k2 = mo163160k();
            if (k2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view = k2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View j = mo163159j();
            if (j != null) {
                j.setAnimation(alphaAnimation);
            }
            View j2 = mo163159j();
            if (j2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view2 = j2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C111474m e = mo163154e();
            e.getClass();
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(150);
            View view3 = e.f333758t;
            if (view3 != null) {
                view3.setAnimation(alphaAnimation2);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: n */
    public final void mo163163n() {
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "inflateView viewShowing: " + this.f333712v);
        this.f333712v = true;
        View findViewById = this.f333691a.findViewById(C0966R.C0970id.kfq);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((FrameLayout) ((C36570n) this.f333693c).getValue()).setVisibility(0);
        View view2 = (View) ((C36570n) this.f333696f).getValue();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo163152c().setLayoutAdapter(this.f333704n);
        mo163152c().setOnMaxYChanged(new C111460h(mo163154e()));
        mo163154e().mo163183h(false, false);
        mo163161l().f314941n.observe(this.f333691a, new C111461i(this));
        View findViewById2 = this.f333691a.findViewById(C0966R.C0970id.kfr);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo163155f().setOnClickListener(new C111462j(this));
        if (C85875k4.m106208w() || C85985z2.m106332d(this.f333691a.getTaskId())) {
            mo163153d().setVisibility(0);
            mo163153d().setOnClickListener(new C90762n0(this));
        }
        if (C85875k4.m106209x(this.f333691a.getTaskId())) {
            mo163153d().setBackground(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_merge, -1));
        } else {
            mo163153d().setBackground(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_sperated, -1));
        }
        if (BuildInfo.IS_ARM64) {
            View h = mo163157h();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            C117292a.m165358d(h, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(h, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View h2 = mo163157h();
            MultiTalkMainUI multiTalkMainUI = this.f333691a;
            h2.setBackground(C74933u4.m89768e(multiTalkMainUI, C0966R.raw.icons_outlined_board, multiTalkMainUI.getResources().getColor(C0966R.color.f2975b6)));
            if (!C104331h.m139310a()) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k((C52476a) ((C36570n) this.f333702l).getValue());
            } else {
                View g = mo163156g();
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view4 = g;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo163157h().setOnClickListener(new C111469k0(this));
        } else {
            View h3 = mo163157h();
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            C117292a.m165358d(h3, aVar6.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(h3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View g2 = mo163156g();
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view5 = g2;
            C117292a.m165358d(view5, aVar7.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo163166q();
        mo163161l().f314939i.removeObserver(this.f333714x);
        mo163161l().f314939i.observe(this.f333691a, this.f333714x);
        mo163161l().f314943p.observe(this.f333691a, this.f333709s);
    }

    /* renamed from: o */
    public final void mo163164o(int i) {
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkChangeMobileNet: " + i);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.f333691a.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        if (((float) displayMetrics.heightPixels) / displayMetrics.density <= 540.0f) {
            MultiTalkMainUI multiTalkMainUI = this.f333691a;
            C76912y0.m92774m(multiTalkMainUI, multiTalkMainUI.getString(C0966R.string.keq));
            return;
        }
        C111474m e = mo163154e();
        e.getClass();
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "showNetWorkChangeMobileNet: " + i);
        e.mo163182g(1, i, C0966R.string.keq);
    }

    /* renamed from: p */
    public final void mo163165p(int i) {
        boolean z;
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: " + i);
        if (C105724z.INSTANCE.f314414t < 3600 || C105724z.f314341E1) {
            z = false;
        } else {
            z = true;
            C105724z.f314341E1 = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: real show " + i);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.f333691a.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.heightPixels) / displayMetrics.density <= 540.0f) {
                MultiTalkMainUI multiTalkMainUI = this.f333691a;
                C76912y0.m92774m(multiTalkMainUI, multiTalkMainUI.getString(C0966R.string.kem));
                return;
            }
            C111474m e = mo163154e();
            e.getClass();
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "showNetWorkCostMax: " + i);
            e.mo163182g(2, i, C0966R.string.kem);
        }
    }

    /* renamed from: q */
    public final void mo163166q() {
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showPageElement: ");
        if (!this.f333711u) {
            this.f333711u = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            mo163160k().setAnimation(alphaAnimation);
            View k = mo163160k();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = k;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo163159j().setAnimation(alphaAnimation);
            View j = mo163159j();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = j;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C111474m e = mo163154e();
            e.getClass();
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(150);
            View view3 = e.f333758t;
            if (view3 != null) {
                view3.setAnimation(alphaAnimation2);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: r */
    public final void mo163167r(boolean z) {
        if (z) {
            mo163155f().setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_back, -1));
            mo163155f().setIconColor(-1);
            mo163160k().getLayoutParams().height = C76577a.m92151b(this.f333691a, 52) + C85875k4.m106198o(this.f333691a);
            mo163160k().setBackgroundColor(this.f333691a.getResources().getColor(C0966R.color.f3285m7));
            View h = mo163157h();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = h;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) ((C36570n) this.f333696f).getValue();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo163153d().setVisibility(8);
            return;
        }
        mo163155f().setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_mini_windows_new, -1));
        mo163155f().setIconColor(-1);
        ViewGroup.LayoutParams layoutParams = mo163160k().getLayoutParams();
        MultiTalkMainUI multiTalkMainUI = this.f333691a;
        layoutParams.height = C76577a.m92150a(multiTalkMainUI, multiTalkMainUI.getResources().getDimension(C0966R.dimen.afw));
        mo163160k().setBackground(this.f333691a.getResources().getDrawable(C0966R.C0969drawable.ai_));
        View h2 = mo163157h();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view4 = h2;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = (View) ((C36570n) this.f333696f).getValue();
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (C85875k4.m106208w() || C85985z2.m106332d(this.f333691a.getTaskId())) {
            mo163153d().setVisibility(0);
        }
    }
}
