package k11;

import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import sx3.C110826x0;

/* renamed from: k11.q */
public final class C88070q {

    /* renamed from: a */
    public static final Integer[][] f254721a = {new Integer[]{0, 2, 3, 10, 11}, new Integer[]{4}, new Integer[]{5}, new Integer[]{6}, new Integer[]{7}, new Integer[]{8}, new Integer[]{9}, new Integer[]{15}};

    /* renamed from: b */
    public static final boolean[] f254722b = {false, false, false, true, false, false, false, false};

    /* renamed from: c */
    public static final Set<String> f254723c = C110826x0.m151017e("wxaFlattenFileSystem", "wxaNonFlattenFileSystem", "WxaJsCodeCache", "WxaSnapshotJsCodeCache", "WxaWASMCache", "appBrandXnetModelCache", "WxaCodePkgsCache", "WxaCodePkgsCacheGlobal");

    /* renamed from: a */
    public static final long m109643a(C81427p pVar) {
        return (((long) pVar.f238965a.hashCode()) & Util.MAX_32BIT_VALUE) | ((Util.MAX_32BIT_VALUE & ((long) ((pVar.f238967c.hashCode() ^ pVar.f238966b.hashCode()) & Integer.MAX_VALUE))) << 32);
    }

    /* renamed from: b */
    public static final void m109644b() {
        AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
        Iterator it = ((ArrayList) a.mo111386a()).iterator();
        while (it.hasNext()) {
            C80254f.m97662v(a, ((C80264l) it.next()).f234965a, 0, false, 6, (Object) null);
        }
    }
}
