package com.tencent.p014mm.network;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.tencent.mm.network.e0 */
public class C40376e0 {

    /* renamed from: a */
    public HttpsURLConnection f108504a = null;

    public C40376e0(String str) {
        URL url = new URL(str);
        try {
            this.f108504a = (HttpsURLConnection) url.openConnection();
        } catch (MalformedURLException e) {
            Log.m105921e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", e.getMessage());
            Log.m105921e("MicroMsg.MMHttpsUrlConnection", "exception:%s", Util.stackTraceToString(e));
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", e2.getMessage());
            Log.m105921e("MicroMsg.MMHttpsUrlConnection", "exception:%s", Util.stackTraceToString(e2));
        } catch (Exception e3) {
            Log.m105920e("MicroMsg.MMHttpsUrlConnection", "Exception :" + e3.getMessage());
            Log.m105921e("MicroMsg.MMHttpsUrlConnection", "exception:%s", Util.stackTraceToString(e3));
        }
    }

    /* renamed from: a */
    public void mo63087a() {
        HttpsURLConnection httpsURLConnection = this.f108504a;
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.getInputStream().close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MMHttpsUrlConnection", e.getMessage());
            }
            this.f108504a.disconnect();
        }
    }
}
