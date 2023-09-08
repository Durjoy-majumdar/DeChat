package com.tencent.p014mm.plugin.wallet_core.utils;

import android.widget.ImageView;
import b63.C67183e;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import g63.C75886j;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.d */
public class C72496d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67183e f210893d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f210894e;

    /* renamed from: f */
    public final /* synthetic */ BankcardLogoHelper.C72484c f210895f;

    public C72496d(BankcardLogoHelper bankcardLogoHelper, C67183e eVar, ImageView imageView, BankcardLogoHelper.C72484c cVar) {
        this.f210893d = eVar;
        this.f210894e = imageView;
        this.f210895f = cVar;
    }

    public void run() {
        Class cls = C102720b.class;
        if (!Util.isNullOrNil(this.f210893d.f192877c)) {
            this.f210894e.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(this.f210893d.f192877c)));
            ((C102720b) C86312j.m106911c(cls)).Lu0(this.f210895f);
            return;
        }
        int i = this.f210893d.f192880f;
        if (i > 0) {
            this.f210894e.setImageResource(i);
        }
    }
}
