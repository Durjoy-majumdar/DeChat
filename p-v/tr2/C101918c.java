package tr2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: tr2.c */
public final class C101918c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f300081d;

    /* renamed from: e */
    public final /* synthetic */ C101919d f300082e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f300083f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101918c(Bitmap bitmap, C101919d dVar, Bitmap bitmap2) {
        super(0);
        this.f300081d = bitmap;
        this.f300082e = dVar;
        this.f300083f = bitmap2;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        if (this.f300081d != null) {
            this.f300082e.mo141420g().setImageBitmap(this.f300081d);
        } else {
            this.f300082e.mo141420g().setImageBitmap(this.f300083f);
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$blurBitmap$1$1");
        return b0Var;
    }
}
