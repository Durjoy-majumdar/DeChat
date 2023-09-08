package ly1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p763ym.C39072t;
import sw1.C101703s;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: ly1.o0 */
public class C10665o0 extends C86301e implements C101703s {
    public static void vx0(Context context, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i2, Bundle bundle, int i3) {
        int i4 = i;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        boolean z2 = z;
        String str11 = str6;
        int i5 = i2;
        boolean z3 = false;
        Log.m105925i("MicroMsg.Haowan.GameVideoEditorLauncher", "goToEditor, from[%d], businessType[%s], appid[%s], videoPath[%s], videoUrl[%s], needEdit[%b], gameInfo[%s]", Integer.valueOf(i), str7, str8, str9, str10, Boolean.valueOf(z), str11);
        Intent intent = new Intent();
        intent.putExtra("from", i4);
        intent.putExtra("business_type", str7);
        intent.putExtra("appid", str8);
        intent.putExtra("video_path", str9);
        intent.putExtra("video_url", str10);
        intent.putExtra("thumb_url", str5);
        intent.putExtra("need_edit", z2);
        intent.putExtra("game_info", str11);
        intent.putExtra("ext_data", bundle);
        intent.putExtra("game_haowan_source_scene_id", i3);
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        if (Util.isNullOrNil(str3) || !C86013q1.m106450k(str3)) {
            if (Util.isNullOrNil(str4)) {
                Log.m105920e("MicroMsg.Haowan.GameVideoEditorLauncher", "videoPath and videoUrl is invalid");
                if (i4 == 3) {
                    ((C39072t) C86312j.m106911c(C39072t.class)).r10(str, "videoPath and videoUrl is invalid", str2, -3, "videoPath and videoUrl is invalid");
                    return;
                }
                return;
            } else if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            if (context2 instanceof Activity) {
                C88144b.m109795m(context2, "game", ".media.GameVideoDownloadUI", intent, i5);
            } else {
                C88144b.m109791i(MMApplicationContext.getContext(), "game", ".media.GameVideoDownloadUI", intent, (Bundle) null);
            }
        } else if (context2 instanceof Activity) {
            C88144b.m109795m(context2, "game", ".media.GameVideoEditorProxyUI", intent, i5);
        } else {
            C88144b.m109791i(MMApplicationContext.getContext(), "game", ".media.GameVideoEditorProxyUI", intent, (Bundle) null);
        }
    }

    /* renamed from: Qd */
    public void mo10937Qd(Context context, int i, String str, String str2, String str3, String str4, int i2, Bundle bundle, int i3) {
        vx0(context, i, (String) null, str, str2, str3, str4, true, (String) null, i2, bundle, i3);
    }

    /* renamed from: ZI */
    public void mo10938ZI(Context context, String str, String str2, String str3, int i, int i2) {
        vx0(context, 5, (String) null, str3, (String) null, str, str2, true, (String) null, i, (Bundle) null, i2);
    }

    public void ow0(Context context, String str, int i, Bundle bundle, int i2) {
        vx0(context, 4, (String) null, (String) null, str, (String) null, (String) null, true, (String) null, i, bundle, i2);
    }

    /* renamed from: uc */
    public void mo10940uc(Context context, String str, String str2, String str3, int i, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appName", str2);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Haowan.GameVideoEditorLauncher", e, "hy: put appname failed!", new Object[0]);
        }
        vx0(context, 2, (String) null, str, str3, (String) null, (String) null, true, jSONObject.toString(), i, bundle, 30);
    }

    /* renamed from: x1 */
    public void mo10941x1(String str, String str2, String str3) {
        String str4;
        String str5 = str3;
        Log.m105925i("MicroMsg.Haowan.GameVideoEditorLauncher", "businessType:%s; appid:%s; extInfo:%s", str, str2, str5);
        try {
            JSONObject jSONObject = new JSONObject(str5);
            String optString = jSONObject.optString("videoPath");
            String optString2 = jSONObject.optString("videoUrl");
            String optString3 = jSONObject.optString("thumbUrl");
            boolean z = jSONObject.optInt("needEdit", 0) == 1;
            try {
                str4 = URLEncoder.encode(jSONObject.optString("gameInfo"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.m105925i("MicroMsg.Haowan.GameVideoEditorLauncher", "err:%s", e.getMessage());
                str4 = "";
            }
            vx0((Context) null, 3, str, str2, optString, optString2, optString3, z, str4, 0, (Bundle) null, 12);
        } catch (Exception unused) {
            ((C39072t) C86312j.m106911c(C39072t.class)).r10(str, "json is invalid", str2, -3, "json is invalid");
        }
    }
}
