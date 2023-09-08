package dd1;

import bd1.C54446b;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C50119ke1;
import te3.C52261zg3;

/* renamed from: dd1.e */
public final class C7264e extends C87413o implements C32226l<C54446b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C50119ke1 f25325d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7264e(C50119ke1 ke12) {
        super(1);
        this.f25325d = ke12;
    }

    public Object invoke(Object obj) {
        C54446b bVar = (C54446b) obj;
        LinkedList<C52261zg3> linkedList = this.f25325d.f136709z;
        C87412m.m108593f(linkedList, "this.finder_list");
        Iterator<C52261zg3> it = linkedList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            FinderContact finderContact = it.next().f145918e;
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
