package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/WechatNativeExtraDataInvokeFunctionalPage;", "Landroid/os/Parcelable;", "Ldi0/k;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage */
public final class WechatNativeExtraDataInvokeFunctionalPage implements Parcelable, C86295k {
    public static final Parcelable.Creator<WechatNativeExtraDataInvokeFunctionalPage> CREATOR = new C83555a();

    /* renamed from: d */
    public String f244091d;

    /* renamed from: e */
    public String f244092e;

    /* renamed from: f */
    public String f244093f;

    /* renamed from: g */
    public String f244094g;

    /* renamed from: h */
    public boolean f244095h;

    /* renamed from: i */
    public int f244096i;

    /* renamed from: j */
    public String f244097j;

    /* renamed from: n */
    public String f244098n;

    /* renamed from: o */
    public String f244099o;

    /* renamed from: p */
    public String f244100p;

    /* renamed from: q */
    public String f244101q;

    /* renamed from: r */
    public int f244102r;

    /* renamed from: s */
    public String f244103s;

    /* renamed from: t */
    public String f244104t;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage$a */
    public static final class C83555a implements Parcelable.Creator<WechatNativeExtraDataInvokeFunctionalPage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WechatNativeExtraDataInvokeFunctionalPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WechatNativeExtraDataInvokeFunctionalPage[i];
        }
    }

    public WechatNativeExtraDataInvokeFunctionalPage() {
        this((String) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 16383, (C8480h) null);
    }

    public WechatNativeExtraDataInvokeFunctionalPage(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11) {
        this.f244091d = str;
        this.f244092e = str2;
        this.f244093f = str3;
        this.f244094g = str4;
        this.f244095h = z;
        this.f244096i = i;
        this.f244097j = str5;
        this.f244098n = str6;
        this.f244099o = str7;
        this.f244100p = str8;
        this.f244101q = str9;
        this.f244102r = i2;
        this.f244103s = str10;
        this.f244104t = str11;
    }

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("invokeTicket", this.f244091d);
            jSONObject.put("name", this.f244092e);
            jSONObject.put("args", this.f244093f);
            jSONObject.put("jsapiType", this.f244094g);
            jSONObject.put("isGame", this.f244095h);
            jSONObject.put("wxa_scene", this.f244096i);
            jSONObject.put("packageName", this.f244097j);
            jSONObject.put("callbackActivity", this.f244098n);
            jSONObject.put("transitiveData", this.f244099o);
            jSONObject.put("sessionId", this.f244100p);
            jSONObject.put("instanceId", this.f244101q);
            jSONObject.put("debugMode", this.f244102r);
            jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f244103s);
            jSONObject.put("currentH5Url", this.f244104t);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "{\n            val obj = … obj.toString()\n        }");
            return jSONObject2;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.WechatNativeExtraDataInvokeFunctionalPage", e, "", new Object[0]);
            return "{}";
        }
    }

    /* renamed from: b */
    public final void mo115870b(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "obj");
        this.f244091d = jSONObject.getString("invokeTicket");
        this.f244092e = jSONObject.getString("name");
        this.f244097j = jSONObject.getString("packageName");
        this.f244093f = jSONObject.getString("args");
        this.f244094g = jSONObject.getString("jsapiType");
        this.f244095h = jSONObject.optBoolean("isGame");
        this.f244096i = jSONObject.getInt("wxa_scene");
        this.f244098n = jSONObject.getString("callbackActivity");
        this.f244099o = jSONObject.optString("transitiveData");
        this.f244100p = jSONObject.optString("sessionId");
        this.f244101q = jSONObject.optString("instanceId");
        this.f244102r = jSONObject.optInt("debugMode");
        this.f244103s = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f244104t = jSONObject.optString("currentH5Url");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f244091d);
        parcel.writeString(this.f244092e);
        parcel.writeString(this.f244093f);
        parcel.writeString(this.f244094g);
        parcel.writeInt(this.f244095h ? 1 : 0);
        parcel.writeInt(this.f244096i);
        parcel.writeString(this.f244097j);
        parcel.writeString(this.f244098n);
        parcel.writeString(this.f244099o);
        parcel.writeString(this.f244100p);
        parcel.writeString(this.f244101q);
        parcel.writeInt(this.f244102r);
        parcel.writeString(this.f244103s);
        parcel.writeString(this.f244104t);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, int r30, gy3.C8480h r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x002a
            r6 = 0
            goto L_0x002c
        L_0x002a:
            r6 = r20
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r21
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r22
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r23
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r2
            goto L_0x004c
        L_0x004a:
            r11 = r24
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r2
            goto L_0x0054
        L_0x0052:
            r12 = r25
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = r2
            goto L_0x005c
        L_0x005a:
            r13 = r26
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r7 = r27
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r28
        L_0x006b:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r2 = r29
        L_0x0072:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r7
            r29 = r14
            r30 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, gy3.h):void");
    }
}
