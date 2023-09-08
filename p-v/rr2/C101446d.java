package rr2;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rr2.d */
public final class C101446d extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C101447e f297103d;

    /* renamed from: e */
    public final /* synthetic */ Rect f297104e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101446d(C101447e eVar, Rect rect) {
        super(1);
        this.f297103d = eVar;
        this.f297104e = rect;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$blurBitmap$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$blurBitmap$1");
        C101447e eVar = this.f297103d;
        Rect rect = this.f297104e;
        SnsMethodCalculate.markStartTimeMs("access$setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        eVar.mo140952z((Bitmap) obj, rect);
        SnsMethodCalculate.markEndTimeMs("access$setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$blurBitmap$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$blurBitmap$1");
        return b0Var;
    }
}
