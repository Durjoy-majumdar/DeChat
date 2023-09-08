package le0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import te3.C50089k7;
import te3.C50225l7;
import te3.C51932x63;

/* renamed from: le0.a */
public class C46852a extends C89132b<C50225l7> {
    public C46852a(String str, String str2, String str3, List<String> list) {
        Log.m105919d("MicroMsg.CgiOpenImApproveAddRoomMember", "CgiOpenImApproveAddRoomMember() inviterusername%s, roomname:%s, ticket:%s, username:%s", str, str2, Util.secPrint(str3), list);
        C50089k7 k7Var = new C50089k7();
        k7Var.f136594g = str3;
        k7Var.f136591d = str2;
        C51932x63 x632 = new C51932x63();
        x632.f144489d = str;
        k7Var.f136592e = x632;
        LinkedList<C51932x63> linkedList = new LinkedList<>();
        for (String str4 : list) {
            C51932x63 x633 = new C51932x63();
            x633.f144489d = str4;
            linkedList.add(x633);
        }
        k7Var.f136593f = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = k7Var;
        bVar.f127067b = new C50225l7();
        bVar.f127068c = "/cgi-bin/micromsg-bin/approveaddopenimchatroommember";
        bVar.f127069d = 941;
        mo123453j(bVar.mo72403a());
    }
}
