package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108828c;
import k12.C60939a;
import p12.C62186a;

/* renamed from: r12.a */
public class C110487a extends C60939a {
    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{843};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 3;
    }

    /* renamed from: g */
    public void mo85900g() {
    }

    /* renamed from: h */
    public void mo85901h() {
    }

    /* renamed from: i */
    public void mo85902i(C108828c cVar) {
        if (cVar != null) {
            Log.m105919d("MicroMsg.IPCallCancelService", "call cancel scene, roomId: %d, inviteId: %d", Integer.valueOf(cVar.f325896a), Integer.valueOf(cVar.f325899d));
            C97625j3.m125815e().mo123460f(new C62186a(cVar.f325896a, cVar.f325897b, cVar.f325891I, cVar.f325892J, cVar.f325899d, cVar.f325898c));
        }
    }
}
