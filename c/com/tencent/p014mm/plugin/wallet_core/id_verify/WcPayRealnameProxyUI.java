package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.io.IOException;
import nj3.C88989a;
import ob0.C117747y;
import s24.C77613a;
import te3.C77919e72;
import yq3.C79143a;
import z53.C79307e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI */
public class WcPayRealnameProxyUI extends WalletBaseUI {

    /* renamed from: d */
    public final IListener<WalletRealNameResultNotifyEvent> f209130d = new IListener<WalletRealNameResultNotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 323604482;
        }

        public boolean callback(IEvent iEvent) {
            WcPayRealnameProxyUI.this.f209130d.dead();
            int i = ((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a;
            if (i != -1 && i != 0) {
                return false;
            }
            WcPayRealnameProxyUI.this.finish();
            return false;
        }
    };

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.WcPayRealnameProxyUI", "on create");
        super.onCreate(bundle);
        C85875k4.m106187i0(this, getResources().getColor(C0966R.color.ahf));
        this.f209130d.alive();
        Log.m105924i("MicroMsg.WcPayRealnameProxyUI", "do get wording");
        C79307e eVar = new C79307e(getInput().getString("key_realname_sessionid"));
        addSceneEndListener(1666);
        doSceneProgress(eVar);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.WcPayRealnameProxyUI", "on destroy");
        this.f209130d.dead();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        removeSceneEndListener(1666);
        C79307e eVar = (C79307e) yVar;
        C77919e72 e722 = eVar.f232825i;
        if (e722 == null) {
            C79143a.m95764c(getContext(), getInput(), 0);
            finish();
            return false;
        }
        try {
            String str2 = new String(e722.toByteArray(), C77613a.f226275a);
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_get_wording_cache", str2);
            bundle.putAll(getInput());
            bundle.putInt("real_name_verify_mode", 4);
            bundle.putBoolean("realname_verify_process_show_bindcard_page", eVar.f232825i.f227215D);
            getInput().putBoolean("realname_verify_process_verify_sms_without_bindcard", eVar.f232825i.f227219H);
            C79143a.m95765d(getContext(), bundle);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WcPayRealnameProxyUI", e, "", new Object[0]);
        }
        return false;
    }
}
