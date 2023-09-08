package iw0;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.biz.scheme.BizComSchIntermediateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.IOException;
import ke3.C88144b;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C50727ot;

/* renamed from: iw0.b */
public final class C46291b extends C46290a {

    /* renamed from: a */
    public final String f124739a = "MicroMsg.BizSchemeH5Page";

    /* renamed from: a */
    public boolean mo71703a(BizComSchIntermediateUI bizComSchIntermediateUI, C89349b bVar, C89349b bVar2, String str) {
        C87412m.m108594g(bizComSchIntermediateUI, "ui");
        C87412m.m108594g(bVar, "actionBuffer");
        C50727ot otVar = new C50727ot();
        try {
            otVar.parseFrom(bVar.mo123703f());
            Intent intent = new Intent();
            intent.putExtra("rawUrl", otVar.f139356d);
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra("KRightBtn", true);
            C88144b.m109791i(bizComSchIntermediateUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C89779i0 i0Var = bizComSchIntermediateUI.f108999h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return true;
        } catch (IOException e) {
            String str2 = this.f124739a;
            Log.m105920e(str2, "e = " + e.getMessage());
            return false;
        }
    }
}
