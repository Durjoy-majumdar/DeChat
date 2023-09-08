package vm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;
import sf0.C48374j0;

/* renamed from: vm2.l */
public class C37780l implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Class cls = C30914c.class;
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("MicroMsg.RedPointInfoListener", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml != null) {
            String nullAs = Util.nullAs(parseXml.get(".sysmsg.RedPoints.redPoint.path"), "");
            int safeParseInt = Util.safeParseInt(Util.nullAs(parseXml.get(".sysmsg.RedPoints.redPoint.redPointId"), ""));
            Util.safeParseInt(Util.nullAs(parseXml.get(".sysmsg.RedPoints.redPoint.mustClearInSameTime"), ""));
            if (!Util.isNullOrNil(nullAs)) {
                if (nullAs.equals("my_setting_privaty_recentOption")) {
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SETTING_RECENT_RED_DOT_ID_INT;
                    if (((Integer) i.mo119685f(aVar2, 0)).intValue() < safeParseInt) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(safeParseInt));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_RED_DOT_WILL_SHOW_ID_INT, Integer.valueOf(safeParseInt));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_RED_DOT_WILL_SHOW_ID_INT, Integer.valueOf(safeParseInt));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, Integer.valueOf(safeParseInt));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, Integer.valueOf(safeParseInt));
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(266260, true);
                    }
                } else if (nullAs.equals("my_setting_plugin_switch")) {
                    String nullAs2 = Util.nullAs(parseXml.get(".sysmsg.RedPoints.redPoint.ext"), "");
                    if (!Util.isNullOrNil(nullAs2)) {
                        C85801v1 i2 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SWITCH_REDDOT_INT;
                        if (((Integer) i2.mo119685f(aVar3, 0)).intValue() < safeParseInt) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar3, Integer.valueOf(safeParseInt));
                            C85801v1 i3 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING;
                            String str = (String) i3.mo119685f(aVar4, "");
                            if (!Util.isNullOrNil(str)) {
                                nullAs2 = nullAs2.concat(",").concat(str);
                            }
                            C86709a0.m107535s().mo121142i().mo119677K(aVar4, nullAs2);
                            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262158, true);
                        }
                    }
                }
            }
        }
    }
}
