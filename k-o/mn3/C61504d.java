package mn3;

import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import js3.C33659a;
import js3.C60921b;
import kn3.C61118a;
import kn3.C61121d;
import ln3.C61316d;
import ln3.C76709a;
import ls3.C34356e;
import o40.C61926c;
import p749xh.C38624o3;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;

/* renamed from: mn3.d */
public final class C61504d extends C76787a<C61316d> {

    /* renamed from: h */
    public static final ArrayList<C33659a> f174853h = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C38624o3> f174854f = new ArrayList<>();

    /* renamed from: g */
    public final C61505b f174855g = new C61505b(this);

    /* renamed from: mn3.d$a */
    public static final class C34610a implements C33659a {
        /* renamed from: a */
        public void mo59247a(String str) {
            C87412m.m108594g(str, "hostRoomId");
            ArrayList<C33659a> arrayList = C61504d.f174853h;
            for (C33659a a : C61504d.f174853h) {
                a.mo59247a(str);
            }
        }
    }

    /* renamed from: mn3.d$b */
    public static final class C61505b implements C33659a {

        /* renamed from: a */
        public final /* synthetic */ C61504d f174856a;

        /* renamed from: mn3.d$b$a */
        public static final class C61506a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C61504d f174857d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61506a(C61504d dVar) {
                super(0);
                this.f174857d = dVar;
            }

            public Object invoke() {
                this.f174857d.mo107034Z5();
                return C13598b0.f38549a;
            }
        }

        public C61505b(C61504d dVar) {
            this.f174856a = dVar;
        }

        /* renamed from: a */
        public void mo59247a(String str) {
            C87412m.m108594g(str, "hostRoomId");
            if (C87412m.m108589b(this.f174856a.f215752d.mo91577r(), str)) {
                ArrayList<C33659a> arrayList = C61504d.f174853h;
                Log.m105924i("Finder.FinderLiveTipsBarProcessor", "finderLiveTipsNotifier hostRoomId:" + str);
                C61926c.m72668M(new C61506a(this.f174856a));
            }
        }
    }

    static {
        C34610a aVar = new C34610a();
        Log.m105924i("Finder.FinderLiveTipsBarProcessor", "setLiveTipsBarNotify " + aVar);
        C60921b XA = ((C34356e) C86312j.m106911c(C34356e.class)).mo58236XA();
        if (XA != null) {
            XA.mo59086Oa(aVar);
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        f174853h.add(this.f174855g);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        f174853h.remove(this.f174855g);
    }

    /* renamed from: Z */
    public List<C61316d> mo86472Z(C67391b bVar, C39969i iVar) {
        Collection collection;
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        this.f174854f.clear();
        ArrayList<C38624o3> arrayList = this.f174854f;
        C60921b XA = ((C34356e) C86312j.m106911c(C34356e.class)).mo58236XA();
        if (XA == null || (collection = XA.mo59088f0(str, true)) == null) {
            collection = C64186f0.f181907d;
        }
        arrayList.addAll(collection);
        ArrayList<C38624o3> arrayList2 = this.f174854f;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C38624o3 dVar : arrayList2) {
            arrayList3.add(new C61316d(dVar));
        }
        return arrayList3;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224429o;
    }

    /* renamed from: y */
    public C61118a<C61316d> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C61121d(bVar, dVar, this);
    }
}
