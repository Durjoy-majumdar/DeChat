package qv2;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import lt3.C21460a;
import op3.C117877b;
import ot3.C21881e;
import pt3.C110247f;
import pt3.C22005b;
import pt3.C22007d;
import pv2.C35701m;
import pv2.C77290d;

/* renamed from: qv2.d */
public class C110476d {

    /* renamed from: a */
    public static boolean f330374a;

    /* renamed from: b */
    public static int f330375b;

    /* renamed from: c */
    public static C110247f f330376c = new C110477a();

    /* renamed from: qv2.d$b */
    public class C36101b implements C88631d.C88632b<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ long f96214a;

        /* renamed from: b */
        public final /* synthetic */ C35701m f96215b;

        public C36101b(long j, C35701m mVar) {
            this.f96214a = j;
            this.f96215b = mVar;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.SoterInitManager", "alvinluo onTerminate");
            Log.m105925i("MicroMsg.SoterInitManager", "alvinluo init takes %d ms", Long.valueOf(System.currentTimeMillis() - this.f96214a));
            C35701m mVar = this.f96215b;
            if (mVar != null) {
                mVar.mo59577n(0, "");
            }
        }
    }

    /* renamed from: qv2.d$c */
    public class C36102c implements C88631d.C76721a<C117877b<Integer, String>> {

        /* renamed from: a */
        public final /* synthetic */ C35701m f96216a;

        public C36102c(C35701m mVar) {
            this.f96216a = mVar;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            C117877b bVar = (C117877b) obj;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            String str = (String) bVar.mo182596a(1);
            Log.m105921e("MicroMsg.SoterInitManager", "alvinluo onInterrupt errCode: %d, errMsg: %s", Integer.valueOf(intValue), str);
            C35701m mVar = this.f96216a;
            if (mVar != null) {
                mVar.mo59577n(intValue, str);
            }
        }
    }

    /* renamed from: qv2.d$a */
    public class C110477a implements C110247f {
    }

    /* renamed from: a */
    public static void m150375a(boolean z, boolean z2, C35701m mVar) {
        Log.m105925i("MicroMsg.SoterInitManager", "alvinluo isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C22007d.f62275r = Process.myUid();
            C110247f fVar = f330376c;
            C21460a.f60757b = fVar;
            C22005b bVar = C21460a.f60758c;
            if (bVar == null) {
                C21881e.m25083b("Soter.SoterCore", "soter: setTrebleServiceListener IMPL is null, not support soter", new Object[0]);
            } else {
                bVar.mo35114r(fVar);
            }
            ((C88633e) C88643g.m110548f(Boolean.valueOf(z), Boolean.valueOf(z2))).mo123060U(new C110475b()).mo123060U(new C77438g()).mo123060U(new C77437f()).mo123060U(new C110478h()).mo123065b(new C36102c(mVar)).mo114038a(new C36101b(currentTimeMillis, mVar));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SoterInitManager", e, "alvinluo exception when init soter: %s", e.getMessage());
            C77290d.m93105c(4, 1001, 1);
            if (mVar != null) {
                mVar.mo59577n(-1, "system error");
            }
        }
    }
}
