package sc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: sc0.d */
public class C36657d extends C36652a {

    /* renamed from: l */
    public LinkedList<String> f97442l = new LinkedList<>();

    /* renamed from: m */
    public String f97443m;

    /* renamed from: n */
    public String f97444n;

    public C36657d(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (Util.isNullOrNil(this.f97421d) || !this.f97421d.equalsIgnoreCase("delchatroommember")) {
            Log.m105921e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", Util.nullAsNil(this.f97421d));
            return false;
        }
        this.f97444n = Util.nullAsNil(this.f97418a.get(".sysmsg.delchatroommember.url"));
        this.f97443m = Util.nullAsNil(this.f97418a.get(".sysmsg.delchatroommember.link.qrcode"));
        this.f97442l.add(this.f97418a.get(".sysmsg.delchatroommember.link.memberlist.username"));
        for (String next : this.f97418a.keySet()) {
            if (next.startsWith(".sysmsg.delchatroommember.link.memberlist.username#")) {
                this.f97442l.add(this.f97418a.get(next));
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next2 : this.f97418a.keySet()) {
            if (next2.startsWith(C36652a.f97416j)) {
                if (sb.length() > 0) {
                    sb.insert(0, this.f97418a.get(next2));
                } else {
                    sb.append(this.f97418a.get(next2));
                }
            } else if (next2.startsWith(".sysmsg.delchatroommember.link.text")) {
                sb.append(this.f97418a.get(next2));
                this.f97424g.add(this.f97418a.get(next2));
                i = this.f97418a.get(next2).length();
            }
        }
        this.f97425h.addFirst(Integer.valueOf(sb.length() - i));
        this.f97426i.add(Integer.valueOf(sb.length()));
        this.f97420c = sb.toString();
        Log.m105925i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", this.f97444n, this.f97443m, Integer.valueOf(this.f97442l.size()));
        return true;
    }
}
