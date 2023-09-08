package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49889is;
import te3.C50910q4;
import te3.C51056r4;

/* renamed from: mi.c */
public class C47035c extends C89132b<C51056r4> {
    public C47035c(String str, LinkedList<String> linkedList) {
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Util.nullAs(str, "");
        objArr[1] = Integer.valueOf(linkedList != null ? linkedList.size() : i);
        Log.m105919d("MicroMsg.CgiAlterChatRoomWatchMembers", "roomname:%s", objArr);
        LinkedList<C49889is> linkedList2 = new LinkedList<>();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            C49889is isVar = new C49889is();
            isVar.f135632d = it.next();
            linkedList2.add(isVar);
        }
        C50910q4 q4Var = new C50910q4();
        q4Var.f140120d = Util.nullAs(str, "");
        q4Var.f140121e = linkedList2.size();
        q4Var.f140122f = linkedList2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = q4Var;
        bVar.f127067b = new C51056r4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/alterchatroomwatchmembers";
        bVar.f127069d = 447;
        mo123453j(bVar.mo72403a());
    }
}
