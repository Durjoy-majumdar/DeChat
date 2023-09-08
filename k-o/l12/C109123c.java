package l12;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import j12.C108528a;
import l12.C109129g;

/* renamed from: l12.c */
public class C109123c implements C109129g.C109131b {

    /* renamed from: a */
    public C109129g f326757a = new C109129g();

    /* renamed from: b */
    public C108528a f326758b;

    /* renamed from: c */
    public boolean f326759c;

    /* renamed from: d */
    public C105420i2 f326760d;

    /* renamed from: e */
    public MMActivity f326761e;

    /* renamed from: f */
    public long f326762f = 0;

    /* renamed from: a */
    public void mo160363a(boolean z) {
        Log.m105925i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", Boolean.valueOf(z));
        MMActivity mMActivity = this.f326761e;
        if (mMActivity != null) {
            mMActivity.setScreenEnable(!z);
        }
        if (!C105385g.Fx0().mo150084b()) {
            return;
        }
        if (z) {
            this.f326758b.mo18028n(false);
            return;
        }
        C108528a aVar = this.f326758b;
        aVar.mo18028n(aVar.f324871p);
    }

    /* renamed from: b */
    public void mo160364b(boolean z) {
        this.f326758b.mo18028n(z);
    }

    /* renamed from: c */
    public void mo160365c() {
        C109124d dVar = this.f326758b.f324869n;
        if (dVar == null) {
            return;
        }
        if (dVar.f326765c) {
            Log.m105918d("MicroMsg.IPCallRecorder", "startRecorder, already start");
            return;
        }
        Log.m105924i("MicroMsg.IPCallRecorder", "start record");
        dVar.f326765c = true;
        synchronized (dVar.f326764b) {
            ThreadPool.post(new C109127e(dVar), "IPCallRecorder_startRecord");
        }
    }
}
