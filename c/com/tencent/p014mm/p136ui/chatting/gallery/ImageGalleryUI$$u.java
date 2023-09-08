package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u */
public class ImageGalleryUI$$u implements C45059m0.C45068i {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284541a;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u$a */
    public class C97025a implements Runnable {
        public C97025a() {
        }

        public void run() {
            ImageGalleryUI imageGalleryUI = ImageGalleryUI$$u.this.f284541a;
            View g8 = imageGalleryUI.mo135770g8(imageGalleryUI.f284432g, imageGalleryUI.f284450n);
            if (g8 != null && (g8 instanceof C19706a)) {
                if (g8 instanceof MultiTouchImageView) {
                    ((MultiTouchImageView) g8).mo26059d();
                } else if (g8 instanceof WxImageView) {
                    ((WxImageView) g8).mo26059d();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u$b */
    public class C97026b implements Runnable {
        public C97026b() {
        }

        public void run() {
            ImageGalleryUI$$u.this.f284541a.finish();
            ImageGalleryUI$$u.this.f284541a.overridePendingTransition(0, 0);
        }
    }

    public ImageGalleryUI$$u(ImageGalleryUI imageGalleryUI) {
        this.f284541a = imageGalleryUI;
    }

    public void onAnimationEnd() {
        Log.m105924i("MicroMsg.ImageGalleryUI", "runExitAnimation onAnimationEnd");
        this.f284541a.f284384P2.post(new C97026b());
        this.f284541a.f284469t = false;
    }

    public void onAnimationStart() {
        this.f284541a.f284469t = true;
        new MMHandler().postDelayed(new C97025a(), 20);
    }
}
