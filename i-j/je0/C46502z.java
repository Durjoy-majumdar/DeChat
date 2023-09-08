package je0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ge0.C32415b;
import he0.C76158j;
import re0.C36310g;
import re0.C36312i;
import te3.C48676a73;
import te3.C48819b73;
import te3.C49099d52;

/* renamed from: je0.z */
public class C46502z {
    /* renamed from: a */
    public static C72996z1 m51787a(C48676a73 a732) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(a732.f130343d);
        if (z1Var == null) {
            z1Var = new C72996z1();
        }
        z1Var.setUsername(a732.f130343d);
        z1Var.mo62878U2(a732.f130344e);
        z1Var.setType(a732.f130345f);
        z1Var.mo62860K2(a732.f130346g);
        z1Var.mo62912k4(a732.f130349j);
        z1Var.mo62882W2(a732.f130350n);
        z1Var.mo62884X2(a732.f130351o);
        z1Var.mo62864M2(a732.f130352p);
        z1Var.mo62862L2(a732.f130353q);
        C48819b73 b732 = a732.f130354r;
        z1Var.f149532d1 = b732 == null ? "" : b732.f130996e;
        z1Var.f149550u = true;
        z1Var.f149530c1 = b732 == null ? 0 : b732.f130995d;
        z1Var.f149550u = true;
        z1Var.mo62848B3(a732.f130355s);
        z1Var.mo62880V2(a732.f130356t);
        z1Var.mo62900f4(a732.f130357u);
        z1Var.mo73960Q2(a732.f130358v);
        z1Var.mo62863L3((int) Util.nowSecond());
        return z1Var;
    }

    /* renamed from: b */
    public static int m51788b(C49099d52 d522) {
        int i = d522.f132132d;
        C48676a73 a732 = d522.f132133e;
        C72996z1 a = m51787a(a732);
        Log.m105925i("MicroMsg.OpenIMContactLogic", "onGYNetEnd openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", a.getUsername(), a.getNickname(), a.mo73969n2(), Integer.valueOf(a.getSource()), Integer.valueOf(a.f149500H), a.mo73980x2(), a.f149532d1, Integer.valueOf(a.f149530c1), Integer.valueOf(a.getType()), a.mo73976t2());
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69668Q3(a);
        ((C76158j) C86312j.m106911c(C76158j.class)).ym0(a732.f130356t, a732.f130358v);
        m51789c(a732);
        m51791e(a732);
        m51790d(a732);
        return i;
    }

    /* renamed from: c */
    public static void m51789c(C48676a73 a732) {
        String str;
        boolean z;
        C68097n Lo = C68102u.zx0().mo93607Lo(a732.f130343d);
        String str2 = "";
        if (Lo != null) {
            str2 = Lo.mo93594c();
            str = Lo.mo93597f();
        } else {
            str = str2;
        }
        C68097n nVar = new C68097n();
        nVar.f195736i = -1;
        nVar.f195728a = a732.f130343d;
        nVar.f195731d = a732.f130348i;
        nVar.f195732e = a732.f130347h;
        boolean z2 = true;
        Log.m105925i("MicroMsg.OpenIMContactLogic", "dealwithAvatarFromModContact contact %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
        if (!nVar.mo93594c().equals(str2)) {
            C68102u.wx0().mo93566o(a732.f130343d, true);
            z = true;
        } else {
            z = false;
        }
        if (!nVar.mo93597f().equals(str)) {
            C68102u.wx0().mo93566o(a732.f130343d, false);
        } else {
            z2 = z;
        }
        if (z2) {
            C68102u.vx0().mo93582i(a732.f130343d);
            C68102u.zx0().mo93608Yt(nVar);
        }
    }

    /* renamed from: d */
    public static void m51790d(C48676a73 a732) {
        if (a732.f130343d != null) {
            C36310g gVar = new C36310g();
            gVar.field_openIMUsername = a732.f130343d;
            String str = a732.f130359w;
            if (str == null) {
                str = "";
            }
            gVar.field_finder_username = str;
            ((C32415b) C86312j.m106911c(C32415b.class)).zx0().replace(gVar);
        }
    }

    /* renamed from: e */
    public static void m51791e(C48676a73 a732) {
        if (a732.f130343d != null) {
            C36312i iVar = new C36312i();
            iVar.field_openIMUsername = a732.f130343d;
            iVar.field_openIMSnsFlag = a732.f130360x;
            ((C32415b) C86312j.m106911c(C32415b.class)).Ax0().replace(iVar);
        }
    }
}
