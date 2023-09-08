package wg1;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import p159gw.C98250h;
import qo3.C77407n;
import rx3.C13598b0;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveVisitorNoticeQRCodeUIC$buildShareBottomSheet$saveImage$1", mo125469f = "FinderLiveVisitorNoticeQRCodeUIC.kt", mo125470l = {571}, mo125471m = "invokeSuspend")
/* renamed from: wg1.m3 */
public final class C15323m3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41647d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41648e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f41649f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15323m3(C15278g3 g3Var, C77407n nVar, C15601d<? super C15323m3> dVar) {
        super(2, dVar);
        this.f41648e = g3Var;
        this.f41649f = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15323m3(this.f41648e, this.f41649f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15323m3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41647d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C15278g3 g3Var = this.f41648e;
            this.f41647d = 1;
            obj = C15278g3.m14309c3(g3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15278g3 g3Var2 = this.f41648e;
        C77407n nVar = this.f41649f;
        String e802 = ((C64916p1) C86312j.m106911c(C64916p1.class)).e80();
        BitmapUtil.saveBitmapToImage((Bitmap) obj, 80, Bitmap.CompressFormat.JPEG, e802, true);
        g3Var2.getClass();
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(g3Var2.getActivity(), e802, new C15336p3(g3Var2));
        nVar.mo107572p();
        return C13598b0.f38549a;
    }
}
