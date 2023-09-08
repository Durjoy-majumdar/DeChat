package gy3;

import java.util.Arrays;
import rx3.C13597a0;
import rx3.C90108e;

/* renamed from: gy3.m */
public class C87412m {
    /* renamed from: a */
    public static boolean m108588a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* renamed from: b */
    public static boolean m108589b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m108590c(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            m108599l(illegalStateException, C87412m.class.getName());
            throw illegalStateException;
        }
    }

    /* renamed from: d */
    public static void m108591d(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            m108599l(nullPointerException, C87412m.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m108592e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            m108599l(nullPointerException, C87412m.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m108593f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            m108599l(nullPointerException, C87412m.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: g */
    public static void m108594g(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(m108598k(str));
            m108599l(nullPointerException, C87412m.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: h */
    public static void m108595h(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m108598k(str));
            m108599l(illegalArgumentException, C87412m.class.getName());
            throw illegalArgumentException;
        }
    }

    /* renamed from: i */
    public static int m108596i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m108597j(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: k */
    public static String m108598k(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: l */
    public static <T extends Throwable> T m108599l(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: m */
    public static String m108600m(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: n */
    public static void m108601n() {
        C90108e eVar = new C90108e();
        m108599l(eVar, C87412m.class.getName());
        throw eVar;
    }

    /* renamed from: o */
    public static void m108602o() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: p */
    public static void m108603p(String str) {
        C13597a0 a0Var = new C13597a0("lateinit property " + str + " has not been initialized");
        m108599l(a0Var, C87412m.class.getName());
        throw a0Var;
    }
}
