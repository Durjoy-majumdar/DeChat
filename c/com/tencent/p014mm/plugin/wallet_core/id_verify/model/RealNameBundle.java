package com.tencent.p014mm.plugin.wallet_core.id_verify.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle */
public class RealNameBundle implements Parcelable {
    public static final Parcelable.Creator<RealNameBundle> CREATOR = new C72155a();

    /* renamed from: A */
    public String f209292A;

    /* renamed from: B */
    public String f209293B;

    /* renamed from: C */
    public String f209294C;

    /* renamed from: D */
    public String f209295D;

    /* renamed from: E */
    public int f209296E;

    /* renamed from: F */
    public int f209297F;

    /* renamed from: G */
    public int f209298G;

    /* renamed from: H */
    public String f209299H;

    /* renamed from: I */
    public int f209300I;

    /* renamed from: d */
    public String f209301d;

    /* renamed from: e */
    public String f209302e;

    /* renamed from: f */
    public String f209303f;

    /* renamed from: g */
    public int f209304g;

    /* renamed from: h */
    public String f209305h;

    /* renamed from: i */
    public Profession f209306i;

    /* renamed from: j */
    public String f209307j;

    /* renamed from: n */
    public String f209308n;

    /* renamed from: o */
    public String f209309o;

    /* renamed from: p */
    public String f209310p;

    /* renamed from: q */
    public int f209311q;

    /* renamed from: r */
    public String f209312r;

    /* renamed from: s */
    public int f209313s;

    /* renamed from: t */
    public int f209314t;

    /* renamed from: u */
    public int f209315u;

    /* renamed from: v */
    public String f209316v;

    /* renamed from: w */
    public int f209317w;

    /* renamed from: x */
    public int f209318x;

    /* renamed from: y */
    public int f209319y;

    /* renamed from: z */
    public String f209320z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle$a */
    public class C72155a implements Parcelable.Creator<RealNameBundle> {
        public Object createFromParcel(Parcel parcel) {
            return new RealNameBundle(parcel);
        }

        public Object[] newArray(int i) {
            return new RealNameBundle[i];
        }
    }

    public RealNameBundle() {
    }

    /* renamed from: a */
    public void mo99365a(Map<String, String> map) {
        map.put("detail_address", this.f209294C);
        map.put("phone_no", this.f209299H);
        map.put("sex", String.valueOf(this.f209300I));
        map.put("nationality", this.f209320z);
        map.put("birth_date", this.f209316v);
        Profession profession = this.f209306i;
        map.put("profession_name", profession != null ? profession.f209290d : "");
        map.put("user_country", this.f209307j);
        map.put("user_province", this.f209308n);
        map.put("user_city", this.f209309o);
        map.put("cre_expire_date", this.f209312r);
        map.put("creid_renewal", String.valueOf(this.f209311q));
        map.put("cre_effect_date", this.f209295D);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209301d);
        parcel.writeString(this.f209302e);
        parcel.writeString(this.f209303f);
        parcel.writeInt(this.f209304g);
        parcel.writeString(this.f209305h);
        parcel.writeParcelable(this.f209306i, 1);
        parcel.writeString(this.f209307j);
        parcel.writeString(this.f209308n);
        parcel.writeString(this.f209309o);
        parcel.writeString(this.f209310p);
        parcel.writeInt(this.f209311q);
        parcel.writeString(this.f209312r);
        parcel.writeInt(this.f209313s);
        parcel.writeInt(this.f209314t);
        parcel.writeInt(this.f209315u);
        parcel.writeString(this.f209316v);
        parcel.writeInt(this.f209317w);
        parcel.writeInt(this.f209318x);
        parcel.writeInt(this.f209319y);
        parcel.writeString(this.f209320z);
        parcel.writeString(this.f209292A);
        parcel.writeString(this.f209293B);
        parcel.writeString(this.f209294C);
        parcel.writeString(this.f209295D);
        parcel.writeInt(this.f209296E);
        parcel.writeInt(this.f209297F);
        parcel.writeInt(this.f209298G);
        parcel.writeString(this.f209299H);
        parcel.writeInt(this.f209300I);
    }

    public RealNameBundle(Parcel parcel) {
        this.f209301d = parcel.readString();
        this.f209302e = parcel.readString();
        this.f209303f = parcel.readString();
        this.f209304g = parcel.readInt();
        this.f209305h = parcel.readString();
        this.f209306i = (Profession) parcel.readParcelable(Profession.class.getClassLoader());
        this.f209307j = parcel.readString();
        this.f209308n = parcel.readString();
        this.f209309o = parcel.readString();
        this.f209310p = parcel.readString();
        this.f209311q = parcel.readInt();
        this.f209312r = parcel.readString();
        this.f209313s = parcel.readInt();
        this.f209314t = parcel.readInt();
        this.f209315u = parcel.readInt();
        this.f209316v = parcel.readString();
        this.f209317w = parcel.readInt();
        this.f209318x = parcel.readInt();
        this.f209319y = parcel.readInt();
        this.f209320z = parcel.readString();
        this.f209292A = parcel.readString();
        this.f209293B = parcel.readString();
        this.f209294C = parcel.readString();
        this.f209295D = parcel.readString();
        this.f209296E = parcel.readInt();
        this.f209297F = parcel.readInt();
        this.f209298G = parcel.readInt();
        this.f209299H = parcel.readString();
        this.f209300I = parcel.readInt();
    }
}
