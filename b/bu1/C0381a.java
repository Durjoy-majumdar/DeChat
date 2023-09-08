package bu1;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import au1.C0222b;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Iterator;
import kg3.C76577a;
import org.json.JSONObject;

/* renamed from: bu1.a */
public class C0381a {
    /* renamed from: a */
    public static Bundle m324a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String obj = keys.next().toString();
            Object opt = jSONObject.opt(obj);
            if (opt instanceof Integer) {
                bundle.putInt(obj, ((Integer) opt).intValue());
            } else if (opt instanceof String) {
                bundle.putString(obj, (String) opt);
            } else if (opt instanceof Long) {
                bundle.putLong(obj, ((Long) opt).longValue());
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m325b(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString("err_tip", jSONObject.optString(StateEvent.Name.MESSAGE, jSONObject.optString("errormsg", jSONObject.optString("err_msg", str))));
        if (TextUtils.isEmpty(optString)) {
            C0222b.m173l("msgVerify", str);
            return str;
        }
        C0222b.m173l("msgVerify", optString);
        return optString;
    }

    /* renamed from: c */
    public static String m326c(Context context, String str) {
        return context.getResources().getString(context.getResources().getIdentifier(str, "string", MMApplicationContext.getPackageName()));
    }

    /* renamed from: d */
    public static boolean m327d(JSONObject jSONObject) {
        return jSONObject.optInt(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0) == 271449101;
    }

    /* renamed from: e */
    public static boolean m328e() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_check_cross_switch, false);
        boolean z = C79758p.f233760a.mo109882e(C104160f.f308378w2, 0) == 1;
        Log.m105925i("MicroMsg.FaceFlashUtils", "isOpenCrossSwitch: %s, %s", Boolean.valueOf(wf), Boolean.valueOf(z));
        if (z) {
            return true;
        }
        return wf;
    }

    /* renamed from: f */
    public static boolean m329f(HashMap<String, Object> hashMap, String str, int i) {
        return hashMap.containsKey(str) && ((Integer) hashMap.get(str)).intValue() == i;
    }

    /* renamed from: g */
    public static void m330g(Context context, HashMap<String, Object> hashMap) {
        try {
            if (hashMap.containsKey(StateEvent.Name.MESSAGE)) {
                JSONObject jSONObject = new JSONObject(String.valueOf(hashMap.get(StateEvent.Name.MESSAGE)));
                String string = jSONObject.getString("errormsg");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("errormsg", m326c(context, string));
                    hashMap.put(StateEvent.Name.MESSAGE, jSONObject.toString());
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashUtils", e, "replaceErrorMsg", new Object[0]);
        }
    }

    /* renamed from: h */
    public static void m331h(HashMap<String, Object> hashMap, String str) {
        try {
            if (hashMap.containsKey(StateEvent.Name.MESSAGE)) {
                JSONObject jSONObject = new JSONObject(String.valueOf(hashMap.get(StateEvent.Name.MESSAGE)));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("err_msg", str);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashUtils", e, "setErrorMsg", new Object[0]);
        }
    }

    /* renamed from: i */
    public static void m332i(TextView textView, String str) {
        textView.setText("");
        textView.setTextSize(0, (float) C76577a.m92157h(textView.getContext(), C0966R.dimen.f3882hr));
        textView.setText(str);
    }
}
