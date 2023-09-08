package z10;

import android.graphics.Bitmap;
import android.opengl.EGLDisplay;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import q00.C110264g;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: z10.b */
public final class C112561b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112565e f337006d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f337007e;

    /* renamed from: f */
    public final /* synthetic */ String f337008f;

    /* renamed from: g */
    public final /* synthetic */ float f337009g;

    public C112561b(C112565e eVar, C32226l<? super Bitmap, C13598b0> lVar, String str, float f) {
        this.f337006d = eVar;
        this.f337007e = lVar;
        this.f337008f = str;
        this.f337009g = f;
    }

    public final void run() {
        C112565e eVar = this.f337006d;
        List<C32226l<Bitmap, C13598b0>> list = eVar.f337024m;
        C32226l<Bitmap, C13598b0> lVar = this.f337007e;
        synchronized (list) {
            ((ArrayList) eVar.f337024m).add(lVar);
        }
        C111742d.C111743a aVar = C111742d.f334647a;
        aVar.mo163463f();
        C112565e eVar2 = this.f337006d;
        C110264g gVar = eVar2.f337021j;
        if (gVar != null) {
            gVar.mo143250q(this.f337008f, this.f337009g);
            C110264g.C110265b.m149907b(gVar, eVar2.f337019h, eVar2.f337020i, 0, 0, false, false, false, 124, (Object) null);
        }
        C112565e eVar3 = this.f337006d;
        synchronized (eVar3.f337024m) {
            if (((ArrayList) eVar3.f337024m).size() > 0) {
                ((C32226l) ((ArrayList) eVar3.f337024m).remove(0)).invoke(aVar.mo163472r(eVar3.f337020i, eVar3.f337022k, eVar3.f337023l));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C111742d.C65942b bVar = this.f337006d.f337017f;
        if (bVar != null) {
            EGLDisplay eGLDisplay = bVar.f189591a;
            if (bVar != null) {
                aVar.mo163474t(eGLDisplay, bVar.f189592b);
            } else {
                C87412m.m108603p("mEGLEnvironment");
                throw null;
            }
        } else {
            C87412m.m108603p("mEGLEnvironment");
            throw null;
        }
    }
}
