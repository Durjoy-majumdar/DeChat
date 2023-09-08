package o03;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.qo4;

/* renamed from: o03.a */
public class C47316a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47319c f126989d;

    public C47316a(C47319c cVar) {
        this.f126989d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        this.f126989d.f126999n.set(true);
        this.f126989d.mo72376c();
        this.f126989d.mo72375b(false, (qo4) null);
    }
}
