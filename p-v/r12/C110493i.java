package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108824b;
import k12.C108828c;
import ob0.C117747y;
import p12.C62188o;

/* renamed from: r12.i */
public class C110493i extends C108824b {

    /* renamed from: i */
    public C62188o f330394i = null;

    /* renamed from: j */
    public int f330395j = 0;

    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{819};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 2;
    }

    /* renamed from: g */
    public void mo85900g() {
    }

    /* renamed from: h */
    public void mo85901h() {
    }

    /* renamed from: i */
    public void mo85902i(C108828c cVar) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (cVar != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.IPCallSyncService", "serviceImpl, info==null: %b", objArr);
        C108828c cVar2 = this.f173571e;
        if (cVar2 != null) {
            this.f330395j = cVar2.f325909n;
            this.f330394i = new C62188o(cVar2.f325896a, cVar2.f325897b, cVar2.mo159938b(), this.f173571e.f325898c, false);
            C97625j3.m125815e().mo123460f(this.f330394i);
        }
    }

    /* renamed from: k */
    public int mo159929k() {
        return this.f330395j;
    }

    /* renamed from: l */
    public boolean mo159930l() {
        return false;
    }

    /* renamed from: m */
    public void mo159931m(C117747y yVar) {
        Log.m105918d("MicroMsg.IPCallSyncService", "onLoopFailed");
    }

    /* renamed from: n */
    public void mo159932n(C117747y yVar) {
        Log.m105918d("MicroMsg.IPCallSyncService", "onLoopSuccess");
    }

    /* renamed from: o */
    public void mo159933o() {
        if (this.f330394i != null) {
            C97625j3.m125815e().mo123458d(this.f330394i);
        }
    }
}
