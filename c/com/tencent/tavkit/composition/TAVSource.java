package com.tencent.tavkit.composition;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.core.AudioMix;
import com.tencent.tav.core.composition.VideoComposition;

public class TAVSource {
    private Asset asset;
    private AudioMix audioMix;
    private VideoComposition videoComposition;

    public Asset getAsset() {
        return this.asset;
    }

    public AudioMix getAudioMix() {
        return this.audioMix;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public void setAsset(Asset asset2) {
        this.asset = asset2;
    }

    public void setAudioMix(AudioMix audioMix2) {
        this.audioMix = audioMix2;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
    }

    public String toString() {
        return "TAVSource{\nasset=" + this.asset + "\nvideoComposition=" + this.videoComposition + "\naudioMix=" + this.audioMix + '}';
    }
}
