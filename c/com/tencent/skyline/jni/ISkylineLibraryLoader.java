package com.tencent.skyline.jni;

public interface ISkylineLibraryLoader {
    boolean afterLoad();

    boolean beforeLoad();

    boolean load(String str);
}
