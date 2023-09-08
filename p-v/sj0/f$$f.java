package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import sj0.C90203b;
import xj0.C91216b0;
import xj0.C91237o;
import xj0.C91256y;
import xj0.C91258z;

public final /* synthetic */ class f$$f implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258995a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f258996b;

    /* renamed from: c */
    public final /* synthetic */ int f258997c;

    public /* synthetic */ f$$f(C90210f fVar, C81925i2 i2Var, int i) {
        this.f258995a = fVar;
        this.f258996b = i2Var;
        this.f258997c = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C91258z zVar;
        C90210f fVar = this.f258995a;
        C81925i2 i2Var = this.f258996b;
        int i3 = this.f258997c;
        C91237o.C91244g gVar = (C91237o.C91244g) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: stop result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.f258982i = null;
            if (gVar == null || (zVar = gVar.f261827a) == null || Util.isNullOrNil(((C90203b.C90205b) zVar).f258967a)) {
                Log.m105920e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: callback ok without path!");
                fVar.mo124450z(i2Var, i3, 1, -1, "stop success without filePath!");
                return;
            }
            C90203b.C90205b bVar = (C90203b.C90205b) gVar.f261827a;
            C91237o b = C91237o.m114472b(i2Var.getAppId(), i2Var);
            b.f261806a.postToWorker(new C91256y(b, bVar.f258967a, new f$$h(fVar, bVar, (C90203b.C90205b) gVar.f261828b, i2Var, i3)));
            return;
        }
        fVar.mo124450z(i2Var, i3, i, i2, str);
    }
}
