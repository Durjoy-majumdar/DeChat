package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.y25;

/* renamed from: u73.k0 */
public class C101978k0 extends C101969b implements C1311n {

    /* renamed from: f */
    public C11385n f300274f;

    /* renamed from: g */
    public C47350c f300275g;

    /* renamed from: h */
    public y25 f300276h;

    /* JADX WARNING: Can't wrap try/catch for region: R(15:2|(1:4)(1:5)|(1:7)(1:8)|9|(2:11|12)|14|(2:16|17)|18|19|(3:22|23|20)|31|26|(1:28)|29|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneWebSuggest", r3, "decode json error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a4 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101978k0(u73.C101968a0 r9) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = r9.f300187b
            r8.f300212d = r0
            int r1 = r9.f300202q
            r8.f300213e = r1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r1 = "MicroMsg.WebSearch.NetSceneWebSuggest"
            if (r0 != 0) goto L_0x0113
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = r9.f300187b
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Constructors: query=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            int r3 = r9.f300204s
            if (r3 != r0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0037
            r3 = 1747(0x6d3, float:2.448E-42)
            r2.f127069d = r3
            java.lang.String r3 = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsuggestion"
            r2.f127068c = r3
            goto L_0x003f
        L_0x0037:
            r3 = 1161(0x489, float:1.627E-42)
            r2.f127069d = r3
            java.lang.String r3 = "/cgi-bin/mmsearch-bin/searchsuggestion"
            r2.f127068c = r3
        L_0x003f:
            te3.x25 r3 = new te3.x25
            r3.<init>()
            r2.f127066a = r3
            te3.y25 r3 = new te3.y25
            r3.<init>()
            r2.f127067b = r3
            ob0.c r2 = r2.mo72403a()
            r8.f300275g = r2
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.x25 r2 = (te3.x25) r2
            java.lang.String r3 = r9.f300187b
            r2.f299826e = r3
            int r3 = r9.f300189d
            long r5 = (long) r3
            r2.f299828g = r5
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r4)
            r2.f299829h = r3
            int r3 = r9.f300186a
            r2.f299825d = r3
            te3.bn2 r3 = u73.C101987v0.m134273g()
            r2.f299830i = r3
            int r3 = r9.f300191f
            r2.f299832n = r3
            java.lang.String r3 = r9.f300207v
            r2.f299817A = r3
            te3.wv r3 = u73.C101987v0.m134272f()
            r2.f299823G = r3
            java.util.LinkedList<te3.hy> r3 = r9.f300200o
            r2.f299841w = r3
            te3.t25 r3 = r9.f300206u
            if (r3 == 0) goto L_0x0095
            pe3.b r5 = new pe3.b     // Catch:{ Exception -> 0x0094 }
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x0094 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0094 }
            r2.f299818B = r5     // Catch:{ Exception -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            te3.d75 r3 = r9.f300205t
            if (r3 == 0) goto L_0x00a4
            pe3.b r5 = new pe3.b     // Catch:{ IOException -> 0x00a4 }
            byte[] r3 = r3.toByteArray()     // Catch:{ IOException -> 0x00a4 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00a4 }
            r2.f299844z = r5     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x00cb }
            java.util.LinkedList<java.lang.String> r5 = r9.f300197l     // Catch:{ Exception -> 0x00cb }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00cb }
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ Exception -> 0x00cb }
            r5.<init>()     // Catch:{ Exception -> 0x00cb }
            r2.f299838t = r5     // Catch:{ Exception -> 0x00cb }
            r5 = 0
        L_0x00b3:
            int r6 = r3.length()     // Catch:{ Exception -> 0x00cb }
            if (r5 >= r6) goto L_0x00d3
            java.lang.String r6 = r3.getString(r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r7 = "UTF-8"
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r7)     // Catch:{ Exception -> 0x00cb }
            java.util.LinkedList<java.lang.String> r7 = r2.f299838t     // Catch:{ Exception -> 0x00cb }
            r7.add(r6)     // Catch:{ Exception -> 0x00cb }
            int r5 = r5 + 1
            goto L_0x00b3
        L_0x00cb:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "decode json error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r6, r5)
        L_0x00d3:
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r9.f300189d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            te3.bn2 r2 = r2.f299830i
            if (r2 == 0) goto L_0x00e3
            r4 = 1
        L_0x00e3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3[r0] = r2
            r0 = 2
            int r2 = r9.f300191f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            r0 = 3
            int r2 = r9.f300189d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            r0 = 4
            int r2 = r9.f300186a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            r0 = 5
            int r9 = r9.f300202q
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r0] = r9
            java.lang.String r9 = "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r3)
            goto L_0x0119
        L_0x0113:
            java.lang.String r9 = "keyword is unavailable"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u73.C101978k0.<init>(u73.a0):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300274f = nVar;
        return dispatch(gVar, this.f300275g, this);
    }

    public int getType() {
        return 1161;
    }

    /* renamed from: j1 */
    public String mo141491j1() {
        y25 y25 = this.f300276h;
        return y25 != null ? y25.f145094f : "";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.WebSearch.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            y25 y25 = (y25) this.f300275g.f127056b.f127083a;
            this.f300276h = y25;
            if (y25 != null) {
                Log.m105927v("MicroMsg.WebSearch.NetSceneWebSuggest", "return data\n%s", y25.f145094f);
            }
            this.f300274f.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f300274f.onSceneEnd(i2, i3, str, this);
    }
}
