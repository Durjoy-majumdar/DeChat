package com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75674c;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import u32.C65209a;
import v32.C78324a;
import v32.C78325b;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI */
public class LuckyMoneyHKBeforeDetailUI extends LuckyMoneyBaseUI {

    /* renamed from: j */
    public static final String f198903j = MMApplicationContext.getContext().getResources().getString(C0966R.string.l_3);

    /* renamed from: g */
    public Dialog f198904g;

    /* renamed from: h */
    public String f198905h;

    /* renamed from: i */
    public C65209a f198906i;

    /* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI$a */
    public class C69153a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI$a$a */
        public class C69154a implements Runnable {
            public C69154a() {
            }

            public void run() {
                LuckyMoneyHKBeforeDetailUI.this.finish();
            }
        }

        public C69153a() {
        }

        public void run() {
            Intent intent = new Intent(LuckyMoneyHKBeforeDetailUI.this.getContext(), LuckyMoneyDetailUI.class);
            intent.putExtras(LuckyMoneyHKBeforeDetailUI.this.getIntent());
            intent.putExtra("key_hk_flag", 1);
            LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI = LuckyMoneyHKBeforeDetailUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI2 = luckyMoneyHKBeforeDetailUI;
            C117292a.m165358d(luckyMoneyHKBeforeDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyHKBeforeDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyHKBeforeDetailUI2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            MMHandlerThread.postToMainThreadDelayed(new C69154a(), 500);
        }
    }

    /* renamed from: J7 */
    public final void mo95300J7(boolean z) {
        Log.m105924i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "go to detail ui");
        Dialog dialog = this.f198904g;
        if (dialog != null) {
            dialog.dismiss();
        }
        C69153a aVar = new C69153a();
        if (z) {
            MMHandlerThread.postToMainThreadDelayed(aVar, 100);
        } else {
            aVar.run();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        C69158a0 a0Var;
        super.onCreate(bundle);
        overridePendingTransition(0, C0966R.C0968anim.f2482e6);
        C85875k4.m106187i0(this, getResources().getColor(C0966R.color.ahf));
        setContentViewVisibility(8);
        this.f198905h = getIntent().getStringExtra("key_sendid");
        String stringExtra = getIntent().getStringExtra("key_native_url");
        int intExtra = getIntent().getIntExtra("key_jump_from", 2);
        Log.m105924i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "sendid=" + Util.nullAsNil(this.f198905h) + ", nativeurl=" + Util.nullAsNil(stringExtra) + ", jumpFrom=" + intExtra);
        if (intExtra == 2) {
            if (C75674c.m90929a(this.f198905h) != null) {
                mo95300J7(false);
                return;
            }
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_detail_info");
                if (!(byteArrayExtra == null || (a0Var = (C69158a0) new C69158a0().parseFrom(byteArrayExtra)) == null)) {
                    C75674c.m90930b(this.f198905h, a0Var);
                    mo95300J7(false);
                    return;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + e.getLocalizedMessage());
            }
        }
        if (Util.isNullOrNil(this.f198905h) && !Util.isNullOrNil(stringExtra)) {
            try {
                this.f198905h = Uri.parse(stringExtra).getQueryParameter("sendid");
            } catch (Exception unused) {
            }
        }
        if (!Util.isNullOrNil(this.f198905h)) {
            String str = this.f198905h;
            this.f198904g = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C78324a(this));
            Log.m105924i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail");
            C65209a aVar = new C65209a(stringExtra, str, 11, 0, 1, getIntent().getIntExtra("key_hk_scene", 0));
            this.f198906i = aVar;
            aVar.mo9225i().mo123062e(new C78325b(this, str)).mo11397F(this);
            return;
        }
        Log.m105928w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "sendid null or nil, finish");
        finish();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
