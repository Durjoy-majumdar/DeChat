package com.tencent.mars.sdt;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class SdtLogic {
    private static final String TAG = "mars.SdtLogic";
    private static ICallBack callBack = null;

    public interface ICallBack {
    }

    static {
        ArrayList<String> arrayList;
        try {
            arrayList = getLoadLibraries();
        } catch (UnsatisfiedLinkError unused) {
            Mars.loadDefaultMarsLibrary();
            arrayList = null;
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    private static native ArrayList<String> getLoadLibraries();

    private static void reportSignalDetectResults(String str) {
    }

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setHttpNetcheckCGI(String str);
}
