package u23;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import gy3.C8480h;
import gy3.C87412m;
import sp3.C110801c;

/* renamed from: u23.k */
public class C111127k extends C65003a {

    /* renamed from: o */
    public static final C111128a f332730o = new C111128a((C8480h) null);

    /* renamed from: p */
    public static final C106205q0 f332731p = new C106205q0("", 0, 0);

    /* renamed from: n */
    public final C106205q0 f332732n;

    /* renamed from: u23.k$a */
    public static final class C111128a {
        public C111128a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C111127k mo162866a(int i) {
            C111127k kVar = new C111127k(C111127k.f332731p);
            kVar.f187123c = i;
            return kVar;
        }
    }

    public C111127k(C106205q0 q0Var) {
        C87412m.m108594g(q0Var, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        this.f332732n = q0Var;
        C110801c cVar = q0Var.f316501l;
        long j = cVar.f331478p;
        if (j >= 0) {
            this.f187124d = cVar.f331466d + (j - cVar.f331464b);
        }
        long j2 = cVar.f331479q;
        if (j2 >= 0) {
            this.f187125e = cVar.f331467e + (j2 - cVar.f331465c);
        }
    }

    /* renamed from: a */
    public long mo88218a() {
        return this.f332732n.f316501l.f331465c;
    }

    /* renamed from: b */
    public float mo88219b() {
        return this.f332732n.f316501l.f331468f;
    }

    /* renamed from: c */
    public long mo88220c() {
        return this.f332732n.f316501l.f331464b;
    }

    /* renamed from: d */
    public long mo88221d() {
        return this.f332732n.f316501l.f331470h;
    }

    /* renamed from: e */
    public boolean mo88222e() {
        if (!C87412m.m108589b(this.f332732n, f332731p)) {
            return this.f332732n.f316490a.length() == 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C111127k(C110801c cVar, boolean z, boolean z2) {
        this(new C106205q0(cVar.f331482t, cVar.f331483u, 0));
        C87412m.m108594g(cVar, "originTrack");
        this.f187124d = cVar.f331466d;
        this.f187125e = cVar.f331467e - cVar.f331477o.f331495c;
        if (z) {
            this.f187124d = 0;
        }
        if (z2) {
            this.f187125e = cVar.f331470h;
        }
    }
}
