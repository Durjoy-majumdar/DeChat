package com.tencent.p014mm.modelcontrol;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.modelcontrol.VideoTransPara */
public class VideoTransPara implements Parcelable, Cloneable {
    public static final Parcelable.Creator<VideoTransPara> CREATOR = new C92801a();

    /* renamed from: A */
    public int f267154A;

    /* renamed from: B */
    public int f267155B;

    /* renamed from: C */
    public int f267156C;

    /* renamed from: D */
    public int f267157D;

    /* renamed from: E */
    public int f267158E;

    /* renamed from: F */
    public int f267159F;

    /* renamed from: G */
    public int f267160G;

    /* renamed from: H */
    public boolean f267161H = false;

    /* renamed from: I */
    public int f267162I;

    /* renamed from: J */
    public int f267163J = 0;

    /* renamed from: K */
    public int f267164K = 0;

    /* renamed from: L */
    public boolean f267165L = false;

    /* renamed from: d */
    public int f267166d;

    /* renamed from: e */
    public int f267167e;

    /* renamed from: f */
    public int f267168f;

    /* renamed from: g */
    public int f267169g;

    /* renamed from: h */
    public int f267170h;

    /* renamed from: i */
    public int f267171i;

    /* renamed from: j */
    public int f267172j;

    /* renamed from: n */
    public int f267173n;

    /* renamed from: o */
    public int f267174o;

    /* renamed from: p */
    public int f267175p = 1;

    /* renamed from: q */
    public int f267176q;

    /* renamed from: r */
    public int f267177r;

    /* renamed from: s */
    public boolean f267178s;

    /* renamed from: t */
    public int f267179t = 0;

    /* renamed from: u */
    public int f267180u;

    /* renamed from: v */
    public int f267181v;

    /* renamed from: w */
    public float f267182w;

    /* renamed from: x */
    public float f267183x;

    /* renamed from: y */
    public int f267184y;

    /* renamed from: z */
    public int f267185z;

    /* renamed from: com.tencent.mm.modelcontrol.VideoTransPara$a */
    public class C92801a implements Parcelable.Creator<VideoTransPara> {
        public Object createFromParcel(Parcel parcel) {
            return new VideoTransPara(parcel);
        }

        public Object[] newArray(int i) {
            return new VideoTransPara[i];
        }
    }

    public VideoTransPara() {
    }

