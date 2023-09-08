package ma2;

import android.content.Context;
import ca2.C92388b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import da2.C97456b;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f81.C7998c;
import la2.C99355b;
import la2.C99357e;
import la2.C99358f;
import la2.C99360j;
import la2.C99364n;
import la2.C99365q;
import qa2.C101084e;
import ra2.C101366b;
import ra2.C36278d;
import ua2.C101991b;

@C86522b(dependencies = {C92388b.class, C7998c.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: ma2.o0 */
public class C99814o0 extends C86301e implements C97456b {

    /* renamed from: d */
    public C101366b f292501d;

    /* renamed from: e */
    public C36278d f292502e;

    public static C99814o0 vx0() {
        return (C99814o0) C86312j.m106911c(C99814o0.class);
    }

    public static C101366b wx0() {
        if (vx0().f292501d == null) {
            vx0().f292501d = new C101366b(C86709a0.m107535s().f251811i);
        }
        return vx0().f292501d;
    }

    public static C36278d xx0() {
        if (vx0().f292502e == null) {
            vx0().f292502e = new C36278d(C86709a0.m107535s().f251811i);
        }
        return vx0().f292502e;
    }

    public void onAccountInitialized(Context context) {
        C99355b bVar = C99364n.m129616h().f291355e;
        ((C99360j) bVar).f291347a = C99364n.f291354g;
        bVar.init();
    }

    public void onAccountReleased(Context context) {
        synchronized (C99364n.class) {
            C99364n nVar = C99364n.f291354g;
            if (nVar != null) {
                nVar.mo138831j();
            }
        }
        Class<C99358f> cls = C99358f.class;
        if (C101991b.f300315c == null) {
            synchronized (C101991b.class) {
                if (C101991b.f300315c == null) {
                    Log.m105924i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    C101991b.f300315c = new C101991b((Context) null);
                }
            }
        }
        C101991b.f300315c.f300317b.remove(cls);
        this.f292501d = null;
        this.f292502e = null;
    }

    public void onCreate(Context context) {
        C99365q qVar = new C99365q();
        synchronized (C99364n.class) {
            if (C99364n.f291354g != null) {
                Log.m105920e("MicroMsg.Music.MusicPlayerManager", "music player mgr is init, don't it again");
                C99364n.f291354g.f291355e = qVar;
            } else {
                C99364n.f291354g = new C99364n(qVar);
            }
        }
        C101991b.m134283a(C99358f.class, qVar);
        C101991b.m134283a(C99357e.class, new C101084e());
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitialized();
    }
}
