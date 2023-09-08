package com.tencent.mapsdk.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.processor.RequestProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.lw */
public class C113950lw implements RequestProcessor {

    /* renamed from: a */
    public static final /* synthetic */ boolean f340828a = true;

    /* renamed from: b */
    private final String f340829b;

    /* renamed from: com.tencent.mapsdk.internal.lw$1 */
    public static /* synthetic */ class C1139511 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f340830a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.map.tools.net.NetMethod[] r0 = com.tencent.map.tools.net.NetMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f340830a = r0
                com.tencent.map.tools.net.NetMethod r1 = com.tencent.map.tools.net.NetMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f340830a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.map.tools.net.NetMethod r1 = com.tencent.map.tools.net.NetMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113950lw.C1139511.<clinit>():void");
        }
    }

    private C113950lw(String str) {
        this.f340829b = str;
    }

    /* renamed from: a */
    public static C113950lw m157887a(String str) {
        return new C113950lw(str);
    }

    public void onRequest(NetRequest netRequest) {
        byte[] bArr;
        String str = this.f340829b;
        if (netRequest != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(netRequest.url);
            HashMap hashMap = new HashMap();
            int i = C1139511.f340830a[netRequest.mNetMethod.ordinal()];
            if (i == 1) {
                String query = parse.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    if (f340828a || query != null) {
                        for (String str2 : query.split("&")) {
                            String[] split = str2.split("=");
                            String substring = str2.substring(split[0].length() + 1);
                            split[1] = substring;
                            hashMap.put(split[0], substring);
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            } else if (i == 2 && ((bArr = netRequest.postData) == null || bArr.length > 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    JSONArray names = jSONObject.names();
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString = names.optString(i2);
                        hashMap.put(optString, jSONObject.opt(optString));
                    }
                } catch (JSONException unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getPath());
            sb.append("?");
            if (!hashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String str3 = (String) arrayList.get(i3);
                    Object obj = hashMap.get(str3);
                    if (obj != null) {
                        if (i3 == arrayList.size() - 1) {
                            sb.append(str3);
                            sb.append("=");
                            sb.append(obj.toString());
                        } else {
                            sb.append(str3);
                            sb.append("=");
                            sb.append(obj.toString());
                            sb.append("&");
                        }
                    }
                }
            }
            sb.append(str);
            netRequest.url = parse.buildUpon().appendQueryParameter("sig", Util.getMD5String(sb.toString())).build().toString();
        }
    }

    /* renamed from: a */
    private static void m157888a(NetRequest netRequest, String str) {
        byte[] bArr;
        if (netRequest != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(netRequest.url);
            HashMap hashMap = new HashMap();
            int i = C1139511.f340830a[netRequest.mNetMethod.ordinal()];
            if (i == 1) {
                String query = parse.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    if (f340828a || query != null) {
                        for (String str2 : query.split("&")) {
                            String[] split = str2.split("=");
                            String substring = str2.substring(split[0].length() + 1);
                            split[1] = substring;
                            hashMap.put(split[0], substring);
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            } else if (i == 2 && ((bArr = netRequest.postData) == null || bArr.length > 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    JSONArray names = jSONObject.names();
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString = names.optString(i2);
                        hashMap.put(optString, jSONObject.opt(optString));
                    }
                } catch (JSONException unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getPath());
            sb.append("?");
            if (!hashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String str3 = (String) arrayList.get(i3);
                    Object obj = hashMap.get(str3);
                    if (obj != null) {
                        if (i3 == arrayList.size() - 1) {
                            sb.append(str3);
                            sb.append("=");
                            sb.append(obj.toString());
                        } else {
                            sb.append(str3);
                            sb.append("=");
                            sb.append(obj.toString());
                            sb.append("&");
                        }
                    }
                }
            }
            sb.append(str);
            netRequest.url = parse.buildUpon().appendQueryParameter("sig", Util.getMD5String(sb.toString())).build().toString();
        }
    }
}
