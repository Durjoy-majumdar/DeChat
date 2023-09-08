package p959ec;

import android.util.Log;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;
import p963fc.C86812g;

/* renamed from: ec.a */
public final class C86499a {
    /* renamed from: a */
    public static final RuntimeInfo m107251a(C86812g gVar) {
        C87412m.m108594g(gVar, "runtime");
        int i = gVar.mo113036W().f234811P;
        String str = gVar.f238147j;
        C87412m.m108593f(str, "runtime.appId");
        int i2 = gVar.f238149o.f239365g;
        boolean k = gVar.mo113036W().mo111300k();
        int i3 = gVar.mo113036W().f234841u + 1000;
        String str2 = gVar.mo113036W().f234838r;
        C87412m.m108593f(str2, "runtime.initConfig.wxaLaunchInstanceId");
        String str3 = gVar.mo113036W().f234839s;
        C87412m.m108593f(str3, "runtime.initConfig.username");
        AppBrandInitConfigLU l1 = gVar.mo113036W();
        C87412m.m108593f(l1, "runtime.initConfig");
        boolean z = gVar.mo113036W().f234812Q;
        String stackTraceString = BuildInfo.DEBUG ? Log.getStackTraceString(new Throwable()) : "debug use only";
        C87412m.m108593f(stackTraceString, "if (BuildInfo.DEBUG) {\n …debug use only\"\n        }");
        return new RuntimeInfo(i, str, i2, k, i3, str2, str3, l1, z, stackTraceString);
    }
}
