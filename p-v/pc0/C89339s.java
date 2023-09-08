package pc0;

import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import lc3.C117474c;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import qe3.C89618a;
import qe3.C89631w;
import qe3.C89637y0;
import qe3.C89638z0;

/* renamed from: pc0.s */
public class C89339s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f257315d;

    /* renamed from: e */
    public final C114799u f257316e;

    /* renamed from: f */
    public WakerLock f257317f;

    /* renamed from: pc0.s$a */
    public static class C89340a extends C117746w {

        /* renamed from: a */
        public final C89637y0 f257318a = new C89637y0();

        /* renamed from: b */
        public final C89638z0 f257319b = new C89638z0();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f257318a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f257319b;
        }

        public int getType() {
            return 39;
        }

        public String getUri() {
            return null;
        }
    }

    public C89339s() {
        WakerLock wakerLock = new WakerLock(MMApplicationContext.getContext(), "MicroMsg.NetSceneSynCheck");
        this.f257317f = wakerLock;
        wakerLock.lock(3000, "NetSceneSynCheck");
        C89340a aVar = new C89340a();
        this.f257316e = aVar;
        C86709a0.m107528h();
        if (C86709a0.m107535s() != null) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() != null) {
                ((C89637y0) aVar.getReqObj()).f257858a = C118000d0.f352701a.mo182756a();
                C86709a0.m107528h();
                ((C89637y0) aVar.getReqObj()).f257861d = C86709a0.m107523b().mo121110g();
                ((C89637y0) aVar.getReqObj()).f257859b = C89618a.m112051a(MMApplicationContext.getContext());
                ((C89637y0) aVar.getReqObj()).f257860c = CrashReportFactory.foreground ? 1 : 2;
                Log.m105918d("MicroMsg.MMSyncCheck", "NetSceneSynCheck");
                return;
            }
        }
        Log.m105920e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f257315d = nVar;
        int dispatch = dispatch(gVar, this.f257316e, this);
        if (dispatch == -1 && this.f257317f.isLocking()) {
            this.f257317f.unLock();
        }
        return dispatch;
    }

    public long getReturnTimeout() {
        return 240000;
    }

    public int getType() {
        return 39;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C89638z0 z0Var = (C89638z0) uVar.getRespObj();
        Log.m105924i("MicroMsg.NetSceneSynCheck", "new syncCheck complete, selector=" + z0Var.f257866a);
        if (C86709a0.m107522a() && !C86718e.m107551r()) {
            byte[] bArr2 = ((C89637y0) uVar.getReqObj()).f257862e;
            if (Util.isNullOrNil(bArr2)) {
                Log.m105920e("MicroMsg.NetSceneSynCheck", "onGYNetEnd md5 is null");
            }
            z0Var.f257869d = bArr2;
            ((C117474c) C86312j.m106911c(C117474c.class)).yn0().mo182762f(z0Var.f257866a, 2, z0Var.mo123971a());
        }
        this.f257315d.onSceneEnd(i2, i3, str, this);
        this.f257317f.unLock();
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
