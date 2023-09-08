package com.tencent.tav.asset;

import android.graphics.Matrix;
import android.media.MediaFormat;
import com.tencent.tav.asset.AssetTrack;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.extractor.ExtractorUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public abstract class Asset<Track extends AssetTrack> implements AsynchronousKeyValueLoading {
    public static final String TAG = "Asset";
    private boolean canContainFragments;
    private boolean composable;
    private boolean containsFragments;
    private CMTime duration = CMTime.CMTimeZero;
    private boolean exportable;
    public AssetExtractor extractor;
    private int extractorRetryCount = 3;
    private boolean hasProtectedContent;
    private String lyrics;
    private MediaFormat mediaFormat;
    private int mirror = 0;
    public CGSize naturalSize;
    private CMTime overallDurationHint;
    private boolean playable;
    public int preferRotation = 0;
    private float preferredRate = 1.0f;
    private Matrix preferredTransform;
    public float preferredVolume = 1.0f;
    private boolean providesPreciseDurationAndTiming;
    private boolean readable;
    public int trackCount = 0;
    public int trackIndex = 0;
    public List<Track> tracks;

    public Asset() {
    }

    private void initMembers() {
        this.trackCount = this.extractor.getTrackCount();
        this.duration = getDuration();
        this.naturalSize = ExtractorUtils.getVideoSize(this.extractor);
        int preferRotation2 = ExtractorUtils.getPreferRotation(this.extractor);
        this.preferRotation = preferRotation2;
        if (preferRotation2 != 0) {
            this.preferredTransform = new Matrix();
            while (true) {
                int i = this.preferRotation;
                if (i < 0) {
                    this.preferRotation = i + 4;
                } else {
                    int i2 = i % 4;
                    this.preferRotation = i2;
                    Matrix matrix = this.preferredTransform;
                    CGSize cGSize = this.naturalSize;
                    DecoderUtils.getRotationMatrix(matrix, i2, cGSize.width, cGSize.height);
                    return;
                }
            }
        }
    }

    private void tryInitMembers() {
        int i = this.extractorRetryCount;
        this.extractorRetryCount = i - 1;
        if (i > 0) {
            try {
                initMembers();
            } catch (Exception e) {
                Logger.m144644e(TAG, "Asset: initMembers failed, path = " + getSourcePath(), (Throwable) e);
                trySleep(100);
                tryInitMembers();
            }
            Logger.m144648v(TAG, "tryInitMembers: try count = " + (3 - this.extractorRetryCount));
        }
    }

    private void trySleep(int i) {
        try {
            Thread.sleep((long) i);
        } catch (Exception e) {
            Logger.m144644e(TAG, "tryInitMembers: Thread.sleep(100) ", (Throwable) e);
        }
    }

    public synchronized void cancelLoading() {
    }

    public void createTracks() {
        int trackCount2 = this.extractor.getTrackCount();
        if (this.tracks == null) {
            this.tracks = new ArrayList();
        }
        for (int i = 0; i < trackCount2; i++) {
            String string = this.extractor.getTrackFormat(i).getString("mime");
            if (string.startsWith("video/")) {
                int i2 = this.trackIndex;
                this.trackIndex = i2 + 1;
                AssetTrack assetTrack = new AssetTrack(this, i2, 1, new CMTimeRange(CMTime.CMTimeZero, getVideoDuration()));
                assetTrack.setPreferredTransform(this.preferredTransform);
                assetTrack.setPreferredRotation(this.preferRotation);
                this.tracks.add(assetTrack);
            } else if (string.startsWith("audio/")) {
                int i3 = this.trackIndex;
                this.trackIndex = i3 + 1;
                AssetTrack assetTrack2 = new AssetTrack(this, i3, 2, new CMTimeRange(CMTime.CMTimeZero, getAudioDuration()));
                assetTrack2.setPreferredVolume(this.preferredVolume);
                this.tracks.add(assetTrack2);
            }
        }
        Logger.m144641d(TAG, "Asset createTracks finish, has track count: " + this.tracks);
    }

    public CMTime getAudioDuration() {
        return TimeUtil.us2CMTime(this.extractor.getAudioDuration());
    }

    public synchronized CMTime getDuration() {
        CMTime cMTime = this.duration;
        if (cMTime == null || cMTime.equalsTo(CMTime.CMTimeZero)) {
            CMTime videoDuration = getVideoDuration();
            if (CMTime.CMTimeZero.equalsTo(videoDuration)) {
                videoDuration = getAudioDuration();
            }
            this.duration = videoDuration;
        }
        return this.duration;
    }

    public synchronized AssetExtractor getExtractor() {
        return this.extractor;
    }

    public String getLyrics() {
        return this.lyrics;
    }

    public MediaFormat getMediaFormat() {
        return this.mediaFormat;
    }

    public CGSize getNaturalSize() {
        return this.naturalSize;
    }

    public CMTime getOverallDurationHint() {
        return this.overallDurationHint;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public float getPreferredRate() {
        return this.preferredRate;
    }

    public Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public float getPreferredVolume() {
        return this.preferredVolume;
    }

    public synchronized String getSourcePath() {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public synchronized MediaFormat getTrackFormat(int i) {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getTrackFormat(i);
    }

    public List<Track> getTracks() {
        Logger.m144643e(TAG, "getTracks finish, has track count: " + this.tracks);
        return this.tracks;
    }

    public CMTime getVideoDuration() {
        return TimeUtil.us2CMTime(this.extractor.getDuration());
    }

    public boolean isCanContainFragments() {
        return this.canContainFragments;
    }

    public boolean isComposable() {
        return this.composable;
    }

    public boolean isContainsFragments() {
        return this.containsFragments;
    }

    public boolean isExportable() {
        return this.exportable;
    }

    public boolean isHasProtectedContent() {
        return this.hasProtectedContent;
    }

    public boolean isPlayable() {
        return this.playable;
    }

    public boolean isProvidesPreciseDurationAndTiming() {
        return this.providesPreciseDurationAndTiming;
    }

    public boolean isReadable() {
        return this.readable;
    }

    public void release() {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor != null) {
            assetExtractor.release();
        }
    }

    public synchronized void selectTrack(int i) {
        AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor != null) {
            assetExtractor.selectTrack(i);
        }
    }

    public AssetTrack trackWithTrackID(int i) {
        List<Track> list = this.tracks;
        if (list == null) {
            return null;
        }
        for (Track track : list) {
            if (track != null && track.getTrackID() == i) {
                return track;
            }
        }
        return null;
    }

    public List<AssetTrack> tracksWithMediaCharacteristic(String str) {
        return null;
    }

    public List<AssetTrack> tracksWithMediaType(int i) {
        if (this.tracks == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Track track : this.tracks) {
            if (track != null && track.getMediaType() == i) {
                arrayList.add(track);
            }
        }
        return arrayList;
    }

    public Asset(URL url) {
    }

    public Asset(String str) {
        AssetExtractor assetExtractor = new AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        tryInitMembers();
        createTracks();
    }
}
