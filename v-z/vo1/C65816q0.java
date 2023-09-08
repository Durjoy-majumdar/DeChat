package vo1;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import d60.C58124b;
import gy3.C87412m;
import ii1.C60291e;
import java.lang.ref.WeakReference;
import m03.C61425b;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import qj1.C62905o2;
import qj1.C62920p2;
import rx3.C13604l;
import zo1.C66925j0;

/* renamed from: vo1.q0 */
public final class C65816q0 implements C65818s0 {

    /* renamed from: a */
    public final WeakReference<C56032b> f189275a;

    public C65816q0(WeakReference<C56032b> weakReference) {
        C87412m.m108594g(weakReference, "rReplayPluginLayout");
        this.f189275a = weakReference;
    }

    /* renamed from: a */
    public boolean mo89823a(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar) {
        C56032b o = mo89853o();
        if (o != null) {
            return C56032b.notifySEIMicUserChange$default(o, jSONObject, false, (C13604l) null, 6, (Object) null);
        }
        return false;
    }

    /* renamed from: b */
    public void mo89824b(boolean z) {
    }

    /* renamed from: c */
    public void mo89825c(JSONObject jSONObject) {
        C56032b o = mo89853o();
        if (o != null) {
            o.setCurrentMicData(jSONObject);
        }
    }

    /* renamed from: d */
    public void mo89826d() {
        C62905o2 o2Var;
        C56032b o = mo89853o();
        if (o != null && (o2Var = (C62905o2) o.getPlugin(C62905o2.class)) != null) {
            o2Var.mo87850a1();
        }
    }

    /* renamed from: e */
    public void mo89827e(boolean z) {
        C62905o2 o2Var;
        C56032b o = mo89853o();
        if (o != null && (o2Var = (C62905o2) o.getPlugin(C62905o2.class)) != null) {
            C61926c.m72668M(new C62920p2(o2Var, z));
        }
    }

    /* renamed from: f */
    public void mo89828f() {
    }

    /* renamed from: g */
    public void mo89829g() {
        C60291e eVar;
        C56032b o = mo89853o();
        if (o != null && (eVar = (C60291e) o.getPlugin(C60291e.class)) != null) {
            eVar.mo85279c1();
        }
    }

    /* renamed from: h */
    public void mo89830h() {
        C56032b o = mo89853o();
        if (o != null) {
            C56032b.notifyPKMicUserChange$default(o, false, 1, (Object) null);
        }
    }

    /* renamed from: i */
    public void mo89831i(boolean z, boolean z2) {
        C66925j0 j0Var;
        C57952m mVar;
        C56032b o = mo89853o();
        if (o != null && (j0Var = (C66925j0) o.getPlugin(C66925j0.class)) != null && (mVar = j0Var.f192301r) != null) {
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = mVar.f165852a;
            C61425b bVar = finderLiveThumbPlayerProxy.f160765h;
            if (bVar != null) {
                View view = (View) bVar;
                bVar.forceLayout();
                C61425b bVar2 = finderLiveThumbPlayerProxy.f160765h;
                if (bVar2 != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bVar2.getMeasuredWidth(), 1073741824);
                    C61425b bVar3 = finderLiveThumbPlayerProxy.f160765h;
                    if (bVar3 != null) {
                        bVar2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(bVar3.getMeasuredHeight(), 1073741824));
                    } else {
                        C87412m.m108603p("textureView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("textureView");
                    throw null;
                }
            } else {
                C87412m.m108603p("textureView");
                throw null;
            }
        }
    }

    /* renamed from: j */
    public void mo89832j(JSONArray jSONArray) {
        C56032b o = mo89853o();
        if (o != null) {
            o.setLastRoomPkMicUserList(jSONArray);
        }
    }

    /* renamed from: k */
    public void mo89833k() {
        C62905o2 o2Var;
        C56032b o = mo89853o();
        if (o != null && (o2Var = (C62905o2) o.getPlugin(C62905o2.class)) != null) {
            o2Var.mo87851b1();
        }
    }

    /* renamed from: l */
    public void mo89834l(boolean z, C13604l<Integer, Integer> lVar) {
        C56032b o = mo89853o();
        if (o != null) {
            o.notifyAudienceMicUserChange(z);
        }
    }

    /* renamed from: m */
    public void mo89835m(String str) {
        C60291e eVar;
        C56032b o = mo89853o();
        if (o != null && (eVar = (C60291e) o.getPlugin(C60291e.class)) != null) {
            eVar.mo85280d1(str);
        }
    }

    /* renamed from: n */
    public void mo89836n() {
    }

    /* renamed from: o */
    public final C56032b mo89853o() {
        C56032b bVar = this.f189275a.get();
        if (bVar == null) {
            Log.m105924i("SeiProcessCallbackFullUIProxy", "getPluginLayout fail!");
        }
        return bVar;
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        C56032b o = mo89853o();
        if (o != null) {
            o.statusChange(bVar, bundle);
        }
    }
}
