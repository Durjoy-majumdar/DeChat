package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.utils.C84758k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.Map;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONException;
import org.json.JSONObject;
import p1042u.C111055b;
import p1042u.C111059i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f */
public final class C82149f extends C84758k0<C82153d> implements C82164h, C82131e {

    /* renamed from: h */
    public static final Map<String, C82149f> f240958h = new C111055b();

    /* renamed from: i */
    public static final C82131e f240959i = new C82150a();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f$a */
    public class C82150a implements C82131e {
        /* renamed from: c */
        public void mo114560c(C82197q qVar, C83125x6<C81879g> x6Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f$b */
    public class C82151b implements C88509c.C88512b {
        public C82151b() {
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (bVar == C88508b.DESTROYED) {
                C82149f.this.quit();
                Map<String, C82149f> map = C82149f.f240958h;
                synchronized (map) {
                    ((C111059i) map).remove(str);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f$c */
    public class C82152c implements C82153d {

        /* renamed from: a */
        public final /* synthetic */ C81879g f240961a;

        /* renamed from: b */
        public final /* synthetic */ C82197q f240962b;

        /* renamed from: c */
        public final /* synthetic */ C82149f f240963c;

        /* renamed from: d */
        public final /* synthetic */ C83125x6 f240964d;

        public C82152c(C81879g gVar, C82197q qVar, C82149f fVar, C83125x6 x6Var) {
            this.f240961a = gVar;
            this.f240962b = qVar;
            this.f240963c = fVar;
            this.f240964d = x6Var;
        }

        /* renamed from: a */
        public void mo114586a() {
            Log.m105925i("MicroMsg.AppBrandAuthJsApiQueue", "about to call AuthInvoke, api[%s]", C82149f.this.getName());
            if (!this.f240961a.isRunning()) {
                Log.m105921e("MicroMsg.AppBrandAuthJsApiQueue", "doAuth but component not running, api = %s", this.f240962b.mo114779e());
                this.f240963c.sendMessage(2);
                return;
            }
            this.f240962b.mo114534w(this.f240964d, new C82123a(this.f240963c));
        }

        public String toString() {
            return hashCode() + "|" + this.f240962b.mo114779e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f$d */
    public interface C82153d {
        /* renamed from: a */
        void mo114586a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C82149f(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MicroMsg.AppBrandAuthJsApiQueue"
            r0.append(r1)
            if (r4 != 0) goto L_0x0010
            java.lang.String r1 = "|DUMMY"
            goto L_0x0024
        L_0x0010:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "|"
            r1.append(r2)
            java.lang.String r2 = r4.f238147j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x0024:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r3.<init>(r0, r1)
            if (r4 != 0) goto L_0x0035
            return
        L_0x0035:
            li0.c r4 = r4.f238113K
            com.tencent.mm.plugin.appbrand.jsapi.auth.f$b r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.f$b
            r0.<init>()
            r4.mo122978a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f.<init>(com.tencent.mm.plugin.appbrand.AppBrandRuntime):void");
    }

    /* renamed from: c */
    public void mo114560c(C82197q qVar, C83125x6<C81879g> x6Var) {
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        Log.m105925i("MicroMsg.AppBrandAuthJsApiQueue", "execute name[%s], callbackId[%d], appId[%s]", qVar.mo114779e(), Integer.valueOf(x6Var.f242919e), gVar.getAppId());
        try {
            jSONObject.put("queueLength", ((LinkedList) this.f247172g).size());
        } catch (JSONException unused) {
        }
        C82152c cVar = new C82152c(gVar, qVar, this, x6Var);
        synchronized (this.f247172g) {
            ((LinkedList) this.f247172g).offer(cVar);
        }
        sendMessage(1);
    }

    /* renamed from: d */
    public void mo56741d() {
        sendMessage(2);
    }
}
