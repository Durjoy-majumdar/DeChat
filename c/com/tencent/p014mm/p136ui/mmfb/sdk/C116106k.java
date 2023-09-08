package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Bundle;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.k */
public final class C116106k {
    /* renamed from: a */
    public static Bundle m163397a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m163398b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String next : bundle.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(URLEncoder.encode(next) + "=" + URLEncoder.encode(bundle.getString(next)));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static JSONObject m163399c(String str) {
        if (!str.equals("false")) {
            if (str.equals("true")) {
                str = "{value : true}";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                throw new C116105j(jSONObject2.getString(StateEvent.Name.MESSAGE), jSONObject2.getString("type"), 0);
            } else if (jSONObject.has(StateEvent.Name.ERROR_CODE) && jSONObject.has("error_msg")) {
                throw new C116105j(jSONObject.getString("error_msg"), "", Integer.parseInt(jSONObject.getString(StateEvent.Name.ERROR_CODE)));
            } else if (jSONObject.has(StateEvent.Name.ERROR_CODE)) {
                throw new C116105j("request failed", "", Integer.parseInt(jSONObject.getString(StateEvent.Name.ERROR_CODE)));
            } else if (jSONObject.has("error_msg")) {
                throw new C116105j(jSONObject.getString("error_msg"));
            } else if (!jSONObject.has("error_reason")) {
                return jSONObject;
            } else {
                throw new C116105j(jSONObject.getString("error_reason"));
            }
        } else {
            throw new C116105j("request failed");
        }
    }

    /* renamed from: d */
    public static String m163400d(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1000);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                inputStream.close();
                return sb.toString();
            }
        }
    }
}
