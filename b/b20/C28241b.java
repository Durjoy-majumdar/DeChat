package b20;

import a20.C27736a;
import android.content.Context;
import android.os.Build;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import oa1.C117731d;
import qe3.C89625d;
import rz1.C36595a;
import zt3.C119157j;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: b20.b */
public class C28241b extends C86301e implements C80982a.C80983a {

    /* renamed from: d */
    public String f77781d = "GPU_MEMORY_OPENGL_HOOK";

    /* renamed from: b20.b$a */
    public class C28242a implements Runnable {
        public C28242a() {
        }

        public void run() {
            C28241b.this.getClass();
            Log.m105918d("MicroMsg.GpuResService", "PluginGpuRes execute");
        }
    }

    public C28241b() {
        int i = C27736a.f76753a;
    }

    /* renamed from: S1 */
    public double mo55862S1() {
        long He = (BuildInfo.IS_FLAVOR_RED || C89625d.f257845k) ? 1 : ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_gpu_opengl_hook_open_sample, 100000000);
        if (He > 0) {
            return 1.0d / ((double) He);
        }
        Log.m105920e("MicroMsg.GpuResService", "denominator <= -0L, does not need to rate()");
        return -1.0d;
    }

    public long b00() {
        return 0;
    }

    /* renamed from: kD */
    public void mo55864kD(double d) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_gpu_process_open, true);
        Log.m105924i("MicroMsg.GpuResService", "openGpuProcess = " + wf);
        if (wf) {
            Log.m105920e("MicroMsg.GpuResService", "sample success & do action");
            ((C119157j) C119157j.f356862d).mo183875f(new C28242a());
        }
    }

    public String key() {
        return this.f77781d;
    }

    public void onCreate(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 29 || i == 30) {
            int i2 = Util.getInt(C117731d.m166007c().mo182444f("clicfg_background_graphic_release", "0", false, true), 0);
            Log.m105921e("MicroMsg.GpuResService", "[OpenglLeakPlugin: graphic_release open = %d]", Integer.valueOf(i2));
            if (i2 > 0) {
                if (!C36595a.f97312g) {
                    C36595a.f97312g = true;
                    ProcessExplicitBackgroundOwner.INSTANCE.observeForever(C36595a.f97311f);
                }
                Log.m105921e("MicroMsg.GpuResService", "[OpenglLeakPlugin: GraphicCacheRelease start success, processName = %s]", MMApplicationContext.getProcessName());
            }
        }
    }
}
