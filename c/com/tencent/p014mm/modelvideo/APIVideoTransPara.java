package com.tencent.p014mm.modelvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/modelvideo/APIVideoTransPara;", "Landroid/os/Parcelable;", "", "CREATOR", "a", "video-logic-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.modelvideo.APIVideoTransPara */
public final class APIVideoTransPara implements Parcelable, Cloneable {
    public static final C24272a CREATOR = new C24272a((C8480h) null);

    /* renamed from: A */
    public int f69653A;

    /* renamed from: B */
    public int f69654B;

    /* renamed from: C */
    public int f69655C;

    /* renamed from: D */
    public int f69656D;

    /* renamed from: E */
    public int f69657E;

    /* renamed from: F */
    public int f69658F;

    /* renamed from: G */
    public int f69659G;

    /* renamed from: H */
    public boolean f69660H;

    /* renamed from: I */
    public int f69661I;

    /* renamed from: J */
    public int f69662J;

    /* renamed from: K */
    public int f69663K;

    /* renamed from: d */
    public int f69664d;

    /* renamed from: e */
    public int f69665e;

    /* renamed from: f */
    public int f69666f;

    /* renamed from: g */
    public int f69667g;

    /* renamed from: h */
    public int f69668h;

    /* renamed from: i */
    public int f69669i;

    /* renamed from: j */
    public int f69670j;

    /* renamed from: n */
    public int f69671n;

    /* renamed from: o */
    public int f69672o;

    /* renamed from: p */
    public int f69673p = 1;

    /* renamed from: q */
    public int f69674q;

    /* renamed from: r */
    public int f69675r;

    /* renamed from: s */
    public boolean f69676s;

    /* renamed from: t */
    public int f69677t;

    /* renamed from: u */
    public int f69678u;

    /* renamed from: v */
    public int f69679v;

    /* renamed from: w */
    public float f69680w;

    /* renamed from: x */
    public float f69681x;

    /* renamed from: y */
    public int f69682y;

    /* renamed from: z */
    public int f69683z;

    /* renamed from: com.tencent.mm.modelvideo.APIVideoTransPara$a */
    public static final class C24272a implements Parcelable.Creator<APIVideoTransPara> {
        public C24272a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new APIVideoTransPara(parcel);
        }

        public Object[] newArray(int i) {
            return new APIVideoTransPara[i];
        }
    }

    public APIVideoTransPara() {
    }

    public Object clone() {
        return super.clone();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "[isDefault " + this.f69676s + " width " + this.f69664d + " height " + this.f69665e + " fps " + this.f69666f + " video bitrate " + this.f69667g + " iFrame " + this.f69670j + " audio bitrate " + this.f69671n + " audioSampleRate " + this.f69672o + "audioChannelCount " + this.f69673p + " duration " + this.f69668h + " profile index " + this.f69674q + " preset index " + this.f69675r + " thumbSize " + this.f69677t + " abaSwitch " + this.f69678u + " qpSwitch " + this.f69679v + " swHevcRatio " + this.f69680w + " hwHevcRatio " + this.f69681x + " ceilingVideoBR " + this.f69682y + " flooringVideoBR " + this.f69683z + " isEnableHEVCEncode " + this.f69653A + " isEnable1080p " + this.f69654B + " maxVideoSize " + this.f69655C + " minQP " + this.f69656D + " maxQP " + this.f69657E + " takePhotosVideoBR " + this.f69658F + " remuxScene " + this.f69659G + " enableHdrTransCode " + this.f69660H + " hdrType " + this.f69661I + " hwEnableHevc " + this.f69662J + " swEnableHevc " + this.f69663K + ']';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f69664d);
        parcel.writeInt(this.f69665e);
        parcel.writeInt(this.f69666f);
        parcel.writeInt(this.f69667g);
        parcel.writeInt(this.f69668h);
        parcel.writeInt(this.f69670j);
        parcel.writeInt(this.f69671n);
        parcel.writeInt(this.f69672o);
        parcel.writeInt(this.f69674q);
        parcel.writeInt(this.f69675r);
        parcel.writeInt(this.f69676s ? 1 : 0);
        parcel.writeInt(this.f69677t);
        parcel.writeInt(this.f69678u);
        parcel.writeInt(this.f69679v);
        parcel.writeFloat(this.f69680w);
        parcel.writeFloat(this.f69681x);
        parcel.writeInt(this.f69682y);
        parcel.writeInt(this.f69683z);
        parcel.writeInt(this.f69653A);
        parcel.writeInt(this.f69654B);
        parcel.writeInt(this.f69655C);
        parcel.writeInt(this.f69656D);
        parcel.writeInt(this.f69657E);
        parcel.writeInt(this.f69658F);
        parcel.writeInt(this.f69659G);
        parcel.writeInt(this.f69660H ? 1 : 0);
        parcel.writeInt(this.f69661I);
        parcel.writeInt(this.f69673p);
        parcel.writeInt(this.f69662J);
        parcel.writeInt(this.f69663K);
        parcel.writeInt(this.f69669i);
    }

    public APIVideoTransPara(Parcel parcel) {
        C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
        boolean z = true;
        this.f69664d = parcel.readInt();
        this.f69665e = parcel.readInt();
        this.f69666f = parcel.readInt();
        this.f69667g = parcel.readInt();
        this.f69668h = parcel.readInt();
        this.f69670j = parcel.readInt();
        this.f69671n = parcel.readInt();
        this.f69672o = parcel.readInt();
        this.f69674q = parcel.readInt();
        this.f69675r = parcel.readInt();
        this.f69676s = parcel.readInt() > 0;
        this.f69677t = parcel.readInt();
        this.f69678u = parcel.readInt();
        this.f69679v = parcel.readInt();
        this.f69680w = parcel.readFloat();
        this.f69681x = parcel.readFloat();
        this.f69682y = parcel.readInt();
        this.f69683z = parcel.readInt();
        this.f69653A = parcel.readInt();
        this.f69654B = parcel.readInt();
        this.f69655C = parcel.readInt();
        this.f69656D = parcel.readInt();
        this.f69657E = parcel.readInt();
        this.f69658F = parcel.readInt();
        this.f69659G = parcel.readInt();
        this.f69660H = parcel.readInt() <= 0 ? false : z;
        this.f69661I = parcel.readInt();
        this.f69673p = parcel.readInt();
        this.f69662J = parcel.readInt();
        this.f69663K = parcel.readInt();
        this.f69669i = parcel.readInt();
    }
}
