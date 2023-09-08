package pk1;

import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pk1.C11952i;

/* renamed from: pk1.l */
public final class C11971l {

    /* renamed from: a */
    public final MMActivity f34916a;

    /* renamed from: b */
    public final C45795b f34917b;

    /* renamed from: c */
    public final LinkedList<C11952i.C11957d> f34918c = new LinkedList<>();

    public C11971l(MMActivity mMActivity, C45795b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f34916a = mMActivity;
        this.f34917b = bVar;
    }

    /* renamed from: a */
    public final C11952i.C11957d mo11838a(C11973o oVar, int i) {
        C11952i.C11957d a;
        C11952i iVar = C11952i.f34888a;
        C11952i.C11955c cVar = C11952i.f34891d.get(oVar);
        if (cVar == null || (a = cVar.mo11820a(i)) == null) {
            return null;
        }
        a.mo11826c(((C54991o) this.f34917b.mo71262a(C54991o.class)).f154345o);
        return a;
    }
}
