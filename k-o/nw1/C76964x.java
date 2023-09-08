package nw1;

import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.picker.view.MMMediaCropLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: nw1.x */
public final class C76964x extends C87413o implements C32224a<ImageView> {

    /* renamed from: d */
    public final /* synthetic */ MMMediaCropLayout f224891d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76964x(MMMediaCropLayout mMMediaCropLayout) {
        super(0);
        this.f224891d = mMMediaCropLayout;
    }

    public Object invoke() {
        return new ImageView(this.f224891d.getContext());
    }
}
