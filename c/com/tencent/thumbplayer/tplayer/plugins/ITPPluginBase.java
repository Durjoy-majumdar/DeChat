package com.tencent.thumbplayer.tplayer.plugins;

public interface ITPPluginBase {
    void onAttach();

    void onDetach();

    void onEvent(int i, int i2, int i3, String str, Object obj);
}
