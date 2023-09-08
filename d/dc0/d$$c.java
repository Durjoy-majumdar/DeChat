package dc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import q90.C101062d;

public class d$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f83425d;

    /* renamed from: e */
    public final /* synthetic */ C31113d f83426e;

    public d$$c(C31113d dVar, String str) {
        this.f83426e = dVar;
        this.f83425d = str;
    }

    public void run() {
        Object[] array = ((C101062d) this.f83426e.f83416b).keySet().toArray();
        for (Object obj : array) {
            String str = (String) obj;
            if (str.startsWith(this.f83425d)) {
                Log.m105919d("MicroMsg.GetContactService", "clearMapRecentDown(): key = %s", str);
                ((C101062d) this.f83426e.f83416b).remove(str);
            }
        }
    }
}
