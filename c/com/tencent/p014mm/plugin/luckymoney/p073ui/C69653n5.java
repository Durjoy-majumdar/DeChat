package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.KeyEvent;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n5 */
public class C69653n5 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyWishFooter f201037a;

    public C69653n5(LuckyMoneyWishFooter luckyMoneyWishFooter) {
        this.f201037a = luckyMoneyWishFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            this.f201037a.f200836p.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsCommentFooter", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        this.f201037a.f200836p.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
        this.f201037a.f200836p.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
