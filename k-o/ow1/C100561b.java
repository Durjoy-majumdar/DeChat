package ow1;

import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.sdk.platformtools.Log;
import kq3.C99166b;

/* renamed from: ow1.b */
public class C100561b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94049a f294629d;

    public C100561b(C94049a aVar) {
        this.f294629d = aVar;
    }

    public void run() {
        C99166b bVar = this.f294629d.f271556x;
        bVar.getClass();
        try {
            bVar.f290796s = true;
            bVar.mo138534b();
        } catch (Throwable th) {
            Log.printErrStackTrace("DragSelectTouchListener", th, "forceDragStop err", new Object[0]);
        }
    }
}
