package com.tencent.p014mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallNews */
public class MallNews implements Parcelable {
    public static final Parcelable.Creator<MallNews> CREATOR = new C72197a();

    /* renamed from: d */
    public String f209743d = "0";

    /* renamed from: e */
    public String f209744e = "0";

    /* renamed from: f */
    public String f209745f;

    /* renamed from: g */
    public String f209746g;

    /* renamed from: h */
    public String f209747h;

    /* renamed from: i */
    public String f209748i;

    /* renamed from: j */
    public String f209749j;

    /* renamed from: n */
    public String f209750n;

    /* renamed from: o */
    public int f209751o;

    /* renamed from: p */
    public String f209752p;

    /* renamed from: q */
    public int f209753q;

    /* renamed from: r */
    public String f209754r;

    /* renamed from: s */
    public int f209755s;

    /* renamed from: t */
    public String f209756t;

    /* renamed from: u */
    public String f209757u;

    /* renamed from: v */
    public int f209758v;

    /* renamed from: w */
    public int f209759w;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallNews$a */
    public class C72197a implements Parcelable.Creator<MallNews> {
        public Object createFromParcel(Parcel parcel) {
            return new MallNews(parcel);
        }

        public Object[] newArray(int i) {
            return new MallNews[i];
        }
    }

    public MallNews(String str) {
        this.f209745f = str;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r3.f209746g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r4 = (com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews) r4
            java.lang.String r0 = r3.f209745f
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r4.f209745f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0023
        L_0x0014:
            java.lang.String r0 = r3.f209746g
            if (r0 == 0) goto L_0x0023
            java.lang.String r4 = r4.f209746g
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = 1
            return r4
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s, walletRegion: %d", new Object[]{this.f209745f, this.f209746g, this.f209747h, this.f209748i, this.f209749j, this.f209750n, this.f209743d, this.f209754r, this.f209752p, Integer.valueOf(this.f209755s), this.f209756t, Integer.valueOf(this.f209759w)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209745f);
        parcel.writeString(this.f209746g);
        parcel.writeString(this.f209747h);
        parcel.writeString(this.f209748i);
        parcel.writeString(this.f209749j);
        parcel.writeString(this.f209750n);
        parcel.writeInt(this.f209751o);
        parcel.writeString(this.f209752p);
        parcel.writeString(this.f209743d);
        parcel.writeString(this.f209744e);
        parcel.writeInt(this.f209758v);
        parcel.writeString(this.f209754r);
        parcel.writeInt(this.f209755s);
        parcel.writeString(this.f209756t);
        parcel.writeInt(this.f209759w);
    }

    public MallNews(Parcel parcel) {
        this.f209745f = parcel.readString();
        this.f209746g = parcel.readString();
        this.f209747h = parcel.readString();
        this.f209748i = parcel.readString();
        this.f209749j = parcel.readString();
        this.f209750n = parcel.readString();
        this.f209751o = parcel.readInt();
        this.f209752p = parcel.readString();
        this.f209743d = parcel.readString();
        this.f209744e = parcel.readString();
        this.f209758v = parcel.readInt();
        this.f209754r = parcel.readString();
        this.f209755s = parcel.readInt();
        this.f209756t = parcel.readString();
        this.f209759w = parcel.readInt();
    }
}
