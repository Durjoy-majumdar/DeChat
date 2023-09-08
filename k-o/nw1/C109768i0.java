package nw1;

import android.graphics.Matrix;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: nw1.i0 */
public final class C109768i0 extends C87413o implements C32226l<Matrix, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Matrix f328523d;

    /* renamed from: e */
    public final /* synthetic */ WxMediaCropLayout.C4425a f328524e;

    /* renamed from: f */
    public final /* synthetic */ WxMediaCropLayout f328525f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109768i0(Matrix matrix, WxMediaCropLayout.C4425a aVar, WxMediaCropLayout wxMediaCropLayout) {
        super(1);
        this.f328523d = matrix;
        this.f328524e = aVar;
        this.f328525f = wxMediaCropLayout;
    }

    public Object invoke(Object obj) {
        Matrix matrix = (Matrix) obj;
        C87412m.m108594g(matrix, LocaleUtil.ITALIAN);
        boolean z = false;
        if (this.f328523d.isIdentity()) {
            Log.m105924i("WxMediaCropLayout", "previousMatrix isIdentity");
            this.f328524e.f19138e.set(matrix);
            this.f328524e.f19140g.set(this.f328525f.getLayout().getContentCenterRect());
            this.f328524e.f19141h.set(this.f328525f.getLayout().getContentOriginalRect());
            WxMediaCropLayout.C4425a aVar = this.f328524e;
            float f = this.f328525f.getLayout().getContentViewScale()[0];
            aVar.getClass();
            this.f328524e.f19143j = this.f328525f.getLayout().getMaxScaleValue();
            this.f328524e.f19144k = this.f328525f.getLayout().getMinScaleValue();
        } else {
            Log.m105924i("WxMediaCropLayout", "set previousMatrix");
            matrix.set(this.f328523d);
            this.f328525f.getLayout().setMaxScaleValue(this.f328524e.f19143j);
            this.f328525f.getLayout().setMinScaleValue(this.f328524e.f19144k);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
