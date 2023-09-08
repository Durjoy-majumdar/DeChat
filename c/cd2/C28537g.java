package cd2;

import com.tencent.p014mm.autogen.events.SnsPostSuccessEvent;

/* renamed from: cd2.g */
public class C28537g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsPostSuccessEvent f78382d;

    /* renamed from: e */
    public final /* synthetic */ C28539i f78383e;

    public C28537g(C28539i iVar, SnsPostSuccessEvent snsPostSuccessEvent) {
        this.f78383e = iVar;
        this.f78382d = snsPostSuccessEvent;
    }

    public void run() {
        SnsPostSuccessEvent snsPostSuccessEvent = this.f78382d;
        C28534c cVar = new C28534c();
        cVar.f78379a = snsPostSuccessEvent.f78999d.f79000a;
        this.f78383e.mo175851q(cVar);
    }
}
