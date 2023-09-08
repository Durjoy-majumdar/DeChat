package xz3;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xz3.C23159i;
import xz3.C23172u;
import xz3.C26583a;
import xz3.C26591g;
import xz3.C26602k;
import xz3.C26607p;

/* renamed from: xz3.h */
public abstract class C26593h extends C26583a implements Serializable {

    /* renamed from: xz3.h$b */
    public static abstract class C26595b<MessageType extends C26593h, BuilderType extends C26595b> extends C26583a.C26584a<BuilderType> {

        /* renamed from: d */
        public C23156c f74007d = C23156c.f66530d;

        /* renamed from: c */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: d */
        public abstract BuilderType mo52866d(MessageType messagetype);
    }

    /* renamed from: xz3.h$c */
    public static abstract class C26596c<MessageType extends C26597d<MessageType>, BuilderType extends C26596c<MessageType, BuilderType>> extends C26595b<MessageType, BuilderType> implements C26609q {

        /* renamed from: e */
        public C26591g<C26599e> f74008e = C26591g.f74003d;

        /* renamed from: f */
        public boolean f74009f;

        /* renamed from: e */
        public final void mo53568e(MessageType messagetype) {
            if (!this.f74009f) {
                this.f74008e = this.f74008e.clone();
                this.f74009f = true;
            }
            C26591g<C26599e> gVar = this.f74008e;
            C26591g<C26599e> gVar2 = messagetype.f74010d;
            gVar.getClass();
            for (int i = 0; i < gVar2.f74004a.f66560e.size(); i++) {
                gVar.mo53560h(gVar2.f74004a.f66560e.get(i));
            }
            for (Map.Entry<FieldDescriptorType, Object> h : gVar2.f74004a.mo36597c()) {
                gVar.mo53560h(h);
            }
        }
    }

    /* renamed from: xz3.h$e */
    public static final class C26599e implements C26591g.C26592a<C26599e> {

        /* renamed from: d */
        public final int f74014d;

        /* renamed from: e */
        public final C26612y f74015e;

        /* renamed from: f */
        public final boolean f74016f;

        /* renamed from: g */
        public final boolean f74017g;

        public C26599e(C23159i.C23161b<?> bVar, int i, C26612y yVar, boolean z, boolean z2) {
            this.f74014d = i;
            this.f74015e = yVar;
            this.f74016f = z;
            this.f74017g = z2;
        }

        /* renamed from: Bh */
        public C26607p.C26608a mo53562Bh(C26607p.C26608a aVar, C26607p pVar) {
            return ((C26595b) aVar).mo52866d((C26593h) pVar);
        }

        /* renamed from: E0 */
        public boolean mo53563E0() {
            return this.f74016f;
        }

        /* renamed from: O */
        public C26612y mo53564O() {
            return this.f74015e;
        }

        /* renamed from: Q */
        public C26617z mo53565Q() {
            return this.f74015e.f74034d;
        }

        /* renamed from: T0 */
        public boolean mo53566T0() {
            return this.f74017g;
        }

        public int compareTo(Object obj) {
            return this.f74014d - ((C26599e) obj).f74014d;
        }

        public int getNumber() {
            return this.f74014d;
        }
    }

    /* renamed from: xz3.h$f */
    public static class C26600f<ContainingType extends C26607p, Type> {

        /* renamed from: a */
        public final ContainingType f74018a;

        /* renamed from: b */
        public final Type f74019b;

        /* renamed from: c */
        public final C26607p f74020c;

        /* renamed from: d */
        public final C26599e f74021d;

        /* renamed from: e */
        public final Method f74022e;

        public C26600f(ContainingType containingtype, Type type, C26607p pVar, C26599e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.f74015e == C26612y.MESSAGE && pVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f74018a = containingtype;
                this.f74019b = type;
                this.f74020c = pVar;
                this.f74021d = eVar;
                if (C23159i.C23160a.class.isAssignableFrom(cls)) {
                    try {
                        this.f74022e = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + "valueOf".length());
                        sb.append("Generated message class \"");
                        sb.append(name);
                        sb.append("\" missing method \"");
                        sb.append("valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e);
                    }
                } else {
                    this.f74022e = null;
                }
            }
        }

