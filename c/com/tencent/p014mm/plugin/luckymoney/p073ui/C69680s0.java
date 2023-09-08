package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C75339i;
import di3.C86312j;
import eb0.C75597w2;
import java.util.HashSet;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s0 */
public class C69680s0 implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C69236j1 f201072a;

    /* renamed from: b */
    public final /* synthetic */ TextView f201073b;

    /* renamed from: c */
    public final /* synthetic */ LuckyMoneyDetailUI.C69393u f201074c;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.s0$a */
    public class C69681a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f201075d;

        public C69681a(String str) {
            this.f201075d = str;
        }

        public void run() {
            C69680s0 s0Var = C69680s0.this;
            ((HashSet) LuckyMoneyDetailUI.this.f199800D1).remove(s0Var.f201072a.f199219n);
            if (C69680s0.this.f201073b.getTag() != null) {
                if (this.f201075d.equals((String) C69680s0.this.f201073b.getTag())) {
                    AppCompatActivity context = LuckyMoneyDetailUI.this.getContext();
                    C69680s0 s0Var2 = C69680s0.this;
                    C69242l1.m81616v(context, s0Var2.f201073b, s0Var2.f201072a.f199212d);
                }
            }
        }
    }

    public C69680s0(LuckyMoneyDetailUI.C69393u uVar, C69236j1 j1Var, TextView textView) {
        this.f201074c = uVar;
        this.f201072a = j1Var;
        this.f201073b = textView;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        Log.m105927v("MicroMsg.LuckyMoneyParseHelper", "getContact suc, user: %s", str);
        if (z) {
            this.f201072a.f199212d = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f201072a.f199219n);
            this.f201072a.f199222q = false;
            ((C119157j) C119157j.f356862d).mo183868B(new C69681a(str));
        }
    }
}
