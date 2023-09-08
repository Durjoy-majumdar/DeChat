package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;
import te3.C52307zu;

/* renamed from: com.tencent.mm.ui.CheckSmsCanAddCardUI */
public class CheckSmsCanAddCardUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public String f24145d;

    /* renamed from: e */
    public C47350c f24146e;

    public int getLayoutId() {
        return C0966R.C0971layout.b2z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.hideTitleView()
            boolean r6 = eb0.C97625j3.m125820j()
            if (r6 == 0) goto L_0x00b5
            boolean r6 = f40.C86718e.m107551r()
            if (r6 == 0) goto L_0x0014
            goto L_0x00b5
        L_0x0014:
            android.content.Intent r6 = r5.getIntent()
            android.net.Uri r6 = r6.getData()
            java.lang.String r0 = "MicroMsg.CheckSmsCanAddCardUI"
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L_0x0059
            java.lang.String r3 = r6.getHost()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = "cardpackage"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0050
        L_0x0035:
            java.lang.String r3 = "encrystr"
            java.lang.String r6 = r6.getQueryParameter(r3)
            r5.f24145d = r6
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r6
            java.lang.String r6 = "encryptCardInfo = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r3)
            java.lang.String r6 = r5.f24145d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0059
            r6 = 1
            goto L_0x005a
        L_0x0050:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r3
            java.lang.String r3 = "err host, host = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r6)
        L_0x0059:
            r6 = 0
        L_0x005a:
            if (r6 == 0) goto L_0x00a0
            ob0.b0 r6 = eb0.C97625j3.m125815e()
            r3 = 1038(0x40e, float:1.455E-42)
            r6.mo123455a(r3, r5)
            ob0.c$b r6 = new ob0.c$b
            r6.<init>()
            te3.yu r4 = new te3.yu
            r4.<init>()
            r6.f127066a = r4
            te3.zu r4 = new te3.zu
            r4.<init>()
            r6.f127067b = r4
            r6.f127069d = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard"
            r6.f127068c = r3
            ob0.c r6 = r6.mo72403a()
            r5.f24146e = r6
            ob0.c$c r6 = r6.f127055a
            pe3.a r6 = r6.f127080a
            te3.yu r6 = (te3.C52167yu) r6
            java.lang.String r3 = r5.f24145d
            r6.f145506d = r3
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r3
            java.lang.String r2 = "encry value is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r6)
            ob0.c r6 = r5.f24146e
            r0 = 0
            ob0.C89144l0.m111429e(r6, r0, r1)
            r5.f24146e = r6
            goto L_0x00b4
        L_0x00a0:
            r6 = 2131838307(0x7f114563, float:1.9309834E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r5, (java.lang.CharSequence) r6, (int) r2)
            r6.show()
            com.tencent.p014mm.p136ui.LauncherUI.m85941U7(r5)
            r5.finish()
        L_0x00b4:
            return
        L_0x00b5:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r0 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.class
            r6.<init>(r5, r0)
            android.content.Intent r0 = r5.getIntent()
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r5, r6, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.CheckSmsCanAddCardUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(1038, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C52307zu zuVar = (C52307zu) this.f24146e.f127056b.f127083a;
            String str2 = zuVar.f146223d;
            String str3 = zuVar.f146224e;
            Log.m105925i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", str2, str3);
            Intent intent = new Intent();
            intent.putExtra("key_card_id", str2);
            intent.putExtra("key_card_ext", str3);
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_is_sms_add_card", true);
            C88144b.m109792j(this, "card", ".ui.CardDetailUI", intent, false);
            finish();
            return;
        }
        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.k9t), 1).show();
        LauncherUI.m85941U7(this);
        finish();
    }
}
