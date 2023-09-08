package lv0;

import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import g62.C75875l;
import java.util.HashMap;
import java.util.LinkedList;
import lv0.C99659k;
import ov0.C100546d;
import ov0.C100556h;
import pv0.C100968x;
import te3.C77926f9;

/* renamed from: lv0.h */
public class C99656h implements C99663m {
    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String str2 = new String(f9Var.f227337h.f141175d);
        C75875l h = C100546d.m131563g().mo139995h().mo140008h();
        f4Var.mo108732L2(str2);
        if (f9Var.f227333d == 50) {
            f4Var.mo100991d(6);
        }
        if (f4Var.getMsgId() == 0) {
            C100556h.m131583c(f4Var);
            return 0;
        }
        ((C72972g4) h).yy0(f9Var.f227348v, f4Var);
        return 0;
    }

    /* renamed from: b */
    public int mo139034b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, HashMap<Long, C99659k.C99660a> hashMap, boolean z2, long j) {
        if (f4Var.getContent() == null) {
            return 0;
        }
        return f4Var.getContent().getBytes().length;
    }
}
