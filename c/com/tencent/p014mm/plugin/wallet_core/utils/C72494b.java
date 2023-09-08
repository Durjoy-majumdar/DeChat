package com.tencent.p014mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.b */
public class C72494b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BankcardLogoHelper.C72484c f210887d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f210888e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f210889f;

    public C72494b(BankcardLogoHelper bankcardLogoHelper, BankcardLogoHelper.C72484c cVar, ImageView imageView, Bitmap bitmap) {
        this.f210887d = cVar;
        this.f210888e = imageView;
        this.f210889f = bitmap;
    }

    public void run() {
        Bankcard bankcard = this.f210887d.f210847d;
        String str = (String) this.f210888e.getTag(C0966R.C0970id.lga);
        if (Util.isNullOrNil(str) || ((C75592q0.m90763K() || !str.equals(bankcard.field_bankcardType)) && (!C75592q0.m90763K() || !str.equals(bankcard.field_bankName)))) {
            Log.m105919d("MicroMsg.BankcardLogoHelper", "not match tag: %s, banktype: %s, iv: %s", str, bankcard.field_bankcardType, this.f210888e);
            return;
        }
        this.f210888e.setImageBitmap(this.f210889f);
    }
}
