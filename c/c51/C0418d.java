package c51;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: c51.d */
public class C0418d {
    /* renamed from: a */
    public static void m366a(long j, float f, int i) {
        String str;
        Log.m105918d("MicroMsg.FileDownloadSP", "speed = " + f);
        String str2 = "" + Math.round(f * 100.0f) + "_" + i;
        Log.m105918d("MicroMsg.FileDownloadSP", "speedStr = " + str2);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("download_pref", 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(String.valueOf(j), "");
            if (Util.isNullOrNil(string)) {
                str = "1_" + str2 + "|";
            } else {
                String[] split = string.split("\\|");
                str = string + (Util.getInt(split[split.length - 1].split("_")[0], 0) + 1) + "_" + str2 + "|";
            }
            Log.m105918d("MicroMsg.FileDownloadSP", "saveDownloadSpeed, speedStr = " + str);
            sharedPreferences.edit().putString(String.valueOf(j), str).apply();
        }
    }
}
