package fo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.IXWebWorkingHandler;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;

/* renamed from: fo0.j */
public class C87024j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83165i f252540d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f252541e;

    /* renamed from: f */
    public final /* synthetic */ String f252542f;

    /* renamed from: g */
    public final /* synthetic */ C83181q f252543g;

    /* renamed from: fo0.j$a */
    public class C87025a implements IXWebWorkingHandler {
        public C87025a() {
        }

        public boolean isRunOnWorkingThread() {
            return C87024j.this.f252543g.mo115422q();
        }

        public void post(Runnable runnable) {
            C83181q qVar = C87024j.this.f252543g;
            if (qVar == null) {
                Log.m105920e("Luggage.XWebCanvasLogic", "jsThreadAddon is null, error");
            } else if (qVar.mo115422q()) {
                runnable.run();
            } else {
                C87024j.this.f252543g.post(runnable);
            }
        }
    }

    public C87024j(C83165i iVar, C81925i2 i2Var, String str, C83181q qVar) {
        this.f252540d = iVar;
        this.f252541e = i2Var;
        this.f252542f = str;
        this.f252543g = qVar;
    }

    public void run() {
        SkiaCanvasApp skiaCanvasApp;
        Class<C87027l> cls = C87027l.class;
        C83165i iVar = this.f252540d;
        if (iVar == null) {
            Log.m105920e("Luggage.XWebCanvasLogic", "postCreateJsRuntime, try init xweb canvas, but jsRuntime is null");
            return;
        }
        C83187w wVar = (C83187w) iVar.mo63321n0(C83187w.class);
        int hashCode = this.f252541e.hashCode();
        SkiaCanvasApp skiaCanvasApp2 = new SkiaCanvasApp(wVar.mo115417m(), wVar.mo115393J0(), this.f252542f, new C87025a());
        synchronized (cls) {
            C87027l.f252547b.put(hashCode, skiaCanvasApp2);
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(hashCode);
        synchronized (cls) {
            skiaCanvasApp = C87027l.f252547b.get(hashCode);
        }
        objArr[1] = skiaCanvasApp;
        Log.m105925i("Luggage.XWebCanvasLogic", "init id:%s %s", objArr);
    }
}
