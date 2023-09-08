package com.unionpay;

import android.content.Context;
import hx3.C76248c;

/* renamed from: com.unionpay.d */
public final class C75275d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76248c f221403d;

    /* renamed from: e */
    public final /* synthetic */ Context f221404e;

    /* renamed from: f */
    public final /* synthetic */ String f221405f;

    /* renamed from: g */
    public final /* synthetic */ String f221406g;

    public C75275d(C76248c cVar, Context context, String str, String str2) {
        this.f221403d = cVar;
        this.f221404e = context;
        this.f221405f = str;
        this.f221406g = str2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            hx3.b r0 = new hx3.b     // Catch:{ Exception -> 0x008f }
            hx3.c r1 = r6.f221403d     // Catch:{ Exception -> 0x008f }
            android.content.Context r2 = r6.f221404e     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = ix3.C76375b.m91800b(r2)     // Catch:{ Exception -> 0x008f }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x008f }
            int r1 = r0.mo122060a()     // Catch:{ Exception -> 0x008f }
            if (r1 != 0) goto L_0x008f
            java.lang.String r0 = r0.f253698a     // Catch:{ Exception -> 0x008f }
            android.content.Context r1 = r6.f221404e     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x008f
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008f }
            if (r1 != 0) goto L_0x008f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "sign"
            java.lang.String r2 = ix3.C76377f.m91807b(r1, r2)     // Catch:{ Exception -> 0x008f }
            java.lang.String r3 = "configs"
            java.lang.String r1 = ix3.C76377f.m91807b(r1, r3)     // Catch:{ Exception -> 0x008f }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x008f }
            if (r3 != 0) goto L_0x008f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x008f }
            if (r3 != 0) goto L_0x008f
            r3 = 0
            java.lang.String r4 = r6.f221405f     // Catch:{ Exception -> 0x0043 }
            int r3 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x008f }
            r5 = 2
            byte[] r1 = android.util.Base64.decode(r1, r5)     // Catch:{ Exception -> 0x008f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x008f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r1.<init>()     // Catch:{ Exception -> 0x008f }
            r1.append(r4)     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = r6.f221406g     // Catch:{ Exception -> 0x008f }
            r1.append(r4)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = com.unionpay.utils.UPUtils.m90295b(r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = ix3.C76375b.m91805g(r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = com.unionpay.utils.UPUtils.forConfig(r3, r2)     // Catch:{ Exception -> 0x008f }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x008f }
            if (r3 != 0) goto L_0x008f
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x008f
            android.content.Context r1 = r6.f221404e     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "scan_configs"
            com.unionpay.utils.UPUtils.m90296c(r1, r0, r2)     // Catch:{ Exception -> 0x008f }
            android.content.Context r0 = r6.f221404e     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = r6.f221405f     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "scan_mode"
            com.unionpay.utils.UPUtils.m90296c(r0, r1, r2)     // Catch:{ Exception -> 0x008f }
            android.content.Context r0 = r6.f221404e     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = r6.f221406g     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "scan_random"
            com.unionpay.utils.UPUtils.m90296c(r0, r1, r2)     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.C75275d.run():void");
    }
}
