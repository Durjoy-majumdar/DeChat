package qj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.C39622i0;
import d14.C58050i1;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import nj2.C61768p;
import pj2.C62318a;
import rx3.C13598b0;
import sj2.C63922c;
import sx3.C110818d0;
import ve3.C52833i;
import wj2.C66128a;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj2.a */
public final class C63183a extends C39622i0 {

    /* renamed from: d */
    public final C63922c f179272d;

    /* renamed from: e */
    public C0000n0 f179273e = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: f */
    public final C58087u0<C63184a.C63185a> f179274f;

    /* renamed from: g */
    public final int f179275g;

    /* renamed from: h */
    public final C58050i1<C63184a> f179276h;

    /* renamed from: i */
    public C53973z1 f179277i;

    /* renamed from: qj2.a$a */
    public static abstract class C63184a {

        /* renamed from: qj2.a$a$a */
        public static final class C63185a extends C63184a {

            /* renamed from: a */
            public final List<C62318a> f179278a;

            /* renamed from: b */
            public final int f179279b;

            public C63185a(List<C62318a> list, int i) {
                this.f179278a = list;
                this.f179279b = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C63185a)) {
                    return false;
                }
                C63185a aVar = (C63185a) obj;
                return C87412m.m108589b(this.f179278a, aVar.f179278a) && this.f179279b == aVar.f179279b;
            }

            public int hashCode() {
                List<C62318a> list = this.f179278a;
                return ((list == null ? 0 : list.hashCode()) * 31) + this.f179279b;
            }

            public String toString() {
                return "Success(exclusiveLists=" + this.f179278a + ", uiState=" + this.f179279b + ')';
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.exclusive.ExclusiveDataViewModel$noMoreExclusiveData$1", mo125469f = "ExclusiveDataViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj2.a$b */
    public static final class C63186b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63183a f179280d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<String> f179281e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63186b(C63183a aVar, ArrayList<String> arrayList, C15601d<? super C63186b> dVar) {
            super(2, dVar);
            this.f179280d = aVar;
            this.f179281e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63186b(this.f179280d, this.f179281e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63186b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            List<C66128a> g = C61768p.m72479g();
            ArrayList<String> arrayList2 = this.f179281e;
            for (C66128a aVar : g) {
                if ((!C110818d0.m150903D(arrayList2, aVar.f190060e) || arrayList2.isEmpty()) && (str = aVar.f190060e) != null) {
                    C52833i iVar = new C52833i();
                    iVar.f147588d = str;
                    arrayList.add(new C62318a(iVar));
                    C61768p.m72484l(str, (C66132f) null);
                    C61768p.m72486n(str, (C66132f) null, 0, 4, (Object) null);
                }
            }
            ((C58052j1) this.f179280d.f179274f).setValue(new C63184a.C63185a(arrayList, 4));
            return C13598b0.f38549a;
        }
    }

    public C63183a(C63922c cVar) {
        C87412m.m108594g(cVar, "ringtoneRepository");
        this.f179272d = cVar;
        C58087u0<C63184a.C63185a> a = C58056k1.m67214a(new C63184a.C63185a((List<C62318a>) null, 1));
        this.f179274f = a;
        this.f179275g = 10;
        this.f179276h = a;
    }

    /* renamed from: c3 */
    public final void mo88106c3(ArrayList<String> arrayList) {
        C87412m.m108594g(arrayList, "availData");
        this.f179277i = C53895h.m60466d(this.f179273e, (C66212f) null, (C53934p0) null, new C63186b(this, arrayList, (C15601d<? super C63186b>) null), 3, (Object) null);
    }
}
