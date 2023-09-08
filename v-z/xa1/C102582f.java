package xa1;

import com.tencent.p014mm.autogen.events.ExtConnectWifiEvent;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: xa1.f */
public class C102582f extends SyncTask<Integer> {

    /* renamed from: a */
    public final /* synthetic */ String[] f302055a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102582f(ExtControlProviderOpenApi extControlProviderOpenApi, long j, Integer num, boolean z, String[] strArr) {
        super(j, num, z);
        this.f302055a = strArr;
    }

    public Object run() {
        try {
            Log.m105918d("MicroMsg.ExtControlProviderOpenApi", "syncTaskCur run ");
            ExtConnectWifiEvent extConnectWifiEvent = new ExtConnectWifiEvent();
            extConnectWifiEvent.f264746d.f264748a = Util.getInt(this.f302055a[0], 0);
            ExtConnectWifiEvent.C92490a aVar = extConnectWifiEvent.f264746d;
            String[] strArr = this.f302055a;
            aVar.f264749b = strArr[1];
            aVar.f264750c = strArr[2];
            aVar.f264751d = Util.getInt(strArr[3], 0);
            extConnectWifiEvent.callback = new C102581e(this, extConnectWifiEvent);
            if (!extConnectWifiEvent.publish()) {
                Log.m105924i("MicroMsg.ExtControlProviderOpenApi", "connectWifi publish getWifiListEvent fail");
                setResultFinish(8);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ExtControlProviderOpenApi", "exception in connectWifi syncTaskInt.", e);
            setResultFinish(12);
        }
        return 0;
    }
}
