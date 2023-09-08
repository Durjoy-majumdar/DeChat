package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C50345m3;
import te3.C50487n3;

/* renamed from: mi.f */
public class C47038f extends C89132b<C50487n3> {
    public C47038f(String str, LinkedList<String> linkedList) {
        Log.m105919d("MicroMsg.CgiOpenImAddChatRoomAdmin", "roomName:%s,username:%s", str, Util.listToString(linkedList, ";"));
        C50345m3 m3Var = new C50345m3();
        m3Var.f137797d = str;
        m3Var.f137798e = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = m3Var;
        bVar.f127067b = new C50487n3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addopenimchatroomadmin";
        bVar.f127069d = 776;
        mo123453j(bVar.mo72403a());
    }
}
