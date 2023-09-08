package td2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.regex.Pattern;
import ke3.C88144b;

/* renamed from: td2.c */
public class C13874c {
    /* renamed from: a */
    public static boolean m13185a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    public static void m13186b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.putExtra("key_product_id", str);
            intent.putExtra("key_product_scene", 5);
            C88144b.m109791i(context, "product", ".ui.MallProductUI", intent, (Bundle) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0113  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13187c(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jumpToUrl:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MallUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "action"
            r6 = 0
            if (r13 != 0) goto L_0x0024
            goto L_0x0042
        L_0x0024:
            int r7 = r13.indexOf(r5)
            if (r7 > 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            int r8 = r13.length()
            java.lang.String r7 = r13.substring(r7, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            java.lang.String r8 = "&"
            java.lang.String[] r7 = r7.split(r8)
            if (r7 != 0) goto L_0x0044
        L_0x0042:
            r8 = r6
            goto L_0x0064
        L_0x0044:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r9 = 0
        L_0x004a:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x0064
            r10 = r7[r9]
            java.lang.String r11 = "="
            java.lang.String[] r10 = r10.split(r11)
            if (r10 == 0) goto L_0x0061
            int r11 = r10.length
            if (r11 != r4) goto L_0x0061
            r11 = r10[r2]
            r10 = r10[r3]
            r8.put(r11, r10)
        L_0x0061:
            int r9 = r9 + 1
            goto L_0x004a
        L_0x0064:
            java.lang.String r7 = "pay_channel"
            java.lang.String r9 = "showShare"
            java.lang.String r10 = "rawUrl"
            if (r8 == 0) goto L_0x0113
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L_0x0113
            java.lang.Object r13 = r8.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 != 0) goto L_0x00fe
            boolean r5 = m13185a(r13)
            if (r5 != 0) goto L_0x0089
            goto L_0x00fe
        L_0x0089:
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r2)
            if (r13 == r3) goto L_0x00e9
            if (r13 == r4) goto L_0x00dc
            r4 = 3
            if (r13 == r4) goto L_0x00b6
            r1 = 4
            if (r13 == r1) goto L_0x0099
            goto L_0x012a
        L_0x0099:
            java.lang.String r13 = "productid"
            java.lang.Object r13 = r8.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "key_product_id"
            r0.putExtra(r1, r13)
            r13 = 5
            java.lang.String r1 = "key_product_scene"
            r0.putExtra(r1, r13)
            java.lang.String r13 = "product"
            java.lang.String r1 = ".ui.MallProductUI"
            ke3.C88144b.m109791i(r12, r13, r1, r0, r6)
            goto L_0x012a
        L_0x00b6:
            java.lang.String r13 = "functionid"
            java.lang.Object r13 = r8.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r4 = "key_func_id"
            r0.putExtra(r4, r13)
            java.lang.String r13 = "key_scene"
            r0.putExtra(r13, r3)
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r13[r2] = r4
            java.lang.String r2 = " walletMallV2 switch is ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r13)
            java.lang.String r13 = "mall"
            java.lang.String r1 = ".ui.MallIndexUIv2"
            ke3.C88144b.m109791i(r12, r13, r1, r0, r6)
            goto L_0x012a
        L_0x00dc:
            java.lang.String r13 = "username"
            java.lang.Object r13 = r8.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90223P(r12, r13)
            goto L_0x012a
        L_0x00e9:
            java.lang.String r13 = "3rdurl"
            java.lang.Object r13 = r8.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r0.putExtra(r10, r13)
            r0.putExtra(r9, r2)
            r0.putExtra(r7, r3)
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90217J(r12, r0)
            goto L_0x012a
        L_0x00fe:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "jumpToUrl illegal action:"
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r2
        L_0x0113:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x012b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r10, r13)
            r0.putExtra(r9, r2)
            r0.putExtra(r7, r3)
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90217J(r12, r0)
        L_0x012a:
            return r3
        L_0x012b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "jumpToUrl illegal url:"
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: td2.C13874c.m13187c(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: d */
    public static void m13188d(Boolean bool, String str, String str2, String str3, String str4) {
        if (bool.booleanValue()) {
            C115669n.INSTANCE.mo160131h(11030, str, "", str3, str4);
            return;
        }
        C115669n.INSTANCE.mo160131h(11030, str, str2, str3, str4);
    }
}
