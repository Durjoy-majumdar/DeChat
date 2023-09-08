package pc2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.nfc_open.p802ui.NfcWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;

/* renamed from: pc2.a */
public final class C11886a implements C89342c {
    /* renamed from: a */
    public boolean mo11763a(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        Intent intent2 = new Intent(intent);
        intent2.setClass(context, NfcWebViewUI.class);
        intent2.addFlags(536870912);
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.Nfc.BusCardRechargeNfcProcessor", "process, intent to start NfcWebViewUI is unavailable");
            return false;
        }
    }

    /* renamed from: d */
    public int mo11764d() {
        return Integer.MAX_VALUE;
    }

    public String getName() {
        return "BusCardRecharge";
    }
}
