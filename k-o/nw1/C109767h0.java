package nw1;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import gy3.C87412m;

/* renamed from: nw1.h0 */
public final class C109767h0 implements WxCropOperationLayout.C105987g {

    /* renamed from: a */
    public final /* synthetic */ WxMediaCropLayout f328520a;

    /* renamed from: b */
    public final /* synthetic */ long f328521b;

    /* renamed from: c */
    public final /* synthetic */ WxMediaCropLayout.C4425a f328522c;

    public C109767h0(WxMediaCropLayout wxMediaCropLayout, long j, WxMediaCropLayout.C4425a aVar) {
        this.f328520a = wxMediaCropLayout;
        this.f328521b = j;
        this.f328522c = aVar;
    }

    /* renamed from: a */
    public void mo151325a(boolean z) {
    }

    /* renamed from: b */
    public void mo151326b(boolean z) {
    }

    /* renamed from: c */
    public void mo151327c(RectF rectF) {
        C87412m.m108594g(rectF, "rectF");
        WxMediaCropLayout wxMediaCropLayout = this.f328520a;
        long j = this.f328521b;
        int i = WxMediaCropLayout.f313189u;
        long j2 = wxMediaCropLayout.f313203t;
        if (j2 == j || j2 == 0) {
            wxMediaCropLayout.f313195i.set(rectF);
        }
        rectF.round(this.f328522c.f19139f);
        this.f328520a.getLayout().mo152391w(rectF, false);
    }
}
