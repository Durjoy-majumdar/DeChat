package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.huawei.easygo.sdk.EasyGo;
import com.huawei.easygo.sdk.module.EasyGoRet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.a5 */
public class C85811a5 {

    /* renamed from: a */
    public static EasyGo f249921a;

    /* renamed from: b */
    public static List<Integer> f249922b;

    /* renamed from: c */
    public static boolean f249923c;

    /* renamed from: com.tencent.mm.ui.a5$a */
    public class C85812a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f249924d;

        public C85812a(Context context) {
            this.f249924d = context;
        }

        public void run() {
            if (C85811a5.f249921a == null) {
                C85811a5.f249921a = new EasyGo(this.f249924d);
            }
            C85811a5.f249922b = C85811a5.f249921a.init(new String[]{"magicwindow"});
            Rect rect = C85875k4.f250155a;
            if (C85811a5.f249921a == null) {
                C85811a5.m106025b(MMApplicationContext.getContext());
            }
            boolean c = C85811a5.m106026c();
            Boolean bool = C85875k4.f250170p;
            if (bool != null) {
                C85875k4.f250170p = new Boolean(bool.booleanValue() || c);
            }
            Log.m105924i("MicroMsg.UIUtils", "updateSupportMagicWindow!");
            if (C85875k4.m106197n0() && !C85811a5.f249923c) {
                Log.m105924i("MicroMsg.huaweiUtil", "update setLoginStatus!");
                C85811a5.m106029f(1);
            }
            Log.m105925i("MicroMsg.huaweiUtil", "initEasyGoManager normal device!! retList: %s", C85811a5.f249922b);
        }
    }

    /* renamed from: a */
    public static int m106024a(EasyGo easyGo, int i) {
        if (easyGo == null) {
            return -1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("@int:taskId", i);
            EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, (Bundle) null);
            Log.m105924i("EasyGo", invokeSync.code + "");
            int i2 = invokeSync.result.getInt("int");
            Log.m105920e("EasyGo", "getTaskPosition" + i2);
            return i2;
        } catch (JSONException e) {
            Log.m105920e("EasyGo", e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public static void m106025b(Context context) {
        if (C85875k4.m106157N() || C85875k4.m106210y()) {
            if (f249921a == null) {
                f249921a = new EasyGo(context);
            }
            f249922b = f249921a.init(new String[]{"magicwindow"});
            Log.m105924i("MicroMsg.huaweiUtil", "initEasyGoManager large device!!");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C85812a(context), "initEasyGoManager");
    }

    /* renamed from: c */
    public static boolean m106026c() {
        boolean z;
        List<Integer> list = f249922b;
        if (list != null && list.size() > 0) {
            Log.m105919d("MicroMsg.huaweiUtil", "dancy test retList get(0):%s", f249922b.get(0));
            if (f249922b.get(0).intValue() == 0) {
                z = true;
                Log.m105925i("MicroMsg.huaweiUtil", "initSucceed:%s, retList:%s", Boolean.valueOf(z), f249922b);
                return z;
            }
        }
        z = false;
        Log.m105925i("MicroMsg.huaweiUtil", "initSucceed:%s, retList:%s", Boolean.valueOf(z), f249922b);
        return z;
    }

    /* renamed from: d */
    public static boolean m106027d(Context context) {
        String configuration = context.getResources().getConfiguration().toString();
        boolean z = configuration.contains("hwMultiwindow-magic") || configuration.contains("hw-magic-windows");
        Log.m105919d("MicroMsg.huaweiUtil", "isExpandStatus:%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public static void m106028e(int i) {
        if (f249921a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:landMode", i);
                EasyGoRet invokeSync = f249921a.invokeSync("magicwindow", "setLandScapeMode", jSONObject, (Bundle) null);
                Log.m105924i("EasyGo", " setLandscapeMode ret " + invokeSync.code + " mode: " + i);
            } catch (JSONException e) {
                Log.m105920e("EasyGo", e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static void m106029f(int i) {
        if (f249921a == null) {
            Log.m105920e("MicroMsg.huaweiUtil", "setLoginStatus easyGoManager is null!!");
            return;
        }
        f249923c = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i);
            EasyGoRet invokeSync = f249921a.invokeSync("magicwindow", "setLoginStatus", jSONObject, (Bundle) null);
            Log.m105924i("EasyGo", " setLoginStatus ret " + invokeSync.code);
        } catch (JSONException e) {
            Log.m105920e("EasyGo", e.getMessage());
        }
    }

    /* renamed from: g */
    public static void m106030g(int i) {
        if (f249921a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:nightMode", i);
                EasyGoRet invokeSync = f249921a.invokeSync("magicwindow", "setNightMode", jSONObject, (Bundle) null);
                Log.m105924i("EasyGo", " setNightMode ret " + invokeSync.code + " mode: " + i);
            } catch (JSONException e) {
                Log.m105920e("EasyGo", e.getMessage());
            }
        }
    }

    /* renamed from: h */
    public static void m106031h(EasyGo easyGo, int i, int i2) {
        if (easyGo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                jSONObject.put("@int:targetPosition", i2);
            } catch (JSONException e) {
                Log.m105920e("EasyGo", e.getMessage());
            }
            EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, (Bundle) null);
            Log.m105924i("EasyGo", invokeSync.code + "");
        }
    }
}
