package sp0;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sp0.b0 */
public enum C22381b0 {
    INSTANCE;
    

    /* renamed from: d */
    public final Map<C22383b, NsdManager.DiscoveryListener> f63462d;

    /* renamed from: sp0.b0$a */
    public interface C22382a {
    }

    /* renamed from: sp0.b0$b */
    public interface C22383b {
    }

    /* renamed from: sp0.b0$c */
    public static class C22384c {

        /* renamed from: a */
        public Map<String, String> f63463a;

        /* renamed from: b */
        public String f63464b;

        /* renamed from: c */
        public String f63465c;

        /* renamed from: d */
        public String f63466d;

        /* renamed from: e */
        public int f63467e;

        public C22384c(NsdServiceInfo nsdServiceInfo) {
            this.f63463a = new HashMap();
            InetAddress host = nsdServiceInfo.getHost();
            if (host != null) {
                this.f63466d = host.getHostAddress();
            }
            this.f63467e = nsdServiceInfo.getPort();
            this.f63464b = nsdServiceInfo.getServiceName();
            this.f63465c = nsdServiceInfo.getServiceType();
            Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
            if (attributes != null) {
                for (String next : attributes.keySet()) {
                    byte[] bArr = attributes.get(next);
                    if (bArr != null) {
                        this.f63463a.put(next, new String(Base64.encode(bArr, 2)));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo35522a(C22383b bVar) {
        synchronized (this.f63462d) {
            if (((ConcurrentHashMap) this.f63462d).containsKey(bVar)) {
                try {
                    ((NsdManager) MMApplicationContext.getContext().getSystemService("servicediscovery")).stopServiceDiscovery((NsdManager.DiscoveryListener) ((ConcurrentHashMap) this.f63462d).get(bVar));
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.LocalServiceMgr", th, "Throwable: stopScanServices", new Object[0]);
                }
                ((ConcurrentHashMap) this.f63462d).remove(bVar);
            }
        }
    }
}
