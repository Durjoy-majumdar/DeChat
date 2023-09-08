package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49931j20;
import te3.C50069k20;

/* renamed from: mi.e */
public class C47037e extends C89132b<C50069k20> {
    public C47037e(String str, LinkedList<String> linkedList) {
        Log.m105919d("MicroMsg.CgiAddChatRoomAdmin", "roomName:%s,username:%s", str, Util.listToString(linkedList, ";"));
        C49931j20 j202 = new C49931j20();
        j202.f135823d = str;
        j202.f135824e = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = j202;
        bVar.f127067b = new C50069k20();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delchatroomadmin";
        bVar.f127069d = TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION;
        mo123453j(bVar.mo72403a());
    }
}
