package p434ig;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: ig.l */
public final class C98678l extends C98676j {

    /* renamed from: g */
    public final C98676j f289369g = new C98676j();

    /* renamed from: h */
    public C101656f f289370h;

    /* renamed from: i */
    public String f289371i;

    /* renamed from: j */
    public C101656f.C101657a f289372j;

    /* renamed from: k */
    public final C13601g f289373k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98679a(this));

    /* renamed from: ig.l$a */
    public static final class C98679a extends C87413o implements C32224a<C98671a> {

        /* renamed from: d */
        public final /* synthetic */ C98678l f289374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98679a(C98678l lVar) {
            super(0);
            this.f289374d = lVar;
        }

        public Object invoke() {
            C98678l lVar = this.f289374d;
            lVar.getClass();
            String str = '.' + lVar.mo138091C("appmsg");
            C98678l lVar2 = this.f289374d;
            C101656f.C101658b bVar = C101656f.C101658b.Start;
            C101656f fVar = lVar2.f289370h;
            if (fVar != null) {
                if (!fVar.mo141123b().containsKey(str) && lVar2.f289372j != C101656f.C101657a.ParseEnd) {
                    C101656f fVar2 = lVar2.f289370h;
                    if (fVar2 != null) {
                        lVar2.f289372j = fVar2.mo141125d(str, bVar);
                    } else {
                        C87412m.m108603p("__xmlParser__");
                        throw null;
                    }
                }
                C101656f fVar3 = this.f289374d.f289370h;
                if (fVar3 == null) {
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                } else if (!fVar3.mo141123b().containsKey(str)) {
                    return this.f289374d.f289369g.f289368f;
                } else {
                    C98678l lVar3 = this.f289374d;
                    C101656f fVar4 = lVar3.f289370h;
                    if (fVar4 != null) {
                        return new C27535c(fVar4, lVar3.mo138091C("appmsg"));
                    }
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                }
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    public C98678l(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f289370h = fVar;
        this.f289371i = str;
    }

    /* renamed from: A */
    public C98671a mo138089A() {
        return (C98671a) this.f289373k.getValue();
    }

    /* renamed from: B */
    public void mo138090B(C98671a aVar) {
    }

    /* renamed from: C */
    public final String mo138091C(String str) {
        String str2 = this.f289371i;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f289371i;
            if (str3 != null) {
                sb.append(str3);
                sb.append('.');
                sb.append(str);
                return sb.toString();
            }
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        }
    }
}
