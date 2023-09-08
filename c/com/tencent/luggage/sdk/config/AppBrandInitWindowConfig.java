package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import wi0.C90973a0;
import wi0.C91003z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/config/AppBrandInitWindowConfig;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class AppBrandInitWindowConfig implements Parcelable {
    public static final Parcelable.Creator<AppBrandInitWindowConfig> CREATOR = new C80224a();

    /* renamed from: d */
    public boolean f234849d;

    /* renamed from: e */
    public int f234850e;

    /* renamed from: f */
    public C90973a0 f234851f;

    /* renamed from: g */
    public String f234852g;

    /* renamed from: h */
    public boolean f234853h;

    /* renamed from: i */
    public C91003z f234854i;

    /* renamed from: j */
    public C91003z f234855j;

    /* renamed from: com.tencent.luggage.sdk.config.AppBrandInitWindowConfig$a */
    public static final class C80224a implements Parcelable.Creator<AppBrandInitWindowConfig> {
        public Object createFromParcel(Parcel parcel) {
            C90973a0 a0Var;
            C87412m.m108594g(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            C90973a0 a0Var2 = C90973a0.UNKNOWN;
            int readInt2 = parcel.readInt();
            C90973a0[] values = C90973a0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    a0Var = a0Var2;
                    break;
                }
                a0Var = values[i];
                if (a0Var.ordinal() == readInt2) {
                    break;
                }
                i++;
            }
            return new AppBrandInitWindowConfig(z, readInt, a0Var, parcel.readString(), parcel.readInt() != 0, C91003z.valueOf(parcel.readString()), C91003z.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new AppBrandInitWindowConfig[i];
        }
    }

    public AppBrandInitWindowConfig() {
        this(false, 0, (C90973a0) null, (String) null, false, (C91003z) null, (C91003z) null, 127, (C8480h) null);
    }

    public AppBrandInitWindowConfig(boolean z, int i, C90973a0 a0Var, String str, boolean z2, C91003z zVar, C91003z zVar2) {
        C87412m.m108594g(zVar, "enterAnimation");
        C87412m.m108594g(zVar2, "exitAnimation");
        this.f234849d = z;
        this.f234850e = i;
        this.f234851f = a0Var;
        this.f234852g = str;
        this.f234853h = z2;
        this.f234854i = zVar;
        this.f234855j = zVar2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBrandInitWindowConfig)) {
            return false;
        }
        AppBrandInitWindowConfig appBrandInitWindowConfig = (AppBrandInitWindowConfig) obj;
        return this.f234849d == appBrandInitWindowConfig.f234849d && this.f234850e == appBrandInitWindowConfig.f234850e && this.f234851f == appBrandInitWindowConfig.f234851f && C87412m.m108589b(this.f234852g, appBrandInitWindowConfig.f234852g) && this.f234853h == appBrandInitWindowConfig.f234853h && this.f234854i == appBrandInitWindowConfig.f234854i && this.f234855j == appBrandInitWindowConfig.f234855j;
    }

    public int hashCode() {
        boolean z = this.f234849d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((z ? 1 : 0) * true) + this.f234850e) * 31;
        C90973a0 a0Var = this.f234851f;
        int i2 = 0;
        int hashCode = (i + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str = this.f234852g;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z3 = this.f234853h;
        if (!z3) {
            z2 = z3;
        }
        return ((((i3 + (z2 ? 1 : 0)) * 31) + this.f234854i.hashCode()) * 31) + this.f234855j.hashCode();
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("AppBrandInitWindowConfig(");
        String str = ", ";
        if (this.f234849d) {
            sb = new StringBuilder();
            sb.append("navigationBarColor:");
            sb.append(this.f234850e);
        } else {
            sb = new StringBuilder();
            sb.append("windowOpacity:");
            sb.append(this.f234851f);
            sb.append(str);
            String str2 = this.f234852g;
            if (!(str2 == null || str2.length() == 0)) {
                str = "windowBackgroundImageFilePath:" + this.f234852g + str;
            } else {
                str = ")";
            }
        }
        sb.append(str);
        sb4.append(sb.toString());
        return sb4.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f234849d ? 1 : 0);
        parcel.writeInt(this.f234850e);
        C90973a0 a0Var = this.f234851f;
        if (a0Var == null) {
            a0Var = C90973a0.UNKNOWN;
        }
        parcel.writeInt(a0Var.ordinal());
        parcel.writeString(this.f234852g);
        parcel.writeInt(this.f234853h ? 1 : 0);
        parcel.writeString(this.f234854i.name());
        parcel.writeString(this.f234855j.name());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppBrandInitWindowConfig(boolean r7, int r8, wi0.C90973a0 r9, java.lang.String r10, boolean r11, wi0.C91003z r12, wi0.C91003z r13, int r14, gy3.C8480h r15) {
        /*
            r6 = this;
            wi0.z r15 = wi0.C91003z.DEFAULT
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = 0
            goto L_0x000a
        L_0x0009:
            r0 = r7
        L_0x000a:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = r8
        L_0x0011:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0017
            wi0.a0 r9 = wi0.C90973a0.UNKNOWN
        L_0x0017:
            r3 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            r10 = 0
        L_0x001d:
            r4 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r15
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r15
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r1
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.config.AppBrandInitWindowConfig.<init>(boolean, int, wi0.a0, java.lang.String, boolean, wi0.z, wi0.z, int, gy3.h):void");
    }
}
