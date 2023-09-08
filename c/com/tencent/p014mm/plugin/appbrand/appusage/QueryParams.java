package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/QueryParams;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.QueryParams */
final class QueryParams implements Parcelable {
    public static final C81466a CREATOR = new C81466a((C8480h) null);

    /* renamed from: d */
    public final int f239052d;

    /* renamed from: e */
    public final C68585h1.C68586a f239053e;

    /* renamed from: f */
    public final int f239054f;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.QueryParams$a */
    public static final class C81466a implements Parcelable.Creator<QueryParams> {
        public C81466a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            C68585h1.C68586a aVar = C68585h1.C68586a.ASC;
            if (readInt2 != 1) {
                aVar = C68585h1.C68586a.DESC;
                if (readInt2 != 0) {
                    aVar = null;
                }
            }
            return new QueryParams(readInt, aVar, parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new QueryParams[i];
        }
    }

    public QueryParams(int i, C68585h1.C68586a aVar, int i2) {
        this.f239052d = i;
        this.f239053e = aVar;
        this.f239054f = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f239052d);
        }
        if (parcel != null) {
            C68585h1.C68586a aVar = this.f239053e;
            parcel.writeInt(aVar != null ? aVar.ordinal() : -1);
        }
        if (parcel != null) {
            parcel.writeInt(this.f239054f);
        }
    }
}
