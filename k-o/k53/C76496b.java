package k53;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.wallet.p123ui.WXPayJsApiKindaEntranceUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: k53.b */
public class C76496b implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ WXPayJsApiKindaEntranceUI f223946d;

    public C76496b(WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI) {
        this.f223946d = wXPayJsApiKindaEntranceUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        ((C119157j) C119157j.f356862d).mo183894y("WXPayJsApiKindaEntranceUIObserver");
        String string = ((Bundle) obj).getString("ret", "fail");
        Log.m105925i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", string);
        if (string.contains("ok")) {
            this.f223946d.setResult(-1);
        } else if (string.contains("cancel")) {
            this.f223946d.setResult(0);
        } else {
            this.f223946d.setResult(-1000);
        }
        this.f223946d.finish();
    }
}
