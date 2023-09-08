package com.tencent.p014mm.plugin.luckymoney.p073ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C75339i;
import di3.C86312j;
import eb0.C75597w2;
import java.util.HashSet;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.c0 */
public class C69573c0 implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C69158a0 f200876a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyDetailUI f200877b;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.c0$a */
    public class C69574a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f200878d;

        public C69574a(String str) {
            this.f200878d = str;
        }

        public void run() {
            ((HashSet) C69573c0.this.f200877b.f199800D1).remove(this.f200878d);
            C69573c0.this.f200876a.f198969i = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(C69573c0.this.f200876a.f198954Q);
            AppCompatActivity context = C69573c0.this.f200877b.getContext();
            C69573c0 c0Var = C69573c0.this;
            LuckyMoneyDetailUI luckyMoneyDetailUI = c0Var.f200877b;
            C69242l1.m81616v(context, luckyMoneyDetailUI.f199875j, luckyMoneyDetailUI.getString(C0966R.string.gjt, new Object[]{c0Var.f200876a.f198969i}));
        }
    }

    public C69573c0(LuckyMoneyDetailUI luckyMoneyDetailUI, C69158a0 a0Var) {
        this.f200877b = luckyMoneyDetailUI;
        this.f200876a = a0Var;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        Log.m105927v("MicroMsg.LuckyMoneyParseHelper", "getContact suc, user: %s", str);
        if (z) {
            ((C119157j) C119157j.f356862d).mo183868B(new C69574a(str));
        }
    }
}
