package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import kb0.C76528a;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.e */
public final class C83311e {

    /* renamed from: a */
    public static final Integer[] f243466a = {1012, 1031, 1048, 1125};

    /* renamed from: a */
    public static final int m102262a(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scene: " + i);
        boolean z = false;
        if (!C110823p.m151009y(f243466a, Integer.valueOf(i))) {
            Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scene is not related");
            return 0;
        } else if (bundle == null) {
            Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, statObj is null");
            return 9;
        } else {
            int i2 = bundle.getInt("LaunchCodeScene_ScanScene");
            if (!(1 <= i2 && i2 < 7)) {
                Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scanScene(" + i2 + ") is invalid 1");
                return 9;
            } else if (1 == i2) {
                int i3 = bundle.getInt("LaunchCodeScene_ChatType");
                Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType: " + i3);
                if (1 <= i3 && i3 < 5) {
                    z = true;
                }
                if (!z) {
                    String string = bundle.getString("LaunchCodeScene_Username");
                    if (string == null) {
                        Log.m105928w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType is invalid, username is null");
                        return 9;
                    }
                    i3 = C76528a.m92004a(string);
                    Log.m105924i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, username: " + string + ", chatType: " + i3);
                }
                if (i3 == 1) {
                    return 1;
                }
                if (i3 == 2) {
                    return 2;
                }
                if (i3 == 3) {
                    return 3;
                }
                if (i3 == 4) {
                    return 4;
                }
                Log.m105928w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType is invalid");
                return 9;
            } else if (i2 == 2) {
                return 5;
            } else {
                if (i2 == 3) {
                    return 6;
                }
                if (i2 == 4) {
                    return 7;
                }
                if (i2 == 5) {
                    return 8;
                }
                if (i2 == 6) {
                    return 9;
                }
                Log.m105928w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scanScene(" + i2 + ") is invalid 2");
                return 9;
            }
        }
    }
}
