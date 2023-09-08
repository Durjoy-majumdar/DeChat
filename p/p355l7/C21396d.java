package p355l7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p396x6.C22993a;
import p396x6.C23010j;

/* renamed from: l7.d */
public final class C21396d extends C22993a implements Handler.Callback {

    /* renamed from: o */
    public final C21393b f60527o;

    /* renamed from: p */
    public final C21397a f60528p;

    /* renamed from: q */
    public final Handler f60529q;

    /* renamed from: r */
    public final C23010j f60530r;

    /* renamed from: s */
    public final C21395c f60531s;

    /* renamed from: t */
    public final Metadata[] f60532t;

    /* renamed from: u */
    public final long[] f60533u;

    /* renamed from: v */
    public int f60534v;

    /* renamed from: w */
    public int f60535w;

    /* renamed from: x */
    public C21392a f60536x;

    /* renamed from: y */
    public boolean f60537y;

    /* renamed from: l7.d$a */
    public interface C21397a {
        /* renamed from: g */
        void mo33444g(Metadata metadata);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21396d(C21397a aVar, Looper looper) {
        super(4);
        C21393b bVar = C21393b.f60525a;
        aVar.getClass();
        this.f60528p = aVar;
        this.f60529q = looper == null ? null : new Handler(looper, this);
        this.f60527o = bVar;
        this.f60530r = new C23010j();
        this.f60531s = new C21395c();
        this.f60532t = new Metadata[5];
        this.f60533u = new long[5];
    }

    /* renamed from: a */
    public int mo33309a(Format format) {
        return this.f60527o.mo33522a(format) ? 4 : 0;
    }

    /* renamed from: b */
    public boolean mo33310b() {
        return this.f60537y;
    }

    /* renamed from: g */
    public void mo33311g(long j, long j2) {
        if (!this.f60537y && this.f60535w < 5) {
            this.f60531s.mo35592f();
            if (mo36250z(this.f60530r, this.f60531s, false) == -4) {
                if (this.f60531s.mo36910g(4)) {
                    this.f60537y = true;
                } else if (!this.f60531s.mo36911h()) {
                    C21395c cVar = this.f60531s;
                    cVar.f60526i = this.f60530r.f66173a.f45767C;
                    cVar.f67260f.flip();
                    int i = (this.f60534v + this.f60535w) % 5;
                    this.f60532t[i] = this.f60536x.mo33521a(this.f60531s);
                    this.f60533u[i] = this.f60531s.f67261g;
                    this.f60535w++;
                }
            }
        }
        if (this.f60535w > 0) {
            long[] jArr = this.f60533u;
            int i2 = this.f60534v;
            if (jArr[i2] <= j) {
                Metadata metadata = this.f60532t[i2];
                Handler handler = this.f60529q;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.f60528p.mo33444g(metadata);
                }
                Metadata[] metadataArr = this.f60532t;
                int i3 = this.f60534v;
                metadataArr[i3] = null;
                this.f60534v = (i3 + 1) % 5;
                this.f60535w--;
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f60528p.mo33444g((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: t */
    public void mo32386t() {
        Arrays.fill(this.f60532t, (Object) null);
        this.f60534v = 0;
        this.f60535w = 0;
        this.f60536x = null;
    }

    /* renamed from: v */
    public void mo32388v(long j, boolean z) {
        Arrays.fill(this.f60532t, (Object) null);
        this.f60534v = 0;
        this.f60535w = 0;
        this.f60537y = false;
    }

    /* renamed from: y */
    public void mo32391y(Format[] formatArr, long j) {
        this.f60536x = this.f60527o.mo33523b(formatArr[0]);
    }
}
