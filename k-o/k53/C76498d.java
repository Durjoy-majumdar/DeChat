package k53;

import com.tencent.p014mm.plugin.wallet.p123ui.WXPayJsApiKindaEntranceUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: k53.d */
public class C76498d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WXPayJsApiKindaEntranceUI f223948d;

    /* renamed from: k53.d$a */
    public class C76499a implements Runnable {
        public C76499a() {
        }

        public void run() {
            Log.m105925i("MicroMsg.WXPayJsApiKindaEntranceUI", "execute finish logic if in font page：%s", Boolean.valueOf(C76498d.this.f223948d.f209017d));
            WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI = C76498d.this.f223948d;
            if (wXPayJsApiKindaEntranceUI.f209017d && !wXPayJsApiKindaEntranceUI.isFinishing() && !C76498d.this.f223948d.isDestroyed()) {
                C76498d.this.f223948d.setResult(0);
                C76498d.this.f223948d.finish();
            }
        }
    }

    public C76498d(WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI) {
        this.f223948d = wXPayJsApiKindaEntranceUI;
    }

    public void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C76499a());
    }
}
