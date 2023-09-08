package com.tencent.tav.core.audio;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AudioExportTask implements IAudioExportTask {
    private static final String TAG = "AudioEncoderTask";
    private IAudioSource<? extends IDecoderTrack> mAsset;
    private ExportCallback mCallback;
    private List<AudioExportRunner> mEncoderList = new ArrayList();
    private String mOutSavePath;
    private HashMap<Integer, SegmentStatus> mProgressMap = new HashMap<>();
    private int mSegmentCount = 0;
    private String mSessionId = (new Random().nextLong() + "");

    public static class SegmentStatus {
        /* access modifiers changed from: private */
        public float mProgress;
        /* access modifiers changed from: private */
        public int mStatus;
        /* access modifiers changed from: private */
        public CMTimeRange mTimeRange;

        public SegmentStatus(int i, float f) {
            this.mStatus = i;
            this.mProgress = f;
        }

        public CMTimeRange getTimeRange() {
            return this.mTimeRange;
        }

        public void setTimeRange(CMTimeRange cMTimeRange) {
            this.mTimeRange = cMTimeRange;
        }
    }

    public AudioExportTask(IAudioSource<? extends IDecoderTrack> iAudioSource, String str) {
        this.mAsset = iAudioSource;
        this.mOutSavePath = str;
    }

    /* access modifiers changed from: private */
    public SegmentStatus createOrUpdateSegmentStatus(int i, int i2, float f) {
        Logger.m144641d(TAG, "createOrUpdateSegmentStatus index = " + i + " mStatus = " + i2 + " mProgress = " + f);
        if (this.mProgressMap.containsKey(Integer.valueOf(i))) {
            SegmentStatus segmentStatus = this.mProgressMap.get(Integer.valueOf(i));
            float unused = segmentStatus.mProgress = f;
            int unused2 = segmentStatus.mStatus = i2;
            return segmentStatus;
        }
        SegmentStatus segmentStatus2 = new SegmentStatus(i2, f);
        this.mProgressMap.put(Integer.valueOf(i), segmentStatus2);
        return segmentStatus2;
    }

    private SegmentStatus createSegmentStatus(int i, CMTimeRange cMTimeRange) {
        SegmentStatus segmentStatus = new SegmentStatus(0, 0.0f);
        CMTimeRange unused = segmentStatus.mTimeRange = cMTimeRange;
        this.mProgressMap.put(Integer.valueOf(i), segmentStatus);
        return segmentStatus;
    }

    private void exportAudio(CMTimeRange cMTimeRange, final int i) {
        Logger.m144641d(TAG, "exportAudio timeRange = " + cMTimeRange + " index = " + i);
        AudioExportRunner audioExportRunner = new AudioExportRunner(this.mAsset, cMTimeRange);
        audioExportRunner.setSavePath(EncoderUtils.getAudioOutSaveFilePath(this.mOutSavePath, i, this.mSessionId));
        audioExportRunner.setCallback(new ExportCallback() {
            public void onProgress(int i, float f) {
                synchronized (AudioExportTask.this) {
                    SegmentStatus unused = AudioExportTask.this.createOrUpdateSegmentStatus(i, i, f);
                    AudioExportTask.this.notifyProgressAndStatusUpdate();
                }
            }
        });
        try {
            audioExportRunner.prepare();
            audioExportRunner.start();
            this.mEncoderList.add(audioExportRunner);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: private */
    public void notifyProgressAndStatusUpdate() {
        if (this.mProgressMap.size() != 0) {
            float f = 0.0f;
            float f2 = (float) this.mSegmentCount;
            int i = 0;
            for (Map.Entry next : this.mProgressMap.entrySet()) {
                f += ((SegmentStatus) next.getValue()).mProgress;
                i |= ((SegmentStatus) next.getValue()).mStatus;
            }
            float f3 = f / f2;
            Logger.m144646i(TAG, " mStatus = " + i + " mProgress = " + f3);
            if (i == 255) {
                onProgress(255, f3);
                EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
                new File(this.mOutSavePath).delete();
            } else if (i >= 4) {
                onProgress(4, f3);
                EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
                new File(this.mOutSavePath).delete();
            } else if (i == 2) {
                if (EncoderUtils.mergeAllFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId)) {
                    onProgress(2, 1.0f);
                } else {
                    onProgress(255, 1.0f);
                }
                EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
            } else if (i >= 1) {
                onProgress(1, f3);
            } else {
                onProgress(0, f3);
            }
        }
    }

    private void onProgress(int i, float f) {
        ExportCallback exportCallback = this.mCallback;
        if (exportCallback != null) {
            exportCallback.onProgress(i, f);
        }
    }

    public void cancel() {
        for (AudioExportRunner cancel : this.mEncoderList) {
            cancel.cancel();
        }
    }

    public CMTime getDuration() {
        IAudioSource<? extends IDecoderTrack> iAudioSource = this.mAsset;
        return iAudioSource != null ? iAudioSource.getDuration() : CMTime.CMTimeZero;
    }

    public void setExportCallback(ExportCallback exportCallback) {
        this.mCallback = exportCallback;
    }

    public void start() {
        this.mProgressMap.clear();
        this.mEncoderList.clear();
        long timeUs = getDuration().getTimeUs();
        long j = (long) AudioExportSession.SEGMENT_DURATION_US;
        this.mSessionId = System.currentTimeMillis() + "";
        this.mSegmentCount = (int) (((timeUs + j) - 1) / j);
        long j2 = 0;
        int i = 0;
        int i2 = 1;
        while (i < this.mSegmentCount) {
            long j3 = j2 + j;
            createSegmentStatus(i2, new CMTimeRange(CMTime.fromUs(j2), CMTime.fromUs(j3 > timeUs ? timeUs - j2 : j)));
            i2++;
            i++;
            j2 = j3;
        }
        int i3 = 1;
        for (Map.Entry<Integer, SegmentStatus> value : this.mProgressMap.entrySet()) {
            exportAudio(((SegmentStatus) value.getValue()).mTimeRange, i3);
            i3++;
        }
    }

    public AudioExportTask(String str) {
        this.mOutSavePath = str;
    }
}
