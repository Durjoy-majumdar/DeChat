package i24;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import d24.C106982e;
import d24.C20387b0;
import d24.C20399d0;
import d24.C20414o;
import d24.C20419r;
import d24.C20421s;
import d24.C20425v;
import d24.C20431y;
import e24.C20507a;
import e24.C20509c;
import g24.C20783c;
import g24.C20788g;
import gy3.C87412m;
import h24.C20886c;
import h24.C20887e;
import h24.C20890h;
import h24.C20891i;
import h24.C20893k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import o24.C21754b0;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21766h;
import o24.C21767i;
import o24.C21768j;
import o24.C21773n;
import o24.C21777r;

/* renamed from: i24.a */
public final class C21046a implements C20886c {

    /* renamed from: a */
    public final C20425v f59539a;

    /* renamed from: b */
    public final C20788g f59540b;

    /* renamed from: c */
    public final C21768j f59541c;

    /* renamed from: d */
    public final C21767i f59542d;

    /* renamed from: e */
    public int f59543e = 0;

    /* renamed from: f */
    public long f59544f = 262144;

    /* renamed from: i24.a$b */
    public abstract class C21048b implements C21760d0 {

        /* renamed from: d */
        public final C21773n f59545d;

        /* renamed from: e */
        public boolean f59546e;

        /* renamed from: f */
        public long f59547f = 0;

        public C21048b(C21047a aVar) {
            this.f59545d = new C21773n(C21046a.this.f59541c.mo32328f());
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            try {
                long L0 = C21046a.this.f59541c.mo32327L0(hVar, j);
                if (L0 > 0) {
                    this.f59547f += L0;
                }
                return L0;
            } catch (IOException e) {
                mo32769a(false, e);
                throw e;
            }
        }

        /* renamed from: a */
        public final void mo32769a(boolean z, IOException iOException) {
            C21046a aVar = C21046a.this;
            int i = aVar.f59543e;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo32765g(this.f59545d);
                    C21046a aVar2 = C21046a.this;
                    aVar2.f59543e = 6;
                    C20788g gVar = aVar2.f59540b;
                    if (gVar != null) {
                        gVar.mo32488i(!z, aVar2, this.f59547f, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + C21046a.this.f59543e);
            }
        }

        /* renamed from: f */
        public C21762e0 mo32328f() {
            return this.f59545d;
        }
    }

    /* renamed from: i24.a$c */
    public final class C21049c implements C21754b0 {

        /* renamed from: d */
        public final C21773n f59549d;

        /* renamed from: e */
        public boolean f59550e;

        public C21049c() {
            this.f59549d = new C21773n(C21046a.this.f59542d.mo32770f());
        }

        public synchronized void close() {
            if (!this.f59550e) {
                this.f59550e = true;
                C21046a.this.f59542d.mo34126W("0\r\n\r\n");
                C21046a.this.mo32765g(this.f59549d);
                C21046a.this.f59543e = 3;
            }
        }

        /* renamed from: f */
        public C21762e0 mo32770f() {
            return this.f59549d;
        }

        public synchronized void flush() {
            if (!this.f59550e) {
                C21046a.this.f59542d.flush();
            }
        }

