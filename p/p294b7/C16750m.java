package p294b7;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p333e8.C20541m;

/* renamed from: b7.m */
public interface C16750m {

    /* renamed from: b7.m$a */
    public static final class C16751a {

        /* renamed from: a */
        public final int f45266a;

        /* renamed from: b */
        public final byte[] f45267b;

        /* renamed from: c */
        public final int f45268c;

        /* renamed from: d */
        public final int f45269d;

        public C16751a(int i, byte[] bArr, int i2, int i3) {
            this.f45266a = i;
            this.f45267b = bArr;
            this.f45268c = i2;
            this.f45269d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16751a.class != obj.getClass()) {
                return false;
            }
            C16751a aVar = (C16751a) obj;
            return this.f45266a == aVar.f45266a && this.f45268c == aVar.f45268c && this.f45269d == aVar.f45269d && Arrays.equals(this.f45267b, aVar.f45267b);
        }

        public int hashCode() {
            return (((((this.f45266a * 31) + Arrays.hashCode(this.f45267b)) * 31) + this.f45268c) * 31) + this.f45269d;
        }
    }

    /* renamed from: a */
    void mo17741a(Format format);

    /* renamed from: b */
    void mo17742b(C20541m mVar, int i);

    /* renamed from: c */
    int mo17743c(C16742f fVar, int i, boolean z);

    /* renamed from: d */
    void mo17744d(long j, int i, int i2, int i3, C16751a aVar);
}
