package com.tencent.p014mm.plugin.music.player.base;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.ILog;
import com.tencent.qqmusic.mediaplayer.ISoLibraryLoader;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.music.player.base.AudioPlayerUtils */
public class AudioPlayerUtils {

    /* renamed from: a */
    public static C18951f f53178a = new DefaultMusicLoadLibrary((C18949a) null);

    /* renamed from: b */
    public static boolean f53179b = false;

    /* renamed from: c */
    public static boolean f53180c = false;

    /* renamed from: com.tencent.mm.plugin.music.player.base.AudioPlayerUtils$b */
    public class C18948b implements ISoLibraryLoader {
        public String findLibPath(String str) {
            C18951f fVar = AudioPlayerUtils.f53178a;
            if (fVar != null) {
                return fVar.findLibPath(str);
            }
            return null;
        }

        public boolean load(String str) {
            C18951f fVar = AudioPlayerUtils.f53178a;
            if (fVar != null) {
                return fVar.load(str);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.player.base.AudioPlayerUtils$a */
    public class C18949a implements ILog {
        /* renamed from: d */
        public void mo24102d(String str, String str2) {
            Log.m105918d(str, str2);
        }

        /* renamed from: e */
        public void mo24103e(String str, String str2) {
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo24107i(String str, String str2) {
            Log.m105924i(str, str2);
        }

        /* renamed from: w */
        public void mo24109w(String str, String str2) {
            Log.m105928w(str, str2);
        }

        /* renamed from: e */
        public void mo24106e(String str, Throwable th) {
            Log.printErrStackTrace(str, th, " throwable", new Object[0]);
        }

        /* renamed from: i */
        public void mo24108i(String str, String str2, Throwable th) {
            Log.printErrStackTrace(str, th, str2, new Object[0]);
        }

        /* renamed from: e */
        public void mo24104e(String str, String str2, Throwable th) {
            Log.printErrStackTrace(str, th, str2, new Object[0]);
        }

        /* renamed from: e */
        public void mo24105e(String str, String str2, Object... objArr) {
            Log.m105920e(str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static synchronized boolean m19993a() {
        synchronized (AudioPlayerUtils.class) {
            if (f53179b) {
                return true;
            }
            C18951f fVar = f53178a;
            if (fVar == null) {
                return false;
            }
            NativeLibs nativeLibs = NativeLibs.nlog;
            fVar.load(nativeLibs.getName());
            f53178a.load(NativeLibs.audioCommon.getName());
            if (f53178a.checkLoaded(nativeLibs.getName())) {
                try {
                    f53179b = AudioPlayerConfigure.enableNativeLog((String) null);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.Audio.AudioPlayerUtils", th, "checkNLogLoad", new Object[0]);
                    if (C11171e.m11044a(20)) {
                        f53179b = AudioPlayerConfigure.enableNativeLog((String) null);
                    } else {
                        throw th;
                    }
                }
                if (f53179b) {
                    Log.m105924i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog success");
                }
                boolean z = f53179b;
                return z;
            }
            Log.m105924i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog fail");
            return false;
        }
    }

    /* renamed from: b */
    public static void m19994b() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerUtils", "configQQMusicSdkConfig");
        AudioPlayerConfigure.setLog(new C18949a());
        AudioPlayerConfigure.setSoLibraryLoader(new C18948b());
        if (!f53179b && !f53180c) {
            f53180c = true;
            ThreadPool.post(new C18950a(), "audio load NLog");
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.player.base.AudioPlayerUtils$DefaultMusicLoadLibrary */
    public static class DefaultMusicLoadLibrary implements C18951f {
        private byte _hellAccFlag_;
        private HashMap<String, Boolean> soLoaded;

        private DefaultMusicLoadLibrary() {
            this.soLoaded = new HashMap<>();
        }

        public boolean checkLoaded(String str) {
            return this.soLoaded.containsKey(str);
        }

        public String findLibPath(String str) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerUtils", "findLibPath %s", str);
            if (!str.startsWith("lib")) {
                str = "lib" + str;
            }
            if (str.endsWith(".so")) {
                return str;
            }
            return str + ".so";
        }

        public boolean load(String str) {
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name is null");
                return false;
            } else if (!this.soLoaded.containsKey(str) || !this.soLoaded.get(str).booleanValue()) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(str);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/music/player/base/AudioPlayerUtils$DefaultMusicLoadLibrary", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/plugin/music/player/base/AudioPlayerUtils$DefaultMusicLoadLibrary", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                this.soLoaded.put(str, Boolean.TRUE);
                return true;
            } else {
                Log.m105921e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name %s is loaded", str);
                return true;
            }
        }

        public /* synthetic */ DefaultMusicLoadLibrary(C18949a aVar) {
            this();
        }
    }
}
