package xm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import tm3.C64958n;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78062l;
import tm3.C78064o;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78068v;
import tm3.C78069w;
import tm3.C78071z;
import yb2.C15946a;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xm3.k */
public final class C66373k extends C15946a {

    /* renamed from: xm3.k$a */
    public static final class C66374a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C66374a f191087d = new C66374a();

        public C66374a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C78048a0.C78050b bVar = C78048a0.C78050b.Add;
            C78048a0.C78049a aVar = C78048a0.C78049a.Success;
            C87412m.m108594g(wVar, "state");
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78071z)) {
                C78071z zVar = (C78071z) action;
                if (wVar.f228826n.contains(zVar.f228837a.f225007f)) {
                    wVar.f228826n.remove(zVar.f228837a.f225007f);
                    IStateAction action2 = wVar.getAction();
                    if (action2 != null) {
                        action2.setResult(new C78048a0(C78048a0.C78050b.Remove, aVar));
                    }
                } else if (wVar.f228823h <= 0 || wVar.f228826n.size() < wVar.f228823h) {
                    wVar.f228826n.add(zVar.f228837a.f225007f);
                    wVar.f228832t.put(zVar.f228837a.f225007f, Long.valueOf(C31543z5.m39451a()));
                    IStateAction action3 = wVar.getAction();
                    if (action3 != null) {
                        action3.setResult(new C78048a0(bVar, aVar));
                    }
                } else {
                    IStateAction action4 = wVar.getAction();
                    if (action4 != null) {
                        action4.setResult(new C78048a0(bVar, C78048a0.C78049a.MaxLimit));
                    }
                }
            }
            IStateAction action5 = wVar.getAction();
            if (action5 != null && (action5 instanceof C78052b0)) {
                C78052b0 b0Var = (C78052b0) action5;
                if (wVar.f228826n.contains(b0Var.f228794a)) {
                    wVar.f228826n.remove(b0Var.f228794a);
                }
            }
            IStateAction action6 = wVar.getAction();
            if (action6 != null && (action6 instanceof C64958n)) {
                C64958n nVar = (C64958n) action6;
                List U = C112550d0.m153785U(nVar.f187041b, new String[]{" "}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (Object next : U) {
                    if (!C112551y.m153811k((String) next)) {
                        arrayList.add(next);
                    }
                }
                if (!C112551y.m153811k(nVar.f187041b)) {
                    wVar.f228829q = nVar.f187040a;
                    wVar.f228831s = nVar.f187041b;
                    wVar.f228830r = null;
                    if (arrayList.size() > 1) {
                        IStateAction action7 = wVar.getAction();
                        if (action7 != null) {
                            action7.setResult(new C78064o(nVar.f187040a, nVar.f187041b, arrayList, true));
                        }
                    } else {
                        IStateAction action8 = wVar.getAction();
                        if (action8 != null) {
                            action8.setResult(new C78064o(nVar.f187040a, nVar.f187041b, arrayList, false));
                        }
                    }
                } else {
                    wVar.f228829q = null;
                    wVar.f228831s = null;
                    wVar.f228830r = null;
                }
            }
            IStateAction action9 = wVar.getAction();
            if (action9 != null && (action9 instanceof C78062l)) {
                C78062l lVar = (C78062l) action9;
                wVar.f228828p = lVar.f228804a;
                if (!(!C112551y.m153811k(lVar.f228805b))) {
                    wVar.f228829q = null;
                    wVar.f228831s = null;
                    wVar.f228830r = null;
                }
            }
            IStateAction action10 = wVar.getAction();
            if (action10 != null && (action10 instanceof C78066t)) {
                C78066t tVar = (C78066t) action10;
                wVar.f228826n.addAll(tVar.f228815a);
                for (String put : tVar.f228815a) {
                    wVar.f228832t.put(put, Long.valueOf(C31543z5.m39453c()));
                }
            }
            IStateAction action11 = wVar.getAction();
            if (action11 != null && (action11 instanceof C78067u)) {
                C78067u uVar = (C78067u) action11;
                wVar.f228826n.addAll(C110818d0.m150904D0(uVar.f228816a));
                wVar.f228826n.removeAll(C110818d0.m150904D0(uVar.f228817b));
                for (String put2 : uVar.f228816a) {
                    wVar.f228832t.put(put2, Long.valueOf(C31543z5.m39453c()));
                }
            }
            IStateAction action12 = wVar.getAction();
            if (action12 != null && (action12 instanceof C78068v)) {
                C78068v vVar = (C78068v) action12;
                wVar.f228826n.clear();
                wVar.f228826n.addAll(vVar.f228818a);
                for (String put3 : vVar.f228818a) {
                    wVar.f228832t.put(put3, Long.valueOf(C31543z5.m39453c()));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66373k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), C66374a.f191087d);
        }
    }

    public void onCreateAfter(Bundle bundle) {
        UIStateCenter stateCenter;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", false);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.dispatch(new C64961s(booleanExtra));
        }
    }
}
