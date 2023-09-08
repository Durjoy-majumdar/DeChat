package bz3;

import com.tencent.xweb.file.XVFSFile;
import cz3.C24410d;
import ey3.C116796a;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import oz3.C25395q;
import pz3.C25505a;
import vz3.C22830f;
import vz3.C26408b;
import vz3.C26409h;
import z04.C112551y;

/* renamed from: bz3.f */
public final class C23681f implements C25395q {

    /* renamed from: c */
    public static final C23682a f67870c = new C23682a((C8480h) null);

    /* renamed from: a */
    public final Class<?> f67871a;

    /* renamed from: b */
    public final C25505a f67872b;

    /* renamed from: bz3.f$a */
    public static final class C23682a {
        public C23682a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
            if (r0.f72211e == null) goto L_0x0070;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final bz3.C23681f mo37231a(java.lang.Class<?> r15) {
            /*
                r14 = this;
                java.lang.String r0 = "klass"
                gy3.C87412m.m108594g(r15, r0)
                pz3.b r0 = new pz3.b
                r0.<init>()
                bz3.c r1 = bz3.C23679c.f67868a
                r1.mo37217b(r15, r0)
                bz3.f r1 = new bz3.f
                pz3.a$a r2 = r0.f72214h
                r3 = 0
                if (r2 == 0) goto L_0x0070
                int[] r2 = r0.f72207a
                if (r2 != 0) goto L_0x001b
                goto L_0x0070
            L_0x001b:
                uz3.e r6 = new uz3.e
                int[] r2 = r0.f72207a
                int r4 = r0.f72209c
                r4 = r4 & 8
                r5 = 0
                r7 = 1
                if (r4 == 0) goto L_0x0029
                r4 = 1
                goto L_0x002a
            L_0x0029:
                r4 = 0
            L_0x002a:
                r6.<init>(r2, r4)
                boolean r2 = r6.mo162990c()
                if (r2 != 0) goto L_0x003a
                java.lang.String[] r2 = r0.f72211e
                r0.f72213g = r2
                r0.f72211e = r3
                goto L_0x0050
            L_0x003a:
                pz3.a$a r2 = r0.f72214h
                pz3.a$a r4 = pz3.C25505a.C25506a.CLASS
                if (r2 == r4) goto L_0x0048
                pz3.a$a r4 = pz3.C25505a.C25506a.FILE_FACADE
                if (r2 == r4) goto L_0x0048
                pz3.a$a r4 = pz3.C25505a.C25506a.MULTIFILE_CLASS_PART
                if (r2 != r4) goto L_0x0049
            L_0x0048:
                r5 = 1
            L_0x0049:
                if (r5 == 0) goto L_0x0050
                java.lang.String[] r2 = r0.f72211e
                if (r2 != 0) goto L_0x0050
                goto L_0x0070
            L_0x0050:
                java.lang.String[] r2 = r0.f72215i
                if (r2 == 0) goto L_0x005a
                byte[] r2 = uz3.C118638a.m167311b(r2)
                r13 = r2
                goto L_0x005b
            L_0x005a:
                r13 = r3
            L_0x005b:
                pz3.a r2 = new pz3.a
                pz3.a$a r5 = r0.f72214h
                java.lang.String[] r7 = r0.f72211e
                java.lang.String[] r8 = r0.f72213g
                java.lang.String[] r9 = r0.f72212f
                java.lang.String r10 = r0.f72208b
                int r11 = r0.f72209c
                java.lang.String r12 = r0.f72210d
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0071
            L_0x0070:
                r2 = r3
            L_0x0071:
                if (r2 != 0) goto L_0x0074
                return r3
            L_0x0074:
                r1.<init>(r15, r2, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: bz3.C23681f.C23682a.mo37231a(java.lang.Class):bz3.f");
        }
    }

    public C23681f(Class cls, C25505a aVar, C8480h hVar) {
        this.f67871a = cls;
        this.f67872b = aVar;
    }

    /* renamed from: a */
    public String mo37223a() {
        return C112551y.m153815o(this.f67871a.getName(), '.', XVFSFile.SEPARATOR_CHAR, false, 4, (Object) null) + ".class";
    }

    /* renamed from: b */
    public C25505a mo37224b() {
        return this.f67872b;
    }

    /* renamed from: c */
    public void mo37225c(C25395q.C25398c cVar, byte[] bArr) {
        C87412m.m108594g(cVar, "visitor");
        C23679c.f67868a.mo37217b(this.f67871a, cVar);
    }

    /* renamed from: d */
    public void mo37226d(C25395q.C25399d dVar, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C25395q.C25399d dVar2 = dVar;
        C87412m.m108594g(dVar2, "visitor");
        C23679c cVar = C23679c.f67868a;
        Class<?> cls = this.f67871a;
        C87412m.m108594g(cls, "klass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C87412m.m108593f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            C22830f f = C22830f.m26794f(method.getName());
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Class[] parameterTypes = method.getParameterTypes();
            C87412m.m108593f(parameterTypes, "method.parameterTypes");
            int length2 = parameterTypes.length;
            int i2 = 0;
            while (i2 < length2) {
                Method[] methodArr = declaredMethods;
                Class cls2 = parameterTypes[i2];
                C87412m.m108593f(cls2, str2);
                sb.append(C24410d.m30456b(cls2));
                i2++;
                declaredMethods = methodArr;
            }
            Method[] methodArr2 = declaredMethods;
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            C87412m.m108593f(returnType, "method.returnType");
            sb.append(C24410d.m30456b(returnType));
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, str3);
            C25395q.C25400e a = dVar2.mo52549a(f, sb4);
            if (a != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C87412m.m108593f(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C87412m.m108593f(annotation, "annotation");
                    cVar.mo37218c(a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C87412m.m108593f(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length3 = annotationArr.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    Annotation[] annotationArr2 = annotationArr[i3];
                    C87412m.m108593f(annotationArr2, str);
                    int length4 = annotationArr2.length;
                    int i4 = 0;
                    while (i4 < length4) {
                        Annotation annotation2 = annotationArr2[i4];
                        Class b = C116796a.m164750b(C116796a.m164749a(annotation2));
                        Annotation[][] annotationArr3 = annotationArr;
                        C25395q.C25396a b2 = a.mo52551b(i3, C24410d.m30455a(b), new C23678b(annotation2));
                        if (b2 != null) {
                            C23679c.f67868a.mo37219d(b2, annotation2, b);
                        }
                        i4++;
                        annotationArr = annotationArr3;
                    }
                    Annotation[][] annotationArr4 = annotationArr;
                }
                a.mo35570a();
            }
            i++;
            declaredMethods = methodArr2;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        C87412m.m108593f(declaredConstructors, "klass.declaredConstructors");
        int length5 = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length5) {
            Constructor constructor = declaredConstructors[i5];
            C22830f fVar = C26409h.f73651e;
            C87412m.m108593f(constructor, "constructor");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("(");
            Class[] parameterTypes2 = constructor.getParameterTypes();
            C87412m.m108593f(parameterTypes2, "constructor.parameterTypes");
            int length6 = parameterTypes2.length;
            Constructor[] constructorArr = declaredConstructors;
            int i6 = 0;
            while (i6 < length6) {
                int i7 = length5;
                Class cls3 = parameterTypes2[i6];
                C87412m.m108593f(cls3, str2);
                sb5.append(C24410d.m30456b(cls3));
                i6++;
                length5 = i7;
            }
            int i8 = length5;
            sb5.append(")V");
            String sb6 = sb5.toString();
            C87412m.m108593f(sb6, str3);
            C25395q.C25400e a2 = dVar2.mo52549a(fVar, sb6);
            if (a2 == null) {
                str5 = str;
                str6 = str2;
                str4 = str3;
            } else {
                Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                C87412m.m108593f(declaredAnnotations2, "constructor.declaredAnnotations");
                for (Annotation annotation3 : declaredAnnotations2) {
                    C87412m.m108593f(annotation3, "annotation");
                    cVar.mo37218c(a2, annotation3);
                }
                Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                C87412m.m108593f(parameterAnnotations2, "parameterAnnotations");
                if (!(parameterAnnotations2.length == 0)) {
                    int length7 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                    int length8 = parameterAnnotations2.length;
                    int i9 = 0;
                    while (i9 < length8) {
                        Annotation[] annotationArr5 = parameterAnnotations2[i9];
                        C87412m.m108593f(annotationArr5, str);
                        int length9 = annotationArr5.length;
                        Annotation[][] annotationArr6 = parameterAnnotations2;
                        int i15 = 0;
                        while (i15 < length9) {
                            int i16 = length8;
                            Annotation annotation4 = annotationArr5[i15];
                            String str7 = str;
                            Class b3 = C116796a.m164750b(C116796a.m164749a(annotation4));
                            String str8 = str2;
                            int i17 = length7;
                            String str9 = str3;
                            C25395q.C25396a b4 = a2.mo52551b(i9 + length7, C24410d.m30455a(b3), new C23678b(annotation4));
                            if (b4 != null) {
                                C23679c.f67868a.mo37219d(b4, annotation4, b3);
                            }
                            i15++;
                            length8 = i16;
                            str2 = str8;
                            str = str7;
                            length7 = i17;
                            str3 = str9;
                        }
                        int i18 = length7;
                        int i19 = length8;
                        String str10 = str;
                        String str11 = str2;
                        String str12 = str3;
                        i9++;
                        parameterAnnotations2 = annotationArr6;
                    }
                }
                str5 = str;
                str6 = str2;
                str4 = str3;
                a2.mo35570a();
            }
            i5++;
            declaredConstructors = constructorArr;
            length5 = i8;
            str2 = str6;
            str = str5;
            str3 = str4;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        C87412m.m108593f(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C22830f f2 = C22830f.m26794f(field.getName());
            Class<?> type = field.getType();
            C87412m.m108593f(type, "field.type");
            C25395q.C25398c b5 = dVar2.mo52550b(f2, C24410d.m30456b(type), (Object) null);
            if (b5 != null) {
                Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                C87412m.m108593f(declaredAnnotations3, "field.declaredAnnotations");
                for (Annotation annotation5 : declaredAnnotations3) {
                    C87412m.m108593f(annotation5, "annotation");
                    cVar.mo37218c(b5, annotation5);
                }
                b5.mo35570a();
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C23681f) && C87412m.m108589b(this.f67871a, ((C23681f) obj).f67871a);
    }

    /* renamed from: f */
    public C26408b mo37228f() {
        return C24410d.m30455a(this.f67871a);
    }

    public int hashCode() {
        return this.f67871a.hashCode();
    }

    public String toString() {
        return C23681f.class.getName() + ": " + this.f67871a;
    }
}
