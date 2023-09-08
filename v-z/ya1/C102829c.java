package ya1;

import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderNearBy;
import com.tencent.p014mm.plugin.report.service.C5139t;
import di3.C86312j;
import p702ts.C78085c;

/* renamed from: ya1.c */
public class C102829c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExtControlProviderNearBy f303561d;

    public C102829c(ExtControlProviderNearBy extControlProviderNearBy) {
        this.f303561d = extControlProviderNearBy;
    }

    public void run() {
        ExtControlProviderNearBy extControlProviderNearBy = this.f303561d;
        if (extControlProviderNearBy.f269523q == null) {
            extControlProviderNearBy.f269523q = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        }
        ExtControlProviderNearBy extControlProviderNearBy2 = this.f303561d;
        extControlProviderNearBy2.f269523q.mo126409c(extControlProviderNearBy2.f269531y, true, false);
        C5139t.m5183e(22, 10);
    }
}
