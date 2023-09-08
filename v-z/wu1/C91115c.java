package wu1;

import a14.C0000n0;
import android.os.Debug;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoIPReportAgent$getPss$2", mo125469f = "FlutterVoIPReportAgent.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wu1.c */
public final class C91115c extends C91594j implements C32227p<C0000n0, C15601d<? super Long>, Object> {
    public C91115c(C15601d<? super C91115c> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C91115c(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C91115c((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return new Long((long) memoryInfo.getTotalPss());
    }
}
