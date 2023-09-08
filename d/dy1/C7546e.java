package dy1;

import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.gamesharecard.GameShareCardInfo;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import org.json.JSONObject;
import oz1.C77050b;

/* renamed from: dy1.e */
public class C7546e extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("appId");
        String str2 = Util.isNullOrNil(optString) ? str : optString;
        String optString2 = jSONObject2.optString("path");
        String optString3 = jSONObject2.optString(SearchIntents.EXTRA_QUERY);
        String optString4 = jSONObject2.optString("bizData");
        int optInt = jSONObject2.optInt(FirebaseAnalytics.C113379b.SOURCE);
        int optInt2 = jSONObject2.optInt(DownloadInfo.PRIORITY);
        String optString5 = jSONObject2.optString("gameShareId");
        String optString6 = jSONObject2.optString("gameShareData");
        String optString7 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        int optInt3 = jSONObject2.optInt("isVideo");
        int optInt4 = jSONObject2.optInt("duration");
        ((C77050b) C86312j.m106911c(C77050b.class)).mo107306ZZ(mo5676d(), new GameShareCardInfo(new LiteAppBizDataInfo(str2, optString2, optString3, optString4, Integer.valueOf(optInt), optInt2), optString5, optString6, optString7, optInt3, optInt4, jSONObject2.optString("srcId")), jSONObject2.optString("thumbUrl"));
        this.f19815f.mo5690b();
    }
}
