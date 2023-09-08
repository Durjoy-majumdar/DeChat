package com.tencent.p014mm.app;

import a70.C79471a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.ArrayMap;
import com.tencent.p014mm.boot.BuildConfig;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ImmutableBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.app.y0 */
public class C80636y0 {
    /* renamed from: a */
    public static void m98273a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105920e("MicroMsg.SetupBaseBuildInfo", "meta bundle is null!!!!");
        } else {
            String str = C79471a.f233013a;
            C79471a.f233013a = bundle.getBoolean("com.tencent.mm.BuildInfo.PATCH_ENABLED") ? "true" : "false";
            C79471a.f233014b = bundle.getString("com.tencent.mm.BuildInfo.BUILD_REV");
            C79471a.f233015c = "0x" + Integer.toHexString(bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION"));
            C79471a.f233017e = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TIME");
            C79471a.f233018f = bundle.getString("com.tencent.mm.BuildInfo.BUILD_HOSTNAME");
            C79471a.f233019g = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_OWNER");
            C79471a.f233020h = bundle.getString("com.tencent.mm.BuildInfo.BUILD_COMMAND");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_SVNPATH");
            C79471a.f233022j = bundle.getBoolean("com.tencent.mm.BuildInfo.BUILD_IS_ARM64", false);
            C79471a.f233023k = bundle.getString(ShareConstants.TINKER_ID);
        }
        BuildInfo.DEBUG = false;
        BuildInfo.BUILD_TAG = BuildConfig.BUILD_TAG;
        BuildInfo.OWNER = BuildConfig.OWNER;
        BuildInfo.HOSTNAME = BuildConfig.HOSTNAME;
        BuildInfo.TIME = BuildConfig.TIME;
        BuildInfo.COMMAND = "null";
        BuildInfo.REV = BuildConfig.REV;
        BuildInfo.SVNPATH = BuildConfig.SVNPATH;
        String str2 = C79471a.f233022j ? BuildConfig.CLIENT_VERSION_ARM64 : BuildConfig.CLIENT_VERSION_ARMEABI;
        BuildInfo.CLIENT_VERSION = str2;
        BuildInfo.CLIENT_VERSION_INT = Integer.decode(str2).intValue();
        BuildInfo.ENABLE_FPS_ANALYSE = false;
        BuildInfo.ENABLE_MATRIX = true;
        BuildInfo.ENABLE_MATRIX_SILENCE_ANALYSE = false;
        BuildInfo.ENABLE_MATRIX_MEMORY_HOOK = false;
        BuildInfo.ENABLE_MATRIX_OPENGL_HOOK = false;
        BuildInfo.ENABLE_MATRIX_PTHREAD_HOOK = false;
        BuildInfo.ENABLE_MATRIX_MEMORY_TRIGGERS = false;
        BuildInfo.ENABLE_XPOSED_HOOK = false;
        BuildInfo.ENABLE_MATRIX_TRACE = false;
        BuildInfo.ENABLE_UI_TOOL = false;
        BuildInfo.ENABLE_SYSTRACE = false;
        BuildInfo.EX_DEVICE_LOGIN = false;
        BuildInfo.PRE_RELEASE = false;
        BuildInfo.REDESIGN_ENTRANCE = false;
        BuildInfo.IS_FLAVOR_RED = false;
        BuildInfo.IS_FLAVOR_PURPLE = false;
        BuildInfo.IS_FLAVOR_BLUE = false;
        BuildInfo.MATRIX_VERSION = BuildConfig.MATRIX_VERSION;
        BuildInfo.IS_ARM64 = C79471a.f233022j;
        BuildInfo.KINDA_DEFAULT = "default";
        BuildInfo.TINKER_VERSION = BuildConfig.TINKER_VERSION;
        BuildInfo.IS_UAT = false;
        BuildInfo.ENABLE_PAYTEST = false;
        BuildInfo.OVERRIDE_VERSION_NAME = "";
        BuildInfo.ENABLE_LIVE_SDK_DEBUG = false;
        BuildInfo.IS_FLAVOR_P_ALPHA = false;
        BuildInfo.MAAS_IN_PKG = false;
        BuildInfo.BUILD_RAND_ID = BuildConfig.BUILD_RAND_ID;
        ArrayMap arrayMap = new ArrayMap();
        for (Field field : BuildConfig.class.getFields()) {
            try {
                Log.m105925i("MicroMsg.SetupBaseBuildInfo", "Copy BuildConfig field %s %s", field.getName(), field.get((Object) null));
                arrayMap.put(field.getName(), field.get((Object) null));
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", e2, "", new Object[0]);
            }
        }
        ImmutableBundle immutableBundle = BuildInfo.ext;
        immutableBundle.putAll(arrayMap);
        immutableBundle.markImmutable();
    }
}
