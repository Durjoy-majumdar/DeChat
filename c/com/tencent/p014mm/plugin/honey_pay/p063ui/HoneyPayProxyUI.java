package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import q02.C47748l;
import q02.C47749m;
import t02.C48527c;
import te3.C50957qg2;
import te3.C51121rk3;
import te3.C51409tk3;
import u02.C52413m;
import u02.C52414n;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI */
public class HoneyPayProxyUI extends HoneyPayBaseUI {

    /* renamed from: h */
    public static final /* synthetic */ int f114888h = 0;

    /* renamed from: f */
    public boolean f114889f;

    /* renamed from: g */
    public String f114890g;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI$a */
    public class C42447a implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47748l f114891a;

        public C42447a(C47748l lVar) {
            this.f114891a = lVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            C50957qg2 qg22 = this.f114891a.f128265r.f140978f;
            if (qg22 != null) {
                Log.m105925i(HoneyPayProxyUI.this.f114712d, "state: %s", Integer.valueOf(qg22.f140299g));
            }
            HoneyPayProxyUI honeyPayProxyUI = HoneyPayProxyUI.this;
            C51121rk3 rk32 = this.f114891a.f128265r;
            int i3 = HoneyPayProxyUI.f114888h;
            Log.m105924i(honeyPayProxyUI.f114712d, "go to manager ui");
            Intent intent = new Intent(honeyPayProxyUI, HoneyPayCardManagerUI.class);
            intent.putExtra("key_card_no", honeyPayProxyUI.f114890g);
            try {
                byte[] byteArray = rk32.toByteArray();
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_qry_response", byteArray);
            } catch (IOException e) {
                Log.printErrStackTrace(honeyPayProxyUI.f114712d, e, "", new Object[0]);
                intent.putExtra("key_scene", 0);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            HoneyPayProxyUI honeyPayProxyUI2 = honeyPayProxyUI;
            C117292a.m165358d(honeyPayProxyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayProxyUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(honeyPayProxyUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            HoneyPayProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI$b */
    public class C42448b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47749m f114893a;

        public C42448b(C47749m mVar) {
            this.f114893a = mVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105925i(HoneyPayProxyUI.this.f114712d, "state: %s", Integer.valueOf(this.f114893a.f128266r.f142260f.f140897g));
            C51409tk3 tk32 = this.f114893a.f128266r;
            if (tk32.f142260f.f140897g == 1) {
                HoneyPayProxyUI honeyPayProxyUI = HoneyPayProxyUI.this;
                int i3 = HoneyPayProxyUI.f114888h;
                Log.m105924i(honeyPayProxyUI.f114712d, "go to receive card ui");
                Intent intent = new Intent(honeyPayProxyUI, HoneyPayReceiveCardUI.class);
                intent.putExtra("key_card_no", honeyPayProxyUI.f114890g);
                try {
                    byte[] byteArray = tk32.toByteArray();
                    intent.putExtra("key_scene", 1);
                    intent.putExtra("key_qry_response", byteArray);
                } catch (IOException e) {
                    Log.printErrStackTrace(honeyPayProxyUI.f114712d, e, "", new Object[0]);
                    intent.putExtra("key_scene", 0);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                HoneyPayProxyUI honeyPayProxyUI2 = honeyPayProxyUI;
                C117292a.m165358d(honeyPayProxyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                honeyPayProxyUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(honeyPayProxyUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                HoneyPayProxyUI honeyPayProxyUI3 = HoneyPayProxyUI.this;
                int i4 = HoneyPayProxyUI.f114888h;
                Log.m105924i(honeyPayProxyUI3.f114712d, "go to card detail");
                Intent intent2 = new Intent(honeyPayProxyUI3, HoneyPayCardDetailUI.class);
                intent2.putExtra("key_card_no", honeyPayProxyUI3.f114890g);
                intent2.putExtra("key_scene", 1);
                try {
                    intent2.putExtra("key_qry_response", tk32.toByteArray());
                } catch (IOException e2) {
                    Log.printErrStackTrace(honeyPayProxyUI3.f114712d, e2, "", new Object[0]);
                }
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                HoneyPayProxyUI honeyPayProxyUI4 = honeyPayProxyUI3;
                C117292a.m165358d(honeyPayProxyUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                honeyPayProxyUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(honeyPayProxyUI4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            HoneyPayProxyUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public void mo66493H7() {
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2876);
        addSceneEndListener(2613);
        this.f114889f = getIntent().getBooleanExtra("key_is_payer", false);
        this.f114890g = getIntent().getStringExtra("key_card_no");
        Log.m105925i(this.f114712d, "is payer: %s", Boolean.valueOf(this.f114889f));
        if (C48527c.m53911g()) {
            Class cls = C76324c.class;
            finish();
            ITransmitKvData create = ITransmitKvData.create();
            if (this.f114889f) {
                create.putString("card_no", this.f114890g);
                create.putInt("request_source_type", 2);
                ((C76324c) C86312j.m106911c(cls)).startUseCase("HoneyPayPayerDetailUseCase", create, new C52413m(this));
                return;
            }
            create.putString("card_id", this.f114890g);
            ((C76324c) C86312j.m106911c(cls)).startUseCase("honeyPayReceiverUseCase", create, new C52414n(this));
        } else if (this.f114889f) {
            Log.m105924i(this.f114712d, "do qry payer detail");
            C47748l lVar = new C47748l(this.f114890g);
            lVar.mo104821m1(this);
            doSceneProgress(lVar, true);
        } else {
            C47749m mVar = new C47749m(this.f114890g);
            mVar.mo104821m1(this);
            doSceneProgress(mVar, true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2876);
        removeSceneEndListener(2613);
    }

    public boolean onProgressFinish() {
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C47748l) {
            C47748l lVar = (C47748l) yVar;
            lVar.mo104823q1(new C42447a(lVar));
            return true;
        } else if (!(yVar instanceof C47749m)) {
            return true;
        } else {
            C47749m mVar = (C47749m) yVar;
            mVar.mo104823q1(new C42448b(mVar));
            return true;
        }
    }
}
