package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.remittance.model.C70606l0;
import com.tencent.p014mm.plugin.remittance.model.C70613u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wechat.aff.ting.TingClientProto;
import eb0.C75592q0;
import ie3.C76331i;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import q43.C77302a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect */
public class RemittanceOSRedirect extends WalletBaseUI {

    /* renamed from: d */
    public String f205099d = "";

    /* renamed from: e */
    public int f205100e;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect$a */
    public class C70825a implements DialogInterface.OnClickListener {
        public C70825a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RemittanceOSRedirect.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect$b */
    public class C70826b implements DialogInterface.OnClickListener {
        public C70826b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RemittanceOSRedirect.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
        this.f205100e = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f205099d = getIntent().getStringExtra("receiver_name");
        int i = this.f205100e;
        if (i == 0) {
            Log.m105921e("MicroMsg.RemittanceOSRedirect", "error scene: %s", Integer.valueOf(i));
            finish();
        } else if (i == 5) {
            this.mNetSceneMgr.mo105624c(1574);
            doSceneProgress(new C70606l0(C75592q0.m90784n()));
        } else if (i == 6) {
            this.mNetSceneMgr.mo105624c(TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
            doSceneProgress(new C70613u(this.f205099d), true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        int i = this.f205100e;
        if (i == 5) {
            removeSceneEndListener(1574);
        } else if (i == 6) {
            removeSceneEndListener(TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C70606l0) {
                C70606l0 l0Var = (C70606l0) yVar;
                Log.m105925i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", l0Var.f204272g);
                Intent intent = getIntent();
                if (l0Var.f204271f == 1) {
                    C76331i.m91764h(this, 2, this.f205099d, 11, (C77302a) null, (Bundle) null);
                } else {
                    intent.setClass(this, RemittanceOSUI.class);
                    intent.putExtra("os_currency", l0Var.f204271f);
                    intent.putExtra("os_currencyuint", l0Var.f204272g);
                    intent.putExtra("os_currencywording", l0Var.f204273h);
                    intent.putExtra("os_notice", l0Var.f204274i);
                    intent.putExtra("os_notice_url", l0Var.f204275j);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                finish();
            } else if (yVar instanceof C70613u) {
                C70613u uVar = (C70613u) yVar;
                Intent intent2 = new Intent();
                intent2.setClass(this, RemittanceHKUI.class);
                this.f205099d = uVar.f204287f;
                intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f205100e);
                intent2.putExtra("fee", ((double) uVar.f204291j) / 100.0d);
                intent2.putExtra("desc", uVar.f204290i);
                intent2.putExtra("scan_remittance_id", uVar.f204295q);
                intent2.putExtra("receiver_name", uVar.f204287f);
                intent2.putExtra("receiver_true_name", uVar.f204288g);
                intent2.putExtra("receiver_nick_name", uVar.f204289h);
                intent2.putExtra("hk_currency", uVar.f204293o);
                intent2.putExtra("hk_currencyuint", uVar.f204294p);
                intent2.putExtra("hk_notice", uVar.f204296r);
                intent2.putExtra("hk_notice_url", uVar.f204297s);
                intent2.putExtra("recv_headimgurl", uVar.f204298t);
                int i3 = uVar.f204292n;
                int i4 = 32;
                Log.m105925i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", Integer.valueOf(i3));
                if (i3 == 1) {
                    i4 = 33;
                }
                intent2.putExtra("pay_scene", i4);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            }
        } else if (yVar instanceof C70606l0) {
            Log.m105925i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", str);
            C70606l0 l0Var2 = (C70606l0) yVar;
            C76879j.m92749t(this, str, "", new C70825a());
        } else if (yVar instanceof C70613u) {
            C76879j.m92749t(this, str, "", new C70826b());
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return true;
    }
}
