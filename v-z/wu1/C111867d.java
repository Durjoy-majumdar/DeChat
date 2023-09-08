package wu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.autogen.mmdata.rpt.FlutterVoIPP2PStruct;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoIPReportAgent$onLaunch$1", mo125469f = "FlutterVoIPReportAgent.kt", mo125470l = {49}, mo125471m = "invokeSuspend")
/* renamed from: wu1.d */
public final class C111867d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f334923d;

    /* renamed from: e */
    public int f334924e;

    public C111867d(C15601d<? super C111867d> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111867d(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C111867d((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        FlutterVoIPP2PStruct flutterVoIPP2PStruct;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f334924e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlutterVoIPP2PStruct flutterVoIPP2PStruct2 = C111864b.f334909b;
            C111864b bVar = C111864b.f334908a;
            this.f334923d = flutterVoIPP2PStruct2;
            this.f334924e = 1;
            Object g = C53895h.m60469g(C53872d1.f151119c, new C91115c((C15601d<? super C91115c>) null), this);
            if (g == aVar) {
                return aVar;
            }
            flutterVoIPP2PStruct = flutterVoIPP2PStruct2;
            obj = g;
        } else if (i == 1) {
            flutterVoIPP2PStruct = (FlutterVoIPP2PStruct) this.f334923d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        flutterVoIPP2PStruct.f310181i = ((Number) obj).longValue();
        return C13598b0.f38549a;
    }
}
