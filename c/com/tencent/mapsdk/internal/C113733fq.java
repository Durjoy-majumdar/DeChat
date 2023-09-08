package com.tencent.mapsdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.fq */
public final class C113733fq implements Parcelable {
    public static final Parcelable.Creator<C113733fq> CREATOR = new Parcelable.Creator<C113733fq>() {
        /* renamed from: a */
        private static C113733fq m156848a(Parcel parcel) {
            return new C113733fq(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C113733fq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C113733fq[i];
        }

        /* renamed from: a */
        private static C113733fq[] m156849a(int i) {
            return new C113733fq[i];
        }
    };

    /* renamed from: a */
    public int f340217a;

    /* renamed from: b */
    public String f340218b;

    /* renamed from: c */
    public int f340219c;

    /* renamed from: d */
    public int f340220d;

    /* renamed from: e */
    public float f340221e = 0.5f;

    /* renamed from: f */
    public float f340222f = 0.5f;

    /* renamed from: g */
    public float f340223g = 1.0f;

    /* renamed from: h */
    public String f340224h;

    /* renamed from: i */
    public int f340225i;

    /* renamed from: j */
    public int f340226j;

    /* renamed from: k */
    public String f340227k;

    /* renamed from: l */
    public float f340228l;

    /* renamed from: m */
    public float f340229m;

    /* renamed from: n */
    public int f340230n = 0;

    /* renamed from: o */
    public int f340231o = 3;

    /* renamed from: p */
    public int f340232p;

    /* renamed from: q */
    public int f340233q;

    /* renamed from: r */
    public int f340234r;

    /* renamed from: s */
    public int f340235s;

    /* renamed from: t */
    public int f340236t;

    /* renamed from: u */
    public LatLng f340237u;

    public C113733fq() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f340217a);
        parcel.writeString(this.f340218b);
        parcel.writeInt(this.f340219c);
        parcel.writeInt(this.f340220d);
        parcel.writeFloat(this.f340221e);
        parcel.writeFloat(this.f340222f);
        parcel.writeFloat(this.f340223g);
        parcel.writeString(this.f340224h);
        parcel.writeInt(this.f340225i);
        parcel.writeInt(this.f340226j);
        parcel.writeString(this.f340227k);
        parcel.writeFloat(this.f340228l);
        parcel.writeFloat(this.f340229m);
        parcel.writeInt(this.f340230n);
        parcel.writeInt(this.f340231o);
        parcel.writeInt(this.f340232p);
        parcel.writeInt(this.f340233q);
        parcel.writeInt(this.f340234r);
        parcel.writeParcelable(this.f340237u, i);
    }

    public C113733fq(Parcel parcel) {
        this.f340217a = parcel.readInt();
        this.f340218b = parcel.readString();
        this.f340219c = parcel.readInt();
        this.f340220d = parcel.readInt();
        this.f340221e = parcel.readFloat();
        this.f340222f = parcel.readFloat();
        this.f340223g = parcel.readFloat();
        this.f340224h = parcel.readString();
        this.f340225i = parcel.readInt();
        this.f340226j = parcel.readInt();
        this.f340227k = parcel.readString();
        this.f340228l = parcel.readFloat();
        this.f340229m = parcel.readFloat();
        this.f340230n = parcel.readInt();
        this.f340231o = parcel.readInt();
        this.f340232p = parcel.readInt();
        this.f340233q = parcel.readInt();
        this.f340234r = parcel.readInt();
        this.f340237u = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
    }
}
