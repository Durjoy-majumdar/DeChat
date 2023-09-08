package c62;

import a11.C39479c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86301e;
import eb0.C45626r0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: c62.a */
public class C39903a extends C86301e implements C75339i {
    public String As0(C72996z1 z1Var, String str, boolean z) {
        return C45626r0.m50731a(z1Var, str, z);
    }

    public String K90(String str) {
        return C45626r0.f123393a.contains(str) ? "" : str;
    }

    /* renamed from: P1 */
    public String mo62514P1(String str) {
        Set<String> set = C45626r0.f123393a;
        if (str == null || str.length() <= 0) {
            return "";
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        Log.m105919d("MicroMsg.ContactCommDisplay", "username: %s", str);
        if (z1Var == null) {
            return str;
        }
        if (C72996z1.m85820U5(str) && Util.isNullOrNil(z1Var.getNickname())) {
            String displayName = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).getDisplayName(str);
            if (!Util.isNullOrNil(displayName)) {
                return displayName;
            }
        }
        return (z1Var.mo62909j3() == null || z1Var.mo62909j3().length() <= 0) ? C72996z1.m85796D5(str) ? " " : str : z1Var.mo62909j3();
    }

    /* renamed from: Si */
    public String mo62515Si(String str) {
        return C45626r0.m50734d(str);
    }

    /* renamed from: Sn */
    public void mo62516Sn(Set<String> set) {
        C45626r0.f123393a = set;
    }

    public String getDisplayName(String str) {
        return C45626r0.m50732b(str);
    }

    /* renamed from: lC */
    public String mo62518lC(String str) {
        Set<String> set = C45626r0.f123393a;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return z1Var == null ? str : !Util.isNullOrNil(z1Var.getNickname()) ? z1Var.getNickname() : !Util.isNullOrNil(z1Var.mo62913l2()) ? z1Var.mo62913l2() : C72996z1.m85796D5(str) ? " " : str;
    }

    /* renamed from: pb */
    public String mo62519pb(String str, String str2) {
        return C45626r0.m50733c(str, str2);
    }

    /* renamed from: pi */
    public String mo62520pi(C72996z1 z1Var) {
        Set<String> set = C45626r0.f123393a;
        String b = C45626r0.m50732b(z1Var.getUsername());
        if (!C72996z1.m85820U5(z1Var.getUsername())) {
            return b;
        }
        if (b != null && !b.equals(z1Var.getUsername())) {
            return b;
        }
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(z1Var.getUsername());
        if (bD == null || ((LinkedList) bD).size() <= 0) {
            return MMApplicationContext.getResources().getString(C0966R.string.f7421ft);
        }
        ArrayList arrayList = new ArrayList();
        for (String b2 : bD) {
            arrayList.add(C45626r0.m50732b(b2));
        }
        return "(" + Util.listToString(arrayList, ", ") + ")";
    }

    public String pv0(C72996z1 z1Var, String str) {
        Set<String> set = C45626r0.f123393a;
        return C45626r0.m50731a(z1Var, str, C72996z1.m85820U5(str));
    }
}
