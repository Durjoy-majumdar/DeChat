package com.tencent.xweb.skia_canvas;

public class SkiaCanvasLogic {
    private static boolean sInit;

    public static void init() {
        if (!sInit) {
            sInit = true;
            XWebLibraryLoader.beforeLoad();
            XWebLibraryLoader.load("c++_shared");
            XWebLibraryLoader.load("mmskia");
            XWebLibraryLoader.load("canvas");
            XWebLibraryLoader.load("skia-canvas");
            XWebLibraryLoader.afetrLoad();
        }
    }
}
