package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.l2 */
public final class C83364l2 extends C87413o implements C32226l<List<? extends IPkgInfo>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243592d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f243593e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83364l2(C83399o2 o2Var, List<String> list) {
        super(1);
        this.f243592d = o2Var;
        this.f243593e = list;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((List) obj, "<anonymous parameter 0>");
        Log.m105924i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "emitParallelPkgDownloadTasks appId:" + this.f243592d.f243676d + ", versionType:" + this.f243592d.f243677e + ", moduleNames:" + this.f243593e + ", succeed");
        return C13598b0.f38549a;
    }
}
