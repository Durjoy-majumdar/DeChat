package pb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C100323q;
import ob0.C76996p;
import p272xq.C102714j;
import p371ph.C21967a;
import p492dn.C45426j;

/* renamed from: pb1.i0 */
public class C100715i0 implements C76996p.C77000a, C76996p.C77001b, SensorController.SensorEventCallBack {

    /* renamed from: p */
    public static SensorController f295077p;

    /* renamed from: d */
    public C76996p f295078d = ((C100323q) C86312j.m106911c(C100323q.class)).eh0();

    /* renamed from: e */
    public String f295079e;

    /* renamed from: f */
    public boolean f295080f = true;

    /* renamed from: g */
    public boolean f295081g;

    /* renamed from: h */
    public boolean f295082h = false;

    /* renamed from: i */
    public ShakeManager f295083i;

    /* renamed from: j */
    public long f295084j = -1;

    /* renamed from: n */
    public int f295085n;

    /* renamed from: o */
    public List<C102714j> f295086o = new LinkedList();

    /* renamed from: pb1.i0$a */
    public class C100716a implements Runnable {
        public C100716a() {
        }

        public void run() {
            C100715i0.this.f295084j = Util.currentTicks();
        }
    }

    public C100715i0() {
        Boolean bool = (Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE);
        this.f295081g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f295080f = booleanValue;
        C76996p pVar = this.f295078d;
        if (pVar != null) {
            ((C21967a) pVar).f62212m = this;
            ((C21967a) pVar).f62211l = this;
            ((C21967a) pVar).mo35066j(booleanValue);
        } else {
            Log.m105928w("MicroMsg.FavVoiceLogic", "get voice player fail, it is null");
        }
        if (f295077p == null) {
            f295077p = new SensorController(MMApplicationContext.getContext());
        }
        if (this.f295083i == null) {
            this.f295083i = new ShakeManager(MMApplicationContext.getContext());
        }
    }

    /* renamed from: a */
    public void mo96016a() {
        Log.m105918d("MicroMsg.FavVoiceLogic", "on error, do stop play");
        mo140152g();
        for (C102714j onFinish : this.f295086o) {
            onFinish.onFinish();
        }
    }

    /* renamed from: b */
    public void mo140147b(C102714j jVar) {
        for (C102714j jVar2 : this.f295086o) {
            if (jVar == jVar2) {
                return;
            }
        }
        ((LinkedList) this.f295086o).add(jVar);
    }

    /* renamed from: c */
    public boolean mo140148c() {
        C76996p pVar = this.f295078d;
        if (pVar != null) {
            return ((C21967a) pVar).mo35058b();
        }
        Log.m105928w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
        return false;
    }

    /* renamed from: d */
    public void mo140149d() {
        C76996p pVar = this.f295078d;
        if (pVar == null) {
            Log.m105928w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
            return;
        }
        if (((C21967a) pVar).mo35058b()) {
            mo140150e();
        }
        for (C102714j onPause : this.f295086o) {
            onPause.onPause();
        }
    }

    /* renamed from: e */
    public boolean mo140150e() {
        Log.m105924i("MicroMsg.FavVoiceLogic", "pause play");
        MMEntryLock.unlock("keep_app_silent");
        C76996p pVar = this.f295078d;
        if (pVar != null) {
            return ((C21967a) pVar).mo35059c(true);
        }
        Log.m105928w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
        return false;
    }

    /* renamed from: f */
    public boolean mo140151f(String str, int i) {
        C76996p pVar = this.f295078d;
        if (pVar == null) {
            Log.m105929w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", str, Integer.valueOf(i));
            return false;
        }
        ((C21967a) pVar).mo35070n(false);
        for (C102714j a : this.f295086o) {
            a.mo128239a(str, 0);
        }
        SensorController sensorController = f295077p;
        if (sensorController != null && !sensorController.hasRegistered()) {
            f295077p.setSensorCallBack(this);
            if (this.f295083i.startShake(new C100716a())) {
                this.f295084j = 0;
            } else {
                this.f295084j = -1;
            }
        }
        this.f295079e = str;
        this.f295085n = i;
        if (!Util.isNullOrNil(str)) {
            if (((C21967a) this.f295078d).mo35068l(str, this.f295080f, true, i)) {
                MMEntryLock.lock("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo140152g() {
        Log.m105918d("MicroMsg.FavVoiceLogic", "stop play");
        MMEntryLock.unlock("keep_app_silent");
        C76996p pVar = this.f295078d;
        if (pVar != null) {
            ((C21967a) pVar).mo35070n(false);
        }
        SensorController sensorController = f295077p;
        if (sensorController != null) {
            sensorController.removeSensorCallBack();
        }
        ShakeManager shakeManager = this.f295083i;
        if (shakeManager != null) {
            shakeManager.stopShake();
        }
    }

    public void onCompletion() {
        Log.m105918d("MicroMsg.FavVoiceLogic", "on completion, do stop play");
        mo140152g();
        for (C102714j onFinish : this.f295086o) {
            onFinish.onFinish();
        }
    }

    public void onSensorEvent(boolean z) {
        Class cls = C45426j.class;
        if (!Util.isNullOrNil(this.f295079e)) {
            if (this.f295082h) {
                this.f295082h = !z;
                return;
            }
            if (!z) {
                long j = this.f295084j;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f295082h = true;
                    return;
                }
            }
            this.f295082h = false;
            C76996p pVar = this.f295078d;
            if (pVar != null) {
                pVar.getClass();
            }
            if (this.f295081g) {
                C76996p pVar2 = this.f295078d;
                if (pVar2 != null) {
                    ((C21967a) pVar2).mo35066j(false);
                }
                ((C45426j) C86312j.m106911c(cls)).n40().mo18028n(false);
                this.f295080f = false;
                return;
            }
            C76996p pVar3 = this.f295078d;
            if (pVar3 != null && !((C21967a) pVar3).mo35058b()) {
                ((C21967a) this.f295078d).mo35066j(true);
                this.f295080f = true;
            } else if (((C45426j) C86312j.m106911c(cls)).Jh0()) {
                Log.m105918d("MicroMsg.FavVoiceLogic", "onSensorEvent, connecting bluetooth, omit sensor event");
            } else {
                C76996p pVar4 = this.f295078d;
                if (pVar4 != null) {
                    ((C21967a) pVar4).mo35066j(z);
                }
                this.f295080f = z;
                if (!z) {
                    mo140151f(this.f295079e, this.f295085n);
                }
            }
        }
    }
}
