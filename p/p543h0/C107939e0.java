package p543h0;

import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.tav.core.ExportErrorStatus;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p436a1.C103272w;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: h0.e0 */
public final class C107939e0 {

    /* renamed from: a */
    public static final C107939e0 f323209a = new C107939e0();

    /* renamed from: b */
    public static final float f323210b = ((float) 1);

    /* renamed from: c */
    public static final float f323211c = ((float) 52);

    /* renamed from: h0.e0$a */
    public static final class C107940a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107939e0 f323212d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f323213e;

        /* renamed from: f */
        public final /* synthetic */ float f323214f;

        /* renamed from: g */
        public final /* synthetic */ long f323215g;

        /* renamed from: h */
        public final /* synthetic */ int f323216h;

        /* renamed from: i */
        public final /* synthetic */ int f323217i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107940a(C107939e0 e0Var, C65503j jVar, float f, long j, int i, int i2) {
            super(2);
            this.f323212d = e0Var;
            this.f323213e = jVar;
            this.f323214f = f;
            this.f323215g = j;
            this.f323216h = i;
            this.f323217i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f323212d.mo158354a(this.f323213e, this.f323214f, this.f323215g, (C108504h) obj, this.f323216h | 1, this.f323217i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo158354a(C65503j jVar, float f, long j, C108504h hVar, int i, int i2) {
        int i3;
        C65503j jVar2;
        float f2;
        long j2;
        long j3;
        float f3;
        float f4;
        C65503j jVar3;
        int i4;
        int i5 = i;
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(910934799);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i5 | 6;
            jVar2 = jVar;
        } else if ((i5 & 14) == 0) {
            jVar2 = jVar;
            i3 = (z.mo51619x(jVar2) ? 4 : 2) | i5;
        } else {
            jVar2 = jVar;
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (z.mo51588h(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i5 & C22657f.CTRL_INDEX) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) != 0 || !z.mo51594k(j2)) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= LVBuffer.MAX_STRING_LENGTH;
        } else {
            if ((i5 & 7168) == 0) {
                i3 |= z.mo51619x(this) ? 2048 : 1024;
            }
        }
        if ((i3 & 5851) != 1170 || !z.mo51575a()) {
            z.mo51559J();
            if ((i5 & 1) == 0 || z.mo51582e()) {
                if (i6 != 0) {
                    int i7 = C65503j.f188489K0;
                    jVar3 = C65503j.C65504a.f188490d;
                } else {
                    jVar3 = jVar2;
                }
                if ((i2 & 2) != 0) {
                    f4 = f323210b;
                    i3 &= ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS;
                } else {
                    f4 = f2;
                }
                if ((i2 & 4) != 0) {
                    j3 = C103272w.m136780b(((C103272w) z.mo51598m(C107958j.f323310a)).f304517a, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i3 &= -897;
                    z.mo51555G();
                    C107969n.m146258a(jVar3, j3, f4, 0.0f, z, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & C22657f.CTRL_INDEX), 8);
                    f3 = f4;
                    jVar2 = jVar3;
                }
            } else {
                z.mo51581d();
                if ((i2 & 2) != 0) {
                    i3 &= ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                jVar3 = jVar2;
                f4 = f2;
            }
            j3 = j2;
            z.mo51555G();
            C107969n.m146258a(jVar3, j3, f4, 0.0f, z, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & C22657f.CTRL_INDEX), 8);
            f3 = f4;
            jVar2 = jVar3;
        } else {
            z.mo51581d();
            f3 = f2;
            j3 = j2;
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107940a(this, jVar2, f3, j3, i, i2));
        }
    }
}
