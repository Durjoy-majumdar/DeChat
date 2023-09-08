package t83;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;

/* renamed from: t83.q */
public class C48601q extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C48590l f130111a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48601q(C48590l lVar, Looper looper) {
        super(looper);
        this.f130111a = lVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            String str = (String) message.obj;
            if (!Util.isNullOrNil(str)) {
                ((LinkedList) this.f130111a.f129999d).add(str);
            }
            C48590l.m53978j(this.f130111a);
        } else if (i == 2) {
            Log.m105926v("MicroMsg.JsApiHandler", "handle msg from wx done, msg = " + message.obj);
        }
    }
}
