package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import xj0.C91216b0;

public final /* synthetic */ class f$$c implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258986a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f258987b;

    /* renamed from: c */
    public final /* synthetic */ int f258988c;

    public /* synthetic */ f$$c(C90210f fVar, C81925i2 i2Var, int i) {
        this.f258986a = fVar;
        this.f258987b = i2Var;
        this.f258988c = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f258986a;
        C81925i2 i2Var = this.f258987b;
        int i3 = this.f258988c;
        String str2 = (String) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: pause result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.mo124449A(i2Var, i3, (Map<String, Object>) null);
            fVar.f258980g.mo124442t(i2Var);
            return;
        }
        fVar.mo124450z(i2Var, i3, i, i2, str);
    }
}
