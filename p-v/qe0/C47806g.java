package qe0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import he0.C76158j;

/* renamed from: qe0.g */
public class C47806g {
    /* renamed from: a */
    public static String m53116a(C72996z1 z1Var) {
        if (z1Var == null || !C72996z1.m85843n5(z1Var.getUsername()) || Util.isNullOrNil(z1Var.mo73980x2())) {
            return null;
        }
        String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        if (Util.isNullOrNil(wo)) {
            return null;
        }
        return "＠" + wo;
    }

    /* renamed from: b */
    public static String m53117b(C72996z1 z1Var) {
        if (z1Var == null || !C72996z1.m85846q5(z1Var.getUsername()) || Util.isNullOrNil(z1Var.mo73980x2())) {
            return null;
        }
        String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        if (Util.isNullOrNil(wo)) {
            return null;
        }
        return "＠" + wo;
    }
}
