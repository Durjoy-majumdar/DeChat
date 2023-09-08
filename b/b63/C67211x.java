package b63;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import java.util.Map;
import ub3.C78144b;

/* renamed from: b63.x */
public class C67211x {

    /* renamed from: a */
    public String f192999a;

    /* renamed from: b */
    public String f193000b;

    /* renamed from: c */
    public int f193001c;

    /* renamed from: d */
    public String f193002d;

    /* renamed from: e */
    public String f193003e;

    /* renamed from: f */
    public String f193004f;

    /* renamed from: g */
    public String f193005g;

    /* renamed from: a */
    public static C67211x m79541a() {
        return m79542b(XmlParser.parseXml((String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, ""), "sysmsg", (String) null));
    }

    /* renamed from: b */
    public static C67211x m79542b(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        C67211x xVar = new C67211x();
        xVar.f192999a = map.get(".sysmsg.paymsg.BalanceNotice.wording");
        xVar.f193000b = map.get(".sysmsg.paymsg.BalanceNotice.wording_color");
        xVar.f193002d = map.get(".sysmsg.paymsg.BalanceNotice.bg_color");
        xVar.f193003e = map.get(".sysmsg.paymsg.BalanceNotice.route_url");
        xVar.f193004f = map.get(".sysmsg.paymsg.BalanceNotice.left_icon");
        xVar.f193005g = map.get(".sysmsg.paymsg.BalanceNotice.right_icon");
        xVar.f193001c = Util.getInt(map.get(".sysmsg.paymsg.BalanceNotice.wording_size"), 14);
        return xVar;
    }

    /* renamed from: c */
    public static void m79543c(String str) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, str);
    }
}
