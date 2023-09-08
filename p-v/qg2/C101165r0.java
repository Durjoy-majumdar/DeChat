package qg2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.List;
import ob0.C100323q;
import ob0.C76996p;
import p371ph.C21967a;
import pu0.C110248b;

/* renamed from: qg2.r0 */
public class C101165r0 implements C76996p.C77000a, C76996p.C77001b, SensorController.SensorEventCallBack {

    /* renamed from: p */
    public static SensorController f296102p;

    /* renamed from: d */
    public C76996p f296103d = ((C100323q) C86312j.m106911c(C100323q.class)).eh0();

    /* renamed from: e */
    public String f296104e;

    /* renamed from: f */
    public boolean f296105f = true;

    /* renamed from: g */
    public boolean f296106g;

    /* renamed from: h */
    public boolean f296107h = false;

    /* renamed from: i */
    public ShakeManager f296108i;

    /* renamed from: j */
    public long f296109j = -1;

    /* renamed from: n */
    public int f296110n;

    /* renamed from: o */
    public List<C101167b> f296111o = new LinkedList();

    /* renamed from: qg2.r0$a */
    public class C101166a implements Runnable {
        public C101166a() {
        }

        public void run() {
            C101165r0.this.f296109j = Util.currentTicks();
        }
    }

    /* renamed from: qg2.r0$b */
    public interface C101167b {
        /* renamed from: a */
        void mo129726a(String str);

        void onFinish();
    }

    public C101165r0() {
        Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(26, Boolean.FALSE);
        this.f296106g = bool.booleanValue();
        this.f296105f = true ^ bool.booleanValue();
        C76996p pVar = this.f296103d;
        if (pVar != null) {
            ((C21967a) pVar).f62212m = this;
            ((C21967a) pVar).f62211l = this;
            if (C110248b.zx0() || C110248b.Jh0()) {
                ((C21967a) this.f296103d).mo35066j(false);
            } else {
                ((C21967a) this.f296103d).mo35066j(this.f296105f);
            }
        } else {
            Log.m105928w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
        }
        if (f296102p == null) {
            f296102p = new SensorController(MMApplicationContext.getContext());
        }
        if (this.f296108i == null) {
            this.f296108i = new ShakeManager(MMApplicationContext.getContext());
        }
    }

    /* renamed from: a */
    public void mo96016a() {
        Log.m105918d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
        mo140612c();
        for (C101167b onFinish : this.f296111o) {
            onFinish.onFinish();
        }
    }

    /* renamed from: b */
    public boolean mo140611b(String str, int i) {
        C76996p pVar = this.f296103d;
        if (pVar == null) {
            Log.m105929w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, Integer.valueOf(i));
            return false;
        }
        ((C21967a) pVar).mo35070n(false);
        for (C101167b a : this.f296111o) {
            a.mo129726a(str);
        }
        SensorController sensorController = f296102p;
        if (sensorController != null && !sensorController.hasRegistered()) {
            f296102p.setSensorCallBack(this);
            if (this.f296108i.startShake(new C101166a())) {
                this.f296109j = 0;
            } else {
                this.f296109j = -1;
            }
        }
        this.f296104e = str;
        this.f296110n = i;
        if (!Util.isNullOrNil(str)) {
            if (((C21967a) this.f296103d).mo35068l(str, this.f296105f, true, i)) {
                MMEntryLock.lock("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo140612c() {
        Log.m105918d("MicroMsg.RecordVoiceHelper", "stop play");
        MMEntryLock.unlock("keep_app_silent");
        C76996p pVar = this.f296103d;
        if (pVar != null) {
            ((C21967a) pVar).mo35070n(false);
        }
        SensorController sensorController = f296102p;
        if (sensorController != null) {
            sensorController.removeSensorCallBack();
        }
        ShakeManager shakeManager = this.f296108i;
        if (shakeManager != null) {
            shakeManager.stopShake();
        }
    }

    public void onCompletion() {
        Log.m105918d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
        mo140612c();
        for (C101167b onFinish : this.f296111o) {
            onFinish.onFinish();
        }
    }

    public void onSensorEvent(boolean z) {
        if (!Util.isNullOrNil(this.f296104e)) {
            if (this.f296107h) {
                this.f296107h = !z;
                return;
            }
            if (!z) {
                long j = this.f296109j;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f296107h = true;
                    return;
                }
            }
            this.f296107h = false;
            C76996p pVar = this.f296103d;
            if (pVar != null) {
                pVar.getClass();
            }
            if (this.f296106g) {
                C76996p pVar2 = this.f296103d;
                if (pVar2 != null) {
                    ((C21967a) pVar2).mo35066j(false);
                }
                this.f296105f = false;
                return;
            }
            C76996p pVar3 = this.f296103d;
            if (pVar3 == null || ((C21967a) pVar3).mo35058b()) {
                C76996p pVar4 = this.f296103d;
                if (pVar4 != null) {
                    ((C21967a) pVar4).mo35066j(z);
                }
                this.f296105f = z;
                if (!z) {
                    mo140611b(this.f296104e, this.f296110n);
                    return;
                }
                return;
            }
            ((C21967a) this.f296103d).mo35066j(true);
            this.f296105f = true;
        }
    }
}
