package pg0;

import a14.C53934p0;
import com.tencent.p014mm.autogen.events.WebViewUIDestroyEvent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import gy3.C87412m;
import og0.C11409c;
import og0.C47374b;
import wx3.C15601d;

/* renamed from: pg0.e */
public final class C11933e extends IStaticListener<WebViewUIDestroyEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((WebViewUIDestroyEvent) iEvent, "event");
        C11409c.C11410a aVar = C11409c.f33568d;
        if (aVar == null) {
            return false;
        }
        String str = aVar.f33571c;
        String str2 = str == null ? "" : str;
        String str3 = str == null ? "" : str;
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C47374b(0, "", str2, str3, "Destroy", (C15601d<? super C47374b>) null), 1, (Object) null);
        }
        C11409c.f33568d = null;
        return false;
    }
}
