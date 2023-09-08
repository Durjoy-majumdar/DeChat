package lh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51474u01;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$render$1", mo125469f = "ShellView.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
/* renamed from: lh1.m */
public final class C10525m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f31785d;

    /* renamed from: e */
    public final /* synthetic */ ShellView f31786e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f31787f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f31788g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f31789h;

    /* renamed from: i */
    public final /* synthetic */ C51474u01 f31790i;

    /* renamed from: j */
    public final /* synthetic */ boolean f31791j;

    /* renamed from: n */
    public final /* synthetic */ boolean f31792n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10525m(ShellView shellView, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C51474u01 u012, boolean z, boolean z2, C15601d<? super C10525m> dVar) {
        super(2, dVar);
        this.f31786e = shellView;
        this.f31787f = bitmap;
        this.f31788g = bitmap2;
        this.f31789h = bitmap3;
        this.f31790i = u012;
        this.f31791j = z;
        this.f31792n = z2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10525m(this.f31786e, this.f31787f, this.f31788g, this.f31789h, this.f31790i, this.f31791j, this.f31792n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10525m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f31785d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenShotView screenShotView = this.f31786e.f15055d;
            if (screenShotView != null) {
                Bitmap bitmap = this.f31787f;
                Bitmap bitmap2 = this.f31788g;
                Bitmap bitmap3 = this.f31789h;
                C51474u01 u012 = this.f31790i;
                boolean z = this.f31791j;
                boolean z2 = this.f31792n;
                this.f31785d = 1;
                if (screenShotView.mo3188b(bitmap, bitmap2, bitmap3, u012, z, z2, this) == aVar) {
                    return aVar;
                }
            } else {
                C87412m.m108603p("screenShotView");
                throw null;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
