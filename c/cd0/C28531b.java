package cd0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd0.b */
public class C28531b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f78375d;

    public C28531b(Bundle bundle) {
        this.f78375d = bundle;
    }

    public void run() {
        try {
            String string = this.f78375d.getString("mm_event_class");
            Log.m105925i("MicroMsg.WebViewMMReportUtil", "webview callback report className[%s]", string);
            ((C28530a) Class.forName(string).newInstance()).mo56024a(this.f78375d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewMMReportUtil", e, "receiveWebViewCallback error", new Object[0]);
        }
    }
}
