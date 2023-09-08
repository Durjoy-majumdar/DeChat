package p334ef;

import com.tencent.thumbplayer.api.TPOptionalID;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p338ff.C20706a;
import p338ff.C20707b;
import p338ff.C20708c;
import p342gf.C20831a;

/* renamed from: ef.e */
public class C20597e extends C20596d {

    /* renamed from: b */
    public final OutputStream f57990b;

    /* renamed from: c */
    public int f57991c = 0;

    /* renamed from: d */
    public final ByteArrayOutputStream f57992d = new ByteArrayOutputStream();

    /* renamed from: ef.e$a */
    public class C20598a extends C20594b {

        /* renamed from: b */
        public final int f57993b;

        /* renamed from: c */
        public final int f57994c;

        public C20598a(int i, int i2, long j) {
            super((C20594b) null);
            this.f57993b = i;
            this.f57994c = i2;
        }

        /* renamed from: a */
        public void mo32244a() {
            try {
                C20597e.this.f57990b.write(this.f57993b);
                C20831a.m22853i(C20597e.this.f57990b, this.f57994c);
                C20597e eVar = C20597e.this;
                C20831a.m22853i(eVar.f57990b, eVar.f57992d.size());
                C20597e eVar2 = C20597e.this;
                eVar2.f57990b.write(eVar2.f57992d.toByteArray());
                C20597e.this.f57992d.reset();
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: b */
        public void mo32245b(int i, C20707b bVar) {
            try {
                C20597e.this.f57992d.write(i);
                C20597e.this.f57992d.write(bVar.f58556a);
                if (i == 1) {
                    C20597e eVar = C20597e.this;
                    C20831a.m22852h(eVar.f57992d, (long) eVar.f57991c);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: c */
        public void mo32242c(C20707b bVar, int i, C20707b bVar2, C20707b bVar3, int i2, C20706a[] aVarArr, C20706a[] aVarArr2) {
            try {
                C20597e.this.f57992d.write(32);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20597e.this.f57992d.write(bVar2.f58556a);
                C20597e.this.f57992d.write(bVar3.f58556a);
                C20597e eVar = C20597e.this;
                C20831a.m22852h(eVar.f57992d, (long) (eVar.f57991c << 2));
                C20831a.m22853i(C20597e.this.f57992d, i2);
                C20831a.m22855k(C20597e.this.f57992d, 0);
                C20831a.m22855k(C20597e.this.f57992d, aVarArr.length);
                for (C20706a aVar : aVarArr) {
                    C20597e.this.f57992d.write(aVar.f58554b.f58556a);
                    C20597e.this.f57992d.write(aVar.f58553a);
                    C20831a.m22856l(C20597e.this.f57992d, aVar.f58555c);
                }
                C20831a.m22855k(C20597e.this.f57992d, aVarArr2.length);
                for (C20706a aVar2 : aVarArr2) {
                    C20597e.this.f57992d.write(aVar2.f58554b.f58556a);
                    C20597e.this.f57992d.write(aVar2.f58553a);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: d */
        public void mo32246d(int i, C20707b bVar) {
            try {
                C20597e.this.f57992d.write(254);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20597e.this.f57992d.write(bVar.f58556a);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: e */
        public void mo32237e(C20707b bVar, int i, C20707b bVar2, byte[] bArr) {
            try {
                C20597e.this.f57992d.write(33);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20597e.this.f57992d.write(bVar2.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, bArr.length);
                C20597e.this.f57992d.write(bArr);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: f */
        public void mo32247f(C20707b bVar, int i, int i2) {
            try {
                C20597e.this.f57992d.write(3);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20831a.m22853i(C20597e.this.f57992d, i2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: g */
        public void mo32248g(C20707b bVar, int i, int i2) {
            try {
                C20597e.this.f57992d.write(2);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20831a.m22853i(C20597e.this.f57992d, i2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: h */
        public void mo32249h(C20707b bVar, int i, int i2) {
            try {
                C20597e.this.f57992d.write(TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20831a.m22853i(C20597e.this.f57992d, i2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: i */
        public void mo32250i(C20707b bVar, int i) {
            try {
                C20597e.this.f57992d.write(4);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: j */
        public void mo32251j(C20707b bVar, int i, int i2, C20707b bVar2, byte[] bArr) {
            try {
                C20597e.this.f57992d.write(34);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20831a.m22853i(C20597e.this.f57992d, i2);
                C20597e.this.f57992d.write(bVar2.f58556a);
                C20597e eVar = C20597e.this;
                eVar.f57992d.write(bArr, 0, i2 * eVar.f57991c);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: k */
        public void mo32238k(int i, C20707b bVar, int i2, int i3, int i4, byte[] bArr) {
            try {
                C20597e.this.f57992d.write(i);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i2);
                C20831a.m22853i(C20597e.this.f57992d, i3);
                C20597e.this.f57992d.write(i4);
                C20708c a = C20708c.m22681a(i4);
                C20597e eVar = C20597e.this;
                int i5 = eVar.f57991c;
                int i6 = a.f58560e;
                if (i6 != 0) {
                    i5 = i6;
                }
                eVar.f57992d.write(bArr, 0, i3 * i5);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: l */
        public void mo32252l(C20707b bVar, int i) {
            try {
                C20597e.this.f57992d.write(6);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        /* renamed from: m */
        public void mo32253m(C20707b bVar, int i, int i2) {
            try {
                C20597e.this.f57992d.write(8);
                C20597e.this.f57992d.write(bVar.f58556a);
                C20831a.m22853i(C20597e.this.f57992d, i);
                C20831a.m22853i(C20597e.this.f57992d, i2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public C20597e(OutputStream outputStream) {
        super((C20596d) null);
        this.f57990b = outputStream;
    }

    /* renamed from: a */
    public void mo32243a() {
        try {
            this.f57990b.flush();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public void mo32239b(String str, int i, long j) {
        if (i <= 0 || i >= 1073741823) {
            throw new IOException("bad idSize: " + i);
        }
        try {
            this.f57991c = i;
            OutputStream outputStream = this.f57990b;
            outputStream.write(str.getBytes(Charset.forName("UTF-8")));
            outputStream.write(0);
            C20831a.m22853i(this.f57990b, i);
            C20831a.m22854j(this.f57990b, j);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: c */
    public C20594b mo32236c(int i, int i2, long j) {
        try {
            return new C20598a(i, i2, j);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: d */
    public void mo32240d(int i, C20707b bVar, int i2, C20707b bVar2, int i3, long j) {
        try {
            this.f57990b.write(2);
            C20831a.m22853i(this.f57990b, i3);
            C20831a.m22853i(this.f57990b, (int) j);
            C20831a.m22853i(this.f57990b, i);
            this.f57990b.write(bVar.f58556a);
            C20831a.m22853i(this.f57990b, i2);
            this.f57990b.write(bVar2.f58556a);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: e */
    public void mo32258e(C20707b bVar, C20707b bVar2, C20707b bVar3, C20707b bVar4, int i, int i2, int i3, long j) {
        try {
            this.f57990b.write(4);
            C20831a.m22853i(this.f57990b, i3);
            C20831a.m22853i(this.f57990b, (int) j);
            this.f57990b.write(bVar.f58556a);
            this.f57990b.write(bVar2.f58556a);
            this.f57990b.write(bVar3.f58556a);
            this.f57990b.write(bVar4.f58556a);
            C20831a.m22853i(this.f57990b, i);
            C20831a.m22853i(this.f57990b, i2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: f */
    public void mo32259f(int i, int i2, C20707b[] bVarArr, int i3, long j) {
        try {
            this.f57990b.write(5);
            C20831a.m22853i(this.f57990b, i3);
            C20831a.m22853i(this.f57990b, (int) j);
            C20831a.m22853i(this.f57990b, i);
            C20831a.m22853i(this.f57990b, i2);
            C20831a.m22853i(this.f57990b, bVarArr.length);
            for (C20707b bVar : bVarArr) {
                this.f57990b.write(bVar.f58556a);
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: g */
    public void mo32241g(C20707b bVar, String str, int i, long j) {
        try {
            this.f57990b.write(1);
            C20831a.m22853i(this.f57990b, i);
            C20831a.m22853i(this.f57990b, (int) j);
            this.f57990b.write(bVar.f58556a);
            this.f57990b.write(str.getBytes(Charset.forName("UTF-8")), 0, str.length());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    public void mo32260h(int i, int i2, long j, byte[] bArr) {
        try {
            this.f57990b.write(i);
            C20831a.m22853i(this.f57990b, i2);
            int i3 = (int) j;
            C20831a.m22853i(this.f57990b, i3);
            this.f57990b.write(bArr, 0, i3);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
