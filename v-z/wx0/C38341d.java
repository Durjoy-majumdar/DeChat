package wx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import dx0.C31338h;
import g93.C32355a;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50220l6;

/* renamed from: wx0.d */
public class C38341d implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f101199d;

    /* renamed from: e */
    public final /* synthetic */ List f101200e;

    public C38341d(LinkedList linkedList, List list) {
        this.f101199d = linkedList;
        this.f101200e = list;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C50220l6 l6Var = (C50220l6) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && l6Var != null) {
            Log.m105925i("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d", Integer.valueOf(this.f101199d.size()));
            C32355a.m39689a(54);
            C31338h.vx0().mo61622Lo(this.f101200e);
        } else {
            Log.m105921e("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d fail", Integer.valueOf(this.f101199d.size()));
            C32355a.m39689a(55);
        }
        return 0;
    }
}
