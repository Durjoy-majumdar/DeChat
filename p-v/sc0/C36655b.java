package sc0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: sc0.b */
public class C36655b extends C36652a {

    /* renamed from: l */
    public LinkedList<String> f97428l = new LinkedList<>();

    /* renamed from: m */
    public String f97429m = null;

    /* renamed from: n */
    public String f97430n = null;

    /* renamed from: o */
    public String f97431o = null;

    public C36655b(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (Util.isNullOrNil(this.f97421d) || !this.f97421d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")) {
            Log.m105921e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", Util.nullAsNil(this.f97421d));
            return false;
        }
        String str = this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.RoomName");
        if (this.f97418a.containsKey(C36652a.f97416j)) {
            this.f97429m = Util.nullAsNil(this.f97418a.get(C36652a.f97416j));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text")) {
            this.f97430n = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket")) {
            this.f97431o = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket"));
        }
        this.f97420c = this.f97429m;
        if (!this.f97419b.mo100978Q3()) {
            this.f97424g.add(this.f97430n);
            this.f97425h.add(Integer.valueOf(this.f97420c.length()));
            String str2 = this.f97420c + this.f97430n;
            this.f97420c = str2;
            this.f97426i.add(Integer.valueOf(str2.length()));
        } else {
            this.f97420c += " " + MMApplicationContext.getContext().getString(C0966R.string.fji);
        }
        for (String next : this.f97418a.keySet()) {
            if (next.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username")) {
                this.f97428l.add(this.f97418a.get(next));
            }
        }
        return true;
    }
}
