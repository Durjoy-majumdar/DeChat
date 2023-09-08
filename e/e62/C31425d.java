package e62;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.Future;
import ob0.C35136m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: e62.d */
public final class C31425d implements C31924c1 {

    /* renamed from: d */
    public final String f84115d = "MicroMsg.PushLoginUrlAutoLoginNewXmlReceived";

    /* renamed from: e */
    public Future<?> f84116e;

    /* renamed from: e62.d$a */
    public static final class C31426a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C31425d f84117d;

        /* renamed from: e */
        public final /* synthetic */ String f84118e;

        /* renamed from: f */
        public final /* synthetic */ String f84119f;

        /* renamed from: g */
        public final /* synthetic */ int f84120g;

        public C31426a(C31425d dVar, String str, String str2, int i) {
            this.f84117d = dVar;
            this.f84118e = str;
            this.f84119f = str2;
            this.f84120g = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
            r4 = r4.f251779b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                e62.d r0 = r7.f84117d
                java.lang.String r1 = r7.f84118e
                java.lang.String r2 = "deviceId"
                gy3.C87412m.m108593f(r1, r2)
                java.lang.String r1 = r7.f84119f
                java.lang.String r2 = "wording"
                gy3.C87412m.m108593f(r1, r2)
                int r2 = r7.f84120g
                java.lang.String r0 = r0.f84115d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "showNotify isForeground:"
                r3.append(r4)
                f40.g r4 = f40.C86709a0.m107529k()
                r5 = 0
                if (r4 == 0) goto L_0x0031
                ob0.b0 r4 = r4.f251779b
                if (r4 == 0) goto L_0x0031
                boolean r4 = r4.f256815j
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                goto L_0x0032
            L_0x0031:
                r4 = r5
            L_0x0032:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                java.nio.charset.Charset r0 = z04.C119027c.f356488a
                byte[] r1 = r1.getBytes(r0)
                java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r1, r3)
                r3 = 2
                byte[] r1 = android.util.Base64.decode(r1, r3)
                java.lang.String r4 = "decode(wording.toByteArray(), Base64.NO_WRAP)"
                gy3.C87412m.m108593f(r1, r4)
                java.lang.String r4 = new java.lang.String
                r4.<init>(r1, r0)
                f40.g r0 = f40.C86709a0.m107529k()
                r1 = 1
                r6 = 0
                if (r0 == 0) goto L_0x0068
                ob0.b0 r0 = r0.f251779b
                if (r0 == 0) goto L_0x0068
                boolean r0 = r0.f256815j
                if (r0 != r1) goto L_0x0068
                r0 = 1
                goto L_0x0069
            L_0x0068:
                r0 = 0
            L_0x0069:
                if (r0 == 0) goto L_0x00bb
                r0 = 2131756280(0x7f1004f8, float:1.9143463E38)
                if (r2 == r1) goto L_0x00a3
                if (r2 == r3) goto L_0x00a0
                r1 = 3
                if (r2 == r1) goto L_0x009c
                r1 = 6
                if (r2 == r1) goto L_0x0098
                r1 = 7
                if (r2 == r1) goto L_0x0094
                r1 = 8
                if (r2 == r1) goto L_0x0090
                r1 = 10
                if (r2 == r1) goto L_0x008c
                r1 = 13
                if (r2 == r1) goto L_0x0088
                goto L_0x00a3
            L_0x0088:
                r0 = 2131755442(0x7f1001b2, float:1.9141763E38)
                goto L_0x00a3
            L_0x008c:
                r0 = 2131756317(0x7f10051d, float:1.9143538E38)
                goto L_0x00a3
            L_0x0090:
                r0 = 2131756219(0x7f1004bb, float:1.914334E38)
                goto L_0x00a3
            L_0x0094:
                r0 = 2131755438(0x7f1001ae, float:1.9141755E38)
                goto L_0x00a3
            L_0x0098:
                r0 = 2131755435(0x7f1001ab, float:1.914175E38)
                goto L_0x00a3
            L_0x009c:
                r0 = 2131756392(0x7f100568, float:1.914369E38)
                goto L_0x00a3
            L_0x00a0:
                r0 = 2131756325(0x7f100525, float:1.9143554E38)
            L_0x00a3:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
                if (r0 == 0) goto L_0x00b3
                r1 = -1
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r0.setColorFilter(r1, r2)
            L_0x00b3:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                nj3.C100124v0.m130821c(r0, r4, r1, r6, r5)
                goto L_0x00c7
            L_0x00bb:
                zt3.t r0 = zt3.C119157j.f356862d
                e62.e r1 = new e62.e
                r1.<init>(r4)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r1)
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e62.C31425d.C31426a.run():void");
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (C87412m.m108589b("PushLoginUrlAutoLogin", str) && map != null) {
            String nullAsNil = Util.nullAsNil(map.get(".sysmsg.PushLoginUrlAutoLogin.deviceid"));
            String nullAsNil2 = Util.nullAsNil(map.get(".sysmsg.PushLoginUrlAutoLogin.wording"));
            int safeParseInt = Util.safeParseInt(map.get(".sysmsg.PushLoginUrlAutoLogin.icontype"));
            String str2 = this.f84115d;
            Log.m105924i(str2, "receive xml, deviceid:" + nullAsNil + ", wording:" + nullAsNil2 + ", iconType:" + safeParseInt);
            Future<?> future = this.f84116e;
            if (future != null) {
                future.cancel(true);
            }
            C119179t tVar = C119157j.f356862d;
            C31426a aVar2 = new C31426a(this, nullAsNil, nullAsNil2, safeParseInt);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f84116e = jVar.mo183892w(aVar2, 1000, false);
        }
    }
}
