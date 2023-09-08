package p992kb;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kb.a */
public class C88125a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88127c f254882d;

    public C88125a(C88127c cVar) {
        this.f254882d = cVar;
    }

    public void run() {
        C88127c cVar = this.f254882d;
        cVar.f254885a = cVar.f254893i.size();
        Log.m105925i("MicroMsg.MBNiReporter", "hy: onFirstFrameRendered picnum:%d", Integer.valueOf(this.f254882d.f254885a));
    }
}
