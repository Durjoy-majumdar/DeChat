package p823sg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.IOException;

/* renamed from: sg.b */
public class C101609b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f297455d;

    /* renamed from: e */
    public final /* synthetic */ C101610c f297456e;

    public C101609b(C101610c cVar, String str) {
        this.f297456e = cVar;
        this.f297455d = str;
    }

    public void run() {
        C86009m1 m1Var = new C86009m1(this.f297455d);
        if (!m1Var.mo119967g()) {
            long currentTimeMillis = System.currentTimeMillis();
            C86009m1 l = new C86009m1(this.f297455d).mo119974l();
            if (!l.mo119967g() && (!l.mo119987x() || !l.mo119977o())) {
                Log.m105921e("MicroMsg.ConcurrentFileBuilder", "mkParentDir mkdir error. %s", this.f297455d);
            }
            Log.m105925i("MicroMsg.ConcurrentFileBuilder", "make dir last %d ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ConcurrentFileBuilder", e, "", new Object[0]);
                Log.printErrStackTrace("MicroMsg.ConcurrentFileBuilder", e, "createNewFile", new Object[0]);
            }
            Log.m105925i("MicroMsg.ConcurrentFileBuilder", "make file last %d ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        }
        this.f297456e.f297459b.lock();
        try {
            C101610c cVar = this.f297456e;
            cVar.f297458a = m1Var;
            cVar.f297460c.signal();
            Log.m105925i("MicroMsg.ConcurrentFileBuilder", "notify file prepared %s", m1Var.mo119969h());
        } finally {
            this.f297456e.f297459b.unlock();
        }
    }
}
