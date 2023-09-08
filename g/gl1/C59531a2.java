package gl1;

import al1.C54130j;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64500kt2;
import vk1.C65761b;

/* renamed from: gl1.a2 */
public final class C59531a2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f170153d;

    /* renamed from: e */
    public final /* synthetic */ C64500kt2 f170154e;

    /* renamed from: f */
    public final /* synthetic */ C59559k f170155f;

    /* renamed from: g */
    public final /* synthetic */ LinkedList<C54130j> f170156g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59531a2(C8477a0 a0Var, C64500kt2 kt22, C59559k kVar, LinkedList<C54130j> linkedList) {
        super(0);
        this.f170153d = a0Var;
        this.f170154e = kt22;
        this.f170155f = kVar;
        this.f170156g = linkedList;
    }

    public Object invoke() {
        T t;
        T t2;
        Class cls = C54963d0.class;
        if (this.f170153d.f27482d) {
            if (this.f170154e.f183982d.size() == 1) {
                List<C54130j> list = ((C54963d0) this.f170155f.mo83051g(cls)).f154076s;
                C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                C64500kt2 kt22 = this.f170154e;
                synchronized (list) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (Util.isEqual(((C54130j) t).f151997a, kt22.f183982d.get(0).f184154d)) {
                            break;
                        }
                    }
                }
                C54130j jVar = (C54130j) t;
                if (jVar != null && jVar.f152004h) {
                    List<C54130j> list2 = ((C54963d0) this.f170155f.mo83051g(cls)).f154076s;
                    C87412m.m108593f(list2, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                    C64500kt2 kt23 = this.f170154e;
                    synchronized (list2) {
                        Iterator<T> it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it4.next();
                            if (Util.isEqual(((C54130j) t2).f151997a, kt23.f183982d.get(0).f184154d)) {
                                break;
                            }
                        }
                    }
                    ((C54963d0) this.f170155f.mo83051g(cls)).f154073p = (C54130j) t2;
                    C65761b bVar = this.f170155f.f166842f;
                    if (bVar != null) {
                        C56032b.notifyPKMicUserChange$default(bVar, false, 1, (Object) null);
                    }
                    FinderLiveService.m63769b0(FinderLiveService.f159376d, 1, (JSONObject) null, false, 6, (Object) null);
                }
            }
            ((C54963d0) this.f170155f.mo83051g(cls)).f154074q.clear();
            LinkedList<C54130j> linkedList = this.f170156g;
            C59559k kVar = this.f170155f;
            for (C54130j k4 : linkedList) {
                ((C54991o) kVar.mo83051g(C54991o.class)).mo76009k4(k4);
            }
            C65761b bVar2 = this.f170155f.f166842f;
            if (bVar2 != null) {
                C56032b.notifyAudienceMicUserChange$default(bVar2, false, 1, (Object) null);
            }
            FinderLiveService.m63769b0(FinderLiveService.f159376d, 2, (JSONObject) null, false, 6, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
