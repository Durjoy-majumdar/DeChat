package com.tencent.liteav.videoconsumer.renderer;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.f */
public final class C17378f {

    /* renamed from: a */
    public long f47113a = 0;

    /* renamed from: b */
    public long f47114b = 0;

    /* renamed from: c */
    public long f47115c = 0;

    /* renamed from: d */
    public long f47116d = 0;

    /* renamed from: e */
    public long f47117e = 0;

    /* renamed from: f */
    public final long f47118f = Math.max(200, 200);

    /* renamed from: g */
    private C17379a f47119g;

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.f$a */
    public interface C17379a {
        /* renamed from: a */
        void mo20473a(long j);
    }

    public C17378f(C17379a aVar) {
        this.f47119g = aVar;
    }

    /* renamed from: a */
    public final void mo20472a(long j) {
        if (j == 0) {
            this.f47117e = 0;
            return;
        }
        long j2 = this.f47117e;
        if (j2 != 0) {
            long j3 = j - j2;
            if (j3 > this.f47118f) {
                this.f47114b++;
                C17379a aVar = this.f47119g;
                if (aVar != null) {
                    aVar.mo20473a(j3);
                }
                long j4 = this.f47115c + j3;
                this.f47115c = j4;
                if (this.f47113a < j3) {
                    this.f47113a = j3;
                }
                long j5 = this.f47114b;
                if (j5 != 0) {
                    this.f47116d = j4 / j5;
                }
            }
        }
        this.f47117e = j;
    }
}
