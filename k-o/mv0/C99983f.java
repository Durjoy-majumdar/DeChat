package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import nv0.C100217c;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: mv0.f */
public class C99983f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C99984g f292940d;

    public C99983f(C99984g gVar) {
        this.f292940d = gVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C100217c cVar = (C100217c) yVar;
        Log.m105925i("MicroMsg.BakPCServer", "onSceneEnd %s, %d, %d", cVar.f293638u.f295636d, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f292940d.f292941d) {
            this.f292940d.f292946i.remove(cVar.f293638u.f295636d);
            Log.m105925i("MicroMsg.BakPCServer", "onSceneEnd left: size:%d", Integer.valueOf(this.f292940d.f292946i.size()));
            if (this.f292940d.f292946i.size() <= 10) {
                this.f292940d.f292941d.notifyAll();
            }
        }
        C99984g gVar = this.f292940d;
        int i3 = gVar.f292950p + 1;
        gVar.f292950p = i3;
        if (i3 % 100 == 0) {
            gVar.getClass();
            System.gc();
            long freeMemory = Runtime.getRuntime().freeMemory() / 1000;
            long j = Runtime.getRuntime().totalMemory() / 1000;
            Log.m105925i("MicroMsg.BakPCServer", "memoryInfo avail/total, dalvik[%dk, %dk, user:%dk], recoverCnt:%d", Long.valueOf(freeMemory), Long.valueOf(j), Long.valueOf(j - freeMemory), Integer.valueOf(gVar.f292950p));
        }
        this.f292940d.mo139326b();
    }
}
