package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

class TrackPositionDataSource {
    private final IDataSource mDataSource;
    private long mPosition = 0;

    public TrackPositionDataSource(IDataSource iDataSource) {
        this.mDataSource = iDataSource;
    }

    public long getCurPosition() {
        return this.mPosition;
    }

    public long getSize() {
        return this.mDataSource.getSize();
    }

    public int read(byte[] bArr, int i) {
        int readAt = this.mDataSource.readAt(this.mPosition, bArr, 0, i);
        this.mPosition += (long) readAt;
        return readAt;
    }

    public long seek(long j) {
        if (j >= this.mDataSource.getSize()) {
            return -1;
        }
        this.mPosition = j;
        return j;
    }
}
