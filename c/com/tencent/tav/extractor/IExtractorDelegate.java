package com.tencent.tav.extractor;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

public interface IExtractorDelegate {
    boolean advance();

    long getSampleTime();

    int getSampleTrackIndex();

    int getTrackCount();

    MediaFormat getTrackFormat(int i);

    boolean needMirror();

    int readSampleData(ByteBuffer byteBuffer, int i);

    void release();

    void seekTo(long j, int i);

    void selectTrack(int i);

    void setDataSource(String str);

    void setIsSoft(boolean z);

    void unselectTrack(int i);
}
