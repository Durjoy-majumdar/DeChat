package ue1;

import com.tencent.xweb.WCWebUpdater;
import java.util.Map;
import ob0.C35136m;

/* renamed from: ue1.s */
public final class C37448s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C65328r f98970d;

    /* renamed from: e */
    public final /* synthetic */ String f98971e;

    /* renamed from: f */
    public final /* synthetic */ Map<String, String> f98972f;

    /* renamed from: g */
    public final /* synthetic */ C35136m.C35137a f98973g;

    public C37448s(C65328r rVar, String str, Map<String, String> map, C35136m.C35137a aVar) {
        this.f98970d = rVar;
        this.f98971e = str;
        this.f98972f = map;
        this.f98973g = aVar;
    }

    public final void run() {
        this.f98970d.mo89435m(this.f98971e, this.f98972f, this.f98973g, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
    }
}
