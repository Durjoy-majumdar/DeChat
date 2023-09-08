package nw1;

import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;

/* renamed from: nw1.j0 */
public final class C109769j0 implements CropLayout.C106804b {

    /* renamed from: a */
    public final /* synthetic */ WxMediaCropLayout.C4425a f328526a;

    /* renamed from: b */
    public final /* synthetic */ WxMediaCropLayout f328527b;

    public C109769j0(WxMediaCropLayout.C4425a aVar, WxMediaCropLayout wxMediaCropLayout) {
        this.f328526a = aVar;
        this.f328527b = wxMediaCropLayout;
    }

    public void onChange() {
        this.f328526a.f19142i.set(this.f328527b.getLayout().getContentRect());
    }
}
