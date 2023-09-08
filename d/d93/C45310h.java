package d93;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.modeltools.C43749d;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e00.C45519s0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import qe3.C25549c;
import sf0.C90188n0;
import te3.C48904bt1;
import te3.wp4;

/* renamed from: d93.h */
public class C45310h {

    /* renamed from: a */
    public Map<String, C45312b> f122759a;

    /* renamed from: b */
    public Map<String, HashMap<String, wp4>> f122760b = new HashMap();

    /* renamed from: c */
    public JsapiPermissionWrapper f122761c;

    /* renamed from: d */
    public GeneralControlWrapper f122762d;

    /* renamed from: e */
    public C45313c f122763e;

    /* renamed from: f */
    public final JsapiPermissionWrapper f122764f = new JsapiPermissionWrapper(2);

    /* renamed from: g */
    public final GeneralControlWrapper f122765g = GeneralControlWrapper.f121045f;

    /* renamed from: d93.h$a */
    public class C45311a implements C45313c {
        public C45311a(C45310h hVar) {
        }

        /* renamed from: a */
        public String mo67770a() {
            return null;
        }

        /* renamed from: b */
        public String mo67771b() {
            return null;
        }
    }

    /* renamed from: d93.h$b */
    public static class C45312b {

        /* renamed from: a */
        public JsapiPermissionWrapper f122766a;

        /* renamed from: b */
        public GeneralControlWrapper f122767b;

        public C45312b(JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
            this.f122766a = jsapiPermissionWrapper;
            this.f122767b = generalControlWrapper;
        }

        public String toString() {
            return "Permission: jsPerm = " + this.f122766a + ", genCtrl = " + this.f122767b;
        }
    }

    /* renamed from: d93.h$c */
    public interface C45313c {
        /* renamed from: a */
        String mo67770a();

        /* renamed from: b */
        String mo67771b();
    }

