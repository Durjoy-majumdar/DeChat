package eb0;

import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C75579g;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ob0.C35136m;

/* renamed from: eb0.m */
public class C31489m implements C75579g.C31464d {
    /* renamed from: X5 */
    public C35136m.C35139b mo58199X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2 = map.get(".sysmsg.brand_username");
        String str3 = map.get(".sysmsg.replacemsg");
        LinkedList<C72963f4> TY = ((C72972g4) C97625j3.m125812b().mo105911z()).mo101091TY(str2, map.get(".sysmsg.revoke_climsgid"));
        if (TY != null && !TY.isEmpty()) {
            Iterator<C72963f4> it = TY.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if ((next.f230723F & 4) != 4) {
                    next.mo108732L2(str3);
                    next.setType(10000);
                    C75604z3.m90842n(next, aVar);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(next.getMsgId(), next);
                }
                C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str2);
                if (j != null && j.mo108786G2() > 0 && j.mo108786G2() >= ((C72972g4) C97625j3.m125812b().mo105911z()).cy0(next)) {
                    j.mo108812g3(j.mo108786G2() - 1);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(j, j.getUsername());
                }
                C86709a0.m107525e().postToWorker(new C31487l(this, next));
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo58188a() {
        return true;
    }
}
