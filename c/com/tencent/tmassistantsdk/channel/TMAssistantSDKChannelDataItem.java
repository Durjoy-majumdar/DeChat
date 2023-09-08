package com.tencent.tmassistantsdk.channel;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.util.Base64;
import com.tencent.tmassistantsdk.util.Cryptor;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class TMAssistantSDKChannelDataItem {
    public static final int DATEITEM_VERSION = 1;
    private static final String ENCRYPT_KEY = "&-*)Wb5_U,[^!9'+";
    public static final int IPCDATA_MIN_VERSION = 1;
    private static final String TAG = "MicroMsg.TMAssistantSDKChannelDataItem";
    public int mDBIdentity = -1;
    public String mDataItemAction = "";
    public long mDataItemEndTime = 0;
    public long mDataItemStartTime = 0;
    public int mDataItemType = 0;
    public int mDataItemVersion = 0;
    public String mHostPackageName;
    public String mHostUserIdentity = "";
    public int mHostVersion = 0;
    public byte[] mIPCData = null;

    public TMAssistantSDKChannelDataItem(String str, int i, String str2, int i2, String str3, long j, long j2, int i3, byte[] bArr) {
        this.mHostPackageName = str;
        if (str == null) {
            this.mHostPackageName = "";
        }
        this.mHostVersion = i;
        this.mHostUserIdentity = str2;
        if (str2 == null) {
            this.mHostUserIdentity = "";
        }
        this.mDataItemType = i2;
        this.mDataItemAction = str3;
        if (str3 == null) {
            this.mDataItemAction = "";
        }
        this.mDataItemStartTime = j;
        this.mDataItemEndTime = j2;
        this.mDataItemVersion = i3;
        this.mIPCData = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        r0 = r0.getString("mIPCData");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem getDataItemFromByte(byte[] r18) {
        /*
            r0 = r18
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.TMAssistantSDKChannelDataItem"
            r3 = 0
            if (r0 == 0) goto L_0x0086
            int r4 = r0.length
            if (r4 > 0) goto L_0x000e
            goto L_0x0086
        L_0x000e:
            com.tencent.tmassistantsdk.util.Cryptor r4 = new com.tencent.tmassistantsdk.util.Cryptor
            r4.<init>()
            java.lang.String r5 = "&-*)Wb5_U,[^!9'+"
            byte[] r5 = r5.getBytes()
            byte[] r0 = r4.decrypt(r0, r5)
            if (r0 == 0) goto L_0x0086
            r4 = 0
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            r0.<init>(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mHostPackageName"
            java.lang.String r7 = r0.getString(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mHostVersion"
            int r8 = r0.getInt(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mHostUserIdentity"
            java.lang.String r9 = r0.getString(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mDataItemType"
            int r10 = r0.getInt(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mDataItemAction"
            java.lang.String r11 = r0.getString(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mDataItemStartTime"
            long r12 = r0.getLong(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mDataItemEndTime"
            long r14 = r0.getLong(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            java.lang.String r5 = "mDataItemVersion"
            int r5 = r0.getInt(r5)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            r6 = 1
            if (r5 < r6) goto L_0x006e
            java.lang.String r6 = "mIPCData"
            java.lang.String r0 = r0.getString(r6)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            if (r0 == 0) goto L_0x006e
            byte[] r0 = com.tencent.tmassistantsdk.util.Base64.decode((java.lang.String) r0, (int) r4)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            r17 = r0
            goto L_0x0070
        L_0x006e:
            r17 = r3
        L_0x0070:
            com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem r0 = new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            r6 = r0
            r16 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ UnsupportedEncodingException -> 0x0080, JSONException -> 0x0079 }
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r1, r4)
            goto L_0x0086
        L_0x0080:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r1, r4)
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem.getDataItemFromByte(byte[]):com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem");
    }

    public byte[] getBuffer() {
        byte[] bytes;
        byte[] bArr;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mHostPackageName", this.mHostPackageName);
            jSONObject.put("mHostVersion", this.mHostVersion);
            jSONObject.put("mHostUserIdentity", this.mHostUserIdentity);
            jSONObject.put("mDataItemType", this.mDataItemType);
            jSONObject.put("mDataItemAction", this.mDataItemAction);
            jSONObject.put("mDataItemStartTime", this.mDataItemStartTime);
            jSONObject.put("mDataItemEndTime", this.mDataItemEndTime);
            jSONObject.put("mDataItemVersion", this.mDataItemVersion);
            if (!(this.mDataItemVersion < 1 || (bArr = this.mIPCData) == null || (encodeToString = Base64.encodeToString(bArr, 0)) == null)) {
                jSONObject.put("mIPCData", encodeToString);
            }
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null || (bytes = jSONObject2.getBytes("UTF-8")) == null) {
                return null;
            }
            return new Cryptor().encrypt(bytes, ENCRYPT_KEY.getBytes());
        } catch (JSONException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return null;
        } catch (UnsupportedEncodingException e2) {
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            return null;
        }
    }
}
