package d93;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import pe3.C47465a;
import te3.C52018xt1;

/* renamed from: d93.d */
public class C45299d implements C40324j.C40326a {

    /* renamed from: a */
    public boolean f122718a = false;

    /* renamed from: b */
    public final /* synthetic */ String f122719b;

    /* renamed from: c */
    public final /* synthetic */ int f122720c;

    /* renamed from: d */
    public final /* synthetic */ C45297a f122721d;

    /* renamed from: e */
    public final /* synthetic */ C45298c f122722e;

    public C45299d(C45298c cVar, String str, int i, C45297a aVar) {
        this.f122722e = cVar;
        this.f122719b = str;
        this.f122720c = i;
        this.f122721d = aVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        if (this.f122718a) {
            Log.m105920e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key callbackCalled");
            C115669n.INSTANCE.idkeyStat(1653, 13, 1, false);
            return;
        }
        this.f122718a = true;
        Log.m105925i("MicroMsg.LuggageGetA8Key", "ipcGetA8Key errType:%d, errCode:%d, errMsg:%s, destroyCalled:%b", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(this.f122722e.f122697n));
        this.f122722e.f122684a.remove(this.f122719b);
        C47465a aVar = cVar.f127056b.f127083a;
        if (aVar instanceof C52018xt1) {
            C45298c.m50182a(this.f122722e, this.f122719b, this.f122720c, i, i2, str, (C52018xt1) aVar, this.f122721d);
            return;
        }
        C45298c.m50182a(this.f122722e, this.f122719b, this.f122720c, i, i2, str, (C52018xt1) null, this.f122721d);
        Log.m105920e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key call back resp is null");
    }
}
