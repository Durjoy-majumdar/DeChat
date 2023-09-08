package com.tencent.maas.camstudio.frame;

public interface VideoFrame extends Frame {
    int accessibility();

    int getFrameCWAngle();

    int getHeight();

    int getWidth();

    boolean isMirrored();

    void release();
}
