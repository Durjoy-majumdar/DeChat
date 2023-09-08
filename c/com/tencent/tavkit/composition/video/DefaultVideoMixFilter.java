package com.tencent.tavkit.composition.video;

import android.graphics.PointF;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.composition.video.ImageCollection;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;

class DefaultVideoMixFilter implements TAVVideoMixEffect.Filter {
    private void checkFillInRenderSize(RenderInfo renderInfo, ImageCollection.TrackImagePair trackImagePair, CIImage cIImage) {
        if (trackImagePair.getTrack() instanceof TAVClip) {
            TAVVideoConfiguration videoConfiguration = ((TAVClip) trackImagePair.getTrack()).getVideoConfiguration();
            if (!videoConfiguration.frameEnable()) {
                cIImage.applyFillInFrame(new CGRect(new PointF(0.0f, 0.0f), renderInfo.getRenderSize()), videoConfiguration.getContentMode());
            }
        }
    }

    public CIImage apply(TAVVideoMixEffect tAVVideoMixEffect, ImageCollection imageCollection, RenderInfo renderInfo) {
        CIImage cIImage = new CIImage(renderInfo.getRenderSize());
        for (ImageCollection.TrackImagePair next : imageCollection.getVideoChannelImages()) {
            CIImage image = next.getImage();
            checkFillInRenderSize(renderInfo, next, image);
            image.imageByCompositingOverImage(cIImage);
        }
        for (ImageCollection.TrackImagePair next2 : imageCollection.getOverlayImages()) {
            CIImage image2 = next2.getImage();
            checkFillInRenderSize(renderInfo, next2, image2);
            image2.imageByCompositingOverImage(cIImage);
        }
        return cIImage;
    }

    public void release() {
    }
}
