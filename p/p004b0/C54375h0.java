package p004b0;

import androidx.compose.foundation.lazy.layout.C54149b;
import androidx.compose.foundation.lazy.layout.C54150c;
import androidx.compose.foundation.lazy.layout.C54152s;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83038t3;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import fy3.C32226l;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: b0.h0 */
public final class C54375h0 implements C54372f0 {

    /* renamed from: a */
    public final C54152s<C54379j> f152557a;

    /* renamed from: b */
    public final C54150c<C54379j> f152558b;

    /* renamed from: c */
    public List<Integer> f152559c;

    /* renamed from: b0.h0$a */
    public static final class C54376a extends C87413o implements C32226l<Integer, Object> {

        /* renamed from: d */
        public final /* synthetic */ Object f152560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54376a(Object obj) {
            super(1);
            this.f152560d = obj;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            return this.f152560d;
        }
    }

    /* renamed from: b0.h0$b */
    public static final class C54377b extends C87413o implements C32226l<Integer, Object> {

        /* renamed from: d */
        public final /* synthetic */ Object f152561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54377b(Object obj) {
            super(1);
            this.f152561d = obj;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            return this.f152561d;
        }
    }

    /* renamed from: b0.h0$c */
    public static final class C54378c extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32228q<C103941f, C108504h, Integer, C13598b0> f152562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54378c(C32228q<? super C103941f, ? super C108504h, ? super Integer, C13598b0> qVar) {
            super(4);
            this.f152562d = qVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            C103941f fVar = (C103941f) obj;
            ((Number) obj2).intValue();
            C108504h hVar = (C108504h) obj3;
            int intValue = ((Number) obj4).intValue();
            C87412m.m108594g(fVar, "$this$$receiver");
            if ((intValue & 14) == 0) {
                intValue |= hVar.mo51619x(fVar) ? 4 : 2;
            }
            if ((intValue & C83038t3.CTRL_INDEX) != 130 || !hVar.mo51575a()) {
                this.f152562d.invoke(fVar, hVar, Integer.valueOf(intValue & 14));
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    public C54375h0() {
        C54152s<C54379j> sVar = new C54152s<>();
        this.f152557a = sVar;
        this.f152558b = sVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo75138a(int i, C32226l lVar, C32229r rVar) {
        C87412m.m108594g(rVar, "itemContent");
        mo75141d(i, lVar, C0237g0.f774d, rVar);
    }

    /* renamed from: b */
    public void mo75139b(Object obj, Object obj2, C32228q<? super C103941f, ? super C108504h, ? super Integer, C13598b0> qVar) {
        C87412m.m108594g(qVar, "content");
        List list = this.f152559c;
        if (list == null) {
            list = new ArrayList();
            this.f152559c = list;
        }
        list.add(Integer.valueOf(this.f152557a.f152079c));
        mo75140c(obj, obj2, qVar);
    }

    /* renamed from: c */
    public void mo75140c(Object obj, Object obj2, C32228q<? super C103941f, ? super C108504h, ? super Integer, C13598b0> qVar) {
        C87412m.m108594g(qVar, "content");
        C54152s<C54379j> sVar = this.f152557a;
        C54149b bVar = new C54149b(sVar.f152079c, 1, new C54379j(obj != null ? new C54376a(obj) : null, new C54377b(obj2), C110261c.m149879c(1604220427, true, new C54378c(qVar))));
        sVar.f152079c++;
        ((ArrayList) sVar.f152077a).add(bVar);
    }

    /* renamed from: d */
    public void mo75141d(int i, C32226l<? super Integer, ? extends Object> lVar, C32226l<? super Integer, ? extends Object> lVar2, C32229r<? super C103941f, ? super Integer, ? super C108504h, ? super Integer, C13598b0> rVar) {
        C87412m.m108594g(lVar2, DownloadInfo.CONTENTTYPE);
        C87412m.m108594g(rVar, "itemContent");
        C54152s<C54379j> sVar = this.f152557a;
        C54379j jVar = new C54379j(lVar, lVar2, rVar);
        if (i == 0) {
            sVar.getClass();
            return;
        }
        C54149b bVar = new C54149b(sVar.f152079c, i, jVar);
        sVar.f152079c += i;
        ((ArrayList) sVar.f152077a).add(bVar);
    }
}
