package com.tencent.p014mm.plugin.appbrand.report;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/report/AppBrandLauncherDesktopReporter;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "onCreate", "onStop", "onResume", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter */
public final class AppBrandLauncherDesktopReporter implements C0124r {

    /* renamed from: d */
    public long f158155d;

    /* renamed from: e */
    public long f158156e;

    /* renamed from: f */
    public Set<Integer> f158157f = new LinkedHashSet();

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onCreate() {
        this.f158155d = System.currentTimeMillis();
        C115669n.INSTANCE.mo160131h(19468, 1, "", "", "", "", "", Long.valueOf(this.f158155d));
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        this.f158156e = System.currentTimeMillis();
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onStop() {
        long currentTimeMillis = System.currentTimeMillis() - this.f158156e;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(19468, 8, "", Long.valueOf(currentTimeMillis), "", "", Long.valueOf(this.f158155d));
        nVar.mo160131h(19468, 7, "", "", "", "", Integer.valueOf(this.f158157f.size()), Long.valueOf(this.f158155d));
        this.f158157f.clear();
    }
}
