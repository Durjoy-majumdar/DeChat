package qo0;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.TimerTask;
import qo0.C89741g;

/* renamed from: qo0.i */
public final class C89746i extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C89741g.C89742a.C89744b f258082d;

    /* renamed from: e */
    public final /* synthetic */ C89741g f258083e;

    /* renamed from: f */
    public final /* synthetic */ C89741g.C89742a f258084f;

    public C89746i(C89741g.C89742a.C89744b bVar, C89741g gVar, C89741g.C89742a aVar) {
        this.f258082d = bVar;
        this.f258083e = gVar;
        this.f258084f = aVar;
    }

    public void run() {
        MMHandlerThread.postToMainThread(new C89747j(this.f258082d, this.f258083e, this.f258084f));
    }
}
