package tz2;

import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import rz2.C48201c;
import su0.C13781a;
import uz2.C78317u1;
import vz2.C78501d;

/* renamed from: tz2.f */
public final class C78119f implements Runnable {

    /* renamed from: d */
    public static final C78119f f228928d = new C78119f();

    public final void run() {
        C78120g gVar = C78120g.f228929a;
        C78317u1 a = gVar.mo108101a();
        if (a != null) {
            C39674e eVar = C39674e.f106452d;
            C48201c kD = eVar.mo62255t0().mo72970kD(C13781a.m13082a());
            if (kD == null || kD.field_CreateTime <= a.f229448d.f147245q) {
                Log.m105924i("MicroMsg.TextStatus.UploadManager", "reCommit last post");
                if (!a.f229456o) {
                    a.f229453i = 0;
                }
                a.f229454j = 0;
                a.f229457p = "";
                a.f229448d.f147245q = C31543z5.m39455e();
                gVar.mo108103c(a);
                eVar.mo62252j1(Long.valueOf(a.f229455n), 3);
                C78120g.f228930b.sendEmptyMessage(0);
                return;
            }
            Log.m105928w("MicroMsg.TextStatus.UploadManager", "reCommit, last item is new.(cur:" + kD.field_CreateTime + ", new:" + a.f229448d.f147245q + ')');
            C78501d.m94804e(C78501d.f229945a, a.f229458q, 6L, (String) null, (String) null, 12, (Object) null);
            MultiProcessMMKV b = gVar.mo108102b();
            if (b != null) {
                b.clearAll();
            }
        }
    }
}
