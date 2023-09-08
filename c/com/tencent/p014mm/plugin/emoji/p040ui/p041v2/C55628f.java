package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;
import te3.C49103d62;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.f */
public final class C55628f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158331d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55628f(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        super(0);
        this.f158331d = emojiStoreV2DesignerUI;
    }

    public Object invoke() {
        EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158331d;
        C49103d62 value = emojiStoreV2DesignerUI.f312446t.f294838d.getValue();
        if (value != null && !Util.isNullOrNil(value.f132148h)) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", value.f132148h);
            C88144b.m109791i(emojiStoreV2DesignerUI.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(12067, 3, "", "", "", "");
        }
        return C13598b0.f38549a;
    }
}
