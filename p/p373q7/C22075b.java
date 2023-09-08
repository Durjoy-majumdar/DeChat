package p373q7;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p300c8.C79946g;
import p300c8.C79950j;
import p333e8.C20551y;
import p380r7.C22202c;

/* renamed from: q7.b */
public abstract class C22075b extends C22074a {

    /* renamed from: i */
    public byte[] f62462i;

    /* renamed from: j */
    public int f62463j;

    /* renamed from: k */
    public volatile boolean f62464k;

    public C22075b(C79946g gVar, C79950j jVar, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(gVar, jVar, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f62462i = bArr;
    }

    /* renamed from: a */
    public final void mo17945a() {
        try {
            this.f62461h.mo110126b(this.f62454a);
            int i = 0;
            this.f62463j = 0;
            while (i != -1 && !this.f62464k) {
                byte[] bArr = this.f62462i;
                if (bArr == null) {
                    this.f62462i = new byte[16384];
                } else if (bArr.length < this.f62463j + 16384) {
                    this.f62462i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f62461h.mo110127c(this.f62462i, this.f62463j, 16384);
                if (i != -1) {
                    this.f62463j += i;
                }
            }
            if (!this.f62464k) {
                ((C22202c.C22203a) this).f62863m = Arrays.copyOf(this.f62462i, this.f62463j);
            }
        } finally {
            C20551y.m22314d(this.f62461h);
        }
    }

    /* renamed from: b */
    public final void mo17946b() {
        this.f62464k = true;
    }

    /* renamed from: c */
    public final boolean mo17947c() {
        return this.f62464k;
    }

    /* renamed from: d */
    public long mo35171d() {
        return (long) this.f62463j;
    }
}
