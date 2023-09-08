package com.tencent.tavkit.composition.video;

import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.model.TAVVideoCompositionTrack;
import java.util.ArrayList;
import java.util.List;

public class ImageCollection {
    private final List<TrackImagePair> overlayImages = new ArrayList();
    private final List<TrackImagePair> videoChannelImages = new ArrayList();

    public static class TrackImagePair {
        private final CIImage image;
        private final TAVVideoCompositionTrack track;

        public TrackImagePair(CIImage cIImage, TAVVideoCompositionTrack tAVVideoCompositionTrack) {
            this.image = cIImage;
            this.track = tAVVideoCompositionTrack;
        }

        public CIImage getImage() {
            return this.image;
        }

        public TAVVideoCompositionTrack getTrack() {
            return this.track;
        }
    }

    public void addChannelImage(CIImage cIImage, TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.videoChannelImages.add(new TrackImagePair(cIImage, tAVVideoCompositionTrack));
    }

    public void addOverlayImage(CIImage cIImage, TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.overlayImages.add(new TrackImagePair(cIImage, tAVVideoCompositionTrack));
    }

    public List<TrackImagePair> getOverlayImages() {
        return this.overlayImages;
    }

    public List<TrackImagePair> getVideoChannelImages() {
        return this.videoChannelImages;
    }

    public String toString() {
        return "ImageCollection{videoChannelImages=" + this.videoChannelImages + ", overlayImages=" + this.overlayImages + '}';
    }
}
