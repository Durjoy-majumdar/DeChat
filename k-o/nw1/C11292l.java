package nw1;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import gy3.C87412m;

/* renamed from: nw1.l */
public final class C11292l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f33228d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f33229e;

    public C11292l(WxMediaCropLayout wxMediaCropLayout, ImageCropUI imageCropUI) {
        this.f33228d = wxMediaCropLayout;
        this.f33229e = imageCropUI;
    }

    public final void run() {
        float f;
        float f2;
        float f3;
        float f4;
        WxMediaCropLayout wxMediaCropLayout = this.f33228d;
        ImageCropUI imageCropUI = this.f33229e;
        int[] iArr = imageCropUI.f19119x;
        if (iArr != null) {
            int i = iArr[0];
            if (iArr != null) {
                int i2 = iArr[1];
                int width = wxMediaCropLayout.getWidth();
                int height = this.f33228d.getHeight();
                int i3 = imageCropUI.f19117v;
                int i4 = (i3 == 90 || i3 == 270) ? i2 : i;
                if (!(i3 == 90 || i3 == 270)) {
                    i = i2;
                }
                float f5 = 0.0f;
                if (i >= height || i4 >= width) {
                    if (LongBitmapHandler.isLongVertical(i4, i)) {
                        f = (float) height;
                        f4 = 0.0f;
                        f2 = (float) width;
                    } else if (LongBitmapHandler.isLongHorizontal(i4, i)) {
                        f2 = (float) width;
                        float f6 = ((float) (height - i)) / 2.0f;
                        float f7 = f6;
                        f = f6 + f2;
                        f3 = f7;
                    } else {
                        float f8 = (float) i;
                        float f9 = (float) i4;
                        float f15 = (float) height;
                        float f16 = (float) width;
                        if (f8 / f9 > f15 / f16) {
                            float f17 = ((float) (height * i4)) / f8;
                            f4 = (f16 - f17) / 2.0f;
                            f2 = f17 + f4;
                            f = f15;
                        } else {
                            float f18 = ((float) (width * i)) / f9;
                            float f19 = (f15 - f18) / 2.0f;
                            f = f18 + f19;
                            f3 = f19;
                            f2 = f16;
                        }
                    }
                    f5 = f4;
                    f3 = 0.0f;
                } else {
                    f5 = ((float) (width - i4)) / 2.0f;
                    f2 = ((float) i4) + f5;
                    f3 = ((float) (height - i)) / 2.0f;
                    f = ((float) i) + f3;
                }
                wxMediaCropLayout.mo150015f(new RectF(f5, f3, f2, f), WxCropOperationLayout.C94436h.RECT_HARD);
                WxMediaCropLayout wxMediaCropLayout2 = this.f33228d;
                C87412m.m108593f(wxMediaCropLayout2, "");
                long currentTimeMillis = System.currentTimeMillis();
                String L7 = this.f33229e.mo5348L7();
                C87412m.m108593f(L7, "imgPath");
                WxMediaCropLayout.m141519g(wxMediaCropLayout2, currentTimeMillis, L7, true, (WxMediaCropLayout.C4426b) null, this.f33229e.f19100B, 8, (Object) null);
                return;
            }
            C87412m.m108603p("mattingImageInfo");
            throw null;
        }
        C87412m.m108603p("mattingImageInfo");
        throw null;
    }
}
