package wf0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f62.C31924c1;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C30914c;
import qe3.C89625d;

/* renamed from: wf0.e */
public class C38094e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        boolean z;
        boolean z2;
        Map<String, String> map2 = map;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC;
        C72994y1.C72995a aVar4 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC;
        C72994y1.C72995a aVar5 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC;
        Class cls = C30914c.class;
        int i = Util.getInt(map2.get(".sysmsg.paymsg.PayMsgType"), 0);
        Log.m105919d("AARedDotReceiver", "paymsgtype: %d, current version: %d", Integer.valueOf(i), Integer.valueOf(C89625d.f257841g));
        if (i == 32) {
            int i2 = Util.getInt(map2.get(".sysmsg.paymsg.receiveorpayreddot"), -1);
            int i3 = Util.getInt(map2.get(".sysmsg.paymsg.grouppayreddot"), -1);
            int i4 = Util.getInt(map2.get(".sysmsg.paymsg.facingreceivereddot"), -1);
            int i5 = Util.getInt(map2.get(".sysmsg.paymsg.f2fhongbaoreddot"), -1);
            int i6 = Util.getInt(map2.get(".sysmsg.paymsg.rewardcodereddot"), -1);
            int i7 = Util.getInt(map2.get(".sysmsg.paymsg.android_minclientversion"), -1);
            String nullAs = Util.nullAs(map2.get(".sysmsg.paymsg.facingreceivereddotwording"), "");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, nullAs);
            Log.m105925i("AARedDotReceiver", "recvOrPay: %s, aa: %s, collect： %s, f2fhb: %s, qrreward: %s, version： %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
            if (C89625d.f257841g >= i7) {
                if (i2 == 1) {
                    Log.m105924i("AARedDotReceiver", "mark recv or pay red dot");
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262159, true);
                } else if (i2 == 0) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262159, false);
                }
                if (i3 == 1) {
                    Log.m105924i("AARedDotReceiver", "mark group pay red dot");
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar5, true);
                    z = true;
                } else {
                    if (i3 == 0) {
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar5, false);
                    }
                    z = false;
                }
                if (i4 == 1) {
                    Log.m105924i("AARedDotReceiver", "mark f2f recv red dot");
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar4, true);
                    z = true;
                } else if (i4 == 0) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar4, false);
                }
                if (i5 == 1) {
                    Log.m105924i("AARedDotReceiver", "mark f2f hb red dot");
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar3, true);
                    z2 = true;
                } else {
                    if (i5 == 0) {
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar3, false);
                    }
                    z2 = z;
                }
                if (i6 == 1) {
                    Log.m105924i("AARedDotReceiver", "mark qr reward red dot");
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, true);
                    z2 = true;
                } else if (i6 == 0) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33508q(aVar2, false);
                }
                if (z2) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, Boolean.FALSE);
                }
            }
            C115669n.INSTANCE.mo160131h(14396, 1);
        }
    }
}
