package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.gallery.a0 */
public class C97031a0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284639d;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.a0$a */
    public class C97032a implements C45059m0.C45068i {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.a0$a$a */
        public class C97033a implements Runnable {
            public C97033a() {
            }

            public void run() {
                ImageGalleryUI$$w0 imageGalleryUI$$w0 = C97031a0.this.f284639d.f284428e2;
                if (imageGalleryUI$$w0 != null) {
                    ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.FALSE);
                }
            }
        }

        public C97032a() {
        }

        public void onAnimationEnd() {
            Log.m105918d("MicroMsg.ImageGalleryUI", "onAnimationEnd");
            C97031a0.this.f284639d.f284384P2.post(new C97033a());
            ImageGalleryUI imageGalleryUI = C97031a0.this.f284639d;
            View L7 = ImageGalleryUI.m124730L7(imageGalleryUI, imageGalleryUI.f284432g, imageGalleryUI.f284450n);
            if (L7 instanceof WxImageView) {
                ((WxImageView) L7).setDrawFullSampleSizeBitmap(false);
            }
        }

        public void onAnimationStart() {
            Log.m105918d("MicroMsg.ImageGalleryUI", "onAnimationStart");
            ImageGalleryUI$$w0 imageGalleryUI$$w0 = C97031a0.this.f284639d.f284428e2;
            if (imageGalleryUI$$w0 != null) {
                ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.TRUE);
            }
        }
    }

    public C97031a0(ImageGalleryUI imageGalleryUI) {
        this.f284639d = imageGalleryUI;
    }

    public boolean onPreDraw() {
        this.f284639d.f284450n.getViewTreeObserver().removeOnPreDrawListener(this);
        Log.m105924i("MicroMsg.ImageGalleryUI", "[handleAnimation] -> onPreDraw, isBackFromGrid:" + this.f284639d.f284483x1);
        ImageGalleryUI imageGalleryUI = this.f284639d;
        imageGalleryUI.f284412Y0 = imageGalleryUI.f284450n.getWidth();
        ImageGalleryUI imageGalleryUI2 = this.f284639d;
        imageGalleryUI2.f284415Z0 = imageGalleryUI2.f284450n.getHeight();
        if (this.f284639d.f284432g.mo135935w().mo100989b4()) {
            ImageGalleryUI imageGalleryUI3 = this.f284639d;
            imageGalleryUI3.f284415Z0 = (int) ((((float) imageGalleryUI3.f284412Y0) / ((float) imageGalleryUI3.f284430f1)) * ((float) imageGalleryUI3.f284433g1));
        }
        if (this.f284639d.f284432g.mo135935w().mo100979R3()) {
            ImageGalleryUI imageGalleryUI4 = this.f284639d;
            C19706a aVar = (C19706a) imageGalleryUI4.mo135770g8(imageGalleryUI4.f284432g, imageGalleryUI4.f284450n);
            if (aVar != null) {
                ImageGalleryUI imageGalleryUI5 = this.f284639d;
                imageGalleryUI5.f284415Z0 = (int) ((((float) imageGalleryUI5.f284412Y0) / ((float) aVar.getImageWidth())) * ((float) aVar.getImageHeight()));
                ImageGalleryUI imageGalleryUI6 = this.f284639d;
                if (imageGalleryUI6.f284415Z0 > imageGalleryUI6.f284450n.getHeight()) {
                    ImageGalleryUI imageGalleryUI7 = this.f284639d;
                    imageGalleryUI7.f284415Z0 = imageGalleryUI7.f284450n.getHeight();
                }
            }
        }
        ImageGalleryUI imageGalleryUI8 = this.f284639d;
        C45059m0 m0Var = imageGalleryUI8.f284442j1;
        int i = imageGalleryUI8.f284412Y0;
        int i2 = imageGalleryUI8.f284415Z0;
        m0Var.f122226f = i;
        m0Var.f122227g = i2;
        if (!imageGalleryUI8.f284483x1) {
            m0Var.mo70408c(imageGalleryUI8.f284450n, imageGalleryUI8.f284406W0, new C97032a());
        }
        ImageGalleryUI imageGalleryUI9 = this.f284639d;
        imageGalleryUI9.f284450n.setGalleryScaleListener(new C97036b0(imageGalleryUI9));
        return true;
    }
}
