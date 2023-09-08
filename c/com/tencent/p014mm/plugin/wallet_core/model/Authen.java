package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.Authen */
public class Authen implements Parcelable {
    public static final Parcelable.Creator<Authen> CREATOR = new C72171a();

    /* renamed from: A */
    public String f209348A;

    /* renamed from: B */
    public String f209349B;

    /* renamed from: C */
    public String f209350C;

    /* renamed from: D */
    public String f209351D;

    /* renamed from: E */
    public String f209352E;

    /* renamed from: F */
    public String f209353F;

    /* renamed from: G */
    public String f209354G;

    /* renamed from: H */
    public String f209355H;

    /* renamed from: I */
    public String f209356I;

    /* renamed from: J */
    public String f209357J;

    /* renamed from: K */
    public String f209358K;

    /* renamed from: L */
    public String f209359L;

    /* renamed from: M */
    public String f209360M;

    /* renamed from: N */
    public int f209361N;

    /* renamed from: P */
    public String f209362P;

    /* renamed from: Q */
    public String f209363Q;

    /* renamed from: R */
    public int f209364R;

    /* renamed from: S */
    public String f209365S;

    /* renamed from: T */
    public String f209366T;

    /* renamed from: d */
    public int f209367d;

    /* renamed from: e */
    public int f209368e = 0;

    /* renamed from: f */
    public String f209369f;

    /* renamed from: g */
    public String f209370g;

    /* renamed from: h */
    public String f209371h;

    /* renamed from: i */
    public String f209372i;

    /* renamed from: j */
    public String f209373j;

    /* renamed from: n */
    public int f209374n;

    /* renamed from: o */
    public String f209375o;

    /* renamed from: p */
    public String f209376p;

    /* renamed from: q */
    public String f209377q;

    /* renamed from: r */
    public String f209378r;

    /* renamed from: s */
    public String f209379s;

    /* renamed from: t */
    public String f209380t;

    /* renamed from: u */
    public String f209381u;

    /* renamed from: v */
    public PayInfo f209382v = new PayInfo();

    /* renamed from: w */
    public String f209383w;

    /* renamed from: x */
    public String f209384x;

    /* renamed from: y */
    public String f209385y;

    /* renamed from: z */
    public String f209386z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Authen$a */
    public class C72171a implements Parcelable.Creator<Authen> {
        public Object createFromParcel(Parcel parcel) {
            return new Authen(parcel);
        }

        public Object[] newArray(int i) {
            return new Authen[i];
        }
    }

    public Authen() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209367d);
        parcel.writeString(Util.nullAs(this.f209369f, ""));
        parcel.writeString(Util.nullAs(this.f209370g, ""));
        parcel.writeString(Util.nullAs(this.f209371h, ""));
        parcel.writeString(Util.nullAs(this.f209372i, ""));
        parcel.writeString(Util.nullAs(this.f209373j, ""));
        parcel.writeInt(this.f209374n);
        parcel.writeString(Util.nullAs(this.f209375o, ""));
        parcel.writeString(Util.nullAs(this.f209376p, ""));
        parcel.writeString(Util.nullAs(this.f209377q, ""));
        parcel.writeString(Util.nullAs(this.f209378r, ""));
        parcel.writeString(Util.nullAs(this.f209379s, ""));
        parcel.writeString(Util.nullAs(this.f209383w, ""));
        parcel.writeString(Util.nullAs(this.f209384x, ""));
        parcel.writeString(Util.nullAs(this.f209385y, ""));
        parcel.writeString(Util.nullAs(this.f209386z, ""));
        parcel.writeString(Util.nullAs(this.f209348A, ""));
        parcel.writeString(Util.nullAs(this.f209349B, ""));
        parcel.writeString(Util.nullAs(this.f209350C, ""));
        parcel.writeString(Util.nullAs(this.f209351D, ""));
        parcel.writeString(Util.nullAs(this.f209352E, ""));
        parcel.writeString(Util.nullAs(this.f209353F, ""));
        parcel.writeString(Util.nullAs(this.f209354G, ""));
        parcel.writeString(Util.nullAs(this.f209355H, ""));
        parcel.writeString(Util.nullAs(this.f209381u, ""));
        parcel.writeString(Util.nullAs(this.f209356I, ""));
        parcel.writeString(Util.nullAs(this.f209357J, ""));
        parcel.writeString(Util.nullAs(this.f209358K, ""));
        parcel.writeString(Util.nullAs(this.f209359L, ""));
        parcel.writeString(Util.nullAs(this.f209360M, ""));
        parcel.writeInt(Util.nullAs(Integer.valueOf(this.f209361N), 0));
        parcel.writeString(Util.nullAs(this.f209362P, ""));
        parcel.writeString(Util.nullAs(this.f209363Q, ""));
        parcel.writeInt(Util.nullAs(Integer.valueOf(this.f209364R), 0));
        parcel.writeString(Util.nullAs(this.f209365S, ""));
        parcel.writeString(Util.nullAs(this.f209366T, ""));
    }

    public Authen(Parcel parcel) {
        this.f209367d = parcel.readInt();
        this.f209369f = parcel.readString();
        this.f209370g = parcel.readString();
        this.f209371h = parcel.readString();
        this.f209372i = parcel.readString();
        this.f209373j = parcel.readString();
        this.f209374n = parcel.readInt();
        this.f209375o = parcel.readString();
        this.f209376p = parcel.readString();
        this.f209377q = parcel.readString();
        this.f209378r = parcel.readString();
        this.f209379s = parcel.readString();
        this.f209383w = parcel.readString();
        this.f209384x = parcel.readString();
        this.f209385y = parcel.readString();
        this.f209386z = parcel.readString();
        this.f209348A = parcel.readString();
        this.f209349B = parcel.readString();
        this.f209350C = parcel.readString();
        this.f209351D = parcel.readString();
        this.f209352E = parcel.readString();
        this.f209353F = parcel.readString();
        this.f209354G = parcel.readString();
        this.f209355H = parcel.readString();
        this.f209381u = parcel.readString();
        this.f209356I = parcel.readString();
        this.f209357J = parcel.readString();
        this.f209358K = parcel.readString();
        this.f209359L = parcel.readString();
        this.f209360M = parcel.readString();
        this.f209361N = parcel.readInt();
        this.f209362P = parcel.readString();
        this.f209363Q = parcel.readString();
        this.f209364R = parcel.readInt();
        this.f209365S = parcel.readString();
        this.f209366T = parcel.readString();
    }
}
