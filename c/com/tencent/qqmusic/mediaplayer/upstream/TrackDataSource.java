package com.tencent.qqmusic.mediaplayer.upstream;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;

public class TrackDataSource implements IDataSource, PlayerListenerCallback {
    private static final String TAG = "TrackDataSource";
    private IDataSource mDataSource;
    private long mEndBytePosition;
    private long mStartBytePosition;
    private long mStartTimePosition;
    private TrackInfo mTrackInfo;
    private TrackStateCallback mTrackStateCallback;

    public interface TrackStateCallback {
        void onTrackPrepared(TrackInfo trackInfo);
    }

    public TrackDataSource(TrackInfo trackInfo) {
        String uri = trackInfo.getUri();
        if (TextUtils.isEmpty(trackInfo.getUri())) {
            throw new DataSourceException(-1, "track info has no media file path!", (Throwable) null);
        } else if (new File(uri).exists()) {
            this.mDataSource = new FileDataSource(trackInfo.getUri());
            this.mTrackInfo = trackInfo;
        } else {
            throw new DataSourceException(-1, "track info's media file not exists!", (Throwable) null);
        }
    }

    public void close() {
        this.mDataSource.close();
    }

    public AudioFormat.AudioType getAudioType() {
        return this.mDataSource.getAudioType();
    }

    public long getSize() {
        return this.mDataSource.getSize();
    }

    public void onBufferingUpdate(BaseMediaPlayer baseMediaPlayer, int i) {
    }

    public void onCompletion(BaseMediaPlayer baseMediaPlayer) {
    }

    public void onError(BaseMediaPlayer baseMediaPlayer, int i, int i2, int i3) {
    }

    public void onPrepared(BaseMediaPlayer baseMediaPlayer) {
        SeekTable seekTable;
        try {
            this.mDataSource.open();
            long size = this.mDataSource.getSize();
            try {
                seekTable = baseMediaPlayer.createSeekTable();
            } catch (IllegalStateException e) {
                Logger.m21788e(TAG, "createSeekTable ex occurred!!", (Throwable) e);
                seekTable = null;
            }
            if (seekTable == null) {
                Logger.m21787e(TAG, "createSeekTable is null, return");
                return;
            }
            Pair<Long, Long> range = this.mTrackInfo.getRange();
            Logger.m21791i(TAG, "start time: " + range.first + ", end time: " + range.second);
            if (((Long) range.first).longValue() > ((Long) range.second).longValue()) {
                Logger.m21787e(TAG, "start range larger, return");
                return;
            }
            this.mStartTimePosition = ((Long) range.first).longValue();
            long seek = seekTable.seek(((Long) range.first).longValue());
            long seek2 = seekTable.seek(((Long) range.second).longValue());
            int i = (size > 0 ? 1 : (size == 0 ? 0 : -1));
            if (i <= 0 || seek <= size) {
                if (i <= 0 || seek2 <= size) {
                    size = seek2;
                }
                this.mStartBytePosition = seek;
                this.mEndBytePosition = size;
                Logger.m21791i(TAG, "start byte: " + this.mStartBytePosition + ", end byte: " + this.mEndBytePosition);
                TrackStateCallback trackStateCallback = this.mTrackStateCallback;
                if (trackStateCallback != null) {
                    trackStateCallback.onTrackPrepared(this.mTrackInfo);
                    return;
                }
                return;
            }
            Logger.m21787e(TAG, "startBytePosition larger than size!");
        } catch (IOException e2) {
            Logger.m21788e(TAG, "dataSource open failed!", (Throwable) e2);
        }
    }

    public void onSeekComplete(BaseMediaPlayer baseMediaPlayer, int i) {
    }

    public void onStarted(BaseMediaPlayer baseMediaPlayer) {
        baseMediaPlayer.seekTo(0);
    }

    public void onStateChanged(BaseMediaPlayer baseMediaPlayer, int i) {
    }

    public void open() {
        this.mDataSource.open();
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        long j2 = this.mEndBytePosition;
        if (j2 <= 0 || j <= j2) {
            return this.mDataSource.readAt(j, bArr, i, i2);
        }
        return -1;
    }

    public void setEndBytePosition(long j) {
        this.mEndBytePosition = j;
    }

    public void setTrackStateCallback(TrackStateCallback trackStateCallback) {
        this.mTrackStateCallback = trackStateCallback;
    }
}
