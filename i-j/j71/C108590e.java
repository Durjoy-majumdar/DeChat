package j71;

import ac3.C103355g1;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import javax.microedition.khronos.opengles.GL10;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: j71.e */
public final class C108590e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108587c f325067d;

    /* renamed from: e */
    public final /* synthetic */ boolean f325068e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f325069f;

    public C108590e(C108587c cVar, boolean z, C32224a<C13598b0> aVar) {
        this.f325067d = cVar;
        this.f325068e = z;
        this.f325069f = aVar;
    }

    public final void run() {
        C108587c cVar = this.f325067d;
        C108591i iVar = cVar.f325060i;
        if (iVar != null) {
            GL10 gl10 = cVar.f325059h;
            if (gl10 != null) {
                iVar.onSurfaceCreated(gl10, cVar.f325058g);
                C108587c cVar2 = this.f325067d;
                C108591i iVar2 = cVar2.f325060i;
                if (iVar2 != null) {
                    GL10 gl102 = cVar2.f325059h;
                    if (gl102 != null) {
                        cVar2.getClass();
                        this.f325067d.getClass();
                        iVar2.onSurfaceChanged(gl102, C0947jz.f2205e, C0947jz.f2205e);
                        C108591i iVar3 = this.f325067d.f325060i;
                        if (iVar3 != null) {
                            iVar3.f325088i = this.f325068e;
                            try {
                                C103355g1 g1Var = new C103355g1(0, false, false, false, false, false, C110264g.C47730a.APP_ZPBQ, 61, (C8480h) null);
                                iVar3.f325105z = g1Var;
                                g1Var.mo143224C(640, 640);
                                C103355g1 g1Var2 = iVar3.f325105z;
                                if (g1Var2 != null) {
                                    g1Var2.mo143233a(iVar3.f325088i);
                                }
                                C103355g1 g1Var3 = iVar3.f325105z;
                                if (g1Var3 != null) {
                                    g1Var3.mo143257x(iVar3.f325081b);
                                }
                            } catch (Exception unused) {
                                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentInitFailed");
                                C115669n.INSTANCE.mo175912v(1012, 45);
                            }
                            C32224a<C13598b0> aVar = this.f325069f;
                            if (aVar != null) {
                                aVar.invoke();
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("renderer");
                        throw null;
                    }
                    C87412m.m108603p("gl");
                    throw null;
                }
                C87412m.m108603p("renderer");
                throw null;
            }
            C87412m.m108603p("gl");
            throw null;
        }
        C87412m.m108603p("renderer");
        throw null;
    }
}
