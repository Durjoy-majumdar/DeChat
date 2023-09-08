package er1;

import com.tencent.p014mm.autogen.events.FinderIpcResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60216z4;
import rx3.C13604l;

/* renamed from: er1.y0 */
public final class C7924y0 extends IStaticListener<FinderIpcResultEvent> {

    /* renamed from: d */
    public static C60216z4.C8821a<Object> f26608d;

    public boolean callback(IEvent iEvent) {
        FinderIpcResultEvent finderIpcResultEvent = (FinderIpcResultEvent) iEvent;
        C87412m.m108594g(finderIpcResultEvent, "event");
        StringBuilder sb = new StringBuilder();
        sb.append("createResultEvent callback :");
        sb.append(finderIpcResultEvent.f9214d != null ? 0 : null);
        Log.m105924i("Finder.CreateAccountStarter", sb.toString());
        C60216z4.C8821a<Object> aVar = f26608d;
        if (aVar != null) {
            FinderIpcResultEvent.C1049a aVar2 = finderIpcResultEvent.f9214d;
            String str = aVar2 != null ? aVar2.f9215a : null;
            if (str == null) {
                str = "";
            }
            aVar.mo6382a(new C13604l(0, str));
        }
        f26608d = null;
        return true;
    }
}
