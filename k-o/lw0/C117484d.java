package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: lw0.d */
public class C117484d {

    /* renamed from: a */
    public final HashMap<C117483c, Vector<Integer>> f351588a = new HashMap<>();

    /* renamed from: b */
    public C117482b f351589b;

    public C117484d(C117482b bVar) {
        this.f351589b = bVar;
    }

    /* renamed from: a */
    public void mo182192a(String str, int i, String str2, C88657e eVar) {
        Log.m105925i("MicroMsg.exdevie.IBeaconManager", "advertismentProcess, brand = %s, rssi = %d", str, Integer.valueOf(i));
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevie.IBeaconManager", "null == aProtocal");
            return;
        }
        C117483c cVar = new C117483c();
        cVar.f351585a = eVar;
        cVar.f351587c = str2;
        if (!this.f351588a.containsKey(cVar)) {
            Vector vector = new Vector();
            vector.add(Integer.valueOf(i));
            this.f351588a.put(cVar, vector);
            return;
        }
        Vector vector2 = this.f351588a.get(cVar);
        vector2.add(Integer.valueOf(i));
        if (1 <= vector2.size()) {
            try {
                mo182193b(vector2, cVar);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevie.IBeaconManager", "calDistance failed!!!, %s", e.getMessage());
            } catch (Throwable th) {
                vector2.clear();
                throw th;
            }
            vector2.clear();
        }
    }

    /* renamed from: b */
    public final void mo182193b(Vector<Integer> vector, C117483c cVar) {
        C117483c cVar2 = cVar;
        Log.m105924i("MicroMsg.exdevie.IBeaconManager", "calDistance");
        int size = vector.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = vector.elementAt(i).intValue();
        }
        double a = new C117481a(iArr).mo182189a();
        cVar2.f351586b = new BigDecimal(a).divide(new BigDecimal(1), 3, 4).doubleValue();
        double d = (double) cVar2.f351585a.f255971b.f255976f;
        double d2 = (a * 1.0d) / d;
        double pow = d2 < 1.0d ? Math.pow(d2, 10.0d) : 0.54992d + (Math.pow(d2, 9.9476d) * 0.92093d);
        Log.m105925i("MicroMsg.exdevie.IBeaconManager", "txPower = %f , rssi = %f,distance = %f", Double.valueOf(d), Double.valueOf(a), Double.valueOf(pow));
        this.f351589b.mo23549e(pow, cVar2);
    }
}
