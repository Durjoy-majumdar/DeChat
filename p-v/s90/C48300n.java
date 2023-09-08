package s90;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import te3.C49399fa;

/* renamed from: s90.n */
public class C48300n extends C49399fa {

    /* renamed from: A */
    public int f129341A = 0;

    /* renamed from: B */
    public String f129342B;

    /* renamed from: C */
    public boolean f129343C = false;

    /* renamed from: u */
    public int f129344u;

    /* renamed from: v */
    public int f129345v;

    /* renamed from: w */
    public int f129346w;

    /* renamed from: x */
    public int f129347x;

    /* renamed from: y */
    public int f129348y = 0;

    /* renamed from: z */
    public long f129349z = -1;

    /* renamed from: b */
    public C48300n mo73007b(C49399fa faVar) {
        if (faVar == null) {
            return null;
        }
        this.f133366d = faVar.f133366d;
        this.f133367e = faVar.f133367e;
        this.f133368f = faVar.f133368f;
        this.f133369g = faVar.f133369g;
        this.f133370h = faVar.f133370h;
        this.f133371i = faVar.f133371i;
        this.f133372j = faVar.f133372j;
        this.f133373n = faVar.f133373n;
        this.f133374o = faVar.f133374o;
        this.f133375p = faVar.f133375p;
        this.f133376q = faVar.f133376q;
        this.f133377r = faVar.f133377r;
        this.f133378s = faVar.f133378s;
        this.f133379t = faVar.f133379t;
        return this;
    }

    /* renamed from: d */
    public String mo73008d(String str) {
        return MD5Util.getMD5String(str + "_" + this.f133367e);
    }
}
