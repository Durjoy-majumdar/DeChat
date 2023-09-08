package wu3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.Adler32;
import pu3.C25466a;
import pu3.C25467b;
import pu3.C25468c;
import pu3.C25469d;
import pu3.C25470e;
import pu3.C25473f;
import pu3.C25474g;
import pu3.C25477h;
import pu3.C25478i;
import pu3.C25490l;
import pu3.C25493o;
import pu3.C25495q;
import pu3.C25497s;
import pu3.C25498t;
import pu3.C25499u;
import pu3.C25502v;
import ru3.C26118c;
import xu3.C26547a;
import xu3.C26548b;
import xu3.C26549c;
import xu3.C26550d;
import xu3.C26551e;
import xu3.C26552f;
import xu3.C26553g;
import xu3.C26554h;
import xu3.C26555i;
import xu3.C26556j;
import xu3.C26557k;
import xu3.C26558l;
import xu3.C26559m;
import xu3.C26560n;
import xu3.C26561o;
import xu3.C26562p;
import yu3.C26639a;
import zu3.C26722g;

/* renamed from: wu3.a */
public class C26433a {

    /* renamed from: a */
    public final C25478i f73705a;

    /* renamed from: b */
    public final C25478i f73706b;

    /* renamed from: c */
    public final C26639a f73707c;

    /* renamed from: d */
    public final C26722g f73708d = new C26722g();

    /* renamed from: e */
    public C26555i<C25498t> f73709e;

    /* renamed from: f */
    public C26555i<Integer> f73710f;

    /* renamed from: g */
    public C26555i<C25497s> f73711g;

    /* renamed from: h */
    public C26555i<C25493o> f73712h;

    /* renamed from: i */
    public C26555i<C25495q> f73713i;

    /* renamed from: j */
    public C26555i<C25473f> f73714j;

    /* renamed from: k */
    public C26555i<C25502v> f73715k;

    /* renamed from: l */
    public C26555i<C25468c> f73716l;

    /* renamed from: m */
    public C26555i<C25467b> f73717m;

    /* renamed from: n */
    public C26555i<C25470e> f73718n;

    /* renamed from: o */
    public C26555i<C25474g> f73719o;

    /* renamed from: p */
    public C26555i<C25477h> f73720p;

    /* renamed from: q */
    public C26555i<C25466a> f73721q;

    /* renamed from: r */
    public C26555i<C25490l> f73722r;

    /* renamed from: s */
    public C26555i<C25469d> f73723s;

    public C26433a(InputStream inputStream, InputStream inputStream2) {
        C25478i iVar = new C25478i(inputStream);
        C26639a aVar = new C26639a(inputStream2);
        this.f73705a = iVar;
        this.f73707c = aVar;
        this.f73706b = new C25478i(aVar.f74129c);
    }

