package c53;

import b63.C67210w;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d53.C75325a;
import d53.C75326b;
import d53.C75328d;
import d53.C75329e;
import d53.C75331g;
import d53.C75332h;
import d53.C75333i;
import d53.C75334j;
import d53.C75336l;
import d53.C75337m;
import d53.C75338n;
import g53.C75851a;
import g53.C75853c;
import g53.C75854d;
import g53.C75856f;
import g53.C75857g;
import g53.C75858h;
import g53.C75860j;
import g53.C75861k;
import g53.C75862l;
import g53.C75863m;

/* renamed from: c53.a */
public class C67341a {
    /* renamed from: a */
    public static C75326b m79678a(Authen authen, Orders orders, boolean z) {
        String str;
        if (authen == null || orders == null) {
            Log.m105924i("MicroMsg.CgiManager", "empty authen or orders");
            return null;
        }
        PayInfo payInfo = authen.f209382v;
        if (payInfo != null) {
            Log.m105924i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = payInfo.f212592j;
        } else {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.CgiManager", "get reqKey from orders");
            str = orders.f209563e;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.CgiManager", "empty reqKey!");
            return new C75326b(authen, orders, z);
        }
        Log.m105925i("MicroMsg.CgiManager", "authen reqKey: %s", str);
        if (payInfo != null) {
            Log.m105919d("MicroMsg.CgiManager", "reqKey: %s, %s", payInfo.f212592j, orders.f209563e);
        }
        Log.m105924i("MicroMsg.CgiManager", "authen go new split cgi");
        return str.startsWith("sns_aa_") ? new C75325a(authen, orders, z) : str.startsWith("sns_tf_") ? new C75337m(authen, orders, z) : str.startsWith("sns_ff_") ? new C75329e(authen, orders, z) : str.startsWith("ts_") ? new C75331g(authen, orders, z) : str.startsWith("sns_") ? new C75334j(authen, orders, z) : str.startsWith("offline_") ? new C75332h(authen, orders, z) : str.startsWith("up_") ? new C75338n(authen, orders, z) : str.startsWith("seb_ff_") ? new C75333i(authen, orders, z) : str.startsWith("tax_") ? new C75336l(authen, orders, z) : str.startsWith("dc_") ? new C75328d(authen, orders, z) : new C75326b(authen, orders, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d53.C75327c m79679b(com.tencent.p014mm.plugin.wallet_core.model.Authen r6, com.tencent.p014mm.plugin.wallet_core.model.Orders r7, boolean r8) {
        /*
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r0.f192960m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0034
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r6.f209382v
            if (r0 == 0) goto L_0x0034
            if (r8 != 0) goto L_0x0034
            int r0 = r0.f212587e
            r3 = 31
            if (r0 == r3) goto L_0x0032
            r3 = 32
            if (r0 == r3) goto L_0x0032
            r3 = 33
            if (r0 == r3) goto L_0x0032
            r3 = 42
            if (r0 == r3) goto L_0x0032
            r3 = 37
            if (r0 == r3) goto L_0x0032
            r3 = 56
            if (r0 != r3) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r0 = 0
            r3 = 1
            goto L_0x0036
        L_0x0032:
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r3 = 0
        L_0x0036:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r2] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4[r1] = r2
            r1 = 2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r4[r1] = r2
            java.lang.String r1 = "MicroMsg.CgiManager"
            java.lang.String r2 = "isLqtSns: %s, isLqtTs: %s, isBalance: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            if (r0 == 0) goto L_0x005b
            d53.k r0 = new d53.k
            r0.<init>(r6, r7, r8)
            return r0
        L_0x005b:
            if (r3 == 0) goto L_0x0063
            d53.f r0 = new d53.f
            r0.<init>(r6, r7, r8)
            return r0
        L_0x0063:
            d53.c r0 = new d53.c
            r0.<init>(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c53.C67341a.m79679b(com.tencent.mm.plugin.wallet_core.model.Authen, com.tencent.mm.plugin.wallet_core.model.Orders, boolean):d53.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g53.C75852b m79680c(b63.C67210w r6, com.tencent.p014mm.plugin.wallet_core.model.Orders r7) {
        /*
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r0.f192960m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0048
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r6.f192996n
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r6.f192987e
            y43.b0 r3 = y43.C79029b0.vx0()
            b63.s0 r3 = r3.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r3.f192960m
            java.lang.String r3 = r3.field_bankcardType
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0048
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r6.f192996n
            int r0 = r0.f212587e
            r3 = 31
            if (r0 == r3) goto L_0x0046
            r3 = 32
            if (r0 == r3) goto L_0x0046
            r3 = 33
            if (r0 == r3) goto L_0x0046
            r3 = 42
            if (r0 == r3) goto L_0x0046
            r3 = 37
            if (r0 == r3) goto L_0x0046
            r3 = 56
            if (r0 != r3) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r0 = 0
            r3 = 1
            goto L_0x004a
        L_0x0046:
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r3 = 0
        L_0x004a:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r2] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4[r1] = r2
            java.lang.String r1 = "MicroMsg.CgiManager"
            java.lang.String r2 = "isLqtSns: %s, isLqtTs: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            if (r0 == 0) goto L_0x0068
            g53.i r0 = new g53.i
            r0.<init>(r6, r7)
            return r0
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            g53.e r0 = new g53.e
            r0.<init>(r6, r7)
            return r0
        L_0x0070:
            g53.b r0 = new g53.b
            r0.<init>(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c53.C67341a.m79680c(b63.w, com.tencent.mm.plugin.wallet_core.model.Orders):g53.b");
    }

    /* renamed from: d */
    public static C75857g m79681d(C67210w wVar, Orders orders) {
        String str;
        if (wVar == null || orders == null) {
            Log.m105920e("MicroMsg.CgiManager", "empty verify or orders");
            return null;
        }
        PayInfo payInfo = wVar.f192996n;
        if (payInfo != null) {
            Log.m105924i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = payInfo.f212592j;
        } else {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.CgiManager", "get reqKey from orders");
            str = orders.f209563e;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.CgiManager", "empty reqKey!");
            return new C75857g(wVar, orders);
        }
        if (payInfo != null) {
            Log.m105919d("MicroMsg.CgiManager", "reqKey: %s, %s", payInfo.f212592j, orders.f209563e);
        }
        Log.m105925i("MicroMsg.CgiManager", "verify reqKey: %s", str);
        Log.m105924i("MicroMsg.CgiManager", "verify go new split cgi");
        return str.startsWith("sns_aa_") ? new C75851a(wVar, orders) : str.startsWith("sns_tf_") ? new C75862l(wVar, orders) : str.startsWith("sns_ff_") ? new C75854d(wVar, orders) : str.startsWith("ts_") ? new C75856f(wVar, orders) : str.startsWith("sns_") ? new C75860j(wVar, orders) : str.startsWith("up_") ? new C75863m(wVar, orders) : str.startsWith("seb_ff_") ? new C75858h(wVar, orders) : str.startsWith("tax_") ? new C75861k(wVar, orders) : str.startsWith("dc_") ? new C75853c(wVar, orders) : new C75857g(wVar, orders);
    }
}
