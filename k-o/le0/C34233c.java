package le0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import sc0.C36652a;

/* renamed from: le0.c */
public class C34233c extends C36652a {
    public C34233c(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApprovedNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.OpenIMChatRoomAddChatRoomMemberApprovedNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (Util.isNullOrNil(this.f97421d) || !this.f97421d.equalsIgnoreCase("NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved")) {
            Log.m105921e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApprovedNewXmlMsg", "[parseXml] type err :%s", Util.nullAsNil(this.f97421d));
            return false;
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved.approver_username")) {
            Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved.approver_username"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved.application_climsgid")) {
            Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved.application_climsgid"));
        }
        return true;
    }
}
