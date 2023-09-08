package kj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.os.Bundle;
import c50.C54655b;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import i50.C60251a;
import java.util.Map;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import org.json.JSONObject;
import p447aw.C103918d;
import p447aw.C54369c;
import p50.C62193a;
import vc3.C78382a;

/* renamed from: kj1.u0 */
public final class C10237u0 extends C10538e {

    /* renamed from: h */
    public final int f31253h;

    /* renamed from: i */
    public final String f31254i = "anchorlive.more.minimize";

    /* renamed from: kj1.u0$a */
    public static final class C10238a implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31255a;

        public C10238a(C10125e1 e1Var) {
            this.f31255a = e1Var;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            C58115i iVar;
            Class cls = C54108o.class;
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            C10125e1 e1Var = this.f31255a;
            C10125e1.C10127b bVar = e1Var.f30988g;
            if (bVar != null && bVar.f31009b) {
                if (e1Var.f30984c == 1) {
                    C62042e eVar = C62042e.f176370a;
                    if (eVar.mo87073d1(e1Var.f30982b) || eVar.mo87035Q0(this.f31255a.f30982b)) {
                        if (C60251a.f171781k1 == null) {
                            Log.printInfoStack("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new Object[0]);
                            C60251a.f171781k1 = new C60251a();
                        }
                        C60251a aVar = C60251a.f171781k1;
                        C87412m.m108591d(aVar);
                        aVar.f172989A.f166254a = true;
                    } else {
                        if (C54655b.f153178f1 == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar2 = C54655b.f153178f1;
                        C87412m.m108591d(bVar2);
                        bVar2.f172989A.f166254a = true;
                    }
                } else {
                    C62193a c = C62193a.f176816k1.mo87262c(((C55001u) e1Var.mo10534b(C55001u.class)).f154420q.f182392d);
                    if (!(c == null || (iVar = c.f172989A) == null)) {
                        iVar.f166254a = true;
                    }
                }
                Bundle bundle = new Bundle();
                C10125e1 e1Var2 = this.f31255a;
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
                e1Var2.mo10539g(C58124b.C58125b.MINI_WINDOW, bundle);
                if (this.f31255a.f30984c == 1) {
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    f0Var.f151444Z = true;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    f0Var.f151446a0 = false;
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE, String.valueOf(2), (String) null, 4, (Object) null);
                    return;
                }
                ((C54116w) C86312j.m106911c(C54116w.class)).Zx0(true, C54067f0.C54084t.LIVE_FLOAT_ACTION_COLLAPSE_ANIMATION);
            }
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            this.f31255a.mo10539g(C58124b.C58125b.MINI_WINDOW_CANCEL, (Bundle) null);
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            this.f31255a.mo10539g(C58124b.C58125b.MINI_WINDOW_REFUSE, (Bundle) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10237u0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31253h = e1Var.f30993l;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31254i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31253h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dxr);
        C87412m.m108593f(string, "getContext().resources.g…_more_action_mini_window)");
        mo10807m(e0Var, i, string, C0966R.raw.icons_outlined_mini_window_new_2);
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.MINIMIZE, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31253h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1 e1Var2 = e1Var;
        C54067f0.C0064m mVar = C54067f0.C0064m.MINIMIZE;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var2, "<this>");
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 21)) {
            Log.m105920e(e1Var2.f30980a, "showVideoTalking, permission denied");
            e1Var2.mo10539g(C58124b.C58125b.MINI_WINDOW_PERMISSION, (Bundle) null);
            MMActivity mMActivity = e1Var2.f30985d;
            ((C54369c) C86312j.m106911c(C54369c.class)).mo75136wJ(mMActivity, mMActivity.getString(C0966R.string.g_k), new C10238a(e1Var2), false, C78382a.m94650b());
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
            e1Var2.mo10539g(C58124b.C58125b.MINI_WINDOW, bundle);
            int i = e1Var2.f30984c;
            if (i == 1) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                f0Var.f151444Z = true;
                ((C54108o) C86312j.m106911c(cls)).getClass();
                f0Var.f151446a0 = false;
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_MINIMIZE, String.valueOf(2), (String) null, 4, (Object) null);
            } else if (i == 0) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Zx0(true, C54067f0.C54084t.LIVE_FLOAT_ACTION_COLLAPSE_ANIMATION);
            }
        }
        if (C62042e.f176370a.mo87027N0()) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c2, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("element", 1);
            jSONObject.put("type", 2);
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c3, C0073g0.LIVING_MENU, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c4 = C86312j.m106911c(cls);
        C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c4, mVar, (Map) null, (String) null, 6, (Object) null);
        C7335d c5 = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c5, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c5, C54067f0.C0064m.MINIMIZE_LIVE, (Map) null, (String) null, 6, (Object) null);
    }
}
