package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import kotlin.Metadata;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C47350c;
import ob0.C89144l0;
import p156gj.C87203t;
import qg0.C12215a;
import qo3.C89779i0;
import tc2.C118418g;
import te3.C51018qv3;
import te3.C51394tg3;
import te3.C51544ug3;
import te3.lx4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/account/ui/PreCheckAffiliateAccountUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.account.ui.PreCheckAffiliateAccountUI */
public final class PreCheckAffiliateAccountUI extends MMActivity {

    /* renamed from: d */
    public int f10745d;

    /* renamed from: e */
    public C89779i0 f10746e;

    /* renamed from: f */
    public String f10747f;

    /* renamed from: g */
    public final String f10748g = (System.currentTimeMillis() + "");

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 702:
                if (intent != null) {
                    Bundle bundleExtra = intent.getBundleExtra("result_data");
                    C87412m.m108591d(bundleExtra);
                    Map map = (Map) bundleExtra.getSerializable("next_params");
                    if (map != null) {
                        this.f10747f = (String) map.get("ticket");
                    }
                    if (this.f10747f != null) {
                        String string = getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), C76850a.m92633e(this, "CN", getString(C0966R.string.bvs)), "reg", 1, 0});
                        C87412m.m108593f(string, "getString(\n             …  0\n                    )");
                        C12215a.m11778c(this, string, 703, false);
                        C115669n.INSTANCE.mo160131h(23530, this.f10748g, C87203t.m108273i(), 0, 1, 1002, 0, null, Integer.valueOf(this.f10745d));
                    } else {
                        setResult(0, intent);
                        finish();
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                C89779i0 i0Var = this.f10746e;
                if (i0Var != null) {
                    i0Var.dismiss();
                    return;
                }
                return;
            case 703:
                if (intent != null) {
                    Bundle bundleExtra2 = intent.getBundleExtra("result_data");
                    if (bundleExtra2 == null || !C87412m.m108589b(bundleExtra2.getString("go_next", ""), "agree_privacy")) {
                        setResult(0, intent);
                        finish();
                    } else {
                        Intent intent2 = new Intent(this, RegAffiliateAccountUI.class);
                        intent2.putExtra("RegTicket", this.f10747f);
                        intent2.putExtra("sessionID", this.f10748g);
                        intent2.putExtra("RegScene", this.f10745d);
                        startActivityForResult(intent2, 704);
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                C89779i0 i0Var2 = this.f10746e;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                    return;
                }
                return;
            case 704:
                C89779i0 i0Var3 = this.f10746e;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                }
                setResult(i2, intent);
                finish();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        this.f10746e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
        this.f10745d = getIntent().getIntExtra("RegScene", 0);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5298;
        bVar.f127068c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        C51394tg3 tg32 = new C51394tg3();
        tg32.f142214e = this.f10748g;
        C118418g gVar = C118418g.INSTANCE;
        byte[] hd = gVar.mo175821hd();
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hd != null ? hd.length : -1);
        Log.m105919d("MicroMsg.PreCheckAffiliateAccountUI", "[tomys] ccd set on auto auth, len: %s", objArr);
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(hd);
        lx4.f354117f = qv32;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(gVar.b90());
        lx4.f354121j = qv33;
        Log.m105919d("MicroMsg.PreCheckAffiliateAccountUI", "[debug] devtok on auto auth, len: %s", Integer.valueOf(qv33.f140572d));
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(lx4.toByteArray());
        tg32.f142213d = qv34;
        tg32.f142215f = this.f10745d;
        bVar.f127066a = tg32;
        bVar.f127067b = new C51544ug3();
        C89144l0.m111429e(bVar.mo72403a(), new C1478i2(this), false);
    }
}
