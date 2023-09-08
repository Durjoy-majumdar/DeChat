package d00;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bp3.C79758p;
import com.tencent.p014mm.p136ui.halfscreen.custom.WebSearchHomeHalfScreen;
import com.tencent.p014mm.p136ui.halfscreen.custom.WebSearchMoreHalfScreen;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import e00.C7573h0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import ke3.C88144b;
import oa1.C117731d;
import org.xwalk.core.XWalkEnvironment;
import v93.C14419a;
import v93.C14421b;
import yb2.C79062b;
import yf3.C112444g;
import yf3.C39008h;
import zl3.C79397a;

@C86522b
/* renamed from: d00.s0 */
public final class C75317s0 extends C86301e implements C7573h0 {
    /* renamed from: LC */
    public void mo8674LC(Context context, Intent intent, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (z || C79758p.f233760a.mo109883f(new C112444g()) == 1) {
            C79062b.m95631b(intent, C14421b.class);
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.mo109373c(intent);
            C79397a aVar2 = aVar.f232918a;
            aVar2.f232909a = context;
            aVar2.f232917i = true;
            if (C44594n1.m49046b()) {
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            } else {
                C79397a aVar3 = aVar.f232918a;
                aVar3.getClass();
                aVar3.f232915g = XWalkEnvironment.MODULE_TOOLS;
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
            }
            aVar.mo109372b(WebSearchMoreHalfScreen.class);
            aVar.mo109374d();
            return;
        }
        C88144b.m109806x(context, intent, (Bundle) null);
    }

    /* renamed from: kO */
    public void mo8675kO(Context context, Intent intent, int i, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (z || C79758p.f233760a.mo109883f(new C112444g()) == 1) {
            C79062b.m95631b(intent, C14421b.class);
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.mo109373c(intent);
            C79397a aVar2 = aVar.f232918a;
            aVar2.f232909a = context;
            aVar2.f232917i = true;
            if (C44594n1.m49046b()) {
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            } else {
                C79397a aVar3 = aVar.f232918a;
                aVar3.getClass();
                aVar3.f232915g = XWalkEnvironment.MODULE_TOOLS;
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
            }
            aVar.mo109372b(WebSearchMoreHalfScreen.class);
            aVar.f232918a.f232914f = i;
            aVar.mo109374d();
            return;
        }
        List<C88144b.C9613e> list = C88144b.f254911a;
        if (C44594n1.m49046b()) {
            C88144b.m109795m(context, "webview", ".ui.tools.fts.MMFTSSearchTabWebViewUI", intent, i);
        } else {
            C88144b.m109795m(context, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", intent, i);
        }
    }

    public void n10(Context context, Intent intent, boolean z, boolean z2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (z || C79758p.f233760a.mo109883f(new C112444g()) == 1) {
            if (z2) {
                C79062b.m95631b(intent, C14421b.class);
            } else {
                C79062b.m95631b(intent, C14419a.class);
            }
            boolean z3 = !z2 && C117731d.m166007c().mo182440a(new C39008h()) == 1;
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.mo109373c(intent);
            C79397a aVar2 = aVar.f232918a;
            aVar2.f232909a = context;
            aVar2.f232916h = z3;
            aVar2.f232917i = true;
            if (C44594n1.m49046b()) {
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI");
            } else {
                C79397a aVar3 = aVar.f232918a;
                aVar3.getClass();
                aVar3.f232915g = XWalkEnvironment.MODULE_TOOLS;
                aVar.mo109371a(MMApplicationContext.getApplicationId() + ".plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
            }
            if (z2) {
                aVar.mo109372b(WebSearchMoreHalfScreen.class);
            } else {
                aVar.mo109372b(WebSearchHomeHalfScreen.class);
            }
            aVar.mo109374d();
            return;
        }
        C88144b.m109805w(context, intent);
    }
}
