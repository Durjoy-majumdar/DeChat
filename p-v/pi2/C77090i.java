package pi2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.plugin.remittance.model.C70614v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86497v5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import h81.C32735h;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import oi2.C77010f;
import p327ct.C30914c;
import sf0.C48374j0;
import te3.C77949j3;
import vi2.C37738a;
import vi2.C78418c;

/* renamed from: pi2.i */
public class C77090i implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        C77010f.vx0().getClass();
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String str;
        C37738a aVar2;
        C77010f vx02 = C77010f.vx0();
        vx02.getClass();
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.SubCoreRemittance", "hy: received AddMsg");
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.SubCoreRemittance", "recieve a null msg");
            return;
        }
        String g = C48374j0.m53718g(j3Var.f227631h);
        if (Util.isNullOrNil(g)) {
            Log.m105920e("MicroMsg.SubCoreRemittance", "msg illegal,content is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.SubCoreRemittance", "Resolve msg error");
            return;
        }
        String str2 = parseXml.get(".sysmsg.paymsg.PayMsgType");
        boolean z = false;
        if (String.valueOf(15).equals(str2)) {
            String decode = URLDecoder.decode(parseXml.get(".sysmsg.paymsg.appmsgcontent"));
            if (TextUtils.isEmpty(decode)) {
                Log.m105920e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
                return;
            }
            Map<String, String> parseXml2 = XmlParser.parseXml(decode, "msg", (String) null);
            if (parseXml2 == null) {
                Log.m105920e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                return;
            }
            String str3 = parseXml2.get(".msg.appmsg.wcpayinfo.transferid");
            if (Util.isNullOrNil(str3)) {
                Log.m105920e("MicroMsg.SubCoreRemittance", "paymsgid is null");
                return;
            }
            C70614v0 xx02 = vx02.xx0();
            synchronized (xx02.f204299a) {
                if (!Util.isNullOrNil(str3)) {
                    z = ((ArrayList) xx02.mo97260b()).contains(str3);
                }
            }
            if (z) {
                Log.m105920e("MicroMsg.SubCoreRemittance", "it is a duplicate msg");
                return;
            }
            String str4 = parseXml.get(".sysmsg.paymsg.tousername");
            if (Util.isNullOrNil(decode) || Util.isNullOrNil(str4)) {
                Log.m105920e("MicroMsg.SubCoreRemittance", "onRecieveMsg get a illegal msg,which content or toUserName is null");
                return;
            }
            vx02.xx0().mo97261c(str3, decode, str4, parseXml.get("msg.appmsg.wcpayinfo.receiver_username"));
        } else if (String.valueOf(22).equals(str2)) {
            String str5 = parseXml.get(".sysmsg.paymsg.tousername");
            String str6 = parseXml.get(".sysmsg.paymsg.fromusername");
            try {
                String decode2 = URLDecoder.decode(parseXml.get(".sysmsg.paymsg.appmsgcontent"), "UTF-8");
                if (Util.isNullOrNil(decode2)) {
                    Log.m105920e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
                    return;
                }
                Map<String, String> parseXml3 = XmlParser.parseXml(decode2, "msg", (String) null);
                if (parseXml3 == null) {
                    Log.m105920e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                    return;
                }
                String str7 = parseXml3.get(".msg.appmsg.wcpayinfo.transferid");
                int i = Util.getInt(parseXml3.get(".msg.appmsg.wcpayinfo.paysubtype"), -1);
                String str8 = parseXml3.get(".msg.appmsg.wcpayinfo.receiver_name");
                Log.m105925i("MicroMsg.SubCoreRemittance", "receive delay transfer newxml, fromusername: %s, tousername: %s, transferId: %s, paysubtype: %d", str6, str5, str7, Integer.valueOf(i));
                try {
                    aVar2 = C77010f.vx0().wx0().mo61312jo(str7);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SubCoreRemittance", e, "", new Object[0]);
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", "empty record");
                    return;
                }
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(aVar2.field_msgId);
                if (b002.getMsgId() <= 0) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", "has delete msg");
                    C77010f.vx0().wx0().delete(aVar2, new String[0]);
                    return;
                }
                Log.m105925i("MicroMsg.SubCoreRemittance", "update msg: %s", Long.valueOf(b002.getMsgId()));
                b002.mo108732L2(decode2);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                C78418c jo = vx02.yx0().mo108369jo(str7);
                if (jo != null) {
                    jo.field_receiveStatus = i;
                    vx02.yx0().replace(jo);
                } else if (!b002.mo108768t().equals(C75592q0.m90789s())) {
                    C78418c cVar = new C78418c();
                    cVar.field_locaMsgId = b002.getMsgId();
                    cVar.field_transferId = str7;
                    cVar.field_receiveStatus = i;
                    cVar.field_isSend = false;
                    cVar.field_talker = b002.mo108768t();
                    cVar.field_receiverName = str8;
                    vx02.yx0().replace(cVar);
                }
                vx02.Bx0(b002.mo108768t(), b002, (C78418c) null);
            } catch (UnsupportedEncodingException e2) {
                Log.printErrStackTrace("MicroMsg.SubCoreRemittance", e2, "", new Object[0]);
            }
        } else if (String.valueOf(25).equals(str2)) {
            Log.m105924i("MicroMsg.SubCoreRemittance", "parse transfer outtime msg");
            String nullAsNil = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.transferid"));
            String nullAsNil2 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.fromusername"));
            C78418c Lo = vx02.yx0().mo108368Lo(nullAsNil);
            if (Lo != null) {
                int i2 = Lo.field_receiveStatus;
                if (i2 == -1 || i2 == 1 || i2 == 21 || i2 == 7 || i2 == 27 || i2 == 0 || i2 == 20) {
                    Lo.field_receiveStatus = 2;
                    vx02.yx0().replace(Lo);
                    vx02.Bx0(nullAsNil2, (C72963f4) null, Lo);
                    C72963f4 b003 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(Lo.field_locaMsgId);
                    if (b003.getMsgId() <= 0 || (b003.f230723F & 4) == 4 || b003.getType() == 10000 || b003.getType() == 268445456) {
                        Log.m105924i("MicroMsg.SubCoreRemittance", " msg is delete or revoked");
                        return;
                    }
                    String nullAsNil3 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.content"));
                    if (!Util.isNullOrNil(nullAsNil3)) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.mo108740T2(0);
                        f4Var.mo108749c3(nullAsNil2);
                        f4Var.mo108732L2(nullAsNil3);
                        f4Var.mo108733M2(C75604z3.m90841m(nullAsNil2, (long) j3Var.f227635o));
                        f4Var.setType(10000);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
                    }
                }
            }
        } else if (String.valueOf(33).equals(str2)) {
            int i3 = Util.getInt(parseXml.get(".sysmsg.paymsg.opentransferbankcard"), 0);
            C85801v1 i4 = C86709a0.m107535s().mo121142i();
            i4.mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_OPEN_INT_SYNC, Integer.valueOf(i3));
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_HAS_SHOWN_RED_DOT_INT_SYNC;
            int intValue = ((Integer) i4.mo119685f(aVar3, 0)).intValue();
            Log.m105925i("MicroMsg.SubCoreRemittance", "receive open bank remit: %s, %s", Integer.valueOf(i3), Integer.valueOf(intValue));
            if (intValue == 0) {
                ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33508q(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_BANK_REMIT_STRING_SYNC, true);
                i4.mo119677K(aVar3, 1);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, Boolean.FALSE);
            }
        } else if (String.valueOf(45).equals(str2)) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_remittance_remind_msg_switch, 1) == 0) {
                Log.m105924i("MicroMsg.SubCoreRemittance", "needOpenSwitch is close ");
                return;
            }
            String nullAsNil4 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.transferid"));
            String nullAsNil5 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.fromusername"));
            String nullAsNil6 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.content"));
            String nullAsNil7 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.transfer_msg_type"));
            Log.m105925i("MicroMsg.SubCoreRemittance", "parse transfer remind receive msg：transferid：%s,msgType ：%s", nullAsNil4, nullAsNil7);
            C78418c Lo2 = vx02.yx0().mo108368Lo(nullAsNil4);
            if (Lo2 != null) {
                C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                C72963f4 b004 = ((C72972g4) LE).b00(Lo2.field_locaMsgId);
                if (b004.getMsgId() <= 0 || (b004.f230723F & 4) == 4 || b004.getType() == 10000 || b004.getType() == 268445456) {
                    Log.m105924i("MicroMsg.SubCoreRemittance", " msg has delete，dont insert remind msg");
                    C115669n.INSTANCE.mo160131h(20467, "transfer_to_change", "dont show message", "", "", "", "", 2, nullAsNil4, nullAsNil7);
                    return;
                }
                Log.m105924i("MicroMsg.SubCoreRemittance", "insert new remind msg");
                C72963f4 f4Var2 = new C72963f4();
                f4Var2.mo108740T2(0);
                f4Var2.mo108749c3(nullAsNil5);
                f4Var2.mo108732L2(nullAsNil6);
                f4Var2.mo108733M2(C75604z3.m90841m(nullAsNil5, (long) j3Var.f227635o));
                f4Var2.setType(10000);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var2);
                C115669n.INSTANCE.mo160131h(20467, "transfer_to_change", "show message", "", "", "", "", 1, nullAsNil4, nullAsNil7);
                return;
            }
            C115669n.INSTANCE.mo160131h(20467, "transfer_to_change", "dont show message", "", "", "", "", 2, nullAsNil4, nullAsNil7);
            Log.m105924i("MicroMsg.SubCoreRemittance", "remittanceRecord is null, dont insert remind msg");
        } else if (String.valueOf(46).equals(str2)) {
            String nullAsNil8 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.pos_id"));
            String nullAsNil9 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.version"));
            String nullAsNil10 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.url"));
            String nullAsNil11 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.md5"));
            Log.m105925i("MicroMsg.SubCoreRemittance", "parse voice update msg，pos_id：%s,version ：%s, resourceUrl:%s, md5:%s", nullAsNil8, nullAsNil9, nullAsNil10, nullAsNil11);
            if (Util.isNullOrNil(nullAsNil8) || Util.isNullOrNil(nullAsNil9)) {
                Log.m105924i("MicroMsg.SubCoreRemittance", "pos_id is null || version is null");
                return;
            }
            if (Util.isEqual(nullAsNil8, "0")) {
                F2fRcvVoiceOffLineLogic.m162050d();
                str = F2fRcvVoiceOffLineLogic.m162053h("0-1");
            } else {
                F2fRcvVoiceOffLineLogic.m162050d();
                str = F2fRcvVoiceOffLineLogic.m162053h(nullAsNil8);
            }
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.SubCoreRemittance", "need insert new config");
                F2fRcvVoiceOffLineLogic.m162050d();
                F2fRcvVoiceOffLineLogic.m162049c(nullAsNil8, nullAsNil10, nullAsNil9, nullAsNil11);
                return;
            }
            double parseDouble = Double.parseDouble(nullAsNil9);
            double parseDouble2 = Double.parseDouble(str);
            Log.m105925i("MicroMsg.SubCoreRemittance", "voice resource file - version： %s ，versionLocal:%s", nullAsNil9, str);
            if (parseDouble <= parseDouble2) {
                Log.m105924i("MicroMsg.SubCoreRemittance", "version < versionLocal,do not update voice resource");
            } else if (Util.isNullOrNil(nullAsNil10)) {
                Log.m105924i("MicroMsg.SubCoreRemittance", "resourceUrl is null");
            } else {
                Log.m105924i("MicroMsg.SubCoreRemittance", "need update voice resource config");
                F2fRcvVoiceOffLineLogic.m162050d();
                F2fRcvVoiceOffLineLogic.m162049c(nullAsNil8, nullAsNil10, nullAsNil9, nullAsNil11);
            }
        }
    }
}
