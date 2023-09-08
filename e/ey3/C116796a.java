package ey3;

import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import gy3.C20863e;
import gy3.C24560g0;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import ny3.C25235d;

/* renamed from: ey3.a */
public final class C116796a {
    /* renamed from: a */
    public static final <T extends Annotation> C25235d<? extends T> m164749a(T t) {
        C87412m.m108594g(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        C87412m.m108593f(annotationType, "this as java.lang.annota…otation).annotationType()");
        C25235d<? extends T> a = C24560g0.m30725a(annotationType);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a;
    }

    /* renamed from: b */
    public static final <T> Class<T> m164750b(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "<this>");
        Class<?> c = ((C20863e) dVar).mo32564c();
        C87412m.m108592e(c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return c;
    }

    /* renamed from: c */
    public static final <T> Class<T> m164751c(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "<this>");
        Class<?> c = ((C20863e) dVar).mo32564c();
        if (!c.isPrimitive()) {
            return c;
        }
        String name = c.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? c : Double.class;
            case 104431:
                return !name.equals("int") ? c : Integer.class;
            case 3039496:
                return !name.equals("byte") ? c : Byte.class;
            case 3052374:
                return !name.equals("char") ? c : Character.class;
            case 3327612:
                return !name.equals("long") ? c : Long.class;
            case 3625364:
                return !name.equals("void") ? c : Void.class;
            case 64711720:
                return !name.equals(DownloadSetting.TYPE_BOOLEAN) ? c : Boolean.class;
            case 97526364:
                return !name.equals("float") ? c : Float.class;
            case 109413500:
                return !name.equals("short") ? c : Short.class;
            default:
                return c;
        }
    }

    /* renamed from: d */
    public static final <T> Class<T> m164752d(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "<this>");
        Class<?> c = ((C20863e) dVar).mo32564c();
        if (c.isPrimitive()) {
            return c;
        }
        String name = c.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }
}
