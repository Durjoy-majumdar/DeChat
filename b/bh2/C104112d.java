package bh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import w80.C111742d;

/* renamed from: bh2.d */
public class C104112d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104110c f308033d;

    public C104112d(C104110c cVar) {
        this.f308033d = cVar;
    }

    public void run() {
        C104110c cVar = this.f308033d;
        cVar.getClass();
        Log.m105924i("MicroMsg.Story.GLThread", "draw");
        C104136w wVar = cVar.f308028c;
        if (wVar != null) {
            wVar.mo145779b();
        }
        C111742d.C111743a aVar = C111742d.f334647a;
        C111742d.C65942b bVar = cVar.f308029d;
        aVar.mo163474t(bVar.f189591a, bVar.f189592b);
    }
}
