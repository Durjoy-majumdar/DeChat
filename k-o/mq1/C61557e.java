package mq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import u60.C65222f;
import up1.C37556t;
import up1.C37557u;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: mq1.e */
public final class C61557e {

    /* renamed from: f */
    public static final C61557e f174962f = new C61557e();

    /* renamed from: a */
    public C65222f<C61560g> f174963a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "uni_action_like_post_quene"));

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C61552a> f174964b;

    /* renamed from: c */
    public final ConcurrentHashMap<Long, ConcurrentHashMap<C34637b, C61564i>> f174965c;

    /* renamed from: d */
    public final HashMap<Long, C37556t> f174966d;

    /* renamed from: e */
    public final Runnable f174967e;

    /* renamed from: mq1.e$a */
    public interface C34636a {
    }

    /* renamed from: mq1.e$b */
    public static final class C34637b {

        /* renamed from: a */
        public final long f93146a;

        /* renamed from: b */
        public final int f93147b;

        public C34637b(long j, int i) {
            this.f93146a = j;
            this.f93147b = i;
        }

        public boolean equals(Object obj) {
            C34637b bVar = obj instanceof C34637b ? (C34637b) obj : null;
            return bVar != null && bVar.f93146a == this.f93146a && bVar.f93147b == this.f93147b;
        }

        public int hashCode() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f93146a);
            sb.append('_');
            sb.append(this.f93147b);
            return sb.toString().hashCode();
        }
    }

    /* renamed from: mq1.e$c */
    public static final class C61558c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61557e f174968d;

        public C61558c(C61557e eVar) {
            this.f174968d = eVar;
        }

        public final void run() {
            this.f174968d.mo86495d();
        }
    }

    public C61557e() {
        try {
            FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class);
            finderCommonFeatureService.getClass();
            C86709a0.m107523b().mo121108c();
            C37557u uVar = finderCommonFeatureService.f157776C;
            uVar = uVar == null ? new C37557u(finderCommonFeatureService.mo76790Np()) : uVar;
            finderCommonFeatureService.f157776C = uVar;
            Iterator it = ((ArrayList) uVar.mo61205jo()).iterator();
            while (it.hasNext()) {
                C37556t tVar = (C37556t) it.next();
                this.f174966d.put(Long.valueOf(tVar.field_localId), tVar);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MusicUni.FinderLikeActionMgr", th, "restoreLocalLikeFeed", new Object[0]);
        }
        this.f174964b = new ConcurrentLinkedQueue<>();
        this.f174965c = new ConcurrentHashMap<>();
        this.f174966d = new HashMap<>();
        this.f174967e = new C61558c(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo86492a(long r5, sq1.C64147b r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "commentObj"
            gy3.C87412m.m108594g(r7, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            int r5 = r7.getLikeCount()
            return r5
        L_0x0010:
            int r0 = r7.getLikeFlag()
            r1 = 1
            if (r0 != r1) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99211K1
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r1) goto L_0x0056
            r2.getClass()
            int r2 = up1.C37521f.f99260Q
            if (r2 != r1) goto L_0x0056
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<mq1.e$b, mq1.i>> r8 = r4.f174965c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r8.get(r5)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            if (r5 == 0) goto L_0x0078
            mq1.e$b r6 = new mq1.e$b
            long r2 = r7.mo88875m2()
            r6.<init>(r2, r1)
            java.lang.Object r5 = r5.get(r6)
            mq1.i r5 = (mq1.C61564i) r5
            if (r5 == 0) goto L_0x0078
            boolean r5 = r5.f174977e
            goto L_0x0079
        L_0x0056:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<mq1.e$b, mq1.i>> r2 = r4.f174965c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r2.get(r5)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            if (r5 == 0) goto L_0x0078
            mq1.e$b r6 = new mq1.e$b
            long r2 = r7.mo88875m2()
            r6.<init>(r2, r8)
            java.lang.Object r5 = r5.get(r6)
            mq1.i r5 = (mq1.C61564i) r5
            if (r5 == 0) goto L_0x0078
            boolean r5 = r5.f174977e
            goto L_0x0079
        L_0x0078:
            r5 = r0
        L_0x0079:
            if (r0 == 0) goto L_0x0083
            if (r0 == r5) goto L_0x0083
            int r5 = r7.getLikeCount()
            int r5 = r5 - r1
            return r5
        L_0x0083:
            if (r0 != 0) goto L_0x008d
            if (r0 == r5) goto L_0x008d
            int r5 = r7.getLikeCount()
            int r5 = r5 + r1
            return r5
        L_0x008d:
            int r5 = r7.getLikeCount()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mq1.C61557e.mo86492a(long, sq1.b, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86493b(long r10, sq1.C64147b r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "commentObj"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0015
            int r10 = r12.getLikeFlag()
            if (r10 != r1) goto L_0x0014
            r0 = 1
        L_0x0014:
            return r0
        L_0x0015:
            int r2 = r12.getLikeFlag()
            if (r2 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            java.lang.String r2 = ""
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99211K1
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 32
            java.lang.String r6 = " get from cache "
            if (r4 == r1) goto L_0x0075
            r3.getClass()
            int r3 = up1.C37521f.f99260Q
            if (r3 != r1) goto L_0x0075
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<mq1.e$b, mq1.i>> r3 = r9.f174965c
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r3 = r3.get(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L_0x00ad
            mq1.e$b r4 = new mq1.e$b
            long r7 = r12.mo88875m2()
            r4.<init>(r7, r1)
            java.lang.Object r1 = r3.get(r4)
            mq1.i r1 = (mq1.C61564i) r1
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1.f174977e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            boolean r1 = r1.f174977e
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            goto L_0x00ad
        L_0x0075:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<mq1.e$b, mq1.i>> r1 = r9.f174965c
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            java.lang.Object r1 = r1.get(r3)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L_0x00ad
            mq1.e$b r3 = new mq1.e$b
            long r7 = r12.mo88875m2()
            r3.<init>(r7, r13)
            java.lang.Object r1 = r1.get(r3)
            mq1.i r1 = (mq1.C61564i) r1
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1.f174977e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            boolean r1 = r1.f174977e
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
        L_0x00ad:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "isCommentLike test "
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = " commentObj:"
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = " cache:"
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = " likeFlag:"
            r1.append(r10)
            int r10 = r12.getLikeFlag()
            r1.append(r10)
            java.lang.String r10 = " scene:"
            r1.append(r10)
            r1.append(r13)
            java.lang.String r10 = " result:"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "MicroMsg.MusicUni.FinderLikeActionMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mq1.C61557e.mo86493b(long, sq1.b, int):boolean");
    }

    /* renamed from: c */
    public final void mo86494c(C61564i iVar) {
        C87412m.m108594g(iVar, "action");
        ConcurrentHashMap concurrentHashMap = this.f174965c.get(Long.valueOf(iVar.f174979g));
        if (concurrentHashMap != null) {
            C34637b bVar = new C34637b(iVar.f174976d.mo88875m2(), iVar.f174980h);
            C61564i iVar2 = (C61564i) concurrentHashMap.get(bVar);
            if (iVar2 != null) {
                if (BuildInfo.DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeLikeCommentCache ");
                    sb.append(iVar);
                    sb.append(" result ");
                    sb.append(iVar.f174953b >= iVar2.f174953b);
                    Log.m105924i("MicroMsg.MusicUni.FinderLikeActionMgr", sb.toString());
                }
                if (iVar.f174953b >= iVar2.f174953b) {
                    concurrentHashMap.remove(bVar);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo86495d() {
        if (this.f174964b.size() > 0) {
            C61552a poll = this.f174964b.poll();
            poll.getClass();
            boolean z = poll.f174952a < 2 && C31543z5.m39451a() - poll.f174953b <= ((long) 1200000);
            Log.m105924i("MicroMsg.MusicUni.FinderLikeActionMgr", "tryNext isValid:" + z + " action:" + poll + " size:" + this.f174964b.size());
            if (!z) {
                mo86495d();
            } else {
                this.f174963a.mo89349c(new C61560g(poll), new C61559f(this, poll));
            }
        }
    }
}
