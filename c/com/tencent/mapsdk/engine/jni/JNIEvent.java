package com.tencent.mapsdk.engine.jni;

import java.util.Arrays;

public class JNIEvent {
    public byte[] data;
    public Object extra;

    /* renamed from: id */
    public int f339614id;
    public String name;

    public String toString() {
        return "JNIEvent{id=" + this.f339614id + ", name='" + this.name + '\'' + ", data=" + Arrays.toString(this.data) + ", extra=" + this.extra + '}';
    }
}
