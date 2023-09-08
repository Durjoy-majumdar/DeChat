package xy0;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import java.util.ArrayList;
import java.util.List;
import p682rz.C101488s;
import p682rz.C101491u;
import yy0.C102970a;

/* renamed from: xy0.g */
public class C102792g implements C102790e {
    /* renamed from: a */
    public List<C102970a> mo142536a(C72963f4 f4Var) {
        C68070l.C68072b u;
        if (f4Var == null) {
            return null;
        }
        C98410o0 o0Var = (C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
        ArrayList arrayList = new ArrayList();
        C102789d.m135840a(arrayList, f4Var, o0Var.mo137728q(f4Var.mo108765s2()), 1);
        String r = o0Var.mo137729r(f4Var.mo108765s2());
        if (f4Var.mo100983V3() && (u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2())) != null) {
            r = u.f195646y;
        }
        C102789d.m135840a(arrayList, f4Var, r, 2);
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
        if (Zd != null && !Util.isNullOrNil(Zd.f288546N)) {
            C102789d.m135840a(arrayList, f4Var, o0Var.mo137728q(Zd.f288546N), 3);
            C102789d.m135840a(arrayList, f4Var, o0Var.mo137729r(Zd.f288546N), 4);
        }
        return arrayList;
    }
}
