package b71;

import androidx.recyclerview.widget.C54248l;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import rh3.C101379c;
import rh3.C101380d;
import rx3.C13598b0;

/* renamed from: b71.g */
public final class C92195g implements C92192d {

    /* renamed from: a */
    public final C92191c f263875a;

    /* renamed from: b */
    public final C92191c f263876b;

    /* renamed from: c */
    public final LinkedList<C101380d> f263877c = new LinkedList<>();

    /* renamed from: d */
    public final LinkedList<C101380d> f263878d = new LinkedList<>();

    /* renamed from: b71.g$a */
    public static final class C92196a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92195g f263879d;

        /* renamed from: e */
        public final /* synthetic */ List<C101380d> f263880e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92196a(C92195g gVar, List<C101380d> list) {
            super(0);
            this.f263879d = gVar;
            this.f263880e = list;
        }

        public Object invoke() {
            C8479f0 f0Var = new C8479f0();
            C92195g gVar = this.f263879d;
            LinkedList<C101380d> linkedList = gVar.f263878d;
            List<C101380d> list = this.f263880e;
            synchronized (linkedList) {
                LinkedList<C101380d> linkedList2 = gVar.f263878d;
                C87412m.m108594g(linkedList2, "oldList");
                C87412m.m108594g(list, "newList");
                f0Var.f27484d = C54248l.m60949a(new C101379c(linkedList2, list), false);
                gVar.f263878d.clear();
                gVar.f263878d.addAll(list);
            }
            C61926c.m72668M(new C92194f(this.f263879d, this.f263880e, f0Var));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b71.g$b */
    public static final class C92197b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92195g f263881d;

        /* renamed from: e */
        public final /* synthetic */ List<C101380d> f263882e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92197b(C92195g gVar, List<C101380d> list) {
            super(0);
            this.f263881d = gVar;
            this.f263882e = list;
        }

        public Object invoke() {
            C8479f0 f0Var = new C8479f0();
            C92195g gVar = this.f263881d;
            LinkedList<C101380d> linkedList = gVar.f263877c;
            List<C101380d> list = this.f263882e;
            synchronized (linkedList) {
                LinkedList<C101380d> linkedList2 = gVar.f263877c;
                C87412m.m108594g(linkedList2, "oldList");
                C87412m.m108594g(list, "newList");
                f0Var.f27484d = C54248l.m60949a(new C101379c(linkedList2, list), false);
                gVar.f263877c.clear();
                gVar.f263877c.addAll(list);
            }
            C61926c.m72668M(new C92199i(this.f263881d, this.f263882e, f0Var));
            return C13598b0.f38549a;
        }
    }

    public C92195g(C92191c cVar, C92191c cVar2) {
        C87412m.m108594g(cVar, "recommendCallback");
        C87412m.m108594g(cVar2, "dataCallback");
        this.f263875a = cVar;
        this.f263876b = cVar2;
    }

    /* renamed from: a */
    public void mo126162a(List<C101380d> list) {
        C87412m.m108594g(list, "lensList");
        C61926c.m72657B("StickerPanelCallbackWrapper_onRecommend", true, new C92197b(this, list));
    }

    /* renamed from: b */
    public void mo126163b(List<C101380d> list) {
        C87412m.m108594g(list, "lensList");
        C61926c.m72657B("StickerPanelCallbackWrapper_onMore", true, new C92196a(this, list));
    }
}
