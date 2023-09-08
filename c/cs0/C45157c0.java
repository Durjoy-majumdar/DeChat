package cs0;

import a14.C0000n0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.v75;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.revoke.UserInfoRevokeViewModel$1", mo125469f = "UserInfoRevokeViewModel.kt", mo125470l = {54}, mo125471m = "invokeSuspend")
/* renamed from: cs0.c0 */
public final class C45157c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f122439d;

    /* renamed from: e */
    public int f122440e;

    /* renamed from: f */
    public final /* synthetic */ C45164f0 f122441f;

    /* renamed from: g */
    public final /* synthetic */ String f122442g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45157c0(C45164f0 f0Var, String str, C15601d<? super C45157c0> dVar) {
        super(2, dVar);
        this.f122441f = f0Var;
        this.f122442g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C45157c0(this.f122441f, this.f122442g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C45157c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C54219z<v75> zVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f122440e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54219z<v75> zVar2 = this.f122441f.f122460e;
            C45152a0 a0Var = C45152a0.f122426a;
            String str = this.f122442g;
            this.f122439d = zVar2;
            this.f122440e = 1;
            Object a = a0Var.mo70656a(str, this);
            if (a == aVar) {
                return aVar;
            }
            zVar = zVar2;
            obj = a;
        } else if (i == 1) {
            zVar = (C54219z) this.f122439d;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "<init>, getUsageInfo fail since " + e);
                this.f122441f.f122459d.finish();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zVar.setValue(obj);
        return C13598b0.f38549a;
    }
}
