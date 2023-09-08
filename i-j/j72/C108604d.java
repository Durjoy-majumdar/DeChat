package j72;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: j72.d */
public class C108604d {

    /* renamed from: a */
    public byte[] f325161a;

    /* renamed from: b */
    public byte[] f325162b;

    /* renamed from: c */
    public int f325163c = 0;

    /* renamed from: d */
    public long f325164d = Util.currentTicks();

    /* renamed from: e */
    public int f325165e;

    /* renamed from: f */
    public int f325166f;

    /* renamed from: g */
    public int f325167g;

    /* renamed from: h */
    public int f325168h;

    /* renamed from: i */
    public int f325169i;

    /* renamed from: j */
    public int f325170j;

    /* renamed from: k */
    public boolean f325171k;

    /* renamed from: l */
    public boolean f325172l;

    /* renamed from: m */
    public int f325173m;

    /* renamed from: j72.d$a */
    public interface C108605a {
    }

    public C108604d(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, byte[] bArr) {
        this.f325169i = i3;
        this.f325167g = i4;
        this.f325168h = i5;
        this.f325165e = i;
        this.f325166f = i2;
        this.f325172l = z2;
        this.f325171k = z;
        this.f325173m = i6;
        this.f325161a = bArr;
        int length = bArr.length;
        this.f325162b = C98921l.f289964d.mo126905m(Integer.valueOf(((i4 * i5) * 3) / 2));
    }
}
