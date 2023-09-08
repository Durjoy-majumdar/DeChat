package com.tencent.wechat.aff.ting;

public class TingPlayModeManager {
    private static TingPlayModeManager instance = new TingPlayModeManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onRandomPlaylistChangedEvent(boolean z);

        void onSetRandomPlaylistComplete(int i);
    }

    private TingPlayModeManager() {
        jniCreateTingPlayModeManager();
    }

    public static TingPlayModeManager getInstance() {
        return instance;
    }

    private native void jniCreateTingPlayModeManager();

    private native boolean jniGetRandomPlaylist();

    private native void jniSetCallback(Object obj);

    private native void jniSetRandomPlaylistAsync(int i, boolean z);

    public boolean getRandomPlaylist() {
        return jniGetRandomPlaylist();
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setRandomPlaylistAsync(int i, boolean z) {
        jniSetRandomPlaylistAsync(i, z);
    }
}
