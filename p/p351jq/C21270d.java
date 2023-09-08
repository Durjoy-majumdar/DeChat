package p351jq;

import android.text.TextUtils;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import d91.C20449a;
import di3.C86301e;
import e91.C116711b;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Objects;
import p185kq.C10383h;
import p185kq.C10384l;
import p185kq.C61130g;
import z91.C23462b;

@C86522b
/* renamed from: jq.d */
public class C21270d extends C86301e implements C10383h, C61130g {
    /* renamed from: Aj */
    public void mo33239Aj(long j, boolean z) {
        PBool pBool = C20449a.f57467a;
        if (j > 0) {
            PBool pBool2 = new PBool();
            pBool2.value = z;
            C20449a.f57474h.put(Long.valueOf(j), pBool2);
        }
    }

    /* renamed from: DZ */
    public C10384l mo10693DZ() {
        return C23462b.m28021f();
    }

    /* renamed from: Dq */
    public boolean mo10694Dq(String str) {
        return Util.isEqual(str, C75592q0.m90778h());
    }

    /* renamed from: Dt */
    public String mo10695Dt(String str) {
        return C116711b.m164595t(str);
    }

    /* renamed from: E */
    public String mo10696E() {
        return C116711b.m164578c();
    }

    /* renamed from: OK */
    public void mo10697OK(String str) {
        try {
            if (C86709a0.m107522a()) {
                if (!TextUtils.isEmpty(str)) {
                    Log.m105924i("HABBYGE-MALI.HellhoundUtil", "setFinderContextId USERINFO_FINDER_CONTEXT_ID_STRING:" + str);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_CONTEXT_ID_STRING, str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public String Pf0() {
        return C20449a.f57481o;
    }

    /* renamed from: QO */
    public boolean mo33241QO(String str) {
        if (!C20449a.f57477k) {
            ((ArrayList) C20449a.f57476j).clear();
            return false;
        }
        ArrayList arrayList = (ArrayList) C20449a.f57476j;
        if (arrayList.contains(str)) {
            return true;
        }
        arrayList.add(str);
        return false;
    }

    /* renamed from: S0 */
    public String mo10698S0() {
        return C116711b.m164579d();
    }

    /* renamed from: Sx */
    public boolean mo33242Sx(long j) {
        if (!C20449a.f57474h.containsKey(Long.valueOf(j))) {
            return false;
        }
        PBool pBool = C20449a.f57474h.get(Long.valueOf(j));
        Objects.requireNonNull(pBool);
        return pBool.value;
    }

    /* renamed from: TX */
    public String mo10699TX() {
        return C116711b.m164580e();
    }

    /* renamed from: XQ */
    public String mo10700XQ(long j) {
        return C116711b.m164593r(j);
    }

    /* renamed from: YN */
    public void mo33243YN(String str) {
        if (str == null) {
            str = "";
        }
        C20449a.f57481o = str;
    }

    /* renamed from: gK */
    public String mo33244gK() {
        return C20449a.f57480n;
    }

    /* renamed from: po */
    public void mo33245po(boolean z) {
        C20449a.f57478l = z;
    }

    public void rn0(String str) {
        try {
            if (C86709a0.m107522a()) {
                if (!TextUtils.isEmpty(str)) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, str);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellhoundUtil", e, "setFinderCurTabContextId crash: %s", e.getMessage());
        }
    }

    /* renamed from: ry */
    public void mo33246ry(String str) {
        C20449a.m22054f(str);
    }

    /* renamed from: sq */
    public void mo33247sq(long j) {
        C20449a.f57474h.remove(Long.valueOf(j));
    }

    /* renamed from: vG */
    public boolean mo33248vG() {
        return C20449a.f57482p;
    }

    /* renamed from: vz */
    public boolean mo10702vz(String str) {
        return C116711b.m164591p(str);
    }

    /* renamed from: xj */
    public String mo33249xj() {
        return C20449a.f57475i;
    }

    public void zc0() {
        C20449a.f57474h.clear();
    }
}
