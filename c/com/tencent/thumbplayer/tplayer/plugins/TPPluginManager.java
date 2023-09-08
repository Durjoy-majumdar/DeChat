package com.tencent.thumbplayer.tplayer.plugins;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TPPluginManager implements ITPPluginManager {
    private CopyOnWriteArrayList<ITPPluginBase> mPluginList = new CopyOnWriteArrayList<>();

    public void addPlugin(ITPPluginBase iTPPluginBase) {
        CopyOnWriteArrayList<ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(iTPPluginBase)) {
            iTPPluginBase.onAttach();
            this.mPluginList.add(iTPPluginBase);
        }
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onEvent(int i, int i2, int i3, String str, Object obj) {
        CopyOnWriteArrayList<ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList != null) {
            Iterator<ITPPluginBase> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ITPPluginBase next = it.next();
                if (next != null) {
                    next.onEvent(i, i2, i3, str, obj);
                }
            }
        }
    }

    public void release() {
        CopyOnWriteArrayList<ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList != null) {
            Iterator<ITPPluginBase> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ITPPluginBase next = it.next();
                if (next != null) {
                    next.onDetach();
                }
            }
            this.mPluginList.clear();
        }
        this.mPluginList = null;
    }

    public void removePlugin(ITPPluginBase iTPPluginBase) {
        if (this.mPluginList != null) {
            iTPPluginBase.onDetach();
            this.mPluginList.remove(iTPPluginBase);
        }
    }
}
