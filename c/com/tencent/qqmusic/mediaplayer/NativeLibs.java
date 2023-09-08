package com.tencent.qqmusic.mediaplayer;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;

public enum NativeLibs {
    nlog("NLog", 1),
    audioCommon("audio_common", 1),
    QmNativeDataSource("QmNativeDataSource", 1),
    formatDetector("FormatDetector", 1),
    codecFactory("codec_factory", 3),
    decoderJni("qqmusic_decoder_jni", 3),
    xFFmpeg("xffmpeg", 3),
    cppShared("c++_shared", 3),
    stlportShared("stlport_shared", 3),
    xlog("wechatxlog", 3);
    
    private static final SparseArray<String> SUFFIX = null;
    private static final String TAG = "NativeLibs";
    private boolean mHasLoadSoSuccess;
    private final String name;
    private final long supportedAbi;

    /* access modifiers changed from: public */
    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        SUFFIX = sparseArray;
        sparseArray.put(1, "");
        sparseArray.put(2, "");
    }

    private NativeLibs(String str, long j) {
        this.name = str;
        this.supportedAbi = j;
    }

    public static boolean loadAll(NativeLibs... nativeLibsArr) {
        return loadAll((Iterable<NativeLibs>) Arrays.asList(nativeLibsArr));
    }

    private boolean loadLibrary(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Logger.m21791i(TAG, "[loadLibrary] loading: " + str);
            z = AudioPlayerConfigure.getSoLibraryLoader().load(str);
        } catch (Throwable th) {
            Logger.m21788e(TAG, "[loadLibrary] failed: " + str, th);
        }
        if (z) {
            Logger.m21791i(TAG, "[loadLibrary] succeed: " + str);
        } else {
            Logger.m21787e(TAG, "[loadLibrary] failed: " + str);
        }
        return z;
    }

    public String getName() {
        return this.name;
    }

    public boolean load() {
        if (this.mHasLoadSoSuccess) {
            return true;
        }
        boolean loadLibrary = loadLibrary(getName());
        this.mHasLoadSoSuccess = loadLibrary;
        return loadLibrary;
    }

    public boolean supportAbi(int i) {
        long j = (long) i;
        return (this.supportedAbi & j) == j;
    }

    public static boolean loadAll(Iterable<NativeLibs> iterable) {
        for (NativeLibs load : iterable) {
            if (!load.load()) {
                return false;
            }
        }
        return true;
    }
}
