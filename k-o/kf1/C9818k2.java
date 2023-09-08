package kf1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7642k;
import gy3.C87412m;
import ht1.C60172g4;
import up1.C37521f;

/* renamed from: kf1.k2 */
public abstract class C9818k2 {

    /* renamed from: a */
    public final MMActivity f30356a;

    /* renamed from: b */
    public boolean f30357b;

    /* renamed from: c */
    public long f30358c;

    /* renamed from: d */
    public int f30359d;

    /* renamed from: e */
    public FeedData f30360e;

    /* renamed from: f */
    public boolean f30361f;

    /* renamed from: g */
    public RecyclerView f30362g;

    /* renamed from: h */
    public final int f30363h = C37521f.f99228M.mo60266n().intValue();

    /* renamed from: i */
    public final C58555d f30364i = new C9819a(this);

    /* renamed from: kf1.k2$a */
    public static final class C9819a extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C9818k2 f30365g;

        public C9819a(C9818k2 k2Var) {
            this.f30365g = k2Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r0 = (ef1.C7642k) r7;
         */
        /* renamed from: B1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2331B1(ef1.C7637b r7) {
            /*
                r6 = this;
                java.lang.String r0 = "ev"
                gy3.C87412m.m108594g(r7, r0)
                kf1.k2 r0 = r6.f30365g
                r0.getClass()
                boolean r0 = r7 instanceof ef1.C7642k
                if (r0 == 0) goto L_0x0041
                r0 = r7
                ef1.k r0 = (ef1.C7642k) r0
                int r1 = r0.f25951b
                if (r1 == 0) goto L_0x0022
                r2 = 5
                if (r1 == r2) goto L_0x0022
                r2 = 4
                if (r1 == r2) goto L_0x0022
                r2 = 7
                if (r1 == r2) goto L_0x0022
                r2 = 10
                if (r1 != r2) goto L_0x0041
            L_0x0022:
                kf1.k2 r7 = r6.f30365g
                long r1 = r7.f30358c
                long r3 = r0.f25958i
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0070
                r1 = 0
                r7.f30361f = r1
                r7.mo2499b(r0)
                kf1.k2 r7 = r6.f30365g
                long r1 = r0.f25958i
                r7.f30358c = r1
                int r1 = r0.f25959j
                r7.f30359d = r1
                com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f25960k
                r7.f30360e = r0
                goto L_0x0070
            L_0x0041:
                boolean r0 = r7 instanceof df1.C58259c.C58260a
                if (r0 == 0) goto L_0x0070
                df1.c$a r7 = (df1.C58259c.C58260a) r7
                int r0 = r7.f166811b
                r1 = 2
                if (r0 != r1) goto L_0x0054
                kf1.k2 r0 = r6.f30365g
                long r1 = r7.f166817h
                r0.mo2502e(r1)
                goto L_0x0070
            L_0x0054:
                r1 = 3
                if (r0 != r1) goto L_0x0070
                int r0 = r7.f166815f
                kf1.k2 r1 = r6.f30365g
                int r2 = r1.f30363h
                if (r0 != r2) goto L_0x0065
                long r2 = r7.f166817h
                r1.mo2501d(r2)
                goto L_0x0070
            L_0x0065:
                boolean r3 = r1.f30357b
                if (r3 != 0) goto L_0x0070
                if (r0 <= r2) goto L_0x0070
                long r2 = r7.f166817h
                r1.mo2501d(r2)
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9818k2.C9819a.mo2331B1(ef1.b):void");
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            r2 = ((df1.C58259c.C58260a) r3).f166811b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r2 = ((ef1.C7642k) r3).f25951b;
         */
        /* renamed from: z1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2333z1(ef1.C58553c r2, ef1.C7637b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "dispatcher"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r2 = "event"
                gy3.C87412m.m108594g(r3, r2)
                boolean r2 = r3 instanceof ef1.C7642k
                if (r2 == 0) goto L_0x0022
                r2 = r3
                ef1.k r2 = (ef1.C7642k) r2
                int r2 = r2.f25951b
                if (r2 == 0) goto L_0x0030
                r0 = 5
                if (r2 == r0) goto L_0x0030
                r0 = 4
                if (r2 == r0) goto L_0x0030
                r0 = 7
                if (r2 == r0) goto L_0x0030
                r0 = 10
                if (r2 == r0) goto L_0x0030
            L_0x0022:
                boolean r2 = r3 instanceof df1.C58259c.C58260a
                if (r2 == 0) goto L_0x0032
                df1.c$a r3 = (df1.C58259c.C58260a) r3
                int r2 = r3.f166811b
                r3 = 2
                if (r2 == r3) goto L_0x0030
                r3 = 3
                if (r2 != r3) goto L_0x0032
            L_0x0030:
                r2 = 1
                goto L_0x0033
            L_0x0032:
                r2 = 0
            L_0x0033:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9818k2.C9819a.mo2333z1(ef1.c, ef1.b):boolean");
        }
    }

    public C9818k2(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f30356a = mMActivity;
        C37521f.f99374d.getClass();
    }

    /* renamed from: a */
    public void mo2498a(RecyclerView recyclerView) {
        this.f30362g = recyclerView;
        C58553c a = C60172g4.C60173a.m70189a((C60172g4) C39818r.f106831a.mo62444c(this.f30356a).mo62447c(C60172g4.class), 0, 1, (Object) null);
        if (a != null) {
            a.mo83450a(this.f30364i);
        }
    }

    /* renamed from: b */
    public abstract void mo2499b(C7642k kVar);

    /* renamed from: c */
    public void mo2500c() {
        C58553c a = C60172g4.C60173a.m70189a((C60172g4) C39818r.f106831a.mo62444c(this.f30356a).mo62447c(C60172g4.class), 0, 1, (Object) null);
        if (a != null) {
            a.mo83453d(this.f30364i);
        }
    }

    /* renamed from: d */
    public void mo2501d(long j) {
        this.f30357b = true;
    }

    /* renamed from: e */
    public void mo2502e(long j) {
        this.f30361f = true;
    }
}
