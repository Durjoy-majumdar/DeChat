package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTextureView;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$p */
public class ImageGalleryUI$$p implements TouchMediaPreviewLayout.C97277c {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284530d;

    public ImageGalleryUI$$p(ImageGalleryUI imageGalleryUI) {
        this.f284530d = imageGalleryUI;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.f284530d.f284432g.mo135935w().mo100994f4()) {
            C97087m1 v = this.f284530d.f284432g.mo135934v();
            v.mo135970f();
            if (v.f284849p instanceof ThumbPlayerViewContainer) {
                C97087m1 v2 = this.f284530d.f284432g.mo135934v();
                v2.mo135970f();
                View currentView = ((ThumbPlayerViewContainer) v2.f284849p).getCurrentView();
                if (currentView != null && (currentView instanceof MMTextureView)) {
                    ((MMTextureView) currentView).setInterceptDetach(true);
                }
            }
            this.f284530d.f284409X0.setEnable(true);
            ImageGalleryUI imageGalleryUI = this.f284530d;
            imageGalleryUI.f284409X0.mo153908b(imageGalleryUI.f284432g.mo135938z(imageGalleryUI.f284450n.getCurrentItem()));
        } else if (this.f284530d.f284432g.mo135935w().mo100979R3()) {
            this.f284530d.f284409X0.setEnable(false);
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C97056h hVar = this.f284530d.f284432g;
        if (hVar != null && hVar.mo135935w() != null && this.f284530d.f284432g.mo135935w().mo100994f4()) {
            C97087m1 v = this.f284530d.f284432g.mo135934v();
            v.mo135970f();
            if (v.f284849p instanceof ThumbPlayerViewContainer) {
                C97087m1 v2 = this.f284530d.f284432g.mo135934v();
                v2.mo135970f();
                View currentView = ((ThumbPlayerViewContainer) v2.f284849p).getCurrentView();
                if (currentView != null && (currentView instanceof MMTextureView)) {
                    ((MMTextureView) currentView).setInterceptDetach(false);
                }
            }
        }
    }
}
