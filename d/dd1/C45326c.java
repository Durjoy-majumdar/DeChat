package dd1;

import bd1.C54446b;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C51248si0;
import te3.C51430tq0;

/* renamed from: dd1.c */
public final class C45326c extends C87413o implements C32226l<C54446b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C51430tq0 f122781d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45326c(C51430tq0 tq02) {
        super(1);
        this.f122781d = tq02;
    }

    public Object invoke(Object obj) {
        C54446b bVar = (C54446b) obj;
        LinkedList<C51248si0> linkedList = this.f122781d.f142327C;
        C87412m.m108593f(linkedList, "resp.contacts");
        Iterator<C51248si0> it = linkedList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            FinderContact finderContact = it.next().f141536d;
            if (C87412m.m108589b(finderContact != null ? finderContact.username : null, bVar.field_username)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
