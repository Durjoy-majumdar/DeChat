package on1;

import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: on1.y */
public class C11575y<T extends C0740i2> {

    /* renamed from: a */
    public final List<T> f33959a;

    /* renamed from: b */
    public final boolean f33960b;

    /* renamed from: c */
    public final C13601g f33961c = C36568h.m40985a(new C11576a(this));

    /* renamed from: on1.y$a */
    public static final class C11576a extends C87413o implements C32224a<C11512c<T>> {

        /* renamed from: d */
        public final /* synthetic */ C11575y<T> f33962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11576a(C11575y<T> yVar) {
            super(0);
            this.f33962d = yVar;
        }

        public Object invoke() {
            this.f33962d.getClass();
            return new C11512c();
        }
    }

    public C11575y(List<? extends T> list, boolean z) {
        C87412m.m108594g(list, "feeds");
        this.f33959a = list;
        this.f33960b = z;
    }

    /* renamed from: a */
    public RefreshLoadMoreLayout.C7080c<Object> mo11463a() {
        return new RefreshLoadMoreLayout.C7080c<>(0);
    }

    /* renamed from: b */
    public void mo11464b(List<T> list) {
        C87412m.m108594g(list, "dataList");
    }

    /* renamed from: c */
    public int mo11488c() {
        return 2;
    }
}
