package a12;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: a12.k */
public class C27734k {
    /* renamed from: a */
    public static boolean m37982a(Context context, String str) {
        String string = context.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
        Log.m105925i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", string, str);
        return !WeChatEnvironment.hasDebugger() && !Util.isNullOrNil(string) && !Util.isNullOrNil(str) && string.equalsIgnoreCase(str);
    }

    /* renamed from: b */
    public static void m37983b(Context context, String str) {
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_node", str).apply();
    }

    /* renamed from: c */
    public static void m37984c(Context context, int i) {
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("tinker_node_retry_time", i).apply();
    }

    /* renamed from: d */
    public static void m37985d(Context context) {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("TinkerCheckUpdateInterval", 12);
        if (b < 0) {
            Log.m105924i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
            return;
        }
        Log.m105925i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", Integer.valueOf(b));
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", b).apply();
    }
}
