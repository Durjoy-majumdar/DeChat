package fk2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;

/* renamed from: fk2.d */
public final class C59133d implements C60897k<C59134f> {

    /* renamed from: a */
    public final /* synthetic */ C59123c f169130a;

    public C59133d(C59123c cVar) {
        this.f169130a = cVar;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C59134f) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C59134f) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C59134f fVar = (C59134f) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(fVar, "data");
        String str = "";
        if (Util.isNullOrNil(str)) {
            str = fVar.f169132e.mo62909j3();
            C87412m.m108593f(str, "data.contact.displayNick");
        }
        if (Util.isNullOrNil(str)) {
            str = fVar.f169132e.mo62913l2();
            C87412m.m108593f(str, "data.contact.alias");
        }
        C59123c cVar2 = this.f169130a;
        String username = fVar.f169132e.getUsername();
        C87412m.m108593f(username, "data.contact.username");
        int i2 = C59123c.f169109D;
        cVar2.dismiss();
        cVar2.f169113s.mo80850a(str, username);
    }
}
