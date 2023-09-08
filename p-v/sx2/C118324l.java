package sx2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: sx2.l */
public class C118324l {

    /* renamed from: A */
    public long f353613A;

    /* renamed from: B */
    public int f353614B;

    /* renamed from: C */
    public long f353615C;

    /* renamed from: D */
    public long f353616D;

    /* renamed from: E */
    public boolean f353617E;

    /* renamed from: F */
    public boolean f353618F;

    /* renamed from: a */
    public int f353619a;

    /* renamed from: b */
    public long f353620b;

    /* renamed from: c */
    public long f353621c;

    /* renamed from: d */
    public int f353622d = 0;

    /* renamed from: e */
    public int f353623e;

    /* renamed from: f */
    public long f353624f;

    /* renamed from: g */
    public int f353625g;

    /* renamed from: h */
    public int f353626h;

    /* renamed from: i */
    public int f353627i;

    /* renamed from: j */
    public int f353628j;

    /* renamed from: k */
    public int f353629k;

    /* renamed from: l */
    public int f353630l = 0;

    /* renamed from: m */
    public int f353631m;

    /* renamed from: n */
    public int f353632n;

    /* renamed from: o */
    public int f353633o;

    /* renamed from: p */
    public int f353634p;

    /* renamed from: q */
    public int f353635q;

    /* renamed from: r */
    public int f353636r;

    /* renamed from: s */
    public int f353637s;

    /* renamed from: t */
    public int f353638t;

    /* renamed from: u */
    public int f353639u;

    /* renamed from: v */
    public String f353640v;

    /* renamed from: w */
    public int f353641w;

    /* renamed from: x */
    public long f353642x;

    /* renamed from: y */
    public int f353643y;

    /* renamed from: z */
    public int f353644z;

    /* renamed from: a */
    public void mo183108a() {
        long j = this.f353616D;
        if (j != 0) {
            long ticksToNow = Util.ticksToNow(j) / 1000;
            if (ticksToNow < 2) {
                this.f353631m++;
            } else if (ticksToNow < 6) {
                this.f353632n++;
            } else if (ticksToNow < 11) {
                this.f353633o++;
            } else if (ticksToNow < 21) {
                this.f353634p++;
            } else if (ticksToNow < 31) {
                this.f353635q++;
            } else if (ticksToNow < 41) {
                this.f353636r++;
            } else if (ticksToNow < 51) {
                this.f353637s++;
            } else if (ticksToNow < 61) {
                this.f353638t++;
            } else {
                this.f353639u++;
            }
            this.f353616D = 0;
        }
    }

    public String toString() {
        return "" + this.f353619a + "," + this.f353620b + "," + this.f353621c + "," + this.f353622d + "," + this.f353623e + "," + this.f353624f + "," + this.f353625g + "," + this.f353626h + "," + 0 + "," + 0 + "," + this.f353627i + "," + this.f353628j + "," + this.f353629k + "," + this.f353630l + "," + this.f353631m + "," + this.f353632n + "," + this.f353633o + "," + this.f353634p + "," + this.f353635q + "," + this.f353636r + "," + this.f353637s + "," + this.f353638t + "," + this.f353639u + "," + this.f353640v + "," + this.f353641w + "," + this.f353642x + "," + this.f353643y + "," + this.f353644z;
    }
}
