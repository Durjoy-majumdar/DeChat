package sa0;

import a14.C0000n0;
import com.tencent.maas.model.time.MJTime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.MaasApi;
import fy3.C32227p;
import gy3.C87412m;
import ha0.C108183c0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasSdkApiFlutterPlugin$startPlay$1", mo125469f = "MaasSdkApiFlutterPlugin.kt", mo125470l = {210}, mo125471m = "invokeSuspend")
/* renamed from: sa0.b */
public final class C63737b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180682d;

    /* renamed from: e */
    public /* synthetic */ Object f180683e;

    /* renamed from: f */
    public final /* synthetic */ C63725a f180684f;

    /* renamed from: g */
    public final /* synthetic */ long f180685g;

    /* renamed from: h */
    public final /* synthetic */ MaasApi.Result<Boolean> f180686h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63737b(C63725a aVar, long j, MaasApi.Result<Boolean> result, C15601d<? super C63737b> dVar) {
        super(2, dVar);
        this.f180684f = aVar;
        this.f180685g = j;
        this.f180686h = result;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63737b bVar = new C63737b(this.f180684f, this.f180685g, this.f180686h, dVar);
        bVar.f180683e = obj;
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63737b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180682d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f180683e;
            C108183c0 c0Var = this.f180684f.f180644g;
            if (c0Var == null) {
                MaasApi.Result<Boolean> result = this.f180686h;
                Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: movieSessionManager is null");
                result.success(Boolean.FALSE);
                return C13598b0.f38549a;
            }
            MJTime fromMilliseconds = MJTime.fromMilliseconds(this.f180685g);
            C87412m.m108593f(fromMilliseconds, "fromMilliseconds(timeInMil)");
            this.f180682d = 1;
            obj = c0Var.mo158620i(fromMilliseconds, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: ret " + booleanValue);
        this.f180686h.success(Boolean.valueOf(booleanValue));
        return C13598b0.f38549a;
    }
}
