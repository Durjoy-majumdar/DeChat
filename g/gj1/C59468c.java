package gj1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import p671qy.C63344h;

/* renamed from: gj1.c */
public final class C59468c {

    /* renamed from: a */
    public final String f169938a = ((C63344h) C86312j.m106911c(C63344h.class)).mo88249xp();

    /* renamed from: b */
    public boolean f169939b;

    /* renamed from: c */
    public C87667c<?, ?>.a f169940c;

    /* renamed from: a */
    public final void mo84569a(Context context, String str, long j) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "finderUserName");
        Log.m105924i("Finder.FinderLiveFrameSetSurfaceMgr", "createFrameSetRoot now:" + this.f169940c);
        if (this.f169940c == null) {
            this.f169940c = ((C63344h) C86312j.m106911c(C63344h.class)).qf0(new Object(), context, new C63344h.C63345a(str, j, (String) null, 4, (C8480h) null));
        }
    }

    /* renamed from: b */
    public final void mo84570b() {
        String str;
        Log.m105924i("Finder.FinderLiveFrameSetSurfaceMgr", "unMount");
        C87667c<?, ?>.a aVar = this.f169940c;
        if (!(aVar == null || (str = aVar.f253930e) == null)) {
            ((C63344h) C86312j.m106911c(C63344h.class)).mo88242Eu(str);
        }
        this.f169940c = null;
    }
}
