package com.tencent.qqmusic.mediaplayer;

import android.os.Looper;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class TrackCorePlayer extends CorePlayer implements TrackDataSource.TrackStateCallback {
    private static final String TAG = "TrackCorePlayer";
    private long mStartPosition = 0;

    public TrackCorePlayer(IDataSource iDataSource, PlayerCallback playerCallback, Looper looper, QMThreadExecutor qMThreadExecutor) {
        super(iDataSource, (INativeDataSource) null, playerCallback, looper, new NativeDecoder(), qMThreadExecutor);
    }

    public long getCurPosition() {
        return super.getCurPosition() - this.mStartPosition;
    }

    public void onTrackPrepared(TrackInfo trackInfo) {
        this.mStartPosition = ((Long) trackInfo.getRange().first).longValue();
        long longValue = ((Long) trackInfo.getRange().second).longValue();
        long longValue2 = ((Long) trackInfo.getRange().first).longValue();
        Logger.m21791i(TAG, "onTrackPrepared, start byte: " + longValue2 + ", end byte: " + longValue);
        this.mInformation.setDuration(longValue - longValue2);
    }

    public void seek(int i) {
        int i2 = (int) (((long) i) + this.mStartPosition);
        Logger.m21791i(TAG, "seek, position: " + i + " ,realseek: " + i2);
        super.seek(i2);
    }
}
