package p341g7;

import com.google.android.exoplayer2.Format;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20541m;

/* renamed from: g7.h */
public abstract class C20800h {

    /* renamed from: a */
    public final C20796d f58776a = new C20796d();

    /* renamed from: b */
    public C16750m f58777b;

    /* renamed from: c */
    public C16743g f58778c;

    /* renamed from: d */
    public C20798f f58779d;

    /* renamed from: e */
    public long f58780e;

    /* renamed from: f */
    public long f58781f;

    /* renamed from: g */
    public long f58782g;

    /* renamed from: h */
    public int f58783h;

    /* renamed from: i */
    public int f58784i;

    /* renamed from: j */
    public C20802b f58785j;

    /* renamed from: k */
    public long f58786k;

    /* renamed from: l */
    public boolean f58787l;

    /* renamed from: m */
    public boolean f58788m;

    /* renamed from: g7.h$b */
    public static class C20802b {

        /* renamed from: a */
        public Format f58789a;

        /* renamed from: b */
        public C20798f f58790b;
    }

    /* renamed from: g7.h$c */
    public static final class C20803c implements C20798f {
        public C20803c(C20801a aVar) {
        }

        /* renamed from: a */
        public C16748l mo32490a() {
            return new C16748l.C16749a(-9223372036854775807L);
        }

        /* renamed from: b */
        public long mo32491b(C16742f fVar) {
            return -1;
        }

        /* renamed from: c */
        public long mo32492c(long j) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo32501a(long j) {
        this.f58782g = j;
    }

    /* renamed from: b */
    public abstract long mo32494b(C20541m mVar);

    /* renamed from: c */
    public abstract boolean mo32495c(C20541m mVar, long j, C20802b bVar);

    /* renamed from: d */
    public void mo32496d(boolean z) {
        if (z) {
            this.f58785j = new C20802b();
            this.f58781f = 0;
            this.f58783h = 0;
        } else {
            this.f58783h = 1;
        }
        this.f58780e = -1;
        this.f58782g = 0;
    }
}
