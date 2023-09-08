package fh1;

import a14.C0000n0;
import a14.C53973z1;
import android.graphics.Bitmap;
import androidx.camera.core.FocusMeteringAction;
import cj1.C54741c;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import fy3.C32227p;
import gh1.C59453p;
import gy3.C87413o;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import jq3.C9493c;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$checkInsertNotifyBanner$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: fh1.n1 */
public final class C59057n1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168974d;

    /* renamed from: fh1.n1$a */
    public static final class C59058a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59018f2 f168975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59058a(C59018f2 f2Var) {
            super(0);
            this.f168975d = f2Var;
        }

        public Object invoke() {
            if (this.f168975d.f168889y.size() == 1) {
                this.f168975d.f168889y.remove(0);
                WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f168975d.f168879o;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemRemoved(0);
                }
                C59453p pVar = this.f168975d.f168871I;
                if (pVar != null) {
                    pVar.mo84560c(8);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59057n1(C59018f2 f2Var, C15601d<? super C59057n1> dVar) {
        super(2, dVar);
        this.f168974d = f2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59057n1(this.f168974d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59057n1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C54991o.class;
        ResultKt.throwOnFailure(obj);
        C59018f2 f2Var = this.f168974d;
        synchronized (f2Var.f168885u) {
            FinderJumpInfo finderJumpInfo = ((C54991o) f2Var.business(cls)).f154215J1;
            if (finderJumpInfo != null) {
                int size = f2Var.f168889y.size() == 0 ? 0 : (f2Var.f168884t % f2Var.f168889y.size()) + 1;
                C59453p pVar = f2Var.f168871I;
                if (pVar != null) {
                    pVar.mo84560c(0);
                }
                C53973z1 z1Var = f2Var.f168864B;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                f2Var.f168889y.add(size, new C54741c(finderJumpInfo));
                WxRecyclerAdapter<C9493c> wxRecyclerAdapter = f2Var.f168879o;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                f2Var.mo84249Q3();
                HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                Log.m105924i("Finder.LivePromoteBannerController", "[checkInsertNotifyBanner] index = " + size);
                if (size == 0) {
                    C61926c.m72666K(f2Var.f168887w ? 2000 : FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C59058a(f2Var));
                }
                f2Var.mo84250R3();
            }
            ((C54991o) f2Var.business(cls)).f154215J1 = null;
        }
        return C13598b0.f38549a;
    }
}
