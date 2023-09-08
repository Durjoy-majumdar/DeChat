package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108494d2;
import rx3.C13598b0;
import te3.o74;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.x */
public final class C55361x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55341p0 f157655d;

    /* renamed from: e */
    public final /* synthetic */ C28971l<o74> f157656e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55361x(C55341p0 p0Var, C28971l<o74> lVar) {
        super(0);
        this.f157655d = p0Var;
        this.f157656e = lVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.MusicSearchPanel", "MusicList: ");
        C55341p0 p0Var = this.f157655d;
        C28971l<o74> lVar = this.f157656e;
        p0Var.getClass();
        C87412m.m108594g(lVar, "snsMusicInfoWrapper");
        o74 o74 = (o74) lVar.f79451a;
        Log.m105924i("MicroMsg.MusicSearchPanel", "selectedMusic: " + o74.f139006d);
        if (C87412m.m108589b(((o74) ((C28971l) ((C108494d2) p0Var.f157607n).getValue()).f79451a).f139006d, o74.f139006d)) {
            Log.m105928w("MicroMsg.MusicSearchPanel", "selectedMusic: already selected this music, skip");
        } else {
            String str = o74.f139006d;
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                String str2 = o74.f139007e;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    ((C108494d2) p0Var.f157606j).setValue(lVar);
                    C55302j jVar = p0Var.f157603g;
                    String str3 = o74.f139006d;
                    C87412m.m108593f(str3, "snsMusicInfo.music_id");
                    jVar.mo76613d(str3);
                    C53895h.m60466d(p0Var.f157600d, (C66212f) null, (C53934p0) null, new C55348r0(p0Var, o74, (C15601d<? super C55348r0>) null), 3, (Object) null);
                }
            }
            Log.m105920e("MicroMsg.MusicSearchPanel", "selectedMusic: musicId or musicUrl is null, " + o74.f139006d + ", " + o74.f139007e);
        }
        return C13598b0.f38549a;
    }
}
