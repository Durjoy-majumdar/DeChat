package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import kotlin.Metadata;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import x20.C15618a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.g2 */
public final class C6439g2 extends C15053a {

    /* renamed from: d */
    public static final C6439g2 f23461d = new C6439g2();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/g2$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.g2$a */
    public static final class C6440a implements C80883e<IPCVoid, IPCString> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r3, com.tencent.p014mm.ipcinvoker.C1256g r4) {
            /*
                r2 = this;
                com.tencent.mm.ipcinvoker.type.IPCVoid r3 = (com.tencent.p014mm.ipcinvoker.type.IPCVoid) r3
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                r0 = 6
                r1 = 0
                java.lang.Object r3 = r3.mo119684e(r0, r1)
                boolean r0 = r3 instanceof java.lang.String
                if (r0 == 0) goto L_0x0017
                r1 = r3
                java.lang.String r1 = (java.lang.String) r1
            L_0x0017:
                if (r1 == 0) goto L_0x0022
                boolean r3 = z04.C112551y.m153811k(r1)
                if (r3 == 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r3 = 0
                goto L_0x0023
            L_0x0022:
                r3 = 1
            L_0x0023:
                if (r3 == 0) goto L_0x0027
                java.lang.String r1 = ""
            L_0x0027:
                if (r4 == 0) goto L_0x0031
                com.tencent.mm.ipcinvoker.type.IPCString r3 = new com.tencent.mm.ipcinvoker.type.IPCString
                r3.<init>(r1)
                r4.mo894a(r3)
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6439g2.C6440a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.g2$b */
    public static final class C6441b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23462d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23463e;

        public C6441b(C13855j jVar, C13851h1 h1Var) {
            this.f23462d = jVar;
            this.f23463e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("bindPhone :");
            sb.append(iPCString != null ? iPCString.f10315d : null);
            Log.m105924i("MicroMsg.JsApiRequestBindPhoneNumber.", sb.toString());
            ((C119157j) C119157j.f356862d).mo183895z(new C6489h2(this.f23462d, this.f23463e, iPCString));
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("requestName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = h1Var.f38983a.get("requestIconUrl");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C15618a.m14626b((Object) null, new C6440a(), new C6441b(jVar, h1Var));
                return true;
            }
        }
        jVar.f39001d.mo10774a(h1Var.f38990c, "requestBindPhoneNumber:fail requestName or requestIcon is null", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 387;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "requestBindPhoneNumber";
    }
}
