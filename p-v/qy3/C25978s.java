package qy3;

import com.tencent.xweb.file.XVFSFile;
import e04.C24467b;
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
import gy3.C24557d;
import gy3.C24560g0;
import gy3.C24562j;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n04.C25143j0;
import ny3.C25237g;
import ny3.C25239j;
import ny3.C89104m;
import qy3.C22152c;
import qy3.C25968n0;
import rx3.C13603j;
import ry3.C26119a;
import ry3.C26121e;
import ry3.C26123f;
import ry3.C26147g;
import ry3.C26150i;
import sx3.C110818d0;
import sx3.C36907w;
import uz3.C22710d;
import vz3.C22830f;
import wy3.C26444d;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26491r;
import wy3.C26516w;
import zz3.C26794h;
import zz3.C26798j;

/* renamed from: qy3.s */
public final class C25978s extends C25914e<Object> implements C24562j<Object>, C25237g<Object>, C32224a, C32226l, C32225b, C24480c, C24481d, C24482e, C24483f, C24484g, C24485h, C24486i, C24487j, C24488k, C32227p, C24489m, C24490n, C24491o, C32228q, C32229r, C32230s, C32231t, C32232u, C24492v, C24493w {

    /* renamed from: q */
    public static final /* synthetic */ C89104m<Object>[] f72359q;

    /* renamed from: h */
    public final C22167o f72360h;

    /* renamed from: i */
    public final String f72361i;

    /* renamed from: j */
    public final Object f72362j;

    /* renamed from: n */
    public final C25968n0.C25969a f72363n;

    /* renamed from: o */
    public final C25968n0.C25970b f72364o;

    /* renamed from: p */
    public final C25968n0.C25970b f72365p;

    /* renamed from: qy3.s$c */
    public static final class C22175c extends C87413o implements C32224a<C26516w> {

        /* renamed from: d */
        public final /* synthetic */ C25978s f62702d;

        /* renamed from: e */
        public final /* synthetic */ String f62703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22175c(C25978s sVar, String str) {
            super(0);
            this.f62702d = sVar;
            this.f62703e = str;
        }

        public Object invoke() {
            String str;
            C25978s sVar = this.f62702d;
            C22167o oVar = sVar.f72360h;
            String str2 = this.f62703e;
            String str3 = sVar.f72361i;
            oVar.getClass();
            C87412m.m108594g(str2, "name");
            C87412m.m108594g(str3, "signature");
            Iterable y0 = C87412m.m108589b(str2, "<init>") ? C110818d0.m150953y0(oVar.mo35261m()) : oVar.mo35262n(C22830f.m26794f(str2));
            ArrayList arrayList = new ArrayList();
            for (Object next : y0) {
                if (C87412m.m108589b(C25977r0.f72357a.mo52843c((C26516w) next).mo35265a(), str3)) {
                    arrayList.add(next);
                }
            }
            boolean z = true;
            if (arrayList.size() == 1) {
                return (C26516w) C110818d0.m150938j0(arrayList);
            }
            String S = C110818d0.m150921S(y0, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C22172p.f62699d, 30, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Function '");
            sb.append(str2);
            sb.append("' (JVM signature: ");
            sb.append(str3);
            sb.append(") not resolved in ");
            sb.append(oVar);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            if (S.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = 10 + S;
            }
            sb.append(str);
            throw new C118215l0(sb.toString());
        }
    }

    /* renamed from: qy3.s$a */
    public static final class C25979a extends C87413o implements C32224a<C26121e<? extends Member>> {

        /* renamed from: d */
        public final /* synthetic */ C25978s f72366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25979a(C25978s sVar) {
            super(0);
            this.f72366d = sVar;
        }

