package sc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;

/* renamed from: sc0.f */
public class C36659f extends C36652a {
    public C36659f(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        if (this.f97418a == null) {
            Log.m105920e("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        Log.m105925i("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] type:%s, values size:%s", Util.nullAsNil(this.f97421d), Integer.valueOf(this.f97418a.size()));
        if (this.f97418a.containsKey(".sysmsg.SysMsgContent")) {
            this.f97420c = Util.nullAsNil(this.f97418a.get(".sysmsg.SysMsgContent"));
        }
        Log.m105924i("MicroMsg.FinderChatSystemaNewXmlMsg", "appText = " + this.f97420c);
        return false;
    }
}
