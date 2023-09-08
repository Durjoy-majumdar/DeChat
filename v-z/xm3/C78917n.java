package xm3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C0262a;
import bc2.C67221b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.mvvm.list.SelectContactMvvmList;
import com.tencent.p014mm.p136ui.mvvm.uic.base.SelectContactInitHeaderUIC$buildItemConvertFactory$1;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import o40.C61926c;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78055d;
import tm3.C78057f;
import tm3.C78058g;
import tm3.C78059h;
import tm3.C78065p;
import tm3.C78068v;
import tm3.C78069w;
import z04.C112550d0;
import z04.C112551y;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: xm3.n */
public class C78917n extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231783d = C36568h.m40985a(new C78921d(this));

    /* renamed from: e */
    public final C13601g f231784e;

    /* renamed from: f */
    public C103009m<C77020b> f231785f;

    /* renamed from: g */
    public final C13601g f231786g;

    /* renamed from: xm3.n$e */
    public static final class C27702e extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: B */
        public static final C27702e f76721B = new C27702e();

        public C27702e() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            return Boolean.valueOf(str == null || C112551y.m153811k(str));
        }
    }

    /* renamed from: xm3.n$a */
    public static final class C78918a extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f231787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78918a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f231787d = appCompatActivity;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f231787d);
        }
    }

    /* renamed from: xm3.n$b */
    public static final class C78919b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78917n f231788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78919b(C78917n nVar) {
            super(1);
            this.f231788d = nVar;
        }

        public Object invoke(Object obj) {
            UIStateCenter stateCenter;
            BaseMvvmActivity d3;
            UIStateCenter stateCenter2;
            UIStateCenter stateCenter3;
            UIStateCenter stateCenter4;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C64961s sVar = (C64961s) wVar.checkAction(C64961s.class);
            if (sVar != null) {
                C78917n nVar = this.f231788d;
                Log.m105924i("MicroMsg.SelectContactInitHeaderUIC", "InitAction");
                C0262a g3 = nVar.mo91383g3();
                if (g3 != null) {
                    C103009m<C77020b> mVar = new C103009m<>(new SelectContactMvvmList(g3.mo302g3(), new C53769h(), nVar.getActivity()), new SelectContactInitHeaderUIC$buildItemConvertFactory$1(), false);
                    mVar.f165746y = (C78927q) ((C36570n) nVar.f231786g).getValue();
                    nVar.f231785f = mVar;
                    for (View view : nVar.mo91612i3()) {
                        C103009m<C77020b> mVar2 = nVar.f231785f;
                        if (mVar2 != null) {
                            C60898l.m71329W5(mVar2, view, view.hashCode(), false, 4, (Object) null);
                        }
                    }
                    nVar.mo108906j3().mo109049g().setAdapter(nVar.f231785f);
                    nVar.mo108906j3().mo109049g().setLayoutManager((WxLinearLayoutManager) ((C36570n) nVar.f231784e).getValue());
                    BaseMvvmActivity d35 = nVar.mo14598d3();
                    if (!(d35 == null || (stateCenter4 = d35.getStateCenter()) == null)) {
                        stateCenter4.dispatch(new C78057f());
                    }
                }
                nVar.mo108906j3().mo109049g().setOnTouchListener(new C78923o(nVar));
                nVar.mo108906j3().mo109049g().mo17043c(new C78926p(nVar));
                BaseMvvmActivity d36 = nVar.mo14598d3();
                if (!(d36 == null || (stateCenter3 = d36.getStateCenter()) == null)) {
                    C78913l lVar = new C78913l(nVar);
                    C78915m mVar3 = new C78915m(nVar);
                    WxRecyclerView g = nVar.mo108906j3().mo109049g();
                    C87412m.m108593f(g, "uiBinding.selectContactRv");
                    stateCenter3.dispatch(new C78058g(lVar, mVar3, g));
                }
                if (!(!sVar.f187045a || (d3 = nVar.mo14598d3()) == null || (stateCenter2 = d3.getStateCenter()) == null)) {
                    stateCenter2.dispatch(new C78055d());
                }
                BaseMvvmActivity d37 = nVar.mo14598d3();
                if (!(d37 == null || (stateCenter = d37.getStateCenter()) == null)) {
                    stateCenter.dispatch(new C78059h());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.n$c */
    public static final class C78920c extends C87413o implements C32224a<C78927q> {

        /* renamed from: d */
        public final /* synthetic */ C78917n f231789d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f231790e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78920c(C78917n nVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f231789d = nVar;
            this.f231790e = appCompatActivity;
        }

        public Object invoke() {
            return new C78927q(this.f231789d, this.f231790e);
        }
    }

    /* renamed from: xm3.n$d */
    public static final class C78921d extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78917n f231791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78921d(C78917n nVar) {
            super(0);
            this.f231791d = nVar;
        }

        public Object invoke() {
            return new C79115l(this.f231791d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78917n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f231784e = C36568h.m40985a(new C78918a(appCompatActivity));
        this.f231786g = C36568h.m40985a(new C78920c(this, appCompatActivity));
    }

    /* renamed from: a */
    public final void mo108905a(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("Select_Conv_User")) != null) {
            List U = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null);
            UIStateCenter e3 = mo14599e3();
            if (e3 != null) {
                LinkedList linkedList = new LinkedList(U);
                C61926c.m72675T(linkedList, C27702e.f76721B);
                if (((C78069w) e3.getState()).mo108033b()) {
                    e3.dispatch(new C78068v(linkedList, -1));
                } else {
                    e3.dispatch(new C78065p(linkedList, -1));
                }
            }
        }
    }

    /* renamed from: i3 */
    public ArrayList<View> mo91612i3() {
        ArrayList<View> arrayList = new ArrayList<>();
        if (getIntent().getBooleanExtra("KEY_NEED_SEAR_HEADER", true)) {
            C78944z zVar = (C78944z) C39818r.f106831a.mo62443b(getContext()).mo75002a(C78944z.class);
            View inflate = LayoutInflater.from(zVar.getActivity()).inflate(C0966R.C0971layout.f7052w9, (ViewGroup) null, false);
            zVar.f231819d = inflate;
            if (inflate != null) {
                arrayList.add(inflate);
            }
        }
        return arrayList;
    }

    /* renamed from: j3 */
    public final C79115l mo108906j3() {
        return (C79115l) ((C36570n) this.f231783d).getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2306836 && i2 == -1 && intent != null) {
            mo108905a(intent);
        } else if (i == 2306837 && i2 == -1 && intent != null) {
            mo108905a(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78919b(this));
        }
    }
}
