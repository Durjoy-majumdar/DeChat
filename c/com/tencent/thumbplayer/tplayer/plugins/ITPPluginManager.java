package com.tencent.thumbplayer.tplayer.plugins;

public interface ITPPluginManager extends ITPPluginBase {
    void addPlugin(ITPPluginBase iTPPluginBase);

    void release();

    void removePlugin(ITPPluginBase iTPPluginBase);
}
