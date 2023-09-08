package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaExposedParams */
public class WxaExposedParams implements Parcelable {
    public static final Parcelable.Creator<WxaExposedParams> CREATOR = new C81631a();

    /* renamed from: d */
    public String f239539d;

    /* renamed from: e */
    public String f239540e = "";

    /* renamed from: f */
    public String f239541f = "";

    /* renamed from: g */
    public String f239542g;

    /* renamed from: h */
    public String f239543h;

    /* renamed from: i */
    public String f239544i;

    /* renamed from: j */
    public int f239545j;

    /* renamed from: n */
    public int f239546n;

    /* renamed from: o */
    public String f239547o;

    /* renamed from: p */
    public int f239548p;

    /* renamed from: q */
    public String f239549q;

    /* renamed from: r */
    public String f239550r;

    /* renamed from: s */
    public String f239551s;

    /* renamed from: t */
    public String f239552t;

    /* renamed from: u */
    public String f239553u;

    /* renamed from: v */
    public String f239554v;

    /* renamed from: w */
    public String f239555w;

    /* renamed from: x */
    public String f239556x;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaExposedParams$a */
    public class C81631a implements Parcelable.Creator<WxaExposedParams> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaExposedParams(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaExposedParams[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b */
    public static class C81632b {

        /* renamed from: a */
        public String f239557a = "";

        /* renamed from: b */
        public String f239558b = "";

        /* renamed from: c */
        public String f239559c = "";

        /* renamed from: d */
        public String f239560d = "";

        /* renamed from: e */
        public String f239561e = "";

        /* renamed from: f */
        public String f239562f = "";

        /* renamed from: g */
        public int f239563g = -1;

        /* renamed from: h */
        public int f239564h = -1;

        /* renamed from: i */
        public String f239565i = "";

        /* renamed from: j */
        public int f239566j = 0;

        /* renamed from: k */
        public String f239567k = "";

        /* renamed from: l */
        public String f239568l = "";

        /* renamed from: m */
        public String f239569m = "";

        /* renamed from: n */
        public String f239570n = "";

        /* renamed from: o */
        public String f239571o = "";

        /* renamed from: p */
        public String f239572p = "";

        /* renamed from: q */
        public String f239573q;

        /* renamed from: r */
        public String f239574r;

        /* renamed from: a */
        public WxaExposedParams mo113977a() {
            return new WxaExposedParams(this, (C81631a) null);
        }
    }

    public WxaExposedParams(C81632b bVar, C81631a aVar) {
        this.f239539d = bVar.f239557a;
        this.f239540e = bVar.f239558b;
        this.f239541f = bVar.f239559c;
        this.f239542g = bVar.f239560d;
        this.f239543h = bVar.f239561e;
        this.f239544i = bVar.f239562f;
        this.f239545j = bVar.f239564h;
        this.f239546n = bVar.f239563g;
        this.f239547o = bVar.f239565i;
        this.f239548p = bVar.f239566j;
        this.f239549q = bVar.f239567k;
        this.f239550r = bVar.f239568l;
        this.f239551s = bVar.f239569m;
        this.f239552t = bVar.f239570n;
        this.f239553u = bVar.f239571o;
        this.f239554v = bVar.f239572p;
        this.f239555w = Util.nullAsNil(bVar.f239573q);
        this.f239556x = Util.nullAsNil(bVar.f239574r);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WxaExposedParams{appId='" + this.f239539d + '\'' + ", username='" + this.f239542g + '\'' + ", nickname='" + this.f239543h + '\'' + ", iconUrl='" + this.f239544i + '\'' + ", pkgDebugType=" + this.f239545j + ", pkgVersion=" + this.f239546n + ", pkgMD5='" + this.f239547o + '\'' + ", from=" + this.f239548p + ", pageId='" + this.f239549q + '\'' + ", errorUrl='" + this.f239550r + '\'' + ", screenshotLocalId='" + this.f239551s + '\'' + ", sessionId='" + this.f239552t + '\'' + ", businessAppId='" + this.f239553u + '\'' + ", msgId='" + this.f239554v + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239539d);
        parcel.writeString(this.f239540e);
        parcel.writeString(this.f239541f);
        parcel.writeString(this.f239542g);
        parcel.writeString(this.f239543h);
        parcel.writeString(this.f239544i);
        parcel.writeInt(this.f239545j);
        parcel.writeInt(this.f239546n);
        parcel.writeString(this.f239547o);
        parcel.writeInt(this.f239548p);
        parcel.writeString(this.f239549q);
        parcel.writeString(this.f239550r);
        parcel.writeString(this.f239551s);
        parcel.writeString(this.f239552t);
        parcel.writeString(this.f239553u);
        parcel.writeString(this.f239554v);
        parcel.writeString(this.f239555w);
        parcel.writeString(this.f239556x);
    }

    public WxaExposedParams(Parcel parcel) {
        this.f239539d = parcel.readString();
        this.f239540e = parcel.readString();
        this.f239541f = parcel.readString();
        this.f239542g = parcel.readString();
        this.f239543h = parcel.readString();
        this.f239544i = parcel.readString();
        this.f239545j = parcel.readInt();
        this.f239546n = parcel.readInt();
        this.f239547o = parcel.readString();
        this.f239548p = parcel.readInt();
        this.f239549q = parcel.readString();
        this.f239550r = parcel.readString();
        this.f239551s = parcel.readString();
        this.f239552t = parcel.readString();
        this.f239553u = parcel.readString();
        this.f239554v = parcel.readString();
        this.f239555w = parcel.readString();
        this.f239556x = parcel.readString();
    }
}
