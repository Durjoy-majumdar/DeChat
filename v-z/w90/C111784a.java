package w90;

import android.app.Activity;
import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.miniutil.MiniReaderConstants;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xwebutil.C19894d;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.internal.ConstValue;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w90.a */
public class C111784a extends MiniReaderConstants {
    /* renamed from: a */
    public static String m152399a(Activity activity, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6) {
        String str3 = str;
        Context context = MMApplicationContext.getContext();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pkgName", context.getPackageName());
            if (z5) {
                jSONObject.put("className", "com.tencent.mm.ui.tools.MiniQbCallBackMMUI");
            } else {
                jSONObject.put("className", "com.tencent.mm.ui.tools.MiniQbCallBackUI");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", FileReaderHelper.READER_TYPE_MINIQB);
            jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str3);
            jSONObject2.put(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, MMApplicationContext.getProcessName());
            jSONObject2.put("appid", str2);
            jSONObject.put("thirdCtx", jSONObject2);
            jSONObject.put("darkMode", C85875k4.m106211z() ? 1 : 0);
            ArrayList arrayList = new ArrayList();
            String str4 = "1";
            if (z4) {
                JSONObject c = m152401c(8, C0966R.C0969drawable.c35, context.getString(C0966R.string.cvn), true, 1);
                if (z2) {
                    c.put("from", "multitask");
                } else {
                    c.put("from", "");
                }
                if (!z) {
                    str4 = "0";
                }
                c.put("hasCurrentMultiTask", str4);
                c.put("multiTaskId", MD5Util.getMD5String(String.format("%s", new Object[]{str3})));
                JSONObject c2 = m152401c(4, C0966R.C0969drawable.f357147c02, context.getString(C0966R.string.cgm), true, 2);
                JSONObject c3 = m152401c(5, C0966R.C0969drawable.icon_file_handoff, context.getString(C0966R.string.cvp), z3, 3);
                arrayList.add(c2);
                arrayList.add(c3);
                if (z6) {
                    arrayList.add(m152401c(7, C0966R.C0969drawable.bua, context.getString(C0966R.string.f7767r2), true, 4));
                }
                if (C85875k4.m106208w() || C85985z2.m106332d(activity.getTaskId())) {
                    arrayList.add(m152401c(11, C0966R.C0969drawable.f357224c42, context.getString(C0966R.string.f361404jm3), !C85875k4.m106209x(activity.getTaskId()), 5));
                    arrayList.add(m152401c(12, C0966R.C0969drawable.f357223c41, context.getString(C0966R.string.bfn), C85875k4.m106209x(activity.getTaskId()), 5));
                }
            } else {
                JSONObject b = m152400b(8, C0966R.C0969drawable.c35, context.getString(C0966R.string.cvn));
                if (z2) {
                    b.put("from", "multitask");
                } else {
                    b.put("from", "");
                }
                if (!z) {
                    str4 = "0";
                }
                b.put("hasCurrentMultiTask", str4);
                b.put("multiTaskId", MD5Util.getMD5String(String.format("%s", new Object[]{str3})));
                arrayList.add(m152400b(4, C0966R.C0969drawable.f357147c02, context.getString(C0966R.string.cgm)));
                if (z6) {
                    arrayList.add(m152400b(7, C0966R.C0969drawable.bua, context.getString(C0966R.string.f7767r2)));
                }
                if (C85875k4.m106208w() || C85985z2.m106332d(activity.getTaskId())) {
                    if (C85875k4.m106209x(activity.getTaskId())) {
                        arrayList.add(m152400b(12, C0966R.C0969drawable.f357223c41, context.getString(C0966R.string.bfn)));
                    } else {
                        arrayList.add(m152400b(11, C0966R.C0969drawable.f357224c42, context.getString(C0966R.string.f361404jm3)));
                    }
                }
            }
            jSONObject.put("menuItems", new JSONArray(arrayList));
            return jSONObject.toString();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static JSONObject m152400b(int i, int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
            jSONObject.put("iconResId", i2);
            jSONObject.put(MimeTypes.BASE_TYPE_TEXT, str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m152401c(int i, int i2, String str, boolean z, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
            jSONObject.put("iconResId", i2);
            jSONObject.put(MimeTypes.BASE_TYPE_TEXT, str);
            jSONObject.put("isShow", z);
            jSONObject.put("idx", i3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FilesFloatBall.MiniReaderLogic", "getMenuInfo() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static void m152402d(boolean z, boolean z2, boolean z3, boolean z4, Activity activity, String str, String str2, String str3, String str4, int i, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2, int i2, boolean z5) {
        m152403e(z, z2, z3, z4, activity, str, str2, str3, str4, i, valueCallback, valueCallback2, false, "", i2, true, z5);
    }

    /* renamed from: e */
    public static void m152403e(boolean z, boolean z2, boolean z3, boolean z4, Activity activity, String str, String str2, String str3, String str4, int i, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2, boolean z5, String str5, int i2, boolean z6, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("menuData", m152399a(activity, str, z, z2, z4, z3, z5, str5, z7));
        if (z4) {
            byte b = (byte) 1;
            if (Util.isEqual(i2, 9)) {
                b = (byte) (b | 2);
            }
            hashMap.put("param_flag", b + "");
        }
        hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, String.valueOf(i));
        C19894d.m21645d(activity, str, str2, str3, str4, true, hashMap, valueCallback, valueCallback2, z6);
    }

    /* renamed from: f */
    public static void m152404f(boolean z, boolean z2, boolean z3, Activity activity, String str, String str2, String str3, String str4, int i, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2, boolean z4, String str5, boolean z5, boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("menuData", m152399a(activity, str, z, z2, z3, false, z4, str5, z6));
        hashMap.put("query_param", "feature_wx_float_window");
        hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, String.valueOf(i));
        C19894d.m21645d(activity, str, str2, str3, str4, false, hashMap, valueCallback, valueCallback2, z5);
    }

    /* renamed from: g */
    public static void m152405g(boolean z, boolean z2, boolean z3, Activity activity, String str, String str2, String str3, String str4, int i, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2, boolean z4, String str5, boolean z5) {
        boolean z6 = z;
        HashMap hashMap = new HashMap();
        hashMap.put("menuData", m152399a(activity, str, z, z2, z3, true, z4, str5, z5));
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", 1);
            jSONObject.put("isShow", !z6);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", 2);
            jSONObject2.put("isShow", z);
            jSONArray.put(jSONObject2);
            hashMap.put("update_menu_param", jSONArray.toString());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FilesFloatBall.MiniReaderLogic", "updateMenu() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
        hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, String.valueOf(i));
        C19894d.m21645d(activity, str, str2, str3, str4, true, hashMap, valueCallback, valueCallback2, true);
    }
}
