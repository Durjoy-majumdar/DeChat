package ny0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentSkipListSet;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C36907w;
import te3.C51296st1;
import te3.C51444tt1;
import te3.C51737vt1;

/* renamed from: ny0.d */
public final class C47310d implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C47306a f126980a;

    /* renamed from: b */
    public final /* synthetic */ C51444tt1 f126981b;

    public C47310d(C47306a aVar, C51444tt1 tt12) {
        this.f126980a = aVar;
        this.f126981b = tt12;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C47306a aVar = this.f126980a;
        if (aVar != null) {
            C51444tt1 tt12 = this.f126981b;
            C47465a aVar2 = cVar.f127056b.f127083a;
            aVar.mo63630a(tt12, i, i2, str, aVar2 instanceof C51737vt1 ? (C51737vt1) aVar2 : null);
        }
        try {
            ConcurrentSkipListSet<String> concurrentSkipListSet = C47307b.f126968c;
            LinkedList<C51296st1> linkedList = this.f126981b.f142403n;
            C87412m.m108593f(linkedList, "req.ReqInfo");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C51296st1 st12 : linkedList) {
                arrayList.add(st12.f141739e);
            }
            concurrentSkipListSet.removeAll(arrayList);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebPrefetcherPreAuther", "[TRACE_PREFETCH-preAuth] Concurrent Remove Exception: " + e.getMessage());
        }
    }
}
