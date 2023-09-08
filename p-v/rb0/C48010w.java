package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import rb0.C48011x;

/* renamed from: rb0.w */
public class C48010w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f128788d;

    /* renamed from: e */
    public final /* synthetic */ String f128789e;

    public C48010w(String str, String str2) {
        this.f128788d = str;
        this.f128789e = str2;
    }

    public void run() {
        C48011x.C48012a Lx0 = C48009v0.Lx0();
        String str = this.f128788d;
        String str2 = this.f128789e;
        Lx0.getClass();
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.BrandLogic", "pushing for brand " + str + ", url " + str2);
        } else if (Util.secondsToNow((long) Util.nullAsNil((Integer) ((HashMap) Lx0.f128791b).get(str))) < 300) {
            Log.m105924i("MicroMsg.BrandLogic", "downloading interval less than 5 mins for " + str);
        } else {
            ((HashMap) Lx0.f128791b).put(str, Integer.valueOf((int) Util.nowSecond()));
            QueueWorkerThread queueWorkerThread = Lx0.f128793d;
            if (queueWorkerThread == null || queueWorkerThread.isDead()) {
                Lx0.f128793d = new QueueWorkerThread(1, "brand-logic");
            }
            Lx0.f128793d.add(new C48011x.C48014b(str, C48011x.m53371a(str, str2)));
        }
    }
}
