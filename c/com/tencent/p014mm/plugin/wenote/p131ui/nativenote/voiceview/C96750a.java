package com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview;

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
import jb3.C98930a;
import ob0.C100323q;
import ob0.C76996p;
import p371ph.C21967a;
import pu0.C110248b;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a */
public class C96750a implements C76996p.C77000a, C76996p.C77001b, SensorController.SensorEventCallBack {

    /* renamed from: d */
    public String f283421d;

    /* renamed from: e */
    public boolean f283422e = true;

    /* renamed from: f */
    public boolean f283423f;

    /* renamed from: g */
    public boolean f283424g = false;

    /* renamed from: h */
    public ShakeManager f283425h;

    /* renamed from: i */
    public long f283426i = -1;

    /* renamed from: j */
    public int f283427j;

    /* renamed from: n */
    public SensorController f283428n;

    /* renamed from: o */
    public List<C96751a> f283429o = new LinkedList();

    /* renamed from: p */
    public C76996p f283430p;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a$a */
    public interface C96751a {
        /* renamed from: a */
        void mo135004a(String str);

        /* renamed from: b */
        void mo135005b(String str);

        /* renamed from: c */
        void mo135006c();

        /* renamed from: d */
        void mo135007d();
    }

    public C96750a() {
        if (this.f283428n == null) {
            this.f283428n = new SensorController(MMApplicationContext.getContext());
        }
        if (this.f283425h == null) {
            this.f283425h = new ShakeManager(MMApplicationContext.getContext());
        }
    }

    /* renamed from: a */
    public void mo96016a() {
        Log.m105918d("MicroMsg.NoteEditorVoiceHelper", "on error, do stop play");
        mo135024g();
    }

    /* renamed from: b */
    public void mo135019b(C96751a aVar) {
        if (aVar != null) {
            for (C96751a aVar2 : this.f283429o) {
                if (aVar == aVar2) {
                    return;
                }
            }
            ((LinkedList) this.f283429o).add(aVar);
        }
    }

    /* renamed from: c */
    public void mo135020c() {
        mo135024g();
        this.f283428n = null;
        this.f283425h = null;
        ((LinkedList) this.f283429o).clear();
        C76996p pVar = this.f283430p;
        if (pVar != null) {
            C21967a aVar = (C21967a) pVar;
            aVar.f62212m = null;
            aVar.f62211l = null;
            aVar.f62210k.getClass();
            C110248b.f329777h.mo161670o("music");
            this.f283430p = null;
        }
    }

    /* renamed from: d */
    public final C76996p mo135021d() {
        if (this.f283430p == null) {
            this.f283430p = ((C100323q) C86312j.m106911c(C100323q.class)).eh0();
            Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(26, Boolean.FALSE);
            this.f283423f = bool.booleanValue();
            boolean z = !bool.booleanValue();
            this.f283422e = z;
            C76996p pVar = this.f283430p;
            if (pVar != null) {
                ((C21967a) pVar).f62212m = this;
                ((C21967a) pVar).f62211l = this;
                ((C21967a) pVar).mo35066j(z);
            } else {
                Log.m105928w("MicroMsg.NoteEditorVoiceHelper", "get voice player fail, it is null");
            }
        }
        return this.f283430p;
    }

    /* renamed from: e */
    public boolean mo135022e() {
        return this.f283430p != null && ((C21967a) mo135021d()).mo35058b();
    }

    /* renamed from: f */
    public boolean mo135023f(String str, int i) {
        ((C21967a) mo135021d()).mo35070n(false);
        SensorController sensorController = this.f283428n;
        if (sensorController != null && !sensorController.hasRegistered()) {
            this.f283428n.setSensorCallBack(this);
            if (this.f283425h.startShake(new C98930a(this))) {
                this.f283426i = 0;
            } else {
                this.f283426i = -1;
            }
        }
        this.f283421d = str;
        this.f283427j = i;
        if (!Util.isNullOrNil(str)) {
            if (((C21967a) mo135021d()).mo35068l(str, this.f283422e, true, i)) {
                MMEntryLock.lock("keep_app_silent");
                for (C96751a next : this.f283429o) {
                    if (next != null) {
                        next.mo135005b(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo135024g() {
        Log.m105924i("MicroMsg.NoteEditorVoiceHelper", "stop play");
        MMEntryLock.unlock("keep_app_silent");
        if (this.f283430p != null) {
            ((C21967a) mo135021d()).mo35070n(false);
        }
        for (C96751a next : this.f283429o) {
            if (next != null) {
                next.mo135007d();
            }
        }
        SensorController sensorController = this.f283428n;
        if (sensorController != null) {
            sensorController.removeSensorCallBack();
        }
        ShakeManager shakeManager = this.f283425h;
        if (shakeManager != null) {
            shakeManager.stopShake();
        }
    }

    public void onCompletion() {
        Log.m105918d("MicroMsg.NoteEditorVoiceHelper", "on completion, do stop play");
        if (this.f283430p != null) {
            mo135024g();
        }
    }

    public void onSensorEvent(boolean z) {
        if (!Util.isNullOrNil(this.f283421d)) {
            if (this.f283424g) {
                this.f283424g = !z;
                return;
            }
            if (!z) {
                long j = this.f283426i;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f283424g = true;
                    return;
                }
            }
            this.f283424g = false;
            C76996p pVar = this.f283430p;
            if (pVar != null) {
                pVar.getClass();
            }
            mo135021d().getClass();
            if (this.f283423f) {
                ((C21967a) mo135021d()).mo35066j(false);
                this.f283422e = false;
            } else if (!((C21967a) mo135021d()).mo35058b()) {
                ((C21967a) mo135021d()).mo35066j(true);
                this.f283422e = true;
            } else {
                ((C21967a) mo135021d()).mo35066j(z);
                this.f283422e = z;
                if (!z) {
                    mo135023f(this.f283421d, this.f283427j);
                }
            }
        }
    }
}
