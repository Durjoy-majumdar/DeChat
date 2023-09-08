package gy3;

import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import ey3.C116796a;
import fy3.C24480c;
import fy3.C24481d;
import fy3.C24482e;
import fy3.C24483f;
import fy3.C24484g;
import fy3.C24485h;
import fy3.C24486i;
import fy3.C24487j;
import fy3.C24488k;
import fy3.C24489m;
import fy3.C24490n;
import fy3.C24491o;
import fy3.C24492v;
import fy3.C24493w;
import fy3.C32224a;
import fy3.C32225b;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import fy3.C32230s;
import fy3.C32231t;
import fy3.C32232u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ny3.C25235d;
import rx3.C13604l;
import rx3.C36565b;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import z04.C112550d0;

/* renamed from: gy3.f */
public final class C24559f implements C25235d<Object>, C20863e {

    /* renamed from: e */
    public static final Map<Class<? extends C36565b<?>>, Integer> f70154e;

    /* renamed from: f */
    public static final HashMap<String, String> f70155f;

    /* renamed from: g */
    public static final Map<String, String> f70156g;

    /* renamed from: d */
    public final Class<?> f70157d;

    static {
        int i = 0;
        List f = C64197v.m75537f(C32224a.class, C32226l.class, C32227p.class, C32228q.class, C32229r.class, C32230s.class, C32231t.class, C32232u.class, C24492v.class, C24493w.class, C32225b.class, C24480c.class, C24481d.class, C24482e.class, C24483f.class, C24484g.class, C24485h.class, C24486i.class, C24487j.class, C24488k.class, C24489m.class, C24490n.class, C24491o.class);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
        for (Object next : f) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C13604l((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        f70154e = C90364q0.m113152k(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadSetting.TYPE_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C87412m.m108593f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C87412m.m108593f(str, "kotlinName");
            sb.append(C112550d0.m153793c0(str, '.', str));
            sb.append("CompanionObject");
            String sb4 = sb.toString();
            hashMap3.put(sb4, str + ".Companion");
        }
        for (Map.Entry next2 : f70154e.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f70155f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(key, C112550d0.m153793c0(str2, '.', str2));
        }
        f70156g = linkedHashMap;
    }

    public C24559f(Class<?> cls) {
        C87412m.m108594g(cls, "jClass");
        this.f70157d = cls;
    }

    /* renamed from: c */
    public Class<?> mo32564c() {
        return this.f70157d;
    }

    /* renamed from: e */
    public String mo51262e() {
        String str;
        Class<?> cls = this.f70157d;
        C87412m.m108594g(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = f70155f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }
        String str3 = f70155f.get(cls.getName());
        return str3 == null ? cls.getCanonicalName() : str3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24559f) && C87412m.m108589b(C116796a.m164751c(this), C116796a.m164751c((C25235d) obj));
    }

    /* renamed from: h */
    public String mo51264h() {
        Class<?> cls = this.f70157d;
        C87412m.m108594g(cls, "jClass");
        String str = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return C112550d0.m153791a0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return C112550d0.m153792b0(simpleName, '$', (String) null, 2, (Object) null);
                }
                return C112550d0.m153791a0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    String str2 = (String) ((LinkedHashMap) f70156g).get(componentType.getName());
                    if (str2 != null) {
                        str = str2 + "Array";
                    }
                }
                if (str == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) ((LinkedHashMap) f70156g).get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
        }
        return str;
    }

    public int hashCode() {
        return C116796a.m164751c(this).hashCode();
    }

    public String toString() {
        return this.f70157d.toString() + " (Kotlin reflection is not available)";
    }
}
