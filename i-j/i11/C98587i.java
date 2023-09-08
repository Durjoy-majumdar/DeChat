package i11;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import f40.C86709a0;
import gy3.C8480h;
import kj2.C117407d;
import zh3.C119118e;

/* renamed from: i11.i */
public final class C98587i implements Runnable {

    /* renamed from: d */
    public static final C98588a f289083d = new C98588a((C8480h) null);

    /* renamed from: i11.i$a */
    public static final class C98588a {
        public C98588a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo137958a() {
            C119118e eVar = C86709a0.m107535s().f251811i.f262815b;
            long g = eVar.mo183814g();
            long f = eVar.mo183813f() - g;
            long f2 = eVar.mo183813f();
            if (f > DownloadHelper.SAVE_LENGTH || g < f) {
                Log.m105924i("MicroMsg.VacuumTask", "Threshold not matched, skip vacuum (freelist: " + g + ", remain: " + f + ')');
                return 0;
            }
            C98589j.f289084a = true;
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160131h(25824, "EnMicroMsg.db", eVar.mo183817j(), Long.valueOf(f2), 0, Long.valueOf(g), "c2-before", 0, Long.valueOf(f), 0, 0, 0, 1, 0);
            long currentTimeMillis = System.currentTimeMillis();
            boolean x = eVar.mo183826x();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            dVar.mo160131h(25824, "EnMicroMsg.db", eVar.mo183817j(), Long.valueOf(f2), 0, Long.valueOf(g), "c2-" + x, Long.valueOf(eVar.mo183813f()), Long.valueOf(f), Long.valueOf(f2 - eVar.mo183813f()), Long.valueOf(currentTimeMillis2), 0, 1, Long.valueOf(f / currentTimeMillis2));
            C98589j.f289084a = false;
            StringBuilder sb = new StringBuilder();
            sb.append("Vacuum ");
            sb.append(x ? "done" : StateEvent.ProcessResult.FAILED);
            sb.append('.');
            Log.m105924i("MicroMsg.VacuumTask", sb.toString());
            return x ? 1 : -1;
        }
    }
}
