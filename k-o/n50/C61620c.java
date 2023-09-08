package n50;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import z40.C66733d;

/* renamed from: n50.c */
public class C61620c {

    /* renamed from: a */
    public ArrayList<C61619b> f175229a = new ArrayList<>();

    /* renamed from: b */
    public int f175230b = 1;

    /* renamed from: c */
    public int f175231c = 0;

    /* renamed from: d */
    public Map<String, Map<String, C61619b>> f175232d = new ConcurrentHashMap();

    /* renamed from: e */
    public String f175233e;

    /* renamed from: n50.c$b */
    public static class C61622b {

        /* renamed from: a */
        public static C61620c f175234a = new C61620c((C61621a) null);
    }

    public C61620c(C61621a aVar) {
    }

    /* renamed from: a */
    public void mo86553a(C61619b bVar) {
        if (bVar != null) {
            C66733d dVar = C66733d.f191763a;
            int rp02 = C66733d.f191764b.rp0(bVar.f175221d);
            Log.m105924i("MicroMsg.RemoteUserConfigHelper", "addRemoteUser: userName:" + bVar.f175221d + " seatPosition: " + rp02);
            bVar.f175228n = rp02;
        }
        this.f175229a.add(bVar);
    }

    /* renamed from: b */
    public C61619b mo86554b(String str) {
        Iterator<C61619b> it = this.f175229a.iterator();
        while (it.hasNext()) {
            C61619b next = it.next();
            if (str.equals(next.f175221d)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo86555c(String str) {
        Log.m105924i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: target userName:" + str);
        Iterator<C61619b> it = this.f175229a.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().f175221d)) {
                Log.m105924i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: find userName:" + str + ", remove");
                it.remove();
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo86556d(String str) {
        Log.m105924i("MicroMsg.RemoteUserConfigHelper", "setCurrentSessionId: sessionId:" + str);
        this.f175233e = str;
        if (str != null) {
            Iterator<C61619b> it = this.f175229a.iterator();
            while (it.hasNext()) {
                C61619b next = it.next();
                int i = 0;
                try {
                    i = Integer.parseInt(next.f175226i);
                } catch (NumberFormatException unused) {
                }
                mo86557e(str, next.f175221d, i, next.f175227j);
            }
        }
    }

    /* renamed from: e */
    public void mo86557e(String str, String str2, int i, boolean z) {
        Log.m105924i("MicroMsg.RemoteUserConfigHelper", "updateCacheUserInfoMap: sessionId:" + str + ", userId:" + str2 + ", roomId:" + i + ", isAnchor:" + z);
        if (str != null && str2 != null) {
            Map map = (Map) ((ConcurrentHashMap) this.f175232d).get(str);
            if (map == null) {
                map = new ConcurrentHashMap();
            }
            C61619b bVar = new C61619b("");
            bVar.f175226i = i + "";
            bVar.f175227j = z;
            map.put(str2, bVar);
            ((ConcurrentHashMap) this.f175232d).put(str, map);
        }
    }
}
