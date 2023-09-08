package sj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import xj0.C91216b0;

public final /* synthetic */ class f$$j implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f259008a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f259009b;

    public /* synthetic */ f$$j(C90210f fVar, C88267e eVar) {
        this.f259008a = fVar;
        this.f259009b = eVar;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f259008a;
        C88267e eVar = this.f259009b;
        String str2 = (String) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: active pause result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.f258980g.mo124442t(eVar);
        }
    }
}
