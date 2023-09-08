package com.tencent.p014mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo */
public class CardGiftInfo implements Parcelable {
    public static final Parcelable.Creator<CardGiftInfo> CREATOR = new C18542a();

    /* renamed from: A */
    public String f51553A;

    /* renamed from: B */
    public String f51554B;

    /* renamed from: C */
    public int f51555C;

    /* renamed from: D */
    public String f51556D;

    /* renamed from: E */
    public String f51557E;

    /* renamed from: F */
    public String f51558F;

    /* renamed from: G */
    public String f51559G;

    /* renamed from: H */
    public String f51560H;

    /* renamed from: I */
    public String f51561I;

    /* renamed from: J */
    public String f51562J;

    /* renamed from: K */
    public String f51563K;

    /* renamed from: L */
    public String f51564L;

    /* renamed from: M */
    public LinkedList<AcceptedCardItem> f51565M = new LinkedList<>();

    /* renamed from: N */
    public LinkedList<AccepterItem> f51566N = new LinkedList<>();

    /* renamed from: P */
    public String f51567P;

    /* renamed from: Q */
    public int f51568Q;

    /* renamed from: R */
    public String f51569R;

    /* renamed from: S */
    public String f51570S;

    /* renamed from: T */
    public String f51571T;

    /* renamed from: U */
    public String f51572U;

    /* renamed from: V */
    public String f51573V;

    /* renamed from: W */
    public String f51574W;

    /* renamed from: X */
    public int f51575X;

    /* renamed from: Y */
    public String f51576Y;

    /* renamed from: Z */
    public String f51577Z;

    /* renamed from: d */
    public String f51578d;

    /* renamed from: e */
    public String f51579e;

    /* renamed from: f */
    public String f51580f;

    /* renamed from: g */
    public String f51581g;

    /* renamed from: h */
    public String f51582h;

    /* renamed from: i */
    public String f51583i;

    /* renamed from: j */
    public String f51584j;

    /* renamed from: n */
    public String f51585n;

    /* renamed from: o */
    public String f51586o;

    /* renamed from: p */
    public String f51587p;

    /* renamed from: p0 */
    public String f51588p0;

    /* renamed from: q */
    public String f51589q;

    /* renamed from: r */
    public String f51590r;

    /* renamed from: s */
    public String f51591s;

    /* renamed from: t */
    public String f51592t;

    /* renamed from: u */
    public String f51593u;

    /* renamed from: v */
    public String f51594v;

    /* renamed from: w */
    public boolean f51595w;

    /* renamed from: x */
    public int f51596x;

    /* renamed from: x0 */
    public String f51597x0;

    /* renamed from: y */
    public int f51598y;

    /* renamed from: z */
    public int f51599z;

    /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AcceptedCardItem */
    public static class AcceptedCardItem implements Parcelable {
        public static final Parcelable.Creator<AcceptedCardItem> CREATOR = new C18540a();

        /* renamed from: d */
        public String f51600d;

        /* renamed from: e */
        public String f51601e;

        /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AcceptedCardItem$a */
        public class C18540a implements Parcelable.Creator<AcceptedCardItem> {
            public Object createFromParcel(Parcel parcel) {
                return new AcceptedCardItem(parcel, (C18542a) null);
            }

            public Object[] newArray(int i) {
                return new AcceptedCardItem[i];
            }
        }

