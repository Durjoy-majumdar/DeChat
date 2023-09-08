package rs1;

import android.content.Context;
import android.content.DialogInterface;
import gy3.C87412m;
import org.json.JSONObject;
import pf1.C11901h;
import pf1.C11920q;

/* renamed from: rs1.p4 */
public final class C13363p4 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ Context f37872d;

    /* renamed from: e */
    public final /* synthetic */ C11920q f37873e;

    public C13363p4(Context context, C11920q qVar) {
        this.f37872d = context;
        this.f37873e = qVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C11901h hVar = C11901h.f34775a;
        Context context = this.f37872d;
        C11920q qVar = this.f37873e;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(qVar, "infoEx");
        C11901h.m11610a(hVar, context, "feed_jumpicon_halfscreenleave", 1, qVar, 0, 1, (JSONObject) null, 80, (Object) null);
    }
}
