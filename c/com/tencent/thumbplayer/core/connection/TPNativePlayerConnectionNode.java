package com.tencent.thumbplayer.core.connection;

import java.util.HashMap;

public class TPNativePlayerConnectionNode {
    private HashMap<Integer, HashMap<Integer, Long>> mLongMap;

    public TPNativePlayerConnectionNode() {
        this.mLongMap = null;
        this.mLongMap = new HashMap<>();
    }

    public boolean addAction(int i) {
        if (this.mLongMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        this.mLongMap.put(Integer.valueOf(i), new HashMap());
        return true;
    }

    public void removeAction(int i) {
        if (this.mLongMap.containsKey(Integer.valueOf(i))) {
            this.mLongMap.remove(Integer.valueOf(i));
        }
    }

    public boolean setLongActionConfig(int i, int i2, long j) {
        if (!this.mLongMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        this.mLongMap.get(Integer.valueOf(i)).put(Integer.valueOf(i2), Long.valueOf(j));
        return true;
    }
}
