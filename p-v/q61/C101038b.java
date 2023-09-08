package q61;

import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import sx3.C110818d0;
import te3.C101824o80;

/* renamed from: q61.b */
public final class C101038b {

    /* renamed from: d */
    public static final C101039a f295826d = new C101039a((C8480h) null);

    /* renamed from: a */
    public final int f295827a;

    /* renamed from: b */
    public final String f295828b;

    /* renamed from: c */
    public final C101824o80 f295829c;

    /* renamed from: q61.b$a */
    public static final class C101039a {

        /* renamed from: q61.b$a$a */
        public static final class C101040a extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101040a f295830d = new C101040a();

            public C101040a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                return String.valueOf(bVar.f295827a);
            }
        }

        /* renamed from: q61.b$a$b */
        public static final class C101041b extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101041b f295831d = new C101041b();

            public C101041b() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                return bVar.f295828b;
            }
        }

        /* renamed from: q61.b$a$c */
        public static final class C101042c extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101042c f295832d = new C101042c();

            public C101042c() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                C101824o80 o802 = bVar.f295829c;
                return String.valueOf(EmojiLogic.m117482m(o802 != null ? o802.f298993D : null));
            }
        }

        /* renamed from: q61.b$a$d */
        public static final class C101043d extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101043d f295833d = new C101043d();

            public C101043d() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                C101824o80 o802 = bVar.f295829c;
                String n = EmojiLogic.m117483n(o802 != null ? o802.f298993D : null);
                C87412m.m108593f(n, "getEmotionLinkReportInfo(it.summary?.Link)");
                return n;
            }
        }

        /* renamed from: q61.b$a$e */
        public static final class C101044e extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101044e f295834d = new C101044e();

            public C101044e() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                C101824o80 o802 = bVar.f295829c;
                return String.valueOf(EmojiLogic.m117484o(o802 != null ? o802.f298993D : null));
            }
        }

        /* renamed from: q61.b$a$f */
        public static final class C101045f extends C87413o implements C32226l<C101038b, CharSequence> {

            /* renamed from: d */
            public static final C101045f f295835d = new C101045f();

            public C101045f() {
                super(1);
            }

            public Object invoke(Object obj) {
                C101038b bVar = (C101038b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                C101824o80 o802 = bVar.f295829c;
                String str = o802 != null ? o802.f298994d : null;
                return str == null ? "" : str;
            }
        }

        public C101039a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo140508a(EmoticonStoreActionStruct emoticonStoreActionStruct, List<C101038b> list) {
            EmoticonStoreActionStruct emoticonStoreActionStruct2 = emoticonStoreActionStruct;
            C87412m.m108594g(emoticonStoreActionStruct2, "actionReport");
            C87412m.m108594g(list, "dataList");
            List<C101038b> list2 = list;
            String S = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101045f.f295835d, 30, (Object) null);
            String S2 = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101041b.f295831d, 30, (Object) null);
            String S3 = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101040a.f295830d, 30, (Object) null);
            String S4 = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101042c.f295832d, 30, (Object) null);
            String S5 = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101044e.f295834d, 30, (Object) null);
            String S6 = C110818d0.m150921S(list2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C101043d.f295833d, 30, (Object) null);
            emoticonStoreActionStruct2.mo126618x(S);
            emoticonStoreActionStruct2.mo126614t(S2);
            emoticonStoreActionStruct2.mo126613s(S3);
            emoticonStoreActionStruct2.mo126615u(S4);
            emoticonStoreActionStruct2.mo126617w(S5);
            emoticonStoreActionStruct2.mo126616v(S6);
        }
    }

    public C101038b(int i, String str, C101824o80 o802) {
        C87412m.m108594g(str, "info");
        this.f295827a = i;
        this.f295828b = str;
        this.f295829c = o802;
    }
}
