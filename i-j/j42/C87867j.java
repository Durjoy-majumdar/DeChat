package j42;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;

/* renamed from: j42.j */
public final class C87867j implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C87830a f254360a;

    public C87867j(C87830a aVar) {
        this.f254360a = aVar;
    }

    /* renamed from: a */
    public final void mo69211a(String str, String str2) {
        C87830a aVar = this.f254360a;
        C87412m.m108593f(str, StateEvent.Name.MESSAGE);
        if (str2 == null) {
            str2 = "";
        }
        aVar.mo121869O(str, str2, "JSEngine");
    }
}
