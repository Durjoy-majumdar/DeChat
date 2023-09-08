package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import ol0.C117805g;
import te3.C51911x2;
import te3.C52055y2;

/* renamed from: mi.b */
public class C47034b extends C89132b<C52055y2> {
    public C47034b(String str, LinkedList<String> linkedList) {
        Log.m105919d("MicroMsg.CgiAddChatRoomAdmin", "roomName:%s,username:%s", str, Util.listToString(linkedList, ";"));
        C51911x2 x2Var = new C51911x2();
        x2Var.f144407d = str;
        x2Var.f144408e = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = x2Var;
        bVar.f127067b = new C52055y2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addchatroomadmin";
        bVar.f127069d = C117805g.CTRL_INDEX;
        mo123453j(bVar.mo72403a());
    }
}
