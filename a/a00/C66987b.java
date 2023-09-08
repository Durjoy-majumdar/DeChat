package a00;

import b63.C67190j0;
import b63.C67191k0;
import b63.C67192l0;
import b63.C67211x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.p137ui.C45129w;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75576f4;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Map;
import java.util.regex.Pattern;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: a00.b */
public class C66987b implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        if (C67192l0.f192913a == null) {
            C67192l0.f192913a = new C67192l0();
        }
        C67192l0 l0Var = C67192l0.f192913a;
        l0Var.getClass();
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105918d("MicroMsg.WalletPushNotifyManager", "PayMsg:" + g);
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        int i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (i < 0) {
            Log.m105928w("MicroMsg.WalletPushNotifyManager", "hy: paymsgtype error. maybe not found in xml");
        } else {
            Log.m105925i("MicroMsg.WalletPushNotifyManager", "handle paymsg type: %s", Integer.valueOf(i));
            if (i == 12) {
                int i2 = Util.getInt(parseXml.get(".sysmsg.paymsg.avail_balance"), -1);
                long j = Util.getLong(parseXml.get(".sysmsg.paymsg.balance_version"), -1);
                C67191k0 k0Var = new C67191k0(l0Var, Util.getLong(parseXml.get(".sysmsg.paymsg.time_out"), 7200), j, i2, i, parseXml);
                Pattern pattern = C75228t.f221346a;
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C45129w(new String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, k0Var), (String) null));
            } else {
                if (i == 43) {
                    C67211x b = C67211x.m79542b(parseXml);
                    if (b != null) {
                        objArr[0] = b;
                    }
                    C67211x.m79543c(g);
                }
                z = false;
            }
        }
        if (!z) {
            MMHandlerThread.postToMainThread(new C67190j0(i, parseXml, objArr));
        }
    }
}
