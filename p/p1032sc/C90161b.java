package p1032sc;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p1032sc.C90165c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;

/* renamed from: sc.b */
public final class C90161b {

    /* renamed from: a */
    public List<C90160a> f258866a;

    /* renamed from: b */
    public final C13601g f258867b = C36568h.m40985a(new C90164c(this));

    /* renamed from: c */
    public final C13601g f258868c = C36568h.m40985a(new C90163b(this));

    /* renamed from: d */
    public final C13601g f258869d = C36568h.m40985a(new C90162a(this));

    /* renamed from: sc.b$a */
    public static final class C90162a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C90161b f258870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90162a(C90161b bVar) {
            super(0);
            this.f258870d = bVar;
        }

        public Object invoke() {
            List<C90160a> list = this.f258870d.f258866a;
            C87412m.m108591d(list);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C90160a aVar : list) {
                Integer num = aVar.f258864e;
                C87412m.m108591d(num);
                arrayList.add(Integer.valueOf(num.intValue()));
            }
            return Integer.valueOf(C110818d0.m150945q0(arrayList));
        }
    }

    /* renamed from: sc.b$b */
    public static final class C90163b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C90161b f258871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90163b(C90161b bVar) {
            super(0);
            this.f258871d = bVar;
        }

        public Object invoke() {
            List<C90160a> list = this.f258871d.f258866a;
            C87412m.m108591d(list);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C90160a aVar : list) {
                Integer num = aVar.f258865f;
                C87412m.m108591d(num);
                arrayList.add(Integer.valueOf(num.intValue()));
            }
            return Integer.valueOf(C110818d0.m150945q0(arrayList));
        }
    }

    /* renamed from: sc.b$c */
    public static final class C90164c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C90161b f258872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90164c(C90161b bVar) {
            super(0);
            this.f258872d = bVar;
        }

        public Object invoke() {
            List<C90160a> list = this.f258872d.f258866a;
            C87412m.m108591d(list);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C90160a aVar : list) {
                Integer num = aVar.f258863d;
                C87412m.m108591d(num);
                arrayList.add(Integer.valueOf(num.intValue()));
            }
            return Integer.valueOf(C110818d0.m150945q0(arrayList));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(virtual memory size=");
        C90165c.C90166a aVar = C90165c.f258873c;
        sb.append(aVar.mo124419a(((long) ((Number) ((C36570n) this.f258867b).getValue()).intValue()) * 1024));
        sb.append(", rss=");
        sb.append(aVar.mo124419a(((long) ((Number) ((C36570n) this.f258868c).getValue()).intValue()) * 1024));
        sb.append(", pss=");
        sb.append(aVar.mo124419a(((long) ((Number) ((C36570n) this.f258869d).getValue()).intValue()) * 1024));
        sb.append(", count=");
        List<C90160a> list = this.f258866a;
        C87412m.m108591d(list);
        sb.append(list.size());
        sb.append(')');
        String str = sb.toString() + "\nTop:\n";
        List<C90160a> list2 = this.f258866a;
        C87412m.m108591d(list2);
        List<C90160a> list3 = this.f258866a;
        C87412m.m108591d(list3);
        for (C90160a aVar2 : list2.subList(0, Math.min(50, list3.size()))) {
            str = str + "* " + aVar2 + 10;
        }
        return str;
    }
}
