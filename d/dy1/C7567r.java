package dy1;

import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.gamesharecard.GameShareCardInfo;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import oz1.C77050b;
import p158gt.C8451i;
import p244tt.C14088e;
import wc3.C15133e0;
import wc3.C78536j0;

/* renamed from: dy1.r */
public class C7567r extends C4770c {

    /* renamed from: g */
    public String f25836g;

    /* renamed from: h */
    public JSONObject f25837h;

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        boolean z2;
        JSONObject jSONObject2 = jSONObject;
        this.f25836g = str;
        this.f25837h = jSONObject2;
        String optString = jSONObject2.optString("appId");
        if (!Util.isNullOrNil(optString)) {
            this.f25836g = optString;
        }
        String optString2 = jSONObject2.optString("thumbUrl");
        if (!Util.isNullOrNil(optString2) && optString2.startsWith("http")) {
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(optString2, (C8451i.C8452a) null);
        }
        HashMap hashMap = new HashMap();
        String str2 = "";
        if (optString2 == null) {
            optString2 = str2;
        }
        hashMap.put("img_url", optString2);
        hashMap.put("desc", jSONObject2.optString("desc"));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        boolean optBoolean = jSONObject2.optBoolean("isRecentForward");
        String optString3 = jSONObject2.optString("content");
        int optInt = jSONObject2.optInt(FirebaseAnalytics.C113379b.INDEX);
        if (optBoolean) {
            C115669n.INSTANCE.idkeyStat(1865, 12, 1, false);
            ArrayList<C78536j0> Bv0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Bv0();
            if (Bv0 != null && !Bv0.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= Bv0.size()) {
                        break;
                    }
                    C78536j0 j0Var = Bv0.get(i);
                    if (optInt == i && optString3.equalsIgnoreCase(MD5Util.getMD5String(j0Var.f230019a))) {
                        C115669n.INSTANCE.idkeyStat(1865, 13, 1, false);
                        str2 = j0Var.f230019a;
                        z2 = true;
                        break;
                    }
                    i++;
                }
                Intent intent = new Intent();
                intent.putExtra("webview_params", hashMap);
                if (z2 && !Util.isNullOrNil(str2)) {
                    C115669n.INSTANCE.idkeyStat(1865, 14, 1, false);
                    intent.putExtra("Select_Conv_User", str2);
                }
                ((C14088e) C86312j.m106911c(C14088e.class)).sd0(this, intent, 0);
            }
        }
        z2 = false;
        Intent intent2 = new Intent();
        intent2.putExtra("webview_params", hashMap);
        C115669n.INSTANCE.idkeyStat(1865, 14, 1, false);
        intent2.putExtra("Select_Conv_User", str2);
        ((C14088e) C86312j.m106911c(C14088e.class)).sd0(this, intent2, 0);
    }

    /* renamed from: p */
    public void mo5688p(int i, int i2, Intent intent) {
        int i3 = i2;
        Intent intent2 = intent;
        if (i != 1) {
            this.f19815f.mo5689a("");
        } else if (i3 == -1) {
            byte[] bArr = null;
            String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
            if (stringExtra != null) {
                String optString = this.f25837h.optString("thumbUrl");
                Bitmap c = !Util.isNullOrNil(optString) ? optString.startsWith("http") ? ((C8451i) C86312j.m106911c(C8451i.class)).get(optString) : MMBitmapFactory.m98734c(this.f25837h.optString("thumbUrl")) : null;
                if (c != null && !c.isRecycled()) {
                    Log.m105924i("LiteAppJsApiSendGameShareCard", "thumb image is not null");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    c.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                ((C77050b) C86312j.m106911c(C77050b.class)).mo107305Yb(new GameShareCardInfo(new LiteAppBizDataInfo(this.f25836g, this.f25837h.optString("path"), this.f25837h.optString(SearchIntents.EXTRA_QUERY), this.f25837h.optString("bizData"), Integer.valueOf(this.f25837h.optInt(FirebaseAnalytics.C113379b.SOURCE)), this.f25837h.optInt(DownloadInfo.PRIORITY)), this.f25837h.optString("gameShareId"), this.f25837h.optString("gameShareData"), this.f25837h.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE), this.f25837h.optInt("isVideo"), this.f25837h.optInt("duration"), this.f25837h.optString("srcId")), bArr, stringExtra);
                this.f19815f.mo5690b();
            }
        } else if (i3 == 0 || i3 == 1) {
            this.f19815f.mo5689a("cancel");
        } else {
            this.f19815f.mo5689a("");
        }
    }
}
