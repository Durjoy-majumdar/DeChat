package com.tencent.tav.core.audio;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.core.AudioCompositionDecoderTrack;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.AudioInfo;
import com.tencent.tav.decoder.IDecoder;
import java.util.List;

public class AudioSourceComposition implements IAudioSource<AudioCompositionDecoderTrack> {
    private Asset mAsset;
    private AudioInfo mAudioInfo = new AudioInfo(44100, 1, 2);

    public AudioSourceComposition(Asset asset) {
        this.mAsset = asset;
    }

    public CMTime getDuration() {
        return this.mAsset.getDuration();
    }

    public AudioCompositionDecoderTrack getSourceAudioDecoder(CMTimeRange cMTimeRange) {
        AudioCompositionDecoderTrack audioCompositionDecoderTrack = new AudioCompositionDecoderTrack((List<AssetTrack>) this.mAsset.getTracks(), -1);
        audioCompositionDecoderTrack.setAudioInfo(this.mAudioInfo);
        audioCompositionDecoderTrack.setDecodeType(IDecoder.DecodeType.Audio);
        audioCompositionDecoderTrack.setFrameRate(44);
        return audioCompositionDecoderTrack;
    }
}
