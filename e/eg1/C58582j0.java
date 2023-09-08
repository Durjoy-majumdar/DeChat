package eg1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import di3.C86312j;
import fj1.C45795b;
import org.json.JSONObject;
import p185kq.C10383h;
import te3.C64273c21;

/* renamed from: eg1.j0 */
public final class C58582j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58584k0 f167714d;

    /* renamed from: e */
    public final /* synthetic */ int f167715e;

    /* renamed from: f */
    public final /* synthetic */ int f167716f;

    /* renamed from: g */
    public final /* synthetic */ C54127h f167717g;

    public C58582j0(C58584k0 k0Var, int i, int i2, C54127h hVar) {
        this.f167714d = k0Var;
        this.f167715e = i;
        this.f167716f = i2;
        this.f167717g = hVar;
    }

    public final void run() {
        String str;
        C45795b bVar;
        C64273c21 c212;
        C45795b bVar2;
        C58584k0 k0Var = this.f167714d;
        int i = this.f167715e;
        int i2 = this.f167716f;
        C54127h hVar = this.f167717g;
        k0Var.getClass();
        if (i != -1 && i != i2) {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var.f167728e;
            Bundle bundle = null;
            Context context = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getContext() : null;
            wVar.getClass();
            JSONObject jSONObject = new JSONObject();
            if (hVar == null || (bVar2 = hVar.f151978e) == null || (str = ((C54991o) bVar2.mo71262a(C54991o.class)).f154345o) == null) {
                str = "";
            }
            jSONObject.put("username", str);
            jSONObject.put("liveId", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ((hVar == null || (bVar = hVar.f151978e) == null || (c212 = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q) == null) ? 0 : c212.f182392d));
            C54116w.Ex0(wVar, C54067f0.C54076o0.SlideEnter, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeSlide;
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            if (iVar != null) {
                bundle = iVar.f151996k;
            }
            C54116w.wy0(wVar, context, q0Var, bundle, false, 8, (Object) null);
        }
    }
}
