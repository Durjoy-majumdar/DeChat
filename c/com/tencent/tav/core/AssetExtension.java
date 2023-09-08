package com.tencent.tav.core;

import java.util.concurrent.ConcurrentHashMap;

public class AssetExtension {
    public static final String SCENE_EXPORT = "export";
    public static final String SCENE_PLAY = "play";
    public static final String SCENE_THUMBNAIL = "thumbnail";
    private volatile ConcurrentHashMap<String, Object> extensionMap = new ConcurrentHashMap<>();
    private final String scene;

    public AssetExtension(String str) {
        this.scene = str;
    }

    public void addExtension(String str, Object obj) {
        this.extensionMap.put(str, obj);
    }

    public boolean containsKey(String str) {
        return this.extensionMap.containsKey(str);
    }

    public boolean containsValue(String str) {
        return this.extensionMap.containsValue(str);
    }

    public String getScene() {
        return this.scene;
    }

    public Object remove(String str) {
        return this.extensionMap.remove(str);
    }
}
