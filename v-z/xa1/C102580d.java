package xa1;

import android.database.MatrixCursor;
import cd3.C39944a;
import com.tencent.p014mm.autogen.events.ExtGetWifiListEvent;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: xa1.d */
public class C102580d extends SyncTask<MatrixCursor> {

    /* renamed from: a */
    public final /* synthetic */ String[] f302053a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102580d(ExtControlProviderOpenApi extControlProviderOpenApi, long j, MatrixCursor matrixCursor, boolean z, String[] strArr) {
        super(j, matrixCursor, z);
        this.f302053a = strArr;
    }

    public Object run() {
        try {
            Log.m105918d("MicroMsg.ExtControlProviderOpenApi", "syncTaskCur run ");
            ExtGetWifiListEvent extGetWifiListEvent = new ExtGetWifiListEvent();
            extGetWifiListEvent.f264769d.f264771a = this.f302053a;
            extGetWifiListEvent.callback = new C102579c(this, extGetWifiListEvent);
            if (extGetWifiListEvent.publish()) {
                return null;
            }
            Log.m105924i("MicroMsg.ExtControlProviderOpenApi", "getWifiList publish getWifiListEvent fail");
            setResultFinish(C39944a.m42754a(8));
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ExtControlProviderOpenApi", "exception in getWifiList syncTaskCur.", e);
            setResultFinish(C39944a.m42754a(12));
            return null;
        }
    }
}
