package m30;

import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import p606mm.C88783f;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: m30.b */
public class C88691b {

    /* renamed from: a */
    public static C88693c f256042a;

    /* renamed from: b */
    public static C34461a f256043b;

    /* renamed from: m30.b$a */
    public class C88692a implements Runnable {
        public void run() {
            C88693c cVar = C88691b.f256042a;
            cVar.getClass();
            cVar.f256045d.execSQL("KeyNodeInfo", "DELETE FROM KeyNodeInfo where happen_time<=" + (System.currentTimeMillis() - (((long) C88694d.m110638a()) * 86400000)));
            C34461a aVar = C88691b.f256043b;
            aVar.getClass();
            aVar.f92768d.execSQL("FewShotLearning", "DELETE FROM FewShotLearning where time<=" + (System.currentTimeMillis() - 15552000000L));
            ArrayList arrayList = new ArrayList();
            arrayList.add("MomentVideo");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int i = 0;
                int jo = aVar.mo59597jo(str, 0);
                int jo4 = aVar.mo59597jo(str, 1);
                int i2 = jo > 1500 ? jo - 1500 : 0;
                if (jo4 > 1500) {
                    i = jo4 - 1500;
                }
                aVar.f92768d.execSQL("FewShotLearning", "DELETE FROM FewShotLearning WHERE rowid IN (SELECT rowid FROM FewShotLearning WHERE label=0 AND model=='" + str + "' ORDER BY " + "time" + " LIMIT " + i2 + ");");
                aVar.f92768d.execSQL("FewShotLearning", "DELETE FROM FewShotLearning WHERE rowid IN (SELECT rowid FROM FewShotLearning WHERE label=1 AND model=='" + str + "' ORDER BY " + "time" + " LIMIT " + i + ");");
            }
        }
    }

    /* renamed from: a */
    public static void m110635a() {
        Class cls = C88783f.class;
        C91753f fVar = C88694d.f256046a;
        ((C88783f) C86312j.m106911c(cls)).requireAndWaitForAccountInitialized();
        f256042a = new C88693c(C88694d.f256047b);
        ((C88783f) C86312j.m106911c(cls)).requireAndWaitForAccountInitialized();
        f256043b = new C34461a(C88694d.f256047b);
        ((C119157j) C119157j.f356862d).mo183884o(new C88692a());
    }
}
