package bl1;

import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import te3.C50317lw0;
import te3.C52013xs0;
import tf1.C13914m;

/* renamed from: bl1.b */
public abstract class C39775b implements C0740i2, C39806t {

    /* renamed from: d */
    public boolean f106733d;

    /* renamed from: e */
    public C52013xs0 f106734e;

    /* renamed from: f */
    public int f106735f;

    /* renamed from: g */
    public boolean f106736g;

    /* renamed from: h */
    public boolean f106737h;

    public C39775b(boolean z, C52013xs0 xs02) {
        C87412m.m108594g(xs02, FirebaseAnalytics.C113379b.SOURCE);
        this.f106733d = z;
        this.f106734e = xs02;
    }

    /* renamed from: a */
    public String mo62407a() {
        C50317lw0 lw02 = this.f106734e.f144910o;
        String str = lw02 != null ? lw02.f137677e : null;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f134919d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62408b() {
        /*
            r1 = this;
            te3.xs0 r0 = r1.f106734e
            te3.hx0 r0 = r0.f144914s
            if (r0 == 0) goto L_0x000d
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.username
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39775b.mo62408b():java.lang.String");
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f106734e.f144903e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f134919d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62409d() {
        /*
            r1 = this;
            te3.xs0 r0 = r1.f106734e
            te3.hx0 r0 = r0.f144902d
            if (r0 == 0) goto L_0x000d
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.username
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39775b.mo62409d():java.lang.String");
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C39775b) {
            C39775b bVar = (C39775b) mVar;
            return (bVar.f106733d != this.f106733d || !C87412m.m108589b(bVar.f106734e.f144904f, this.f106734e.f144904f) || !C87412m.m108589b(bVar.f106734e.f144915t, this.f106734e.f144915t)) ? -1 : 0;
        }
    }

    public long getItemId() {
        return this.f106734e.f144913r;
    }

    /* renamed from: i */
    public String mo62406i() {
        return "msgType:" + this.f106734e.f144903e + ", seq:" + this.f106734e.f144913r + ", likeCount:" + this.f106735f + ", selfLike:" + this.f106736g + ", fromUsername:" + mo62408b() + ", toUsername:" + mo62409d();
    }
}
