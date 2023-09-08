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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$onSave$2$1", mo125469f = "ShellView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lh1.i */
public final class C10521i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f31772d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f31773e;

    /* renamed from: f */
    public final /* synthetic */ String f31774f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10521i(C8477a0 a0Var, Bitmap bitmap, String str, C15601d<? super C10521i> dVar) {
        super(2, dVar);
        this.f31772d = a0Var;
        this.f31773e = bitmap;
        this.f31774f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10521i(this.f31772d, this.f31773e, this.f31774f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10521i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        try {
            this.f31772d.f27482d = BitmapUtil.saveBitmapToImage(this.f31773e, 80, Bitmap.CompressFormat.JPEG, this.f31774f, true);
        } catch (Exception e) {
            Log.m105920e("FinderLiveScreenShotShellView", e.toString());
        }
        return C13598b0.f38549a;
    }
}
