package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import p175j0.C60690y0;
import rx3.C13598b0;
import te3.C49103d62;
import te3.C49941j40;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.h */
public final class C55629h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158332d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C49103d62> f158333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55629h(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C60690y0<C49103d62> y0Var) {
        super(0);
        this.f158332d = emojiStoreV2DesignerUI;
        this.f158333e = y0Var;
    }

    public Object invoke() {
        EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158332d;
        C60690y0<C49103d62> y0Var = this.f158333e;
        int i = EmojiStoreV2DesignerUI.f312432w;
        C49941j40 j402 = y0Var.getValue().f132152o;
        String str = j402 != null ? j402.f135855e : null;
        C87412m.m108591d(str);
        Class cls = C60200t1.class;
        Log.m105925i(emojiStoreV2DesignerUI.f312433d, "go2Finder: %s", str);
        if (Util.isNullOrNil(str)) {
            Log.m105928w(emojiStoreV2DesignerUI.f312433d, "go2Finder: username is empty");
        } else {
            Intent intent = new Intent();
            intent.putExtra("finder_username", str);
            boolean b = C87412m.m108589b(str, C75592q0.m90778h());
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(14, 2, b ? 33 : 32, intent);
            intent.putExtra("KEY_FINDER_SELF_FLAG", b);
            AppCompatActivity context = emojiStoreV2DesignerUI.getContext();
            C87412m.m108593f(context, "context");
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
        }
        return C13598b0.f38549a;
    }
}
