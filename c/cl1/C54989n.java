package cl1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fi1.C59098d;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p823sg.C90193h;
import rx3.C13598b0;
import te3.C64740tw0;
import te3.C64784vv;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveCheerAnimationSlice$checkPreload$1", mo125469f = "LiveCheerAnimationSlice.kt", mo125470l = {111}, mo125471m = "invokeSuspend")
/* renamed from: cl1.n */
public final class C54989n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f154173d;

    /* renamed from: e */
    public final /* synthetic */ C64740tw0 f154174e;

    /* renamed from: f */
    public final /* synthetic */ C54985m f154175f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54989n(C64740tw0 tw02, C54985m mVar, C15601d<? super C54989n> dVar) {
        super(2, dVar);
        this.f154174e = tw02;
        this.f154175f = mVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54989n(this.f154174e, this.f154175f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54989n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f154173d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C64784vv vvVar = this.f154174e.f185689h;
            String c3 = this.f154175f.mo75949c3(vvVar);
            if ((c3 == null || c3.length() == 0) || vvVar == null) {
                Log.m105920e("LiveCheerAnimationSlice", "checkPreload return, getPagPath error : " + c3 + " resource: " + vvVar);
                return C13598b0.f38549a;
            }
            String d = C90193h.m112876d(c3);
            if (C86013q1.m106450k(c3)) {
                if (C87412m.m108589b(vvVar.f185992e, d)) {
                    Log.m105920e("LiveCheerAnimationSlice", "checkPreload return, file exists : " + c3 + " tempMd5: " + d);
                    return C13598b0.f38549a;
                }
                Log.m105920e("LiveCheerAnimationSlice", "checkPreload file not valid, tempMd5: " + d);
                C86013q1.m106447h(c3);
            }
            C59098d dVar = C59098d.f169061a;
            String str = vvVar.f185991d;
            if (str == null) {
                str = "";
            }
            this.f154173d = 1;
            obj = dVar.mo84292a(str, c3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("LiveCheerAnimationSlice", "checkPreload result: " + ((C59098d.C59099a) obj));
        return C13598b0.f38549a;
    }
}
