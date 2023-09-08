package xz3;

import java.io.FilterInputStream;
import java.io.InputStream;
import xz3.C26607p;

/* renamed from: xz3.a */
public abstract class C26583a implements C26607p {

    /* renamed from: xz3.a$a */
    public static abstract class C26584a<BuilderType extends C26584a> implements C26607p.C26608a {
        /* renamed from: b */
        public abstract BuilderType mo52861M(C26586d dVar, C26589f fVar);

        /* renamed from: xz3.a$a$a */
        public static final class C23155a extends FilterInputStream {

            /* renamed from: d */
            public int f66529d;

            public C23155a(InputStream inputStream, int i) {
                super(inputStream);
                this.f66529d = i;
            }

            public int available() {
                return Math.min(super.available(), this.f66529d);
            }

            public int read() {
                if (this.f66529d <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f66529d--;
                }
                return read;
            }

            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f66529d));
                if (skip >= 0) {
                    this.f66529d = (int) (((long) this.f66529d) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f66529d;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f66529d -= read;
                }
                return read;
            }
        }
    }
}
