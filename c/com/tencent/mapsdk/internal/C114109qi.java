package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;

/* renamed from: com.tencent.mapsdk.internal.qi */
public final class C114109qi {

    /* renamed from: a */
    public static final int f341535a = 0;

    /* renamed from: b */
    public static final int f341536b = 1;

    /* renamed from: c */
    public static final int f341537c = 2;

    /* renamed from: d */
    public static final int f341538d = 1;

    /* renamed from: e */
    public static final int f341539e = 16;

    /* renamed from: f */
    public static final int f341540f = 256;

    /* renamed from: g */
    public static final int f341541g = 4096;

    /* renamed from: h */
    public static final int f341542h = 65536;

    /* renamed from: A */
    private Rect f341543A;

    /* renamed from: i */
    public GeoPoint f341544i;

    /* renamed from: j */
    public Bitmap[] f341545j;

    /* renamed from: k */
    public float f341546k = 0.5f;

    /* renamed from: l */
    public float f341547l = 0.5f;

    /* renamed from: m */
    public float f341548m = 1.0f;

    /* renamed from: n */
    public boolean f341549n = false;

    /* renamed from: o */
    public int f341550o;

    /* renamed from: p */
    public boolean f341551p;

    /* renamed from: q */
    public int f341552q;

    /* renamed from: r */
    public int f341553r;

    /* renamed from: s */
    public int f341554s;

    /* renamed from: t */
    public int f341555t = 2;

    /* renamed from: u */
    public boolean f341556u;

    /* renamed from: v */
    public boolean f341557v = true;

    /* renamed from: w */
    public String f341558w;

    /* renamed from: x */
    public boolean f341559x;

    /* renamed from: y */
    public boolean f341560y;

    /* renamed from: z */
    public boolean f341561z = true;

    /* renamed from: a */
    private C114109qi m159142a(GeoPoint geoPoint) {
        this.f341544i = geoPoint;
        return this;
    }

    /* renamed from: b */
    private GeoPoint m159145b() {
        return this.f341544i;
    }

    /* renamed from: c */
    private Rect m159148c() {
        return this.f341543A;
    }

    /* renamed from: d */
    private Bitmap[] m159152d() {
        return this.f341545j;
    }

    /* renamed from: e */
    private boolean m159154e() {
        return this.f341549n;
    }

    /* renamed from: f */
    private float m159155f() {
        return this.f341548m;
    }

    /* renamed from: g */
    private int[] m159158g() {
        float f = this.f341546k;
        int i = f == 0.0f ? 4096 : f == 1.0f ? 65536 : 1;
        float f2 = this.f341547l;
        return new int[]{i | (f2 == 0.0f ? 256 : f2 == 1.0f ? 16 : 1)};
    }

    /* renamed from: h */
    private int m159159h() {
        float f = this.f341546k;
        int i = 1;
        int i2 = f == 0.0f ? 4096 : f == 1.0f ? 65536 : 1;
        float f2 = this.f341547l;
        if (f2 == 0.0f) {
            i = 256;
        } else if (f2 == 1.0f) {
            i = 16;
        }
        return i2 | i;
    }

    /* renamed from: i */
    private float m159160i() {
        return this.f341546k;
    }

    /* renamed from: j */
    private float m159161j() {
        return this.f341547l;
    }

    /* renamed from: k */
    private int m159162k() {
        return this.f341550o;
    }

    /* renamed from: l */
    private boolean m159163l() {
        return this.f341551p;
    }

    /* renamed from: m */
    private boolean m159164m() {
        return this.f341559x;
    }

    /* renamed from: n */
    private boolean m159165n() {
        return this.f341560y;
    }

    /* renamed from: o */
    private int m159166o() {
        return this.f341552q;
    }

    /* renamed from: p */
    private int m159167p() {
        return this.f341553r;
    }

    /* renamed from: q */
    private int m159168q() {
        return this.f341554s;
    }

    /* renamed from: r */
    private int m159169r() {
        return this.f341555t;
    }

    /* renamed from: s */
    private boolean m159170s() {
        return this.f341556u;
    }

    /* renamed from: t */
    private boolean m159171t() {
        return this.f341557v;
    }

    /* renamed from: u */
    private boolean m159172u() {
        return this.f341561z;
    }

    /* renamed from: b */
    private C114109qi m159147b(boolean z) {
        this.f341549n = z;
        return this;
    }

    /* renamed from: c */
    private C114109qi m159150c(boolean z) {
        this.f341551p = z;
        return this;
    }

    /* renamed from: d */
    private C114109qi m159151d(boolean z) {
        this.f341559x = z;
        return this;
    }

    /* renamed from: e */
    private C114109qi m159153e(boolean z) {
        this.f341560y = z;
        return this;
    }

    /* renamed from: f */
    private C114109qi m159156f(boolean z) {
        this.f341556u = z;
        return this;
    }

    /* renamed from: a */
    public final C114109qi mo172726a(String str, Bitmap... bitmapArr) {
        this.f341558w = str;
        this.f341545j = bitmapArr;
        return this;
    }

    /* renamed from: b */
    private C114109qi m159146b(int i) {
        this.f341554s = i;
        return this;
    }

    /* renamed from: c */
    private C114109qi m159149c(int i) {
        this.f341555t = i;
        return this;
    }

    /* renamed from: g */
    private C114109qi m159157g(boolean z) {
        this.f341561z = z;
        return this;
    }

    /* renamed from: a */
    private C114109qi m159140a(int i, int i2) {
        this.f341552q = i;
        this.f341553r = i2;
        return this;
    }

    /* renamed from: a */
    private C114109qi m159143a(boolean z) {
        this.f341557v = z;
        return this;
    }

    /* renamed from: a */
    private C114109qi m159141a(int i, int i2, int i3, int i4) {
        this.f341543A = new Rect(i, i2, i3, i4);
        return this;
    }

    /* renamed from: a */
    public final String mo172727a() {
        return this.f341558w;
    }

    /* renamed from: a */
    private C114109qi m159138a(float f) {
        this.f341548m = f;
        return this;
    }

    /* renamed from: a */
    private C114109qi m159144a(int... iArr) {
        if (iArr == null) {
            this.f341546k = 0.5f;
            this.f341547l = 1.0f;
            return this;
        }
        this.f341546k = 0.5f;
        this.f341547l = 0.5f;
        if (iArr.length != 1) {
            return this;
        }
        int i = iArr[0];
        if ((i & 256) == 256) {
            this.f341547l = 0.0f;
        } else if ((i & 16) == 16) {
            this.f341547l = 1.0f;
        }
        if ((i & 4096) == 4096) {
            this.f341546k = 0.0f;
        } else if ((i & 65536) == 65536) {
            this.f341546k = 1.0f;
        }
        return this;
    }

    /* renamed from: a */
    public final C114109qi mo172725a(float f, float f2) {
        this.f341546k = f;
        this.f341547l = f2;
        return this;
    }

    /* renamed from: a */
    private C114109qi m159139a(int i) {
        this.f341550o = i;
        return this;
    }
}
