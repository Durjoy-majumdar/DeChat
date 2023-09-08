package qy3;

import b04.C23649g;
import bz3.C113219e;
import bz3.C23678b;
import bz3.C23681f;
import bz3.C23684j;
import bz3.C23685k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cz3.C24410d;
import cz3.C24415e;
import cz3.C24435t;
import cz3.C24439x;
import d04.C24442a;
import ey3.C116796a;
import fy3.C32227p;
import gy3.C117006i0;
import gy3.C24563k;
import gy3.C87412m;
import j04.C24748g0;
import j04.C24763k;
import j04.C24766m;
import j04.C24779w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l04.C24893h;
import ny3.C25234c;
import oz3.C25395q;
import oz3.C25402s;
import qz3.C26041i;
import qz3.C26052n;
import qz3.C26075s;
import rx3.C13604l;
import ry3.C110665b;
import sx3.C110821n;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C90364q0;
import sz3.C110828a;
import sz3.C26243c;
import sz3.C26247g;
import sz3.C26248h;
import ty3.C22558j;
import vy3.C26384c;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26434a;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26509u0;
import wy3.C26521y0;
import xy3.C26564a;
import xy3.C26566c;
import xy3.C26571h;
import xz3.C26607p;
import z04.C112551y;

/* renamed from: qy3.u0 */
public final class C25987u0 {

    /* renamed from: a */
    public static final C22826c f72374a = new C22826c("kotlin.jvm.JvmStatic");

    /* renamed from: qy3.u0$a */
    public /* synthetic */ class C22178a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62705a;

