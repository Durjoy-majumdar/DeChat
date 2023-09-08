package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.ImageView;
import com.tencent.p014mm.autogen.events.GetFestivalLuckyMoneyResEvent;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f */
public class C69588f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GetFestivalLuckyMoneyResEvent f200899d;

    /* renamed from: e */
    public final /* synthetic */ C69158a0 f200900e;

    /* renamed from: f */
    public final /* synthetic */ LuckyMoneyBusiDetailUI f200901f;

    public C69588f(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent, C69158a0 a0Var) {
        this.f200901f = luckyMoneyBusiDetailUI;
        this.f200899d = getFestivalLuckyMoneyResEvent;
        this.f200900e = a0Var;
    }

    public void run() {
        this.f200899d.f193650e.getClass();
        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
        if (!Util.isNullOrNil(this.f200900e.f198970j)) {
            ImageView imageView = this.f200901f.f199695h;
            C69158a0 a0Var = this.f200900e;
            C69242l1.m81595a(imageView, a0Var.f198970j, a0Var.f198954Q);
        }
    }
}
