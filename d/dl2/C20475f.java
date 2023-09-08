package dl2;

import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dl2.f */
public class C20475f implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ C20469e f57579d;

    public C20475f(C20469e eVar) {
        this.f57579d = eVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.ReIdAiScanImageDecodeQueue", "release on task");
        if (this.f57579d.f57533a) {
            C19021i0.m20104k();
            this.f57579d.f57533a = false;
        }
        C20469e.f57531w = null;
        C20469e.f57532x = null;
    }
}
