package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.plugin.remittance.model.C70610s;
import com.tencent.p014mm.plugin.remittance.model.C70612t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import ie3.C76324c;
import ie3.C76328d;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI */
public class RemittanceHKUI extends RemittanceBaseUI {

    /* renamed from: k1 */
    public static final /* synthetic */ int f204920k1 = 0;

    /* renamed from: g1 */
    public int f204921g1;

    /* renamed from: h1 */
    public String f204922h1;

    /* renamed from: i1 */
    public String f204923i1;

    /* renamed from: j1 */
    public String f204924j1;

    /* renamed from: K7 */
    public void mo97271K7() {
    }

    /* renamed from: L7 */
    public void mo97272L7() {
        Log.m105918d("MicroMsg.RemittanceHKUI", "do scene cancel");
        doSceneProgress(new C70610s(this.f204384f, this.f204391p, this.f204921g1, ((long) this.f204382e) * 100, this.f204389n == 33 ? 1 : 0), false);
    }

    /* renamed from: M7 */
    public void mo97273M7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        Log.m105918d("MicroMsg.RemittanceHKUI", "do scene gen pay");
        doSceneProgress(new C70612t(Math.round(this.f204382e * 100.0d), this.f204384f, this.f204386h, this.f204354M, this.f204349H, this.f204391p, this.f204921g1, this.f204389n == 33 ? 1 : 0), true);
    }

    /* renamed from: Q7 */
    public void mo97277Q7() {
    }

    /* renamed from: S7 */
    public void mo97279S7() {
        C76912y0.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.i2b, new Object[]{this.f204922h1}), 0).show();
    }

    /* renamed from: X7 */
    public void mo97283X7() {
        if (!Util.isNullOrNil(this.f204923i1)) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.a7l);
            textView.setText(this.f204923i1);
            textView.setOnClickListener(new RemittanceHKUI$$c(this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 4 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1529);
        addSceneEndListener(1257);
        this.f204921g1 = getIntent().getIntExtra("hk_currency", 0);
        this.f204922h1 = getIntent().getStringExtra("hk_currencyuint");
        this.f204923i1 = getIntent().getStringExtra("hk_notice");
        this.f204924j1 = getIntent().getStringExtra("hk_notice_url");
        this.f204394r.setTitleText(this.f204922h1);
        this.f204342A.setText(this.f204922h1);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1529);
        removeSceneEndListener(1257);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        if (yVar instanceof C70612t) {
            C70612t tVar = (C70612t) yVar;
            if (i != 0 || i2 != 0) {
                C76879j.m92712F(getContext(), str, "", false);
            } else if (!Util.isNullOrNil(tVar.f204286f)) {
                String si = ((C76328d) C86312j.m106911c(C76328d.class)).mo106562si(tVar.f204286f);
                if (!Util.isNullOrNil(si)) {
                    Log.m105924i("MicroMsg.RemittanceHKUI", "start hk native cashier");
                    ((C76324c) C86312j.m106911c(C76324c.class)).handleHKNativeCashier(getContext(), si, new RemittanceHKUI$$a(this));
                    return;
                }
                C75228t.m90220M(getContext(), tVar.f204286f, false, 4);
            } else {
                Log.m105920e("MicroMsg.RemittanceHKUI", "empty payurl");
            }
        } else {
            super.onSceneEnd(i, i2, str, yVar, z);
        }
    }
}
