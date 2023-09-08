package eb0;

import a11.C39479c;
import com.tencent.p014mm.app.C40010n1;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;
import java.util.Set;
import te3.C51866wq2;

/* renamed from: eb0.r0 */
public class C45626r0 {

    /* renamed from: a */
    public static Set<String> f123393a = new HashSet();

    /* renamed from: a */
    public static String m50731a(C72996z1 z1Var, String str, boolean z) {
        if (z1Var == null) {
            return str;
        }
        if (z && Util.isNullOrNil(z1Var.getNickname()) && Util.isNullOrNil(z1Var.mo73969n2())) {
            C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
            return (!Util.isNullOrNil(n1Var.getDisplayName(str)) || !C45612m0.m50703t(str)) ? n1Var.getDisplayName(str) : C45612m0.m50694k();
        } else if (z1Var.mo62898f() != null && z1Var.mo62898f().length() > 0) {
            return z1Var.mo62898f();
        } else {
            if (!Util.isNullOrNil(z1Var.getNickname()) || !C72996z1.m85808L4(str)) {
                return C72996z1.m85796D5(str) ? " " : str;
            }
            C40294d.C40295a aVar = C40294d.f108319U1;
            if (aVar != null) {
                return ((C40010n1) aVar).mo62699a(str);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static String m50732b(String str) {
        return (str == null || str.length() <= 0) ? "" : m50731a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str), str, C72996z1.m85820U5(str));
    }

    /* renamed from: c */
    public static String m50733c(String str, String str2) {
        if (Util.isNullOrNil(str2)) {
            return m50732b(str);
        }
        String d = m50734d(str);
        if (!Util.isNullOrNil(d)) {
            return d;
        }
        C51866wq2 wq22 = C45612m0.f123381a;
        C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        String str3 = null;
        if (mr == null) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "[getDisplayNameInRoom] null == mStg");
        } else {
            C44661m1 Lo = ((C44662n1) mr).mo69799Lo(str2);
            if (Lo != null) {
                str3 = Lo.mo69789q2(str);
            }
        }
        return Util.isNullOrNil(str3) ? m50732b(str) : str3;
    }

    /* renamed from: d */
    public static String m50734d(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return (z1Var != null && !Util.isNullOrNil(z1Var.mo73969n2())) ? z1Var.mo73969n2() : "";
    }
}
