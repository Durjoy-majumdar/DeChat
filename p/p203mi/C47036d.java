package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49807i7;
import te3.C49953j7;

/* renamed from: mi.d */
public class C47036d extends C89132b<C49953j7> {
    public C47036d(long j, String str, String str2, String str3, List<String> list) {
        Log.m105919d("MicroMsg.CgiApproveAddChatRoomMember", "inviterusername%s,roomname:%s,ticket:%s,username:%s approvenewmsgid:%s", str, str2, Util.secPrint(str3), list, Long.valueOf(j));
        C49807i7 i7Var = new C49807i7();
        i7Var.f135141f = str;
        i7Var.f135139d = str2;
        i7Var.f135140e = str3;
        i7Var.f135142g = new LinkedList<>(list);
        i7Var.f135143h = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = i7Var;
        bVar.f127067b = new C49953j7();
        bVar.f127068c = "/cgi-bin/micromsg-bin/approveaddchatroommember";
        bVar.f127069d = 774;
        mo123453j(bVar.mo72403a());
    }
}
