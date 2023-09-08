package p730vu;

import com.tencent.p014mm.plugin.report.service.C115666i;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C117747y;
import ob0.C35142u;
import zt3.C119157j;

/* renamed from: vu.c */
public class C37832c implements C35142u {

    /* renamed from: vu.c$a */
    public class C37833a implements Runnable {
        public C37833a(C37832c cVar) {
        }

        public void run() {
            C115666i.m162699f();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (C86709a0.m107522a()) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(yVar == null ? -1 : yVar.getType());
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = str;
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv onIDKeyCallback onSceneEnd[%d][%d, %d, %s]", objArr);
            if (i == 0 && i2 == 0) {
                ((C119157j) C119157j.f356862d).mo183875f(new C37833a(this));
            }
        }
    }
}
