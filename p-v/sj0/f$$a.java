package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import xj0.C91216b0;

public final /* synthetic */ class f$$a implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f258983a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f258984b;

    /* renamed from: c */
    public final /* synthetic */ int f258985c;

    public /* synthetic */ f$$a(C90210f fVar, C81925i2 i2Var, int i) {
        this.f258983a = fVar;
        this.f258984b = i2Var;
        this.f258985c = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f258983a;
        C81925i2 i2Var = this.f258984b;
        int i3 = this.f258985c;
        String str2 = (String) obj;
        fVar.getClass();
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: resume result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            fVar.mo124449A(i2Var, i3, (Map<String, Object>) null);
            fVar.f258980g.mo124443u(i2Var);
            return;
        }
        fVar.mo124450z(i2Var, i3, i, i2, str);
    }
}
