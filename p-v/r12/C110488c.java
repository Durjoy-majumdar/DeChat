package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108824b;
import k12.C108828c;
import ob0.C117747y;
import p12.C47421h;

/* renamed from: r12.c */
public class C110488c extends C108824b {

    /* renamed from: i */
    public C47421h f330391i;

    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{824};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 5;
    }

    /* renamed from: g */
    public void mo85900g() {
    }

    /* renamed from: h */
    public void mo85901h() {
    }

    /* renamed from: i */
    public void mo85902i(C108828c cVar) {
        C108828c cVar2 = this.f173571e;
        if (cVar2 != null) {
            this.f330391i = new C47421h(cVar2.f325896a, cVar2.f325897b, cVar2.f325898c);
            C97625j3.m125815e().mo123460f(this.f330391i);
        }
    }

    /* renamed from: k */
    public int mo159929k() {
        return 50000;
    }

    /* renamed from: l */
    public boolean mo159930l() {
        return false;
    }

    /* renamed from: m */
    public void mo159931m(C117747y yVar) {
        Log.m105918d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopFailed");
    }

    /* renamed from: n */
    public void mo159932n(C117747y yVar) {
        Log.m105918d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopSuccess");
    }

    /* renamed from: o */
    public void mo159933o() {
        if (this.f330391i != null) {
            C97625j3.m125815e().mo123458d(this.f330391i);
        }
    }
}
