package p004b0;

import androidx.compose.foundation.lazy.layout.C0116r;
import androidx.compose.foundation.lazy.layout.C54149b;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60667k2;
import rx3.C13598b0;

/* renamed from: b0.p */
public final class C54381p implements C103962o {

    /* renamed from: a */
    public final C60667k2<C54386s> f152566a;

    /* renamed from: b */
    public final C103942g f152567b = new C103942g();

    /* renamed from: b0.p$a */
    public static final class C54382a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54381p f152568d;

        /* renamed from: e */
        public final /* synthetic */ int f152569e;

        /* renamed from: f */
        public final /* synthetic */ int f152570f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54382a(C54381p pVar, int i, int i2) {
            super(2);
            this.f152568d = pVar;
            this.f152569e = i;
            this.f152570f = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f152568d.mo75146b(this.f152569e, (C108504h) obj, this.f152570f | 1);
            return C13598b0.f38549a;
        }
    }

    public C54381p(C60667k2<C54386s> k2Var) {
        C87412m.m108594g(k2Var, "itemsSnapshot");
        this.f152566a = k2Var;
    }

    /* renamed from: a */
    public C103942g mo75145a() {
        return this.f152567b;
    }

    /* renamed from: b */
    public void mo75146b(int i, C108504h hVar, int i2) {
        int i3;
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(1704733014);
        if ((i2 & 14) == 0) {
            i3 = (z.mo51592j(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= z.mo51619x(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !z.mo51575a()) {
            this.f152566a.getValue().mo75152a(this.f152567b, i, z, ((i3 << 3) & 112) | 512);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C54382a(this, i, i2));
        }
    }

    /* renamed from: c */
    public List<Integer> mo75147c() {
        return this.f152566a.getValue().f152578b;
    }

    /* renamed from: d */
    public Object mo75148d(int i) {
        C54149b<C54379j> b = this.f152566a.getValue().mo75153b(i);
        return ((C54379j) b.f152076c).f152564b.invoke(Integer.valueOf(i - b.f152074a));
    }

    /* renamed from: e */
    public Map<Object, Integer> mo75149e() {
        return this.f152566a.getValue().f152580d;
    }

    /* renamed from: f */
    public Object mo75150f(int i) {
        C54149b<C54379j> b = this.f152566a.getValue().mo75153b(i);
        int i2 = i - b.f152074a;
        C32226l<Integer, Object> lVar = ((C54379j) b.f152076c).f152563a;
        Object invoke = lVar != null ? lVar.invoke(Integer.valueOf(i2)) : null;
        return invoke == null ? C0116r.m101a(i) : invoke;
    }

    public int getItemCount() {
        return this.f152566a.getValue().f152577a.getTotalSize();
    }
}
