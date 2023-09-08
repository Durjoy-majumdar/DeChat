package d83;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: d83.f */
public final class C97447f implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C97448g f286026d;

    public C97447f(C97448g gVar) {
        this.f286026d = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C97453j jVar = this.f286026d.f286032n;
        if (jVar != null) {
            Log.m105924i(jVar.f286050g, "dismiss dialog");
            jVar.f286048e.f228421i = jVar.f286052i.getInEditTextQuery();
            jVar.f286049f.onDismiss();
            jVar.f286054n.mo126345e();
            jVar.f286055o.removeJavascriptInterface("tagWebSearchJSApi");
            jVar.f286055o.destroy();
        }
        C97454k kVar = this.f286026d.f286033o;
        if (kVar != null) {
            kVar.f286062j.mo126345e();
            kVar.f286063n.removeJavascriptInterface("tagWebSearchJSApi");
            kVar.f286063n.destroy();
        }
    }
}
