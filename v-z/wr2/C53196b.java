package wr2;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Set;

/* renamed from: wr2.b */
public class C53196b {

    /* renamed from: a */
    public final String f148391a;

    /* renamed from: b */
    public final String f148392b;

    /* renamed from: c */
    public final String f148393c;

    /* renamed from: d */
    public final String f148394d;

    public C53196b(String str, String str2, String str3, String str4) {
        this.f148391a = str;
        this.f148392b = str2;
        this.f148393c = str3;
        this.f148394d = str4;
    }

    /* renamed from: a */
    public final Intent mo73870a() {
        Uri uri;
        String queryParameter;
        SnsMethodCalculate.markStartTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        String str = this.f148391a;
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            String str2 = this.f148393c;
            if (!TextUtils.isEmpty(str2)) {
                SnsMethodCalculate.markStartTimeMs("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                uri = Uri.parse(str);
                if (!TextUtils.isEmpty(str2)) {
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    if (queryParameterNames == null || queryParameterNames.isEmpty() || !queryParameterNames.contains("id")) {
                        uri = uri.buildUpon().appendQueryParameter("id", str2).build();
                    } else if (!str2.equals(uri.getQueryParameter("id"))) {
                        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
                        for (String next : queryParameterNames) {
                            if ("id".equals(next)) {
                                clearQuery.appendQueryParameter("id", str2);
                            } else if (!(next == null || (queryParameter = uri.getQueryParameter(next)) == null)) {
                                clearQuery.appendQueryParameter(next, queryParameter);
                            }
                        }
                        uri = clearQuery.build();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            } else {
                uri = Uri.parse(str);
                str2 = uri.getQueryParameter("id");
                if (TextUtils.isEmpty(str2)) {
                    SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                    return null;
                }
            }
            intent.putExtra("target_app_id", str2);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            if (!TextUtils.isEmpty(this.f148392b)) {
                intent.setPackage(this.f148392b);
            }
            if (!TextUtils.isEmpty(this.f148394d)) {
                intent.putExtra("market_app_name", this.f148394d);
            }
            SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            return intent;
        }
        SnsMethodCalculate.markEndTimeMs("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        return null;
    }
}
