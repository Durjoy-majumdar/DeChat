package com.tencent.p014mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/downloader/model/CloudGameAppInfo;", "Landroid/os/Parcelable;", "plugin-downloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.downloader.model.CloudGameAppInfo */
public final class CloudGameAppInfo implements Parcelable {
    public static final Parcelable.Creator<CloudGameAppInfo> CREATOR = new C40913a();

    /* renamed from: d */
    public final String f110061d;

    /* renamed from: e */
    public final String f110062e;

    /* renamed from: f */
    public final String f110063f;

    /* renamed from: g */
    public final String f110064g;

    /* renamed from: h */
    public final String f110065h;

    /* renamed from: i */
    public final String f110066i;

    /* renamed from: j */
    public final String f110067j;

    /* renamed from: n */
    public final String f110068n;

    /* renamed from: o */
    public final String f110069o;

    /* renamed from: p */
    public final long f110070p;

    /* renamed from: q */
    public final String f110071q;

    /* renamed from: r */
    public final String f110072r;

    /* renamed from: s */
    public final String f110073s;

    /* renamed from: t */
    public final int f110074t;

    /* renamed from: com.tencent.mm.plugin.downloader.model.CloudGameAppInfo$a */
    public static final class C40913a implements Parcelable.Creator<CloudGameAppInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new CloudGameAppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new CloudGameAppInfo[i];
        }
    }

    public CloudGameAppInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, 16383, (C8480h) null);
    }

    public CloudGameAppInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, String str10, String str11, String str12, int i) {
        this.f110061d = str;
        this.f110062e = str2;
        this.f110063f = str3;
        this.f110064g = str4;
        this.f110065h = str5;
        this.f110066i = str6;
        this.f110067j = str7;
        this.f110068n = str8;
        this.f110069o = str9;
        this.f110070p = j;
        this.f110071q = str10;
        this.f110072r = str11;
        this.f110073s = str12;
        this.f110074t = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudGameAppInfo)) {
            return false;
        }
        CloudGameAppInfo cloudGameAppInfo = (CloudGameAppInfo) obj;
        return C87412m.m108589b(this.f110061d, cloudGameAppInfo.f110061d) && C87412m.m108589b(this.f110062e, cloudGameAppInfo.f110062e) && C87412m.m108589b(this.f110063f, cloudGameAppInfo.f110063f) && C87412m.m108589b(this.f110064g, cloudGameAppInfo.f110064g) && C87412m.m108589b(this.f110065h, cloudGameAppInfo.f110065h) && C87412m.m108589b(this.f110066i, cloudGameAppInfo.f110066i) && C87412m.m108589b(this.f110067j, cloudGameAppInfo.f110067j) && C87412m.m108589b(this.f110068n, cloudGameAppInfo.f110068n) && C87412m.m108589b(this.f110069o, cloudGameAppInfo.f110069o) && this.f110070p == cloudGameAppInfo.f110070p && C87412m.m108589b(this.f110071q, cloudGameAppInfo.f110071q) && C87412m.m108589b(this.f110072r, cloudGameAppInfo.f110072r) && C87412m.m108589b(this.f110073s, cloudGameAppInfo.f110073s) && this.f110074t == cloudGameAppInfo.f110074t;
    }

    public int hashCode() {
        String str = this.f110061d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f110062e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110063f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110064g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f110065h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f110066i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f110067j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f110068n;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f110069o;
        int hashCode9 = str9 == null ? 0 : str9.hashCode();
        long j = this.f110070p;
        int i2 = (((hashCode8 + hashCode9) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str10 = this.f110071q;
        int hashCode10 = (i2 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f110072r;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f110073s;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return ((hashCode11 + i) * 31) + this.f110074t;
    }

    public String toString() {
        return "CloudGameAppInfo(appName=" + this.f110061d + ", iconUrl=" + this.f110062e + ", appId=" + this.f110063f + ", packageName=" + this.f110064g + ", developer=" + this.f110065h + ", operator=" + this.f110066i + ", pkgVersion=" + this.f110067j + ", privilegesUrl=" + this.f110068n + ", privacyUrl=" + this.f110069o + ", packageSize=" + this.f110070p + ", downloadUrl=" + this.f110071q + ", alternativeDownloadUrl=" + this.f110072r + ", packageMd5=" + this.f110073s + ", downloaderType=" + this.f110074t + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f110061d);
        parcel.writeString(this.f110062e);
        parcel.writeString(this.f110063f);
        parcel.writeString(this.f110064g);
        parcel.writeString(this.f110065h);
        parcel.writeString(this.f110066i);
        parcel.writeString(this.f110067j);
        parcel.writeString(this.f110068n);
        parcel.writeString(this.f110069o);
        parcel.writeLong(this.f110070p);
        parcel.writeString(this.f110071q);
        parcel.writeString(this.f110072r);
        parcel.writeString(this.f110073s);
        parcel.writeInt(this.f110074t);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CloudGameAppInfo(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, int r32, gy3.C8480h r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x001b
            r4 = r5
            goto L_0x001d
        L_0x001b:
            r4 = r19
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0025
        L_0x0023:
            r6 = r20
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r5
            goto L_0x002d
        L_0x002b:
            r7 = r21
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r8 = r5
            goto L_0x0035
        L_0x0033:
            r8 = r22
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r5 = r23
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0044
        L_0x0042:
            r9 = r24
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r25
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0053
            r11 = 0
            goto L_0x0055
        L_0x0053:
            r11 = r26
        L_0x0055:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005b
            r13 = r2
            goto L_0x005d
        L_0x005b:
            r13 = r28
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0063
            r14 = r2
            goto L_0x0065
        L_0x0063:
            r14 = r29
        L_0x0065:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r2 = r30
        L_0x006c:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0072
            r0 = 0
            goto L_0x0074
        L_0x0072:
            r0 = r31
        L_0x0074:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r5
            r25 = r9
            r26 = r10
            r27 = r11
            r29 = r13
            r30 = r14
            r31 = r2
            r32 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, int, gy3.h):void");
    }
}
