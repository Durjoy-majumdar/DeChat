package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import di1.C7333c;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C50767p11;
import te3.C51428tp2;
import te3.C51503u71;

/* renamed from: cl1.u1 */
public final class C0691u1 extends C39970c<C45795b> {

    /* renamed from: f */
    public C7333c<C51503u71> f1637f;

    /* renamed from: g */
    public final LiveMutableData<Boolean> f1638g = new LiveMutableData<>();

    /* renamed from: h */
    public final LiveMutableData<Boolean> f1639h = new LiveMutableData<>();

    /* renamed from: i */
    public LiveMutableData<C0693b> f1640i;

    /* renamed from: cl1.u1$a */
    public static final class C0692a extends C0693b {
    }

    /* renamed from: cl1.u1$b */
    public static abstract class C0693b {
    }

    /* renamed from: cl1.u1$c */
    public static final class C0694c extends C87413o implements C32227p<C51503u71, C51503u71, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C0691u1 f1641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0694c(C0691u1 u1Var) {
            super(2);
            this.f1641d = u1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            T t;
            boolean z;
            boolean z2;
            C51503u71 u712 = (C51503u71) obj;
            C51503u71 u713 = (C51503u71) obj2;
            this.f1641d.getClass();
            boolean z3 = false;
            if (u712 != null && u713 != null && u712.f142641d == u713.f142641d && u712.f142642e == u713.f142642e && u712.f142643f == u713.f142643f && C87412m.m108589b(u712.f142647j, u713.f142647j)) {
                LinkedList<C51428tp2> linkedList = u712.f142646i;
                C87412m.m108593f(linkedList, "old.wish_list");
                LinkedList<C51428tp2> linkedList2 = u713.f142646i;
                C87412m.m108593f(linkedList2, "new.wish_list");
                if (linkedList.size() == linkedList2.size()) {
                    Iterator<T> it = linkedList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C51428tp2 tp22 = (C51428tp2) it.next();
                        Iterator<T> it4 = linkedList.iterator();
                        while (true) {
                            t = null;
                            if (!it4.hasNext()) {
                                break;
                            }
                            T next = it4.next();
                            C51428tp2 tp23 = (C51428tp2) next;
                            C50767p11 p112 = tp22.f142318d;
                            String str = p112 != null ? p112.f139507d : null;
                            C50767p11 p113 = tp23.f142318d;
                            if (p113 != null) {
                                t = p113.f139507d;
                            }
                            if (C87412m.m108589b(str, t) && tp22.f142319e == tp23.f142319e && tp22.f142320f == tp23.f142320f) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                t = next;
                                break;
                            }
                        }
                        if (t != null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    }
                }
            }
            z3 = true;
            return Boolean.valueOf(!z3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0691u1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        C7333c<C51503u71> cVar = new C7333c<>((C32227p) null, 1, (C8480h) null);
        cVar.f25448d = new C0694c(this);
        this.f1637f = cVar;
        new LiveMutableData();
        this.f1640i = new LiveMutableData<>();
    }

    /* renamed from: c3 */
    public final LiveMutableData<Boolean> mo658c3() {
        return ((C54991o) this.f107146d.mo71262a(C54991o.class)).f154305d3 ? this.f1639h : this.f1638g;
    }

    public void onCleared() {
    }
}
