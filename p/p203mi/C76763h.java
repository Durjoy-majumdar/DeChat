package p203mi;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C49380f50;

/* renamed from: mi.h */
public class C76763h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76766j f224550d;

    public C76763h(C76766j jVar) {
        this.f224550d = jVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        this.f224550d.f224559j.set(true);
        this.f224550d.mo107022b();
        this.f224550d.mo107021a(false, (C49380f50) null, -1);
    }
}
