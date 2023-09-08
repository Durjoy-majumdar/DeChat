package com.tencent.p014mm.plugin.music.model.player;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.music.player.base.AudioPlayerUtils;
import com.tencent.p014mm.plugin.music.player.base.C18951f;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.music.model.player.WechatMusicLoadLibrary */
public class WechatMusicLoadLibrary implements C18951f {
    private static final String TAG = "MicroMsg.Music.WechatMusicLoadLibrary";

    public boolean checkLoaded(String str) {
        return C88957l.m111068d(str);
    }

    public String findLibPath(String str) {
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
            Log.m105920e(TAG, "LoadLibrary lib_name is null");
            return false;
        } else if (C88957l.m111068d(str)) {
            return true;
        } else {
            Log.m105925i(TAG, "load library %s", str);
            ClassLoader classLoader = AudioPlayerUtils.class.getClassLoader();
            String g = C88957l.m111071g(str);
            if (!TextUtils.isEmpty(g)) {
                Log.m105925i(TAG, "LoadLibrary find and load the lib %s so", g);
                C88957l.m111079o(str, classLoader);
                return true;
            }
            Log.m105921e(TAG, "LoadLibrary can't find the lib %s so", str);
            return false;
        }
    }
}
