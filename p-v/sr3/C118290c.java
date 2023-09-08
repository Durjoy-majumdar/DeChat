package sr3;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: sr3.c */
public class C118290c {

    /* renamed from: b */
    public static final Pattern f353539b = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");

    /* renamed from: c */
    public static final Object f353540c = new C118292b((C118291a) null);

    /* renamed from: a */
    public final Map<String, Object> f353541a;

    /* renamed from: sr3.c$b */
    public static final class C118292b {
        public C118292b(C118291a aVar) {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "null";
        }
    }

    public C118290c() {
        this.f353541a = new HashMap();
    }

    /* renamed from: b */
    public static <A extends Annotation> A m166864b(Method method, Class<A> cls) {
        if (!(method == null || cls == null)) {
            if (method.isAnnotationPresent(cls)) {
                return method.getAnnotation(cls);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            Class[] interfaces = declaringClass.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                try {
                    return m166864b(interfaces[i].getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                    i++;
                }
            }
            try {
                return m166864b(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m166865c(Method method, Class<? extends Annotation> cls) {
        if (!(method == null || cls == null)) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            Class[] interfaces = declaringClass.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                try {
                    int c = m166865c(interfaces[i].getMethod(method.getName(), method.getParameterTypes()), cls);
                    if (c > 0) {
                        return c + 1;
                    }
                    i++;
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                int c2 = m166865c(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (c2 > 0) {
                    return c2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static Writer m166866f(String str, Writer writer) {
        if (str == null || str.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer.write("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case 8:
                                    writer.write("\\b");
                                    break;
                                case 9:
                                    writer.write("\\t");
                                    break;
                                case 10:
                                    writer.write("\\n");
                                    break;
                                default:
                                    if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                        writer.write(charAt);
                                        break;
                                    } else {
                                        writer.write("\\u");
                                        String hexString = Integer.toHexString(charAt);
                                        writer.write("0000", 0, 4 - hexString.length());
                                        writer.write(hexString);
                                        break;
                                    }
                            }
                        }
                    } else {
                        if (c == '<') {
                            writer.write(92);
                        }
                        writer.write(charAt);
                    }
                }
                writer.write(92);
                writer.write(charAt);
            } else {
                writer.write("\\r");
            }
            i++;
            c = charAt;
        }
        writer.write(34);
        return writer;
    }

    /* renamed from: g */
    public static String m166867g(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                obj = m166866f(str, stringWriter).toString();
            } catch (IOException unused) {
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|(2:28|29)(1:27)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = java.lang.Double.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r0.isNaN() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.lang.NumberFormatException("val [" + r10 + "] is not a valid number.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        throw new java.lang.NumberFormatException("val [" + r10 + "] is not a valid number.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0051 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Number m166868h(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            r2 = 57
            r3 = 45
            java.lang.String r4 = "] is not a valid number."
            java.lang.String r5 = "val ["
            r6 = 48
            if (r1 < r6) goto L_0x0013
            if (r1 <= r2) goto L_0x0015
        L_0x0013:
            if (r1 != r3) goto L_0x0113
        L_0x0015:
            r7 = 46
            int r7 = r10.indexOf(r7)
            r8 = -1
            r9 = 1
            if (r7 > r8) goto L_0x0037
            r7 = 101(0x65, float:1.42E-43)
            int r7 = r10.indexOf(r7)
            if (r7 > r8) goto L_0x0037
            r7 = 69
            int r7 = r10.indexOf(r7)
            if (r7 > r8) goto L_0x0037
            java.lang.String r7 = "-0"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r0 == 0) goto L_0x0092
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0051 }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r1 != r3) goto L_0x0050
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x0051 }
            int r1 = r1.compareTo(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r1 != 0) goto L_0x0050
            r0 = -9223372036854775808
            java.lang.Double r10 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            return r10
        L_0x0050:
            return r0
        L_0x0051:
            java.lang.Double r0 = java.lang.Double.valueOf(r10)     // Catch:{ NumberFormatException -> 0x007a }
            boolean r1 = r0.isNaN()     // Catch:{ NumberFormatException -> 0x007a }
            if (r1 != 0) goto L_0x0062
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x007a }
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x0062:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x007a }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r5)     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x007a }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x007a }
            throw r0     // Catch:{ NumberFormatException -> 0x007a }
        L_0x007a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0092:
            if (r1 != r6) goto L_0x00bb
            int r0 = r10.length()
            if (r0 <= r9) goto L_0x00bb
            char r0 = r10.charAt(r9)
            if (r0 < r6) goto L_0x00eb
            if (r0 <= r2) goto L_0x00a3
            goto L_0x00eb
        L_0x00a3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x00bb:
            if (r1 != r3) goto L_0x00eb
            int r0 = r10.length()
            r1 = 2
            if (r0 <= r1) goto L_0x00eb
            char r0 = r10.charAt(r9)
            char r1 = r10.charAt(r1)
            if (r0 != r6) goto L_0x00eb
            if (r1 < r6) goto L_0x00eb
            if (r1 <= r2) goto L_0x00d3
            goto L_0x00eb
        L_0x00d3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x00eb:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r10)
            int r10 = r0.bitLength()
            r1 = 31
            if (r10 > r1) goto L_0x0101
            int r10 = r0.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L_0x0101:
            int r10 = r0.bitLength()
            r1 = 63
            if (r10 > r1) goto L_0x0112
            long r0 = r0.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x0112:
            return r0
        L_0x0113:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118290c.m166868h(java.lang.String):java.lang.Number");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3.isNaN() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0.isNaN() == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m166869i(java.lang.Object r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L_0x003a
            java.lang.Number r3 = (java.lang.Number) r3
            boolean r0 = r3 instanceof java.lang.Double
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r0 = r3
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r2 = r0.isInfinite()
            if (r2 != 0) goto L_0x002f
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L_0x001b
            goto L_0x002f
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L_0x002e
            java.lang.Float r3 = (java.lang.Float) r3
            boolean r0 = r3.isInfinite()
            if (r0 != 0) goto L_0x002f
            boolean r3 = r3.isNaN()
            if (r3 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r1 == 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            sr3.b r3 = new sr3.b
            java.lang.String r0 = "JSON does not allow non-finite numbers."
            r3.<init>((java.lang.String) r0)
            throw r3
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118290c.m166869i(java.lang.Object):void");
    }

    /* renamed from: j */
    public static Object m166870j(Object obj) {
        try {
            Object obj2 = f353540c;
            if (obj2.equals(obj)) {
                return obj2;
            }
            if ((obj instanceof C118290c) || (obj instanceof C118288a) || obj2.equals(obj) || (obj instanceof C118295f) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof BigInteger) || (obj instanceof BigDecimal)) {
                return obj;
            }
            if (obj instanceof Enum) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new C118288a((Collection<?>) (Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new C118288a(obj);
            }
            if (obj instanceof Map) {
                return new C118290c((Map<?, ?>) (Map) obj);
            }
            Package packageR = obj.getClass().getPackage();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.startsWith("java.") && !name.startsWith("javax.")) {
                if (obj.getClass().getClassLoader() != null) {
                    return new C118290c(obj);
                }
            }
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static final Writer m166871l(Writer writer, Object obj, int i, int i2) {
        if (obj == null || obj.equals((Object) null)) {
            writer.write("null");
        } else if (obj instanceof C118295f) {
            try {
                String a = ((C118295f) obj).mo183077a();
                writer.write(a != null ? a.toString() : m166867g(obj.toString()));
            } catch (Exception e) {
                throw new C118289b((Throwable) e);
            }
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            m166869i(number);
            String obj2 = number.toString();
            if (obj2.indexOf(46) > 0 && obj2.indexOf(101) < 0 && obj2.indexOf(69) < 0) {
                while (obj2.endsWith("0")) {
                    obj2 = obj2.substring(0, obj2.length() - 1);
                }
                if (obj2.endsWith(".")) {
                    obj2 = obj2.substring(0, obj2.length() - 1);
                }
            }
            if (f353539b.matcher(obj2).matches()) {
                writer.write(obj2);
            } else {
                m166866f(obj2, writer);
            }
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof Enum) {
            writer.write(m166867g(((Enum) obj).name()));
        } else if (obj instanceof C118290c) {
            ((C118290c) obj).mo183070k(writer, i, i2);
        } else if (obj instanceof C118288a) {
            ((C118288a) obj).mo183065k(writer, i, i2);
        } else if (obj instanceof Map) {
            new C118290c((Map<?, ?>) (Map) obj).mo183070k(writer, i, i2);
        } else if (obj instanceof Collection) {
            new C118288a((Collection<?>) (Collection) obj).mo183065k(writer, i, i2);
        } else if (obj.getClass().isArray()) {
            new C118288a(obj).mo183065k(writer, i, i2);
        } else {
            m166866f(obj.toString(), writer);
        }
        return writer;
    }

    /* renamed from: a */
    public C118290c mo183067a(String str, Object obj) {
        m166869i(obj);
        Object d = mo183068d(str);
        if (d == null) {
            if (obj instanceof C118288a) {
                C118288a aVar = new C118288a();
                aVar.mo183063i(obj);
                obj = aVar;
            }
            mo183069e(str, obj);
        } else if (d instanceof C118288a) {
            ((C118288a) d).mo183063i(obj);
        } else {
            C118288a aVar2 = new C118288a();
            aVar2.mo183063i(d);
            aVar2.mo183063i(obj);
            mo183069e(str, aVar2);
        }
        return this;
    }

    /* renamed from: d */
    public Object mo183068d(String str) {
        if (str == null) {
            return null;
        }
        return this.f353541a.get(str);
    }

    /* renamed from: e */
    public C118290c mo183069e(String str, Object obj) {
        if (str != null) {
            if (obj != null) {
                m166869i(obj);
                ((HashMap) this.f353541a).put(str, obj);
            } else {
                ((HashMap) this.f353541a).remove(str);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }

    /* renamed from: k */
    public Writer mo183070k(Writer writer, int i, int i2) {
        String str;
        String str2;
        try {
            int size = ((HashMap) this.f353541a).size();
            writer.write(123);
            if (size == 1) {
                Map.Entry entry = (Map.Entry) ((HashMap) this.f353541a).entrySet().iterator().next();
                str2 = (String) entry.getKey();
                writer.write(m166867g(str2));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                m166871l(writer, entry.getValue(), i, i2);
            } else if (size != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry entry2 : ((HashMap) this.f353541a).entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    for (int i4 = 0; i4 < i3; i4++) {
                        writer.write(32);
                    }
                    str = (String) entry2.getKey();
                    writer.write(m166867g(str));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    m166871l(writer, entry2.getValue(), i, i3);
                    z = true;
                }
                if (i > 0) {
                    writer.write(10);
                }
                for (int i5 = 0; i5 < i2; i5++) {
                    writer.write(32);
                }
            }
            writer.write(125);
            return writer;
        } catch (Exception e) {
            throw new C118289b("Unable to write JSONObject value for key: " + str, e);
        } catch (Exception e2) {
            throw new C118289b("Unable to write JSONObject value for key: " + str2, e2);
        } catch (IOException e3) {
            throw new C118289b((Throwable) e3);
        }
    }

    public String toString() {
        String obj;
        try {
            StringWriter stringWriter = new StringWriter();
            synchronized (stringWriter.getBuffer()) {
                mo183070k(stringWriter, 0, 0);
                obj = stringWriter.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public C118290c(C118296g gVar) {
        this();
        if (gVar.mo183081d() == '{') {
            while (true) {
                char d = gVar.mo183081d();
                if (d == 0) {
                    throw gVar.mo183083f("A JSONObject text must end with '}'");
                } else if (d != '}') {
                    gVar.mo183078a();
                    String obj = gVar.mo183082e().toString();
                    if (gVar.mo183081d() == ':') {
                        if (obj != null) {
                            if (mo183068d(obj) == null) {
                                Object e = gVar.mo183082e();
                                if (e != null) {
                                    mo183069e(obj, e);
                                }
                            } else {
                                throw gVar.mo183083f("Duplicate key \"" + obj + FastJsonResponse.QUOTE);
                            }
                        }
                        char d2 = gVar.mo183081d();
                        if (d2 == ',' || d2 == ';') {
                            if (gVar.mo183081d() != '}') {
                                gVar.mo183078a();
                            } else {
                                return;
                            }
                        } else if (d2 != '}') {
                            throw gVar.mo183083f("Expected a ',' or '}'");
                        } else {
                            return;
                        }
                    } else {
                        throw gVar.mo183083f("Expected a ':' after a key");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw gVar.mo183083f("A JSONObject text must begin with '{'");
        }
    }

    public C118290c(Map<?, ?> map) {
        if (map == null) {
            this.f353541a = new HashMap();
            return;
        }
        this.f353541a = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                Object value = next.getValue();
                if (value != null) {
                    this.f353541a.put(String.valueOf(next.getKey()), m166870j(value));
                }
            } else {
                throw new NullPointerException("Null key.");
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[ExcHandler: IllegalAccessException | IllegalArgumentException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:67:0x0126] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118290c(java.lang.Object r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.Class r0 = r11.getClass()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0019
            java.lang.reflect.Method[] r0 = r0.getMethods()
            goto L_0x001d
        L_0x0019:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
        L_0x001d:
            int r1 = r0.length
            r4 = 0
        L_0x001f:
            if (r4 >= r1) goto L_0x012f
            r5 = r0[r4]
            int r6 = r5.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isPublic(r6)
            if (r7 == 0) goto L_0x012b
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L_0x012b
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != 0) goto L_0x012b
            boolean r6 = r5.isBridge()
            if (r6 != 0) goto L_0x012b
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r6 == r7) goto L_0x012b
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "getClass"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x005e
            java.lang.String r7 = "getDeclaringClass"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x005e
            r6 = 1
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            if (r6 == 0) goto L_0x012b
            java.lang.Class<sr3.d> r6 = sr3.C118293d.class
            int r6 = m166865c(r5, r6)
            r7 = 0
            if (r6 <= 0) goto L_0x0076
            java.lang.Class<sr3.e> r8 = sr3.C118294e.class
            int r8 = m166865c(r5, r8)
            if (r8 < 0) goto L_0x0107
            if (r6 > r8) goto L_0x0076
            goto L_0x0107
        L_0x0076:
            java.lang.Class<sr3.e> r6 = sr3.C118294e.class
            java.lang.annotation.Annotation r6 = m166864b(r5, r6)
            sr3.e r6 = (sr3.C118294e) r6
            if (r6 == 0) goto L_0x0096
            java.lang.String r8 = r6.value()
            if (r8 == 0) goto L_0x0096
            java.lang.String r8 = r6.value()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0096
            java.lang.String r7 = r6.value()
            goto L_0x0107
        L_0x0096:
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "get"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x00ae
            int r8 = r6.length()
            r9 = 3
            if (r8 <= r9) goto L_0x00ae
            java.lang.String r6 = r6.substring(r9)
            goto L_0x00c1
        L_0x00ae:
            java.lang.String r8 = "is"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x0107
            int r8 = r6.length()
            r9 = 2
            if (r8 <= r9) goto L_0x0107
            java.lang.String r6 = r6.substring(r9)
        L_0x00c1:
            int r8 = r6.length()
            if (r8 == 0) goto L_0x0107
            char r8 = r6.charAt(r2)
            boolean r8 = java.lang.Character.isLowerCase(r8)
            if (r8 == 0) goto L_0x00d2
            goto L_0x0107
        L_0x00d2:
            int r7 = r6.length()
            if (r7 != r3) goto L_0x00df
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            goto L_0x0106
        L_0x00df:
            char r7 = r6.charAt(r3)
            boolean r7 = java.lang.Character.isUpperCase(r7)
            if (r7 != 0) goto L_0x0106
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r6.substring(r2, r3)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            r7.append(r8)
            java.lang.String r6 = r6.substring(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x0106:
            r7 = r6
        L_0x0107:
            if (r7 == 0) goto L_0x012b
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x012b
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{  }
            java.lang.Object r5 = r5.invoke(r11, r6)     // Catch:{  }
            if (r5 == 0) goto L_0x012b
            java.util.Map<java.lang.String, java.lang.Object> r6 = r10.f353541a     // Catch:{  }
            java.lang.Object r8 = m166870j(r5)     // Catch:{  }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{  }
            r6.put(r7, r8)     // Catch:{  }
            boolean r6 = r5 instanceof java.io.Closeable     // Catch:{  }
            if (r6 == 0) goto L_0x012b
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b }
            r5.close()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x012b }
        L_0x012b:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118290c.<init>(java.lang.Object):void");
    }
}
