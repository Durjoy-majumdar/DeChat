package sc0;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C45613m2;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31922b1;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: sc0.g */
public class C36660g implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C44661m1 m1Var;
        Log.m105919d("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "consumeNewXml， subType:%s", Util.nullAs(str, ""));
        if (Util.nullAsNil(str).equals("NewXmlUpgradeAssociateChatRoom")) {
            if (map == null) {
                return null;
            }
            if (map.containsKey(".sysmsg.NewXmlUpgradeAssociateChatRoom.text")) {
                String nullAsNil = Util.nullAsNil(map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.text"));
                String nullAsNil2 = Util.nullAsNil(map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.roomname"));
                if (Util.isNullOrNil(nullAsNil) || Util.isNullOrNil(nullAsNil2)) {
                    Log.m105925i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s ", Util.nullAs(nullAsNil2, ""), Util.secPrint(nullAsNil));
                    return null;
                }
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108740T2(0);
                f4Var.mo108749c3(nullAsNil2);
                f4Var.mo100991d(3);
                f4Var.mo108732L2(nullAsNil);
                f4Var.mo108733M2(C75604z3.m90841m(nullAsNil2, System.currentTimeMillis() / 1000));
                f4Var.setType(10000);
                f4Var.mo108735O2(f4Var.mo108762o2() | 8);
                Log.m105925i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s msgId:%s", nullAsNil2, Util.secPrint(nullAsNil), Long.valueOf(C75604z3.m90852x(f4Var)));
                return null;
            }
            Log.m105924i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "no contains text");
            return null;
        } else if (!"mmchatroombarannouncememt".equals(str)) {
            return null;
        } else {
            C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
            String g = C48374j0.m53718g(aVar.f94242a.f227628e);
            String g2 = C48374j0.m53718g(aVar.f94242a.f227629f);
            if (C75592q0.m90789s().equals(g)) {
                m1Var = ((C44662n1) mr).mo69799Lo(g2);
                if (m1Var == null) {
                    m1Var = new C44661m1();
                    m1Var.field_chatroomname = g2;
                }
                m1Var.field_chatroomnoticeEditor = g;
            } else {
                C44661m1 Lo = ((C44662n1) mr).mo69799Lo(g);
                if (Lo == null) {
                    Lo = new C44661m1();
                    Lo.field_chatroomname = g;
                }
                m1Var = Lo;
                m1Var.field_chatroomnoticeEditor = C75604z3.m90847s(aVar.f94242a.f227631h.f141175d);
            }
            m1Var.field_chatroomnoticePublishTime = (long) aVar.f94242a.f227635o;
            String str2 = map.get(".sysmsg.mmchatroombarannouncememt.content");
            if (!Util.isNullOrNil(str2) && !str2.equals(m1Var.field_chatroomnotice)) {
                m1Var.field_chatroomNoticeNew = 1;
            } else if (Util.isNullOrNil(str2)) {
                m1Var.field_chatroomNoticeNew = 0;
            }
            m1Var.field_chatroomnotice = str2;
            ((C44662n1) mr).replace(m1Var);
            return null;
        }
    }
}
