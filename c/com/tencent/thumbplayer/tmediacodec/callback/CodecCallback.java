package com.tencent.thumbplayer.tmediacodec.callback;

public interface CodecCallback {
    void onCreate(Boolean bool);

    void onRealRelease();

    void onReuseCodecAPIException(String str, Throwable th);

    void onStarted(Boolean bool, String str);

    void onTransToKeepPool();

    void onTransToRunningPool();
}
