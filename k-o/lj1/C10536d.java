package lj1;

import a14.C0000n0;
import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64586nn1;
import zc1.C66785b;
import zj1.C16217b;

/* renamed from: lj1.d */
public abstract class C10536d {

    /* renamed from: a */
    public final C10125e1 f31809a;

    /* renamed from: b */
    public int f31810b;

    /* renamed from: c */
    public List<C10536d> f31811c = new ArrayList();

    /* renamed from: d */
    public C10536d f31812d;

    /* renamed from: e */
    public C32227p<? super C2458a, ? super Boolean, C13598b0> f31813e;

    /* renamed from: f */
    public View f31814f;

    /* renamed from: lj1.d$a */
    public static final class C10537a extends C87413o implements C32226l<C2458a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10536d f31815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10537a(C10536d dVar) {
            super(1);
            this.f31815d = dVar;
        }

        public Object invoke(Object obj) {
            int i;
            List<C10536d> f;
            C2458a aVar = (C2458a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            C10536d dVar = this.f31815d;
            C32227p<? super C2458a, ? super Boolean, C13598b0> pVar = dVar.f31813e;
            boolean z = false;
            if (pVar != null) {
                C10536d dVar2 = dVar.f31812d;
                if (dVar2 == null || (f = dVar2.mo10557f()) == null || f.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (C10536d c : f) {
                        if (c.mo10801c() && (i = i + 1) < 0) {
                            C64197v.m75541j();
                            throw null;
                        }
                    }
                }
                if (i > 1) {
                    z = true;
                }
                pVar.invoke(aVar, Boolean.valueOf(z));
            } else if (aVar.f12908a) {
                View view = dVar.f31814f;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                View view3 = dVar.f31814f;
                if (view3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C10536d(C10125e1 e1Var, int i) {
        C87412m.m108594g(e1Var, "helper");
        this.f31809a = e1Var;
        this.f31810b = i;
    }

    /* renamed from: e */
    public static void m10457e(C10536d dVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            dVar.getClass();
            C16217b.f43438a.mo14745b(dVar.mo10518g(), z);
            dVar.mo10804i();
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disposeRedDot");
    }

    /* renamed from: a */
    public final void mo10799a(C10536d dVar) {
        C87412m.m108594g(dVar, "item");
        mo10557f().add(dVar);
    }

    /* renamed from: b */
    public final void mo10800b() {
        for (C10536d dVar : mo10557f()) {
            dVar.f31812d = this;
            dVar.mo10800b();
        }
    }

    /* renamed from: c */
    public final boolean mo10801c() {
        boolean z;
        if (!mo10519k()) {
            return false;
        }
        Iterator it = C60152b4.C8759a.m8564d(((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0(), mo10518g(), (C32226l) null, (String) null, 6, (Object) null).iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            LinkedList<C64586nn1> linkedList = ((C55718s0) it.next()).field_ctrInfo.f144672g;
            C87412m.m108593f(linkedList, "localInfo.field_ctrInfo.show_infos");
            Iterator<T> it4 = linkedList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    C64586nn1 nn12 = (C64586nn1) it4.next();
                    if (C87412m.m108589b(nn12.f184507i, mo10518g()) && nn12.f184506h == 1) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        if (z) {
            C2458a value = C16217b.f43438a.mo14748e(mo10518g()).getValue();
            if (value != null && value.f12908a) {
                return true;
            }
        }
        for (C10536d c : mo10557f()) {
            if (c.mo10801c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo10802d() {
        for (C10536d dVar : mo10557f()) {
            C16217b bVar = C16217b.f43438a;
            if (bVar.mo14744a(dVar.mo10518g())) {
                bVar.mo14745b(dVar.mo10518g(), true);
                dVar.mo10804i();
            }
        }
    }

    /* renamed from: f */
    public List<C10536d> mo10557f() {
        return this.f31811c;
    }

    /* renamed from: g */
    public abstract String mo10518g();

    /* renamed from: h */
    public final C0000n0 mo10803h() {
        C10125e1.C10126a aVar;
        if (this.f31810b == 1) {
            C10125e1.C10132d dVar = this.f31809a.f30989h;
            if (dVar != null) {
                return dVar.f31036b;
            }
            return null;
        }
        C10125e1.C10127b bVar = this.f31809a.f30988g;
        if (bVar == null || (aVar = bVar.f31008a) == null) {
            return null;
        }
        return aVar.mo10547g();
    }

    /* renamed from: i */
    public final void mo10804i() {
        C10536d dVar = this.f31812d;
        if (dVar != null && !dVar.mo10801c()) {
            View view = dVar.f31814f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "hideParentRedDotsIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "hideParentRedDotsIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C32227p<? super C2458a, ? super Boolean, C13598b0> pVar = dVar.f31813e;
            if (pVar != null) {
                pVar.invoke(new C2458a(false, (C64586nn1) null, (C55718s0) null, C66785b.f191882e.mo90662O5()), Boolean.FALSE);
            }
            dVar.mo10804i();
        }
    }

    /* renamed from: j */
    public final boolean mo10805j() {
        return this.f31810b == 0;
    }

    /* renamed from: k */
    public abstract boolean mo10519k();

    /* renamed from: l */
    public final void mo10806l() {
        if (!mo10801c()) {
            View view = this.f31814f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "registerRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "registerRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C32227p<? super C2458a, ? super Boolean, C13598b0> pVar = this.f31813e;
            if (pVar != null) {
                pVar.invoke(new C2458a(false, (C64586nn1) null, (C55718s0) null, C66785b.f191882e.mo90662O5()), Boolean.FALSE);
                return;
            }
            return;
        }
        C16217b.f43438a.mo14752h(this.f31809a.f30985d, mo10518g(), new C10537a(this));
    }
}
