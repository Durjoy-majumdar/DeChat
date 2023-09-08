package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.MMMediaCropLayout;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: nw1.z */
public final class C100222z extends C87413o implements C32224a<CommonVideoView> {

    /* renamed from: d */
    public final /* synthetic */ MMMediaCropLayout f293648d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100222z(MMMediaCropLayout mMMediaCropLayout) {
        super(0);
        this.f293648d = mMMediaCropLayout;
    }

    public Object invoke() {
        return new CommonVideoView(this.f293648d.getContext());
    }
}
