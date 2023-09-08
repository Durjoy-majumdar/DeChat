package dl2;

import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dl2.g */
public class C20476g implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ C20469e f57580d;

    public C20476g(C20469e eVar) {
        this.f57580d = eVar;
    }

    public void run() {
        if (this.f57580d.f57533a && C19021i0.f53461g) {
            Log.m105918d("MicroMsg.ScanFastFocusEngineManager", "alvinluo focusEngineNative reset");
            C19021i0.f53460f.reset();
        }
    }
}
