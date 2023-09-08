package eb0;

import a11.C39478b;
import a11.C39479c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p788aj.C39607a;
import te3.C49324es;

@C86522b
/* renamed from: eb0.n0 */
public class C45615n0 extends C86301e implements C39478b {
    /* renamed from: NH */
    public String mo62075NH(List<String> list, int i, String str) {
        return C45612m0.m50692i(list, i, str);
    }

    public boolean X50(String str, String str2, C49324es esVar, String str3, C39607a aVar, IEvent iEvent) {
        return C45612m0.m50682I(str, str2, esVar, 0, -1, -1, str3, aVar, iEvent);
    }

    /* renamed from: Yv */
    public boolean mo62077Yv(String str) {
        List<String> l = C45612m0.m50695l(str);
        LinkedList linkedList = new LinkedList();
        if (l != null) {
            linkedList.addAll(l);
        }
        linkedList.remove(C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 SE = n1Var.mo69801SE(str);
        LinkedList linkedList2 = new LinkedList();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList2.add((String) linkedList.get(i));
        }
        if (!Util.isNullOrNil("")) {
            SE.field_roomowner = "";
        }
        SE.mo69780C2(linkedList2);
        SE.field_displayname = C45612m0.m50693j(linkedList2, str);
        SE.field_memberCount = linkedList2.size();
        return n1Var.replace(SE);
    }

    /* renamed from: aB */
    public boolean mo62078aB(String str, ArrayList<String> arrayList, String str2) {
        return C45612m0.m50702s(str, arrayList, str2);
    }

    /* renamed from: k5 */
    public List<String> mo62079k5(String str) {
        return C45612m0.m50695l(str);
    }

    /* renamed from: p1 */
    public int mo62080p1(String str) {
        return C45612m0.m50697n(str);
    }

    /* renamed from: tk */
    public boolean mo62081tk(String str) {
        return C45612m0.m50708y(str);
    }
}
