package tz2;

import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import uz2.C78317u1;
import vz2.C78501d;

/* renamed from: tz2.b */
public final class C78115b implements C11385n {

    /* renamed from: d */
    public final C78317u1 f228924d;

    /* renamed from: e */
    public long f228925e;

    public C78115b(C78317u1 u1Var) {
        C87412m.m108594g(u1Var, "postInfo");
        this.f228924d = u1Var;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.TextStatus.PostTask", "[doPost] end cost:" + (System.currentTimeMillis() - this.f228925e) + ",errType" + i + ",errCode" + i2);
        C86709a0.m107524d().mo123470p(5293, this);
        if (i != 0 || i2 != 0) {
            C78120g gVar = C78120g.f228929a;
            C78317u1 u1Var = this.f228924d;
            C87412m.m108594g(u1Var, "postInfo");
            Log.m105924i("MicroMsg.TextStatus.UploadManager", "makeCgiFail " + u1Var.f229455n + ' ' + str + ' ' + u1Var.f229453i + "  " + u1Var.f229454j);
            if (Util.isNullOrNil(str)) {
                u1Var.f229454j++;
                gVar.mo108103c(u1Var);
                C78501d.m94804e(C78501d.f229945a, u1Var.f229458q, 2L, (String) null, (String) null, 12, (Object) null);
                C78120g.f228930b.sendEmptyMessage(0);
                return;
            }
            u1Var.f229457p = str;
            gVar.mo108103c(u1Var);
            C39674e.f106452d.mo62252j1(Long.valueOf(u1Var.f229455n), 6);
            C78501d.m94804e(C78501d.f229945a, u1Var.f229458q, 5L, (String) null, (String) null, 12, (Object) null);
        }
    }
}
