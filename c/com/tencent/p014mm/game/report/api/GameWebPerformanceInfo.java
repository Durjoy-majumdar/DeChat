package com.tencent.p014mm.game.report.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.game.report.api.GameWebPerformanceInfo */
public class GameWebPerformanceInfo implements Parcelable {
    public static final Parcelable.Creator<GameWebPerformanceInfo> CREATOR = new C40303a();

    /* renamed from: Q */
    public static Map<String, GameWebPerformanceInfo> f108338Q = new HashMap();

    /* renamed from: A */
    public long f108339A;

    /* renamed from: B */
    public long f108340B;

    /* renamed from: C */
    public long f108341C;

    /* renamed from: D */
    public long f108342D;

    /* renamed from: E */
    public long f108343E;

    /* renamed from: F */
    public long f108344F;

    /* renamed from: G */
    public long f108345G;

    /* renamed from: H */
    public long f108346H;

    /* renamed from: I */
    public long f108347I;

    /* renamed from: J */
    public long f108348J;

    /* renamed from: K */
    public long f108349K;

    /* renamed from: L */
    public long f108350L;

    /* renamed from: M */
    public String f108351M;

    /* renamed from: N */
    public String f108352N;

    /* renamed from: P */
    public String f108353P;

    /* renamed from: d */
    public String f108354d;

    /* renamed from: e */
    public String f108355e;

    /* renamed from: f */
    public int f108356f;

    /* renamed from: g */
    public int f108357g;

    /* renamed from: h */
    public int f108358h;

    /* renamed from: i */
    public int f108359i;

    /* renamed from: j */
    public int f108360j;

    /* renamed from: n */
    public int f108361n;

    /* renamed from: o */
    public int f108362o;

    /* renamed from: p */
    public int f108363p;

    /* renamed from: q */
    public String f108364q;

    /* renamed from: r */
    public long f108365r;

    /* renamed from: s */
    public long f108366s;

    /* renamed from: t */
    public long f108367t;

    /* renamed from: u */
    public long f108368u;

    /* renamed from: v */
    public long f108369v;

    /* renamed from: w */
    public long f108370w;

    /* renamed from: x */
    public long f108371x;

    /* renamed from: y */
    public long f108372y;

    /* renamed from: z */
    public long f108373z;

