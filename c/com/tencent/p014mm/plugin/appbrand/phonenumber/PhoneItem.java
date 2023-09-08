package com.tencent.p014mm.plugin.appbrand.phonenumber;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Landroid/os/Parcelable;", "a", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem */
public final class PhoneItem implements Parcelable {
    public static final Parcelable.Creator<PhoneItem> CREATOR = new C84014b();

    /* renamed from: q */
    public static final C84013a f245270q = new C84013a((C8480h) null);

    /* renamed from: d */
    public final String f245271d;

    /* renamed from: e */
    public final String f245272e;

    /* renamed from: f */
    public final String f245273f;

    /* renamed from: g */
    public final String f245274g;

    /* renamed from: h */
    public final String f245275h;

    /* renamed from: i */
    public final boolean f245276i;

    /* renamed from: j */
    public final boolean f245277j;

    /* renamed from: n */
    public boolean f245278n;

    /* renamed from: o */
    public boolean f245279o;

    /* renamed from: p */
    public String f245280p;

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem$a */
    public static final class C84013a {
        public C84013a(C8480h hVar) {
        }

        /* renamed from: a */
        public final PhoneItem mo116667a(String str) {
            String str2 = str;
            C87412m.m108594g(str2, "jsonStr");
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("mobile");
                String optString2 = jSONObject.optString("show_mobile");
                boolean optBoolean = jSONObject.optBoolean("need_auth", true);
                boolean optBoolean2 = jSONObject.optBoolean("allow_send_sms", true);
                String optString3 = jSONObject.optString("encryptedData");
                String optString4 = jSONObject.optString("iv");
                boolean optBoolean3 = jSONObject.optBoolean("is_wechat", false);
                boolean optBoolean4 = jSONObject.optBoolean("is_check", false);
                String optString5 = jSONObject.optString("cloud_id", "");
                String optString6 = jSONObject.optString("data", "");
                C87412m.m108593f(optString, "mobile");
                C87412m.m108593f(optString2, "showMobile");
                C87412m.m108593f(optString3, "encryptedData");
                C87412m.m108593f(optString4, "iv");
                C87412m.m108593f(optString5, "cloud_id");
                C87412m.m108593f(optString6, "data");
                return new PhoneItem(optString, optString2, optString3, optString4, optString5, optBoolean, optBoolean2, optBoolean3, optBoolean4, optString6);
            } catch (JSONException unused) {
                Log.m105921e("MicroMsg.PhoneItem", "jsonStr:%s", str2);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem$b */
    public static final class C84014b implements Parcelable.Creator<PhoneItem> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new PhoneItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new PhoneItem[i];
        }
    }

    public PhoneItem(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, String str6) {
        C87412m.m108594g(str, "mobile");
        C87412m.m108594g(str2, "showMobile");
        C87412m.m108594g(str3, "encryptedData");
        C87412m.m108594g(str4, "iv");
        C87412m.m108594g(str5, "cloud_id");
        C87412m.m108594g(str6, "data");
        this.f245271d = str;
        this.f245272e = str2;
        this.f245273f = str3;
        this.f245274g = str4;
        this.f245275h = str5;
        this.f245276i = z;
        this.f245277j = z2;
        this.f245278n = z3;
        this.f245279o = z4;
        this.f245280p = str6;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PhoneItem)) {
            return super.equals(obj);
        }
        PhoneItem phoneItem = (PhoneItem) obj;
        return C87412m.m108589b(phoneItem.f245271d, this.f245271d) && phoneItem.f245278n == this.f245278n;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f245271d.hashCode() * 31) + this.f245272e.hashCode()) * 31) + this.f245273f.hashCode()) * 31) + this.f245274g.hashCode()) * 31) + this.f245275h.hashCode()) * 31;
        boolean z = this.f245276i;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f245277j;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f245278n;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f245279o;
        if (!z5) {
            z2 = z5;
        }
        return ((i3 + (z2 ? 1 : 0)) * 31) + this.f245280p.hashCode();
    }

    public String toString() {
        return "PhoneItem(mobile=" + this.f245271d + ", showMobile=" + this.f245272e + ", encryptedData=" + this.f245273f + ", iv=" + this.f245274g + ", cloud_id=" + this.f245275h + ", needAuth=" + this.f245276i + ", allowSendSms=" + this.f245277j + ", isWechat=" + this.f245278n + ", isCheck=" + this.f245279o + ", data=" + this.f245280p + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f245271d);
        parcel.writeString(this.f245272e);
        parcel.writeString(this.f245273f);
        parcel.writeString(this.f245274g);
        parcel.writeString(this.f245275h);
        parcel.writeInt(this.f245276i ? 1 : 0);
        parcel.writeInt(this.f245277j ? 1 : 0);
        parcel.writeInt(this.f245278n ? 1 : 0);
        parcel.writeInt(this.f245279o ? 1 : 0);
        parcel.writeString(this.f245280p);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PhoneItem(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.lang.String r24, int r25, gy3.C8480h r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r8 = r2
            goto L_0x000c
        L_0x000a:
            r8 = r19
        L_0x000c:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L_0x0013
            r9 = 0
            goto L_0x0015
        L_0x0013:
            r9 = r20
        L_0x0015:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001c
            r1 = 1
            r10 = 1
            goto L_0x001e
        L_0x001c:
            r10 = r21
        L_0x001e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0024
            r11 = 0
            goto L_0x0026
        L_0x0024:
            r11 = r22
        L_0x0026:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002c
            r12 = 0
            goto L_0x002e
        L_0x002c:
            r12 = r23
        L_0x002e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0034
            r13 = r2
            goto L_0x0036
        L_0x0034:
            r13 = r24
        L_0x0036:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, int, gy3.h):void");
    }
}
