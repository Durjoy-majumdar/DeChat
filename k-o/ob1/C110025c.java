package ob1;

import com.tencent.p014mm.sdk.thread.ThreadPool;

/* renamed from: ob1.c */
public class C110025c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110011a f329274d;

    public C110025c(C110011a aVar) {
        this.f329274d = aVar;
    }

    public void run() {
        C110011a aVar = this.f329274d;
        aVar.f329224E = aVar.f329236d.getBitmap();
        ThreadPool.post(new C110026d(aVar), "saveFaceBitmap");
    }
}
