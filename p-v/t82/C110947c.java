package t82;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p248ug.C111163p0;
import p248ug.C111167t;
import qh2.C101198e;

/* renamed from: t82.c */
public final class C110947c implements C111163p0 {

    /* renamed from: a */
    public final /* synthetic */ C110949e f331840a;

    public C110947c(C110949e eVar) {
        this.f331840a = eVar;
    }

    /* renamed from: a */
    public void mo150361a(C111167t tVar) {
        C87412m.m108594g(tVar, "features");
        Log.m105925i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedFeature] features:%s", tVar.name());
        if (tVar == C111167t.DEFAULT) {
            C101198e.C62622a.m73576a(this.f331840a.f331843e, C101198e.C101199b.EDIT_PHOTO_SHOW_FUNC_LAYOUT, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo150362b(boolean z) {
    }

    /* renamed from: c */
    public void mo150363c(C111167t tVar, int i, Object obj) {
        C87412m.m108594g(tVar, "features");
        Log.m105925i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
    }
}
