package np0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.Map;
import kr0.C76626j0;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;
import v90.C78373a;

/* renamed from: np0.k */
public enum C34972k implements C31922b1 {
    INSTANCE;

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2;
        String str3 = str;
        Map<String, String> map2 = map;
        C35136m.C35137a aVar2 = aVar;
        Class cls = C75700k0.class;
        if (str3 == null || !str3.equals("weapp_pushmsg")) {
            Log.m105920e("MicroMsg.WxaAppBrandNotifyMsgHandler", "subType is err, return");
            return null;
        }
        Log.m105925i("MicroMsg.WxaAppBrandNotifyMsgHandler", "consumeNewXml subType:%s", str3);
        String str4 = map2.get(".sysmsg.weapp_pushmsg.title");
        if (Util.isNullOrNil(str4)) {
            Log.m105920e("MicroMsg.WxaAppBrandNotifyMsgHandler", "title is null, return");
            return null;
        } else if (Util.isNullOrNil(map2.get(".sysmsg.weapp_pushmsg.wxa_nickname"))) {
            Log.m105920e("MicroMsg.WxaAppBrandNotifyMsgHandler", "nickname is null, return");
            return null;
        } else {
            String str5 = map2.get(".sysmsg.weapp_pushmsg.busi_msgid");
            if (Util.isNullOrNil(str5)) {
                Log.m105920e("MicroMsg.WxaAppBrandNotifyMsgHandler", "msgId is null, return");
                return null;
            } else if (aVar2 == null || aVar2.f94242a == null) {
                Log.m105920e("MicroMsg.WxaAppBrandNotifyMsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
                return null;
            } else {
                String str6 = map2.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
                if (Util.isNullOrNil(str6)) {
                    Log.m105928w("MicroMsg.WxaAppBrandNotifyMsgHandler", "appId is null");
                }
                String str7 = map2.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
                if (Util.isNullOrNil(str7)) {
                    Log.m105928w("MicroMsg.WxaAppBrandNotifyMsgHandler", "pagePath is null");
                }
                C77949j3 j3Var = aVar2.f94242a;
                String g = C48374j0.m53718g(j3Var.f227631h);
                String g2 = C48374j0.m53718g(j3Var.f227628e);
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(g2, j3Var.f227638r);
                boolean z = h302.getMsgId() > 0;
                h302.mo108745Y2(j3Var.f227638r);
                h302.mo108733M2(C75604z3.m90841m(g2, (long) j3Var.f227635o));
                h302.setType(872415281);
                h302.mo108732L2(g);
                h302.mo108740T2(0);
                h302.mo100991d(3);
                h302.mo108749c3("appbrand_notify_message");
                h302.mo101012p4(j3Var.f227636p);
                h302.f230735S = String.valueOf(System.currentTimeMillis());
                h302.f230755r = true;
                if (C75604z3.m90850v("appbrand_notify_message") == 0) {
                    Log.m105924i("MicroMsg.WxaAppBrandNotifyMsgHandler", "empty appbrand notify message, insert tips message");
                    C72963f4 f4Var = new C72963f4();
                    f4Var.setType(872415281);
                    f4Var.mo108749c3("appbrand_notify_message");
                    f4Var.mo108732L2("");
                    str2 = str6;
                    f4Var.mo108733M2(h302.getCreateTime() - 1);
                    f4Var.mo108740T2(2);
                    f4Var.mo100991d(4);
                    C75604z3.m90852x(f4Var);
                } else {
                    str2 = str6;
                }
                C75604z3.m90842n(h302, aVar2);
                if (!z) {
                    C75604z3.m90852x(h302);
                } else {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(j3Var.f227638r, h302);
                }
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("appbrand_notify_message");
                if (j != null) {
                    j.mo108371j3(134217728);
                    Log.m105919d("MicroMsg.WxaAppBrandNotifyMsgHandler", "username:%s ok:%b", h302.mo108768t(), Integer.valueOf(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69775m0(j, "appbrand_notify_message", true, true)));
                } else {
                    Log.m105918d("MicroMsg.WxaAppBrandNotifyMsgHandler", "conv is null");
                }
                C76626j0 j0Var = (C76626j0) C86312j.m106911c(C76626j0.class);
                C115669n.INSTANCE.mo160131h(19724, 3, 0, 0, 0, 0, null, 0, 0, 0, str2, str7, null, str5, 0, null, C78373a.m94637b(str4), 0, null, null, j0Var != null ? j0Var.hk0() : null);
                return null;
            }
        }
    }
}