        static {
            int[] iArr = new int[C22558j.values().length];
            iArr[C22558j.BOOLEAN.ordinal()] = 1;
            iArr[C22558j.CHAR.ordinal()] = 2;
            iArr[C22558j.BYTE.ordinal()] = 3;
            iArr[C22558j.SHORT.ordinal()] = 4;
            iArr[C22558j.INT.ordinal()] = 5;
            iArr[C22558j.FLOAT.ordinal()] = 6;
            iArr[C22558j.LONG.ordinal()] = 7;
            iArr[C22558j.DOUBLE.ordinal()] = 8;
            f62705a = iArr;
        }
    }

    /* renamed from: a */
    public static final C25978s m33170a(Object obj) {
        C25978s sVar = obj instanceof C25978s ? (C25978s) obj : null;
        if (sVar != null) {
            return sVar;
        }
        C24563k kVar = obj instanceof C24563k ? (C24563k) obj : null;
        C25234c compute = kVar != null ? kVar.compute() : null;
        if (compute instanceof C25978s) {
            return (C25978s) compute;
        }
        return null;
    }

    /* renamed from: b */
    public static final List<Annotation> m33171b(C26564a aVar) {
        boolean z;
        List list;
        C87412m.m108594g(aVar, "<this>");
        C26571h<C26566c> annotations = aVar.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList<>();
        for (C26566c cVar : annotations) {
            C26521y0 source = cVar.getSource();
            Annotation annotation = null;
            if (source instanceof C23678b) {
                annotation = ((C23678b) source).f67867b;
            } else if (source instanceof C23685k.C23686a) {
                C24439x xVar = ((C23685k.C23686a) source).f67878b;
                C24415e eVar = xVar instanceof C24415e ? (C24415e) xVar : null;
                if (eVar != null) {
                    annotation = eVar.f69863a;
                }
            } else {
                annotation = m33176g(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C87412m.m108589b(C116796a.m164750b(C116796a.m164749a((Annotation) it.next())).getSimpleName(), "Container")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Annotation annotation2 : arrayList) {
            Class b = C116796a.m164750b(C116796a.m164749a(annotation2));
            if (!C87412m.m108589b(b.getSimpleName(), "Container") || b.getAnnotation(C117006i0.class) == null) {
                list = C26236u.m33719b(annotation2);
            } else {
                Object invoke = b.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                list = C110821n.m150958e((Annotation[]) invoke);
            }
            C64175a0.m75508p(arrayList2, list);
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static final Object m33172c(Type type) {
        C87412m.m108594g(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C87412m.m108589b(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C87412m.m108589b(type, Character.TYPE)) {
            return 0;
        }
        if (C87412m.m108589b(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C87412m.m108589b(type, Short.TYPE)) {
            return (short) 0;
        }
        if (C87412m.m108589b(type, Integer.TYPE)) {
            return 0;
        }
        if (C87412m.m108589b(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C87412m.m108589b(type, Long.TYPE)) {
            return 0L;
        }
        if (C87412m.m108589b(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C87412m.m108589b(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: d */
    public static final <M extends C26607p, D extends C26434a> D m33173d(Class<?> cls, M m, C26243c cVar, C26247g gVar, C110828a aVar, C32227p<? super C24779w, ? super M, ? extends D> pVar) {
        List<C26075s> list;
        M m2 = m;
        C32227p<? super C24779w, ? super M, ? extends D> pVar2 = pVar;
        Class<?> cls2 = cls;
        C87412m.m108594g(cls, "moduleAnchor");
        C87412m.m108594g(m, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "typeTable");
        C87412m.m108594g(aVar, "metadataVersion");
        C87412m.m108594g(pVar2, "createDescriptor");
        C23684j a = C25967m0.m33134a(cls);
        if (m2 instanceof C26041i) {
            list = ((C26041i) m2).f72629o;
        } else if (m2 instanceof C26052n) {
            list = ((C26052n) m2).f72701o;
        } else {
            throw new IllegalStateException(("Unsupported message: " + m).toString());
        }
        List<C26075s> list2 = list;
        C24763k kVar = a.f67875a;
        C26448e0 e0Var = kVar.f70623b;
        C26248h.C26249a aVar2 = C26248h.f73183b;
        C26248h hVar = C26248h.f73184c;
        C87412m.m108593f(list2, "typeParameters");
        return (C26434a) pVar2.invoke(new C24779w(new C24766m(kVar, cVar, e0Var, gVar, hVar, aVar, (C24893h) null, (C24748g0) null, list2)), m);
    }

    /* renamed from: e */
    public static final C26509u0 m33174e(C26434a aVar) {
        C87412m.m108594g(aVar, "<this>");
        if (aVar.mo52626H() == null) {
            return null;
        }
        C26469k b = aVar.mo51892b();
        C87412m.m108592e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((C26447e) b).mo53429o0();
    }

    /* renamed from: f */
    public static final Class<?> m33175f(ClassLoader classLoader, C26408b bVar, int i) {
        C26384c cVar = C26384c.f73585a;
        C22827d i2 = bVar.mo53387b().mo35982i();
        C87412m.m108593f(i2, "kotlinClassId.asSingleFqName().toUnsafe()");
        C26408b g = cVar.mo53374g(i2);
        if (g != null) {
            bVar = g;
        }
        String b = bVar.mo53392h().mo35973b();
        C87412m.m108593f(b, "javaClassId.packageFqName.asString()");
        String b2 = bVar.mo53394i().mo35973b();
        C87412m.m108593f(b2, "javaClassId.relativeClassName.asString()");
        if (C87412m.m108589b(b, "kotlin")) {
            switch (b2.hashCode()) {
                case -901856463:
                    if (b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str = b + '.' + C112551y.m153815o(b2, '.', '$', false, 4, (Object) null);
        if (i > 0) {
            str = C112551y.m153813m("[", i) + 'L' + str + ';';
        }
        return C113219e.m154929a(classLoader, str);
    }

    /* renamed from: g */
    public static final Annotation m33176g(C26566c cVar) {
        C26447e d = C24442a.m30537d(cVar);
        Class<?> h = d != null ? m33177h(d) : null;
        if (!(h instanceof Class)) {
            h = null;
        }
        if (h == null) {
            return null;
        }
        Set<Map.Entry<C22830f, C23649g<?>>> entrySet = cVar.mo51296a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C22830f fVar = (C22830f) entry.getKey();
            ClassLoader classLoader = h.getClassLoader();
            C87412m.m108593f(classLoader, "annotationClass.classLoader");
            Object i = m33178i((C23649g) entry.getValue(), classLoader);
            C13604l lVar = i != null ? new C13604l(fVar.mo35995b(), i) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Map k = C90364q0.m113152k(arrayList);
        Set<String> keySet = k.keySet();
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(keySet, 10));
        for (String declaredMethod : keySet) {
            arrayList2.add(h.getDeclaredMethod(declaredMethod, new Class[0]));
        }
        return (Annotation) C110665b.m150644a(h, k, arrayList2);
    }

    /* renamed from: h */
    public static final Class<?> m33177h(C26447e eVar) {
        C87412m.m108594g(eVar, "<this>");
        C26521y0 source = eVar.getSource();
        C87412m.m108593f(source, FirebaseAnalytics.C113379b.SOURCE);
        if (source instanceof C25402s) {
            C25395q qVar = ((C25402s) source).f71941b;
            C87412m.m108592e(qVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C23681f) qVar).f67871a;
        } else if (source instanceof C23685k.C23686a) {
            C24439x xVar = ((C23685k.C23686a) source).f67878b;
            C87412m.m108592e(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C24435t) xVar).f69886a;
        } else {
            C26408b f = C24442a.m30539f(eVar);
            if (f == null) {
                return null;
            }
            return m33175f(C24410d.m30458d(eVar.getClass()), f, 0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], char[], byte[], short[]], vars: [r7v16 ?, r7v18 ?, r7v17 ?, r7v19 ?, r7v20 ?, r7v21 ?, r7v22 ?, r7v23 ?, r7v24 ?, r7v25 ?, r7v26 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: i */
    public static final java.lang.Object m33178i(b04.C23649g<?> r6, java.lang.ClassLoader r7) {
        /*
            boolean r0 = r6 instanceof b04.C23641a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            b04.a r6 = (b04.C23641a) r6
            T r6 = r6.f67839a
            xy3.c r6 = (xy3.C26566c) r6
            java.lang.annotation.Annotation r1 = m33176g(r6)
            goto L_0x02c2
        L_0x0011:
            boolean r0 = r6 instanceof b04.C23643b
            r2 = 0
            if (r0 == 0) goto L_0x0252
            b04.b r6 = (b04.C23643b) r6
            boolean r0 = r6 instanceof j04.C24767n
            if (r0 == 0) goto L_0x0020
            r0 = r6
            j04.n r0 = (j04.C24767n) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            if (r0 == 0) goto L_0x02c2
            n04.j0 r0 = r0.f70652c
            if (r0 != 0) goto L_0x0029
            goto L_0x02c2
        L_0x0029:
            T r3 = r6.f67839a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r3.next()
            b04.g r5 = (b04.C23649g) r5
            java.lang.Object r5 = m33178i(r5, r7)
            r4.add(r5)
            goto L_0x003c
        L_0x0050:
            vz3.f r3 = ty3.C26336h.f73354e
            n04.j1 r3 = r0.mo37081K0()
            wy3.h r3 = r3.mo37094o()
            if (r3 != 0) goto L_0x005e
            r3 = r1
            goto L_0x0062
        L_0x005e:
            ty3.j r3 = ty3.C26336h.m33839s(r3)
        L_0x0062:
            if (r3 != 0) goto L_0x0066
            r3 = -1
            goto L_0x006e
        L_0x0066:
            int[] r5 = qy3.C25987u0.C22178a.f62705a
            int r3 = r3.ordinal()
            r3 = r5[r3]
        L_0x006e:
            switch(r3) {
                case -1: goto L_0x017a;
                case 0: goto L_0x0071;
                case 1: goto L_0x0157;
                case 2: goto L_0x0137;
                case 3: goto L_0x0117;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00b7;
                case 7: goto L_0x0097;
                case 8: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            rx3.j r6 = new rx3.j
            r6.<init>()
            throw r6
        L_0x0077:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            double[] r7 = new double[r6]
        L_0x0081:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0081
        L_0x0097:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            long[] r7 = new long[r6]
        L_0x00a1:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00a1
        L_0x00b7:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float[] r7 = new float[r6]
        L_0x00c1:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00c1
        L_0x00d7:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int[] r7 = new int[r6]
        L_0x00e1:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00e1
        L_0x00f7:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            short[] r7 = new short[r6]
        L_0x0101:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0101
        L_0x0117:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            byte[] r7 = new byte[r6]
        L_0x0121:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0121
        L_0x0137:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            char[] r7 = new char[r6]
        L_0x0141:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0141
        L_0x0157:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            boolean[] r7 = new boolean[r6]
        L_0x0161:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0161
        L_0x0177:
            r1 = r7
            goto L_0x02c2
        L_0x017a:
            boolean r3 = ty3.C26336h.m33842z(r0)
            if (r3 == 0) goto L_0x0237
            java.util.List r0 = r0.mo37079I0()
            java.lang.Object r0 = sx3.C110818d0.m150938j0(r0)
            n04.m1 r0 = (n04.C25158m1) r0
            n04.j0 r0 = r0.getType()
            java.lang.String r3 = "type.arguments.single().type"
            gy3.C87412m.m108593f(r0, r3)
            n04.j1 r3 = r0.mo37081K0()
            wy3.h r3 = r3.mo37094o()
            boolean r5 = r3 instanceof wy3.C26447e
            if (r5 == 0) goto L_0x01a2
            wy3.e r3 = (wy3.C26447e) r3
            goto L_0x01a3
        L_0x01a2:
            r3 = r1
        L_0x01a3:
            if (r3 == 0) goto L_0x021c
            boolean r0 = ty3.C26336h.m33833J(r0)
            if (r0 == 0) goto L_0x01c7
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x01b5:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x01b5
        L_0x01c7:
            vz3.d r0 = ty3.C26343l.C26344a.f73397Q
            boolean r0 = ty3.C26336h.m33838c(r3, r0)
            if (r0 == 0) goto L_0x01eb
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Class[] r7 = new java.lang.Class[r6]
        L_0x01d9:
            if (r2 >= r6) goto L_0x0177
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x01d9
        L_0x01eb:
            vz3.b r0 = d04.C24442a.m30539f(r3)
            if (r0 == 0) goto L_0x02c2
            java.lang.Class r7 = m33175f(r7, r0, r2)
            if (r7 != 0) goto L_0x01f9
            goto L_0x02c2
        L_0x01f9:
            T r6 = r6.f67839a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>"
            gy3.C87412m.m108592e(r6, r7)
            r1 = r6
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r6 = r4.size()
        L_0x0211:
            if (r2 >= r6) goto L_0x02c2
            java.lang.Object r7 = r4.get(r2)
            r1[r2] = r7
            int r2 = r2 + 1
            goto L_0x0211
        L_0x021c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Not a class type: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0237:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not an array type: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L_0x0252:
            boolean r0 = r6 instanceof b04.C23654k
            if (r0 == 0) goto L_0x0273
            b04.k r6 = (b04.C23654k) r6
            T r6 = r6.f67839a
            rx3.l r6 = (rx3.C13604l) r6
            A r0 = r6.f38555d
            vz3.b r0 = (vz3.C26408b) r0
            B r6 = r6.f38556e
            vz3.f r6 = (vz3.C22830f) r6
            java.lang.Class r7 = m33175f(r7, r0, r2)
            if (r7 == 0) goto L_0x02c2
            java.lang.String r6 = r6.mo35995b()
            java.lang.Enum r1 = java.lang.Enum.valueOf(r7, r6)
            goto L_0x02c2
        L_0x0273:
            boolean r0 = r6 instanceof b04.C23663s
            if (r0 == 0) goto L_0x02b3
            b04.s r6 = (b04.C23663s) r6
            T r6 = r6.f67839a
            b04.s$a r6 = (b04.C23663s.C23664a) r6
            boolean r0 = r6 instanceof b04.C23663s.C23664a.C23666b
            if (r0 == 0) goto L_0x028e
            b04.s$a$b r6 = (b04.C23663s.C23664a.C23666b) r6
            b04.f r6 = r6.f67853a
            vz3.b r0 = r6.f67837a
            int r6 = r6.f67838b
            java.lang.Class r1 = m33175f(r7, r0, r6)
            goto L_0x02c2
        L_0x028e:
            boolean r7 = r6 instanceof b04.C23663s.C23664a.C23665a
            if (r7 == 0) goto L_0x02ad
            b04.s$a$a r6 = (b04.C23663s.C23664a.C23665a) r6
            n04.j0 r6 = r6.f67852a
            n04.j1 r6 = r6.mo37081K0()
            wy3.h r6 = r6.mo37094o()
            boolean r7 = r6 instanceof wy3.C26447e
            if (r7 == 0) goto L_0x02a5
            wy3.e r6 = (wy3.C26447e) r6
            goto L_0x02a6
        L_0x02a5:
            r6 = r1
        L_0x02a6:
            if (r6 == 0) goto L_0x02c2
            java.lang.Class r1 = m33177h(r6)
            goto L_0x02c2
        L_0x02ad:
            rx3.j r6 = new rx3.j
            r6.<init>()
            throw r6
        L_0x02b3:
            boolean r7 = r6 instanceof b04.C23655l
            if (r7 == 0) goto L_0x02b9
            r7 = 1
            goto L_0x02bb
        L_0x02b9:
            boolean r7 = r6 instanceof b04.C23668u
        L_0x02bb:
            if (r7 == 0) goto L_0x02be
            goto L_0x02c2
        L_0x02be:
            java.lang.Object r1 = r6.mo37196b()
        L_0x02c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25987u0.m33178i(b04.g, java.lang.ClassLoader):java.lang.Object");
    }
}
