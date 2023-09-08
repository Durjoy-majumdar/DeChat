package z04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import my3.C61594j;
import my3.C61595o;
import sx3.C110818d0;
import sx3.C64173a;
import sx3.C64177c;
import sx3.C64197v;
import y04.C112354s;
import y04.C66488v;

/* renamed from: z04.h */
public final class C66717h implements C66716g {

    /* renamed from: a */
    public final Matcher f191751a;

    /* renamed from: b */
    public final CharSequence f191752b;

    /* renamed from: c */
    public final C66715f f191753c = new C66719b(this);

    /* renamed from: d */
    public List<String> f191754d;

    /* renamed from: z04.h$a */
    public static final class C66718a extends C64177c<String> {

        /* renamed from: e */
        public final /* synthetic */ C66717h f191755e;

        public C66718a(C66717h hVar) {
            this.f191755e = hVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        /* renamed from: f */
        public int mo52189f() {
            return this.f191755e.f191751a.groupCount() + 1;
        }

        public Object get(int i) {
            String group = this.f191755e.f191751a.group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    /* renamed from: z04.h$b */
    public static final class C66719b extends C64173a<C39297e> implements C66715f {

        /* renamed from: d */
        public final /* synthetic */ C66717h f191756d;

        /* renamed from: z04.h$b$a */
        public static final class C66720a extends C87413o implements C32226l<Integer, C39297e> {

            /* renamed from: d */
            public final /* synthetic */ C66719b f191757d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66720a(C66719b bVar) {
                super(1);
                this.f191757d = bVar;
            }

            public Object invoke(Object obj) {
                return this.f191757d.get(((Number) obj).intValue());
            }
        }

        public C66719b(C66717h hVar) {
            this.f191756d = hVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof C39297e)) {
                return false;
            }
            return super.contains((C39297e) obj);
        }

        /* renamed from: f */
        public int mo52189f() {
            return this.f191756d.f191751a.groupCount() + 1;
        }

        public C39297e get(int i) {
            Matcher matcher = this.f191756d.f191751a;
            C61594j i2 = C61595o.m72301i(matcher.start(i), matcher.end(i));
            if (i2.mo59687f0().intValue() < 0) {
                return null;
            }
            String group = this.f191756d.f191751a.group(i);
            C87412m.m108593f(group, "matchResult.group(index)");
            return new C39297e(group, i2);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C39297e> iterator() {
            return new C66488v.C66489a((C66488v) C112354s.m153290m(C110818d0.m150897A(C64197v.m75535d(this)), new C66720a(this)));
        }
    }

    public C66717h(Matcher matcher, CharSequence charSequence) {
        C87412m.m108594g(matcher, "matcher");
        C87412m.m108594g(charSequence, "input");
        this.f191751a = matcher;
        this.f191752b = charSequence;
    }

    /* renamed from: a */
    public C66715f mo90751a() {
        return this.f191753c;
    }

    /* renamed from: b */
    public List<String> mo90752b() {
        if (this.f191754d == null) {
            this.f191754d = new C66718a(this);
        }
        List<String> list = this.f191754d;
        C87412m.m108591d(list);
        return list;
    }

    /* renamed from: c */
    public C61594j mo90753c() {
        Matcher matcher = this.f191751a;
        return C61595o.m72301i(matcher.start(), matcher.end());
    }

    public String getValue() {
        String group = this.f191751a.group();
        C87412m.m108593f(group, "matchResult.group()");
        return group;
    }

    public C66716g next() {
        int end = this.f191751a.end() + (this.f191751a.end() == this.f191751a.start() ? 1 : 0);
        if (end > this.f191752b.length()) {
            return null;
        }
        Matcher matcher = this.f191751a.pattern().matcher(this.f191752b);
        C87412m.m108593f(matcher, "matcher.pattern().matcher(input)");
        return C53732l.m60231a(matcher, end, this.f191752b);
    }
}
