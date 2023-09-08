package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108828c;
import k12.C60939a;
import p12.C62187i;

/* renamed from: r12.d */
public class C110489d extends C60939a {
    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{991};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 1;
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
            if (cVar.f325899d == 0) {
                cVar.f325899d = (int) System.currentTimeMillis();
            }
            C97625j3.m125815e().mo123460f(new C62187i(cVar.f325891I, cVar.f325892J, cVar.f325899d, cVar.f325900e, cVar.f325901f));
            Log.m105919d("MicroMsg.IPCallInviteService", "start invite, toUsername: %s, toPhoneNumber: %s, inviteid: %d", cVar.f325891I, cVar.f325892J, Integer.valueOf(cVar.f325899d));
        }
    }
}
