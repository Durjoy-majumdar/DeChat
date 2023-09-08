package p246u1;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p009c2.C104260k;
import p251v1.C14403a;
import p735w1.C37958a;
import p735w1.C38006x;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: u1.v */
public final class C111092v {

    /* renamed from: a */
    public static final C111096z<List<String>> f332646a = new C111096z<>("ContentDescription", C14100a.f39500d);

    /* renamed from: b */
    public static final C111096z<String> f332647b = new C111096z<>("StateDescription", (C32227p) null, 2, (C8480h) null);

    /* renamed from: c */
    public static final C111096z<C37320g> f332648c = new C111096z<>("ProgressBarRangeInfo", (C32227p) null, 2, (C8480h) null);

    /* renamed from: d */
    public static final C111096z<String> f332649d = new C111096z<>("PaneTitle", C14104e.f39504d);

    /* renamed from: e */
    public static final C111096z<C13598b0> f332650e = new C111096z<>("SelectableGroup", (C32227p) null, 2, (C8480h) null);

    /* renamed from: f */
    public static final C111096z<C111065b> f332651f = new C111096z<>("CollectionInfo", (C32227p) null, 2, (C8480h) null);

    /* renamed from: g */
    public static final C111096z<C111067c> f332652g = new C111096z<>("CollectionItemInfo", (C32227p) null, 2, (C8480h) null);

    /* renamed from: h */
    public static final C111096z<C13598b0> f332653h = new C111096z<>("Heading", (C32227p) null, 2, (C8480h) null);

    /* renamed from: i */
    public static final C111096z<C13598b0> f332654i = new C111096z<>("Disabled", (C32227p) null, 2, (C8480h) null);

    /* renamed from: j */
    public static final C111096z<C14099e> f332655j = new C111096z<>("LiveRegion", (C32227p) null, 2, (C8480h) null);

    /* renamed from: k */
    public static final C111096z<Boolean> f332656k = new C111096z<>("Focused", (C32227p) null, 2, (C8480h) null);

    /* renamed from: l */
    public static final C111096z<C13598b0> f332657l = new C111096z<>("InvisibleToUser", C14101b.f39501d);

    /* renamed from: m */
    public static final C111096z<C111073i> f332658m = new C111096z<>("HorizontalScrollAxisRange", (C32227p) null, 2, (C8480h) null);

    /* renamed from: n */
    public static final C111096z<C111073i> f332659n = new C111096z<>("VerticalScrollAxisRange", (C32227p) null, 2, (C8480h) null);

    /* renamed from: o */
    public static final C111096z<C13598b0> f332660o = new C111096z<>("IsPopup", C14103d.f39503d);

    /* renamed from: p */
    public static final C111096z<C111072h> f332661p = new C111096z<>("Role", C111093f.f332672d);

    /* renamed from: q */
    public static final C111096z<String> f332662q = new C111096z<>("TestTag", C14105g.f39505d);

    /* renamed from: r */
    public static final C111096z<List<C37958a>> f332663r = new C111096z<>("Text", C14106h.f39506d);

    /* renamed from: s */
    public static final C111096z<C37958a> f332664s = new C111096z<>("EditableText", (C32227p) null, 2, (C8480h) null);

    /* renamed from: t */
    public static final C111096z<C38006x> f332665t = new C111096z<>("TextSelectionRange", (C32227p) null, 2, (C8480h) null);

    /* renamed from: u */
    public static final C111096z<C104260k> f332666u = new C111096z<>("ImeAction", (C32227p) null, 2, (C8480h) null);

    /* renamed from: v */
    public static final C111096z<Boolean> f332667v = new C111096z<>("Selected", (C32227p) null, 2, (C8480h) null);

    /* renamed from: w */
    public static final C111096z<C14403a> f332668w = new C111096z<>("ToggleableState", (C32227p) null, 2, (C8480h) null);

    /* renamed from: x */
    public static final C111096z<C13598b0> f332669x = new C111096z<>("Password", (C32227p) null, 2, (C8480h) null);

    /* renamed from: y */
    public static final C111096z<String> f332670y = new C111096z<>("Error", (C32227p) null, 2, (C8480h) null);

    /* renamed from: z */
    public static final C111096z<C32226l<Object, Integer>> f332671z = new C111096z<>("IndexForKey", (C32227p) null, 2, (C8480h) null);

    /* renamed from: u1.v$a */
    public static final class C14100a extends C87413o implements C32227p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: d */
        public static final C14100a f39500d = new C14100a();

        public C14100a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C87412m.m108594g(list2, "childValue");
            if (list == null) {
                return list2;
            }
            List B0 = C110818d0.m150900B0(list);
            ((ArrayList) B0).addAll(list2);
            return B0;
        }
    }

    /* renamed from: u1.v$b */
    public static final class C14101b extends C87413o implements C32227p<C13598b0, C13598b0, C13598b0> {

        /* renamed from: d */
        public static final C14101b f39501d = new C14101b();

        public C14101b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C13598b0 b0Var = (C13598b0) obj;
            C87412m.m108594g((C13598b0) obj2, "<anonymous parameter 1>");
            return b0Var;
        }
    }

    /* renamed from: u1.v$c */
    public static final class C14102c extends C87413o implements C32227p<C13598b0, C13598b0, C13598b0> {

        /* renamed from: d */
        public static final C14102c f39502d = new C14102c();

        public C14102c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C13598b0 b0Var = (C13598b0) obj;
            C87412m.m108594g((C13598b0) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* renamed from: u1.v$d */
    public static final class C14103d extends C87413o implements C32227p<C13598b0, C13598b0, C13598b0> {

        /* renamed from: d */
        public static final C14103d f39503d = new C14103d();

        public C14103d() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C13598b0 b0Var = (C13598b0) obj;
            C87412m.m108594g((C13598b0) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* renamed from: u1.v$e */
    public static final class C14104e extends C87413o implements C32227p<String, String, String> {

        /* renamed from: d */
        public static final C14104e f39504d = new C14104e();

        public C14104e() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C87412m.m108594g((String) obj2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* renamed from: u1.v$g */
    public static final class C14105g extends C87413o implements C32227p<String, String, String> {

        /* renamed from: d */
        public static final C14105g f39505d = new C14105g();

        public C14105g() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C87412m.m108594g((String) obj2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* renamed from: u1.v$h */
    public static final class C14106h extends C87413o implements C32227p<List<? extends C37958a>, List<? extends C37958a>, List<? extends C37958a>> {

        /* renamed from: d */
        public static final C14106h f39506d = new C14106h();

        public C14106h() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C87412m.m108594g(list2, "childValue");
            if (list == null) {
                return list2;
            }
            List B0 = C110818d0.m150900B0(list);
            ((ArrayList) B0).addAll(list2);
            return B0;
        }
    }

    /* renamed from: u1.v$f */
    public static final class C111093f extends C87413o implements C32227p<C111072h, C111072h, C111072h> {

        /* renamed from: d */
        public static final C111093f f332672d = new C111093f();

        public C111093f() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C111072h hVar = (C111072h) obj;
            int i = ((C111072h) obj2).f332604a;
            return hVar;
        }
    }

    static {
        C87412m.m108594g(C14102c.f39502d, "mergePolicy");
    }
}