    /* renamed from: com.tencent.mm.game.report.api.GameWebPerformanceInfo$a */
    public class C40303a implements Parcelable.Creator<GameWebPerformanceInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new GameWebPerformanceInfo(parcel, (C40303a) null);
        }

        public Object[] newArray(int i) {
            return new GameWebPerformanceInfo[i];
        }
    }

    public GameWebPerformanceInfo() {
    }

    public GameWebPerformanceInfo(Parcel parcel, C40303a aVar) {
        this.f108354d = parcel.readString();
        this.f108355e = parcel.readString();
        this.f108356f = parcel.readInt();
        this.f108357g = parcel.readInt();
        this.f108358h = parcel.readInt();
        this.f108359i = parcel.readInt();
        this.f108360j = parcel.readInt();
        this.f108361n = parcel.readInt();
        this.f108362o = parcel.readInt();
        this.f108363p = parcel.readInt();
        this.f108364q = parcel.readString();
        this.f108365r = parcel.readLong();
        this.f108366s = parcel.readLong();
        this.f108367t = parcel.readLong();
        this.f108368u = parcel.readLong();
        this.f108369v = parcel.readLong();
        this.f108370w = parcel.readLong();
        this.f108371x = parcel.readLong();
        this.f108372y = parcel.readLong();
        this.f108373z = parcel.readLong();
        this.f108339A = parcel.readLong();
        this.f108340B = parcel.readLong();
        this.f108341C = parcel.readLong();
        this.f108342D = parcel.readLong();
        this.f108343E = parcel.readLong();
        this.f108344F = parcel.readLong();
        this.f108345G = parcel.readLong();
        this.f108346H = parcel.readLong();
        this.f108347I = parcel.readLong();
        this.f108348J = parcel.readLong();
        this.f108349K = parcel.readLong();
        this.f108350L = parcel.readLong();
        this.f108351M = parcel.readString();
        this.f108352N = parcel.readString();
        this.f108353P = parcel.readString();
    }

    /* renamed from: a */
    public static synchronized GameWebPerformanceInfo m43445a(String str) {
        GameWebPerformanceInfo gameWebPerformanceInfo;
        synchronized (GameWebPerformanceInfo.class) {
            if (((HashMap) f108338Q).containsKey(str)) {
                ((HashMap) f108338Q).remove(str);
            }
            gameWebPerformanceInfo = new GameWebPerformanceInfo();
            ((HashMap) f108338Q).put(str, gameWebPerformanceInfo);
        }
        return gameWebPerformanceInfo;
    }

    /* renamed from: b */
    public static synchronized GameWebPerformanceInfo m43446b(String str) {
        synchronized (GameWebPerformanceInfo.class) {
            if (Util.isNullOrNil(str)) {
                GameWebPerformanceInfo gameWebPerformanceInfo = new GameWebPerformanceInfo();
                return gameWebPerformanceInfo;
            } else if (((HashMap) f108338Q).containsKey(str)) {
                GameWebPerformanceInfo gameWebPerformanceInfo2 = (GameWebPerformanceInfo) ((HashMap) f108338Q).get(str);
                return gameWebPerformanceInfo2;
            } else {
                GameWebPerformanceInfo gameWebPerformanceInfo3 = new GameWebPerformanceInfo();
                ((HashMap) f108338Q).put(str, gameWebPerformanceInfo3);
                return gameWebPerformanceInfo3;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("url: %s, isLuggage: %d, isWePkg: %d, isPreloadWebCore: %d, isFirstPage: %d, usedCacheUinKey: %d, jsapiCanUsed: %d, hasFloatLayer: %d, pkgId: %s,startTime: %d, gameCenterUICreate: %d, startWebUI: %d, preloadWePkgBgn: %d,preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d, webUICreate: %d, webUIOnShowBgn: %d, createViewBgn: %d,createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d,onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInFront: %d, webUIDestroy: %d, commJsVersion: %s, pkgVersion: %s, jsBridgeErrMsg: %s", new Object[]{this.f108354d, Integer.valueOf(this.f108356f), Integer.valueOf(this.f108357g), Integer.valueOf(this.f108358h), Integer.valueOf(this.f108359i), Integer.valueOf(this.f108360j), Integer.valueOf(this.f108362o), Integer.valueOf(this.f108363p), this.f108364q, Long.valueOf(this.f108365r), Long.valueOf(this.f108366s), Long.valueOf(this.f108367t), Long.valueOf(this.f108370w), Long.valueOf(this.f108369v), Long.valueOf(this.f108370w), Long.valueOf(this.f108371x), Long.valueOf(this.f108372y), Long.valueOf(this.f108373z), Long.valueOf(this.f108339A), Long.valueOf(this.f108340B), Long.valueOf(this.f108341C), Long.valueOf(this.f108342D), Long.valueOf(this.f108343E), Long.valueOf(this.f108344F), Long.valueOf(this.f108345G), Long.valueOf(this.f108346H), Long.valueOf(this.f108347I), Long.valueOf(this.f108348J), this.f108351M, this.f108352N, this.f108353P});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108354d);
        parcel.writeString(this.f108355e);
        parcel.writeInt(this.f108356f);
        parcel.writeInt(this.f108357g);
        parcel.writeInt(this.f108358h);
        parcel.writeInt(this.f108359i);
        parcel.writeInt(this.f108360j);
        parcel.writeInt(this.f108361n);
        parcel.writeInt(this.f108362o);
        parcel.writeInt(this.f108363p);
        parcel.writeString(this.f108364q);
        parcel.writeLong(this.f108365r);
        parcel.writeLong(this.f108366s);
        parcel.writeLong(this.f108367t);
        parcel.writeLong(this.f108368u);
        parcel.writeLong(this.f108369v);
        parcel.writeLong(this.f108370w);
        parcel.writeLong(this.f108371x);
        parcel.writeLong(this.f108372y);
        parcel.writeLong(this.f108373z);
        parcel.writeLong(this.f108339A);
        parcel.writeLong(this.f108340B);
        parcel.writeLong(this.f108341C);
        parcel.writeLong(this.f108342D);
        parcel.writeLong(this.f108343E);
        parcel.writeLong(this.f108344F);
        parcel.writeLong(this.f108345G);
        parcel.writeLong(this.f108346H);
        parcel.writeLong(this.f108347I);
        parcel.writeLong(this.f108348J);
        parcel.writeLong(this.f108349K);
        parcel.writeLong(this.f108350L);
        parcel.writeString(this.f108351M);
        parcel.writeString(this.f108352N);
        parcel.writeString(this.f108353P);
    }
}
