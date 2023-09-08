package wx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import dx0.C31338h;
import g93.C32355a;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.C49948j6;
import te3.C50220l6;

/* renamed from: wx0.c */
public class C38340c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ int f101197d;

    /* renamed from: e */
    public final /* synthetic */ C49948j6 f101198e;

    public C38340c(int i, C49948j6 j6Var) {
        this.f101197d = i;
        this.f101198e = j6Var;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C50220l6 l6Var = (C50220l6) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && l6Var != null) {
            if (this.f101197d > 0) {
                C32355a.m39689a(57);
            }
            Log.m105925i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]url:%s", this.f101198e.f135877d);
            C32355a.m39689a(51);
        } else if (i2 == 50001) {
            int i3 = this.f101197d;
            if (i3 < 3) {
                C49948j6 j6Var = this.f101198e;
                LinkedList linkedList = new LinkedList();
                linkedList.add(j6Var);
                C89144l0.m111429e(C38342e.m41837a(linkedList, 0).mo72403a(), new C38340c(i3 + 1, j6Var), false);
            } else {
                C32355a.m39689a(52);
                C32355a.m39689a(59);
                if (C31338h.vx0().insert(new C38338a(this.f101198e))) {
                    Log.m105924i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
                } else {
                    Log.m105928w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
                }
            }
        } else {
            if (this.f101197d > 0) {
                C32355a.m39689a(58);
            }
            C32355a.m39689a(52);
            if (C31338h.vx0().insert(new C38338a(this.f101198e))) {
                Log.m105924i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
            } else {
                Log.m105928w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
            }
        }
        return 0;
    }
}
