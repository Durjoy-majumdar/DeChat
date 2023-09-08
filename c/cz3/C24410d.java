package cz3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import com.tencent.xweb.file.XVFSFile;
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
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ny3.C25235d;
import rx3.C13604l;
import rx3.C36565b;
import sx3.C110823p;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90364q0;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import y04.C112349m;
import y04.C112354s;
import y04.C15925h;
import z04.C112551y;

/* renamed from: cz3.d */
public final class C24410d {

    /* renamed from: a */
    public static final List<C25235d<? extends Object>> f69857a;

    /* renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f69858b;

    /* renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f69859c;

    /* renamed from: d */
    public static final Map<Class<? extends C36565b<?>>, Integer> f69860d;

    /* renamed from: cz3.d$a */
    public static final class C24411a extends C87413o implements C32226l<ParameterizedType, ParameterizedType> {

        /* renamed from: d */
        public static final C24411a f69861d = new C24411a();

        public C24411a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            C87412m.m108594g(parameterizedType, LocaleUtil.ITALIAN);
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: cz3.d$b */
    public static final class C24412b extends C87413o implements C32226l<ParameterizedType, C15925h<? extends Type>> {

        /* renamed from: d */
        public static final C24412b f69862d = new C24412b();

        public C24412b() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            C87412m.m108594g(parameterizedType, LocaleUtil.ITALIAN);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C87412m.m108593f(actualTypeArguments, "it.actualTypeArguments");
            return C110823p.m151006v(actualTypeArguments);
        }
    }

    static {
        int i = 0;
        List<C25235d<? extends Object>> f = C64197v.m75537f(C24560g0.m30725a(Boolean.TYPE), C24560g0.m30725a(Byte.TYPE), C24560g0.m30725a(Character.TYPE), C24560g0.m30725a(Double.TYPE), C24560g0.m30725a(Float.TYPE), C24560g0.m30725a(Integer.TYPE), C24560g0.m30725a(Long.TYPE), C24560g0.m30725a(Short.TYPE));
        f69857a = f;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
        for (C25235d dVar : f) {
            arrayList.add(new C13604l(C116796a.m164751c(dVar), C116796a.m164752d(dVar)));
        }
        f69858b = C90364q0.m113152k(arrayList);
        List<C25235d<? extends Object>> list = f69857a;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (C25235d dVar2 : list) {
            arrayList2.add(new C13604l(C116796a.m164752d(dVar2), C116796a.m164751c(dVar2)));
        }
        f69859c = C90364q0.m113152k(arrayList2);
        List f2 = C64197v.m75537f(C32224a.class, C32226l.class, C32227p.class, C32228q.class, C32229r.class, C32230s.class, C32231t.class, C32232u.class, C24492v.class, C24493w.class, C32225b.class, C24480c.class, C24481d.class, C24482e.class, C24483f.class, C24484g.class, C24485h.class, C24486i.class, C24487j.class, C24488k.class, C24489m.class, C24490n.class, C24491o.class);
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(f2, 10));
        for (Object next : f2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new C13604l((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        f69860d = C90364q0.m113152k(arrayList3);
    }

    /* renamed from: a */
    public static final C26408b m30455a(Class<?> cls) {
        C26408b a;
        C87412m.m108594g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                if (!(cls.getSimpleName().length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    return (declaringClass == null || (a = m30455a(declaringClass)) == null) ? C26408b.m33992l(new C22826c(cls.getName())) : a.mo53389d(C22830f.m26794f(cls.getSimpleName()));
                }
            }
            C22826c cVar = new C22826c(cls.getName());
            return new C26408b(cVar.mo35976e(), C22826c.m26773j(cVar.mo35978f()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    /* renamed from: b */
    public static final String m30456b(Class<?> cls) {
        C87412m.m108594g(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                    }
                    break;
                case 64711720:
                    if (name.equals(DownloadSetting.TYPE_BOOLEAN)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return ExifInterface.LATITUDE_SOUTH;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            return C112551y.m153815o(cls.getName(), '.', XVFSFile.SEPARATOR_CHAR, false, 4, (Object) null);
        } else {
            return 'L' + C112551y.m153815o(cls.getName(), '.', XVFSFile.SEPARATOR_CHAR, false, 4, (Object) null) + ';';
        }
    }

    /* renamed from: c */
    public static final List<Type> m30457c(Type type) {
        C87412m.m108594g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C64186f0.f181907d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C112354s.m153296s(C112354s.m153289l(C112349m.m153281d(type, C24411a.f69861d), C24412b.f69862d));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C87412m.m108593f(actualTypeArguments, "actualTypeArguments");
        return C110823p.m151001a0(actualTypeArguments);
    }

    /* renamed from: d */
    public static final ClassLoader m30458d(Class<?> cls) {
        C87412m.m108594g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C87412m.m108593f(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: e */
    public static final boolean m30459e(Class<?> cls) {
        C87412m.m108594g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
