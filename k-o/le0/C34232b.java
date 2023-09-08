package le0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import java.util.Map;
import sc0.C36652a;

/* renamed from: le0.b */
public class C34232b extends C36652a {

    /* renamed from: l */
    public String f92295l;

    /* renamed from: m */
    public String f92296m;

    /* renamed from: n */
    public int f92297n;

    /* renamed from: o */
    public LinkedList<String> f92298o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<String> f92299p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<String> f92300q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<String> f92301r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<String> f92302s = new LinkedList<>();

    /* renamed from: t */
    public String f92303t = null;

    /* renamed from: u */
    public String f92304u = null;

    /* renamed from: v */
    public String f92305v = null;

    /* renamed from: w */
    public String f92306w = null;

    /* renamed from: x */
    public String f92307x = null;

    /* renamed from: y */
    public String f92308y = null;

    public C34232b(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (Util.isNullOrNil(this.f97421d) || !this.f97421d.equalsIgnoreCase("NewXmlOpenIMChatRoomAddChatRoomMemberApplication")) {
            Log.m105921e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type err :%s", Util.nullAsNil(this.f97421d));
            return false;
        }
        this.f92295l = this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.RoomName");
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text")) {
            this.f92307x = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username")) {
            this.f92303t = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid")) {
            this.f92304u = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid")) {
            this.f92305v = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason")) {
            this.f92306w = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason"));
        }
        if (this.f97418a.containsKey(C36652a.f97416j)) {
            this.f92308y = Util.nullAsNil(this.f97418a.get(C36652a.f97416j));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket")) {
            this.f92296m = this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket");
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize")) {
            this.f92297n = Util.getInt(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize"), 0);
        }
        if (!this.f97419b.mo100978Q3()) {
            this.f97425h.add(Integer.valueOf(this.f92308y.length()));
            this.f97424g.add(this.f92307x);
            String str = this.f92308y + this.f92307x;
            this.f97420c = str;
            this.f97426i.add(Integer.valueOf(str.length()));
        } else {
            this.f97424g.clear();
            this.f97425h.clear();
            this.f97426i.clear();
            String str2 = this.f92308y + " ";
            this.f97420c = str2;
            this.f97425h.add(Integer.valueOf(str2.length()));
            this.f97424g.add(MMApplicationContext.getContext().getString(C0966R.string.fjd));
            String str3 = this.f97420c + MMApplicationContext.getContext().getString(C0966R.string.fjd);
            this.f97420c = str3;
            this.f97426i.add(Integer.valueOf(str3.length()));
        }
        for (int i = 0; i < this.f92297n; i++) {
            if (i == 0) {
                this.f92298o.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.username")));
                this.f92299p.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.nickname")));
                this.f92300q.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.descid")));
                this.f92301r.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.appid")));
                this.f92302s.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.headimgurl")));
            } else {
                this.f92298o.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".username")));
                this.f92299p.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".nickname")));
                this.f92301r.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".appid")));
                this.f92300q.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".descid")));
                this.f92302s.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i + ".headimgurl")));
            }
        }
        return true;
    }
}
