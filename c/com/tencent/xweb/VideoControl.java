package com.tencent.xweb;

public interface VideoControl {
    boolean supportSetRequestedOrientationCallback();

    void videoChangeStatus();

    void videoExitFullscreen();

    void videoMute(boolean z);

    void videoPause();

    void videoPlay();

    void videoPlaybackRate(double d);

    void videoSeek(double d);
}
