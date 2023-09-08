package org.libpag;

import a34.C79461a;
import android.content.res.AssetManager;

public class PAGFile extends PAGComposition {
    static {
        C79461a.m96419a("pag");
        nativeInit();
    }

    private PAGFile(long j) {
        super(j);
    }

    public static PAGFile Load(String str) {
        return LoadFromPath(str);
    }

    private static native PAGFile LoadFromAssets(AssetManager assetManager, String str);

    private static native PAGFile LoadFromBytes(byte[] bArr, int i);

    private static native PAGFile LoadFromPath(String str);

    public static native int MaxSupportedTagLevel();

    private static final native void nativeInit();

    public native PAGFile copyOriginal();

    public native int[] getEditableIndices(int i);

    public native PAGLayer[] getLayersByEditableIndex(int i, int i2);

    public native PAGText getTextData(int i);

    public native void nativeReplaceImage(int i, long j);

    public native int numImages();

    public native int numTexts();

    public native int numVideos();

    public native String path();

    public void replaceImage(int i, PAGImage pAGImage) {
        if (pAGImage == null) {
            nativeReplaceImage(i, 0);
        } else {
            nativeReplaceImage(i, pAGImage.nativeContext);
        }
    }

    public native void replaceText(int i, PAGText pAGText);

    public native void setDuration(long j);

    public native void setTimeStretchMode(int i);

    public native int tagLevel();

    public native int timeStretchMode();

    public static PAGFile Load(byte[] bArr) {
        return LoadFromBytes(bArr, bArr.length);
    }

    public static PAGFile Load(AssetManager assetManager, String str) {
        return LoadFromAssets(assetManager, str);
    }
}
