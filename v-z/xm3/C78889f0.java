package xm3;

import ac2.C53999e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.mvvm.uic.base.SelectContactSearchMvvmListUIC$buildItemConvertFactory$1;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import jq3.C60898l;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64957k;
import tm3.C64958n;
import tm3.C64961s;
import tm3.C78052b0;
import tm3.C78054c0;
import tm3.C78056e;
import tm3.C78060i;
import tm3.C78062l;
import tm3.C78069w;
import tm3.C78071z;
import z04.C112550d0;
import zb2.C103009m;
import zb2.C53769h;
import zb2.C79317n;

/* renamed from: xm3.f0 */
public class C78889f0 extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231746d = C36568h.m40985a(new C78898g(this));

    /* renamed from: e */
    public final C13601g f231747e;

    /* renamed from: f */
    public final C13601g f231748f;

    /* renamed from: g */
    public MvvmList<C77020b> f231749g;

    /* renamed from: h */
    public C103009m<C77020b> f231750h;

    /* renamed from: i */
    public View f231751i;

    /* renamed from: j */
    public boolean f231752j;

    /* renamed from: n */
    public final C13601g f231753n;

    /* renamed from: xm3.f0$a */
    public final class C78890a implements MultiSelectContactView.C72732e, MultiSelectContactView.C72733f, MultiSelectContactView.C72731d {

        /* renamed from: xm3.f0$a$a */
        public static final class C78891a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C78889f0 f231755d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78891a(C78889f0 f0Var) {
                super(0);
                this.f231755d = f0Var;
            }

            public Object invoke() {
                MvvmList<C77020b> mvvmList = this.f231755d.f231749g;
                if (mvvmList != null) {
                    mvvmList.mo129609m();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: xm3.f0$a$b */
        public static final class C78892b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C78889f0 f231756d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78892b(C78889f0 f0Var) {
                super(0);
                this.f231756d = f0Var;
            }

            public Object invoke() {
                MvvmList<C77020b> mvvmList = this.f231756d.f231749g;
                if (mvvmList != null) {
                    mvvmList.mo129609m();
                }
                return C13598b0.f38549a;
            }
        }

        public C78890a() {
        }

        /* renamed from: O6 */
        public void mo100268O6(String str) {
            String str2;
            Log.m105924i("MicroMsg.SelectContactSearchMvvmListUIC", "onSearchTextChange " + str);
            if (str == null || (str2 = C112550d0.m153799i0(str).toString()) == null) {
                str2 = "";
            }
            String str3 = C31543z5.m39453c() + '_' + str2;
            UIStateCenter e3 = C78889f0.this.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C64958n(str3, str2, new C78892b(C78889f0.this)));
            }
        }

        /* renamed from: c6 */
        public void mo100269c6(boolean z) {
            String str;
            Log.m105924i("MicroMsg.SelectContactSearchMvvmListUIC", "onFoucusChange " + z);
            UIStateCenter e3 = C78889f0.this.mo14599e3();
            if (e3 != null) {
                String searchContent = C78889f0.this.mo108898i3().mo109044b().getSearchContent();
                if (searchContent == null || (str = C112550d0.m153799i0(searchContent).toString()) == null) {
                    str = "";
                }
                e3.dispatch(new C78062l(z, str, new C78891a(C78889f0.this)));
            }
        }

        /* renamed from: e6 */
        public void mo64521e6(int i, String str) {
            UIStateCenter e3;
            Log.m105924i("MicroMsg.SelectContactSearchMvvmListUIC", "onSelectChange " + i + ' ' + str);
            if (i == 1 && str != null && (e3 = C78889f0.this.mo14599e3()) != null) {
                e3.dispatch(new C78052b0(str));
            }
        }
    }

    /* renamed from: xm3.f0$b */
    public static final class C78893b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C78893b f231757d = new C78893b();

        public C78893b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64957k)) {
                C64957k kVar = (C64957k) action;
                if (C87412m.m108589b(kVar.f187037a.f228809a, wVar.f228829q)) {
                    wVar.f228830r = kVar.f187038b;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.f0$c */
    public static final class C78894c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78889f0 f231758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78894c(C78889f0 f0Var) {
            super(1);
            this.f231758d = f0Var;
        }

        public Object invoke(Object obj) {
            MvvmList<C77020b> mvvmList;
            LinearLayout linearLayout;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C78889f0 f0Var = this.f231758d;
                Log.m105924i("MicroMsg.SelectContactSearchMvvmListUIC", "InitAction");
                f0Var.mo108898i3().mo109044b().setOnSearchTextChangeListener((C78890a) ((C36570n) f0Var.f231748f).getValue());
                f0Var.mo108898i3().mo109044b().setOnSearchTextFouceChangeListener((C78890a) ((C36570n) f0Var.f231748f).getValue());
                f0Var.mo108898i3().mo109044b().setOnContactDeselectListener((C78890a) ((C36570n) f0Var.f231748f).getValue());
                if (f0Var.mo91383g3() != null) {
                    MvvmList mvvmList2 = new MvvmList(new C53999e(), new C53769h(), f0Var.getActivity(), (LifecycleScope) null, (List) null, 24, (C8480h) null);
                    C103009m<C77020b> mVar = new C103009m<>(mvvmList2, new SelectContactSearchMvvmListUIC$buildItemConvertFactory$1(), false);
                    mVar.f165746y = (C78914l0) ((C36570n) f0Var.f231753n).getValue();
                    f0Var.f231750h = mVar;
                    f0Var.mo108898i3().mo109047e().setAdapter(f0Var.f231750h);
                    f0Var.mo108898i3().mo109047e().setLayoutManager((WxLinearLayoutManager) ((C36570n) f0Var.f231747e).getValue());
                    f0Var.f231749g = mvvmList2;
                }
                f0Var.mo108898i3().mo109047e().setOnTouchListener(new C78903h0(f0Var));
                C79115l i3 = f0Var.mo108898i3();
                if (i3.f232302b == null) {
                    i3.f232302b = (LinearLayout) i3.f232301a.findViewById(C0966R.C0970id.hgt);
                }
                i3.f232302b.setOnTouchListener(new C15864g0(f0Var));
                f0Var.mo108898i3().mo109047e().mo17043c(new C78909i0(f0Var));
                UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
                updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
                updateSearchIndexAtOnceEvent.publish();
            }
            C78889f0 f0Var2 = this.f231758d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                if (!f0Var2.f231752j) {
                    View inflate = LayoutInflater.from(f0Var2.getActivity()).inflate(C0966R.C0971layout.f7052w9, f0Var2.mo108898i3().mo109047e(), false);
                    f0Var2.f231751i = inflate;
                    C103009m<C77020b> mVar2 = f0Var2.f231750h;
                    if (mVar2 != null) {
                        C87412m.m108591d(inflate);
                        View view = f0Var2.f231751i;
                        C60898l.m71329W5(mVar2, inflate, view != null ? view.hashCode() : 0, false, 4, (Object) null);
                    }
                    f0Var2.f231752j = true;
                }
            }
            C78889f0 f0Var3 = this.f231758d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78060i)) {
                int i = ((C78060i) action2).f228802a;
                View view2 = f0Var3.f231751i;
                if (!(view2 == null || (linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.eu_)) == null)) {
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(linearLayout.getWidth(), i));
                }
            }
            if (!(((C78071z) wVar.checkAction(C78071z.class)) == null || (mvvmList = this.f231758d.f231749g) == null)) {
                mvvmList.mo129614r(new C78911j0(wVar));
            }
            C78889f0 f0Var4 = this.f231758d;
            IStateAction action3 = wVar.getAction();
            if (action3 != null && (action3 instanceof C78054c0)) {
                C78054c0 c0Var = (C78054c0) action3;
                ViewGroup.LayoutParams layoutParams = f0Var4.mo108898i3().mo109047e().getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0Var.f228796a;
                }
                f0Var4.mo108898i3().mo109047e().setLayoutParams(layoutParams);
            }
            C78889f0 f0Var5 = this.f231758d;
            IStateAction action4 = wVar.getAction();
            if (action4 != null && (action4 instanceof C64957k)) {
                C64957k kVar = (C64957k) action4;
                if (C87412m.m108589b(kVar.f187037a.f228809a, wVar.f228829q)) {
                    if (kVar.f187037a.f228812d) {
                        WxRecyclerView g = f0Var5.mo108898i3().mo109049g();
                        C87412m.m108593f(g, "uiBinding.selectContactRv");
                        MvvmList a = C79317n.m96015a(g);
                        if (a != null) {
                            a.mo129602c(new C78912k0(kVar, f0Var5));
                        }
                    } else {
                        MvvmList<C77020b> mvvmList3 = f0Var5.f231749g;
                        if (mvvmList3 != null) {
                            mvvmList3.mo129613q(kVar.f187039c);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.f0$d */
    public static final class C78895d extends C87413o implements C32224a<C78914l0> {

        /* renamed from: d */
        public final /* synthetic */ C78889f0 f231759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78895d(C78889f0 f0Var) {
            super(0);
            this.f231759d = f0Var;
        }

        public Object invoke() {
            return new C78914l0(this.f231759d);
        }
    }

    /* renamed from: xm3.f0$e */
    public static final class C78896e extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f231760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78896e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f231760d = appCompatActivity;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f231760d);
        }
    }

    /* renamed from: xm3.f0$f */
    public static final class C78897f extends C87413o implements C32224a<C78890a> {

        /* renamed from: d */
        public final /* synthetic */ C78889f0 f231761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78897f(C78889f0 f0Var) {
            super(0);
            this.f231761d = f0Var;
        }

        public Object invoke() {
            return new C78890a();
        }
    }

    /* renamed from: xm3.f0$g */
    public static final class C78898g extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78889f0 f231762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78898g(C78889f0 f0Var) {
            super(0);
            this.f231762d = f0Var;
        }

        public Object invoke() {
            return new C79115l(this.f231762d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78889f0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f231747e = C36568h.m40985a(new C78896e(appCompatActivity));
        this.f231748f = C36568h.m40985a(new C78897f(this));
        this.f231753n = C36568h.m40985a(new C78895d(this));
    }

    /* renamed from: i3 */
    public final C79115l mo108898i3() {
        return (C79115l) ((C36570n) this.f231746d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), C78893b.f231757d);
        }
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78894c(this));
        }
    }
}