    public C45310h(C45313c cVar) {
        this.f122763e = cVar == null ? new C45311a(this) : cVar;
        Log.m105924i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + this.f122761c + ", hardcodeGenCtrl = " + this.f122762d);
        this.f122759a = new HashMap();
    }

    /* renamed from: a */
    public final String mo70858a(String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: b */
    public GeneralControlWrapper mo70859b() {
        C45312b bVar;
        if (this.f122762d != null) {
            Log.m105924i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.f122762d);
            return this.f122762d;
        }
        C45313c cVar = this.f122763e;
        GeneralControlWrapper generalControlWrapper = null;
        if (cVar != null) {
            bVar = mo70861d(cVar.mo67771b());
            if (bVar == null) {
                bVar = mo70861d(this.f122763e.mo67770a());
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            generalControlWrapper = bVar.f122767b;
        }
        return generalControlWrapper == null ? this.f122765g : generalControlWrapper;
    }

    /* renamed from: c */
    public JsapiPermissionWrapper mo70860c() {
        String str;
        C45312b bVar;
        JsapiPermissionWrapper jsapiPermissionWrapper;
        if (this.f122761c != null) {
            Log.m105924i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.f122761c);
            return this.f122761c;
        }
        C45313c cVar = this.f122763e;
        JsapiPermissionWrapper jsapiPermissionWrapper2 = null;
        boolean z = true;
        if (cVar != null) {
            bVar = mo70861d(cVar.mo67771b());
            str = this.f122763e.mo67770a();
            if (!Util.isNullOrNil(str)) {
                if (bVar == null) {
                    bVar = mo70861d(str);
                }
                str = String.format("preverify://url=%s", new Object[]{URLEncoder.encode(C6686h2.m6989a(Util.nullAsNil(str)))});
            }
        } else {
            bVar = null;
            str = null;
        }
        if (bVar != null) {
            jsapiPermissionWrapper2 = bVar.f122766a;
        }
        if (str != null && ((HashMap) this.f122760b).containsKey(str)) {
            if (jsapiPermissionWrapper == null) {
                jsapiPermissionWrapper = new JsapiPermissionWrapper(new byte[0]);
                z = false;
            } else {
                jsapiPermissionWrapper = jsapiPermissionWrapper.clone();
            }
            HashMap hashMap = (HashMap) ((HashMap) this.f122760b).get(str);
            for (String str2 : hashMap.keySet()) {
                C25549c.C12172h ri02 = ((C45519s0) C86312j.m106911c(C45519s0.class)).ri0(str2);
                int i = ri02 != null ? ri02.f35270c : -1;
                if (i > -1) {
                    int d = z ? jsapiPermissionWrapper.mo69443d(i) : 2;
                    int i2 = ((wp4) hashMap.get(str2)).f144210e;
                    if (d == 0) {
                        jsapiPermissionWrapper.mo69449h(i, (byte) 0);
                    } else if (d == 2) {
                        jsapiPermissionWrapper.mo69449h(i, (byte) i2);
                    } else {
                        jsapiPermissionWrapper.mo69449h(i, (byte) d);
                    }
                }
            }
        }
        return jsapiPermissionWrapper == null ? this.f122764f : jsapiPermissionWrapper;
    }

    /* renamed from: d */
    public final C45312b mo70861d(String str) {
        if (Util.isNullOrNil(str) || this.f122759a == null) {
            return null;
        }
        String a = mo70858a(str);
        if (this.f122759a.containsKey(a)) {
            return this.f122759a.get(a);
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo70862e(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebViewPermission", "has fail, url is null");
            return false;
        }
        String a = mo70858a(str);
        Map<String, C45312b> map = this.f122759a;
        if (map == null) {
            Log.m105920e("MicroMsg.WebViewPermission", "has fail, permMap is null");
            return false;
        }
        C45312b bVar = (C45312b) ((HashMap) map).get(a);
        return (bVar == null || bVar.f122766a == this.f122764f || bVar.f122767b == this.f122765g) ? false : true;
    }

    /* renamed from: f */
    public boolean mo70863f(String str) {
        JsapiPermissionWrapper jsapiPermissionWrapper;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebViewPermission", "hasJsPerm fail, url = " + str);
            return false;
        }
        String a = mo70858a(str);
        Map<String, C45312b> map = this.f122759a;
        if (map == null) {
            Log.m105920e("MicroMsg.WebViewPermission", "hasJsPerm fail, permMap is null");
            return false;
        }
        C45312b bVar = (C45312b) ((HashMap) map).get(a);
        StringBuilder sb = new StringBuilder();
        sb.append("edw hasJsPerm, jsPerm = ");
        sb.append(bVar == null ? null : bVar.f122766a);
        sb.append(", url = ");
        sb.append(a);
        Log.m105924i("MicroMsg.WebViewPermission", sb.toString());
        return (bVar == null || (jsapiPermissionWrapper = bVar.f122766a) == null || jsapiPermissionWrapper.equals(this.f122764f)) ? false : true;
    }

    /* renamed from: g */
    public void mo70864g(String str, JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebViewPermission", "update fail, url is null");
            return;
        }
        boolean z = false;
        if (generalControlWrapper != null) {
            if ((generalControlWrapper.f121046d & 524288) != 0) {
                z = true;
            }
            Log.m105918d("MicroMsg.GeneralControlWrapper", "needClearData, ret = " + z);
        }
        if (z) {
            if (C43749d.f118217a == null) {
                C43749d.f118217a = new ArrayList<>();
            }
            if (!C43749d.f118217a.contains(str)) {
                C43749d.f118217a.add(str);
            }
        }
        String a = mo70858a(str);
        if (jsapiPermissionWrapper == null) {
            jsapiPermissionWrapper = this.f122764f;
        }
        if (generalControlWrapper == null) {
            generalControlWrapper = this.f122765g;
        }
        Log.m105924i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + jsapiPermissionWrapper + ", genCtrl = " + generalControlWrapper + ", url = " + a);
        ((HashMap) this.f122759a).put(a, new C45312b(jsapiPermissionWrapper, generalControlWrapper));
    }

    /* renamed from: h */
    public void mo70865h(JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
        this.f122761c = jsapiPermissionWrapper;
        String str = C90188n0.f258945m;
        if (str == null || str.length() == 0) {
            Log.m105924i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                int i = Util.getInt(C90188n0.f258945m, 0);
                if (i < 0) {
                    Log.m105928w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
                } else {
                    this.f122761c = new JsapiPermissionWrapper(i);
                    Log.m105924i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f122761c);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e.getMessage());
                this.f122761c = null;
            }
        }
        this.f122762d = generalControlWrapper;
        String str2 = C90188n0.f258946n;
        if (str2 == null || str2.length() == 0) {
            Log.m105924i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
            return;
        }
        try {
            int i2 = Util.getInt(C90188n0.f258946n, 0);
            Log.m105925i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", Integer.valueOf(i2));
            C48904bt1 bt12 = new C48904bt1();
            bt12.f131299d = i2;
            this.f122762d = new GeneralControlWrapper(bt12);
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", e2.getMessage());
            this.f122762d = null;
        }
        Log.m105924i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f122762d);
    }

    /* renamed from: i */
    public void mo70866i(Bundle bundle) {
        String string = bundle.getString("jsapi_preverify_commit_url");
        String string2 = bundle.getString("jsapi_preverify_current_url");
        mo70867j(bundle, string);
        if (!Util.isEqual(string, string2)) {
            mo70867j(bundle, string2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086 A[Catch:{ Exception -> 0x00a3 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70867j(android.os.Bundle r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WebViewPermission"
            java.lang.String r1 = "jsapi_preverify_fun_list"
            java.util.ArrayList r1 = r11.getStringArrayList(r1)
            java.lang.String r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2.m6989a(r12)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r12 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2.m6989a(r12)
            java.lang.String r12 = java.net.URLEncoder.encode(r12)
            r4 = 0
            r3[r4] = r12
            java.lang.String r12 = "preverify://url=%s"
            java.lang.String r12 = java.lang.String.format(r12, r3)
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, te3.wp4>> r3 = r10.f122760b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r12)
            if (r3 != 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, te3.wp4>> r3 = r10.f122760b
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r12, r5)
        L_0x003a:
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, te3.wp4>> r3 = r10.f122760b
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r12 = r3.get(r12)
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.util.Iterator r1 = r1.iterator()
        L_0x0048:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ac
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            te3.wp4 r5 = new te3.wp4     // Catch:{ Exception -> 0x00a3 }
            r5.<init>()     // Catch:{ Exception -> 0x00a3 }
            byte[] r6 = r11.getByteArray(r3)     // Catch:{ Exception -> 0x00a3 }
            r5.parseFrom(r6)     // Catch:{ Exception -> 0x00a3 }
            int r6 = r5.f144210e     // Catch:{ Exception -> 0x00a3 }
            r7 = 2
            if (r6 == 0) goto L_0x006a
            if (r6 != r7) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r8 = 0
            goto L_0x006b
        L_0x006a:
            r8 = 1
        L_0x006b:
            r9 = 3
            if (r8 == 0) goto L_0x0086
            java.lang.String r8 = "skip update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00a3 }
            r9[r4] = r3     // Catch:{ Exception -> 0x00a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00a3 }
            r9[r2] = r3     // Catch:{ Exception -> 0x00a3 }
            int r3 = r5.f144211f     // Catch:{ Exception -> 0x00a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00a3 }
            r9[r7] = r3     // Catch:{ Exception -> 0x00a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r8, r9)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0048
        L_0x0086:
            r12.put(r3, r5)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r6 = "update control bytes by preverify, %s, %d, %d"
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00a3 }
            r8[r4] = r3     // Catch:{ Exception -> 0x00a3 }
            int r3 = r5.f144210e     // Catch:{ Exception -> 0x00a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00a3 }
            r8[r2] = r3     // Catch:{ Exception -> 0x00a3 }
            int r3 = r5.f144211f     // Catch:{ Exception -> 0x00a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00a3 }
            r8[r7] = r3     // Catch:{ Exception -> 0x00a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r8)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0048
        L_0x00a3:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "parse preverify info"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r6, r5)
            goto L_0x0048
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d93.C45310h.mo70867j(android.os.Bundle, java.lang.String):void");
    }
}
