package t52;

import c63.C67346c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l20.C21388a;
import ob0.C35136m;
import org.json.JSONObject;
import p327ct.C30914c;
import s52.C36626n;
import sf0.C48374j0;

/* renamed from: t52.f */
public class C36955f implements C86497v5.C31521b {

    /* renamed from: t52.f$a */
    public class C36956a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f98028d;

        public C36956a(C36955f fVar, String str) {
            this.f98028d = str;
        }

        public void run() {
            Map<String, String> parseXml;
            String str;
            String str2;
            String str3;
            String str4;
            Iterator<String> it;
            Map<String, String> map;
            C72994y1.C72995a aVar;
            C72994y1.C72995a aVar2;
            boolean z;
            String str5;
            C72994y1.C72995a aVar3;
            String str6;
            Iterator<String> it4;
            String str7;
            String str8;
            String str9;
            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC;
            C72994y1.C72995a aVar5 = C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC;
            C72994y1.C72995a aVar6 = C72994y1.C72995a.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC;
            C67346c b = C67346c.m79699b();
            String str10 = this.f98028d;
            b.getClass();
            C72994y1.C72995a aVar7 = C72994y1.C72995a.USERINFO_WALLET_MALL_MENU_UI_REDDOT_CONFIG_BOOLEAN_SYNC;
            C72994y1.C72995a aVar8 = C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_INT;
            C72994y1.C72995a aVar9 = C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING;
            C72994y1.C72995a aVar10 = C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC;
            Class<C30914c> cls = C30914c.class;
            if (!Util.isNullOrNil(str10) && (parseXml = XmlParser.parseXml(str10, "sysmsg", (String) null)) != null) {
                int i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
                if (i == 31) {
                    String str11 = parseXml.get(".sysmsg.paymsg.WalletRedDotWording");
                    int i2 = Util.getInt(parseXml.get(".sysmsg.paymsg.WalletRedDot"), -1);
                    int i3 = Util.getInt(parseXml.get(".sysmsg.paymsg.BalanceRedDot"), -1);
                    int i4 = Util.getInt(parseXml.get(".sysmsg.paymsg.LQTRedDot"), -1);
                    Log.m105925i("MicroMsg.MallNewsManager", "walletEntryWording: %s, balanceRedDot: %s, lqtRedDot: %s", str11, Integer.valueOf(i3), Integer.valueOf(i4));
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar9, str11);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar8, Integer.valueOf(i2));
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_BALANCE_RED_DOT_INT, Integer.valueOf(i3));
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_LINK_RED_DOT_INT, Integer.valueOf(i4));
                    C67346c.m79698a();
                    return;
                }
                String str12 = ".$expire_time";
                C72994y1.C72995a aVar11 = aVar5;
                String str13 = ".$wording";
                C72994y1.C72995a aVar12 = aVar4;
                String str14 = ".sysmsg.paymsg.reddot.item";
                C72994y1.C72995a aVar13 = aVar10;
                Class<C30914c> cls2 = cls;
                C72994y1.C72995a aVar14 = aVar9;
                String str15 = "";
                C72994y1.C72995a aVar15 = aVar8;
                Object obj = ".sysmsg.paymsg.WalletRedDot";
                Object obj2 = ".sysmsg.paymsg.WalletRedDotWording";
                String str16 = "redDotConfig: %s";
                String str17 = "mainentry_me";
                String str18 = "put redDotConfig json failed: %s";
                String str19 = "%s_expiretime";
                if (i == 34) {
                    Set<String> keySet = parseXml.keySet();
                    Log.m105925i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", str10, keySet.toString());
                    if (keySet.size() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        Iterator<String> it5 = keySet.iterator();
                        while (it5.hasNext()) {
                            String next = it5.next();
                            if (next.startsWith(str14)) {
                                String str20 = parseXml.get(next);
                                String str21 = next + str13;
                                String str22 = parseXml.get(str21);
                                str6 = str14;
                                str7 = str13;
                                long j = Util.getLong(parseXml.get(next + str12), 0) * 1000;
                                it4 = it5;
                                if (!Util.isNullOrNil(str20)) {
                                    Log.m105925i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", str20, str22, Long.valueOf(j));
                                    if (str17.equals(str20)) {
                                        C86709a0.m107528h();
                                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, Boolean.TRUE);
                                        if (j > 0) {
                                            C86709a0.m107528h();
                                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC, Long.valueOf(j));
                                        }
                                    } else if ("entry_wxpay_wallet".equals(str20)) {
                                        C86709a0.m107528h();
                                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_REDDOT_BOOLEAN_SYNC, Boolean.TRUE);
                                        if (!Util.isNullOrNil(str22)) {
                                            C86709a0.m107528h();
                                            C86709a0.m107535s().mo121142i().mo119677K(aVar6, str22);
                                        } else {
                                            C86709a0.m107528h();
                                            C86709a0.m107535s().mo121142i().mo119677K(aVar6, str15);
                                        }
                                        if (j > 0) {
                                            C86709a0.m107528h();
                                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC, Long.valueOf(j));
                                        }
                                    } else if ("entry_wxpay_paycenter".equals(str20)) {
                                        C86709a0.m107528h();
                                        C86709a0.m107535s().mo121142i().mo119677K(aVar7, Boolean.TRUE);
                                        if (j > 0) {
                                            C86709a0.m107528h();
                                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MALL_MENU_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, Long.valueOf(j));
                                        }
                                    } else {
                                        try {
                                            jSONObject.put(str20, 1);
                                            if (j > 0) {
                                                str9 = str19;
                                                try {
                                                    jSONObject.put(String.format(str9, new Object[]{str20}), j);
                                                } catch (Exception e) {
                                                    e = e;
                                                }
                                            } else {
                                                str9 = str19;
                                            }
                                            str8 = str18;
                                        } catch (Exception e2) {
                                            e = e2;
                                            str9 = str19;
                                            str8 = str18;
                                            Log.printErrStackTrace("MicroMsg.MallNewsManager", e, str8, e.getMessage());
                                            str19 = str9;
                                            str18 = str8;
                                            str13 = str7;
                                            it5 = it4;
                                            str14 = str6;
                                        }
                                        str19 = str9;
                                        str18 = str8;
                                        str13 = str7;
                                        it5 = it4;
                                        str14 = str6;
                                    }
                                }
                            } else {
                                str6 = str14;
                                str7 = str13;
                                it4 = it5;
                            }
                            str8 = str18;
                            str9 = str19;
                            str19 = str9;
                            str18 = str8;
                            str13 = str7;
                            it5 = it4;
                            str14 = str6;
                        }
                        Log.m105925i("MicroMsg.MallNewsManager", str16, jSONObject.toString());
                        if (jSONObject.length() > 0) {
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MENU_UI_REDDOT_CONFIG_STRING_SYNC, jSONObject.toString());
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar7, Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str23 = str14;
                String str24 = str13;
                String str25 = str16;
                String str26 = str18;
                String str27 = str19;
                if (i == 36) {
                    String str28 = parseXml.get(obj2);
                    int i5 = Util.getInt(parseXml.get(obj), -1);
                    int i6 = Util.getInt(parseXml.get(".sysmsg.paymsg.LQBRedDot"), -1);
                    Log.m105925i("MicroMsg.MallNewsManager", "walletEntryWording: %s, walletRedDot: %s, lqbRedDot: %s", str28, Integer.valueOf(i5), Integer.valueOf(i6));
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar14, str28);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar15, Integer.valueOf(i5));
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQB_MALL_ENTRY_RED_DOT_INT, Integer.valueOf(i6));
                    C67346c.m79698a();
                } else if (i == 38) {
                    Set<String> keySet2 = parseXml.keySet();
                    Log.m105925i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", str10, keySet2.toString());
                    if (keySet2.size() > 0) {
                        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
                        Log.m105925i("MicroMsg.MallNewsManager", "offline shorcut walletRegion : %s", Integer.valueOf(intValue));
                        if (intValue == 0 || intValue == 1) {
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> it6 = keySet2.iterator();
                            boolean z2 = false;
                            boolean z3 = false;
                            while (it6.hasNext()) {
                                String next2 = it6.next();
                                String str29 = str23;
                                if (next2.startsWith(str29)) {
                                    it = it6;
                                    str23 = str29;
                                    if (next2.substring(next2.lastIndexOf(46)).startsWith(".item")) {
                                        String str30 = parseXml.get(next2);
                                        String str31 = next2 + str24;
                                        str2 = str24;
                                        String str32 = parseXml.get(str31);
                                        z = z3;
                                        map = parseXml;
                                        long j2 = Util.getLong(parseXml.get(next2 + str12), 0) * 1000;
                                        if (!Util.isNullOrNil(str30)) {
                                            str = str12;
                                            Log.m105925i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", str30, str32, Long.valueOf(j2));
                                            if (str17.equals(str30)) {
                                                C72994y1.C72995a aVar16 = aVar13;
                                                ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33508q(aVar16, true);
                                                C86709a0.m107528h();
                                                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_EXPIRETIME_LONG_SYNC, Long.valueOf(j2));
                                                aVar2 = aVar16;
                                                str3 = str15;
                                                z3 = true;
                                            } else {
                                                aVar2 = aVar13;
                                                if ("entry_wxpay_pay".equals(str30)) {
                                                    ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33508q(aVar2, true);
                                                    if (!Util.isNullOrNil(str32)) {
                                                        C86709a0.m107528h();
                                                        aVar3 = aVar12;
                                                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, str32);
                                                    } else {
                                                        aVar3 = aVar12;
                                                        C86709a0.m107528h();
                                                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, str15);
                                                    }
                                                    C86709a0.m107528h();
                                                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC, Long.valueOf(j2));
                                                    aVar12 = aVar3;
                                                    str3 = str15;
                                                    z3 = z;
                                                    z2 = true;
                                                } else {
                                                    if ("entry_wxpay_pay_wallet".equals(str30)) {
                                                        C86709a0.m107528h();
                                                        C72994y1.C72995a aVar17 = aVar11;
                                                        C86709a0.m107535s().mo121142i().mo119677K(aVar17, Boolean.TRUE);
                                                        C86709a0.m107528h();
                                                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, Long.valueOf(j2));
                                                        str4 = str17;
                                                        aVar = aVar17;
                                                    } else {
                                                        C72994y1.C72995a aVar18 = aVar11;
                                                        str4 = str17;
                                                        aVar = aVar18;
                                                        if (str30.startsWith("bind_serial_")) {
                                                            String substring = str30.substring(12);
                                                            C86709a0.m107528h();
                                                            C85801v1 i7 = C86709a0.m107535s().mo121142i();
                                                            C72994y1.C72995a aVar19 = C72994y1.C72995a.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC;
                                                            String str33 = (String) i7.mo119685f(aVar19, str15);
                                                            Log.m105919d("MicroMsg.MallNewsManager", "bind serial: %s", substring);
                                                            if (!Util.isNullOrNil(str33)) {
                                                                substring = str33 + "," + substring;
                                                            }
                                                            C86709a0.m107528h();
                                                            C86709a0.m107535s().mo121142i().mo119677K(aVar19, substring);
                                                        } else {
                                                            str5 = str15;
                                                            try {
                                                                jSONObject2.put(str30, 1);
                                                                jSONObject2.put(String.format(str27, new Object[]{str30}), j2);
                                                                jSONObject2.put(String.format("%s_wording", new Object[]{str30}), str32);
                                                            } catch (Exception e3) {
                                                                Log.printErrStackTrace("MicroMsg.MallNewsManager", e3, str26, e3.getMessage());
                                                            }
                                                            z3 = z;
                                                            parseXml = map;
                                                            it6 = it;
                                                            str15 = str3;
                                                            str24 = str2;
                                                            aVar13 = aVar2;
                                                            str12 = str;
                                                            String str34 = str4;
                                                            aVar11 = aVar;
                                                            str17 = str34;
                                                        }
                                                    }
                                                    str5 = str15;
                                                    z3 = z;
                                                    parseXml = map;
                                                    it6 = it;
                                                    str15 = str3;
                                                    str24 = str2;
                                                    aVar13 = aVar2;
                                                    str12 = str;
                                                    String str342 = str4;
                                                    aVar11 = aVar;
                                                    str17 = str342;
                                                }
                                            }
                                            C72994y1.C72995a aVar20 = aVar11;
                                            str4 = str17;
                                            aVar = aVar20;
                                            parseXml = map;
                                            it6 = it;
                                            str15 = str3;
                                            str24 = str2;
                                            aVar13 = aVar2;
                                            str12 = str;
                                            String str3422 = str4;
                                            aVar11 = aVar;
                                            str17 = str3422;
                                        } else {
                                            str = str12;
                                            aVar2 = aVar13;
                                            str5 = str15;
                                            C72994y1.C72995a aVar21 = aVar11;
                                            str4 = str17;
                                            aVar = aVar21;
                                            z3 = z;
                                            parseXml = map;
                                            it6 = it;
                                            str15 = str3;
                                            str24 = str2;
                                            aVar13 = aVar2;
                                            str12 = str;
                                            String str34222 = str4;
                                            aVar11 = aVar;
                                            str17 = str34222;
                                        }
                                    } else {
                                        str = str12;
                                        z = z3;
                                    }
                                } else {
                                    str = str12;
                                    it = it6;
                                    z = z3;
                                    str23 = str29;
                                }
                                str2 = str24;
                                aVar2 = aVar13;
                                str5 = str15;
                                map = parseXml;
                                C72994y1.C72995a aVar212 = aVar11;
                                str4 = str17;
                                aVar = aVar212;
                                z3 = z;
                                parseXml = map;
                                it6 = it;
                                str15 = str3;
                                str24 = str2;
                                aVar13 = aVar2;
                                str12 = str;
                                String str342222 = str4;
                                aVar11 = aVar;
                                str17 = str342222;
                            }
                            C72994y1.C72995a aVar22 = aVar11;
                            C72994y1.C72995a aVar23 = aVar13;
                            if (!z3) {
                                ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33501j(aVar23, C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC);
                            }
                            if (!z2) {
                                ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33501j(aVar23, C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_PAY_ENTRANCE_STRING_SYNC);
                            }
                            Log.m105925i("MicroMsg.MallNewsManager", str25, jSONObject2.toString());
                            if (jSONObject2.length() > 0) {
                                C86709a0.m107528h();
                                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, jSONObject2.toString());
                                C86709a0.m107528h();
                                C86709a0.m107535s().mo121142i().mo119677K(aVar22, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105919d("MallPayMsgListener", "receive pay msg: %s", g);
        C36626n.vx0().f97368e.post(new C36956a(this, g));
    }
}
