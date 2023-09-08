package nw1;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: nw1.e0 */
public final class C109764e0 extends C87413o implements C32224a<CropLayout> {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f328515d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109764e0(WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f328515d = wxMediaCropLayout;
    }

    public Object invoke() {
        Context context = this.f328515d.getContext();
        C87412m.m108593f(context, "context");
        CropLayout cropLayout = new CropLayout(context);
        cropLayout.setHasBorder(false);
        cropLayout.setEnableScale(true);
        cropLayout.setEnableFling(true);
        cropLayout.setEnableTouch(true);
        cropLayout.setEnableOverScroll(false);
        return cropLayout;
    }
}
