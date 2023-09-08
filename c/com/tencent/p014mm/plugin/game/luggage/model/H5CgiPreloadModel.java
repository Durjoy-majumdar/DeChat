package com.tencent.p014mm.plugin.game.luggage.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/model/H5CgiPreloadModel;", "Landroid/os/Parcelable;", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel */
public final class H5CgiPreloadModel implements Parcelable {
    public static final Parcelable.Creator<H5CgiPreloadModel> CREATOR = new C41929a();

    /* renamed from: d */
    public long f112942d;

    /* renamed from: e */
    public long f112943e;

    /* renamed from: f */
    public boolean f112944f;

    /* renamed from: g */
    public String f112945g;

    /* renamed from: com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel$a */
    public static final class C41929a implements Parcelable.Creator<H5CgiPreloadModel> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new H5CgiPreloadModel(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new H5CgiPreloadModel[i];
        }
    }

    public H5CgiPreloadModel() {
        this(0, 0, false, (String) null, 15, (C8480h) null);
    }

    public H5CgiPreloadModel(long j, long j2, boolean z, String str) {
        this.f112942d = j;
        this.f112943e = j2;
        this.f112944f = z;
        this.f112945g = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5CgiPreloadModel)) {
            return false;
        }
        H5CgiPreloadModel h5CgiPreloadModel = (H5CgiPreloadModel) obj;
        return this.f112942d == h5CgiPreloadModel.f112942d && this.f112943e == h5CgiPreloadModel.f112943e && this.f112944f == h5CgiPreloadModel.f112944f && C87412m.m108589b(this.f112945g, h5CgiPreloadModel.f112945g);
    }

    public int hashCode() {
        long j = this.f112942d;
        long j2 = this.f112943e;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f112944f;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.f112945g;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "H5CgiPreloadModel(timeStamp=" + this.f112942d + ", cgiCostTimeMs=" + this.f112943e + ", isRequestFail=" + this.f112944f + ", cgiResponseStr=" + this.f112945g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeLong(this.f112942d);
        parcel.writeLong(this.f112943e);
        parcel.writeInt(this.f112944f ? 1 : 0);
        parcel.writeString(this.f112945g);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ H5CgiPreloadModel(long r5, long r7, boolean r9, java.lang.String r10, int r11, gy3.C8480h r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = r5
        L_0x0009:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r7
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0016
            r9 = 0
            r12 = 0
            goto L_0x0017
        L_0x0016:
            r12 = r9
        L_0x0017:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r10 = 0
        L_0x001c:
            r11 = r10
            r5 = r4
            r6 = r2
            r8 = r0
            r10 = r12
            r5.<init>(r6, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.model.H5CgiPreloadModel.<init>(long, long, boolean, java.lang.String, int, gy3.h):void");
    }
}
