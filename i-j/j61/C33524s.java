package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49676h92;
import te3.C49817i92;

/* renamed from: j61.s */
public final class C33524s extends C117747y {

    /* renamed from: d */
    public C47350c f90772d;

    /* renamed from: e */
    public C11385n f90773e;

    /* renamed from: f */
    public final String f90774f = "MicroMsg.NetSceneGetEmotionStoreRecList";

    /* renamed from: g */
    public final int f90775g = 1;

    /* renamed from: h */
    public final C1311n f90776h;

    /* renamed from: j61.s$a */
    public static final class C33525a implements C1311n {

        /* renamed from: d */
        public final /* synthetic */ C33524s f90777d;

        public C33525a(C33524s sVar) {
            this.f90777d = sVar;
        }

        /* JADX WARNING: type inference failed for: r9v11, types: [pe3.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGYNetEnd(int r5, int r6, int r7, java.lang.String r8, com.tencent.p014mm.network.C114799u r9, byte[] r10) {
            /*
                r4 = this;
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_STORE_REC_LIST_LAST_UPDATE_TIME_LONG
                j61.s r9 = r4.f90777d
                java.lang.String r9 = r9.f90774f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "ErrType: "
                r10.append(r0)
                r10.append(r6)
                java.lang.String r0 = ", errCode:"
                r10.append(r0)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                if (r6 != 0) goto L_0x003a
                if (r7 != 0) goto L_0x003a
                f40.o r9 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r9 = r9.mo121142i()
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r10 = java.lang.Long.valueOf(r0)
                r9.mo119677K(r5, r10)
                goto L_0x0055
            L_0x003a:
                f40.o r9 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r9 = r9.mo121142i()
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 28800000(0x1b77400, double:1.42290906E-316)
                long r0 = r0 - r2
                r2 = 600000(0x927c0, double:2.964394E-318)
                long r0 = r0 + r2
                java.lang.Long r10 = java.lang.Long.valueOf(r0)
                r9.mo119677K(r5, r10)
            L_0x0055:
                if (r7 != 0) goto L_0x00a4
                j61.s r5 = r4.f90777d
                java.lang.String r5 = r5.f90774f
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "insertCache, type:"
                r9.append(r10)
                j61.s r10 = r4.f90777d
                int r10 = r10.f90775g
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                java.lang.Class<aq.g> r5 = p441aq.C92054g.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                aq.g r5 = (p441aq.C92054g) r5
                r5.getClass()
                com.tencent.mm.storage.w2 r5 = com.tencent.p014mm.storage.C30790w2.m39221h()
                boolean[] r9 = r5.f82769a
                monitor-enter(r9)
                wh3.w r5 = r5.f82775g     // Catch:{ all -> 0x00a1 }
                monitor-exit(r9)     // Catch:{ all -> 0x00a1 }
                j61.s r9 = r4.f90777d
                int r10 = r9.f90775g
                ob0.c r9 = r9.f90772d
                r0 = 0
                if (r9 != 0) goto L_0x0092
                goto L_0x009d
            L_0x0092:
                ob0.c$d r9 = r9.f127056b
                pe3.a r9 = r9.f127083a
                boolean r1 = r9 instanceof te3.C49817i92
                if (r1 == 0) goto L_0x009d
                r0 = r9
                te3.i92 r0 = (te3.C49817i92) r0
            L_0x009d:
                r5.mo61548jo(r10, r0)
                goto L_0x00a4
            L_0x00a1:
                r5 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00a1 }
                throw r5
            L_0x00a4:
                if (r6 == 0) goto L_0x00b3
                r5 = 4
                if (r6 == r5) goto L_0x00b3
                j61.s r5 = r4.f90777d
                ob0.n r9 = r5.f90773e
                if (r9 == 0) goto L_0x00b2
                r9.onSceneEnd(r6, r7, r8, r5)
            L_0x00b2:
                return
            L_0x00b3:
                j61.s r5 = r4.f90777d
                ob0.n r9 = r5.f90773e
                if (r9 == 0) goto L_0x00bc
                r9.onSceneEnd(r6, r7, r8, r5)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j61.C33524s.C33525a.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
        }
    }

    public C33524s() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49676h92();
        bVar.f127067b = new C49817i92();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getstorereclist";
        bVar.f127069d = 6910;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90772d = bVar.mo72403a();
        this.f90776h = new C33525a(this);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90773e = nVar;
        C47350c cVar = this.f90772d;
        C49676h92 h922 = null;
        C47465a aVar = cVar != null ? cVar.f127055a.f127080a : null;
        if (aVar instanceof C49676h92) {
            h922 = (C49676h92) aVar;
        }
        if (h922 == null) {
            Log.m105924i(this.f90774f, "doScene failed, GetStoreRecListRequest null");
        }
        return dispatch(gVar, this.f90772d, this.f90776h);
    }

    public int getType() {
        return 6910;
    }
}
