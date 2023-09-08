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

/* renamed from: fy0.d */
public class C20735d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f58620d;

    public C20735d(C19623o0 o0Var) {
        this.f58620d = o0Var;
    }

    public void run() {
        if (((HashMap) C20739g.f58625a).containsKey(Long.valueOf(this.f58620d.field_msgId))) {
            if (!C20739g.m22689a(((Integer) ((HashMap) C20739g.f58625a).get(Long.valueOf(this.f58620d.field_msgId))).intValue())) {
                return;
            }
        }
        List<C19623o0> uP = C48009v0.Jx0().mo25813uP(5, this.f58620d.field_orderFlag);
        List<C19623o0> vP = C48009v0.Jx0().mo25815vP(5, this.f58620d.field_orderFlag);
        LinkedList<C19623o0> linkedList = new LinkedList<>();
        linkedList.addAll(uP);
        linkedList.add(this.f58620d);
        linkedList.addAll(vP);
        if (!Util.isNullOrNil((List) linkedList)) {
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            for (C19623o0 o0Var : linkedList) {
                if (((HashMap) C20739g.f58625a).containsKey(Long.valueOf(o0Var.field_msgId))) {
                    if (!C20739g.m22689a(((Integer) ((HashMap) C20739g.f58625a).get(Long.valueOf(o0Var.field_msgId))).intValue())) {
                    }
                }
                if (o0Var.mo25754B2()) {
                    C48299e eVar = new C48299e();
                    eVar.f129340h = o0Var.field_msgId;
                    eVar.f129339g = o0Var.field_content;
                    linkedList2.add(eVar);
                    ((HashMap) C20739g.f58625a).put(Long.valueOf(o0Var.field_msgId), Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                } else {
                    ((HashMap) C20739g.f58625a).put(Long.valueOf(o0Var.field_msgId), Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                    linkedList3.add(o0Var);
                }
            }
            if (linkedList2.size() > 0) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).mo71016xs(linkedList2, 90);
            }
        }
    }
}
