package ev1;

import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82876d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import fv1.C32183a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C48750aq1;
import te3.C49335eu3;
import te3.C51904x02;
import te3.C52048y02;

/* renamed from: ev1.d */
public final class C31725d extends C89132b<C52048y02> {

    /* renamed from: i */
    public final String f84712i = "MicroMsg.CgiGetForceNotifyInfoList";

    public C31725d() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51904x02();
        bVar.f127067b = new C52048y02();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getforcepush";
        bVar.f127069d = C82876d0.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52048y02 y022 = (C52048y02) eu32;
        C87412m.m108594g(y022, "resp");
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f84712i, "account nor ready");
            return;
        }
        Log.m105925i(this.f84712i, "CgiGetForceNotifyInfoList errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            LinkedList<C48750aq1> linkedList = y022.f145064d;
            if (linkedList != null) {
                Iterator<C48750aq1> it = linkedList.iterator();
                while (it.hasNext()) {
                    C48750aq1 next = it.next();
                    C31726h hVar = new C31726h();
                    hVar.field_UserName = next.f130728i;
                    hVar.field_ExpiredTime = ((long) next.f130725f) * 1000;
                    hVar.field_CreateTime = ((long) next.f130724e) * 1000;
                    hVar.field_Status = (C31543z5.m39453c() > hVar.field_ExpiredTime ? 1 : (C31543z5.m39453c() == hVar.field_ExpiredTime ? 0 : -1)) >= 0 ? 0 : 1;
                    hVar.field_ExtInfo = next.f130729j;
                    hVar.field_Description = next.f130726g;
                    hVar.field_UserIcon = next.f130727h;
                    hVar.field_ForcePushId = next.f130723d;
                    Log.m105925i(this.f84712i, "ret:%s item:%s", Boolean.valueOf(C32183a.f85554d.replace(hVar)), hVar);
                }
                return;
            }
            return;
        }
        Log.m105920e(this.f84712i, "report fail");
    }
}
