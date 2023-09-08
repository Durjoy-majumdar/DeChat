package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw1.p */
public final class C11296p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33236d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11296p(ImageCropUI imageCropUI) {
        super(0);
        this.f33236d = imageCropUI;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33236d;
        int i = ImageCropUI.f19098D;
        WxMediaCropLayout J7 = imageCropUI.mo5346J7();
        ImageCropUI imageCropUI2 = this.f33236d;
        J7.setVisibility(0);
        J7.setShowBorder(false);
        J7.mo150015f(imageCropUI2.mo5347K7(), WxCropOperationLayout.C94436h.RECT_HARD);
        long currentTimeMillis = System.currentTimeMillis();
        String L7 = imageCropUI2.mo5348L7();
        C87412m.m108593f(L7, "imgPath");
        WxMediaCropLayout.m141519g(J7, currentTimeMillis, L7, true, (WxMediaCropLayout.C4426b) null, imageCropUI2.f19101C, 8, (Object) null);
        J7.mo150025j();
        return C13598b0.f38549a;
    }
}
