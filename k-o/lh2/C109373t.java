package lh2;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p248ug.C111163p0;
import p248ug.C111167t;
import qh2.C101198e;

/* renamed from: lh2.t */
public final class C109373t implements C111163p0 {

    /* renamed from: a */
    public final /* synthetic */ C109370r f327425a;

    public C109373t(C109370r rVar) {
        this.f327425a = rVar;
    }

    /* renamed from: a */
    public void mo150361a(C111167t tVar) {
        C87412m.m108594g(tVar, "features");
        Log.m105925i("MicroMsg.EditPhotoPluginLayout", "[onSelectedFeature] features:%s", tVar.name());
        if (tVar == C111167t.DEFAULT) {
            C101198e.C62622a.m73576a(this.f327425a.f327408e, C101198e.C101199b.EDIT_PHOTO_SHOW_FUNC_LAYOUT, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo150362b(boolean z) {
    }

    /* renamed from: c */
    public void mo150363c(C111167t tVar, int i, Object obj) {
        C87412m.m108594g(tVar, "features");
        Log.m105925i("MicroMsg.EditPhotoPluginLayout", "[onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
    }
}
