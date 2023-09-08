package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.PointF;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C94467l;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0 */
public class ImageGalleryUI$$c0 implements C94467l {

    /* renamed from: a */
    public final /* synthetic */ boolean f284498a;

    /* renamed from: b */
    public final /* synthetic */ ImageGalleryUI f284499b;

    public ImageGalleryUI$$c0(ImageGalleryUI imageGalleryUI, boolean z) {
        this.f284499b = imageGalleryUI;
        this.f284498a = z;
    }

    /* renamed from: a */
    public void mo64853a(ArrayList<PointF> arrayList, ArrayList<ImageQBarDataBean> arrayList2, ArrayList<ImageQBarDataBean> arrayList3) {
        ImageGalleryUI imageGalleryUI = this.f284499b;
        if (imageGalleryUI.f284450n != null) {
            imageGalleryUI.mo135790v8();
            imageGalleryUI.f284408X.mo67040c(arrayList3, arrayList, arrayList2, this.f284499b.f284450n.getMeasuredHeight());
        } else {
            imageGalleryUI.mo135790v8();
            MultiCodeMaskView multiCodeMaskView = imageGalleryUI.f284408X;
            ImageGalleryUI imageGalleryUI2 = this.f284499b;
            imageGalleryUI2.mo135790v8();
            multiCodeMaskView.mo67040c(arrayList3, arrayList, arrayList2, imageGalleryUI2.f284408X.getRootView().getHeight());
        }
        this.f284499b.mo135737P8(false);
        C42912n nVar = C42912n.f116194a;
        nVar.mo67105c(this.f284499b.f284391R1.longValue(), arrayList3.size(), arrayList.size(), 2, "");
        if (arrayList.size() > 1) {
            nVar.mo67104b(this.f284499b.f284391R1.longValue(), 11, arrayList3, (ImageQBarDataBean) null, this.f284499b.f284395S1.longValue(), this.f284498a, ImageGalleryUI.m124728J7(this.f284499b));
        }
    }

    /* renamed from: b */
    public void mo64854b(ImageQBarDataBean imageQBarDataBean, ArrayList<ImageQBarDataBean> arrayList) {
        ImageGalleryUI imageGalleryUI = this.f284499b;
        imageGalleryUI.f284458p1.mo136028a(imageGalleryUI.f284451n1, imageQBarDataBean, imageGalleryUI.f284410X1);
        C42912n nVar = C42912n.f116194a;
        nVar.mo67105c(this.f284499b.f284391R1.longValue(), this.f284499b.f284451n1.f287785a.size(), 0, 2, "");
        long longValue = this.f284499b.f284391R1.longValue();
        ImageGalleryUI imageGalleryUI2 = this.f284499b;
        nVar.mo67104b(longValue, 1, imageGalleryUI2.f284451n1.f287785a, imageQBarDataBean, imageGalleryUI2.f284395S1.longValue(), this.f284498a, ImageGalleryUI.m124728J7(this.f284499b));
    }
}
