package nw1;

import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: nw1.d0 */
public final class C11284d0 extends C87413o implements C32224a<ImageView> {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f33219d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11284d0(WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f33219d = wxMediaCropLayout;
    }

    public Object invoke() {
        return new ImageView(this.f33219d.getContext());
    }
}
