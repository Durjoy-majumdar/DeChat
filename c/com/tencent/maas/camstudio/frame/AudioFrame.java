package com.tencent.maas.camstudio.frame;

import java.nio.ByteBuffer;

public interface AudioFrame extends Frame {
    ByteBuffer getAudioData();

    int getChannelCount();

    int getSampleCountPerChannel();

    int getSampleFormat();

    int getSampleRate();
}
