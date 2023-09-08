package dv0;

import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import hv0.C98543d;
import hv0.C98544e;
import java.util.LinkedList;
import pv0.C100968x;
import te3.C77926f9;

/* renamed from: dv0.g */
public class C97548g implements C75460n {
    /* renamed from: a */
    public int mo105806a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String str2 = f9Var.f227337h.f141175d;
        if (str2 != null) {
            f4Var.mo108732L2(str2);
        }
        if (f9Var.f227333d == 50) {
            f4Var.mo100991d(6);
        }
        if (f4Var.getMsgId() == 0) {
            C98543d.m128033d(f4Var);
            return 0;
        }
        ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).yy0(f9Var.f227348v, f4Var);
        return 0;
    }

    /* renamed from: b */
    public int mo105807b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, boolean z2) {
        if (f4Var.getContent() == null) {
            return 0;
        }
        return f4Var.getContent().getBytes().length;
    }
}