    public Object clone() {
        return super.clone();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "[isDefault " + this.f267178s + " width " + this.f267166d + " height " + this.f267167e + " fps " + this.f267168f + " video bitrate " + this.f267169g + " iFrame " + this.f267172j + " audio bitrate " + this.f267173n + " audioSampleRate " + this.f267174o + "audioChannelCount " + this.f267175p + " duration " + this.f267170h + " profile index " + this.f267176q + " preset index " + this.f267177r + " thumbSize " + this.f267179t + " abaSwitch " + this.f267180u + " qpSwitch " + this.f267181v + " swHevcRatio " + this.f267182w + " hwHevcRatio " + this.f267183x + " ceilingVideoBR " + this.f267184y + " flooringVideoBR " + this.f267185z + " isEnableHEVCEncode " + this.f267154A + " isEnable1080p " + this.f267155B + " maxVideoSize " + this.f267156C + " minQP " + this.f267157D + " maxQP " + this.f267158E + " takePhotosVideoBR " + this.f267159F + " remuxScene " + this.f267160G + " enableHdrTransCode " + this.f267161H + " hdrType " + this.f267162I + " hwEnableHevc " + this.f267163J + " swEnableHevc " + this.f267164K + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f267166d);
        parcel.writeInt(this.f267167e);
        parcel.writeInt(this.f267168f);
        parcel.writeInt(this.f267169g);
        parcel.writeInt(this.f267170h);
        parcel.writeInt(this.f267172j);
        parcel.writeInt(this.f267173n);
        parcel.writeInt(this.f267174o);
        parcel.writeInt(this.f267176q);
        parcel.writeInt(this.f267177r);
        parcel.writeInt(this.f267178s ? 1 : 0);
        parcel.writeInt(this.f267179t);
        parcel.writeInt(this.f267180u);
        parcel.writeInt(this.f267181v);
        parcel.writeFloat(this.f267182w);
        parcel.writeFloat(this.f267183x);
        parcel.writeInt(this.f267184y);
        parcel.writeInt(this.f267185z);
        parcel.writeInt(this.f267154A);
        parcel.writeInt(this.f267155B);
        parcel.writeInt(this.f267156C);
        parcel.writeInt(this.f267157D);
        parcel.writeInt(this.f267158E);
        parcel.writeInt(this.f267159F);
        parcel.writeInt(this.f267160G);
        parcel.writeInt(this.f267161H ? 1 : 0);
        parcel.writeInt(this.f267162I);
        parcel.writeInt(this.f267175p);
        parcel.writeInt(this.f267163J);
        parcel.writeInt(this.f267164K);
        parcel.writeInt(this.f267171i);
    }

    public VideoTransPara(VideoTransPara videoTransPara) {
        this.f267166d = videoTransPara.f267166d;
        this.f267167e = videoTransPara.f267167e;
        this.f267168f = videoTransPara.f267168f;
        this.f267169g = videoTransPara.f267169g;
        this.f267170h = videoTransPara.f267170h;
        this.f267172j = videoTransPara.f267172j;
        this.f267173n = videoTransPara.f267173n;
        this.f267174o = videoTransPara.f267174o;
        this.f267176q = videoTransPara.f267176q;
        this.f267177r = videoTransPara.f267177r;
        this.f267178s = videoTransPara.f267178s;
        this.f267179t = videoTransPara.f267179t;
        this.f267180u = videoTransPara.f267180u;
        this.f267181v = videoTransPara.f267181v;
        this.f267182w = videoTransPara.f267182w;
        this.f267183x = videoTransPara.f267183x;
        this.f267184y = videoTransPara.f267184y;
        this.f267185z = videoTransPara.f267185z;
        this.f267154A = videoTransPara.f267154A;
        this.f267155B = videoTransPara.f267155B;
        this.f267156C = videoTransPara.f267156C;
        this.f267157D = videoTransPara.f267157D;
        this.f267158E = videoTransPara.f267158E;
        this.f267159F = videoTransPara.f267159F;
        this.f267160G = videoTransPara.f267160G;
        this.f267161H = videoTransPara.f267161H;
        this.f267162I = videoTransPara.f267162I;
        this.f267175p = videoTransPara.f267175p;
        this.f267163J = videoTransPara.f267163J;
        this.f267164K = videoTransPara.f267164K;
        this.f267171i = videoTransPara.f267171i;
    }

    public VideoTransPara(Parcel parcel) {
        boolean z = true;
        this.f267166d = parcel.readInt();
        this.f267167e = parcel.readInt();
        this.f267168f = parcel.readInt();
        this.f267169g = parcel.readInt();
        this.f267170h = parcel.readInt();
        this.f267172j = parcel.readInt();
        this.f267173n = parcel.readInt();
        this.f267174o = parcel.readInt();
        this.f267176q = parcel.readInt();
        this.f267177r = parcel.readInt();
        this.f267178s = parcel.readInt() > 0;
        this.f267179t = parcel.readInt();
        this.f267180u = parcel.readInt();
        this.f267181v = parcel.readInt();
        this.f267182w = parcel.readFloat();
        this.f267183x = parcel.readFloat();
        this.f267184y = parcel.readInt();
        this.f267185z = parcel.readInt();
        this.f267154A = parcel.readInt();
        this.f267155B = parcel.readInt();
        this.f267156C = parcel.readInt();
        this.f267157D = parcel.readInt();
        this.f267158E = parcel.readInt();
        this.f267159F = parcel.readInt();
        this.f267160G = parcel.readInt();
        this.f267161H = parcel.readInt() <= 0 ? false : z;
        this.f267162I = parcel.readInt();
        this.f267175p = parcel.readInt();
        this.f267163J = parcel.readInt();
        this.f267164K = parcel.readInt();
        this.f267171i = parcel.readInt();
    }
}
