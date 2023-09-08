package sk1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import c30.C104289g;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import il1.C60362c7;
import il1.C9104r7;
import il1.C9109s7;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import jq3.C60905o;
import ky2.C10432i;
import nj3.C76912y0;
import ok1.C62042e;
import qj1.C63144yg;
import rx3.C13598b0;
import te3.C49188dt1;
import te3.C51613uy0;
import te3.C64247az0;
import te3.C64582nl0;

/* renamed from: sk1.i */
public final class C63954i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64247az0 f181285d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f181286e;

    /* renamed from: f */
    public final /* synthetic */ C63953g f181287f;

    /* renamed from: g */
    public final /* synthetic */ C63955j f181288g;

    public C63954i(C64247az0 az02, C60905o oVar, C63953g gVar, C63955j jVar) {
        this.f181285d = az02;
        this.f181286e = oVar;
        this.f181287f = gVar;
        this.f181288g = jVar;
    }

    public final void onClick(View view) {
        C64582nl0 nl02;
        C60362c7 c7Var;
        C64247az0 az02;
        C60362c7 c7Var2;
        Class cls = C63144yg.class;
        Class cls2 = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/convert/GameTogetherVisitorTeamConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64247az0 az03 = this.f181285d;
        String str = null;
        Integer valueOf = az03 != null ? Integer.valueOf(az03.f182177d) : null;
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            Context context = this.f181286e.f173499A;
            C76912y0.m92767f(context, context.getResources().getString(C0966R.string.mw4));
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            C64247az0 az04 = this.f181287f.f181283h;
            if (az04 != null) {
                C63955j jVar = this.f181288g;
                C51613uy0 uy02 = ((C54991o) jVar.f181289e.mo87696x0(cls2)).f154363s1;
                C63144yg ygVar = (C63144yg) jVar.f181289e.mo87687E0(cls);
                if (!(ygVar == null || (c7Var = ygVar.f179181s) == null)) {
                    c7Var.mo85327b(new C9104r7(c7Var, valueOf.intValue(), az04, uy02));
                }
                C58124b.C7172a.m7372a(jVar.f181290f, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
            }
        } else if (((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) && (az02 = this.f181287f.f181283h) != null) {
            C63955j jVar2 = this.f181288g;
            C63144yg ygVar2 = (C63144yg) jVar2.f181289e.mo87687E0(cls);
            if (!(ygVar2 == null || (c7Var2 = ygVar2.f179181s) == null)) {
                c7Var2.mo85327b(new C9109s7(c7Var2, az02));
            }
            C58124b.C7172a.m7372a(jVar2.f181290f, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
        }
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w wVar = (C54116w) c;
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.GAME_TEAM;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", 33);
        C13598b0 b0Var = C13598b0.f38549a;
        String gVar2 = gVar.toString();
        C104289g gVar3 = new C104289g();
        C63955j jVar3 = this.f181288g;
        C63953g gVar4 = this.f181287f;
        gVar3.put("click_id", UUID.randomUUID().toString());
        C62042e eVar = C62042e.f176370a;
        C49188dt1 dt12 = ((C54991o) jVar3.f181289e.mo87696x0(cls2)).f154298b4;
        gVar3.mo145953n("game_type", eVar.mo87052W1(dt12 != null ? dt12.f132523f : 0));
        C64247az0 az05 = gVar4.f181283h;
        if (!(az05 == null || (nl02 = az05.f182176B) == null)) {
            str = nl02.f184481d;
        }
        gVar3.put("appid", str);
        C54116w.Ex0(wVar, o0Var, gVar2, 0, (String) null, (String) null, gVar3.toString(), (String) null, (String) null, 220, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/convert/GameTogetherVisitorTeamConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
