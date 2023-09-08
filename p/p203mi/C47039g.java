package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C52056y20;
import te3.C52203z20;

/* renamed from: mi.g */
public class C47039g extends C89132b<C52203z20> {
    public C47039g(String str, LinkedList<String> linkedList) {
        Log.m105919d("MicroMsg.CgiOpenImDelChatRoomAdmin", "roomName:%s,username:%s", str, Util.listToString(linkedList, ";"));
        C52056y20 y202 = new C52056y20();
        y202.f145084d = str;
        y202.f145085e = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = y202;
        bVar.f127067b = new C52203z20();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delopenimchatroomadmin";
        bVar.f127069d = 3677;
        mo123453j(bVar.mo72403a());
    }
}
