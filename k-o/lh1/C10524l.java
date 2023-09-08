package lh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8477a0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$onShare$2$1", mo125469f = "ShellView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lh1.l */
public final class C10524l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f31782d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f31783e;

    /* renamed from: f */
    public final /* synthetic */ String f31784f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10524l(C8477a0 a0Var, Bitmap bitmap, String str, C15601d<? super C10524l> dVar) {
        super(2, dVar);
        this.f31782d = a0Var;
        this.f31783e = bitmap;
        this.f31784f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10524l(this.f31782d, this.f31783e, this.f31784f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10524l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        try {
            this.f31782d.f27482d = BitmapUtil.saveBitmapToImage(this.f31783e, 80, Bitmap.CompressFormat.JPEG, this.f31784f, true);
        } catch (Exception e) {
            Log.m105920e("FinderLiveScreenShotShellView", e.toString());
        }
        return C13598b0.f38549a;
    }
}
