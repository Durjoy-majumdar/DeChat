package com.tencent.p014mm.plugin.component.editor.widget.voiceview;

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
import p371ph.C21967a;
import y21.C102797a;

/* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.a */
public class C93093a implements C76996p.C77000a, C76996p.C77001b, SensorController.SensorEventCallBack {

    /* renamed from: q */
    public static volatile C93093a f268206q;

    /* renamed from: d */
    public C76996p f268207d = ((C100323q) C86312j.m106911c(C100323q.class)).eh0();

    /* renamed from: e */
    public String f268208e;

    /* renamed from: f */
    public boolean f268209f = true;

    /* renamed from: g */
    public boolean f268210g;

    /* renamed from: h */
    public boolean f268211h = false;

    /* renamed from: i */
    public ShakeManager f268212i;

    /* renamed from: j */
    public long f268213j = -1;

    /* renamed from: n */
    public int f268214n;

    /* renamed from: o */
    public SensorController f268215o;

    /* renamed from: p */
    public List<C93094a> f268216p = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.a$a */
    public interface C93094a {
        /* renamed from: a */
        void mo127582a(String str);

        /* renamed from: b */
        void mo127583b(String str);

        /* renamed from: c */
        void mo127584c();

        /* renamed from: d */
        void mo127585d();
    }

    public C93093a() {
        Boolean bool = (Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE);
        this.f268210g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f268209f = booleanValue;
        C76996p pVar = this.f268207d;
        if (pVar != null) {
            ((C21967a) pVar).f62212m = this;
            ((C21967a) pVar).f62211l = this;
            ((C21967a) pVar).mo35066j(booleanValue);
        } else {
            Log.m105928w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
        }
        if (this.f268215o == null) {
            this.f268215o = new SensorController(MMApplicationContext.getContext());
        }
        if (this.f268212i == null) {
            this.f268212i = new ShakeManager(MMApplicationContext.getContext());
        }
    }

    /* renamed from: b */
    public static C93093a m117459b() {
        if (f268206q == null) {
            synchronized (C93093a.class) {
                if (f268206q == null) {
                    f268206q = new C93093a();
                }
            }
        }
        return f268206q;
    }

    /* renamed from: a */
    public void mo96016a() {
        Log.m105918d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
        mo127598e();
    }

    /* renamed from: c */
    public boolean mo127596c() {
        C76996p pVar = this.f268207d;
        if (pVar != null) {
            return ((C21967a) pVar).mo35058b();
        }
        Log.m105928w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
        return false;
    }

    /* renamed from: d */
    public boolean mo127597d(String str, int i) {
        C76996p pVar = this.f268207d;
        if (pVar == null) {
            Log.m105929w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, Integer.valueOf(i));
            return false;
        }
        ((C21967a) pVar).mo35070n(false);
        SensorController sensorController = this.f268215o;
        if (sensorController != null && !sensorController.hasRegistered()) {
            this.f268215o.setSensorCallBack(this);
            if (this.f268212i.startShake(new C102797a(this))) {
                this.f268213j = 0;
            } else {
                this.f268213j = -1;
            }
        }
        this.f268208e = str;
        this.f268214n = i;
        if (!Util.isNullOrNil(str)) {
            if (((C21967a) this.f268207d).mo35068l(str, this.f268209f, true, i)) {
                MMEntryLock.lock("keep_app_silent");
                for (C93094a next : this.f268216p) {
                    if (next != null) {
                        next.mo127583b(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo127598e() {
        Log.m105924i("MicroMsg.RecordVoiceHelper", "stop play");
        MMEntryLock.unlock("keep_app_silent");
        C76996p pVar = this.f268207d;
        if (pVar != null) {
            ((C21967a) pVar).mo35070n(false);
            for (C93094a next : this.f268216p) {
                if (next != null) {
                    next.mo127585d();
                }
            }
        }
        SensorController sensorController = this.f268215o;
        if (sensorController != null) {
            sensorController.removeSensorCallBack();
        }
        ShakeManager shakeManager = this.f268212i;
        if (shakeManager != null) {
            shakeManager.stopShake();
        }
    }

    public void onCompletion() {
        Log.m105918d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
        mo127598e();
    }

    public void onSensorEvent(boolean z) {
        if (!Util.isNullOrNil(this.f268208e)) {
            if (this.f268211h) {
                this.f268211h = !z;
                return;
            }
            if (!z) {
                long j = this.f268213j;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f268211h = true;
                    return;
                }
            }
            this.f268211h = false;
            C76996p pVar = this.f268207d;
            if (pVar != null) {
                pVar.getClass();
            }
            if (this.f268210g) {
                C76996p pVar2 = this.f268207d;
                if (pVar2 != null) {
                    ((C21967a) pVar2).mo35066j(false);
                }
                this.f268209f = false;
                return;
            }
            C76996p pVar3 = this.f268207d;
            if (pVar3 == null || ((C21967a) pVar3).mo35058b()) {
                C76996p pVar4 = this.f268207d;
                if (pVar4 != null) {
                    ((C21967a) pVar4).mo35066j(z);
                }
                this.f268209f = z;
                if (!z) {
                    mo127597d(this.f268208e, this.f268214n);
                    return;
                }
                return;
            }
            ((C21967a) this.f268207d).mo35066j(true);
            this.f268209f = true;
        }
    }
}
