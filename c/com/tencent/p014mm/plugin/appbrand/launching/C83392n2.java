package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n2 */
public final class C83392n2 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243659d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f243660e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83392n2(C83399o2 o2Var, List<String> list) {
        super(2);
        this.f243659d = o2Var;
        this.f243660e = list;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("emitParallelPkgDownloadTasks appId:");
        sb.append(this.f243659d.f243676d);
        sb.append(", versionType:");
        sb.append(this.f243659d.f243677e);
        sb.append(", moduleNames:");
        sb.append(this.f243660e);
        sb.append(", get error(");
        sb.append(intValue);
        sb.append(' ');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(')');
        Log.m105920e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb.toString());
        return C13598b0.f38549a;
    }
}
