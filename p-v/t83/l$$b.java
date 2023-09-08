package t83;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.HashMap;
import org.json.JSONObject;

public class l$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f39010d;

    /* renamed from: e */
    public final /* synthetic */ String f39011e;

    /* renamed from: f */
    public final /* synthetic */ C48590l f39012f;

    public l$$b(C48590l lVar, Bundle bundle, String str) {
        this.f39012f = lVar;
        this.f39010d = bundle;
        this.f39011e = str;
    }

    public void run() {
        C13851h1 h1Var = new C13851h1();
        HashMap hashMap = new HashMap();
        h1Var.f38983a = hashMap;
        hashMap.put("link", this.f39010d.getString("link"));
        h1Var.f38983a.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f39010d.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        h1Var.f38983a.put("desc", this.f39010d.getString("desc"));
        h1Var.f38983a.put("appid", this.f39010d.getString("appid"));
        h1Var.f38991d = new JSONObject();
        h1Var.f38983a.put("img_url", this.f39010d.getString("img_url"));
        h1Var.f38983a.put("use_update_jsapi_data", Boolean.valueOf(this.f39010d.getBoolean("use_update_jsapi_data")));
        h1Var.f38989b = "call";
        h1Var.f38990c = "";
        h1Var.f38996i = this.f39011e;
        this.f39012f.f130000e.add(h1Var);
        this.f39012f.mo73247n();
    }
}
