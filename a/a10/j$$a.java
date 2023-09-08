package a10;

import com.tencent.pigeon.FlutterMemoryPigeon;
import fy3.C32224a;
import gy3.C87412m;

public final /* synthetic */ class j$$a implements FlutterMemoryPigeon.FlutterMemoryHost.Reply {

    /* renamed from: a */
    public final /* synthetic */ C32224a f337495a;

    public /* synthetic */ j$$a(C32224a aVar) {
        this.f337495a = aVar;
    }

    public final void reply(Object obj) {
        C32224a aVar = this.f337495a;
        Void voidR = (Void) obj;
        C87412m.m108594g(aVar, "$callback");
        aVar.invoke();
    }
}
