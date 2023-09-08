package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import te3.C101865x33;
import te3.C51024qx;
import te3.ie4;

public final /* synthetic */ class e0$$d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ e0$$d f352713d;

    /* renamed from: e */
    public final /* synthetic */ ie4 f352714e;

    public /* synthetic */ e0$$d$$a(e0$$d e0__d, ie4 ie4) {
        this.f352713d = e0__d;
        this.f352714e = ie4;
    }

    public final void run() {
        e0$$d e0__d = this.f352713d;
        ie4 ie4 = this.f352714e;
        e0__d.getClass();
        int i = ie4.f354052n;
        if (i == 0) {
            C101865x33 x332 = ie4.f354045d;
            if (x332 != null) {
                if ((x332.f299847f & ie4.f354048g) != 0) {
                    C51024qx qxVar = x332.f299846e;
                    if (qxVar == null || !qxVar.f140594e.isEmpty() || !ie4.f354049h) {
                        e0__d.f352722a.mo182767k(ie4.f354047f, ie4.f354048g, true);
                    } else {
                        Log.m105929w("MicroMsg.SyncService", "MMKVProcessor %s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", Integer.valueOf(ie4.f354050i));
                    }
                }
            }
            e0__d.f352722a.mo182763g(new C118011j(ie4));
        } else if (i == 1) {
            if ((ie4.f354053o & 1) > 0) {
                C86709a0.m107524d().mo123460f(new C118014p(ie4.f354054p, C118000d0.f352701a.mo182756a()));
            }
            e0__d.f352722a.mo182763g(new C118011j(ie4));
        }
    }
}
