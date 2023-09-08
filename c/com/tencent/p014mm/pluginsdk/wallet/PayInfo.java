package com.tencent.p014mm.pluginsdk.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.pluginsdk.wallet.PayInfo */
public class PayInfo implements Parcelable {
    public static final Parcelable.Creator<PayInfo> CREATOR = new C72937a();

    /* renamed from: A */
    public String f212570A;

    /* renamed from: B */
    public String f212571B;

    /* renamed from: C */
    public int f212572C;

    /* renamed from: D */
    public int f212573D;

    /* renamed from: E */
    public int f212574E;

    /* renamed from: F */
    public long f212575F;

    /* renamed from: G */
    public String f212576G;

    /* renamed from: H */
    public int f212577H;

    /* renamed from: I */
    public String f212578I;

    /* renamed from: J */
    public String f212579J;

    /* renamed from: K */
    public int f212580K;

    /* renamed from: L */
    public int f212581L;

    /* renamed from: M */
    public double f212582M;

    /* renamed from: N */
    public String f212583N;

    /* renamed from: P */
    public boolean f212584P;

    /* renamed from: Q */
    public String f212585Q;

    /* renamed from: d */
    public int f212586d;

    /* renamed from: e */
    public int f212587e;

    /* renamed from: f */
    public int f212588f;

    /* renamed from: g */
    public int f212589g;

    /* renamed from: h */
    public boolean f212590h;

    /* renamed from: i */
    public boolean f212591i;

    /* renamed from: j */
    public String f212592j;

    /* renamed from: n */
    public String f212593n;

    /* renamed from: o */
    public String f212594o;

    /* renamed from: p */
    public String f212595p;

    /* renamed from: q */
    public String f212596q;

    /* renamed from: r */
    public String f212597r;

    /* renamed from: s */
    public String f212598s;

    /* renamed from: t */
    public String f212599t;

    /* renamed from: u */
    public Bundle f212600u;

    /* renamed from: v */
    public String f212601v;

    /* renamed from: w */
    public String f212602w;

    /* renamed from: x */
    public int f212603x;

    /* renamed from: y */
    public String f212604y;

    /* renamed from: z */
    public boolean f212605z;

    /* renamed from: com.tencent.mm.pluginsdk.wallet.PayInfo$a */
    public class C72937a implements Parcelable.Creator<PayInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new PayInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new PayInfo[i];
        }
    }

    public PayInfo() {
        this.f212586d = -1;
        this.f212587e = 0;
        this.f212588f = 0;
        this.f212590h = false;
        this.f212591i = true;
        this.f212603x = 0;
        this.f212573D = 0;
        this.f212575F = 0;
        this.f212576G = "";
        this.f212577H = -1;
        this.f212580K = 1;
        this.f212581L = 0;
        this.f212582M = 0.0d;
        this.f212583N = "";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", new Object[]{Integer.valueOf(this.f212587e), this.f212592j, this.f212593n, this.f212594o, this.f212595p, this.f212596q, this.f212597r, this.f212598s, this.f212576G});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f212587e);
        parcel.writeInt(this.f212588f);
        parcel.writeString(this.f212592j);
        parcel.writeString(this.f212593n);
        parcel.writeString(this.f212594o);
        parcel.writeString(this.f212595p);
        parcel.writeString(this.f212596q);
        parcel.writeString(this.f212597r);
        parcel.writeString(this.f212598s);
        parcel.writeString(this.f212599t);
        parcel.writeInt(this.f212589g);
        parcel.writeInt(this.f212586d);
        parcel.writeInt(this.f212590h ? 1 : 0);
        parcel.writeInt(this.f212591i ? 1 : 0);
        parcel.writeBundle(this.f212600u);
        parcel.writeInt(this.f212603x);
        parcel.writeString(this.f212570A);
        parcel.writeString(this.f212571B);
        parcel.writeInt(this.f212572C);
        parcel.writeLong(this.f212575F);
        parcel.writeString(this.f212576G);
        parcel.writeString(this.f212578I);
        parcel.writeString(this.f212579J);
        parcel.writeInt(this.f212580K);
        parcel.writeString(this.f212601v);
        parcel.writeString(this.f212602w);
        parcel.writeInt(this.f212581L);
        parcel.writeDouble(this.f212582M);
        parcel.writeString(this.f212583N);
        parcel.writeInt(this.f212584P ? 1 : 0);
        parcel.writeString(this.f212585Q);
        parcel.writeString(this.f212604y);
        parcel.writeInt(this.f212605z ? 1 : 0);
    }

    public PayInfo(Parcel parcel) {
        this.f212586d = -1;
        boolean z = false;
        this.f212587e = 0;
        this.f212588f = 0;
        this.f212590h = false;
        this.f212591i = true;
        this.f212603x = 0;
        this.f212573D = 0;
        this.f212575F = 0;
        this.f212576G = "";
        this.f212577H = -1;
        this.f212580K = 1;
        this.f212581L = 0;
        this.f212582M = 0.0d;
        this.f212583N = "";
        this.f212587e = parcel.readInt();
        this.f212588f = parcel.readInt();
        this.f212592j = parcel.readString();
        this.f212593n = parcel.readString();
        this.f212594o = parcel.readString();
        this.f212595p = parcel.readString();
        this.f212596q = parcel.readString();
        this.f212597r = parcel.readString();
        this.f212598s = parcel.readString();
        this.f212599t = parcel.readString();
        this.f212589g = parcel.readInt();
        this.f212586d = parcel.readInt();
        this.f212590h = parcel.readInt() == 1;
        this.f212591i = parcel.readInt() == 1;
        this.f212600u = parcel.readBundle();
        this.f212603x = parcel.readInt();
        this.f212570A = parcel.readString();
        this.f212571B = parcel.readString();
        this.f212572C = parcel.readInt();
        this.f212575F = parcel.readLong();
        this.f212576G = parcel.readString();
        this.f212578I = parcel.readString();
        this.f212579J = parcel.readString();
        this.f212580K = parcel.readInt();
        this.f212601v = parcel.readString();
        this.f212602w = parcel.readString();
        this.f212581L = parcel.readInt();
        this.f212582M = parcel.readDouble();
        String readString = parcel.readString();
        this.f212583N = readString;
        if (readString == null) {
            this.f212583N = "";
        }
        this.f212584P = parcel.readInt() == 1;
        this.f212585Q = parcel.readString();
        this.f212604y = parcel.readString();
        this.f212605z = parcel.readInt() == 1 ? true : z;
    }
}
