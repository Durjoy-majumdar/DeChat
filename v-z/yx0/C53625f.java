package yx0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import te3.C49754hu2;
import yx0.C53613a;
import zt3.C119157j;

/* renamed from: yx0.f */
public final class C53625f implements C53613a {

    /* renamed from: a */
    public static final C53625f f150666a = new C53625f();

    /* renamed from: b */
    public static C53613a.C53615b f150667b = new C53613a.C53615b();

    /* renamed from: c */
    public static ArrayList<C53613a.C53614a> f150668c = new ArrayList<>();

    /* renamed from: d */
    public static boolean f150669d;

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C49754hu2> f150670e = new ConcurrentHashMap<>();

    /* renamed from: yx0.f$a */
    public static final class C53626a implements Runnable {

        /* renamed from: d */
        public static final C53626a f150671d = new C53626a();

        public final void run() {
            C53613a.C53615b bVar = C53625f.f150667b;
            bVar.f150652a = "";
            bVar.f150653b = "";
            bVar.f150654c = -1;
        }
    }

    /* renamed from: yx0.f$b */
    public static final class C53627b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TransferRequestInfo f150672d;

        /* renamed from: e */
        public final /* synthetic */ C53613a.C53614a f150673e;

        public C53627b(TransferRequestInfo transferRequestInfo, C53613a.C53614a aVar) {
            this.f150672d = transferRequestInfo;
            this.f150673e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
            if ((r1.f150653b.length() > 0) != false) goto L_0x0076;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                yx0.f r0 = yx0.C53625f.f150666a
                com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r10.f150672d
                boolean r0 = r0.f109031n
                yx0.a$b r1 = yx0.C53625f.f150667b
                java.lang.String r1 = r1.f150652a
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0014
                r1 = 1
                goto L_0x0015
            L_0x0014:
                r1 = 0
            L_0x0015:
                r4 = 0
                java.lang.String r5 = "MicroMsg.TransferRequestTokenManager"
                if (r1 == 0) goto L_0x001c
                goto L_0x008e
            L_0x001c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "getLocalH5AuthToken h5AuthToken: "
                r1.append(r6)
                yx0.a$b r6 = yx0.C53625f.f150667b
                java.lang.String r6 = r6.f150652a
                r1.append(r6)
                java.lang.String r6 = ", pubKeyToken: "
                r1.append(r6)
                yx0.a$b r6 = yx0.C53625f.f150667b
                java.lang.String r6 = r6.f150653b
                r1.append(r6)
                java.lang.String r6 = ", expiredTime: "
                r1.append(r6)
                yx0.a$b r6 = yx0.C53625f.f150667b
                int r6 = r6.f150654c
                r1.append(r6)
                java.lang.String r6 = ", now: "
                r1.append(r6)
                long r6 = java.lang.System.currentTimeMillis()
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                yx0.a$b r1 = yx0.C53625f.f150667b
                java.lang.String r6 = r1.f150652a
                int r6 = r6.length()
                if (r6 <= 0) goto L_0x0064
                r6 = 1
                goto L_0x0065
            L_0x0064:
                r6 = 0
            L_0x0065:
                if (r6 == 0) goto L_0x0089
                if (r0 == 0) goto L_0x0076
                java.lang.String r0 = r1.f150653b
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0073
                r0 = 1
                goto L_0x0074
            L_0x0073:
                r0 = 0
            L_0x0074:
                if (r0 == 0) goto L_0x0089
            L_0x0076:
                int r0 = r1.f150654c
                if (r0 <= 0) goto L_0x0089
                long r0 = (long) r0
                long r6 = java.lang.System.currentTimeMillis()
                r8 = 1000(0x3e8, float:1.401E-42)
                long r8 = (long) r8
                long r6 = r6 / r8
                int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x0089
                r0 = 1
                goto L_0x008a
            L_0x0089:
                r0 = 0
            L_0x008a:
                if (r0 == 0) goto L_0x008e
                yx0.a$b r4 = yx0.C53625f.f150667b
            L_0x008e:
                if (r4 == 0) goto L_0x0096
                yx0.a$a r0 = r10.f150673e
                r0.mo74239a(r4)
                return
            L_0x0096:
                java.util.ArrayList<yx0.a$a> r0 = yx0.C53625f.f150668c
                yx0.a$a r1 = r10.f150673e
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L_0x00a7
                java.util.ArrayList<yx0.a$a> r0 = yx0.C53625f.f150668c
                yx0.a$a r1 = r10.f150673e
                r0.add(r1)
            L_0x00a7:
                boolean r0 = yx0.C53625f.f150669d
                if (r0 != 0) goto L_0x010c
                yx0.C53625f.f150669d = r3
                com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r0 = r10.f150672d
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r4 = r0.f109025e
                r1[r2] = r4
                java.lang.String r4 = r0.f109026f
                r1[r3] = r4
                te3.qv3 r3 = r0.f109030j
                r4 = 2
                r1[r4] = r3
                java.lang.String r3 = "[transferRequest] getToken url: %s, scope: %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r3, r1)
                te3.ie2 r1 = new te3.ie2
                r1.<init>()
                java.lang.String r3 = r0.f109025e
                r1.f135254e = r3
                r3 = -520089598(0xffffffffe1001002, float:-1.4764605E20)
                r1.f135253d = r3
                java.lang.String r3 = r0.f109026f
                r1.f135256g = r3
                te3.qv3 r0 = r0.f109030j
                if (r0 != 0) goto L_0x00de
                te3.qv3 r0 = yx0.C16079j.m14971a()
            L_0x00de:
                r1.f135255f = r0
                com.tencent.mm.network.b r0 = com.tencent.p014mm.network.C114766b.f344135e
                r0.mo174417b()
                te3.gj3 r0 = r0.f344136a
                r1.f135257h = r0
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                r0.f127066a = r1
                te3.je2 r1 = new te3.je2
                r1.<init>()
                r0.f127067b = r1
                java.lang.String r1 = "/cgi-bin/micromsg-bin/h5auth"
                r0.f127068c = r1
                r1 = 5805(0x16ad, float:8.135E-42)
                r0.f127069d = r1
                r0.f127070e = r2
                r0.f127071f = r2
                ob0.c r0 = r0.mo72403a()
                yx0.g r1 = yx0.C53628g.f150674d
                ob0.C89144l0.m111429e(r0, r1, r2)
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.C53625f.C53627b.run():void");
        }
    }

    /* renamed from: d */
    public static final boolean m60159d(C53613a.C53615b bVar, TransferRequestInfo transferRequestInfo) {
        C87412m.m108594g(transferRequestInfo, "requestInfo");
        if (bVar != null) {
            if (bVar.f150652a.length() > 0) {
                if (!transferRequestInfo.f109031n) {
                    return true;
                }
                if (bVar.f150653b.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo74237a() {
        Log.m105924i("MicroMsg.TransferRequestTokenManager", "clearToken");
        ((C119157j) C119157j.f356862d).mo183876g(C53626a.f150671d, "TransferRequestTokenManager");
    }

    /* renamed from: b */
    public void mo74238b(TransferRequestInfo transferRequestInfo, C53613a.C53614a aVar) {
        C87412m.m108594g(transferRequestInfo, "requestInfo");
        C87412m.m108594g(aVar, "getTokenCallback");
        ((C119157j) C119157j.f356862d).mo183876g(new C53627b(transferRequestInfo, aVar), "TransferRequestTokenManager");
    }

    /* renamed from: c */
    public C49754hu2 mo74240c(String str) {
        if (str == null) {
            return null;
        }
        return f150670e.get(str);
    }
}
