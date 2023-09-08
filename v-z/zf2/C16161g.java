package zf2;

import ag2.C39602x0;
import cg2.C0501b;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: zf2.g */
public class C16161g implements C80883e<IPCVoid, IPCInteger>, C11385n {

    /* renamed from: d */
    public C1256g<IPCInteger> f43353d;

    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        this.f43353d = gVar;
        C86709a0.m107524d().mo123455a(12213, this);
        C86709a0.m107524d().mo123460f(new C0501b());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GetUnreadMailCountTask", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C86709a0.m107524d().mo123470p(12213, this);
        C1256g<IPCInteger> gVar = this.f43353d;
        if (gVar != null) {
            gVar.mo894a(new IPCInteger(((C39602x0) ((C0501b) yVar).f1224d.f127056b.f127083a).f106324d));
        }
    }
}
