package yu3;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import qu3.C25903a;
import ru3.C118234d;
import ru3.C26118c;

/* renamed from: yu3.a */
public final class C26639a {

    /* renamed from: w */
    public static final byte[] f74126w = {68, 88, 68, 73, 70, 70};

    /* renamed from: a */
    public final C25903a f74127a;

    /* renamed from: b */
    public short f74128b;

    /* renamed from: c */
    public int f74129c;

    /* renamed from: d */
    public int f74130d;

    /* renamed from: e */
    public int f74131e;

    /* renamed from: f */
    public int f74132f;

    /* renamed from: g */
    public int f74133g;

    /* renamed from: h */
    public int f74134h;

    /* renamed from: i */
    public int f74135i;

    /* renamed from: j */
    public int f74136j;

    /* renamed from: k */
    public int f74137k;

    /* renamed from: l */
    public int f74138l;

    /* renamed from: m */
    public int f74139m;

    /* renamed from: n */
    public int f74140n;

    /* renamed from: o */
    public int f74141o;

    /* renamed from: p */
    public int f74142p;

    /* renamed from: q */
    public int f74143q;

    /* renamed from: r */
    public int f74144r;

    /* renamed from: s */
    public int f74145s;

    /* renamed from: t */
    public int f74146t;

    /* renamed from: u */
    public int f74147u;

    /* renamed from: v */
    public byte[] f74148v;

    public C26639a(InputStream inputStream) {
        C25903a aVar = new C25903a(ByteBuffer.wrap(C118234d.m166795a(inputStream, 32768)));
        this.f74127a = aVar;
        byte[] bArr = f74126w;
        byte[] bArr2 = new byte[6];
        aVar.f72245a.get(bArr2);
        if (C26118c.m33546d(bArr2, bArr) == 0) {
            short s = aVar.f72245a.getShort();
            this.f74128b = s;
            if ((s == 2 ? 0 : (s & 65535) < 2 ? (char) 65535 : 1) == 0) {
                this.f74129c = aVar.mo52787l();
                this.f74130d = aVar.mo52787l();
                this.f74131e = aVar.mo52787l();
                this.f74132f = aVar.mo52787l();
                this.f74133g = aVar.mo52787l();
                this.f74134h = aVar.mo52787l();
                this.f74135i = aVar.mo52787l();
                this.f74136j = aVar.mo52787l();
                this.f74137k = aVar.mo52787l();
                this.f74138l = aVar.mo52787l();
                this.f74139m = aVar.mo52787l();
                this.f74140n = aVar.mo52787l();
                this.f74141o = aVar.mo52787l();
                this.f74142p = aVar.mo52787l();
                this.f74143q = aVar.mo52787l();
                this.f74144r = aVar.mo52787l();
                this.f74145s = aVar.mo52787l();
                this.f74146t = aVar.mo52787l();
                this.f74147u = aVar.mo52787l();
                byte[] bArr3 = new byte[20];
                aVar.f72245a.get(bArr3);
                this.f74148v = bArr3;
                aVar.f72245a.position(this.f74130d);
                return;
            }
            throw new IllegalStateException("bad dex patch file version: " + this.f74128b + ", expected: " + 2);
        }
        throw new IllegalStateException("bad dex patch file magic: " + Arrays.toString(bArr2));
    }
}