        /* renamed from: x */
        public void mo32354x(C21766h hVar, long j) {
            if (this.f59550e) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C21046a.this.f59542d.mo34115A0(j);
                C21046a.this.f59542d.mo34126W(APLogFileUtil.SEPARATOR_LINE);
                C21046a.this.f59542d.mo32354x(hVar, j);
                C21046a.this.f59542d.mo34126W(APLogFileUtil.SEPARATOR_LINE);
            }
        }
    }

    /* renamed from: i24.a$d */
    public class C21050d extends C21048b {

        /* renamed from: h */
        public final C20421s f59552h;

        /* renamed from: i */
        public long f59553i = -1;

        /* renamed from: j */
        public boolean f59554j = true;

        public C21050d(C20421s sVar) {
            super((C21047a) null);
            this.f59552h = sVar;
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f59546e) {
                throw new IllegalStateException("closed");
            } else if (!this.f59554j) {
                return -1;
            } else {
                long j2 = this.f59553i;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C21046a.this.f59541c.mo34127Y();
                    }
                    try {
                        this.f59553i = C21046a.this.f59541c.mo34123P();
                        String trim = C21046a.this.f59541c.mo34127Y().trim();
                        if (this.f59553i < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f59553i + trim + FastJsonResponse.QUOTE);
                        }
                        if (this.f59553i == 0) {
                            this.f59554j = false;
                            C21046a aVar = C21046a.this;
                            C20887e.m22968d(aVar.f59539a.f57295n, this.f59552h, aVar.mo32767i());
                            mo32769a(true, (IOException) null);
                        }
                        if (!this.f59554j) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long L0 = super.mo32327L0(hVar, Math.min(j, this.f59553i));
                if (L0 != -1) {
                    this.f59553i -= L0;
                    return L0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo32769a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() {
            boolean z;
            if (!this.f59546e) {
                if (this.f59554j) {
                    try {
                        z = C20509c.m22211q(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z = false;
                    }
                    if (!z) {
                        mo32769a(false, (IOException) null);
                    }
                }
                this.f59546e = true;
            }
        }
    }

    /* renamed from: i24.a$e */
    public final class C21051e implements C21754b0 {

        /* renamed from: d */
        public final C21773n f59556d;

        /* renamed from: e */
        public boolean f59557e;

        /* renamed from: f */
        public long f59558f;

        public C21051e(long j) {
            this.f59556d = new C21773n(C21046a.this.f59542d.mo32770f());
            this.f59558f = j;
        }

        public void close() {
            if (!this.f59557e) {
                this.f59557e = true;
                if (this.f59558f <= 0) {
                    C21046a.this.mo32765g(this.f59556d);
                    C21046a.this.f59543e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: f */
        public C21762e0 mo32770f() {
            return this.f59556d;
        }

        public void flush() {
            if (!this.f59557e) {
                C21046a.this.f59542d.flush();
            }
        }

        /* renamed from: x */
        public void mo32354x(C21766h hVar, long j) {
            if (!this.f59557e) {
                long j2 = hVar.f61695e;
                byte[] bArr = C20509c.f57729a;
                if ((0 | j) < 0 || 0 > j2 || j2 - 0 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (j <= this.f59558f) {
                    C21046a.this.f59542d.mo32354x(hVar, j);
                    this.f59558f -= j;
                } else {
                    throw new ProtocolException("expected " + this.f59558f + " bytes but received " + j);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: i24.a$f */
    public class C21052f extends C21048b {

        /* renamed from: h */
        public long f59560h;

        public C21052f(C21046a aVar, long j) {
            super((C21047a) null);
            this.f59560h = j;
            if (j == 0) {
                mo32769a(true, (IOException) null);
            }
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f59546e) {
                long j2 = this.f59560h;
                if (j2 == 0) {
                    return -1;
                }
                long L0 = super.mo32327L0(hVar, Math.min(j2, j));
                if (L0 != -1) {
                    long j3 = this.f59560h - L0;
                    this.f59560h = j3;
                    if (j3 == 0) {
                        mo32769a(true, (IOException) null);
                    }
                    return L0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo32769a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            boolean z;
            if (!this.f59546e) {
                if (this.f59560h != 0) {
                    try {
                        z = C20509c.m22211q(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z = false;
                    }
                    if (!z) {
                        mo32769a(false, (IOException) null);
                    }
                }
                this.f59546e = true;
            }
        }
    }

    /* renamed from: i24.a$g */
    public class C21053g extends C21048b {

        /* renamed from: h */
        public boolean f59561h;

        public C21053g(C21046a aVar) {
            super((C21047a) null);
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f59546e) {
                throw new IllegalStateException("closed");
            } else if (this.f59561h) {
                return -1;
            } else {
                long L0 = super.mo32327L0(hVar, j);
                if (L0 != -1) {
                    return L0;
                }
                this.f59561h = true;
                mo32769a(true, (IOException) null);
                return -1;
            }
        }

        public void close() {
            if (!this.f59546e) {
                if (!this.f59561h) {
                    mo32769a(false, (IOException) null);
                }
                this.f59546e = true;
            }
        }
    }

    public C21046a(C20425v vVar, C20788g gVar, C21768j jVar, C21767i iVar) {
        this.f59539a = vVar;
        this.f59540b = gVar;
        this.f59541c = jVar;
        this.f59542d = iVar;
    }

    /* renamed from: a */
    public C21754b0 mo32595a(C20431y yVar, long j) {
        if ("chunked".equalsIgnoreCase(yVar.mo31967a("Transfer-Encoding"))) {
            if (this.f59543e == 1) {
                this.f59543e = 2;
                return new C21049c();
            }
            throw new IllegalStateException("state: " + this.f59543e);
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f59543e == 1) {
            this.f59543e = 2;
            return new C21051e(j);
        } else {
            throw new IllegalStateException("state: " + this.f59543e);
        }
    }

    /* renamed from: b */
    public void mo32596b() {
        this.f59542d.flush();
    }

    /* renamed from: c */
    public void mo32597c() {
        this.f59542d.flush();
    }

    public void cancel() {
        C20783c b = this.f59540b.mo32481b();
        if (b != null) {
            C20509c.m22198d(b.f58697d);
        }
    }

    /* renamed from: d */
    public void mo32599d(C20431y yVar) {
        Proxy.Type type = this.f59540b.mo32481b().f58696c.f57200b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.f57341b);
        sb.append(' ');
        if (!yVar.f57340a.f57265a.equals(C113600ck.f339986i) && type == Proxy.Type.HTTP) {
            sb.append(yVar.f57340a);
        } else {
            sb.append(C20891i.m22977a(yVar.f57340a));
        }
        sb.append(" HTTP/1.1");
        mo32768j(yVar.f57342c, sb.toString());
    }

    /* renamed from: e */
    public C20387b0.C20388a mo32600e(boolean z) {
        int i = this.f59543e;
        if (i == 1 || i == 3) {
            try {
                String V = this.f59541c.mo34125V(this.f59544f);
                this.f59544f -= (long) V.length();
                C20893k a = C20893k.m22984a(V);
                C20387b0.C20388a aVar = new C20387b0.C20388a();
                aVar.f57139b = a.f59035a;
                aVar.f57140c = a.f59036b;
                aVar.f57141d = a.f59037c;
                aVar.f57143f = mo32767i().mo31928e();
                if (z && a.f59036b == 100) {
                    return null;
                }
                if (a.f59036b == 100) {
                    this.f59543e = 3;
                    return aVar;
                }
                this.f59543e = 4;
                return aVar;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f59540b);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f59543e);
        }
    }

    /* renamed from: f */
    public C20399d0 mo32601f(C20387b0 b0Var) {
        C20788g gVar = this.f59540b;
        C20414o oVar = gVar.f58727f;
        C106982e eVar = gVar.f58726e;
        oVar.getClass();
        String b = b0Var.mo31886b("Content-Type");
        if (!C20887e.m22966b(b0Var)) {
            return new C20890h(b, 0, C21777r.m24935b(mo32766h(0)));
        }
        if ("chunked".equalsIgnoreCase(b0Var.mo31886b("Transfer-Encoding"))) {
            C20421s sVar = b0Var.f57125d.f57340a;
            if (this.f59543e == 4) {
                this.f59543e = 5;
                return new C20890h(b, -1, C21777r.m24935b(new C21050d(sVar)));
            }
            throw new IllegalStateException("state: " + this.f59543e);
        }
        long a = C20887e.m22965a(b0Var);
        if (a != -1) {
            return new C20890h(b, a, C21777r.m24935b(mo32766h(a)));
        }
        if (this.f59543e == 4) {
            C20788g gVar2 = this.f59540b;
            if (gVar2 != null) {
                this.f59543e = 5;
                gVar2.mo32485f();
                return new C20890h(b, -1, C21777r.m24935b(new C21053g(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f59543e);
    }

    /* renamed from: g */
    public void mo32765g(C21773n nVar) {
        C21762e0 e0Var = nVar.f61703e;
        C21762e0 e0Var2 = C21762e0.f61689d;
        C87412m.m108594g(e0Var2, "delegate");
        nVar.f61703e = e0Var2;
        e0Var.mo34102a();
        e0Var.mo34103b();
    }

    /* renamed from: h */
    public C21760d0 mo32766h(long j) {
        if (this.f59543e == 4) {
            this.f59543e = 5;
            return new C21052f(this, j);
        }
        throw new IllegalStateException("state: " + this.f59543e);
    }

    /* renamed from: i */
    public C20419r mo32767i() {
        C20419r.C20420a aVar = new C20419r.C20420a();
        while (true) {
            String V = this.f59541c.mo34125V(this.f59544f);
            this.f59544f -= (long) V.length();
            if (V.length() == 0) {
                return new C20419r(aVar);
            }
            ((C20425v.C20426a) C20507a.f57727a).getClass();
            aVar.mo31934a(V);
        }
    }

    /* renamed from: j */
    public void mo32768j(C20419r rVar, String str) {
        if (this.f59543e == 0) {
            this.f59542d.mo34126W(str).mo34126W(APLogFileUtil.SEPARATOR_LINE);
            int length = rVar.f57262a.length / 2;
            for (int i = 0; i < length; i++) {
                this.f59542d.mo34126W(rVar.mo31927d(i)).mo34126W(": ").mo34126W(rVar.mo31930f(i)).mo34126W(APLogFileUtil.SEPARATOR_LINE);
            }
            this.f59542d.mo34126W(APLogFileUtil.SEPARATOR_LINE);
            this.f59543e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f59543e);
    }
}
