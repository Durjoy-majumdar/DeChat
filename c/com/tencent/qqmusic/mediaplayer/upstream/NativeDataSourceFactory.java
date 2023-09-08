package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;

public class NativeDataSourceFactory {
    private static final String TAG = "NativeDataSourceFactory";
    /* access modifiers changed from: private */
    public static final boolean soLoaded;

    static {
        boolean loadAll = NativeLibs.loadAll((Iterable<NativeLibs>) Arrays.asList(new NativeLibs[]{NativeLibs.audioCommon, NativeLibs.formatDetector, NativeLibs.codecFactory, NativeLibs.decoderJni, NativeLibs.cppShared, NativeLibs.stlportShared, NativeLibs.xlog, NativeLibs.xFFmpeg}));
        soLoaded = loadAll;
        if (!loadAll) {
            Logger.m21787e(TAG, "[static initializer] failed to load so!");
        }
    }

    public static INativeDataSource fileDataSource(final String str) {
        return new INativeDataSource() {
            public AudioFormat.AudioType getAudioType() {
                return null;
            }

            public long getNativeInstance() {
                if (NativeDataSourceFactory.soLoaded) {
                    try {
                        return NativeDataSourceFactory.localFile(str, 0);
                    } catch (Throwable th) {
                        Logger.m21788e(NativeDataSourceFactory.TAG, "[getNativeInstance] failed to create native data source!", th);
                        return 0;
                    }
                } else {
                    Logger.m21793w(NativeDataSourceFactory.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0;
                }
            }
        };
    }

    public static native long localFile(String str, int i);

    public static INativeDataSource fileDataSource(final String str, final int i) {
        return new INativeDataSource() {
            public AudioFormat.AudioType getAudioType() {
                return null;
            }

            public long getNativeInstance() {
                if (NativeDataSourceFactory.soLoaded) {
                    try {
                        return NativeDataSourceFactory.localFile(str, i > 0 ? 1 : 0);
                    } catch (Throwable th) {
                        Logger.m21788e(NativeDataSourceFactory.TAG, "[getNativeInstance] failed to create native data source!", th);
                        return 0;
                    }
                } else {
                    Logger.m21793w(NativeDataSourceFactory.TAG, "[getNativeInstance] so not loaded properly!");
                    return 0;
                }
            }
        };
    }
}
