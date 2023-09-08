package mb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: mb3.d */
public class C46983d {

    /* renamed from: b */
    public static volatile C46983d f126324b;

    /* renamed from: c */
    public static Object f126325c = new Object();

    /* renamed from: a */
    public ConcurrentHashMap<String, C46982c> f126326a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C46983d m52299a() {
        if (f126324b == null) {
            synchronized (f126325c) {
                if (f126324b == null) {
                    f126324b = new C46983d();
                }
            }
        }
        return f126324b;
    }

    /* renamed from: b */
    public boolean mo72172b() {
        ConcurrentHashMap<String, C46982c> concurrentHashMap = this.f126326a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return false;
        }
        Collection<C46982c> values = this.f126326a.values();
        ArrayList arrayList = new ArrayList();
        for (C46982c add : values) {
            arrayList.add(add);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C46982c cVar = (C46982c) it.next();
            C46985f fVar = cVar.f126312d;
            if (fVar.f126337j && this.f126326a.containsKey(fVar.f126328a)) {
                cVar.f126321p = true;
                try {
                    HttpURLConnection httpURLConnection = cVar.f126314f;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.Wepkg.WePkgDownloadTask", e.getMessage());
                        }
                        cVar.f126314f.disconnect();
                    }
                    Future<?> future = cVar.f126313e;
                    if (future != null) {
                        future.cancel(false);
                    }
                } catch (Exception e2) {
                    Log.m105924i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + e2.getMessage());
                }
                this.f126326a.remove(cVar.f126312d.f126328a);
            }
        }
        arrayList.clear();
        return true;
    }
}
