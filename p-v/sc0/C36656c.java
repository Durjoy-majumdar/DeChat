package sc0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: sc0.c */
public class C36656c extends C36652a {

    /* renamed from: l */
    public String f97432l;

    /* renamed from: m */
    public String f97433m;

    /* renamed from: n */
    public int f97434n;

    /* renamed from: o */
    public LinkedList<String> f97435o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<String> f97436p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<String> f97437q = new LinkedList<>();

    /* renamed from: r */
    public String f97438r = null;

    /* renamed from: s */
    public String f97439s = null;

    /* renamed from: t */
    public String f97440t = null;

    /* renamed from: u */
    public String f97441u = null;

    public C36656c(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (Util.isNullOrNil(this.f97421d) || !this.f97421d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) {
            Log.m105921e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", Util.nullAsNil(this.f97421d));
            return false;
        }
        this.f97432l = this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName");
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text")) {
            this.f97440t = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername")) {
            this.f97438r = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername"));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason")) {
            this.f97439s = Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason"));
        }
        if (this.f97418a.containsKey(C36652a.f97416j)) {
            this.f97441u = Util.nullAsNil(this.f97418a.get(C36652a.f97416j));
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket")) {
            this.f97433m = this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket");
        }
        if (this.f97418a.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")) {
            this.f97434n = Util.getInt(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
        }
        if (!this.f97419b.mo100978Q3()) {
            this.f97425h.add(Integer.valueOf(this.f97441u.length()));
            this.f97424g.add(this.f97440t);
            String str = this.f97441u + this.f97440t;
            this.f97420c = str;
            this.f97426i.add(Integer.valueOf(str.length()));
        } else {
            this.f97424g.clear();
            this.f97425h.clear();
            this.f97426i.clear();
            String str2 = this.f97441u + " ";
            this.f97420c = str2;
            this.f97425h.add(Integer.valueOf(str2.length()));
            this.f97424g.add(MMApplicationContext.getContext().getString(C0966R.string.fjd));
            String str3 = this.f97420c + MMApplicationContext.getContext().getString(C0966R.string.fjd);
            this.f97420c = str3;
            this.f97426i.add(Integer.valueOf(str3.length()));
        }
        for (int i = 0; i < this.f97434n; i++) {
            if (i == 0) {
                this.f97435o.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username")));
                this.f97436p.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname")));
                this.f97437q.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl")));
            } else {
                this.f97435o.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".username")));
                this.f97436p.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".nickname")));
                this.f97437q.add(Util.nullAsNil(this.f97418a.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".headimgurl")));
            }
        }
        return true;
    }
}
