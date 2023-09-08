package mp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import p910lj.C76701a;

/* renamed from: mp0.k */
public class C61550k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61551l f174949d;

    public C61550k(C61551l lVar) {
        this.f174949d = lVar;
    }

    public void run() {
        C76701a.makeText(this.f174949d.f174950a, (CharSequence) "start cpu profiling...", 1).show();
        Log.m105924i("MiroMsg.GameCpuProfile", "start cpu profiling...");
    }
}
