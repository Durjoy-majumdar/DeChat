package dl2;

import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dl2.h */
public class C20477h implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ C20469e f57581d;

    public C20477h(C20469e eVar) {
        this.f57581d = eVar;
    }

    public void run() {
        if (this.f57581d.f57533a && C19021i0.f53461g) {
            Log.m105920e("MicroMsg.ScanFastFocusEngineManager", "resetNoBoxCount");
            C19021i0.f53460f.resetNoBoxCount();
        }
    }
}
