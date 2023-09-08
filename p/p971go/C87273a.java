package p971go;

import com.google.protobuf.C23803a;
import e42.C7596h;
import e42.C86430i;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import l10.C24924g;
import p150eo.C86596j;
import p467co.C80112c;
import p467co.C80122f;
import rx3.C13598b0;

/* renamed from: go.a */
public final class C87273a<T extends C86596j> extends C86430i<T> {

    /* renamed from: go.a$a */
    public static final class C87274a extends C87413o implements C32227p<String, C24924g.C24925a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87273a<T> f253001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87274a(C87273a<T> aVar) {
            super(2);
            this.f253001d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            if ((r5.length() > 0) == true) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                l10.g$a r6 = (l10.C24924g.C24925a) r6
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L_0x0014
                int r2 = r5.length()
                if (r2 <= 0) goto L_0x0010
                r2 = 1
                goto L_0x0011
            L_0x0010:
                r2 = 0
            L_0x0011:
                if (r2 != r0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r0 = 0
            L_0x0015:
                if (r0 == 0) goto L_0x0028
                go.a<T> r6 = r4.f253001d
                fy3.l r6 = r6.mo120840p()
                go.a<T> r0 = r4.f253001d
                r1 = 2
                e42.h r5 = r0.mo120842g(r1, r5)
                r6.invoke(r5)
                goto L_0x004b
            L_0x0028:
                go.a<T> r5 = r4.f253001d
                fy3.l r5 = r5.mo120840p()
                go.a<T> r0 = r4.f253001d
                e42.h r0 = r0.mo120844i()
                if (r6 == 0) goto L_0x0039
                int r2 = r6.f71021e
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                java.lang.String r3 = "offsetHeight"
                r0.put(r3, r2)
                if (r6 == 0) goto L_0x0043
                int r1 = r6.f71022f
            L_0x0043:
                java.lang.String r6 = "offsetTop"
                r0.put(r6, r1)
                r5.invoke(r0)
            L_0x004b:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p971go.C87273a.C87274a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "getFrameSetOffsetInfo";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("frameSetName");
        C87412m.m108593f(optString, "frameSetName");
        if (optString.length() == 0) {
            mo120840p().invoke(mo120842g(1, "empty frameSetName"));
        }
        C86596j jVar = (C86596j) this.f251227a;
        if (jVar != null) {
            C87274a aVar = new C87274a(this);
            C80112c cVar = jVar.f251534n;
            cVar.getClass();
            C24924g.C24928b.C24930b a = C24924g.C24928b.f71027g.toBuilder();
            a.f71032d = 1 | a.f71032d;
            a.f71033e = optString;
            a.onChanged();
            C13598b0 b0Var = C13598b0.f38549a;
            C24924g.C24928b a2 = a.buildPartial();
            if (a2.isInitialized()) {
                cVar.mo121193A("getFrameSetOffsetInfo", a2.toByteArray(), new C80122f(aVar));
                return;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a2);
        }
    }
}
