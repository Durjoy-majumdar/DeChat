package l12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import m12.C109470c;
import p375qh.C110390f;

/* renamed from: l12.d */
public class C109124d {

    /* renamed from: a */
    public C110390f f326763a = null;

    /* renamed from: b */
    public final Object f326764b = new Object();

    /* renamed from: c */
    public boolean f326765c = false;

    /* renamed from: d */
    public boolean f326766d = false;

    /* renamed from: e */
    public boolean f326767e = true;

    /* renamed from: f */
    public C110390f.C89659b f326768f = new C109125a();

    /* renamed from: l12.d$a */
    public class C109125a implements C110390f.C89659b {
        public C109125a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            synchronized (C109124d.this.f326764b) {
                if (C105385g.Fx0().f313245a == 5) {
                    if (C109124d.this.f326767e) {
                        Log.m105924i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
                        C109124d.this.f326767e = false;
                    }
                    C105385g.zx0().f327640a.recordCallback(bArr, i);
                }
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }
    }

    /* renamed from: l12.d$b */
    public class C109126b implements Runnable {

        /* renamed from: d */
        public C110390f f326770d;

        public C109126b(C109124d dVar, C110390f fVar) {
            this.f326770d = fVar;
        }

        public void run() {
            Log.m105918d("MicroMsg.IPCallRecorder", "do stopRecord");
            C110390f fVar = this.f326770d;
            if (fVar != null) {
                fVar.mo161907l();
                this.f326770d = null;
            }
        }
    }

    /* renamed from: a */
    public static void m148167a(C109124d dVar) {
        dVar.getClass();
        C110390f fVar = new C110390f(v2protocal.f317532S1, 1, 6);
        dVar.f326763a = fVar;
        fVar.mo161902g(20);
        dVar.f326763a.mo161905j(true);
        dVar.f326763a.mo161901f(true);
        C110390f fVar2 = dVar.f326763a;
        fVar2.f330234m = -19;
        fVar2.mo161903h(1, false);
        dVar.f326763a.mo161904i(true);
        C110390f fVar3 = dVar.f326763a;
        fVar3.f330245x = dVar.f326768f;
        if (!fVar3.mo161906k()) {
            Log.m105920e("MicroMsg.IPCallRecorder", "start record failed");
            if (dVar.f326763a.f330222a != 13) {
                C109470c Dx0 = C105385g.Dx0();
                if (Dx0.f327651F == 0) {
                    Dx0.f327651F = 1;
                    return;
                }
                return;
            }
            return;
        }
        dVar.f326763a.mo161909n(dVar.f326766d);
    }

    /* renamed from: b */
    public void mo160366b(boolean z) {
        C110390f fVar;
        Log.m105925i("MicroMsg.IPCallRecorder", "setMute: %b", Boolean.valueOf(z));
        if (this.f326765c && (fVar = this.f326763a) != null) {
            fVar.mo161909n(z);
        }
        this.f326766d = z;
    }
}
