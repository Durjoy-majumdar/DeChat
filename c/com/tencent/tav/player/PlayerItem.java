package com.tencent.tav.player;

import android.graphics.Bitmap;
import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.asset.MetadataItem;
import com.tencent.tav.asset.URLAsset;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tav.core.AudioCompositionDecoderTrack;
import com.tencent.tav.core.AudioMix;
import com.tencent.tav.core.VideoCompositionDecoderTrack;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack;
import java.util.ArrayList;
import java.util.List;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public class PlayerItem {
    private Asset asset;
    private AssetExtension assetExtension;
    private AudioCompositionDecoderTrack audioCompositionDecoderTrack;
    private AudioMix audioMix;
    public String audioTimePitchAlgorithm;
    public VideoCompositing customVideoCompositor;
    public IDecoderFactory decoderFactory;
    private List<IDecoderTrack> decoderTrackList;
    private CMTime duration;
    private boolean enableLut;
    private ErrorMsg errorMsg;
    private CMTime forwardPlaybackEndTime;
    private PlayerLayer layer;
    private Bitmap lutBitmap;
    private int maxCacheSize;
    public List<PlayerItemOutput> outputs;
    private Player player;
    private PlayerThreadAudio playerThreadAudio;
    private PlayerThread playerThreadMain;
    private CGSize presentationSize;
    private float rate;
    private IDecoderTrack realVDecoderTrack;
    private CMTime reversePlaybackEndTime;
    private List<CMTimeRange> seekableTimeRanges;
    private boolean seekingWaitsForVideoCompositionRendering;
    private PlayerItemStatus status;
    private List<MetadataItem> timedMetadata;
    private List<PlayerItemTrack> tracks;
    private IDecoderTrack vDecoderTrack;
    public int videoApertureMode;
    private VideoComposition videoComposition;

    public enum PlayerItemStatus {
        PlayerItemStatusUnknown,
        PlayerItemStatusReadyToPlay,
        PlayerItemStatusFailed
    }

    public PlayerItem(String str) {
        this(new URLAsset(str), (AssetExtension) null);
    }

    private float getVideoFrameRate() {
        VideoComposition videoComposition2 = this.videoComposition;
        return videoComposition2 != null ? (((float) videoComposition2.getFrameDuration().timeScale) * 1.0f) / ((float) this.videoComposition.getFrameDuration().getValue()) : (float) PlayerDefaultConfigs.DEFAULT_FRAME_DURATION.timeScale;
    }

    private void initVideoCompositionDecoderTrack() {
        VideoCompositionDecoderTrack videoCompositionDecoderTrack = new VideoCompositionDecoderTrack(this.assetExtension, 1, this.decoderFactory);
        int i = 24;
        for (PlayerItemTrack next : this.tracks) {
            if (next != null && next.isEnabled() && next.getAssetTrack().getMediaType() == 1) {
                videoCompositionDecoderTrack.addTrack(next.getAssetTrack());
                i = (int) Math.min(next.getCurrentVideoFrameRate(), (float) i);
            }
        }
        VideoComposition videoComposition2 = this.videoComposition;
        if (!(videoComposition2 == null || videoComposition2.getFrameDuration() == null)) {
            i = (int) (((long) this.videoComposition.getFrameDuration().timeScale) / this.videoComposition.getFrameDuration().value);
        }
        if (i <= 0) {
            i = 30;
        }
        videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
        VideoCompositing videoCompositing = this.customVideoCompositor;
        if (videoCompositing != null) {
            videoCompositionDecoderTrack.setVideoCompositing(videoCompositing);
        }
        videoCompositionDecoderTrack.setFrameRate(i);
        videoCompositionDecoderTrack.setFrameDuration(new CMTime(1, i));
        this.realVDecoderTrack = videoCompositionDecoderTrack;
    }

    public void addOutput(PlayerItemOutput playerItemOutput) {
        this.outputs.add(playerItemOutput);
    }

    public void bindLayer(PlayerLayer playerLayer) {
        IDecoderTrack iDecoderTrack;
        this.layer = playerLayer;
        if (this.playerThreadMain != null) {
            float f = this.rate;
            if (f < 0.0f) {
                CachedVideoDecoderTrack cachedVideoDecoderTrack = new CachedVideoDecoderTrack(this.realVDecoderTrack, f < 0.0f);
                this.vDecoderTrack = cachedVideoDecoderTrack;
                cachedVideoDecoderTrack.setMaxFrameCacheSize(this.maxCacheSize);
                iDecoderTrack = this.vDecoderTrack;
            } else {
                iDecoderTrack = this.realVDecoderTrack;
            }
            this.playerThreadMain.bindSurface(iDecoderTrack, playerLayer);
        }
    }

    public void cancelPendingSeeks() {
        PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.cancelAllPendingSeeks();
        }
    }

    public CMTime currentTime() {
        return null;
    }

    public Asset getAsset() {
        return this.asset;
    }

    public AssetExtension getAssetExtension() {
        return this.assetExtension;
    }

    public AudioCompositionDecoderTrack getAudioCompositionDecoderTrack() {
        return this.audioCompositionDecoderTrack;
    }

    public AudioMix getAudioMix() {
        return this.audioMix;
    }

    public String getAudioTimePitchAlgorithm() {
        return this.audioTimePitchAlgorithm;
    }

    public VideoCompositing getCustomVideoCompositor() {
        return this.customVideoCompositor;
    }

    public IDecoderFactory getDecoderFactory() {
        return this.decoderFactory;
    }

    public CMTime getDuration() {
        return this.duration;
    }

    public ErrorMsg getErrorMsg() {
        return this.errorMsg;
    }

    public CMTime getForwardPlaybackEndTime() {
        return this.forwardPlaybackEndTime;
    }

    public long getLaggingTime() {
        IDecoderTrack iDecoderTrack = this.realVDecoderTrack;
        if (iDecoderTrack != null) {
            return iDecoderTrack.getLaggingTime();
        }
        return 0;
    }

    public List<PlayerItemOutput> getOutputs() {
        return this.outputs;
    }

    public PlayerThreadAudio getPlayerThreadAudio() {
        return this.playerThreadAudio;
    }

    public PlayerThread getPlayerThreadMain() {
        return this.playerThreadMain;
    }

    public CGSize getPresentationSize() {
        return this.presentationSize == null ? this.asset.getNaturalSize() : new CGSize(16.0f, 16.0f);
    }

    public IDecoderTrack getRealDecoderTrack() {
        return this.realVDecoderTrack;
    }

    public CMTime getReversePlaybackEndTime() {
        return this.reversePlaybackEndTime;
    }

    public List<CMTimeRange> getSeekableTimeRanges() {
        return this.seekableTimeRanges;
    }

    public PlayerItemStatus getStatus() {
        return this.status;
    }

    public List<MetadataItem> getTimedMetadata() {
        return this.timedMetadata;
    }

    public List<PlayerItemTrack> getTracks() {
        return this.tracks;
    }

    public int getVideoApertureMode() {
        return this.videoApertureMode;
    }

    public VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public AudioCompositionDecoderTrack initAudioCompositionDecoderTrack() {
        this.audioCompositionDecoderTrack = new AudioCompositionDecoderTrack(2, this.decoderFactory);
        for (PlayerItemTrack next : this.tracks) {
            if (next != null && next.isEnabled() && next.getAssetTrack().getMediaType() == 2) {
                this.audioCompositionDecoderTrack.addTrack(next.getAssetTrack());
            }
        }
        this.audioCompositionDecoderTrack.setAudioMix(this.audioMix);
        return this.audioCompositionDecoderTrack;
    }

    public boolean isSeekingWaitsForVideoCompositionRendering() {
        return this.seekingWaitsForVideoCompositionRendering;
    }

    public void release() {
        PlayerLayer playerLayer = this.layer;
        if (playerLayer != null) {
            playerLayer.release();
        }
        AudioMix audioMix2 = this.audioMix;
        if (audioMix2 != null) {
            audioMix2.release();
        }
    }

    public void removeOutput(PlayerItemOutput playerItemOutput) {
        this.outputs.remove(playerItemOutput);
    }

    public void seekToTime(CMTime cMTime, Callback callback) {
        CMTime cMTime2 = CMTime.CMTimeZero;
        seekToTime(cMTime, cMTime2, cMTime2, callback);
    }

    public void setAudioMix(AudioMix audioMix2) {
        this.audioMix = audioMix2;
        AudioCompositionDecoderTrack audioCompositionDecoderTrack2 = this.audioCompositionDecoderTrack;
        if (audioCompositionDecoderTrack2 != null) {
            audioCompositionDecoderTrack2.setAudioMix(audioMix2);
        }
    }

    public void setAudioTimePitchAlgorithm(String str) {
        this.audioTimePitchAlgorithm = str;
    }

    public void setCustomVideoCompositor(VideoCompositing videoCompositing) {
        this.customVideoCompositor = videoCompositing;
    }

    public void setDecoderFactory(IDecoderFactory iDecoderFactory) {
        this.decoderFactory = iDecoderFactory;
    }

    public void setEnableLut(boolean z, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.enableLut = false;
            return;
        }
        this.enableLut = z;
        this.lutBitmap = bitmap;
        PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.setEnableLut(z, bitmap);
        }
    }

    public void setForwardPlaybackEndTime(CMTime cMTime) {
        this.forwardPlaybackEndTime = cMTime;
    }

    public void setOutputs(List<PlayerItemOutput> list) {
        this.outputs = list;
    }

    public void setRate(float f, int i) {
        this.rate = f;
        this.maxCacheSize = i;
        PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.setRate(f);
        }
    }

    public void setReversePlaybackEndTime(CMTime cMTime) {
        this.reversePlaybackEndTime = cMTime;
    }

    public void setSeekableTimeRanges(List<CMTimeRange> list) {
        this.seekableTimeRanges = list;
    }

    public void setSeekingWaitsForVideoCompositionRendering(boolean z) {
        this.seekingWaitsForVideoCompositionRendering = z;
    }

    public void setVideoApertureMode(int i) {
        this.videoApertureMode = i;
    }

    public void setVideoComposition(VideoComposition videoComposition2) {
        this.videoComposition = videoComposition2;
        if (videoComposition2 != null) {
            this.customVideoCompositor = videoComposition2.getCustomVideoCompositor();
        }
    }

    public void start(Player player2) {
        initVideoCompositionDecoderTrack();
        initAudioCompositionDecoderTrack();
        IDecoderTrack iDecoderTrack = this.layer == null ? null : this.vDecoderTrack;
        AudioCompositionDecoderTrack audioCompositionDecoderTrack2 = this.audioCompositionDecoderTrack;
        CGSize presentationSize2 = getPresentationSize();
        PlayerLayer playerLayer = this.layer;
        PlayerThread playerThread = new PlayerThread(iDecoderTrack, audioCompositionDecoderTrack2, presentationSize2, playerLayer == null ? null : playerLayer.getSurface(), player2.mMainHandler, player2);
        this.playerThreadMain = playerThread;
        playerThread.setEnableLut(this.enableLut, this.lutBitmap);
        this.playerThreadMain.setRate(this.rate);
        VideoComposition videoComposition2 = this.videoComposition;
        if (videoComposition2 != null) {
            this.playerThreadMain.setFrameDuration(videoComposition2.getFrameDuration());
        }
    }

    public void updateComposition(Asset asset2) {
        this.asset = asset2;
        this.tracks.clear();
        for (AssetTrack assetTrack : asset2.getTracks()) {
            PlayerItemTrack playerItemTrack = new PlayerItemTrack();
            playerItemTrack.setAssetTrack(assetTrack);
            playerItemTrack.setCurrentVideoFrameRate(getVideoFrameRate());
            playerItemTrack.setEnabled(true);
            this.tracks.add(playerItemTrack);
        }
    }

    public void updateDecoderTrack() {
        initVideoCompositionDecoderTrack();
        initAudioCompositionDecoderTrack();
    }

    public PlayerItem(Asset asset2) {
        this(asset2, new AssetExtension(AssetExtension.SCENE_PLAY));
    }

    public void seekToTime(CMTime cMTime, CMTime cMTime2, CMTime cMTime3, Callback callback) {
        PlayerThread playerThread = this.playerThreadMain;
        if (playerThread != null) {
            playerThread.updatePositionRightAway(cMTime);
            this.playerThreadMain.sendMessage(5, cMTime, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public PlayerItem(Asset asset2, AssetExtension assetExtension2) {
        this.status = PlayerItemStatus.PlayerItemStatusUnknown;
        this.tracks = new ArrayList();
        this.rate = 1.0f;
        this.layer = null;
        this.maxCacheSize = 60;
        this.asset = asset2;
        this.assetExtension = assetExtension2;
        for (AssetTrack assetTrack : asset2.getTracks()) {
            PlayerItemTrack playerItemTrack = new PlayerItemTrack();
            playerItemTrack.setAssetTrack(assetTrack);
            playerItemTrack.setCurrentVideoFrameRate(getVideoFrameRate());
            playerItemTrack.setEnabled(true);
            this.tracks.add(playerItemTrack);
        }
    }
}
