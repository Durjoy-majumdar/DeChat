package qj0;

import com.tencent.p014mm.plugin.appbrand.report.quality.C84182a0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84237z;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj0.b */
public class C89683b {

    /* renamed from: a */
    public String f257927a;

    /* renamed from: b */
    public int f257928b;

    /* renamed from: c */
    public int f257929c;

    /* renamed from: d */
    public int f257930d;

    /* renamed from: e */
    public int f257931e;

    /* renamed from: f */
    public C84182a0 f257932f;

    public C89683b(QualitySessionRuntime qualitySessionRuntime, C84182a0 a0Var) {
        this.f257927a = qualitySessionRuntime.f245833e;
        this.f257929c = qualitySessionRuntime.f245834f;
        this.f257928b = qualitySessionRuntime.f245837i;
        this.f257932f = a0Var;
    }

    /* renamed from: a */
    public void mo124008a(boolean z) {
        Log.m105927v("MicroMsg.Kv_14959", "hy: 14959 report is full: %b", Boolean.valueOf(z));
        C84182a0 a0Var = this.f257932f;
        if (a0Var != null) {
            C84237z.C84238a aVar = a0Var.f245870c;
            if (aVar != null) {
                this.f257930d = aVar.ordinal();
            } else {
                this.f257930d = 0;
            }
            C84182a0 a0Var2 = this.f257932f;
            this.f257931e = a0Var2.f245879l;
            if (z) {
                if (a0Var2 != null) {
                    int i = a0Var2.f245878k;
                    int i2 = a0Var2.f245880m;
                    C115669n.INSTANCE.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 2, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f257931e));
                    Log.m105925i("MicroMsg.Kv_14959", "Kv_14959.reportCpu cpu = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f257931e), Integer.valueOf(this.f257930d));
                }
                C84182a0 a0Var3 = this.f257932f;
                if (a0Var3 != null) {
                    int i3 = a0Var3.f245878k;
                    int i4 = a0Var3.f245876i;
                    int i5 = a0Var3.f245874g;
                    int i6 = a0Var3.f245875h;
                    int i7 = a0Var3.f245877j;
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 3, Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(this.f257931e));
                    nVar.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 101, Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(this.f257931e));
                    nVar.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 102, Integer.valueOf(i6), Integer.valueOf(i3), Integer.valueOf(this.f257931e));
                    nVar.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 104, Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(this.f257931e));
                    Log.m105925i("MicroMsg.Kv_14959", "Kv_14959.reportMemory pid = [%d] native = [%d] dalvik = [%d] delta = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(this.f257931e), Integer.valueOf(this.f257930d));
                }
            }
            C84182a0 a0Var4 = this.f257932f;
            if (a0Var4 != null) {
                int i8 = a0Var4.f245878k;
                int i9 = a0Var4.f245868a;
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 1, Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(this.f257931e));
                Log.m105925i("MicroMsg.Kv_14959", "Kv_14959.reportFps fps = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(this.f257931e), Integer.valueOf(this.f257930d));
                int i15 = (int) this.f257932f.f245869b;
                if (i15 != -1) {
                    nVar2.mo160131h(14959, this.f257927a, Integer.valueOf(this.f257928b), Integer.valueOf(this.f257929c), Integer.valueOf(this.f257930d), 105, Integer.valueOf(i15), Integer.valueOf(i8), Integer.valueOf(this.f257931e));
                    Log.m105925i("MicroMsg.Kv_14959", "Kv_14959.reportFps variance fps = [%d] eventid: [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", Integer.valueOf(i15), 105, Integer.valueOf(i8), Integer.valueOf(this.f257931e), Integer.valueOf(this.f257930d));
                    return;
                }
                Log.m105920e("MicroMsg.Kv_14959", "variance == -1!");
            }
        }
    }
}
