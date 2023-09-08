package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.os.Bundle;
import com.miui.easygo.sdk.EasyGo;
import com.miui.easygo.sdk.module.EasyGoRet;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.ui.h1 */
public class C85865h1 {

    /* renamed from: a */
    public static EasyGo f250081a;

    /* renamed from: b */
    public static List<Integer> f250082b;

    /* renamed from: a */
    public static int m106131a(EasyGo easyGo, int i) {
        if (easyGo == null) {
            return -1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("@int:taskId", i);
            try {
                EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, (Bundle) null);
                Log.m105924i("EasyGo", invokeSync.code + "");
                int i2 = invokeSync.result.getInt("int");
                Log.m105924i("EasyGo", "getTaskPosition" + i2);
                return i2;
            } catch (Throwable th) {
                Log.m105920e("EasyGo", th.getMessage());
                return -1;
            }
        } catch (JSONException e) {
            Log.m105920e("EasyGo", e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public static void m106132b(Context context) {
        if (C85875k4.m106161R() || C85875k4.m106162S()) {
            try {
                if (f250081a == null) {
                    f250081a = new EasyGo(context);
                }
                f250082b = f250081a.init(new String[]{"magicwindow"});
            } catch (Throwable th) {
                Log.printErrStackTrace("EasyGo", th, (String) null, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public static boolean m106133c(Context context) {
        return context.getResources().getConfiguration().toString().contains("miui-magic-windows");
    }

    /* renamed from: d */
    public static void m106134d(int i) {
        if (f250081a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:loginStatus", i);
                try {
                    EasyGoRet invokeSync = f250081a.invokeSync("magicwindow", "setLoginStatus", jSONObject, (Bundle) null);
                    Log.m105924i("EasyGo", " setLoginStatus ret " + invokeSync.code);
                } catch (Throwable th) {
                    Log.m105920e("EasyGo", th.getMessage());
                }
            } catch (JSONException e) {
                Log.m105920e("EasyGo", e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m106135e(EasyGo easyGo, int i, int i2) {
        if (easyGo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                jSONObject.put("@int:targetPosition", i2);
            } catch (JSONException e) {
                Log.m105920e("EasyGo", e.getMessage());
            }
            try {
                EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, (Bundle) null);
                Log.m105924i("EasyGo", invokeSync.code + "");
            } catch (Throwable th) {
                Log.m105920e("EasyGo", th.getMessage());
            }
        }
    }
}