        public Object invoke() {
            Object obj;
            C26123f fVar;
            C26123f fVar2;
            C26123f cVar;
            C26119a.C22278a aVar = C26119a.C22278a.POSITIONAL_CALL;
            C22152c c = C25977r0.f72357a.mo52843c(this.f72366d.mo52805n());
            if (c instanceof C22152c.C22159d) {
                if (this.f72366d.mo52806o()) {
                    Class<?> c2 = this.f72366d.f72360h.mo32564c();
                    List<C25239j> parameters = this.f72366d.getParameters();
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
                    for (C25239j name : parameters) {
                        String name2 = name.getName();
                        C87412m.m108591d(name2);
                        arrayList.add(name2);
                    }
                    return new C26119a(c2, arrayList, aVar, C26119a.C22279b.KOTLIN, (List) null, 16, (C8480h) null);
                }
                C22167o oVar = this.f72366d.f72360h;
                String str = ((C22152c.C22159d) c).f62676a.f65293b;
                oVar.getClass();
                C87412m.m108594g(str, "desc");
                Class c3 = oVar.mo32564c();
                try {
                    Object[] array = ((ArrayList) oVar.mo35272t(str)).toArray(new Class[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    Class[] clsArr = (Class[]) array;
                    obj = c3.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (NoSuchMethodException unused) {
                    obj = null;
                }
            } else if (c instanceof C22152c.C22160e) {
                C22167o oVar2 = this.f72366d.f72360h;
                C22710d.C22712b bVar = ((C22152c.C22160e) c).f62678a;
                obj = oVar2.mo35269l(bVar.f65292a, bVar.f65293b);
            } else if (c instanceof C22152c.C22158c) {
                obj = ((C22152c.C22158c) c).f62675a;
            } else if (c instanceof C22152c.C22156b) {
                obj = ((C22152c.C22156b) c).f62673a;
            } else if (c instanceof C22152c.C22153a) {
                List<Method> list = ((C22152c.C22153a) c).f62671a;
                Class<?> c4 = this.f72366d.f72360h.mo32564c();
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
                for (Method name3 : list) {
                    arrayList2.add(name3.getName());
                }
                return new C26119a(c4, arrayList2, aVar, C26119a.C22279b.JAVA, list);
            } else {
                throw new C13603j();
            }
            if (obj instanceof Constructor) {
                C25978s sVar = this.f72366d;
                fVar = C25978s.m33155q(sVar, (Constructor) obj, sVar.mo52805n(), false);
            } else if (obj instanceof Method) {
                Method method = (Method) obj;
                if (!Modifier.isStatic(method.getModifiers())) {
                    C25978s sVar2 = this.f72366d;
                    if (sVar2.mo52807p()) {
                        cVar = new C26123f.C26140g.C26141a(method, C26150i.m33565a(sVar2.f72362j, sVar2.mo52805n()));
                    } else {
                        fVar2 = new C26123f.C26140g.C26144d(method);
                        fVar = fVar2;
                    }
                } else {
                    if (this.f72366d.mo52805n().getAnnotations().mo51476b(C25987u0.f72374a) != null) {
                        fVar2 = this.f72366d.mo52807p() ? new C26123f.C26140g.C26142b(method) : new C26123f.C26140g.C26145e(method);
                    } else {
                        C25978s sVar3 = this.f72366d;
                        if (sVar3.mo52807p()) {
                            cVar = new C26123f.C26140g.C26143c(method, C26150i.m33565a(sVar3.f72362j, sVar3.mo52805n()));
                        } else {
                            fVar2 = new C26123f.C26140g.C26146f(method);
                        }
                    }
                    fVar = fVar2;
                }
                fVar = cVar;
            } else {
                throw new C118215l0("Could not compute caller for function: " + this.f72366d.mo52805n() + " (member = " + obj + ')');
            }
            return C26150i.m33566b(fVar, this.f72366d.mo52805n(), false);
        }
    }

    /* renamed from: qy3.s$b */
    public static final class C25980b extends C87413o implements C32224a<C26121e<? extends Member>> {

        /* renamed from: d */
        public final /* synthetic */ C25978s f72367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25980b(C25978s sVar) {
            super(0);
            this.f72367d = sVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0173  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01db  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r17 = this;
                r0 = r17
                ry3.a$a r4 = ry3.C26119a.C22278a.CALL_BY_NAME
                qy3.r0 r1 = qy3.C25977r0.f72357a
                qy3.s r2 = r0.f72367d
                wy3.w r2 = r2.mo52805n()
                qy3.c r1 = r1.mo52843c(r2)
                boolean r2 = r1 instanceof qy3.C22152c.C22160e
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r5 = 0
                r6 = 0
                r7 = 1
                java.lang.String r8 = "desc"
                if (r2 == 0) goto L_0x00a1
                qy3.s r2 = r0.f72367d
                qy3.o r9 = r2.f72360h
                qy3.c$e r1 = (qy3.C22152c.C22160e) r1
                uz3.d$b r1 = r1.f62678a
                java.lang.String r4 = r1.f65292a
                java.lang.String r1 = r1.f65293b
                ry3.e r2 = r2.mo52802k()
                java.lang.reflect.Member r2 = r2.mo53055b()
                gy3.C87412m.m108591d(r2)
                int r2 = r2.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ r7
                r9.getClass()
                java.lang.String r10 = "name"
                gy3.C87412m.m108594g(r4, r10)
                gy3.C87412m.m108594g(r1, r8)
                java.lang.String r8 = "<init>"
                boolean r8 = gy3.C87412m.m108589b(r4, r8)
                if (r8 == 0) goto L_0x0050
                goto L_0x0161
            L_0x0050:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                if (r2 == 0) goto L_0x005e
                java.lang.Class r10 = r9.mo32564c()
                r8.add(r10)
            L_0x005e:
                r9.mo35268k(r8, r1, r5)
                java.lang.Class r16 = r9.mo35271r()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r4)
                java.lang.String r4 = "$default"
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                java.lang.Class[] r5 = new java.lang.Class[r5]
                java.lang.Object[] r5 = r8.toArray(r5)
                gy3.C87412m.m108592e(r5, r3)
                r3 = r5
                java.lang.Class[] r3 = (java.lang.Class[]) r3
                r11 = 41
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                r10 = r1
                int r5 = z04.C112550d0.m153768D(r10, r11, r12, r13, r14, r15)
                int r5 = r5 + r7
                int r8 = r1.length()
                java.lang.Class r13 = r9.mo35274v(r1, r5, r8)
                r10 = r16
                r11 = r4
                r12 = r3
                r14 = r2
                java.lang.reflect.Method r1 = r9.mo35273u(r10, r11, r12, r13, r14)
                goto L_0x0162
            L_0x00a1:
                boolean r2 = r1 instanceof qy3.C22152c.C22159d
                r9 = 10
                if (r2 == 0) goto L_0x0126
                qy3.s r2 = r0.f72367d
                boolean r2 = r2.mo52806o()
                if (r2 == 0) goto L_0x00ef
                qy3.s r1 = r0.f72367d
                qy3.o r1 = r1.f72360h
                java.lang.Class r2 = r1.mo32564c()
                qy3.s r1 = r0.f72367d
                java.util.List r1 = r1.getParameters()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r5 = sx3.C36907w.m41090l(r1, r9)
                r3.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L_0x00ca:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x00e1
                java.lang.Object r5 = r1.next()
                ny3.j r5 = (ny3.C25239j) r5
                java.lang.String r5 = r5.getName()
                gy3.C87412m.m108591d(r5)
                r3.add(r5)
                goto L_0x00ca
            L_0x00e1:
                ry3.a$b r5 = ry3.C26119a.C22279b.KOTLIN
                r6 = 0
                r7 = 16
                r8 = 0
                ry3.a r9 = new ry3.a
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x01e6
            L_0x00ef:
                qy3.s r2 = r0.f72367d
                qy3.o r2 = r2.f72360h
                qy3.c$d r1 = (qy3.C22152c.C22159d) r1
                uz3.d$b r1 = r1.f62676a
                java.lang.String r1 = r1.f65293b
                r2.getClass()
                gy3.C87412m.m108594g(r1, r8)
                java.lang.Class r4 = r2.mo32564c()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r2.mo35268k(r8, r1, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0124 }
                java.lang.Object[] r1 = r8.toArray(r1)     // Catch:{ NoSuchMethodException -> 0x0124 }
                gy3.C87412m.m108592e(r1, r3)     // Catch:{ NoSuchMethodException -> 0x0124 }
                java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0124 }
                int r2 = r1.length     // Catch:{ NoSuchMethodException -> 0x0124 }
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0124 }
                java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0124 }
                java.lang.reflect.Constructor r1 = r4.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0124 }
                goto L_0x0162
            L_0x0124:
                goto L_0x0161
            L_0x0126:
                boolean r2 = r1 instanceof qy3.C22152c.C22153a
                if (r2 == 0) goto L_0x0161
                qy3.c$a r1 = (qy3.C22152c.C22153a) r1
                java.util.List<java.lang.reflect.Method> r6 = r1.f62671a
                qy3.s r1 = r0.f72367d
                qy3.o r1 = r1.f72360h
                java.lang.Class r2 = r1.mo32564c()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r1 = sx3.C36907w.m41090l(r6, r9)
                r3.<init>(r1)
                java.util.Iterator r1 = r6.iterator()
            L_0x0143:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0157
                java.lang.Object r5 = r1.next()
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                java.lang.String r5 = r5.getName()
                r3.add(r5)
                goto L_0x0143
            L_0x0157:
                ry3.a$b r5 = ry3.C26119a.C22279b.JAVA
                ry3.a r9 = new ry3.a
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                goto L_0x01e6
            L_0x0161:
                r1 = r6
            L_0x0162:
                boolean r2 = r1 instanceof java.lang.reflect.Constructor
                if (r2 == 0) goto L_0x0173
                qy3.s r2 = r0.f72367d
                java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                wy3.w r3 = r2.mo52805n()
                ry3.f r1 = qy3.C25978s.m33155q(r2, r1, r3, r7)
                goto L_0x01d9
            L_0x0173:
                boolean r2 = r1 instanceof java.lang.reflect.Method
                if (r2 == 0) goto L_0x01d8
                qy3.s r2 = r0.f72367d
                wy3.w r2 = r2.mo52805n()
                xy3.h r2 = r2.getAnnotations()
                vz3.c r3 = qy3.C25987u0.f72374a
                xy3.c r2 = r2.mo51476b(r3)
                if (r2 == 0) goto L_0x01b7
                qy3.s r2 = r0.f72367d
                wy3.w r2 = r2.mo52805n()
                wy3.k r2 = r2.mo51892b()
                java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                gy3.C87412m.m108592e(r2, r3)
                wy3.e r2 = (wy3.C26447e) r2
                boolean r2 = r2.mo51809x0()
                if (r2 != 0) goto L_0x01b7
                qy3.s r2 = r0.f72367d
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                boolean r2 = r2.mo52807p()
                if (r2 == 0) goto L_0x01b0
                ry3.f$g$b r2 = new ry3.f$g$b
                r2.<init>(r1)
                goto L_0x01b5
            L_0x01b0:
                ry3.f$g$e r2 = new ry3.f$g$e
                r2.<init>(r1)
            L_0x01b5:
                r1 = r2
                goto L_0x01d9
            L_0x01b7:
                qy3.s r2 = r0.f72367d
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                boolean r3 = r2.mo52807p()
                if (r3 == 0) goto L_0x01d2
                ry3.f$g$c r3 = new ry3.f$g$c
                java.lang.Object r4 = r2.f72362j
                wy3.w r2 = r2.mo52805n()
                java.lang.Object r2 = ry3.C26150i.m33565a(r4, r2)
                r3.<init>(r1, r2)
                r1 = r3
                goto L_0x01d9
            L_0x01d2:
                ry3.f$g$f r2 = new ry3.f$g$f
                r2.<init>(r1)
                goto L_0x01b5
            L_0x01d8:
                r1 = r6
            L_0x01d9:
                if (r1 == 0) goto L_0x01e5
                qy3.s r2 = r0.f72367d
                wy3.w r2 = r2.mo52805n()
                ry3.e r6 = ry3.C26150i.m33566b(r1, r2, r7)
            L_0x01e5:
                r9 = r6
            L_0x01e6:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: qy3.C25978s.C25980b.invoke():java.lang.Object");
        }
    }

    static {
        Class<C25978s> cls = C25978s.class;
        f72359q = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    public C25978s(C22167o oVar, String str, String str2, C26516w wVar, Object obj) {
        this.f72360h = oVar;
        this.f72361i = str2;
        this.f72362j = obj;
        this.f72363n = new C25968n0.C25969a(wVar, new C22175c(this, str));
        this.f72364o = C25968n0.m33136b(new C25979a(this));
        this.f72365p = C25968n0.m33136b(new C25980b(this));
    }

    /* renamed from: q */
    public static final C26123f m33155q(C25978s sVar, Constructor constructor, C26516w wVar, boolean z) {
        if (!z) {
            sVar.getClass();
            C87412m.m108594g(wVar, "descriptor");
            C26444d dVar = wVar instanceof C26444d ? (C26444d) wVar : null;
            boolean z2 = false;
            if (dVar != null && !C26491r.m34182e(dVar.getVisibility())) {
                C26447e j0 = dVar.mo53446j0();
                C87412m.m108593f(j0, "constructorDescriptor.constructedClass");
                if (!C26798j.m35239b(j0) && !C26794h.m35230r(dVar.mo53446j0())) {
                    List<C26463h1> h = dVar.mo52639h();
                    C87412m.m108593f(h, "constructorDescriptor.valueParameters");
                    if (!h.isEmpty()) {
                        Iterator<T> it = h.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C25143j0 type = ((C26463h1) it.next()).getType();
                            C87412m.m108593f(type, "it.type");
                            if (C24467b.m30609a(type)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z2) {
                return sVar.mo52807p() ? new C26123f.C26124a(constructor, C26150i.m33565a(sVar.f72362j, sVar.mo52805n())) : new C26123f.C26125b(constructor);
            }
        }
        return sVar.mo52807p() ? new C26123f.C26126c(constructor, C26150i.m33565a(sVar.f72362j, sVar.mo52805n())) : new C26123f.C26127d(constructor);
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    /* renamed from: L */
    public Object mo14122L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean equals(Object obj) {
        C25978s a = C25987u0.m33170a(obj);
        return a != null && C87412m.m108589b(this.f72360h, a.f72360h) && C87412m.m108589b(getName(), a.getName()) && C87412m.m108589b(this.f72361i, a.f72361i) && C87412m.m108589b(this.f72362j, a.f72362j);
    }

    public int getArity() {
        return C26147g.m33562a(mo52802k());
    }

    public String getName() {
        String b = mo52805n().getName().mo35995b();
        C87412m.m108593f(b, "descriptor.name.asString()");
        return b;
    }

    public int hashCode() {
        return (((this.f72360h.hashCode() * 31) + getName().hashCode()) * 31) + this.f72361i.hashCode();
    }

    public Object invoke() {
        return call(new Object[0]);
    }

    public boolean isExternal() {
        return mo52805n().isExternal();
    }

    public boolean isInfix() {
        return mo52805n().isInfix();
    }

    public boolean isInline() {
        return mo52805n().isInline();
    }

    public boolean isOperator() {
        return mo52805n().isOperator();
    }

    public boolean isSuspend() {
        return mo52805n().isSuspend();
    }

    /* renamed from: k */
    public C26121e<?> mo52802k() {
        C25968n0.C25970b bVar = this.f72364o;
        C89104m<Object> mVar = f72359q[1];
        Object invoke = bVar.invoke();
        C87412m.m108593f(invoke, "<get-caller>(...)");
        return (C26121e) invoke;
    }

    /* renamed from: l */
    public C22167o mo52803l() {
        return this.f72360h;
    }

    /* renamed from: m */
    public C26121e<?> mo52804m() {
        C25968n0.C25970b bVar = this.f72365p;
        C89104m<Object> mVar = f72359q[2];
        return (C26121e) bVar.invoke();
    }

    /* renamed from: p */
    public boolean mo52807p() {
        return !C87412m.m108589b(this.f72362j, C24557d.NO_RECEIVER);
    }

    /* renamed from: r */
    public C26516w mo52805n() {
        C25968n0.C25969a aVar = this.f72363n;
        C89104m<Object> mVar = f72359q[0];
        Object invoke = aVar.invoke();
        C87412m.m108593f(invoke, "<get-descriptor>(...)");
        return (C26516w) invoke;
    }

    public String toString() {
        return C25974p0.f72353a.mo52838b(mo52805n());
    }

    /* renamed from: x0 */
    public Object mo9163x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public Object invoke(Object obj) {
        return call(obj);
    }

    public Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25978s(qy3.C22167o r8, wy3.C26516w r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r9, r0)
            vz3.f r0 = r9.getName()
            java.lang.String r3 = r0.mo35995b()
            java.lang.String r0 = "descriptor.name.asString()"
            gy3.C87412m.m108593f(r3, r0)
            qy3.r0 r0 = qy3.C25977r0.f72357a
            qy3.c r0 = r0.mo52843c(r9)
            java.lang.String r4 = r0.mo35265a()
            java.lang.Object r6 = gy3.C24557d.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C25978s.<init>(qy3.o, wy3.w):void");
    }
}
