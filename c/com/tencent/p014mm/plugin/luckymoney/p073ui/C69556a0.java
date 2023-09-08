package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.ImageView;
import com.tencent.p014mm.autogen.events.GetFestivalLuckyMoneyResEvent;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a0 */
public class C69556a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GetFestivalLuckyMoneyResEvent f200846d;

    /* renamed from: e */
    public final /* synthetic */ C69158a0 f200847e;

    /* renamed from: f */
    public final /* synthetic */ LuckyMoneyDetailUI f200848f;

    public C69556a0(LuckyMoneyDetailUI luckyMoneyDetailUI, GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent, C69158a0 a0Var) {
        this.f200848f = luckyMoneyDetailUI;
        this.f200846d = getFestivalLuckyMoneyResEvent;
        this.f200847e = a0Var;
    }

    public void run() {
        this.f200846d.f193650e.getClass();
        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
        ImageView imageView = this.f200848f.f199872i;
        C69158a0 a0Var = this.f200847e;
        C69242l1.m81595a(imageView, a0Var.f198970j, a0Var.f198954Q);
    }
}