    /* renamed from: a */
    public void mo53418a(OutputStream outputStream) {
        byte[] b = this.f73705a.mo52714b(false);
        if (b != null) {
            C26639a aVar = this.f73707c;
            if (aVar != null) {
                byte[] bArr = aVar.f74148v;
                if (C26118c.m33546d(b, bArr) == 0) {
                    C25499u uVar = this.f73706b.f72125a;
                    C25499u.C25500a aVar2 = uVar.f72154a;
                    aVar2.f72183g = 0;
                    aVar2.f72182f = 1;
                    C25499u.C25500a aVar3 = uVar.f72161h;
                    aVar3.f72182f = 1;
                    C25499u.C25500a aVar4 = uVar.f72155b;
                    C26639a aVar5 = this.f73707c;
                    aVar4.f72183g = aVar5.f74131e;
                    uVar.f72156c.f72183g = aVar5.f74132f;
                    uVar.f72162i.f72183g = aVar5.f74138l;
                    uVar.f72157d.f72183g = aVar5.f74133g;
                    uVar.f72158e.f72183g = aVar5.f74134h;
                    uVar.f72159f.f72183g = aVar5.f74135i;
                    uVar.f72160g.f72183g = aVar5.f74136j;
                    aVar3.f72183g = aVar5.f74137k;
                    uVar.f72167n.f72183g = aVar5.f74143q;
                    uVar.f72169p.f72183g = aVar5.f74145s;
                    uVar.f72164k.f72183g = aVar5.f74140n;
                    uVar.f72163j.f72183g = aVar5.f74139m;
                    uVar.f72171r.f72183g = aVar5.f74147u;
                    uVar.f72170q.f72183g = aVar5.f74146t;
                    uVar.f72168o.f72183g = aVar5.f74144r;
                    uVar.f72166m.f72183g = aVar5.f74142p;
                    uVar.f72165l.f72183g = aVar5.f74141o;
                    uVar.f72175v = aVar5.f74129c;
                    Arrays.sort(uVar.f72172s);
                    uVar.mo52763a();
                    this.f73709e = new C26560n(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73710f = new C26561o(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73711g = new C26558l(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73712h = new C26556j(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73713i = new C26557k(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73714j = new C26552f(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73715k = new C26562p(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73716l = new C26548b(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73717m = new C26549c(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73718n = new C26551e(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73719o = new C26553g(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73720p = new C26554h(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73721q = new C26547a(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73722r = new C26559m(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73723s = new C26550d(this.f73707c, this.f73705a, this.f73706b, this.f73708d);
                    this.f73709e.mo53501b();
                    this.f73710f.mo53501b();
                    this.f73715k.mo53501b();
                    this.f73711g.mo53501b();
                    this.f73712h.mo53501b();
                    this.f73713i.mo53501b();
                    this.f73721q.mo53501b();
                    this.f73717m.mo53501b();
                    this.f73716l.mo53501b();
                    this.f73723s.mo53501b();
                    this.f73720p.mo53501b();
                    this.f73719o.mo53501b();
                    this.f73718n.mo53501b();
                    this.f73722r.mo53501b();
                    this.f73714j.mo53501b();
                    C25478i.C25484f c = this.f73706b.mo52715c(uVar.f72154a.f72183g);
                    c.mo52792u("dex\n035\u0000".getBytes("UTF-8"));
                    c.mo52793v(uVar.f72173t);
                    c.mo52792u(uVar.f72174u);
                    c.mo52793v(uVar.f72175v);
                    c.mo52793v(112);
                    c.mo52793v(305419896);
                    c.mo52793v(uVar.f72176w);
                    c.mo52793v(uVar.f72177x);
                    c.mo52793v(uVar.f72161h.f72183g);
                    c.mo52793v(uVar.f72155b.f72182f);
                    c.mo52793v(uVar.f72155b.mo52764a() ? uVar.f72155b.f72183g : 0);
                    c.mo52793v(uVar.f72156c.f72182f);
                    c.mo52793v(uVar.f72156c.mo52764a() ? uVar.f72156c.f72183g : 0);
                    c.mo52793v(uVar.f72157d.f72182f);
                    c.mo52793v(uVar.f72157d.mo52764a() ? uVar.f72157d.f72183g : 0);
                    c.mo52793v(uVar.f72158e.f72182f);
                    c.mo52793v(uVar.f72158e.mo52764a() ? uVar.f72158e.f72183g : 0);
                    c.mo52793v(uVar.f72159f.f72182f);
                    c.mo52793v(uVar.f72159f.mo52764a() ? uVar.f72159f.f72183g : 0);
                    c.mo52793v(uVar.f72160g.f72182f);
                    c.mo52793v(uVar.f72160g.mo52764a() ? uVar.f72160g.f72183g : 0);
                    c.mo52793v(uVar.f72178y);
                    c.mo52793v(uVar.f72179z);
                    C25478i.C25484f c2 = this.f73706b.mo52715c(uVar.f72161h.f72183g);
                    int i = 0;
                    for (C25499u.C25500a a : uVar.f72172s) {
                        if (a.mo52764a()) {
                            i++;
                        }
                    }
                    c2.mo52793v(i);
                    for (C25499u.C25500a aVar6 : uVar.f72172s) {
                        if (aVar6.mo52764a()) {
                            c2.mo52795x(aVar6.f72180d);
                            c2.mo52795x(0);
                            c2.mo52793v(aVar6.f72182f);
                            c2.mo52793v(aVar6.f72183g);
                        }
                    }
                    C25478i iVar = this.f73706b;
                    iVar.mo52715c(12).mo52792u(iVar.mo52714b(true));
                    C25478i.C25484f c3 = iVar.mo52715c(8);
                    Adler32 adler32 = new Adler32();
                    byte[] bArr2 = new byte[8192];
                    ByteBuffer duplicate = iVar.f72127c.duplicate();
                    duplicate.limit(duplicate.capacity());
                    duplicate.position(12);
                    while (duplicate.hasRemaining()) {
                        int min = Math.min(8192, duplicate.remaining());
                        duplicate.get(bArr2, 0, min);
                        adler32.update(bArr2, 0, min);
                    }
                    c3.mo52793v((int) adler32.getValue());
                    outputStream.write(this.f73706b.f72127c.array());
                    outputStream.flush();
                    return;
                }
                throw new IOException(String.format("old dex signature mismatch! expected: %s, actual: %s", new Object[]{Arrays.toString(b), Arrays.toString(bArr)}));
            }
            throw new IllegalArgumentException("patch file is null.");
        }
        throw new IOException("failed to compute old dex's signature.");
    }
}
