package lr3;

import android.content.Context;
import android.os.Handler;
import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xlog.app.XLogSetup;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import mr3.C88834b;
import mr3.C88837c;
import mr3.C88838d;
import qe3.C89625d;
import zt3.C119157j;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: lr3.b */
public class C88646b extends C86301e {
    public void onCreate(Context context) {
        Class cls = C32735h.class;
        Class<Xlog> cls2 = Xlog.class;
        C88838d dVar = C88838d.f256259c;
        dVar.getClass();
        if (Log.getImpl().getClass() != cls2) {
            Log.m105920e("MicroMsg.StartupLogcatCatcher", "impl is not xlog!");
        } else {
            Log.m105924i("MicroMsg.StartupLogcatCatcher", "Log.consoleLogOpen:" + XLogSetup.isLogcatOpen);
            if (!XLogSetup.isLogcatOpen.booleanValue()) {
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_logcat_startup, 0);
                Log.m105924i("MicroMsg.StartupLogcatCatcher", "is need work :" + Qe);
                if (Qe != 0) {
                    ((C119157j) C119157j.f356862d).mo183876g(dVar.f256261b, "LogcatCatcher");
                }
            }
        }
        C88834b bVar = C88834b.f256249g;
        bVar.getClass();
        if (Log.getImpl().getClass() != cls2) {
            Log.m105920e("MicroMsg.LogcatCatcher", "impl is not xlog!");
            return;
        }
        Log.m105924i("MicroMsg.LogcatCatcher", "Log.consoleLogOpen:" + XLogSetup.isLogcatOpen);
        if (!XLogSetup.isLogcatOpen.booleanValue()) {
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_logcat, 0);
            Log.m105925i("MicroMsg.LogcatCatcher", "work clicfg_logcat:%d", Integer.valueOf(Qe2));
            if (Qe2 == 1 && !C89625d.f257846l) {
                int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_logcat_alpha, 0);
                if (C89625d.f257845k || Qe3 != 0) {
                    Log.m105924i("MicroMsg.LogcatCatcher", "is need work :" + Qe2);
                    if (Qe2 != 0) {
                        bVar.f256254e.start();
                        Handler handler = new Handler(bVar.f256254e.getLooper());
                        bVar.f256255f = handler;
                        handler.post(new C88837c(bVar));
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.LogcatCatcher", "id alpha false");
            }
        }
    }
}
