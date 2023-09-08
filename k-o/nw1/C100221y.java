package nw1;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.gallery.picker.view.MMMediaCropLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: nw1.y */
public final class C100221y extends C87413o implements C32224a<CropLayout> {

    /* renamed from: d */
    public final /* synthetic */ MMMediaCropLayout f293647d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100221y(MMMediaCropLayout mMMediaCropLayout) {
        super(0);
        this.f293647d = mMMediaCropLayout;
    }

    public Object invoke() {
        Context context = this.f293647d.getContext();
        C87412m.m108593f(context, "context");
        return new CropLayout(context);
    }
}
