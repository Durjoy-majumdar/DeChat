package sp0;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87583a;
import java.net.HttpURLConnection;
import java.util.HashMap;
import lu3.C88654b;
import p224ra.C89909e;
import sp0.C90291h;

/* renamed from: sp0.g */
public class C90289g extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C90298i f259184e;

    /* renamed from: f */
    public final /* synthetic */ C90291h.C90294c f259185f;

    /* renamed from: g */
    public final /* synthetic */ C90291h f259186g;

    public C90289g(C90291h hVar, C90298i iVar, C90291h.C90294c cVar) {
        this.f259186g = hVar;
        this.f259184e = iVar;
        this.f259185f = cVar;
    }

    public String getKey() {
        return "AppBrandNetworkRequest@" + this.f259184e.f259225j;
    }

    public void run() {
        C90298i iVar = this.f259184e;
        Log.m105921e("MicroMsg.AppBrandNetworkRequest", "call cronet time out taskid:%s,timeout:%d,url:%s", iVar.f259225j, Integer.valueOf(iVar.f259216a), this.f259184e.f259218c);
        C90298i iVar2 = this.f259184e;
        if (!iVar2.f259231p) {
            iVar2.f259231p = true;
            HashMap hashMap = new HashMap();
            hashMap.put("requestURL", this.f259184e.f259218c);
            this.f259186g.mo124509c(this.f259185f, "fail", "fail:time out", this.f259184e.f259225j, (HttpURLConnection) null, 5, hashMap);
        } else {
            Log.m105920e("MicroMsg.AppBrandNetworkRequest", "call cronet time out already callback");
        }
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(1095, 6, 1, false);
        if (!Util.isNullOrNil(this.f259184e.f259227l)) {
            CronetLogic.cancelCronetTask(this.f259184e.f259227l);
        }
    }
}
