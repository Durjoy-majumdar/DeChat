package bh2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gu3.C107920f;
import gy3.C87413o;
import java.nio.Buffer;
import l80.C109277d;
import n80.C109697b;
import n80.C109712g;
import r80.C110524i0;
import rx3.C13598b0;

/* renamed from: bh2.m */
public final class C104127m extends C87413o implements C32227p<Boolean, Buffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308106d;

    /* renamed from: e */
    public final /* synthetic */ C109277d f308107e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104127m(C104119h hVar, C109277d dVar) {
        super(2);
        this.f308106d = hVar;
        this.f308107e = dVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C32224a<C13598b0> aVar;
        Buffer buffer = (Buffer) obj2;
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            C115669n.INSTANCE.mo175913w(986, 19, 1);
        }
        C104119h hVar = this.f308106d;
        hVar.f308065M++;
        Log.m105924i(hVar.f308081m, "onFrameDraw, drawFrameCount:" + this.f308106d.f308065M + ", encodeFrameCount:" + this.f308106d.f308064L + ", isDecodeEnd:" + this.f308106d.f308066N);
        C110524i0 i0Var = this.f308106d.f308057E;
        if (!(i0Var == null || (aVar = i0Var.f330519o) == null)) {
            ((C110524i0.C110526b) aVar).invoke();
        }
        C104119h hVar2 = this.f308106d;
        if (!hVar2.f308079k) {
            C109697b bVar = hVar2.f308089u;
            if (bVar != null) {
                bVar.mo160917a(0);
            }
        } else if (buffer != null) {
            C109712g gVar = hVar2.f308090v;
            if (gVar != null) {
                C109277d dVar = this.f308107e;
                int i = dVar.f327159b;
                int i2 = dVar.f327160c;
                if (gVar.f328385a < 0) {
                    Log.m105920e("MicroMsg.X264TransEncoder", "writeRGBData error, buffId error");
                } else {
                    synchronized (gVar.f328390f) {
                        if (!gVar.f328388d) {
                            if (!gVar.f328389e) {
                                long currentTicks = Util.currentTicks();
                                SightVideoJNI.writeRGBDataForMMSight(gVar.f328385a, buffer, i, i2, false, false, i, i2);
                                StringBuilder sb = new StringBuilder();
                                sb.append("writeRGBData ");
                                sb.append(i);
                                sb.append(", ");
                                sb.append(i2);
                                sb.append(" cost ");
                                sb.append(Util.ticksToNow(currentTicks));
                                sb.append("ms, ");
                                int i3 = gVar.f328391g;
                                gVar.f328391g = i3 + 1;
                                sb.append(i3);
                                Log.m105924i("MicroMsg.X264TransEncoder", sb.toString());
                                if (!gVar.f328393i) {
                                    C107920f<?> fVar = gVar.f328386b;
                                    if (fVar != null) {
                                        fVar.mo158349h();
                                    }
                                    gVar.f328393i = true;
                                }
                                C13598b0 b0Var = C13598b0.f38549a;
                            }
                        }
                        Log.m105920e("MicroMsg.X264TransEncoder", "writeRGBData, already stop or cancel, ignore");
                    }
                }
            }
            C104119h hVar3 = this.f308106d;
            hVar3.f308064L++;
            C104119h.m138955e(hVar3);
        } else {
            Log.m105928w(hVar2.f308081m, "encode error, useX264Encode true but outputBuffer null");
        }
        C104114f fVar2 = this.f308106d.f308088t;
        if (fVar2 != null) {
            fVar2.mo145768d(false);
        }
        return C13598b0.f38549a;
    }
}
