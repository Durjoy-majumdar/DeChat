package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

public class NativeSeekTable implements SeekTable {
    private final BaseDecoder nativeDecoder;

    public NativeSeekTable(BaseDecoder baseDecoder) {
        this.nativeDecoder = baseDecoder;
    }

    public void parse(IDataSource iDataSource) {
    }

    public long seek(long j) {
        return this.nativeDecoder.getBytePositionOfTime(j);
    }
}
