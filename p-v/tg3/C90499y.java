package tg3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: tg3.y */
public class C90499y {
    /* renamed from: a */
    public static void m113315a() {
        MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).edit().clear().commit();
        Log.m105924i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
    }

    /* renamed from: b */
    public static String m113316b() {
        return MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).getString("update_downloaded_pack_md5_key", (String) null);
    }

    /* renamed from: c */
    public static String[] m113317c() {
        String string = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).getString("update_downloaded_ignored_pack", (String) null);
        if (Util.isNullOrNil(string)) {
            return null;
        }
        return string.split(XVFSFile.PATH_SEPARATOR);
    }

    /* renamed from: d */
    public static void m113318d() {
        MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).edit().putLong("update_downloading_in_silence", System.currentTimeMillis()).putBoolean("update_download_start_one_immediate", false).commit();
        Log.m105924i("MicroMsg.UpdateUtil", "putDowningInSilence");
    }

    /* renamed from: e */
    public static void m113319e(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).edit().putString("update_downloaded_pack_md5_key", str).putString("update_downloaded_pack_sig_key", str2).putString("update_downloaded_pack_desc_key", str3).putInt("update_downloaded_pack_size_key", i).putInt("update_downloaded_pack_download_mode", i2).putInt("update_downloaded_pack_update_type", i3).putString("update_download_not_auto_download_range", str4).commit();
        Log.m105925i("MicroMsg.UpdateUtil", "summerupdate putDownloadedPackInfo md5: %s size: %s range: %s", str, Integer.valueOf(i), str4);
    }

    /* renamed from: f */
    public static void m113320f() {
        SharedPreferences sharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4);
        int i = sharedPreferences.getInt("update_downloaded_cancel_times", 0);
        Log.m105925i("MicroMsg.UpdateUtil", "putIgnoreDownloadedPack times %s", Integer.valueOf(i));
        if (i >= 2) {
            String b = m113316b();
            StringBuffer stringBuffer = null;
            if (!Util.isNullOrNil(b)) {
                String[] c = m113317c();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(b);
                if (c != null) {
                    for (String str : c) {
                        if (!Util.isNullOrNil(str)) {
                            stringBuffer2.append(XVFSFile.PATH_SEPARATOR);
                            stringBuffer2.append(str);
                        }
                    }
                }
                stringBuffer = stringBuffer2;
            }
            sharedPreferences.edit().clear().commit();
            if (stringBuffer != null) {
                sharedPreferences.edit().putString("update_downloaded_ignored_pack", stringBuffer.toString()).commit();
                return;
            }
            return;
        }
        sharedPreferences.edit().putLong("update_downloaded_cancel_ts", System.currentTimeMillis()).putInt("update_downloaded_cancel_times", i + 1).commit();
    }

    /* renamed from: g */
    public static void m113321g() {
        MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).edit().remove("update_downloading_in_silence").commit();
        Log.m105924i("MicroMsg.UpdateUtil", "removeUnfinishDownloadingInSilence");
    }

    /* renamed from: h */
    public static void m113322h(Context context, int i, int i2) {
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", true);
        intent.putExtra("intent_extra_opcode", i);
        if (i == 2) {
            intent.putExtra("intent_extra_install_dialog_times", i2);
        }
        context.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
    }

    /* renamed from: i */
    public static void m113323i(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", false);
        intent.putExtra("intent_extra_opcode", i);
        context.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
    }
}
