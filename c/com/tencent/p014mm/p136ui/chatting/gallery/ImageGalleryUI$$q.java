package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTextureView;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$q */
public class ImageGalleryUI$$q implements TouchMediaPreviewLayout.C97275a {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284533a;

    public ImageGalleryUI$$q(ImageGalleryUI imageGalleryUI) {
        this.f284533a = imageGalleryUI;
    }

    public void onDoubleTap(float f, float f2) {
        if (this.f284533a.f284432g.mo135935w() != null && this.f284533a.f284432g.mo135935w().mo100994f4()) {
            this.f284533a.f284409X0.setEnable(true);
            if (!this.f284533a.f284409X0.getAddTouchView()) {
                C97087m1 v = this.f284533a.f284432g.mo135934v();
                v.mo135970f();
                if (v.f284849p instanceof ThumbPlayerViewContainer) {
                    C97087m1 v2 = this.f284533a.f284432g.mo135934v();
                    v2.mo135970f();
                    View currentView = ((ThumbPlayerViewContainer) v2.f284849p).getCurrentView();
                    if (currentView != null && (currentView instanceof MMTextureView)) {
                        ((MMTextureView) currentView).setInterceptDetach(true);
                    }
                }
                ImageGalleryUI imageGalleryUI = this.f284533a;
                imageGalleryUI.f284409X0.mo153908b(imageGalleryUI.f284432g.mo135938z(imageGalleryUI.f284450n.getCurrentItem()));
            }
            this.f284533a.f284409X0.mo153913e(f, f2);
        } else if (this.f284533a.f284432g.mo135935w() != null && this.f284533a.f284432g.mo135935w().mo100979R3()) {
            this.f284533a.f284409X0.setEnable(false);
        }
    }
}
