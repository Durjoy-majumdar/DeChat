package cd2;

import com.tencent.p014mm.autogen.events.SnsPostFailEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;

/* renamed from: cd2.h */
public class C28538h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsPostFailEvent f78384d;

    /* renamed from: e */
    public final /* synthetic */ C28539i f78385e;

    public C28538h(C28539i iVar, SnsPostFailEvent snsPostFailEvent) {
        this.f78385e = iVar;
        this.f78384d = snsPostFailEvent;
    }

    public void run() {
        C97625j3.m125812b().mo105906u().mo119676J(589825, Boolean.TRUE);
        SnsPostFailEvent snsPostFailEvent = this.f78384d;
        C28534c cVar = new C28534c();
        cVar.f78379a = snsPostFailEvent.f78997d.f78998a;
        this.f78385e.mo175850p(cVar);
        Log.m105925i("MicroMsg.SendSnsFailNotification", "SnsPostFailEventListener receive id:%s", String.valueOf(snsPostFailEvent.f78997d.f78998a));
    }
}
