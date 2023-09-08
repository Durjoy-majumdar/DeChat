package xy3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C64197v;
import sx3.C90364q0;

/* renamed from: xy3.o */
public enum C26582o {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    FILE("file", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false);
    

    /* renamed from: e */
    public static final HashMap<String, C26582o> f73966e = null;

    /* renamed from: f */
    public static final Set<C26582o> f73967f = null;

    /* renamed from: g */
    public static final Set<C26582o> f73968g = null;

    /* renamed from: h */
    public static final List<C26582o> f73969h = null;

    /* renamed from: i */
    public static final List<C26582o> f73970i = null;

    /* renamed from: j */
    public static final List<C26582o> f73971j = null;

    /* renamed from: n */
    public static final List<C26582o> f73972n = null;

    /* renamed from: o */
    public static final List<C26582o> f73973o = null;

    /* renamed from: p */
    public static final List<C26582o> f73974p = null;

    /* renamed from: q */
    public static final List<C26582o> f73975q = null;

    /* renamed from: r */
    public static final List<C26582o> f73976r = null;

    /* renamed from: s */
    public static final List<C26582o> f73977s = null;

    /* renamed from: t */
    public static final List<C26582o> f73978t = null;

    /* renamed from: u */
    public static final List<C26582o> f73979u = null;

    /* renamed from: v */
    public static final List<C26582o> f73980v = null;

    /* renamed from: w */
    public static final Map<C26568e, C26582o> f73981w = null;

    /* renamed from: d */
    public final boolean f73985d;

    /* access modifiers changed from: public */
    static {
        f73966e = new HashMap<>();
        for (C26582o oVar : values()) {
            f73966e.put(oVar.name(), oVar);
        }
        C26582o[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C26582o oVar2 : values) {
            if (oVar2.f73985d) {
                arrayList.add(oVar2);
            }
        }
        f73967f = C110818d0.m150904D0(arrayList);
        f73968g = C110823p.m151004d0(values());
        C26582o oVar3 = CLASS;
        f73969h = C64197v.m75537f(ANNOTATION_CLASS, oVar3);
        f73970i = C64197v.m75537f(LOCAL_CLASS, oVar3);
        f73971j = C64197v.m75537f(CLASS_ONLY, oVar3);
        C26582o oVar4 = OBJECT;
        f73972n = C64197v.m75537f(COMPANION_OBJECT, oVar4, oVar3);
        f73973o = C64197v.m75537f(oVar4, oVar3);
        f73974p = C64197v.m75537f(INTERFACE, oVar3);
        f73975q = C64197v.m75537f(ENUM_CLASS, oVar3);
        C26582o oVar5 = PROPERTY;
        C26582o oVar6 = FIELD;
        f73976r = C64197v.m75537f(ENUM_ENTRY, oVar5, oVar6);
        C26582o oVar7 = PROPERTY_SETTER;
        f73977s = C26236u.m33719b(oVar7);
        C26582o oVar8 = PROPERTY_GETTER;
        f73978t = C26236u.m33719b(oVar8);
        f73979u = C26236u.m33719b(FUNCTION);
        C26582o oVar9 = FILE;
        f73980v = C26236u.m33719b(oVar9);
        C26568e eVar = C26568e.CONSTRUCTOR_PARAMETER;
        C26582o oVar10 = VALUE_PARAMETER;
        f73981w = C90364q0.m113147f(new C13604l(eVar, oVar10), new C13604l(C26568e.FIELD, oVar6), new C13604l(C26568e.PROPERTY, oVar5), new C13604l(C26568e.FILE, oVar9), new C13604l(C26568e.PROPERTY_GETTER, oVar8), new C13604l(C26568e.PROPERTY_SETTER, oVar7), new C13604l(C26568e.RECEIVER, oVar10), new C13604l(C26568e.SETTER_PARAMETER, oVar10), new C13604l(C26568e.PROPERTY_DELEGATE_FIELD, oVar6));
    }

    /* access modifiers changed from: public */
    C26582o(String str, boolean z) {
        this.f73985d = z;
    }
}
