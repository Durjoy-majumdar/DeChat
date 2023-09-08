package s52;

import b63.C67203r0;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import hp3.C87581a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C89132b;
import p281yz.C79173v;
import s24.C77613a;
import te3.C49009cj2;
import te3.C51264sl3;
import te3.pz4;
import te3.te4;
import te3.ue4;
import te3.zf4;
import ub3.C78144b;

/* renamed from: s52.l */
public class C48234l implements C87581a<C51264sl3, C89132b.C89134c<C51264sl3>> {
    public Object call(Object obj) {
        LinkedList<zf4> linkedList;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC;
        Class cls = C79173v.class;
        Class cls2 = C78144b.class;
        Log.m105925i("MicroMsg.QueryWeChatWalletManager", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C51264sl3 sl32 = (C51264sl3) cVar.f256796d;
            ue4 ue4 = sl32.f141593d;
            if (ue4 != null) {
                Iterator<C49009cj2> it = ue4.f142818e.iterator();
                while (it.hasNext()) {
                    Iterator<te4> it4 = it.next().f131777e.iterator();
                    while (it4.hasNext()) {
                        te4 next = it4.next();
                        if (next.f142187i.equals("balance_cell")) {
                            LinkedList<zf4> linkedList2 = next.f142184f;
                            if (linkedList2 != null && linkedList2.size() > 0) {
                                String charSequence = C43423i0.m46933d(MMApplicationContext.getContext(), next.f142184f.get(0), (C43423i0.C43428e) null).toString();
                                Log.m105919d("MicroMsg.QueryWeChatWalletManager", "balance: %s", charSequence);
                                if (!Util.isNullOrNil(charSequence) && charSequence.length() > 1) {
                                    ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(aVar, Long.valueOf(C75228t.m90232Y(charSequence.substring(1), "100")));
                                }
                            }
                        } else if (next.f142187i.equals("lqt_cell") && (linkedList = next.f142184f) != null && linkedList.size() > 0) {
                            String charSequence2 = C43423i0.m46933d(MMApplicationContext.getContext(), next.f142184f.get(0), (C43423i0.C43428e) null).toString();
                            Log.m105919d("MicroMsg.QueryWeChatWalletManager", "lqt: %s", charSequence2);
                            if (!Util.isNullOrNil(charSequence2) && charSequence2.length() > 1) {
                                ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_NEW_LQT_LONG_SYNC, Long.valueOf(C75228t.m90232Y(charSequence2.substring(1), "100")));
                            }
                        }
                    }
                }
            }
            try {
                ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, new String(sl32.toByteArray(), C77613a.f226275a));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.QueryWeChatWalletManager", e, "", new Object[0]);
            }
            pz4 pz4 = sl32.f141595f;
            if (pz4 != null) {
                Log.m105925i("MicroMsg.QueryWeChatWalletManager", "wallet balance: %s", Long.valueOf(pz4.f140066d));
                C67203r0 r = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91336r();
                r.field_wallet_balance = sl32.f141595f.f140066d;
                ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(aVar, Long.valueOf(r.field_wallet_balance));
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91318H(r);
            }
        }
        return (C51264sl3) cVar.f256796d;
    }
}
