package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams */
final class SetTextStatusParams implements Parcelable {
    public static final Parcelable.Creator<SetTextStatusParams> CREATOR = new C55468a();

    /* renamed from: d */
    public final String f158045d;

    /* renamed from: e */
    public final String f158046e;

    /* renamed from: f */
    public final String f158047f;

    /* renamed from: g */
    public final String f158048g;

    /* renamed from: h */
    public final String f158049h;

    /* renamed from: i */
    public final String f158050i;

    /* renamed from: j */
    public final String f158051j;

    /* renamed from: n */
    public final String f158052n;

    /* renamed from: o */
    public final int f158053o;

    /* renamed from: p */
    public final int f158054p;

    /* renamed from: q */
    public final String f158055q;

    /* renamed from: r */
    public final String f158056r;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams$a */
    public static final class C55468a implements Parcelable.Creator<SetTextStatusParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new SetTextStatusParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new SetTextStatusParams[i];
        }
    }

    public SetTextStatusParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 4095, (C8480h) null);
    }

    public SetTextStatusParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10) {
        C87412m.m108594g(str, "iconResId");
        C87412m.m108594g(str2, "thumbUrl");
        C87412m.m108594g(str3, "desc");
        C87412m.m108594g(str4, "enterPath");
        C87412m.m108594g(str5, "verifyInfo");
        C87412m.m108594g(str6, "activityId");
        C87412m.m108594g(str7, "appId");
        C87412m.m108594g(str8, "appUsername");
        C87412m.m108594g(str9, "appName");
        C87412m.m108594g(str10, "appIconUrl");
        this.f158045d = str;
        this.f158046e = str2;
        this.f158047f = str3;
        this.f158048g = str4;
        this.f158049h = str5;
        this.f158050i = str6;
        this.f158051j = str7;
        this.f158052n = str8;
        this.f158053o = i;
        this.f158054p = i2;
        this.f158055q = str9;
        this.f158056r = str10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SetTextStatusParams(iconResId='" + this.f158045d + "', thumbUrl='" + this.f158046e + "', desc='" + this.f158047f + "', enterPath='" + this.f158048g + "', verifyInfo='" + this.f158049h + "', activityId='" + this.f158050i + "', appId='" + this.f158051j + "', appUsername='" + this.f158052n + "', versionType=" + this.f158053o + ", version=" + this.f158054p + ", appName='" + this.f158055q + "', appIconUrl='" + this.f158056r + "')";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f158045d);
        parcel.writeString(this.f158046e);
        parcel.writeString(this.f158047f);
        parcel.writeString(this.f158048g);
        parcel.writeString(this.f158049h);
        parcel.writeString(this.f158050i);
        parcel.writeString(this.f158051j);
        parcel.writeString(this.f158052n);
        parcel.writeInt(this.f158053o);
        parcel.writeInt(this.f158054p);
        parcel.writeString(this.f158055q);
        parcel.writeString(this.f158056r);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SetTextStatusParams(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, int r23, java.lang.String r24, java.lang.String r25, int r26, gy3.C8480h r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r14
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r16
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r17
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r18
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r19
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r20
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r21
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            r11 = 0
            if (r10 == 0) goto L_0x0049
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r10 = r22
        L_0x004b:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r11 = r23
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r24
        L_0x005a:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r25
        L_0x0061:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.SetTextStatusParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, gy3.h):void");
    }
}
