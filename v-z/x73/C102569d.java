package x73;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$d;

/* renamed from: x73.d */
public final class C102569d implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C102570e f302013d;

    public C102569d(C102570e eVar) {
        this.f302013d = eVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C102575h hVar = this.f302013d.f302019n;
        if (hVar != null) {
            Log.m105924i(hVar.f302036g, "dismiss dialog");
            hVar.f302034e.f298981i = hVar.f302038i.getInEditTextQuery();
            hVar.f302038i.mo70335c();
            hVar.f302038i.mo70339g();
            SmileyPanelManager$$d smileyPanelManager$$d = (SmileyPanelManager$$d) hVar.f302035f;
            C72837v1 v1Var = smileyPanelManager$$d.f285743a.f285696A;
            if (v1Var != null) {
                v1Var.mo65588b(false, 0);
            }
            Runnable runnable = smileyPanelManager$$d.f285743a.f285700E;
            if (runnable != null) {
                runnable.run();
                smileyPanelManager$$d.f285743a.f285700E = null;
            }
            hVar.f302040n.mo126345e();
            if (hVar.f302042p) {
                hVar.f302041o.setBackgroundColor(0);
                hVar.f302041o.getBackground().setAlpha(0);
                hVar.f302041o.getSettings().setForceDarkMode(0);
            }
            hVar.f302041o.removeJavascriptInterface("emojiWebSearchJSApi");
            hVar.f302041o.destroy();
        }
        C102576i iVar = this.f302013d.f302020o;
        if (iVar != null) {
            iVar.f302049j.mo126345e();
            if (iVar.f302051o) {
                iVar.f302050n.getSettings().setForceDarkMode(0);
            }
            iVar.f302050n.removeJavascriptInterface("emojiWebSearchJSApi");
            iVar.f302050n.destroy();
        }
    }
}
