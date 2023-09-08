package z43;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import f62.C31924c1;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;

/* renamed from: z43.a */
public class C39305a implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_WALLET_BANKCARD_STRING_SYNC;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC;
        Class cls = C30914c.class;
        if ("paymsg".equals(str) && String.valueOf(30).equals(map.get(".sysmsg.paymsg.PayMsgType"))) {
            int i = Util.getInt(map.get(".sysmsg.paymsg.WalletRedDot"), 0);
            int i2 = Util.getInt(map.get(".sysmsg.paymsg.BankCardRedDot"), 0);
            String str2 = map.get(".sysmsg.paymsg.NewTagBankSerial");
            String str3 = map.get(".sysmsg.paymsg.WalletRedDotWording");
            Log.m105925i("BankCardRedDotReceiver", "moreTabWallet: %s, walletBankCard: %s, bankSerial: %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
            if (i == 1) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar3, true);
            } else {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar3, false);
            }
            if (i2 == 1) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, true);
            } else {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, false);
            }
            if (!Util.isNullOrNil(str3)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MORE_TAB_REDDOT_WORDING_STRING_SYNC, str3);
            }
            if (!Util.isNullOrNil(str2)) {
                C86709a0.m107528h();
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC;
                String str4 = (String) i3.mo119685f(aVar4, "");
                if (!Util.isNullOrNil(str4)) {
                    str2 = str4 + "," + str2;
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar4, str2);
            }
        }
    }
}
