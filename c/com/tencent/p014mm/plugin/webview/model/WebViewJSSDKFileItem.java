package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p1081gi.C98121d;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem */
public abstract class WebViewJSSDKFileItem implements Parcelable {

    /* renamed from: d */
    public String f283021d;

    /* renamed from: e */
    public String f283022e;

    /* renamed from: f */
    public String f283023f;

    /* renamed from: g */
    public String f283024g;

    /* renamed from: h */
    public String f283025h;

    /* renamed from: i */
    public String f283026i;

    /* renamed from: j */
    public String f283027j;

    /* renamed from: n */
    public int f283028n;

    /* renamed from: o */
    public int f283029o;

    /* renamed from: p */
    public int f283030p;

    /* renamed from: q */
    public int f283031q;

    /* renamed from: r */
    public C96646a f283032r;

    /* renamed from: s */
    public boolean f283033s;

    /* renamed from: t */
    public boolean f283034t = true;

    /* renamed from: u */
    public boolean f283035u = true;

    /* renamed from: v */
    public Bundle f283036v = new Bundle();

    /* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem$a */
    public static class C96646a {
        public String field_aesKey;
        public String field_fileId;
        public int field_fileLength;
        public String field_fileUrl;

        /* renamed from: a */
        public String mo134797a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aesKey", this.field_aesKey);
                jSONObject.put("fileId", this.field_fileId);
                jSONObject.put("fileUrl", this.field_fileUrl);
                jSONObject.put("fileLength", this.field_fileLength);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public WebViewJSSDKFileItem() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|(2:13|11)|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00a9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo6979a() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "appId"
            java.lang.String r2 = r7.f283021d     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "localId"
            java.lang.String r2 = r7.f283022e     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "thumbFilePath"
            java.lang.String r2 = r7.f283023f     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "origFilePath"
            java.lang.String r2 = r7.f283024g     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "serverId"
            java.lang.String r2 = r7.f283025h     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "mediaId"
            java.lang.String r2 = r7.f283026i     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "fileName"
            java.lang.String r2 = r7.f283027j     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "mediaType"
            int r2 = r7.f283028n     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "size"
            int r2 = r7.f283029o     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "width"
            int r2 = r7.f283030p     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "height"
            int r2 = r7.f283031q     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem$a r1 = r7.f283032r     // Catch:{ JSONException -> 0x00b0 }
            if (r1 == 0) goto L_0x0067
            java.lang.String r2 = "cdnInfo"
            java.lang.String r1 = r1.mo134797a()     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00b0 }
        L_0x0067:
            java.lang.String r1 = "upload"
            boolean r2 = r7.f283033s     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "needCompress"
            boolean r2 = r7.f283034t     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "needUploadCDNInfo"
            boolean r2 = r7.f283035u     // Catch:{ JSONException -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = "extra"
            android.os.Bundle r2 = r7.f283036v     // Catch:{ JSONException -> 0x00b0 }
            if (r2 != 0) goto L_0x0088
            java.lang.String r2 = ""
            goto L_0x00ad
        L_0x0088:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b0 }
            r3.<init>()     // Catch:{ JSONException -> 0x00b0 }
            java.util.Set r4 = r2.keySet()     // Catch:{ JSONException -> 0x00a9 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x00a9 }
        L_0x0095:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x00a9 }
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x00a9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x00a9 }
            java.lang.Object r6 = r2.get(r5)     // Catch:{ JSONException -> 0x00a9 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x00a9 }
            goto L_0x0095
        L_0x00a9:
            java.lang.String r2 = r3.toString()     // Catch:{ JSONException -> 0x00b0 }
        L_0x00ad:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00b0 }
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem.mo6979a():org.json.JSONObject");
    }

    /* renamed from: b */
    public abstract String mo6980b();

    /* renamed from: c */
    public abstract String mo6981c();

    /* renamed from: d */
    public void mo6982d(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f283021d = jSONObject.optString("appId");
            this.f283022e = jSONObject.optString(C66261f3.COL_LOCALID);
            this.f283023f = jSONObject.optString("thumbFilePath");
            this.f283024g = jSONObject.optString("origFilePath");
            this.f283025h = jSONObject.optString("serverId");
            this.f283026i = jSONObject.optString("mediaId");
            this.f283027j = jSONObject.optString(DownloadInfo.FILENAME);
            this.f283028n = jSONObject.optInt("mediaType");
            this.f283029o = jSONObject.optInt("size");
            this.f283030p = jSONObject.optInt("width");
            this.f283031q = jSONObject.optInt("height");
            String optString = jSONObject.optString("cdnInfo");
            C96646a aVar = new C96646a();
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                aVar.field_aesKey = jSONObject2.optString("aesKey");
                aVar.field_fileId = jSONObject2.optString("fileId");
                aVar.field_fileUrl = jSONObject2.optString("fileUrl");
                aVar.field_fileLength = jSONObject2.optInt("fileLength");
            } catch (JSONException unused) {
            }
            this.f283032r = aVar;
            this.f283033s = jSONObject.optBoolean("upload");
            this.f283034t = jSONObject.optBoolean("needCompress", true);
            this.f283035u = jSONObject.optBoolean("needUploadCDNInfo", true);
            String optString2 = jSONObject.optString("extra");
            Bundle bundle = new Bundle();
            if (optString2 != null && !optString2.isEmpty()) {
                try {
                    JSONObject jSONObject3 = new JSONObject(optString2);
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject3.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(next, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Byte) {
                            bundle.putByte(next, ((Byte) obj).byteValue());
                        } else if (obj instanceof Character) {
                            bundle.putChar(next, ((Character) obj).charValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(next, ((Float) obj).floatValue());
                        } else if (obj instanceof Short) {
                            bundle.putShort(next, ((Short) obj).shortValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        } else {
                            bundle.putString(next, obj.toString());
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
            this.f283036v = bundle;
        }
    }

    /* renamed from: e */
    public void mo134796e(C98121d dVar) {
        if (this.f283032r == null) {
            this.f283032r = new C96646a();
        }
        if (dVar == null) {
            Log.m105920e("MicroMsg.WebViewJSSDKFileItem", "sceneResult info is null");
            return;
        }
        C96646a aVar = this.f283032r;
        aVar.field_aesKey = dVar.field_aesKey;
        aVar.field_fileId = dVar.field_fileId;
        aVar.field_fileUrl = dVar.field_fileUrl;
        aVar.field_fileLength = (int) dVar.field_fileLength;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283021d);
        parcel.writeString(this.f283022e);
        parcel.writeString(this.f283023f);
        parcel.writeString(this.f283024g);
        parcel.writeInt(this.f283028n);
        parcel.writeInt(this.f283029o);
        parcel.writeInt(this.f283030p);
        parcel.writeInt(this.f283031q);
        parcel.writeBundle(this.f283036v);
    }

    public WebViewJSSDKFileItem(Parcel parcel) {
        this.f283021d = parcel.readString();
        this.f283022e = parcel.readString();
        this.f283023f = parcel.readString();
        this.f283024g = parcel.readString();
        this.f283028n = parcel.readInt();
        this.f283029o = parcel.readInt();
        this.f283030p = parcel.readInt();
        this.f283031q = parcel.readInt();
        this.f283036v = parcel.readBundle();
    }
}
