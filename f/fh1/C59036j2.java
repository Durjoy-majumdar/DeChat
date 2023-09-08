package fh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import cj1.C54741c;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50285lm1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C23564m;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$startPollingBannerData$1$onPollingSuccess$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: fh1.j2 */
public final class C59036j2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168934d;

    /* renamed from: e */
    public final /* synthetic */ C50285lm1 f168935e;

    /* renamed from: fh1.j2$a */
    public static final class C59037a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59018f2 f168936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59037a(C59018f2 f2Var) {
            super(0);
            this.f168936d = f2Var;
        }

        public Object invoke() {
            C59018f2 f2Var = this.f168936d;
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            f2Var.mo84252U3();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59036j2(C59018f2 f2Var, C50285lm1 lm12, C15601d<? super C59036j2> dVar) {
        super(2, dVar);
        this.f168934d = f2Var;
        this.f168935e = lm12;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59036j2(this.f168934d, this.f168935e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59036j2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        LinkedList<FinderJumpInfo> linkedList = this.f168935e.f137519d;
        C87412m.m108593f(linkedList, "result.jump_infos");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderJumpInfo finderJumpInfo : linkedList) {
            C87412m.m108593f(finderJumpInfo, LocaleUtil.ITALIAN);
            arrayList2.add(new C54741c(finderJumpInfo));
        }
        arrayList.addAll(arrayList2);
        C59018f2.m68938o3(this.f168934d, arrayList);
        C59018f2.m68935G3(this.f168934d, arrayList);
        C23564m.m28136f(new C59037a(this.f168934d));
        return C13598b0.f38549a;
    }
}
