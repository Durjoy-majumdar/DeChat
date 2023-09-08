package nw1;

import android.content.Context;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: nw1.g0 */
public final class C109766g0 extends C87413o implements C32224a<WxCropOperationLayout> {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f328519d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109766g0(WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f328519d = wxMediaCropLayout;
    }

    public Object invoke() {
        Context context = this.f328519d.getContext();
        C87412m.m108593f(context, "context");
        return new WxCropOperationLayout(context);
    }
}
