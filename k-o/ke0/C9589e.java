package ke0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.Map;
import ob0.C35136m;

/* renamed from: ke0.e */
public class C9589e implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Class cls = C75700k0.class;
        Log.m105919d("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "consumeNewXml subType:%s", Util.nullAs(str, ""));
        if (!Util.nullAsNil(str).equals("SendMsgFailed") || map == null) {
            return null;
        }
        try {
            String trim = Util.nullAsNil(map.get(".sysmsg.SendMsgFailed.newmsgid")).trim();
            String trim2 = Util.nullAsNil(map.get(".sysmsg.SendMsgFailed.tousername")).trim();
            Log.m105925i("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "msgId:%s toUsername:%s", trim, trim2);
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(trim2, Util.safeParseLong(trim));
            h302.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(h302.getMsgId(), h302);
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "consumeNewXml Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }
    }
}
