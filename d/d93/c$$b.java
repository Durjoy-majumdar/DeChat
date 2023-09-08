package d93;

import com.tencent.p014mm.sdk.platformtools.Log;

public class c$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f122711d;

    /* renamed from: e */
    public final /* synthetic */ C45297a f122712e;

    /* renamed from: f */
    public final /* synthetic */ C45298c f122713f;

    public c$$b(C45298c cVar, int i, C45297a aVar) {
        this.f122713f = cVar;
        this.f122711d = i;
        this.f122712e = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.LuggageGetA8Key", "WebView-Trace Use Outer GetA8key Result CallBack");
        C45298c cVar = this.f122713f;
        C45298c.m50182a(cVar, cVar.f122698o, this.f122711d, 0, 0, "", cVar.f122699p, this.f122712e);
    }
}
