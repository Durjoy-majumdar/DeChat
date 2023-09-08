package ls1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p329d3.C106986f;
import sx3.C64197v;

/* renamed from: ls1.f */
public abstract class C61387f extends FinderTabUIC {

    /* renamed from: t */
    public FinderTabLayout f174595t;

    /* renamed from: ls1.f$a */
    public static final class C61388a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61387f f174596d;

        public C61388a(C61387f fVar) {
            this.f174596d = fVar;
        }

        public final void run() {
            this.f174596d.mo80057i3();
        }
    }

    /* renamed from: ls1.f$b */
    public static final class C61389b implements FinderTabLayout.C105323c<FinderTabLayout.C56654f> {

        /* renamed from: a */
        public final /* synthetic */ C61387f f174597a;

        /* renamed from: b */
        public final /* synthetic */ FinderTabLayout f174598b;

        public C61389b(C61387f fVar, FinderTabLayout finderTabLayout) {
            this.f174597a = fVar;
            this.f174598b = finderTabLayout;
        }

        /* renamed from: a */
        public void mo79994a(FinderTabLayout.C56654f fVar) {
        }

        /* renamed from: b */
        public void mo79995b(FinderTabLayout.C56654f fVar) {
            if (fVar != null) {
                C61387f fVar2 = this.f174597a;
                FinderTabLayout finderTabLayout = this.f174598b;
                C61394l L3 = fVar2.mo80040L3();
                Context context = finderTabLayout.getContext();
                C87412m.m108593f(context, "context");
                Object obj = fVar.f162395a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                L3.mo3858a(context, (C61391g) obj);
                Object obj2 = fVar.f162395a;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                View view = fVar.f162400f;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((C61391g) obj2).mo3855d(true, (ViewGroup) view);
                Object obj3 = fVar.f162395a;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                int indexOf = fVar2.mo80041M3().indexOf((C61391g) obj3);
                Log.m105924i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
                if (indexOf == -1) {
                    indexOf = 0;
                }
                fVar2.mo80051b4(indexOf);
            }
        }

        /* renamed from: c */
        public void mo79996c(FinderTabLayout.C56654f fVar) {
            if (fVar != null) {
                C61387f fVar2 = this.f174597a;
                FinderTabLayout finderTabLayout = this.f174598b;
                if (fVar.f162395a instanceof C61391g) {
                    C61394l L3 = fVar2.mo80040L3();
                    Context context = finderTabLayout.getContext();
                    C87412m.m108593f(context, "context");
                    Object obj = fVar.f162395a;
                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    L3.mo3859b(context, (C61391g) obj);
                    Object obj2 = fVar.f162395a;
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    View view = fVar.f162400f;
                    C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((C61391g) obj2).mo3855d(false, (ViewGroup) view);
                }
            }
        }
    }

    /* renamed from: ls1.f$c */
    public static final class C61390c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61387f f174599d;

        public C61390c(C61387f fVar) {
            this.f174599d = fVar;
        }

        public final void run() {
            Log.m105924i("Finder.FinderTabUIC", "adjust align");
            FinderTabLayout finderTabLayout = this.f174599d.f174595t;
            if (finderTabLayout != null) {
                finderTabLayout.setVisibility(0);
            }
            C61387f fVar = this.f174599d;
            C61396n nVar = fVar.f162511i;
            if (nVar != null) {
                nVar.mo86329a(fVar.f174595t);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61387f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: F3 */
    public ViewGroup mo80035F3() {
        View childAt;
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout == null || (childAt = finderTabLayout.getChildAt(0)) == null) {
            return null;
        }
        return (ViewGroup) childAt;
    }

    /* renamed from: G3 */
    public int mo80036G3() {
        FinderTabLayout finderTabLayout = this.f174595t;
        return finderTabLayout != null ? finderTabLayout.getSelectedTabPosition() : this.f162506d;
    }

    /* renamed from: N3 */
    public void mo80042N3() {
        IFinderTabProvider K3 = mo80039K3();
        C61386e eVar = K3 instanceof C61386e ? (C61386e) K3 : null;
        if (eVar != null) {
            this.f162511i = eVar.mo86085a();
        }
    }

    /* renamed from: O3 */
    public void mo80043O3() {
        FinderTabLayout a = mo80038J3().mo86334a();
        this.f174595t = a;
        if (a != null) {
            a.f312976H = false;
        }
    }

    /* renamed from: X3 */
    public void mo80048X3(int i) {
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            FinderTabLayout.C56654f fVar = finderTabLayout.f312990e;
            int i2 = fVar != null ? fVar.f162399e : 0;
            finderTabLayout.mo149834k(i);
            FinderTabLayout.C56654f remove = finderTabLayout.f312989d.remove(i);
            FinderTabLayout.C56654f fVar2 = null;
            if (remove != null) {
                remove.f162401g = null;
                remove.f162402h = null;
                remove.f162395a = null;
                remove.f162396b = null;
                remove.f162397c = null;
                remove.f162398d = null;
                remove.f162399e = -1;
                remove.f162400f = null;
                ((C106986f) FinderTabLayout.f312968V).mo157420b(remove);
            }
            int size = finderTabLayout.f312989d.size();
            for (int i3 = i; i3 < size; i3++) {
                finderTabLayout.f312989d.get(i3).f162399e = i3;
            }
            if (i2 == i) {
                if (!finderTabLayout.f312989d.isEmpty()) {
                    fVar2 = finderTabLayout.f312989d.get(Math.max(0, i - 1));
                }
                finderTabLayout.mo149835l(fVar2, true);
            }
        }
    }

    /* renamed from: Z3 */
    public void mo80050Z3(int i, boolean z) {
        FinderTabLayout.C56654f h;
        super.mo80050Z3(i, z);
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            boolean z2 = true;
            if (!(i >= 0 && i < finderTabLayout.getTabCount())) {
                finderTabLayout = null;
            }
            if (finderTabLayout != null && (h = finderTabLayout.mo149831h(i)) != null) {
                if (!z) {
                    FinderTabLayout finderTabLayout2 = h.f162401g;
                    if (finderTabLayout2 != null) {
                        if (finderTabLayout2.getSelectedTabPosition() != h.f162399e) {
                            z2 = false;
                        }
                        if (z2) {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
                    }
                }
                Log.m105924i("Finder.FinderTabUIC", "select :" + i);
                h.mo79993a();
            }
        }
    }

    /* renamed from: c3 */
    public void mo80052c3(C61391g gVar, int i) {
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            FinderTabLayout.C56654f i2 = finderTabLayout.mo149832i();
            if (gVar != null) {
                i2.f162400f = LayoutInflater.from(i2.f162402h.getContext()).inflate(gVar.mo3852a(), i2.f162402h, false);
                FinderTabLayout.C105328h hVar = i2.f162402h;
                if (hVar != null) {
                    hVar.mo149884b();
                }
                gVar.mo3854c((ViewGroup) i2.f162400f);
                gVar.mo9047e(false);
                if (gVar instanceof C10647i) {
                    i2.f162398d = ((C10647i) gVar).mo10907i(getContext());
                    FinderTabLayout.C105328h hVar2 = i2.f162402h;
                    if (hVar2 != null) {
                        hVar2.mo149884b();
                    }
                }
            }
            i2.f162395a = gVar;
            if (i >= 0) {
                finderTabLayout.mo149809a(i2, i, finderTabLayout.f312989d.isEmpty());
                return;
            }
            finderTabLayout.mo149809a(i2, finderTabLayout.f312989d.size(), finderTabLayout.f312989d.isEmpty());
        }
    }

    /* renamed from: g3 */
    public void mo80055g3() {
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            Log.m105924i("Finder.FinderTabUIC", "ajustIndicator:" + finderTabLayout.getTabCount());
            if (finderTabLayout.getTabCount() > 1) {
                finderTabLayout.post(new C61388a(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = r5.mo149831h(r3);
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80057i3() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r0 = r8.f174595t
            if (r0 == 0) goto L_0x0055
            int r0 = r0.getTabCount()
            android.view.ViewGroup r1 = r8.mo80035F3()
            if (r1 == 0) goto L_0x0055
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r3 >= r0) goto L_0x0050
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r5 = r8.f174595t
            if (r5 == 0) goto L_0x0020
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout$f r5 = r5.mo149831h(r3)
            if (r5 == 0) goto L_0x0020
            java.lang.Object r5 = r5.f162395a
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab"
            gy3.C87412m.m108592e(r5, r6)
            ls1.g r5 = (ls1.C61391g) r5
            int[] r5 = r5.mo3853b()
            r6 = r5[r2]
            r7 = 1
            if (r6 > 0) goto L_0x0035
            r6 = r5[r7]
            if (r6 <= 0) goto L_0x004d
        L_0x0035:
            android.content.Context r4 = r1.getContext()
            r6 = r5[r2]
            int r4 = kg3.C76577a.m92151b(r4, r6)
            android.content.Context r6 = r1.getContext()
            r5 = r5[r7]
            int r5 = kg3.C76577a.m92151b(r6, r5)
            r8.mo80053c4(r1, r3, r4, r5)
            r4 = 1
        L_0x004d:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            r1.requestLayout()
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.C61387f.mo80057i3():void");
    }

    /* renamed from: j3 */
    public void mo80058j3() {
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            C61389b bVar = new C61389b(this, finderTabLayout);
            if (!finderTabLayout.f312979K.contains(bVar)) {
                finderTabLayout.f312979K.add(bVar);
            }
            int i = 0;
            for (T next : mo80041M3()) {
                int i2 = i + 1;
                if (i >= 0) {
                    C61391g gVar = (C61391g) next;
                    gVar.f174600a = i;
                    mo80052c3(gVar, -1);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo80055g3();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FinderTabLayout finderTabLayout = this.f174595t;
        if (finderTabLayout != null) {
            finderTabLayout.setVisibility(4);
        }
        FinderTabLayout finderTabLayout2 = this.f174595t;
        if (finderTabLayout2 != null) {
            finderTabLayout2.post(new C61390c(this));
        }
    }
}
