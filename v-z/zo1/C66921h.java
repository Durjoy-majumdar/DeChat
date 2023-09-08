package zo1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import cp1.C57959q;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ks3.C61162l;
import ok1.C62042e;
import qj1.C12669t4;
import qj1.C62660c;
import te3.C49712hj1;
import zk1.C66877n0;

/* renamed from: zo1.h */
public final class C66921h extends C62660c {

    /* renamed from: p */
    public final C58124b f192290p;

    /* renamed from: zo1.h$a */
    public static final class C66922a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66921h f192291d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f192292e;

        public C66922a(C66921h hVar, ViewGroup viewGroup) {
            this.f192291d = hVar;
            this.f192292e = viewGroup;
        }

        public final void onClick(View view) {
            C57959q uiClickListener;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C54519d) this.f192291d.mo87696x0(C54519d.class)).mo75379n3(true);
            ((C54991o) this.f192291d.mo87696x0(C54991o.class)).f154350p0 = false;
            C12669t4 t4Var = (C12669t4) this.f192291d.mo87687E0(C12669t4.class);
            if (t4Var != null) {
                t4Var.mo10792g(8);
            }
            C39818r rVar = C39818r.f106831a;
            Context context = this.f192292e.getContext();
            C87412m.m108593f(context, "root.context");
            ((C66877n0) rVar.mo62443b(context).mo75002a(C66877n0.class)).f192121i = true;
            this.f192291d.mo14484z0().finish();
            C56032b z0 = this.f192291d.mo14484z0();
            FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = z0 instanceof FinderLiveReplayPluginLayout ? (FinderLiveReplayPluginLayout) z0 : null;
            if (!(finderLiveReplayPluginLayout == null || (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) == null)) {
                uiClickListener.mo82767c(C61162l.Replay);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66921h(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192290p = bVar;
        viewGroup.setOnClickListener(new C66922a(this, viewGroup));
        C62042e eVar = C62042e.f176370a;
        eVar.mo87074e(this, false);
        eVar.mo87071d(this);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
