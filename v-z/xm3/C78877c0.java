package xm3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o40.C61926c;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64958n;
import tm3.C64961s;
import tm3.C78062l;
import tm3.C78065p;
import tm3.C78066t;
import tm3.C78069w;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xm3.c0 */
public final class C78877c0 extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231726d = C36568h.m40985a(new C78879b(this));

    /* renamed from: e */
    public boolean f231727e = true;

    /* renamed from: f */
    public List<String> f231728f = new ArrayList();

    /* renamed from: xm3.c0$a */
    public static final class C78878a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78877c0 f231729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78878a(C78877c0 c0Var) {
            super(1);
            this.f231729d = c0Var;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78877c0 c0Var = this.f231729d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                ((TextView) c0Var.mo108892j3().mo109048f().findViewById(16908310)).setText(C0966R.string.iie);
                c0Var.mo108892j3().mo109043a().setTagSelectedBG(C0966R.C0969drawable.awa);
                c0Var.mo108892j3().mo109043a().setTagSelectedTextColorRes(C0966R.color.a7f);
                c0Var.mo108892j3().mo109048f().setOnLabelContainerListener(new C78873a0(c0Var));
                c0Var.mo108892j3().mo109043a().setCallBack(new C78875b0(c0Var));
            }
            C78062l lVar = (C78062l) wVar.checkAction(C78062l.class);
            if (lVar != null) {
                C78877c0.m95413i3(this.f231729d, lVar.f228804a, lVar.f228805b);
            }
            C64958n nVar = (C64958n) wVar.checkAction(C64958n.class);
            if (nVar != null) {
                C78877c0.m95413i3(this.f231729d, true, nVar.f187041b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.c0$b */
    public static final class C78879b extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78877c0 f231730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78879b(C78877c0 c0Var) {
            super(0);
            this.f231730d = c0Var;
        }

        public Object invoke() {
            return new C79115l(this.f231730d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78877c0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public static final void m95413i3(C78877c0 c0Var, boolean z, String str) {
        if (z) {
            c0Var.getClass();
            if (C112551y.m153811k(str)) {
                if (!c0Var.f231728f.isEmpty()) {
                    c0Var.mo108892j3().mo109048f().setVisibility(0);
                    c0Var.mo108892j3().mo109043a().mo95190q((Collection<String>) null, c0Var.f231728f);
                    return;
                }
                c0Var.mo108892j3().mo109048f().setVisibility(8);
                return;
            }
        }
        c0Var.mo108892j3().mo109048f().setVisibility(8);
    }

    /* renamed from: j3 */
    public final C79115l mo108892j3() {
        return (C79115l) ((C36570n) this.f231726d).getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        UIStateCenter e3;
        C78069w wVar;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 3) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (!(stringExtra == null || C112551y.m153811k(stringExtra)) && (e3 = mo14599e3()) != null && (wVar = (C78069w) e3.getState()) != null) {
                if (wVar.mo108033b()) {
                    UIStateCenter e35 = mo14599e3();
                    if (e35 != null) {
                        e35.dispatch(new C78066t(C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null), i));
                        return;
                    }
                    return;
                }
                UIStateCenter e36 = mo14599e3();
                if (e36 != null) {
                    e36.dispatch(new C78065p(C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null), i));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78878a(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f231727e) {
            this.f231727e = false;
            C61926c.m72656A((String) null, new C78887e0(this));
        }
    }
}
