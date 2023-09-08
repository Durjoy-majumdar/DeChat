package tm2;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import e00.C31371l0;
import kg3.C76577a;

/* renamed from: tm2.b */
public class C78045b {
    /* renamed from: a */
    public static int m94195a(Context context) {
        if (context != null) {
            return context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("current_text_size_index_key", 1);
        }
        return 1;
    }

    /* renamed from: b */
    public static int m94196b(int i) {
        switch (i) {
            case 0:
                return JsApiAddDownloadTaskStraight.CTRL_INDEX;
            case 2:
            case 3:
                return v2helper.VOIP_ENC_HEIGHT_LV1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 340;
            default:
                return 400;
        }
    }

    /* renamed from: c */
    public static void m94197c(Context context, float f, int i) {
        C76577a.m92149E(context, f);
        m94198d(context, f);
        SharedPreferences.Editor edit = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
        edit.putInt("current_text_size_index_key", i);
        boolean commit = edit.commit();
        Log.m105924i("MicroMsg.FontSizeService", "set CURRENT_TEXT_INDEX_KEY result: " + commit);
        ((C31371l0) C86312j.m106911c(C31371l0.class)).h00(true);
    }

    /* renamed from: d */
    public static void m94198d(Context context, float f) {
        SharedPreferences.Editor edit = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
        edit.putFloat("current_text_size_scale_key", f);
        boolean commit = edit.commit();
        Log.m105924i("MicroMsg.FontSizeService", "CURRENT_TEXT_SIZE_KEY put result: " + commit);
    }
}
