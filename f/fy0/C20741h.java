package fy0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import ex0.C45696d;
import f40.C86709a0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import rb0.C48009v0;
import s90.C48299e;
import te3.me4;
import te3.ne4;
import te3.re4;

/* renamed from: fy0.h */
public class C20741h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f58629d;

    public C20741h(C19623o0 o0Var) {
        this.f58629d = o0Var;
    }

    public void run() {
        me4 me4;
        if (((HashMap) C20739g.f58625a).containsKey(Long.valueOf(this.f58629d.field_msgId))) {
            if (!C20739g.m22689a(((Integer) ((HashMap) C20739g.f58625a).get(Long.valueOf(this.f58629d.field_msgId))).intValue())) {
                return;
            }
        }
        List<C19623o0> uP = C48009v0.Jx0().mo25813uP(5, this.f58629d.field_orderFlag);
        List<C19623o0> vP = C48009v0.Jx0().mo25815vP(5, this.f58629d.field_orderFlag);
        LinkedList<C19623o0> linkedList = new LinkedList<>();
        linkedList.addAll(uP);
        linkedList.add(this.f58629d);
        linkedList.addAll(vP);
        if (!Util.isNullOrNil((List) linkedList)) {
            LinkedList linkedList2 = new LinkedList();
            for (C19623o0 o0Var : linkedList) {
                if (((HashMap) C20739g.f58625a).containsKey(Long.valueOf(o0Var.field_msgId))) {
                    if (!C20739g.m22689a(((Integer) ((HashMap) C20739g.f58625a).get(Long.valueOf(o0Var.field_msgId))).intValue())) {
                    }
                }
                re4 re4 = o0Var.f55530o1;
                if (re4 != null && (me4 = re4.f64515d) != null && !Util.isNullOrNil((List) me4.f64242g) && o0Var.mo25758F2()) {
                    int i = o0Var.f55530o1.f64521j;
                    if (i == 3 || i == 5) {
                        for (int i2 = 0; i2 < o0Var.f55530o1.f64515d.f64242g.size(); i2++) {
                            ne4 ne4 = o0Var.f55530o1.f64515d.f64242g.get(i2);
                            C48299e eVar = new C48299e();
                            eVar.f129336d = ne4.f64284g;
                            eVar.f129338f = ne4.f64288n;
                            eVar.f129337e = 1;
                            linkedList2.add(eVar);
                        }
                        ((HashMap) C20739g.f58625a).put(Long.valueOf(o0Var.field_msgId), Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                    }
                }
            }
            if (linkedList2.size() > 0) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).mo71013rx(linkedList2, 90);
            }
        }
    }
}
