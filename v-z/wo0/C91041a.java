package wo0;

import android.util.Pair;
import lp3.C88629c;
import ob0.C117747y;
import ob0.C89132b;
import te3.C90446wm2;

/* renamed from: wo0.a */
public class C91041a {

    /* renamed from: wo0.a$a */
    public class C91042a implements C88629c.C88630a<C89132b.C89134c<C90446wm2>> {

        /* renamed from: a */
        public final /* synthetic */ Pair f261187a;

        /* renamed from: b */
        public final /* synthetic */ C89132b f261188b;

        public C91042a(C91041a aVar, Pair pair, C89132b bVar) {
            this.f261187a = pair;
            this.f261188b = bVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(0, 0, (String) null, (C90446wm2) this.f261187a.first, (C117747y) null, this.f261188b);
        }
    }

    /* renamed from: wo0.a$b */
    public class C91043b implements C88629c.C88630a<C89132b.C89134c<C90446wm2>> {

        /* renamed from: a */
        public final /* synthetic */ C89132b f261189a;

        public C91043b(C91041a aVar, C89132b bVar) {
            this.f261189a = bVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(3, 99999999, "Async Launch Blocked", null, (C117747y) null, this.f261189a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nr3.C89059e<ob0.C89132b.C89134c<te3.C90446wm2>> mo125107a(te3.C90444vm2 r20, boolean r21, ob0.C89132b r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = r2.f259880d
            te3.p45 r0 = r2.f259881e
            int r5 = r0.f259733f
            te3.u55 r0 = r2.f259884h
            int r6 = r0.f259849d
            java.lang.Class<ki0.e> r0 = ki0.C33910e.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            ki0.e r0 = (ki0.C33910e) r0
            r0.getClass()
            java.lang.String r7 = "MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage"
            r11 = 4
            r13 = 0
            r14 = 2
            r15 = 1
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x009f }
            ki0.f r12 = new ki0.f     // Catch:{ Exception -> 0x009f }
            r12.<init>()     // Catch:{ Exception -> 0x009f }
            r12.field_appId = r4     // Catch:{ Exception -> 0x009f }
            r12.field_scene = r5     // Catch:{ Exception -> 0x009f }
            java.lang.String[] r9 = new java.lang.String[r13]     // Catch:{ Exception -> 0x009f }
            boolean r0 = r0.get(r12, r9)     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "found info with appId(%s) scene(%d), [%d, %d]"
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x009f }
            r9[r13] = r4     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x009f }
            r9[r15] = r10     // Catch:{ Exception -> 0x009f }
            r18 = r9
            long r8 = r12.field_startTime     // Catch:{ Exception -> 0x009f }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x009f }
            r18[r14] = r8     // Catch:{ Exception -> 0x009f }
            long r8 = r12.field_endTime     // Catch:{ Exception -> 0x009f }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x009f }
            r9 = 3
            r18[r9] = r8     // Catch:{ Exception -> 0x009f }
            r8 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r8)     // Catch:{ Exception -> 0x009f }
            long r8 = r12.field_startTime     // Catch:{ Exception -> 0x009f }
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0093
            long r8 = r12.field_endTime     // Catch:{ Exception -> 0x009f }
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0093
            te3.wm2 r0 = new te3.wm2     // Catch:{ Exception -> 0x009f }
            r0.<init>()     // Catch:{ Exception -> 0x009f }
            byte[] r8 = r12.field_launchProtoBlob     // Catch:{ Exception -> 0x009f }
            r0.parseFrom(r8)     // Catch:{ Exception -> 0x009f }
            te3.au r8 = r0.f259923e     // Catch:{ Exception -> 0x009f }
            pe3.b r8 = r8.f130770d     // Catch:{ Exception -> 0x009f }
            byte[] r8 = r8.f257327a     // Catch:{ Exception -> 0x009f }
            int r8 = r8.length     // Catch:{ Exception -> 0x009f }
            if (r8 <= 0) goto L_0x0084
            long r8 = r12.field_reportId     // Catch:{ Exception -> 0x009f }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x009f }
            android.util.Pair r0 = android.util.Pair.create(r0, r8)     // Catch:{ Exception -> 0x009f }
            goto L_0x00ba
        L_0x0084:
            java.lang.String r0 = "found into with appId(%s) scene(%d), but jsapi_control_bytes invalid"
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x009f }
            r8[r13] = r4     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x009f }
            r8[r15] = r9     // Catch:{ Exception -> 0x009f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r8)     // Catch:{ Exception -> 0x009f }
        L_0x0093:
            r7 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r7 = 0
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            goto L_0x00ba
        L_0x009f:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r13] = r4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r15] = r9
            java.lang.String r9 = "get with appId(%s) scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r9, r8)
            r7 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r7 = 0
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
        L_0x00ba:
            java.lang.Object r7 = r0.first
            java.lang.String r8 = "MicroMsg.AppBrand.CgiLaunchSimpleIntercepor"
            if (r7 == 0) goto L_0x00e8
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r13] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r15] = r4
            java.lang.String r4 = "before run, get issued data by appId(%s) scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r2)
            ii0.a r2 = ii0.C87732a.INSTANCE
            java.lang.Object r4 = r0.second
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r6 = 106(0x6a, double:5.24E-322)
            r2.mo122145b(r4, r6)
            wo0.a$a r2 = new wo0.a$a
            r2.<init>(r1, r0, r3)
            nr3.e r0 = nr3.C89060f.m111325d(r2)
            return r0
        L_0x00e8:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r13] = r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r0[r15] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r14] = r6
            int r2 = r2.f259888o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 3
            r0[r6] = r2
            java.lang.String r2 = "run() appId[%s], scene[%d], libVersion[%d] performanceLevel[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
            if (r21 != 0) goto L_0x0149
            java.lang.Class<ki0.b> r0 = ki0.C33909b.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            ki0.b r0 = (ki0.C33909b) r0
            java.lang.String r2 = "appId"
            android.util.Pair r0 = r0.mo59361jo(r2, r4, r14, r5)
            java.lang.Object r2 = r0.first
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0149
            ii0.a r2 = ii0.C87732a.INSTANCE
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6 = 168(0xa8, float:2.35E-43)
            r2.mo122144a(r0, r6)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r15] = r2
            java.lang.String r2 = "async launch with appid(%s) scene(%d) blocked"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
            wo0.a$b r0 = new wo0.a$b
            r0.<init>(r1, r3)
            nr3.e r0 = nr3.C89060f.m111325d(r0)
            return r0
        L_0x0149:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wo0.C91041a.mo125107a(te3.vm2, boolean, ob0.b):nr3.e");
    }
}
