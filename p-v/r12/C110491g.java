package r12;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import k12.C108828c;
import k12.C60939a;
import p12.C110104l;

/* renamed from: r12.g */
public class C110491g extends C60939a {
    /* renamed from: d */
    public int[] mo85897d() {
        return new int[]{227};
    }

    /* renamed from: e */
    public int mo85898e() {
        return 7;
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
            C97625j3.m125815e().mo123460f(new C110104l(cVar.f325896a, cVar.f325898c, cVar.f325895M));
            Log.m105925i("MicroMsg.IPCallReportService", "start report, roomid: %d, callseq: %d, isAccept: %b", Integer.valueOf(cVar.f325896a), Long.valueOf(cVar.f325898c), Boolean.valueOf(cVar.f325895M));
        }
    }
}
