package hg0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.NameValuePair;

/* renamed from: hg0.u */
public final class C8524u {
    /* renamed from: a */
    public static String m8418a(List<NameValuePair> list) {
        if (list == null) {
            Log.m105928w("MicroMsg.GoogleContactLogic", "");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            NameValuePair nameValuePair = list.get(i);
            if (!TextUtils.isEmpty(nameValuePair.getName())) {
                if (i != 0) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(nameValuePair.getName(), "UTF-8"));
                sb.append("=");
                if (TextUtils.isEmpty(nameValuePair.getValue())) {
                    sb.append("");
                } else {
                    sb.append(URLEncoder.encode(nameValuePair.getValue(), "UTF-8"));
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m8419b(Context context) {
        return (context.getPackageManager().resolveActivity(new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 0) == null || context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT"), 0) == null || context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("googleauth", false)) ? false : true;
    }
}
