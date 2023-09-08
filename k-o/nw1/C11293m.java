package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw1.m */
public final class C11293m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f33230d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f33231e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11293m(WxMediaCropLayout wxMediaCropLayout, ImageCropUI imageCropUI) {
        super(0);
        this.f33230d = wxMediaCropLayout;
        this.f33231e = imageCropUI;
    }

    public Object invoke() {
        WxMediaCropLayout wxMediaCropLayout = this.f33230d;
        wxMediaCropLayout.post(new C11292l(wxMediaCropLayout, this.f33231e));
        this.f33230d.postInvalidate();
        return C13598b0.f38549a;
    }
}
