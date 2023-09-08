package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Iterator;
import p270xi.C66282i;
import p270xi.C78839k;

/* renamed from: com.tencent.mm.ui.chatting.component.k0 */
public class C73510k0 implements C66282i, C78839k {

    /* renamed from: d */
    public HashSet<C78839k> f215951d = new HashSet<>();

    /* renamed from: F4 */
    public void mo26186F4() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo26186F4();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingResume] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingResume]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo26160G4();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingPause] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingPause]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo26162O4();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: e */
    public void mo70065e() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo70065e();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingInit] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingInit]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo70046g5();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: j4 */
    public void mo90405j4(C78839k kVar) {
        if (!this.f215951d.contains(kVar)) {
            this.f215951d.add(kVar);
        }
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo26199n2();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new HashSet(this.f215951d).iterator();
        while (it.hasNext()) {
            C78839k kVar = (C78839k) it.next();
            long currentTimeMillis2 = System.currentTimeMillis();
            kVar.mo26170u5();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (Log.getLogLevel() == 0) {
                Log.m105927v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart] listener:%s cost:%sms", kVar.getClass().getSimpleName(), Long.valueOf(currentTimeMillis3));
            }
        }
        Log.m105925i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart]cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: z0 */
    public void mo90406z0(C78839k kVar) {
        this.f215951d.remove(kVar);
    }
}
