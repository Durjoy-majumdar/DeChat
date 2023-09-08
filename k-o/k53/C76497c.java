package k53;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.wallet.p123ui.WXPayJsApiKindaEntranceUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: k53.c */
public class C76497c implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ WXPayJsApiKindaEntranceUI f223947d;

    public C76497c(WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI) {
        this.f223947d = wXPayJsApiKindaEntranceUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ((C119157j) C119157j.f356862d).mo183894y("WXPayJsApiKindaEntranceUIObserver");
        Log.m105925i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", bundle.getString("ret", "fail"));
        Intent intent = new Intent();
        intent.putExtras(bundle);
        this.f223947d.setResult(-1, intent);
        this.f223947d.finish();
    }
}
