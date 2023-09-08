package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.p136ui.chatting.gallery.scan.ImageScanCodeManager;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$t0 */
public class ImageGalleryUI$$t0 implements MultiCodeMaskView.C42884a {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284540a;

    public ImageGalleryUI$$t0(ImageGalleryUI imageGalleryUI) {
        this.f284540a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo64868a(ArrayList<ImageQBarDataBean> arrayList) {
        C42912n nVar = C42912n.f116194a;
        long longValue = this.f284540a.f284391R1.longValue();
        long longValue2 = this.f284540a.f284395S1.longValue();
        ImageGalleryUI imageGalleryUI = this.f284540a;
        nVar.mo67104b(longValue, 3, arrayList, (ImageQBarDataBean) null, longValue2, imageGalleryUI.f284451n1.f287788d, ImageGalleryUI.m124728J7(imageGalleryUI));
    }

    /* renamed from: b */
    public void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z) {
        ImageGalleryUI imageGalleryUI = this.f284540a;
        ImageScanCodeManager imageScanCodeManager = imageGalleryUI.f284458p1;
        if (imageScanCodeManager != null) {
            imageScanCodeManager.mo136028a(imageGalleryUI.f284451n1, imageQBarDataBean, imageGalleryUI.f284410X1);
        }
        int i = z ? 1 : 2;
        C42912n nVar = C42912n.f116194a;
        long longValue = this.f284540a.f284391R1.longValue();
        long longValue2 = this.f284540a.f284395S1.longValue();
        ImageGalleryUI imageGalleryUI2 = this.f284540a;
        nVar.mo67104b(longValue, i, arrayList, imageQBarDataBean, longValue2, imageGalleryUI2.f284451n1.f287788d, ImageGalleryUI.m124728J7(imageGalleryUI2));
    }
}
