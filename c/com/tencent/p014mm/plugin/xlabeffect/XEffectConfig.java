package com.tencent.p014mm.plugin.xlabeffect;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/xlabeffect/XEffectConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "xeffect-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.xlabeffect.XEffectConfig */
public final class XEffectConfig implements Parcelable {
    public static final Parcelable.Creator<XEffectConfig> CREATOR = new C106575a();

    /* renamed from: A */
    public int f318431A;

    /* renamed from: B */
    public int f318432B;

    /* renamed from: C */
    public int f318433C;

    /* renamed from: D */
    public int f318434D;

    /* renamed from: E */
    public int f318435E;

    /* renamed from: F */
    public int f318436F;

    /* renamed from: G */
    public int f318437G;

    /* renamed from: H */
    public int f318438H;

    /* renamed from: I */
    public String f318439I;

    /* renamed from: d */
    public int f318440d;

    /* renamed from: e */
    public boolean f318441e;

    /* renamed from: f */
    public boolean f318442f;

    /* renamed from: g */
    public int f318443g;

    /* renamed from: h */
    public int f318444h;

    /* renamed from: i */
    public int f318445i;

    /* renamed from: j */
    public int f318446j;

    /* renamed from: n */
    public int f318447n;

    /* renamed from: o */
    public int f318448o;

    /* renamed from: p */
    public int f318449p;

    /* renamed from: q */
    public int f318450q;

    /* renamed from: r */
    public int f318451r;

    /* renamed from: s */
    public int f318452s;

    /* renamed from: t */
    public int f318453t;

    /* renamed from: u */
    public int f318454u;

    /* renamed from: v */
    public int f318455v;

    /* renamed from: w */
    public int f318456w;

    /* renamed from: x */
    public int f318457x;

    /* renamed from: y */
    public int f318458y;

    /* renamed from: z */
    public int f318459z;

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XEffectConfig$a */
    public static final class C106575a implements Parcelable.Creator<XEffectConfig> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
            return new XEffectConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new XEffectConfig[i];
        }
    }

    public XEffectConfig() {
    }

    public XEffectConfig(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "json");
        this.f318443g = jSONObject.optInt("skinSmooth");
        this.f318444h = jSONObject.optInt("eyeMorph");
        this.f318445i = jSONObject.optInt("faceMorph");
        this.f318446j = jSONObject.optInt("skinBright");
        this.f318447n = jSONObject.optInt("eyeBright");
        this.f318448o = jSONObject.optInt("rosy");
        this.f318449p = jSONObject.optInt("eyePouch");
        this.f318450q = jSONObject.optInt("smileFolds");
        this.f318451r = jSONObject.optInt("sharpen");
        this.f318452s = jSONObject.optInt("teethBright");
        this.f318453t = jSONObject.optInt("smallHead");
        this.f318454u = jSONObject.optInt("cheekBone");
        this.f318455v = jSONObject.optInt("lowerJawbone");
        this.f318456w = jSONObject.optInt("wingOfNose");
        this.f318457x = jSONObject.optInt("chinShort");
        this.f318458y = jSONObject.optInt("chinLong");
        this.f318459z = jSONObject.optInt("hairLineHigh");
        this.f318431A = jSONObject.optInt("hairLineLow");
        this.f318432B = jSONObject.optInt("bigEye");
        this.f318433C = jSONObject.optInt("boySlim");
        this.f318434D = jSONObject.optInt("girlSlim");
        this.f318435E = jSONObject.optInt("mouthMorph");
        this.f318436F = jSONObject.optInt("zhaiLian");
        this.f318437G = jSONObject.optInt("contour");
        this.f318438H = jSONObject.optInt("filterRate");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f318440d);
        parcel.writeByte(this.f318441e ? (byte) 1 : 0);
        parcel.writeByte(this.f318442f ? (byte) 1 : 0);
        parcel.writeInt(this.f318443g);
        parcel.writeInt(this.f318444h);
        parcel.writeInt(this.f318445i);
        parcel.writeInt(this.f318446j);
        parcel.writeInt(this.f318447n);
        parcel.writeInt(this.f318448o);
        parcel.writeInt(this.f318449p);
        parcel.writeInt(this.f318450q);
        parcel.writeInt(this.f318451r);
        parcel.writeInt(this.f318452s);
        parcel.writeInt(this.f318453t);
        parcel.writeInt(this.f318454u);
        parcel.writeInt(this.f318455v);
        parcel.writeInt(this.f318456w);
        parcel.writeInt(this.f318457x);
        parcel.writeInt(this.f318458y);
        parcel.writeInt(this.f318459z);
        parcel.writeInt(this.f318431A);
        parcel.writeInt(this.f318432B);
        parcel.writeInt(this.f318433C);
        parcel.writeInt(this.f318434D);
        parcel.writeInt(this.f318435E);
        parcel.writeInt(this.f318438H);
        parcel.writeString(this.f318439I);
    }

    public XEffectConfig(Parcel parcel) {
        C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
        this.f318440d = parcel.readInt();
        boolean z = true;
        this.f318441e = parcel.readByte() != 0;
        this.f318442f = parcel.readByte() == 0 ? false : z;
        this.f318443g = parcel.readInt();
        this.f318444h = parcel.readInt();
        this.f318445i = parcel.readInt();
        this.f318446j = parcel.readInt();
        this.f318447n = parcel.readInt();
        this.f318448o = parcel.readInt();
        this.f318449p = parcel.readInt();
        this.f318450q = parcel.readInt();
        this.f318451r = parcel.readInt();
        this.f318452s = parcel.readInt();
        this.f318453t = parcel.readInt();
        this.f318454u = parcel.readInt();
        this.f318455v = parcel.readInt();
        this.f318456w = parcel.readInt();
        this.f318457x = parcel.readInt();
        this.f318458y = parcel.readInt();
        this.f318459z = parcel.readInt();
        this.f318431A = parcel.readInt();
        this.f318432B = parcel.readInt();
        this.f318433C = parcel.readInt();
        this.f318434D = parcel.readInt();
        this.f318435E = parcel.readInt();
        this.f318438H = parcel.readInt();
        this.f318439I = parcel.readString();
    }
}