        /* renamed from: a */
        public Object mo53579a(Object obj) {
            if (this.f74021d.f74015e.f74034d != C26617z.ENUM) {
                return obj;
            }
            try {
                return this.f74022e.invoke((Object) null, new Object[]{(Integer) obj});
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
            }
        }

        /* renamed from: b */
        public Object mo53580b(Object obj) {
            return this.f74021d.f74015e.f74034d == C26617z.ENUM ? Integer.valueOf(((C23159i.C23160a) obj).getNumber()) : obj;
        }
    }

    public C26593h() {
    }

    /* renamed from: b */
    public static <ContainingType extends C26607p, Type> C26600f<ContainingType, Type> m34447b(ContainingType containingtype, C26607p pVar, C23159i.C23161b<?> bVar, int i, C26612y yVar, boolean z, Class cls) {
        return new C26600f(containingtype, Collections.emptyList(), pVar, new C26599e(bVar, i, yVar, true, z), cls);
    }

    /* renamed from: c */
    public static <ContainingType extends C26607p, Type> C26600f<ContainingType, Type> m34448c(ContainingType containingtype, Type type, C26607p pVar, C23159i.C23161b<?> bVar, int i, C26612y yVar, Class cls) {
        return new C26600f(containingtype, type, pVar, new C26599e(bVar, i, yVar, false, false), cls);
    }

    public C26593h(C26595b bVar) {
    }

    /* renamed from: xz3.h$d */
    public static abstract class C26597d<MessageType extends C26597d<MessageType>> extends C26593h implements C26609q {

        /* renamed from: d */
        public final C26591g<C26599e> f74010d;

        /* renamed from: xz3.h$d$a */
        public class C26598a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C26599e, Object>> f74011a;

            /* renamed from: b */
            public Map.Entry<C26599e, Object> f74012b;

            /* renamed from: c */
            public final boolean f74013c;

            public C26598a(C26597d dVar, boolean z, C26594a aVar) {
                C26591g<C26599e> gVar = dVar.f74010d;
                Iterator<Map.Entry<C26599e, Object>> cVar = gVar.f74006c ? new C26602k.C26605c<>(((C23172u.C23175d) gVar.f74004a.entrySet()).iterator()) : ((C23172u.C23175d) gVar.f74004a.entrySet()).iterator();
                this.f74011a = cVar;
                if (cVar.hasNext()) {
                    this.f74012b = cVar.next();
                }
                this.f74013c = z;
            }

            /* renamed from: a */
            public void mo53577a(int i, C26587e eVar) {
                while (true) {
                    Map.Entry<C26599e, Object> entry = this.f74012b;
                    if (entry != null && entry.getKey().f74014d < i) {
                        C26599e key = this.f74012b.getKey();
                        int i2 = 0;
                        if (!this.f74013c || key.f74015e.f74034d != C26617z.MESSAGE || key.f74016f) {
                            Object value = this.f74012b.getValue();
                            C26591g gVar = C26591g.f74003d;
                            C26612y O = key.mo53564O();
                            int number = key.getNumber();
                            if (key.mo53563E0()) {
                                List<Object> list = (List) value;
                                if (key.mo53566T0()) {
                                    eVar.mo53550x(number, 2);
                                    for (Object c : list) {
                                        i2 += C26591g.m34429c(O, c);
                                    }
                                    eVar.mo53548v(i2);
                                    for (Object m : list) {
                                        C26591g.m34434m(eVar, O, m);
                                    }
                                } else {
                                    for (Object l : list) {
                                        C26591g.m34433l(eVar, O, number, l);
                                    }
                                }
                            } else if (value instanceof C26602k) {
                                C26591g.m34433l(eVar, O, number, ((C26602k) value).mo53582a());
                            } else {
                                C26591g.m34433l(eVar, O, number, value);
                            }
                        } else {
                            int i3 = key.f74014d;
                            eVar.mo53550x(1, 3);
                            eVar.mo53550x(2, 0);
                            eVar.mo53548v(i3);
                            eVar.mo53541o(3, (C26607p) this.f74012b.getValue());
                            eVar.mo53550x(1, 4);
                        }
                        if (this.f74011a.hasNext()) {
                            this.f74012b = this.f74011a.next();
                        } else {
                            this.f74012b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public C26597d() {
            this.f74010d = new C26591g<>();
        }

        /* renamed from: d */
        public boolean mo53569d() {
            C26591g<C26599e> gVar = this.f74010d;
            for (int i = 0; i < gVar.f74004a.f66560e.size(); i++) {
                if (!gVar.mo53558f(gVar.f74004a.f66560e.get(i))) {
                    return false;
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> f : gVar.f74004a.mo36597c()) {
                if (!gVar.mo53558f(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public int mo53570e() {
            C26591g<C26599e> gVar = this.f74010d;
            int i = 0;
            for (int i2 = 0; i2 < gVar.f74004a.f66560e.size(); i2++) {
                Map.Entry entry = gVar.f74004a.f66560e.get(i2);
                i += C26591g.m34430d((C26591g.C26592a) entry.getKey(), entry.getValue());
            }
            for (Map.Entry next : gVar.f74004a.mo36597c()) {
                i += C26591g.m34430d((C26591g.C26592a) next.getKey(), next.getValue());
            }
            return i;
        }

        /* renamed from: f */
        public final <Type> Type mo53571f(C26600f<MessageType, Type> fVar) {
            mo53576k(fVar);
            Type e = this.f74010d.mo53557e(fVar.f74021d);
            if (e == null) {
                return fVar.f74019b;
            }
            C26599e eVar = fVar.f74021d;
            if (!eVar.f74016f) {
                return fVar.mo53579a(e);
            }
            if (eVar.f74015e.f74034d != C26617z.ENUM) {
                return e;
            }
            Type arrayList = new ArrayList();
            for (Object a : (List) e) {
                arrayList.add(fVar.mo53579a(a));
            }
            return arrayList;
        }

        /* renamed from: g */
        public final <Type> boolean mo53572g(C26600f<MessageType, Type> fVar) {
            mo53576k(fVar);
            C26591g<C26599e> gVar = this.f74010d;
            C26599e eVar = fVar.f74021d;
            gVar.getClass();
            if (!eVar.mo53563E0()) {
                return gVar.f74004a.get(eVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        /* renamed from: h */
        public void mo53573h() {
            this.f74010d.mo53559g();
        }

        /* renamed from: i */
        public C26597d<MessageType>.a mo53574i() {
            return new C26598a(this, false, (C26594a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo53575j(xz3.C26586d r9, xz3.C26587e r10, xz3.C26589f r11, int r12) {
            /*
                r8 = this;
                xz3.g<xz3.h$e> r0 = r8.f74010d
                xz3.p r1 = r8.getDefaultInstanceForType()
                r2 = r12 & 7
                int r3 = r12 >>> 3
                java.util.Map<xz3.f$a, xz3.h$f<?, ?>> r4 = r11.f74000a
                xz3.f$a r5 = new xz3.f$a
                r5.<init>(r1, r3)
                java.lang.Object r1 = r4.get(r5)
                xz3.h$f r1 = (xz3.C26593h.C26600f) r1
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x001c
                goto L_0x003c
            L_0x001c:
                xz3.h$e r5 = r1.f74021d
                xz3.y r6 = r5.f74015e
                xz3.g r7 = xz3.C26591g.f74003d
                int r7 = r6.f74035e
                if (r2 != r7) goto L_0x0028
                r2 = 0
                goto L_0x003d
            L_0x0028:
                boolean r5 = r5.f74016f
                if (r5 == 0) goto L_0x003c
                boolean r5 = r6.mo53592a()
                if (r5 == 0) goto L_0x003c
                xz3.h$e r5 = r1.f74021d
                xz3.y r5 = r5.f74015e
                r5 = 2
                if (r2 != r5) goto L_0x003c
                r2 = 0
                r5 = 1
                goto L_0x003e
            L_0x003c:
                r2 = 1
            L_0x003d:
                r5 = 0
            L_0x003e:
                if (r2 == 0) goto L_0x0046
                boolean r3 = r9.mo53533q(r12, r10)
                goto L_0x011c
            L_0x0046:
                if (r5 == 0) goto L_0x0082
                int r10 = r9.mo53527k()
                int r10 = r9.mo53520d(r10)
                xz3.h$e r11 = r1.f74021d
                xz3.y r11 = r11.f74015e
                xz3.y r12 = xz3.C26612y.ENUM
                if (r11 != r12) goto L_0x0069
                int r11 = r9.mo53518b()
                if (r11 > 0) goto L_0x005f
                goto L_0x007d
            L_0x005f:
                r9.mo53527k()
                xz3.h$e r9 = r1.f74021d
                r9.getClass()
                r9 = 0
                throw r9
            L_0x0069:
                int r11 = r9.mo53518b()
                if (r11 <= 0) goto L_0x007d
                xz3.h$e r11 = r1.f74021d
                xz3.y r11 = r11.f74015e
                java.lang.Object r11 = xz3.C26591g.m34431i(r9, r11, r4)
                xz3.h$e r12 = r1.f74021d
                r0.mo53554a(r12, r11)
                goto L_0x0069
            L_0x007d:
                r9.mo53519c(r10)
                goto L_0x011c
            L_0x0082:
                xz3.h$e r10 = r1.f74021d
                xz3.y r10 = r10.f74015e
                xz3.z r10 = r10.f74034d
                int r10 = r10.ordinal()
                r12 = 7
                if (r10 == r12) goto L_0x0123
                r12 = 8
                if (r10 == r12) goto L_0x009c
                xz3.h$e r10 = r1.f74021d
                xz3.y r10 = r10.f74015e
                java.lang.Object r9 = xz3.C26591g.m34431i(r9, r10, r4)
                goto L_0x0107
            L_0x009c:
                r10 = 0
                xz3.h$e r12 = r1.f74021d
                boolean r2 = r12.f74016f
                if (r2 != 0) goto L_0x00af
                java.lang.Object r12 = r0.mo53557e(r12)
                xz3.p r12 = (xz3.C26607p) r12
                if (r12 == 0) goto L_0x00af
                xz3.p$a r10 = r12.toBuilder()
            L_0x00af:
                if (r10 != 0) goto L_0x00b7
                xz3.p r10 = r1.f74020c
                xz3.p$a r10 = r10.newBuilderForType()
            L_0x00b7:
                xz3.h$e r12 = r1.f74021d
                xz3.y r2 = r12.f74015e
                xz3.y r5 = xz3.C26612y.GROUP
                r6 = 64
                java.lang.String r7 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
                if (r2 != r5) goto L_0x00e3
                int r12 = r12.f74014d
                int r2 = r9.f73994i
                if (r2 >= r6) goto L_0x00dd
                int r2 = r2 + r3
                r9.f73994i = r2
                r10.mo52861M(r9, r11)
                int r11 = r12 << 3
                r11 = r11 | 4
                r9.mo53517a(r11)
                int r11 = r9.f73994i
                int r11 = r11 + -1
                r9.f73994i = r11
                goto L_0x0103
            L_0x00dd:
                xz3.j r9 = new xz3.j
                r9.<init>(r7)
                throw r9
            L_0x00e3:
                int r12 = r9.mo53527k()
                int r2 = r9.f73994i
                if (r2 >= r6) goto L_0x011d
                int r12 = r9.mo53520d(r12)
                int r2 = r9.f73994i
                int r2 = r2 + r3
                r9.f73994i = r2
                r10.mo52861M(r9, r11)
                r9.mo53517a(r4)
                int r11 = r9.f73994i
                int r11 = r11 + -1
                r9.f73994i = r11
                r9.mo53519c(r12)
            L_0x0103:
                xz3.p r9 = r10.build()
            L_0x0107:
                xz3.h$e r10 = r1.f74021d
                boolean r11 = r10.f74016f
                if (r11 == 0) goto L_0x0115
                java.lang.Object r9 = r1.mo53580b(r9)
                r0.mo53554a(r10, r9)
                goto L_0x011c
            L_0x0115:
                java.lang.Object r9 = r1.mo53580b(r9)
                r0.mo53561j(r10, r9)
            L_0x011c:
                return r3
            L_0x011d:
                xz3.j r9 = new xz3.j
                r9.<init>(r7)
                throw r9
            L_0x0123:
                r9.mo53527k()
                xz3.h$e r9 = r1.f74021d
                r9.getClass()
                r9 = 0
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xz3.C26593h.C26597d.mo53575j(xz3.d, xz3.e, xz3.f, int):boolean");
        }

        /* renamed from: k */
        public final void mo53576k(C26600f<MessageType, ?> fVar) {
            if (fVar.f74018a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C26597d(C26596c<MessageType, ?> cVar) {
            cVar.f74008e.mo53559g();
            cVar.f74009f = false;
            this.f74010d = cVar.f74008e;
        }
    }
}
