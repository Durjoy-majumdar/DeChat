package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.util.Map;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI */
public class WalletUnbindBankCardProxyUI extends WalletBaseUI {

    /* renamed from: d */
    public String f117239d;

    /* renamed from: e */
    public Bankcard f117240e;

    /* renamed from: f */
    public Map<String, String> f117241f;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI$a */
    public class C43359a implements C79148e.C79149a {
        public C43359a() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            if (i == -1) {
                WalletUnbindBankCardProxyUI.this.setResult(-1);
                return null;
            } else if (i == 0) {
                WalletUnbindBankCardProxyUI.this.setResult(0);
                return null;
            } else if (i != 1) {
                return null;
            } else {
                WalletUnbindBankCardProxyUI.this.setResult(1);
                return null;
            }
        }
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            android.content.Intent r13 = r12.getIntent()
            r0 = 0
            r12.setResult(r0)
            java.lang.String r1 = "MicorMsg.WalletUnbindBankCardProxyUI"
            if (r13 == 0) goto L_0x0131
            java.lang.String r2 = "packageExt"
            java.lang.String r2 = r13.getStringExtra(r2)
            r12.f117239d = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 1
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r12.f117239d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r5 = 0
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "&"
            java.lang.String[] r2 = r2.split(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r2 == 0) goto L_0x0068
            int r6 = r2.length
            if (r6 <= 0) goto L_0x0068
            int r6 = r2.length
            r7 = 0
        L_0x0039:
            if (r7 >= r6) goto L_0x0069
            r8 = r2[r7]
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0065
            java.lang.String r9 = "="
            int r9 = r8.indexOf(r9)
            java.lang.String r10 = r8.substring(r0, r9)
            int r9 = r9 + r3
            int r11 = r8.length()
            java.lang.String r8 = r8.substring(r9, r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r9 != 0) goto L_0x0065
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0065
            r4.put(r10, r8)
        L_0x0065:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x0068:
            r4 = r5
        L_0x0069:
            r12.f117241f = r4
            java.lang.String r2 = "bank_type"
            boolean r4 = r4.containsKey(r2)
            if (r4 == 0) goto L_0x0108
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f117241f
            java.lang.String r6 = "bind_serial"
            boolean r4 = r4.containsKey(r6)
            if (r4 == 0) goto L_0x0108
            java.lang.Class<yz.v> r4 = p281yz.C79173v.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            yz.v r4 = (p281yz.C79173v) r4
            e63.d r4 = r4.xx0()
            java.util.Map<java.lang.String, java.lang.String> r7 = r12.f117241f
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            r4.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "select * from WalletBankcard where bindSerial = '"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "'"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.f221979d
            r8 = 2
            android.database.Cursor r4 = r4.rawQuery(r7, r5, r8)
            boolean r7 = r4.moveToNext()
            if (r7 == 0) goto L_0x00bf
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = new com.tencent.mm.plugin.wallet_core.model.Bankcard
            r5.<init>()
            r5.convertFrom(r4)
        L_0x00bf:
            r4.close()
            r12.f117240e = r5
            if (r5 != 0) goto L_0x00e8
            java.lang.String r4 = "can not found bankcard, new one "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = new com.tencent.mm.plugin.wallet_core.model.Bankcard
            r1.<init>()
            r12.f117240e = r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f117241f
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.field_bankcardType = r2
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r12.f117240e
            java.util.Map<java.lang.String, java.lang.String> r2 = r12.f117241f
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            r1.field_bindSerial = r2
        L_0x00e8:
            java.lang.String r1 = "key_is_show_detail"
            r13.putExtra(r1, r0)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r12.f117240e
            java.lang.String r1 = "key_bankcard"
            r13.putExtra(r1, r0)
            java.lang.String r0 = "scene"
            r13.putExtra(r0, r3)
            java.lang.Class<v43.a> r0 = v43.C78334a.class
            android.os.Bundle r13 = r13.getExtras()
            com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI$a r1 = new com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI$a
            r1.<init>()
            yq3.C79143a.m95771j(r12, r0, r13, r1)
            goto L_0x0139
        L_0x0108:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "jsapi param:package error.package=="
            r13.append(r0)
            java.lang.String r0 = r12.f117239d
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
            r12.setResult(r3)
            r12.finish()
            goto L_0x0139
        L_0x0125:
            java.lang.String r13 = "jsapi param error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
            r12.setResult(r3)
            r12.finish()
            goto L_0x0139
        L_0x0131:
            java.lang.String r13 = "intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
            r12.finish()
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletUnbindBankCardProxyUI.onCreate(android.os.Bundle):void");
    }

    public void onNewIntent(Intent intent) {
        finish();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
