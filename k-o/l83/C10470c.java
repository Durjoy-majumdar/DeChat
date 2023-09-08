package l83;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.C49354ez1;
import te3.C49489fz1;

/* renamed from: l83.c */
public final class C10470c {

    /* renamed from: a */
    public static final ConcurrentHashMap<Integer, C10471a> f31704a = new ConcurrentHashMap<>();

    /* renamed from: l83.c$a */
    public static final class C10471a {

        /* renamed from: a */
        public final C117747y f31705a;

        /* renamed from: b */
        public final C10469b f31706b;

        public C10471a(C117747y yVar, C10469b bVar) {
            C87412m.m108594g(yVar, "netSceneBase");
            C87412m.m108594g(bVar, "callback");
            this.f31705a = yVar;
            this.f31706b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10471a)) {
                return false;
            }
            C10471a aVar = (C10471a) obj;
            return C87412m.m108589b(this.f31705a, aVar.f31705a) && C87412m.m108589b(this.f31706b, aVar.f31706b);
        }

        public int hashCode() {
            return (this.f31705a.hashCode() * 31) + this.f31706b.hashCode();
        }

        public String toString() {
            return "GetDownloadAppInfoRequest(netSceneBase=" + this.f31705a + ", callback=" + this.f31706b + ')';
        }
    }

    /* renamed from: l83.c$b */
    public static final class C10472b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ String f31707d;

        public C10472b(String str) {
            this.f31707d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
            if ((r9 == null || r9.length() == 0) == false) goto L_0x008f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1488a(int r6, int r7, java.lang.String r8, ob0.C47350c r9, ob0.C117747y r10) {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getDownloadAppInfo callback errType: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r1 = ", errCode: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r1 = ", errMsg: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.GetDownloadAppInfoManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, l83.c$a> r0 = l83.C10470c.f31704a
                r1 = 0
                if (r10 == 0) goto L_0x0030
                int r10 = r10.hashCode()
                goto L_0x0031
            L_0x0030:
                r10 = 0
            L_0x0031:
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r10 = r0.remove(r10)
                l83.c$a r10 = (l83.C10470c.C10471a) r10
                if (r10 == 0) goto L_0x00a9
                java.lang.String r0 = r5.f31707d
                if (r6 != 0) goto L_0x00a4
                if (r7 != 0) goto L_0x00a4
                r2 = 0
                if (r9 == 0) goto L_0x004b
                ob0.c$d r9 = r9.f127056b
                pe3.a r9 = r9.f127083a
                goto L_0x004c
            L_0x004b:
                r9 = r2
            L_0x004c:
                boolean r3 = r9 instanceof te3.C49489fz1
                if (r3 == 0) goto L_0x0053
                r2 = r9
                te3.fz1 r2 = (te3.C49489fz1) r2
            L_0x0053:
                if (r2 == 0) goto L_0x009e
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, l83.c$a> r9 = l83.C10470c.f31704a
                te3.q50 r9 = r2.f133751d
                r3 = 1
                if (r9 != 0) goto L_0x005d
                goto L_0x008e
            L_0x005d:
                java.lang.String r4 = r9.f140149i
                if (r4 == 0) goto L_0x006a
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r4 = 0
                goto L_0x006b
            L_0x006a:
                r4 = 1
            L_0x006b:
                if (r4 != 0) goto L_0x008e
                java.lang.String r4 = r9.f140145e
                if (r4 == 0) goto L_0x007a
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0078
                goto L_0x007a
            L_0x0078:
                r4 = 0
                goto L_0x007b
            L_0x007a:
                r4 = 1
            L_0x007b:
                if (r4 != 0) goto L_0x008e
                java.lang.String r9 = r9.f140148h
                if (r9 == 0) goto L_0x008a
                int r9 = r9.length()
                if (r9 != 0) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                r9 = 0
                goto L_0x008b
            L_0x008a:
                r9 = 1
            L_0x008b:
                if (r9 != 0) goto L_0x008e
                goto L_0x008f
            L_0x008e:
                r3 = 0
            L_0x008f:
                if (r3 == 0) goto L_0x009e
                l83.b r6 = r10.f31706b
                te3.q50 r7 = r2.f133751d
                java.lang.String r8 = "resp.download_app_info"
                gy3.C87412m.m108593f(r7, r8)
                r6.mo6904a(r7)
                goto L_0x00a9
            L_0x009e:
                l83.b r9 = r10.f31706b
                r9.mo6905b(r0, r6, r7, r8)
                goto L_0x00a9
            L_0x00a4:
                l83.b r9 = r10.f31706b
                r9.mo6905b(r0, r6, r7, r8)
            L_0x00a9:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l83.C10470c.C10472b.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
        }
    }

    /* renamed from: a */
    public static final int m10400a(String str, C10469b bVar) {
        C87412m.m108594g(str, "downloadAppId");
        C87412m.m108594g(bVar, "getDownloadAppInfoListener");
        C49354ez1 ez12 = new C49354ez1();
        ez12.f133208d = str;
        ez12.f133209e = BuildInfo.IS_ARM64 ? 2 : 1;
        Log.m105924i("MicroMsg.GetDownloadAppInfoManager", "getDownloadAppInfo downloadAppId: " + ez12.f133208d + ", system_version_type: " + ez12.f133209e);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = ez12;
        bVar2.f127067b = new C49489fz1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/get_download_app_info";
        bVar2.f127069d = 27841;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C117747y f = C89144l0.m111430f(bVar2.mo72403a(), new C10472b(str), false, (C9487b) null);
        C87412m.m108593f(f, "downloadAppId: String, g…      }\n        }, false)");
        f31704a.put(Integer.valueOf(f.hashCode()), new C10471a(f, bVar));
        return f.hashCode();
    }
}
