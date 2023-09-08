package e93;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: e93.g */
public final class C45575g extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C45570e f123284a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45575g(C45570e eVar, Looper looper) {
        super(looper);
        this.f123284a = eVar;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        C45570e eVar = this.f123284a;
        if (eVar.f123273e) {
            Log.m105928w("MicroMsg.WebPrefetcherJsApiHandler", "handleMsg destroyed and ignore");
            return;
        }
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            Object obj = message.obj;
            String str = obj instanceof String ? (String) obj : null;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                ((ArrayList) this.f123284a.f123274f).add(str);
            }
            C45570e.m50617b(this.f123284a);
        } else if (i == 2) {
            Log.m105926v("MicroMsg.WebPrefetcherJsApiHandler", "handle msg from wx done, msg: " + message.obj + ' ');
        } else if (i == 3) {
            eVar.f123273e = true;
        }
    }
}
