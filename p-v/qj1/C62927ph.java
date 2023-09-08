package qj1;

import ak1.C54116w;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49712hj1;

/* renamed from: qj1.ph */
public final class C62927ph extends C62660c {

    /* renamed from: p */
    public final C58124b f178559p;

    /* renamed from: q */
    public final String f178560q = "Finder.FinderLiveVisitorMusicPlugin";

    /* renamed from: r */
    public int f178561r;

    /* renamed from: s */
    public int f178562s;

    /* renamed from: qj1.ph$a */
    public static final class C62928a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62927ph f178563d;

        public C62928a(C62927ph phVar) {
            this.f178563d = phVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            C62927ph phVar = this.f178563d;
            bundle.putInt("PARAM_LIVE_BGM_ID", phVar.f178561r);
            phVar.f178559p.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_MUSIC_PANEL, bundle);
            ((C54116w) C86312j.m106911c(C54116w.class)).By0(1);
            if (!(!((C54991o) this.f178563d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f178563d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2024);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62927ph(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178559p = bVar;
        viewGroup.setOnClickListener(new C62928a(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178561r = 0;
        this.f178562s = 0;
    }
}
