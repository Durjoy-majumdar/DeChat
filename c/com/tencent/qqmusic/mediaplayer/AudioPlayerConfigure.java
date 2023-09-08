package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;
import j20.C117292a;
import k20.C9556a;

public class AudioPlayerConfigure {
    private static final String LIB_PREFIX = "lib";
    private static final String LIB_SUFFIX = ".so";
    private static final String TAG = "AudioPlayerConfigure";
    public static ISoLibraryLoader mISoLibraryLoader = new ISoLibraryLoader() {
        private byte _hellAccFlag_;

        public String findLibPath(String str) {
            if (!str.startsWith("lib")) {
                str = "lib" + str;
            }
            if (str.endsWith(AudioPlayerConfigure.LIB_SUFFIX)) {
                return str;
            }
            return str + AudioPlayerConfigure.LIB_SUFFIX;
        }

        public boolean load(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/qqmusic/mediaplayer/AudioPlayerConfigure$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        }
    };
    public static int minAudioTrackWaitTimeMs = 300;
    private static IAudioTrackCreator sAudioTrackCreator;
    private static boolean sIsNlogEnabled;

    public static boolean enableNativeLog(String str) {
        return enableNativeLog(NativeLibs.nlog.getName(), str);
    }

    private static byte[] findLibPath(byte[] bArr) {
        return mISoLibraryLoader.findLibPath(new String(bArr)).getBytes();
    }

    public static IAudioTrackCreator getAudioTrackCreator() {
        return sAudioTrackCreator;
    }

    public static ISoLibraryLoader getSoLibraryLoader() {
        return mISoLibraryLoader;
    }

    public static void setAudioTrackCreator(IAudioTrackCreator iAudioTrackCreator) {
        sAudioTrackCreator = iAudioTrackCreator;
    }

    public static void setAudioTrackMinWaitTimeMs(int i) {
        minAudioTrackWaitTimeMs = i;
    }

    public static void setLog(ILog iLog) {
        if (iLog != null) {
            iLog.mo24107i(TAG, "QQMusicAudioPlayer codec version:1.30.19");
        }
        Logger.setLog(iLog);
    }

    public static void setSoLibraryLoader(ISoLibraryLoader iSoLibraryLoader) {
        if (iSoLibraryLoader != null) {
            mISoLibraryLoader = iSoLibraryLoader;
        }
    }

    public static boolean enableNativeLog(String str, String str2) {
        if (sIsNlogEnabled) {
            return true;
        }
        String findLibPath = getSoLibraryLoader().findLibPath(str);
        Logger.m21791i(TAG, "[enableNativeLog] loading log lib: " + findLibPath);
        boolean z = str2 == null;
        if (!NLog.init(str, str2, 0) || NativeLog.init(findLibPath) != 0) {
            Logger.m21787e(TAG, "[enableNativeLog] failed");
        } else {
            sIsNlogEnabled = true;
            NLog.setWriteCallback(z);
            Logger.m21791i(TAG, "[enableNativeLog] succeed");
        }
        return sIsNlogEnabled;
    }
}
