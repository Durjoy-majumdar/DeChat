package wg1;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import fe1.C58969q;
import fy3.C32227p;
import ht1.C60200t1;
import kotlin.ResultKt;
import rx3.C13598b0;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$buildShareBottomSheet$doFav$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {625}, mo125471m = "invokeSuspend")
/* renamed from: wg1.a2 */
public final class C15254a2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41495d;

    /* renamed from: e */
    public final /* synthetic */ C15370z1 f41496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15254a2(C15370z1 z1Var, C15601d<? super C15254a2> dVar) {
        super(2, dVar);
        this.f41496e = z1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15254a2(this.f41496e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15254a2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41495d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C15370z1 z1Var = this.f41496e;
            this.f41495d = 1;
            obj = C15370z1.m14342c3(z1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15370z1 z1Var2 = this.f41496e;
        String e802 = ((C64916p1) C86312j.m106911c(C64916p1.class)).e80();
        BitmapUtil.saveBitmapToImage((Bitmap) obj, 80, Bitmap.CompressFormat.JPEG, e802, true);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        C58969q qVar = z1Var2.f41738M;
        t1Var.mo76756Gf(e802, qVar != null ? qVar.getUsername() : "", z1Var2.getContext());
        return C13598b0.f38549a;
    }
}
