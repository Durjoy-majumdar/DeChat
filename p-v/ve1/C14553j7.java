package ve1;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import gy3.C87412m;
import jq3.C60905o;
import mo1.C11025q;

/* renamed from: ve1.j7 */
public final class C14553j7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40329d;

    /* renamed from: e */
    public final /* synthetic */ String f40330e;

    public C14553j7(C60905o oVar, String str) {
        this.f40329d = oVar;
        this.f40330e = str;
    }

    public final void run() {
        C39818r rVar = C39818r.f106831a;
        Context context = this.f40329d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C11025q.class);
        C87412m.m108593f(a, "UICProvider.of(holder.co…rofileEduUIC::class.java)");
        C11025q.m10965k3((C11025q) a, "mv", 0, this.f40330e, 0, (String) null, 24, (Object) null);
    }
}
