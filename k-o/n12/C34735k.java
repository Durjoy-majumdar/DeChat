package n12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C86497v5;
import eb0.C97625j3;
import java.util.Map;
import ob0.C35136m;
import s12.C63692g;
import s12.C63693h;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: n12.k */
public class C34735k implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Log.m105924i("WeChatOutMsgListener", "WeChatOutMsg onRecieveMsg");
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, msgContent is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105920e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, values is null");
            return;
        }
        C63693h Ax0 = C105385g.Ax0();
        long j = (long) j3Var.f227627d;
        Ax0.getClass();
        C63692g gVar = new C63692g();
        gVar.field_svrId = j;
        String str = parseXml.get(".sysmsg.WeChatOutMsg.Title");
        gVar.field_title = str;
        if (str == null) {
            gVar.field_title = "";
        }
        String str2 = parseXml.get(".sysmsg.WeChatOutMsg.Content");
        gVar.field_content = str2;
        if (str2 == null) {
            gVar.field_content = "";
        }
        int i = Util.getInt(parseXml.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
        gVar.field_msgType = i;
        gVar.field_pushTime = Util.getLong(parseXml.get(".sysmsg.WeChatOutMsg.PushTime"), 0);
        String str3 = parseXml.get(".sysmsg.WeChatOutMsg.DescUrl");
        gVar.field_descUrl = str3;
        if (str3 == null) {
            gVar.field_descUrl = "";
        }
        Log.m105925i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", gVar.field_svrId + "", gVar.field_title, gVar.field_content, gVar.field_msgType + "", gVar.field_pushTime + "", gVar.field_descUrl);
        Ax0.insert(gVar);
        if (i != -1) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, Integer.valueOf(i));
        }
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN, Boolean.TRUE);
        C115669n.INSTANCE.mo160131h(13254, 4, 0, 0, -1, Integer.valueOf(i), -1);
    }
}
