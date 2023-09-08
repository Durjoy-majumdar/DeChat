package t03;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import hc0.C20937c;
import nc0.C76850a;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C11796g;
import p763ym.C39072t;
import p763ym.C79138l;
import t83.C13841a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: t03.j */
public class C77817j extends C86301e implements C11796g {
    public void Ao0(Context context) {
        C22426h.m26108j(context);
    }

    public boolean im0() {
        return !C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)) && !(((C75592q0.m90781k() & 67108864) > 0 ? 1 : ((C75592q0.m90781k() & 67108864) == 0 ? 0 : -1)) > 0);
    }

    public void k40(Context context, int i, Bundle bundle, String str, C13841a aVar) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 110);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
        C22426h.m26109k(context, i, bundle, str, aVar);
    }

    /* renamed from: zx */
    public void mo11694zx(String str, String str2, String str3) {
        C20937c cVar = C22426h.f63540a;
        Class cls = C39072t.class;
        Log.m105925i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI, appid:%s", str2);
        Log.m105925i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI, extInfo:%s", str3);
        Log.m105925i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI, businessType:%s", str);
        if (((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str2) == null) {
            ((C39072t) C86312j.m106911c(cls)).r10(str, "", str2, -1, "appinfo error: not found.");
            Log.m105924i("MicroMsg.TopStory.TopStoryUILogic", "startTopStoryUploadUI appinfo error");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            JSONObject jSONObject2 = jSONObject.getJSONObject(FirebaseAnalytics.C113379b.SOURCE);
            int optInt = jSONObject2.optInt("type");
            String string = jSONObject2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String optString = jSONObject2.optString("description", "");
            String string2 = jSONObject2.getString("thumbUrl");
            String string3 = jSONObject.getString("appVersion");
            String optString2 = jSONObject2.optString("mediaName", "");
            String optString3 = jSONObject2.optString("mediaHeadUrl", "");
            Intent intent = new Intent();
            intent.putExtra("KEY_TYPE", optInt);
            intent.putExtra("KEY_BIZTYPE", str);
            intent.putExtra("KEY_APPID", str2);
            intent.putExtra("KEY_EXTINFO", str3);
            intent.putExtra("KEY_TITLE", string);
            intent.putExtra("KEY_DESC", optString);
            intent.putExtra("KEY_THUMBURL", string2);
            intent.putExtra("KEY_APPVERSION", string3);
            intent.putExtra("KEY_MEDIANAME", optString2);
            intent.putExtra("KEY_MEDIAHEADURL", optString3);
            intent.addFlags(268435456).addFlags(32768);
            C43471q.m46985i(MMApplicationContext.getContext(), ".ui.home.TopStoryUploadUI", intent);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", e, "startTopStoryUploadUI", new Object[0]);
            ((C39072t) C86312j.m106911c(cls)).r10(str, "", str2, -1, "extInfo error: parse failed.");
        }
    }
}
