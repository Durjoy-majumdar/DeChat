package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.luggage.m1 */
public class C43633m1 {

    /* renamed from: a */
    public final HashMap<String, String> f117889a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, C6210c.C6215d> f117890b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, String> f117891c = new HashMap<>();

    /* renamed from: d */
    public C43658n f117892d;

    public C43633m1(C43658n nVar) {
        this.f117892d = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r3.indexOf("#");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo67919a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0007
            return r3
        L_0x0007:
            java.lang.String r0 = "#"
            int r0 = r3.indexOf(r0)
            if (r0 >= 0) goto L_0x0010
            return r3
        L_0x0010:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43633m1.mo67919a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public String mo67920b() {
        String v = this.f117892d.mo67943v();
        if (Util.isNullOrNil(v)) {
            return null;
        }
        return this.f117889a.get(mo67919a(v));
    }
}
