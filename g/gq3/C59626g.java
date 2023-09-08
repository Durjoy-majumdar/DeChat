package gq3;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C59480d;
import p157gk.C59491j;
import p175j0.C108504h;
import p175j0.C33487v1;
import p267x.C111885b;
import p267x.C111929l;
import p415q0.C110261c;
import p436a1.C103266t0;
import p543h0.C107927c0;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;
import zp3.C112667x;

/* renamed from: gq3.g */
public final class C59626g {

    /* renamed from: gq3.g$b */
    public static final class C59627b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f170383d;

        /* renamed from: e */
        public final /* synthetic */ String f170384e;

        /* renamed from: f */
        public final /* synthetic */ int f170385f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C59480d> f170386g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<String, C13598b0> f170387h;

        /* renamed from: i */
        public final /* synthetic */ int f170388i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59627b(C32224a<C13598b0> aVar, String str, int i, ArrayList<C59480d> arrayList, C32226l<? super String, C13598b0> lVar, int i2) {
            super(2);
            this.f170383d = aVar;
            this.f170384e = str;
            this.f170385f = i;
            this.f170386g = arrayList;
            this.f170387h = lVar;
            this.f170388i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C59626g.m69503a(this.f170383d, this.f170384e, this.f170385f, this.f170386g, this.f170387h, (C108504h) obj, this.f170388i | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gq3.g$a */
    public static final class C59628a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f170389d;

        /* renamed from: e */
        public final /* synthetic */ int f170390e;

        /* renamed from: f */
        public final /* synthetic */ String f170391f;

        /* renamed from: g */
        public final /* synthetic */ int f170392g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<C59480d> f170393h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<String, C13598b0> f170394i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59628a(C32224a<C13598b0> aVar, int i, String str, int i2, ArrayList<C59480d> arrayList, C32226l<? super String, C13598b0> lVar) {
            super(2);
            this.f170389d = aVar;
            this.f170390e = i;
            this.f170391f = str;
            this.f170392g = i2;
            this.f170393h = arrayList;
            this.f170394i = lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                int i2 = C59491j.f169996a ? C0966R.color.f2927a : C0966R.color.f2947a4;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                C107927c0.m146232a(C111885b.m152607c(aVar, C110954a.m151254b(i2, context), (C103266t0) null, 2, (Object) null), (C103266t0) null, 0, 0, (C111929l) null, 0.0f, C110261c.m149878b(hVar, -207716989, true, new C107906f(this.f170389d, this.f170390e, this.f170391f, this.f170392g, this.f170393h, this.f170394i)), hVar, 1572864, 62);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m69503a(C32224a<C13598b0> aVar, String str, int i, ArrayList<C59480d> arrayList, C32226l<? super String, C13598b0> lVar, C108504h hVar, int i2) {
        C87412m.m108594g(aVar, "onBackClick");
        C87412m.m108594g(str, "headerPath");
        C87412m.m108594g(arrayList, "data");
        C87412m.m108594g(lVar, "onDetailClick");
        C108504h z = hVar.mo51623z(954750360);
        C112667x.m154043a(C110261c.m149878b(z, -427032249, true, new C59628a(aVar, i2, str, i, arrayList, lVar)), z, 6);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C59627b(aVar, str, i, arrayList, lVar, i2));
        }
    }
}
