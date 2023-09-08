package mx0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import kx0.C46786o;
import te3.C49280eg;
import zb2.C66777a;

/* renamed from: mx0.e */
public final class C47111e extends C66777a<C47111e> {

    /* renamed from: d */
    public final C49280eg f126587d;

    /* renamed from: e */
    public final C47118m f126588e;

    /* renamed from: f */
    public String f126589f;

    public C47111e(C49280eg egVar, C47118m mVar, boolean z, int i, C8480h hVar) {
        String str;
        mVar = (i & 2) != 0 ? C47118m.RECORD : mVar;
        C87412m.m108594g(egVar, "appMsgInfo");
        C87412m.m108594g(mVar, "itemType");
        this.f126587d = egVar;
        this.f126588e = mVar;
        if (egVar.f132912h > 0) {
            C46786o oVar = C46786o.f125904a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            str = oVar.mo72010a(context, ((long) egVar.f132912h) * ((long) 1000));
        } else {
            str = "";
        }
        this.f126589f = str;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f126587d.f132915n + this.f126587d.f132916o + this.f126587d.f132917p + this.f126589f;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f126588e.f126605d;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C47111e) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C47111e eVar = (C47111e) obj;
        C87412m.m108594g(eVar, "other");
        return C87412m.m108589b(this.f126587d.f132910f, eVar.f126587d.f132910f) && C87412m.m108589b(this.f126587d.f132911g, eVar.f126587d.f132911g) && C87412m.m108589b(this.f126587d.f132909e, eVar.f126587d.f132909e) && C87412m.m108589b(this.f126589f, eVar.f126589f);
    }
}
