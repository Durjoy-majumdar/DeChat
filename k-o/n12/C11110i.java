package n12;

import com.tencent.p014mm.autogen.events.IPCallNewXmlInfoChangeEvent;
import com.tencent.p014mm.autogen.events.UnreadChangeEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C86497v5;
import eb0.C97625j3;
import java.util.Map;
import ob0.C35136m;
import p158gt.C8451i;
import s12.C13610a;
import sf0.C48374j0;

/* renamed from: n12.i */
public class C11110i implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        int i;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN;
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN;
        Log.m105924i("WeChatOutListener", "WeChatOut onRecieveMsg");
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("WeChatOutListener", "WeChatOut onReceiveMsg, msgContent is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105920e("WeChatOutListener", "WeChatOut onReceiveMsg, values is null");
            return;
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AccountRedDotType")) {
            i = Util.getInt(parseXml.get(".sysmsg.WeChatOut.AccountRedDotType"), -1);
            Log.m105925i("WeChatOutListener", "WeChatOut AccountRedDotType: %d", Integer.valueOf(i));
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_TYPE_INT, Integer.valueOf(i));
        } else {
            i = -1;
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AcctRD")) {
            int i2 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.AcctRD"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut AcctRD: %d", Integer.valueOf(i2));
            if (i2 != 0) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar4, Boolean.TRUE);
                C115669n.INSTANCE.mo160131h(13254, 2, 0, 0, Integer.valueOf(i), -1, -1);
            } else {
                C97625j3.m125812b().mo105906u().mo119677K(aVar4, Boolean.FALSE);
            }
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.TabRD")) {
            int i3 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.TabRD"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut TabRD: %d", Integer.valueOf(i3));
            if (i3 != 0) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar3, Boolean.TRUE);
                C115669n.INSTANCE.mo160131h(13254, 1, 0, 0, -1, -1, -1);
            } else {
                C97625j3.m125812b().mo105906u().mo119677K(aVar3, Boolean.FALSE);
            }
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.RechargeRD")) {
            int i4 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.RechargeRD"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut RechargeRD: %d", Integer.valueOf(i4));
            if (i4 != 0) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar2, Boolean.TRUE);
                C115669n.INSTANCE.mo160131h(13254, 3, 0, 0, -1, -1, -1);
            } else {
                C97625j3.m125812b().mo105906u().mo119677K(aVar2, Boolean.FALSE);
            }
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.RechargeWording")) {
            String str = parseXml.get(".sysmsg.WeChatOut.RechargeWording");
            Log.m105925i("WeChatOutListener", "WeChatOut RechargeWording: %s", str);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_RECHARGE_STRING, str);
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.PackagePurchaseWording")) {
            String str2 = parseXml.get(".sysmsg.WeChatOut.PackagePurchaseWording");
            Log.m105925i("WeChatOutListener", "WeChatOut PackagePurchaseWording: %s", str2);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_PACKAGE_PURCHASE_STRING, str2);
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AccountWording")) {
            String str3 = parseXml.get(".sysmsg.WeChatOut.AccountWording");
            Log.m105925i("WeChatOutListener", "WeChatOut AccountWording: %s", str3);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING, str3);
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.RechargeWordingVersion")) {
            int i5 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.RechargeWordingVersion"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut RechargeWordingVersion: %d", Integer.valueOf(i5));
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_REDDOT_RECHARGE_VERSION_INT, Integer.valueOf(i5));
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.TabWording")) {
            String str4 = parseXml.get(".sysmsg.WeChatOut.TabWording");
            Log.m105925i("WeChatOutListener", "WeChatOut TabWording: %s", str4);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_WORDING_STRING, str4);
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AccountActivityWording")) {
            String str5 = parseXml.get(".sysmsg.WeChatOut.AccountActivityWording");
            Log.m105925i("WeChatOutListener", "WeChatOut AccountActivityWording: %s", str5);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING, str5);
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AccountActivityWordingClearType")) {
            int i6 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.AccountActivityWordingClearType"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut AccountActivityWordingClearType : %d", Integer.valueOf(i6));
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_CLEAR_TYPE_INT, Integer.valueOf(i6));
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.AccountActivityWordingVersion")) {
            int i7 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.AccountActivityWordingVersion"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut AccountActivityWordingVersion: %d", Integer.valueOf(i7));
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_TYPE_VERSION_INT, Integer.valueOf(i7));
        }
        if (parseXml.containsKey(".sysmsg.WeChatOut.TabRedDotType")) {
            int i8 = Util.getInt(parseXml.get(".sysmsg.WeChatOut.TabRedDotType"), 0);
            Log.m105925i("WeChatOutListener", "WeChatOut TabRedDotType: %d", Integer.valueOf(i8));
            C115669n.INSTANCE.mo160131h(13254, 0, 0, 0, -1, -1, Integer.valueOf(i8));
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_TYPE_INT, Integer.valueOf(i8));
        }
        int indexOf = g.indexOf("<ActivityInfo>");
        int indexOf2 = g.indexOf("</ActivityInfo>");
        if (indexOf > 0 && indexOf2 > 0 && indexOf2 > indexOf) {
            String substring = g.substring(indexOf, indexOf2 + 15);
            Log.m105925i("WeChatOutListener", "WeChatOut ActivityInfo: %s", substring);
            C13610a a = C13610a.m12910a(substring);
            if (a != null && Util.isNullOrNil(a.f38568a) && Util.isNullOrNil(a.f38569b)) {
                Log.m105924i("WeChatOutListener", "clear activity");
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN, Boolean.FALSE);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_ACTIVITY_STRING, "");
            } else if (a != null) {
                if (!Util.isNullOrNil(a.f38570c)) {
                    ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(a.f38570c, (C8451i.C8452a) null);
                }
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN, Boolean.TRUE);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_IPCALL_ACTIVITY_STRING, substring);
            }
        }
        new IPCallNewXmlInfoChangeEvent().publish();
        new UnreadChangeEvent().publish();
    }
}
