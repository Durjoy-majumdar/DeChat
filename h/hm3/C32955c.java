package hm3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.matrix.MatrixMemoryHookResultUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64186f0;
import zt3.C119157j;

/* renamed from: hm3.c */
public final class C32955c extends C32951a {

    /* renamed from: d */
    public static final C32955c f89546d = new C32955c();

    /* renamed from: e */
    public static List<C32964i> f89547e = C64186f0.f181907d;

    /* renamed from: hm3.c$a */
    public static final class C32956a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32955c f89548d;

        /* renamed from: e */
        public final /* synthetic */ Intent f89549e;

        /* renamed from: hm3.c$a$a */
        public static final class C32957a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32955c f89550d;

            /* renamed from: e */
            public final /* synthetic */ Intent f89551e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C32957a(C32955c cVar, Intent intent) {
                super(0);
                this.f89550d = cVar;
                this.f89551e = intent;
            }

            public Object invoke() {
                C32956a.super.mo58885a(this.f89551e);
                return C13598b0.f38549a;
            }
        }

        public C32956a(C32955c cVar, Intent intent) {
            this.f89548d = cVar;
            this.f89549e = intent;
        }

        public final void run() {
            if (C32955c.f89546d.mo58888e(true)) {
                C61926c.m72668M(new C32957a(this.f89548d, this.f89549e));
            } else {
                Log.m105924i("MicroMsg.MatrixMemoryHookResultHelper", "skip start ui, no leak now");
            }
        }
    }

    /* renamed from: a */
    public void mo58885a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        ((C119157j) C119157j.f356862d).mo183884o(new C32956a(this, intent));
    }

    /* renamed from: c */
    public String mo58887c() {
        return MatrixMemoryHookResultUI.class.getName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58888e(boolean r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.MatrixMemoryHookResultHelper"
            ce2.a r1 = ce2.C28544a.INSTANCE
            java.lang.Class<ee2.b> r2 = ee2.C86511b.class
            ce2.c r1 = r1.mo56045a(r2)
            ee2.b r1 = (ee2.C86511b) r1
            r2 = 0
            if (r1 == 0) goto L_0x00a3
            com.tencent.mm.vfs.m1 r3 = ee2.C86511b.f251351n
            java.lang.String r4 = r3.mo119971i()
            com.tencent.mm.vfs.m1 r5 = ee2.C86511b.f251352o
            java.lang.String r6 = r5.mo119971i()
            r1.mo120986r(r4, r6)
            java.lang.String r1 = ee2.C86511b.f251349i
            be2.C79693c.m96810d(r1, r3)
            java.lang.String r1 = r5.mo119971i()
            java.lang.String r1 = be2.C79693c.m96811e(r1)
            if (r1 == 0) goto L_0x00a3
            sx3.f0 r3 = sx3.C64186f0.f181907d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x004e }
            r5.<init>(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "SoNativeSize"
            org.json.JSONArray r1 = r5.getJSONArray(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "JSONObject(this@transfor…JSONArray(\"SoNativeSize\")"
            gy3.C87412m.m108593f(r1, r5)     // Catch:{ all -> 0x004e }
            hm3.e r5 = new hm3.e     // Catch:{ all -> 0x004e }
            r5.<init>(r4)     // Catch:{ all -> 0x004e }
            com.tencent.p014mm.sdk.json.JSONUtils.forEach(r1, r5)     // Catch:{ all -> 0x004e }
            r3 = r4
            goto L_0x0056
        L_0x004e:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = ""
            p723vf.C118672d.m167354d(r0, r1, r4, r2)
        L_0x0056:
            f89547e = r3
            java.util.Iterator r1 = r3.iterator()
        L_0x005c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009d
            java.lang.Object r2 = r1.next()
            hm3.i r2 = (hm3.C32964i) r2
            if (r12 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.lang.Long> r4 = hm3.C32960f.f89554a
            java.lang.String r5 = r2.f89565a
            long r6 = r2.f89566b
            long r8 = hm3.C32960f.f89556c
            long r6 = r6 + r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r7 = r6.longValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "step up the threshold of "
            r9.append(r10)
            java.lang.String r2 = r2.f89565a
            r9.append(r2)
            java.lang.String r2 = " to "
            r9.append(r2)
            r9.append(r7)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r4.put(r5, r6)
            goto L_0x005c
        L_0x009d:
            boolean r12 = r3.isEmpty()
            r2 = r12 ^ 1
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hm3.C32955c.mo58888e(boolean):boolean");
    }
}
