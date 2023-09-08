package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108828c;
import k12.C60939a;
import p12.C47424n;

/* renamed from: r12.h */
public class C110492h extends C60939a {

    /* renamed from: f */
    public int f330392f = 1;

    /* renamed from: g */
    public boolean f330393g = false;

    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{723};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 4;
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
            Log.m105919d("MicroMsg.IPCallShutDownService", "call shutdown scene, roomId: %d, inviteId: %d", Integer.valueOf(cVar.f325896a), Integer.valueOf(cVar.f325899d));
            C97625j3.m125815e().mo123460f(new C47424n(cVar.f325896a, cVar.f325897b, cVar.f325898c, this.f330392f));
        }
    }
}
