package j72;

import com.tencent.p014mm.sdk.platformtools.Log;
import j72.C108600b;
import j72.C108647y;

/* renamed from: j72.a */
public class C108599a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108604d f325147d;

    /* renamed from: e */
    public final /* synthetic */ C108600b.C108601a f325148e;

    public C108599a(C108600b.C108601a aVar, C108604d dVar) {
        this.f325148e = aVar;
        this.f325147d = dVar;
    }

    public void run() {
        C108600b bVar = C108600b.this;
        C108604d dVar = this.f325147d;
        bVar.getClass();
        Log.m105925i("MicroMsg.ForwardMgr", "receive buf bufIndex: %d receiveIndex: %d", Integer.valueOf(dVar.f325163c), Integer.valueOf(bVar.f325152c));
        int i = bVar.f325152c;
        if (i == dVar.f325163c) {
            bVar.f325152c = i + 1;
            ((C108647y.C108648a) bVar.f325155f).mo159674a(dVar.f325162b);
            bVar.mo159596a();
            return;
        }
        bVar.f325153d.add(dVar);
        bVar.mo159596a();
    }
}