        public AcceptedCardItem() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f51600d);
            parcel.writeString(this.f51601e);
        }

        public AcceptedCardItem(Parcel parcel, C18542a aVar) {
            this.f51600d = parcel.readString();
            this.f51601e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AccepterItem */
    public static class AccepterItem implements Parcelable {
        public static final Parcelable.Creator<AccepterItem> CREATOR = new C18541a();

        /* renamed from: d */
        public String f51602d;

        /* renamed from: e */
        public String f51603e;

        /* renamed from: f */
        public String f51604f;

        /* renamed from: g */
        public String f51605g;

        /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AccepterItem$a */
        public class C18541a implements Parcelable.Creator<AccepterItem> {
            public Object createFromParcel(Parcel parcel) {
                return new AccepterItem(parcel, (C18542a) null);
            }

            public Object[] newArray(int i) {
                return new AccepterItem[i];
            }
        }

        public AccepterItem() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f51602d);
            parcel.writeString(this.f51603e);
            parcel.writeString(this.f51604f);
            parcel.writeString(this.f51605g);
        }

        public AccepterItem(Parcel parcel, C18542a aVar) {
            this.f51602d = parcel.readString();
            this.f51603e = parcel.readString();
            this.f51604f = parcel.readString();
            this.f51605g = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$a */
    public class C18542a implements Parcelable.Creator<CardGiftInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new CardGiftInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new CardGiftInfo[i];
        }
    }

    public CardGiftInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "CardGiftInfo{toUserName='" + this.f51578d + '\'' + ", fromUserName='" + this.f51579e + '\'' + ", fromUserImgUrl='" + this.f51580f + '\'' + ", fromUserContent='" + this.f51581g + '\'' + ", fromUserContentPicUrl='" + this.f51582h + '\'' + ", fromUserContentVideoUrl='" + this.f51583i + '\'' + ", fromUserContentThumbPicUrl='" + this.f51584j + '\'' + ", picAESKey='" + this.f51585n + '\'' + ", videoAESKey='" + this.f51586o + '\'' + ", thumbVideoAESKey='" + this.f51587p + '\'' + ", cardBackgroundPicUrl='" + this.f51589q + '\'' + ", cardLogoLUrl='" + this.f51590r + '\'' + ", cardTitle='" + this.f51591s + '\'' + ", cardPrice='" + this.f51592t + '\'' + ", footerWording='" + this.f51593u + '\'' + ", color='" + this.f51594v + '\'' + ", needJump=" + this.f51595w + ", picDataLength=" + this.f51596x + ", videoDataLength=" + this.f51598y + ", thumbDataLength=" + this.f51599z + ", descTitle='" + this.f51553A + '\'' + ", descIconUrl='" + this.f51554B + '\'' + ", descLayoutMode=" + this.f51555C + ", giftingMediaTitle='" + this.f51556D + '\'' + ", descriptionTitleColor='" + this.f51557E + '\'' + ", cardTitleColor='" + this.f51558F + '\'' + ", cardPriceTitleColor='" + this.f51559G + '\'' + ", userCardId='" + this.f51560H + '\'' + ", operationTitle='" + this.f51561I + '\'' + ", operationUrl='" + this.f51562J + '\'' + ", cardTpId='" + this.f51563K + '\'' + ", cardCode='" + this.f51564L + '\'' + ", accepted_card_list_size='" + this.f51565M.size() + '\'' + ", accepter_list_size='" + this.f51566N.size() + '\'' + ", accepter_list_title='" + this.f51567P + '\'' + ", out_of_card='" + this.f51568Q + '\'' + ", operation_wxa_username='" + this.f51569R + '\'' + ", operation_wxa_path='" + this.f51570S + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51578d);
        parcel.writeString(this.f51579e);
        parcel.writeString(this.f51580f);
        parcel.writeString(this.f51581g);
        parcel.writeString(this.f51582h);
        parcel.writeString(this.f51583i);
        parcel.writeString(this.f51584j);
        parcel.writeString(this.f51585n);
        parcel.writeString(this.f51586o);
        parcel.writeString(this.f51587p);
        parcel.writeString(this.f51589q);
        parcel.writeString(this.f51590r);
        parcel.writeString(this.f51591s);
        parcel.writeString(this.f51592t);
        parcel.writeString(this.f51593u);
        parcel.writeString(this.f51594v);
        parcel.writeByte(this.f51595w ? (byte) 1 : 0);
        parcel.writeInt(this.f51596x);
        parcel.writeInt(this.f51598y);
        parcel.writeInt(this.f51599z);
        parcel.writeString(this.f51553A);
        parcel.writeString(this.f51554B);
        parcel.writeInt(this.f51555C);
        parcel.writeString(this.f51556D);
        parcel.writeString(this.f51557E);
        parcel.writeString(this.f51558F);
        parcel.writeString(this.f51559G);
        parcel.writeString(this.f51560H);
        parcel.writeString(this.f51561I);
        parcel.writeString(this.f51562J);
        parcel.writeString(this.f51563K);
        parcel.writeString(this.f51564L);
        parcel.writeTypedList(this.f51565M);
        parcel.writeTypedList(this.f51566N);
        parcel.writeString(this.f51567P);
        parcel.writeInt(this.f51568Q);
        parcel.writeString(this.f51569R);
        parcel.writeString(this.f51570S);
        parcel.writeString(this.f51570S);
        parcel.writeString(this.f51571T);
        parcel.writeString(this.f51572U);
        parcel.writeString(this.f51573V);
        parcel.writeString(this.f51574W);
        parcel.writeInt(this.f51575X);
        parcel.writeString(this.f51576Y);
        parcel.writeString(this.f51577Z);
        parcel.writeString(this.f51588p0);
        parcel.writeString(this.f51597x0);
    }

    public CardGiftInfo(Parcel parcel) {
        this.f51578d = parcel.readString();
        this.f51579e = parcel.readString();
        this.f51580f = parcel.readString();
        this.f51581g = parcel.readString();
        this.f51582h = parcel.readString();
        this.f51583i = parcel.readString();
        this.f51584j = parcel.readString();
        this.f51585n = parcel.readString();
        this.f51586o = parcel.readString();
        this.f51587p = parcel.readString();
        this.f51589q = parcel.readString();
        this.f51590r = parcel.readString();
        this.f51591s = parcel.readString();
        this.f51592t = parcel.readString();
        this.f51593u = parcel.readString();
        this.f51594v = parcel.readString();
        this.f51595w = parcel.readByte() != 0;
        this.f51596x = parcel.readInt();
        this.f51598y = parcel.readInt();
        this.f51599z = parcel.readInt();
        this.f51553A = parcel.readString();
        this.f51554B = parcel.readString();
        this.f51555C = parcel.readInt();
        this.f51556D = parcel.readString();
        this.f51557E = parcel.readString();
        this.f51558F = parcel.readString();
        this.f51559G = parcel.readString();
        this.f51560H = parcel.readString();
        this.f51561I = parcel.readString();
        this.f51562J = parcel.readString();
        this.f51563K = parcel.readString();
        this.f51564L = parcel.readString();
        parcel.readTypedList(this.f51565M, AcceptedCardItem.CREATOR);
        parcel.readTypedList(this.f51566N, AccepterItem.CREATOR);
        this.f51567P = parcel.readString();
        this.f51568Q = parcel.readInt();
        this.f51569R = parcel.readString();
        this.f51570S = parcel.readString();
        this.f51570S = parcel.readString();
        this.f51571T = parcel.readString();
        this.f51572U = parcel.readString();
        this.f51573V = parcel.readString();
        this.f51574W = parcel.readString();
        this.f51575X = parcel.readInt();
        this.f51576Y = parcel.readString();
        this.f51577Z = parcel.readString();
        this.f51588p0 = parcel.readString();
        this.f51597x0 = parcel.readString();
    }
}
