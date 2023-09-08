package com.google.protobuf;

import com.google.protobuf.C17003m2;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23832g0;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23938s;
import com.google.protobuf.C24087z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.t */
public final class C24025t {

    /* renamed from: a */
    public static final Logger f69068a = Logger.getLogger(C24025t.class.getName());

    /* renamed from: com.google.protobuf.t$c */
    public static final class C24028c {

        /* renamed from: a */
        public final Set<C24038h> f69077a = new HashSet();

        /* renamed from: b */
        public boolean f69078b;

        /* renamed from: c */
        public final Map<String, C24040i> f69079c = new HashMap();

        /* renamed from: d */
        public final Map<C24029a, C24035g> f69080d = new HashMap();

        /* renamed from: e */
        public final Map<C24029a, C24034f> f69081e = new HashMap();

        /* renamed from: com.google.protobuf.t$c$a */
        public static final class C24029a {

            /* renamed from: a */
            public final C24040i f69082a;

            /* renamed from: b */
            public final int f69083b;

            public C24029a(C24040i iVar, int i) {
                this.f69082a = iVar;
                this.f69083b = i;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C24029a)) {
                    return false;
                }
                C24029a aVar = (C24029a) obj;
                return this.f69082a == aVar.f69082a && this.f69083b == aVar.f69083b;
            }

            public int hashCode() {
                return (this.f69082a.hashCode() * 65535) + this.f69083b;
            }
        }

        /* renamed from: com.google.protobuf.t$c$b */
        public static final class C24030b extends C24040i {

            /* renamed from: d */
            public final String f69084d;

            /* renamed from: e */
            public final String f69085e;

            /* renamed from: f */
            public final C24038h f69086f;

            public C24030b(String str, String str2, C24038h hVar) {
                this.f69086f = hVar;
                this.f69085e = str2;
                this.f69084d = str;
            }

            /* renamed from: a */
            public C24038h mo38312a() {
                return this.f69086f;
            }

            /* renamed from: b */
            public String mo38313b() {
                return this.f69085e;
            }

            /* renamed from: c */
            public C23836g1 mo38314c() {
                return this.f69086f.f69133d;
            }

            public String getName() {
                return this.f69084d;
            }
        }

        /* renamed from: com.google.protobuf.t$c$c */
        public enum C24031c {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        public C24028c(C24038h[] hVarArr, boolean z) {
            this.f69078b = z;
            for (int i = 0; i < hVarArr.length; i++) {
                ((HashSet) this.f69077a).add(hVarArr[i]);
                mo38327d(hVarArr[i]);
            }
            Iterator it = ((HashSet) this.f69077a).iterator();
            while (it.hasNext()) {
                C24038h hVar = (C24038h) it.next();
                try {
                    mo38324a(hVar.f69133d.mo38157b(), hVar);
                } catch (C24032d e) {
                    throw new AssertionError(e);
                }
            }
        }

        /* renamed from: a */
        public void mo38324a(String str, C24038h hVar) {
            String str2;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str2 = str;
            } else {
                mo38324a(str.substring(0, lastIndexOf), hVar);
                str2 = str.substring(lastIndexOf + 1);
            }
            C24040i put = this.f69079c.put(str, new C24030b(str2, str, hVar));
            if (put != null) {
                this.f69079c.put(str, put);
                if (!(put instanceof C24030b)) {
                    String name = put.mo38312a().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 69 + String.valueOf(name).length());
                    sb.append('\"');
                    sb.append(str2);
                    sb.append("\" is already defined (as something other than a package) in file \"");
                    sb.append(name);
                    sb.append("\".");
                    throw new C24032d(hVar, sb.toString(), (C24026a) null);
                }
            }
        }

        /* renamed from: b */
        public void mo38325b(C24040i iVar) {
            String name = iVar.getName();
            if (name.length() != 0) {
                for (int i = 0; i < name.length(); i++) {
                    char charAt = name.charAt(i);
                    if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '_' && ('0' > charAt || charAt > '9' || i <= 0))) {
                        StringBuilder sb = new StringBuilder(name.length() + 29);
                        sb.append('\"');
                        sb.append(name);
                        sb.append("\" is not a valid identifier.");
                        throw new C24032d(iVar, sb.toString());
                    }
                }
                String b = iVar.mo38313b();
                C24040i iVar2 = (C24040i) ((HashMap) this.f69079c).put(b, iVar);
                if (iVar2 != null) {
                    ((HashMap) this.f69079c).put(b, iVar2);
                    if (iVar.mo38312a() == iVar2.mo38312a()) {
                        int lastIndexOf = b.lastIndexOf(46);
                        if (lastIndexOf == -1) {
                            StringBuilder sb4 = new StringBuilder(b.length() + 22);
                            sb4.append('\"');
                            sb4.append(b);
                            sb4.append("\" is already defined.");
                            throw new C24032d(iVar, sb4.toString());
                        }
                        String substring = b.substring(lastIndexOf + 1);
                        String substring2 = b.substring(0, lastIndexOf);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(substring).length() + 28 + String.valueOf(substring2).length());
                        sb5.append('\"');
                        sb5.append(substring);
                        sb5.append("\" is already defined in \"");
                        sb5.append(substring2);
                        sb5.append("\".");
                        throw new C24032d(iVar, sb5.toString());
                    }
                    String name2 = iVar2.mo38312a().getName();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(b).length() + 33 + String.valueOf(name2).length());
                    sb6.append('\"');
                    sb6.append(b);
                    sb6.append("\" is already defined in file \"");
                    sb6.append(name2);
                    sb6.append("\".");
                    throw new C24032d(iVar, sb6.toString());
                }
                return;
            }
            throw new C24032d(iVar, "Missing name.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
            if (((r3 instanceof com.google.protobuf.C24025t.C24027b) || (r3 instanceof com.google.protobuf.C24025t.C24033e)) == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
            if (((r3 instanceof com.google.protobuf.C24025t.C24027b) || (r3 instanceof com.google.protobuf.C24025t.C24033e) || (r3 instanceof com.google.protobuf.C24025t.C24028c.C24030b) || (r3 instanceof com.google.protobuf.C24025t.C24043l)) != false) goto L_0x003e;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.protobuf.C24025t.C24040i mo38326c(java.lang.String r9, com.google.protobuf.C24025t.C24028c.C24031c r10) {
            /*
                r8 = this;
                com.google.protobuf.t$c$c r0 = com.google.protobuf.C24025t.C24028c.C24031c.AGGREGATES_ONLY
                com.google.protobuf.t$c$c r1 = com.google.protobuf.C24025t.C24028c.C24031c.TYPES_ONLY
                com.google.protobuf.t$c$c r2 = com.google.protobuf.C24025t.C24028c.C24031c.ALL_SYMBOLS
                java.util.Map<java.lang.String, com.google.protobuf.t$i> r3 = r8.f69079c
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.Object r3 = r3.get(r9)
                com.google.protobuf.t$i r3 = (com.google.protobuf.C24025t.C24040i) r3
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x003f
                if (r10 == r2) goto L_0x003e
                if (r10 != r1) goto L_0x0026
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24027b
                if (r6 != 0) goto L_0x0023
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24033e
                if (r6 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r6 = 0
                goto L_0x0024
            L_0x0023:
                r6 = 1
            L_0x0024:
                if (r6 != 0) goto L_0x003e
            L_0x0026:
                if (r10 != r0) goto L_0x003f
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24027b
                if (r6 != 0) goto L_0x003b
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24033e
                if (r6 != 0) goto L_0x003b
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24028c.C24030b
                if (r6 != 0) goto L_0x003b
                boolean r6 = r3 instanceof com.google.protobuf.C24025t.C24043l
                if (r6 == 0) goto L_0x0039
                goto L_0x003b
            L_0x0039:
                r6 = 0
                goto L_0x003c
            L_0x003b:
                r6 = 1
            L_0x003c:
                if (r6 == 0) goto L_0x003f
            L_0x003e:
                return r3
            L_0x003f:
                java.util.Set<com.google.protobuf.t$h> r3 = r8.f69077a
                java.util.HashSet r3 = (java.util.HashSet) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x0047:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x008c
                java.lang.Object r6 = r3.next()
                com.google.protobuf.t$h r6 = (com.google.protobuf.C24025t.C24038h) r6
                com.google.protobuf.t$c r6 = r6.f69139j
                java.util.Map<java.lang.String, com.google.protobuf.t$i> r6 = r6.f69079c
                java.util.HashMap r6 = (java.util.HashMap) r6
                java.lang.Object r6 = r6.get(r9)
                com.google.protobuf.t$i r6 = (com.google.protobuf.C24025t.C24040i) r6
                if (r6 == 0) goto L_0x0047
                if (r10 == r2) goto L_0x008b
                if (r10 != r1) goto L_0x0073
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24027b
                if (r7 != 0) goto L_0x0070
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24033e
                if (r7 == 0) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r7 = 0
                goto L_0x0071
            L_0x0070:
                r7 = 1
            L_0x0071:
                if (r7 != 0) goto L_0x008b
            L_0x0073:
                if (r10 != r0) goto L_0x0047
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24027b
                if (r7 != 0) goto L_0x0088
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24033e
                if (r7 != 0) goto L_0x0088
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24028c.C24030b
                if (r7 != 0) goto L_0x0088
                boolean r7 = r6 instanceof com.google.protobuf.C24025t.C24043l
                if (r7 == 0) goto L_0x0086
                goto L_0x0088
            L_0x0086:
                r7 = 0
                goto L_0x0089
            L_0x0088:
                r7 = 1
            L_0x0089:
                if (r7 == 0) goto L_0x0047
            L_0x008b:
                return r6
            L_0x008c:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24025t.C24028c.mo38326c(java.lang.String, com.google.protobuf.t$c$c):com.google.protobuf.t$i");
        }

        /* renamed from: d */
        public final void mo38327d(C24038h hVar) {
            for (C24038h hVar2 : Collections.unmodifiableList(Arrays.asList(hVar.f69138i))) {
                if (this.f69077a.add(hVar2)) {
                    mo38327d(hVar2);
                }
            }
        }

        /* renamed from: e */
        public C24040i mo38328e(String str, C24040i iVar, C24031c cVar) {
            C24040i iVar2;
            String str2;
            if (str.startsWith(".")) {
                str2 = str.substring(1);
                iVar2 = mo38326c(str2, cVar);
            } else {
                int indexOf = str.indexOf(46);
                String substring = indexOf == -1 ? str : str.substring(0, indexOf);
                StringBuilder sb = new StringBuilder(iVar.mo38313b());
                while (true) {
                    int lastIndexOf = sb.lastIndexOf(".");
                    if (lastIndexOf == -1) {
                        iVar2 = mo38326c(str, cVar);
                        str2 = str;
                        break;
                    }
                    int i = lastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(substring);
                    C24040i c = mo38326c(sb.toString(), C24031c.AGGREGATES_ONLY);
                    if (c != null) {
                        if (indexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            iVar2 = mo38326c(sb.toString(), cVar);
                        } else {
                            iVar2 = c;
                        }
                        str2 = sb.toString();
                    } else {
                        sb.setLength(lastIndexOf);
                    }
                }
            }
            if (iVar2 != null) {
                return iVar2;
            }
            if (!this.f69078b || cVar != C24031c.TYPES_ONLY) {
                StringBuilder sb4 = new StringBuilder(str.length() + 18);
                sb4.append('\"');
                sb4.append(str);
                sb4.append("\" is not defined.");
                throw new C24032d(iVar, sb4.toString());
            }
            Logger logger = C24025t.f69068a;
            StringBuilder sb5 = new StringBuilder(str.length() + 87);
            sb5.append("The descriptor for message type \"");
            sb5.append(str);
            sb5.append("\" can not be found and a placeholder is created for it");
            logger.warning(sb5.toString());
            C24027b bVar = new C24027b(str2);
            ((HashSet) this.f69077a).add(bVar.f69071f);
            return bVar;
        }
    }

    /* renamed from: com.google.protobuf.t$e */
    public static final class C24033e extends C24040i implements C23908o0.C23912d<C24034f> {

        /* renamed from: d */
        public C23938s.C23949c f69092d;

        /* renamed from: e */
        public final String f69093e;

        /* renamed from: f */
        public final C24038h f69094f;

        /* renamed from: g */
        public C24034f[] f69095g;

        /* renamed from: h */
        public final WeakHashMap<Integer, WeakReference<C24034f>> f69096h = new WeakHashMap<>();

        public C24033e(C23938s.C23949c cVar, C24038h hVar, C24027b bVar, int i, C24026a aVar) {
            this.f69092d = cVar;
            this.f69093e = C24025t.m29824a(hVar, bVar, cVar.getName());
            this.f69094f = hVar;
            if (cVar.f68671f.size() != 0) {
                this.f69095g = new C24034f[cVar.f68671f.size()];
                for (int i2 = 0; i2 < cVar.f68671f.size(); i2++) {
                    this.f69095g[i2] = new C24034f(cVar.f68671f.get(i2), hVar, this, i2, (C24026a) null);
                }
                hVar.f69139j.mo38325b(this);
                return;
            }
            throw new C24032d(this, "Enums must contain at least one value.");
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69094f;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69093e;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69092d;
        }

        /* renamed from: e */
        public C24034f mo38331e(String str) {
            C24028c cVar = this.f69094f.f69139j;
            String str2 = this.f69093e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('.');
            sb.append(str);
            C24040i c = cVar.mo38326c(sb.toString(), C24028c.C24031c.ALL_SYMBOLS);
            if (c == null || !(c instanceof C24034f)) {
                return null;
            }
            return (C24034f) c;
        }

        /* renamed from: f */
        public C24034f findValueByNumber(int i) {
            return (C24034f) ((HashMap) this.f69094f.f69139j.f69081e).get(new C24028c.C24029a(this, i));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.protobuf.t$f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.protobuf.C24025t.C24034f mo38333g(int r4) {
            /*
                r3 = this;
                com.google.protobuf.t$f r0 = r3.findValueByNumber(r4)
                if (r0 == 0) goto L_0x0007
                return r0
            L_0x0007:
                monitor-enter(r3)
                java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x0034 }
                r1.<init>(r4)     // Catch:{ all -> 0x0034 }
                java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<com.google.protobuf.t$f>> r4 = r3.f69096h     // Catch:{ all -> 0x0034 }
                java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0034 }
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x001e
                java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0034 }
                r0 = r4
                com.google.protobuf.t$f r0 = (com.google.protobuf.C24025t.C24034f) r0     // Catch:{ all -> 0x0034 }
            L_0x001e:
                if (r0 != 0) goto L_0x0032
                com.google.protobuf.t$f r0 = new com.google.protobuf.t$f     // Catch:{ all -> 0x0034 }
                com.google.protobuf.t$h r4 = r3.f69094f     // Catch:{ all -> 0x0034 }
                r2 = 0
                r0.<init>(r4, r3, r1, r2)     // Catch:{ all -> 0x0034 }
                java.util.WeakHashMap<java.lang.Integer, java.lang.ref.WeakReference<com.google.protobuf.t$f>> r4 = r3.f69096h     // Catch:{ all -> 0x0034 }
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
                r2.<init>(r0)     // Catch:{ all -> 0x0034 }
                r4.put(r1, r2)     // Catch:{ all -> 0x0034 }
            L_0x0032:
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return r0
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24025t.C24033e.mo38333g(int):com.google.protobuf.t$f");
        }

        public String getName() {
            return this.f69092d.getName();
        }

        /* renamed from: h */
        public List<C24034f> mo38334h() {
            return Collections.unmodifiableList(Arrays.asList(this.f69095g));
        }
    }

    /* renamed from: com.google.protobuf.t$g */
    public static final class C24035g extends C24040i implements Comparable<C24035g>, C23832g0.C23835c<C24035g> {

        /* renamed from: s */
        public static final C24087z2.C24089b[] f69102s = C24087z2.C24089b.values();

        /* renamed from: d */
        public final int f69103d;

        /* renamed from: e */
        public C23938s.C23967h f69104e;

        /* renamed from: f */
        public final String f69105f;

        /* renamed from: g */
        public final C24038h f69106g;

        /* renamed from: h */
        public final C24027b f69107h;

        /* renamed from: i */
        public final boolean f69108i;

        /* renamed from: j */
        public C24037b f69109j;

        /* renamed from: n */
        public C24027b f69110n;

        /* renamed from: o */
        public C24027b f69111o;

        /* renamed from: p */
        public C24042k f69112p;

        /* renamed from: q */
        public C24033e f69113q;

        /* renamed from: r */
        public Object f69114r;

        /* renamed from: com.google.protobuf.t$g$a */
        public enum C24036a {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(C16994k.f46000e),
            ENUM((String) null),
            MESSAGE((String) null);
            

            /* renamed from: d */
            public final Object f69125d;

            /* access modifiers changed from: public */
            C24036a(Object obj) {
                this.f69125d = obj;
            }
        }

        /* renamed from: com.google.protobuf.t$g$b */
        public enum C24037b {
            STRING(C24036a.STRING),
            GROUP(r12),
            MESSAGE(r12),
            BYTES(C24036a.BYTE_STRING),
            ENUM(C24036a.ENUM);
            

            /* renamed from: d */
            public C24036a f69132d;

            /* access modifiers changed from: public */
            C24037b(C24036a aVar) {
                this.f69132d = aVar;
            }
        }

        static {
            if (C24037b.values().length != C23938s.C23967h.C23971d.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public C24035g(C23938s.C23967h hVar, C24038h hVar2, C24027b bVar, int i, boolean z, C24026a aVar) {
            this.f69103d = i;
            this.f69104e = hVar;
            this.f69105f = C24025t.m29824a(hVar2, bVar, hVar.getName());
            this.f69106g = hVar2;
            if (hVar.mo38136h()) {
                hVar.mo38130c();
            } else {
                String name = hVar.getName();
                int length = name.length();
                new StringBuilder(length);
                boolean z2 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    if (name.charAt(i2) == '_') {
                        z2 = true;
                    } else if (z2) {
                        z2 = false;
                    }
                }
            }
            if (hVar.hasType()) {
                C23938s.C23967h.C23971d a = C23938s.C23967h.C23971d.m29636a(hVar.f68741h);
                this.f69109j = C24037b.values()[(a == null ? C23938s.C23967h.C23971d.TYPE_DOUBLE : a).f68787d - 1];
            }
            this.f69108i = hVar.f68748r;
            if (this.f69104e.f68739f > 0) {
                if (z) {
                    if (hVar.mo38134g()) {
                        this.f69110n = null;
                        if (bVar != null) {
                            this.f69107h = bVar;
                        } else {
                            this.f69107h = null;
                        }
                        if (!hVar.mo38138i()) {
                            this.f69112p = null;
                        } else {
                            throw new C24032d(this, "FieldDescriptorProto.oneof_index set for extension field.");
                        }
                    } else {
                        throw new C24032d(this, "FieldDescriptorProto.extendee not set for extension field.");
                    }
                } else if (!hVar.mo38134g()) {
                    this.f69110n = bVar;
                    if (hVar.mo38138i()) {
                        int i3 = hVar.f68745o;
                        if (i3 < 0 || i3 >= bVar.f69069d.mo38046a()) {
                            String valueOf = String.valueOf(bVar.getName());
                            throw new C24032d(this, valueOf.length() != 0 ? "FieldDescriptorProto.oneof_index is out of range for type ".concat(valueOf) : new String("FieldDescriptorProto.oneof_index is out of range for type "));
                        }
                        C24042k kVar = bVar.mo38321j().get(hVar.f68745o);
                        this.f69112p = kVar;
                        kVar.f69151i++;
                    } else {
                        this.f69112p = null;
                    }
                    this.f69107h = null;
                } else {
                    throw new C24032d(this, "FieldDescriptorProto.extendee set for non-extension field.");
                }
                hVar2.f69139j.mo38325b(this);
                return;
            }
            throw new C24032d(this, "Field numbers must be positive integers.");
        }

        /* renamed from: e */
        public static void m29854e(C24035g gVar) {
            C24028c.C24031c cVar = C24028c.C24031c.TYPES_ONLY;
            if (gVar.f69104e.mo38134g()) {
                C24040i e = gVar.f69106g.f69139j.mo38328e(gVar.f69104e.mo38129b(), gVar, cVar);
                if (e instanceof C24027b) {
                    C24027b bVar = (C24027b) e;
                    gVar.f69110n = bVar;
                    if (!bVar.mo38323l(gVar.f69104e.f68739f)) {
                        String str = gVar.f69110n.f69070e;
                        int i = gVar.f69104e.f68739f;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
                        sb.append('\"');
                        sb.append(str);
                        sb.append("\" does not declare ");
                        sb.append(i);
                        sb.append(" as an extension number.");
                        throw new C24032d(gVar, sb.toString());
                    }
                } else {
                    String b = gVar.f69104e.mo38129b();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(b).length() + 25);
                    sb4.append('\"');
                    sb4.append(b);
                    sb4.append("\" is not a message type.");
                    throw new C24032d(gVar, sb4.toString());
                }
            }
            if (gVar.f69104e.mo38140k()) {
                C24040i e2 = gVar.f69106g.f69139j.mo38328e(gVar.f69104e.mo38132e(), gVar, cVar);
                if (!gVar.f69104e.hasType()) {
                    if (e2 instanceof C24027b) {
                        gVar.f69109j = C24037b.MESSAGE;
                    } else if (e2 instanceof C24033e) {
                        gVar.f69109j = C24037b.ENUM;
                    } else {
                        String e3 = gVar.f69104e.mo38132e();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(e3).length() + 17);
                        sb5.append('\"');
                        sb5.append(e3);
                        sb5.append("\" is not a type.");
                        throw new C24032d(gVar, sb5.toString());
                    }
                }
                C24036a aVar = gVar.f69109j.f69132d;
                if (aVar == C24036a.MESSAGE) {
                    if (e2 instanceof C24027b) {
                        gVar.f69111o = (C24027b) e2;
                        if (gVar.f69104e.mo38133f()) {
                            throw new C24032d(gVar, "Messages can't have default values.");
                        }
                    } else {
                        String e4 = gVar.f69104e.mo38132e();
                        StringBuilder sb6 = new StringBuilder(String.valueOf(e4).length() + 25);
                        sb6.append('\"');
                        sb6.append(e4);
                        sb6.append("\" is not a message type.");
                        throw new C24032d(gVar, sb6.toString());
                    }
                } else if (aVar != C24036a.ENUM) {
                    throw new C24032d(gVar, "Field with primitive type has type_name.");
                } else if (e2 instanceof C24033e) {
                    gVar.f69113q = (C24033e) e2;
                } else {
                    String e5 = gVar.f69104e.mo38132e();
                    StringBuilder sb7 = new StringBuilder(String.valueOf(e5).length() + 23);
                    sb7.append('\"');
                    sb7.append(e5);
                    sb7.append("\" is not an enum type.");
                    throw new C24032d(gVar, sb7.toString());
                }
            } else {
                C24036a aVar2 = gVar.f69109j.f69132d;
                if (aVar2 == C24036a.MESSAGE || aVar2 == C24036a.ENUM) {
                    throw new C24032d(gVar, "Field with message or enum type missing type_name.");
                }
            }
            if (!gVar.f69104e.mo38131d().f68792g || gVar.mo38342k()) {
                boolean z = true;
                if (gVar.f69104e.mo38133f()) {
                    if (!gVar.mo37662E0()) {
                        try {
                            switch (gVar.f69109j.ordinal()) {
                                case 0:
                                    if (!gVar.f69104e.mo38128a().equals("inf")) {
                                        if (!gVar.f69104e.mo38128a().equals("-inf")) {
                                            if (!gVar.f69104e.mo38128a().equals("nan")) {
                                                gVar.f69114r = Double.valueOf(gVar.f69104e.mo38128a());
                                                break;
                                            } else {
                                                gVar.f69114r = Double.valueOf(Double.NaN);
                                                break;
                                            }
                                        } else {
                                            gVar.f69114r = Double.valueOf(Double.NEGATIVE_INFINITY);
                                            break;
                                        }
                                    } else {
                                        gVar.f69114r = Double.valueOf(Double.POSITIVE_INFINITY);
                                        break;
                                    }
                                case 1:
                                    if (!gVar.f69104e.mo38128a().equals("inf")) {
                                        if (!gVar.f69104e.mo38128a().equals("-inf")) {
                                            if (!gVar.f69104e.mo38128a().equals("nan")) {
                                                gVar.f69114r = Float.valueOf(gVar.f69104e.mo38128a());
                                                break;
                                            } else {
                                                gVar.f69114r = Float.valueOf(Float.NaN);
                                                break;
                                            }
                                        } else {
                                            gVar.f69114r = Float.valueOf(Float.NEGATIVE_INFINITY);
                                            break;
                                        }
                                    } else {
                                        gVar.f69114r = Float.valueOf(Float.POSITIVE_INFINITY);
                                        break;
                                    }
                                case 2:
                                case 15:
                                case 17:
                                    gVar.f69114r = Long.valueOf(C17003m2.m16823b(gVar.f69104e.mo38128a(), true, true));
                                    break;
                                case 3:
                                case 5:
                                    gVar.f69114r = Long.valueOf(C17003m2.m16823b(gVar.f69104e.mo38128a(), false, true));
                                    break;
                                case 4:
                                case 14:
                                case 16:
                                    gVar.f69114r = Integer.valueOf((int) C17003m2.m16823b(gVar.f69104e.mo38128a(), true, false));
                                    break;
                                case 6:
                                case 12:
                                    gVar.f69114r = Integer.valueOf((int) C17003m2.m16823b(gVar.f69104e.mo38128a(), false, false));
                                    break;
                                case 7:
                                    gVar.f69114r = Boolean.valueOf(gVar.f69104e.mo38128a());
                                    break;
                                case 8:
                                    gVar.f69114r = gVar.f69104e.mo38128a();
                                    break;
                                case 9:
                                case 10:
                                    throw new C24032d(gVar, "Message type had default value.");
                                case 11:
                                    gVar.f69114r = C17003m2.m16824c(gVar.f69104e.mo38128a());
                                    break;
                                case 13:
                                    C24034f e6 = gVar.f69113q.mo38331e(gVar.f69104e.mo38128a());
                                    gVar.f69114r = e6;
                                    if (e6 != null) {
                                        break;
                                    } else {
                                        String a = gVar.f69104e.mo38128a();
                                        StringBuilder sb8 = new StringBuilder(String.valueOf(a).length() + 30);
                                        sb8.append("Unknown enum default value: \"");
                                        sb8.append(a);
                                        sb8.append('\"');
                                        throw new C24032d(gVar, sb8.toString());
                                    }
                            }
                        } catch (C17003m2.C17005b e7) {
                            String valueOf = String.valueOf(e7.getMessage());
                            C24032d dVar = new C24032d(gVar, valueOf.length() != 0 ? "Couldn't parse default value: ".concat(valueOf) : new String("Couldn't parse default value: "));
                            dVar.initCause(e7);
                            throw dVar;
                        } catch (NumberFormatException e8) {
                            String a2 = gVar.f69104e.mo38128a();
                            StringBuilder sb9 = new StringBuilder(String.valueOf(a2).length() + 33);
                            sb9.append("Could not parse default value: \"");
                            sb9.append(a2);
                            sb9.append('\"');
                            C24032d dVar2 = new C24032d(gVar, sb9.toString());
                            dVar2.initCause(e8);
                            throw dVar2;
                        }
                    } else {
                        throw new C24032d(gVar, "Repeated fields cannot have default values.");
                    }
                } else if (gVar.mo37662E0()) {
                    gVar.f69114r = Collections.emptyList();
                } else {
                    int ordinal = gVar.f69109j.f69132d.ordinal();
                    if (ordinal == 7) {
                        gVar.f69114r = gVar.f69113q.mo38334h().get(0);
                    } else if (ordinal != 8) {
                        gVar.f69114r = gVar.f69109j.f69132d.f69125d;
                    } else {
                        gVar.f69114r = null;
                    }
                }
                if (!gVar.mo38340i()) {
                    C24028c cVar2 = gVar.f69106g.f69139j;
                    cVar2.getClass();
                    C24028c.C24029a aVar3 = new C24028c.C24029a(gVar.f69110n, gVar.f69104e.f68739f);
                    C24035g gVar2 = (C24035g) ((HashMap) cVar2.f69080d).put(aVar3, gVar);
                    if (gVar2 != null) {
                        ((HashMap) cVar2.f69080d).put(aVar3, gVar2);
                        int i2 = gVar.f69104e.f68739f;
                        String str2 = gVar.f69110n.f69070e;
                        String name = gVar2.getName();
                        StringBuilder sb10 = new StringBuilder(String.valueOf(str2).length() + 65 + String.valueOf(name).length());
                        sb10.append("Field number ");
                        sb10.append(i2);
                        sb10.append(" has already been used in \"");
                        sb10.append(str2);
                        sb10.append("\" by field \"");
                        sb10.append(name);
                        sb10.append("\".");
                        throw new C24032d(gVar, sb10.toString());
                    }
                }
                C24027b bVar2 = gVar.f69110n;
                if (bVar2 != null && bVar2.mo38322k().f68909f) {
                    if (gVar.mo38340i()) {
                        C23938s.C23967h.C23970c a3 = C23938s.C23967h.C23970c.m29635a(gVar.f69104e.f68740g);
                        if (a3 == null) {
                            a3 = C23938s.C23967h.C23970c.LABEL_OPTIONAL;
                        }
                        if (a3 != C23938s.C23967h.C23970c.LABEL_OPTIONAL) {
                            z = false;
                        }
                        if (!z || gVar.f69109j != C24037b.MESSAGE) {
                            throw new C24032d(gVar, "Extensions of MessageSets must be optional messages.");
                        }
                        return;
                    }
                    throw new C24032d(gVar, "MessageSets cannot have fields, only extensions.");
                }
                return;
            }
            throw new C24032d(gVar, "[packed = true] can only be specified for repeated primitive fields.");
        }

        /* renamed from: E0 */
        public boolean mo37662E0() {
            C23938s.C23967h.C23970c a = C23938s.C23967h.C23970c.m29635a(this.f69104e.f68740g);
            if (a == null) {
                a = C23938s.C23967h.C23970c.LABEL_OPTIONAL;
            }
            return a == C23938s.C23967h.C23970c.LABEL_REPEATED;
        }

        /* renamed from: O */
        public C24087z2.C24089b mo37663O() {
            return f69102s[this.f69109j.ordinal()];
        }

        /* renamed from: Q */
        public C24087z2.C24094c mo37664Q() {
            return mo37663O().f69233d;
        }

        /* renamed from: S1 */
        public C23845j1.C23846a mo37665S1(C23845j1.C23846a aVar, C23845j1 j1Var) {
            return ((C23836g1.C23837a) aVar).mergeFrom((C23836g1) j1Var);
        }

        /* renamed from: T0 */
        public boolean mo37666T0() {
            if (!mo38342k()) {
                return false;
            }
            return this.f69106g.mo38348h() == C24038h.C24039a.PROTO2 ? this.f69104e.mo38131d().f68792g : !this.f69104e.mo38131d().mo38148f() || this.f69104e.mo38131d().f68792g;
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69106g;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69105f;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69104e;
        }

        public int compareTo(Object obj) {
            C24035g gVar = (C24035g) obj;
            if (gVar.f69110n == this.f69110n) {
                return this.f69104e.f68739f - gVar.f69104e.f68739f;
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        /* renamed from: f */
        public Object mo38337f() {
            if (this.f69109j.f69132d != C24036a.MESSAGE) {
                return this.f69114r;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        /* renamed from: g */
        public C24033e mo38338g() {
            if (this.f69109j.f69132d == C24036a.ENUM) {
                return this.f69113q;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", new Object[]{this.f69105f}));
        }

        public String getName() {
            return this.f69104e.getName();
        }

        public int getNumber() {
            return this.f69104e.f68739f;
        }

        /* renamed from: h */
        public C24027b mo38339h() {
            if (this.f69109j.f69132d == C24036a.MESSAGE) {
                return this.f69111o;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", new Object[]{this.f69105f}));
        }

        /* renamed from: i */
        public boolean mo38340i() {
            return this.f69104e.mo38134g();
        }

        /* renamed from: j */
        public boolean mo38341j() {
            return this.f69109j == C24037b.MESSAGE && mo37662E0() && mo38339h().mo38322k().f68912i;
        }

        /* renamed from: k */
        public boolean mo38342k() {
            return mo37662E0() && mo37663O().mo38437a();
        }

        /* renamed from: l */
        public boolean mo38343l() {
            C23938s.C23967h.C23970c a = C23938s.C23967h.C23970c.m29635a(this.f69104e.f68740g);
            if (a == null) {
                a = C23938s.C23967h.C23970c.LABEL_OPTIONAL;
            }
            return a == C23938s.C23967h.C23970c.LABEL_REQUIRED;
        }

        /* renamed from: m */
        public boolean mo38344m() {
            if (this.f69109j != C24037b.STRING) {
                return false;
            }
            if (!this.f69110n.mo38322k().f68912i && this.f69106g.mo38348h() != C24038h.C24039a.PROTO3) {
                return this.f69106g.f69133d.mo38156a().f68864j;
            }
            return true;
        }

        public String toString() {
            return this.f69105f;
        }
    }

    /* renamed from: com.google.protobuf.t$i */
    public static abstract class C24040i {
        /* renamed from: a */
        public abstract C24038h mo38312a();

        /* renamed from: b */
        public abstract String mo38313b();

        /* renamed from: c */
        public abstract C23836g1 mo38314c();

        public abstract String getName();
    }

    /* renamed from: com.google.protobuf.t$j */
    public static final class C24041j extends C24040i {

        /* renamed from: d */
        public C23938s.C23987m f69143d;

        /* renamed from: e */
        public final String f69144e;

        /* renamed from: f */
        public final C24038h f69145f;

        public C24041j(C23938s.C23987m mVar, C24038h hVar, C24043l lVar, int i, C24026a aVar) {
            this.f69143d = mVar;
            this.f69145f = hVar;
            String str = lVar.f69154e;
            String name = mVar.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
            sb.append(str);
            sb.append('.');
            sb.append(name);
            this.f69144e = sb.toString();
            hVar.f69139j.mo38325b(this);
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69145f;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69144e;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69143d;
        }

        public String getName() {
            return this.f69143d.getName();
        }
    }

    /* renamed from: com.google.protobuf.t$k */
    public static final class C24042k extends C24040i {

        /* renamed from: d */
        public final int f69146d;

        /* renamed from: e */
        public C23938s.C23994o f69147e;

        /* renamed from: f */
        public final String f69148f;

        /* renamed from: g */
        public final C24038h f69149g;

        /* renamed from: h */
        public C24027b f69150h;

        /* renamed from: i */
        public int f69151i = 0;

        /* renamed from: j */
        public C24035g[] f69152j;

        public C24042k(C23938s.C23994o oVar, C24038h hVar, C24027b bVar, int i, C24026a aVar) {
            this.f69147e = oVar;
            this.f69148f = C24025t.m29824a(hVar, bVar, oVar.getName());
            this.f69149g = hVar;
            this.f69146d = i;
            this.f69150h = bVar;
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69149g;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69148f;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69147e;
        }

        public String getName() {
            return this.f69147e.getName();
        }
    }

    /* renamed from: com.google.protobuf.t$l */
    public static final class C24043l extends C24040i {

        /* renamed from: d */
        public C23938s.C24000q f69153d;

        /* renamed from: e */
        public final String f69154e;

        /* renamed from: f */
        public final C24038h f69155f;

        /* renamed from: g */
        public C24041j[] f69156g;

        public C24043l(C23938s.C24000q qVar, C24038h hVar, int i, C24026a aVar) {
            this.f69153d = qVar;
            this.f69154e = C24025t.m29824a(hVar, (C24027b) null, qVar.getName());
            this.f69155f = hVar;
            this.f69156g = new C24041j[qVar.f68978f.size()];
            for (int i2 = 0; i2 < qVar.f68978f.size(); i2++) {
                this.f69156g[i2] = new C24041j(qVar.f68978f.get(i2), hVar, this, i2, (C24026a) null);
            }
            hVar.f69139j.mo38325b(this);
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69155f;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69154e;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69153d;
        }

        public String getName() {
            return this.f69153d.getName();
        }
    }

    /* renamed from: a */
    public static String m29824a(C24038h hVar, C24027b bVar, String str) {
        if (bVar != null) {
            String str2 = bVar.f69070e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('.');
            sb.append(str);
            return sb.toString();
        }
        String b = hVar.f69133d.mo38157b();
        if (b.isEmpty()) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder(b.length() + 1 + String.valueOf(str).length());
        sb4.append(b);
        sb4.append('.');
        sb4.append(str);
        return sb4.toString();
    }

    /* renamed from: com.google.protobuf.t$d */
    public static class C24032d extends Exception {

        /* renamed from: d */
        public final C23836g1 f69091d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C24032d(com.google.protobuf.C24025t.C24040i r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = r4.mo38313b()
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r1 = r1.length()
                int r1 = r1 + 2
                java.lang.String r2 = java.lang.String.valueOf(r5)
                int r2 = r2.length()
                int r1 = r1 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r0)
                java.lang.String r0 = ": "
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r3.<init>(r5)
                r4.mo38313b()
                com.google.protobuf.g1 r4 = r4.mo38314c()
                r3.f69091d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24025t.C24032d.<init>(com.google.protobuf.t$i, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C24032d(com.google.protobuf.C24025t.C24038h r3, java.lang.String r4, com.google.protobuf.C24025t.C24026a r5) {
            /*
                r2 = this;
                java.lang.String r5 = r3.getName()
                java.lang.String r0 = java.lang.String.valueOf(r5)
                int r0 = r0.length()
                int r0 = r0 + 2
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r0 = r0 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                r1.append(r5)
                java.lang.String r5 = ": "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r2.<init>(r4)
                r3.getName()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24025t.C24032d.<init>(com.google.protobuf.t$h, java.lang.String, com.google.protobuf.t$a):void");
        }
    }

    /* renamed from: com.google.protobuf.t$f */
    public static final class C24034f extends C24040i implements C23908o0.C23911c {

        /* renamed from: d */
        public final int f69097d;

        /* renamed from: e */
        public C23938s.C23958e f69098e;

        /* renamed from: f */
        public final String f69099f;

        /* renamed from: g */
        public final C24038h f69100g;

        /* renamed from: h */
        public final C24033e f69101h;

        public C24034f(C23938s.C23958e eVar, C24038h hVar, C24033e eVar2, int i, C24026a aVar) {
            this.f69097d = i;
            this.f69098e = eVar;
            this.f69100g = hVar;
            this.f69101h = eVar2;
            String str = eVar2.f69093e;
            String name = eVar.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
            sb.append(str);
            sb.append('.');
            sb.append(name);
            this.f69099f = sb.toString();
            hVar.f69139j.mo38325b(this);
            C24028c cVar = hVar.f69139j;
            cVar.getClass();
            C24028c.C24029a aVar2 = new C24028c.C24029a(eVar2, this.f69098e.f68710f);
            C24034f fVar = (C24034f) ((HashMap) cVar.f69081e).put(aVar2, this);
            if (fVar != null) {
                ((HashMap) cVar.f69081e).put(aVar2, fVar);
            }
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69100g;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69099f;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69098e;
        }

        public String getName() {
            return this.f69098e.getName();
        }

        public int getNumber() {
            return this.f69098e.f68710f;
        }

        public String toString() {
            return this.f69098e.getName();
        }

        public C24034f(C24038h hVar, C24033e eVar, Integer num, C24026a aVar) {
            String name = eVar.getName();
            String valueOf = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + valueOf.length());
            sb.append("UNKNOWN_ENUM_VALUE_");
            sb.append(name);
            sb.append("_");
            sb.append(valueOf);
            String sb4 = sb.toString();
            C23938s.C23958e.C23960b c = C23938s.C23958e.f68706i.toBuilder();
            sb4.getClass();
            c.f68713d |= 1;
            c.f68714e = sb4;
            c.onChanged();
            int intValue = num.intValue();
            c.f68713d |= 2;
            c.f68715f = intValue;
            c.onChanged();
            C23938s.C23958e a = c.buildPartial();
            if (a.isInitialized()) {
                this.f69097d = -1;
                this.f69098e = a;
                this.f69100g = hVar;
                this.f69101h = eVar;
                String str = eVar.f69093e;
                String name2 = a.getName();
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name2).length());
                sb5.append(str);
                sb5.append('.');
                sb5.append(name2);
                this.f69099f = sb5.toString();
                return;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }
    }

    /* renamed from: com.google.protobuf.t$h */
    public static final class C24038h extends C24040i {

        /* renamed from: d */
        public C23938s.C23977j f69133d;

        /* renamed from: e */
        public final C24027b[] f69134e;

        /* renamed from: f */
        public final C24033e[] f69135f;

        /* renamed from: g */
        public final C24043l[] f69136g;

        /* renamed from: h */
        public final C24035g[] f69137h;

        /* renamed from: i */
        public final C24038h[] f69138i;

        /* renamed from: j */
        public final C24028c f69139j;

        /* renamed from: com.google.protobuf.t$h$a */
        public enum C24039a {
            PROTO2("proto2"),
            PROTO3("proto3");

            /* access modifiers changed from: public */
            C24039a(String str) {
            }
        }

        public C24038h(C23938s.C23977j jVar, C24038h[] hVarArr, C24028c cVar, boolean z) {
            C23938s.C23977j jVar2 = jVar;
            C24028c cVar2 = cVar;
            this.f69139j = cVar2;
            this.f69133d = jVar2;
            hVarArr.clone();
            HashMap hashMap = new HashMap();
            for (C24038h hVar : hVarArr) {
                hashMap.put(hVar.getName(), hVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                C23908o0.C23915g gVar = jVar2.f68824h;
                if (i < ((C23901n0) gVar).f68498f) {
                    int k = ((C23901n0) gVar).mo37936k(i);
                    if (k >= 0 && k < jVar2.f68823g.size()) {
                        String str = (String) jVar2.f68823g.get(k);
                        C24038h hVar2 = (C24038h) hashMap.get(str);
                        if (hVar2 != null) {
                            arrayList.add(hVar2);
                        } else if (!z) {
                            String valueOf = String.valueOf(str);
                            throw new C24032d(this, valueOf.length() != 0 ? "Invalid public dependency: ".concat(valueOf) : new String("Invalid public dependency: "), (C24026a) null);
                        }
                        i++;
                    }
                } else {
                    C24038h[] hVarArr2 = new C24038h[arrayList.size()];
                    this.f69138i = hVarArr2;
                    arrayList.toArray(hVarArr2);
                    cVar2.mo38324a(this.f69133d.mo38157b(), this);
                    this.f69134e = new C24027b[jVar2.f68826j.size()];
                    for (int i2 = 0; i2 < jVar2.f68826j.size(); i2++) {
                        this.f69134e[i2] = new C24027b(jVar2.f68826j.get(i2), this, (C24027b) null, i2);
                    }
                    this.f69135f = new C24033e[jVar2.f68827n.size()];
                    for (int i3 = 0; i3 < jVar2.f68827n.size(); i3++) {
                        this.f69135f[i3] = new C24033e(jVar2.f68827n.get(i3), this, (C24027b) null, i3, (C24026a) null);
                    }
                    this.f69136g = new C24043l[jVar2.f68828o.size()];
                    for (int i4 = 0; i4 < jVar2.f68828o.size(); i4++) {
                        this.f69136g[i4] = new C24043l(jVar2.f68828o.get(i4), this, i4, (C24026a) null);
                    }
                    this.f69137h = new C24035g[jVar2.f68829p.size()];
                    for (int i5 = 0; i5 < jVar2.f68829p.size(); i5++) {
                        this.f69137h[i5] = new C24035g(jVar2.f68829p.get(i5), this, (C24027b) null, i5, true, (C24026a) null);
                    }
                    return;
                }
            }
            throw new C24032d(this, "Invalid public dependency index.", (C24026a) null);
        }

        /* renamed from: e */
        public static C24038h m29871e(C23938s.C23977j jVar, C24038h[] hVarArr, boolean z) {
            C24038h hVar = new C24038h(jVar, hVarArr, new C24028c(hVarArr, z), z);
            for (C24027b e : hVar.f69134e) {
                e.mo38315e();
            }
            for (C24043l lVar : hVar.f69136g) {
                C24041j[] jVarArr = lVar.f69156g;
                int length = jVarArr.length;
                int i = 0;
                while (i < length) {
                    C24041j jVar2 = jVarArr[i];
                    C24028c cVar = jVar2.f69145f.f69139j;
                    String a = jVar2.f69143d.mo38202a();
                    C24028c.C24031c cVar2 = C24028c.C24031c.TYPES_ONLY;
                    C24040i e2 = cVar.mo38328e(a, jVar2, cVar2);
                    if (e2 instanceof C24027b) {
                        C24027b bVar = (C24027b) e2;
                        C24040i e3 = jVar2.f69145f.f69139j.mo38328e(jVar2.f69143d.mo38204c(), jVar2, cVar2);
                        if (e3 instanceof C24027b) {
                            C24027b bVar2 = (C24027b) e3;
                            i++;
                        } else {
                            String c = jVar2.f69143d.mo38204c();
                            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 25);
                            sb.append('\"');
                            sb.append(c);
                            sb.append("\" is not a message type.");
                            throw new C24032d(jVar2, sb.toString());
                        }
                    } else {
                        String a2 = jVar2.f69143d.mo38202a();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(a2).length() + 25);
                        sb4.append('\"');
                        sb4.append(a2);
                        sb4.append("\" is not a message type.");
                        throw new C24032d(jVar2, sb4.toString());
                    }
                }
            }
            for (C24035g e4 : hVar.f69137h) {
                C24035g.m29854e(e4);
            }
            return hVar;
        }

        /* renamed from: i */
        public static C24038h m29872i(String[] strArr, C24038h[] hVarArr) {
            byte[] bArr;
            if (strArr.length == 1) {
                bArr = strArr[0].getBytes(C23908o0.f68506b);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String append : strArr) {
                    sb.append(append);
                }
                bArr = sb.toString().getBytes(C23908o0.f68506b);
            }
            try {
                C23938s.C23977j parseFrom = C23938s.C23977j.f68819v.parseFrom(bArr);
                try {
                    return m29871e(parseFrom, hVarArr, true);
                } catch (C24032d e) {
                    String name = parseFrom.getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 35);
                    sb4.append("Invalid embedded descriptor for \"");
                    sb4.append(name);
                    sb4.append("\".");
                    throw new IllegalArgumentException(sb4.toString(), e);
                }
            } catch (C23922p0 e2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
            }
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69133d.getName();
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69133d;
        }

        /* renamed from: f */
        public List<C24033e> mo38346f() {
            return Collections.unmodifiableList(Arrays.asList(this.f69135f));
        }

        /* renamed from: g */
        public List<C24027b> mo38347g() {
            return Collections.unmodifiableList(Arrays.asList(this.f69134e));
        }

        public String getName() {
            return this.f69133d.getName();
        }

        /* renamed from: h */
        public C24039a mo38348h() {
            return "proto3".equals(this.f69133d.mo38159d()) ? C24039a.PROTO3 : C24039a.PROTO2;
        }

        public C24038h(String str, C24027b bVar) {
            C24028c cVar = new C24028c(new C24038h[0], true);
            this.f69139j = cVar;
            C23938s.C23977j.C23979b f = C23938s.C23977j.f68818u.toBuilder();
            String concat = String.valueOf(bVar.f69070e).concat(".placeholder.proto");
            concat.getClass();
            f.f68834d |= 1;
            f.f68835e = concat;
            f.onChanged();
            str.getClass();
            f.f68834d |= 2;
            f.f68836f = str;
            f.onChanged();
            C23938s.C23940b bVar2 = bVar.f69069d;
            C23821e2<C23938s.C23940b, C23938s.C23940b.C23942b, Object> e2Var = f.f68841n;
            if (e2Var == null) {
                bVar2.getClass();
                if ((f.f68834d & 32) == 0) {
                    f.f68840j = new ArrayList(f.f68840j);
                    f.f68834d |= 32;
                }
                f.f68840j.add(bVar2);
                f.onChanged();
            } else {
                e2Var.mo37582f(bVar2);
            }
            C23938s.C23977j a = f.buildPartial();
            if (a.isInitialized()) {
                this.f69133d = a;
                this.f69138i = new C24038h[0];
                this.f69134e = new C24027b[]{bVar};
                this.f69135f = new C24033e[0];
                this.f69136g = new C24043l[0];
                this.f69137h = new C24035g[0];
                cVar.mo38324a(str, this);
                cVar.mo38325b(bVar);
                return;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }
    }

    /* renamed from: com.google.protobuf.t$b */
    public static final class C24027b extends C24040i {

        /* renamed from: d */
        public C23938s.C23940b f69069d;

        /* renamed from: e */
        public final String f69070e;

        /* renamed from: f */
        public final C24038h f69071f;

        /* renamed from: g */
        public final C24027b[] f69072g;

        /* renamed from: h */
        public final C24033e[] f69073h;

        /* renamed from: i */
        public final C24035g[] f69074i;

        /* renamed from: j */
        public final C24035g[] f69075j;

        /* renamed from: n */
        public final C24042k[] f69076n;

        public C24027b(C23938s.C23940b bVar, C24038h hVar, C24027b bVar2, int i) {
            this.f69069d = bVar;
            this.f69070e = C24025t.m29824a(hVar, bVar2, bVar.getName());
            this.f69071f = hVar;
            this.f69076n = new C24042k[bVar.mo38046a()];
            for (int i2 = 0; i2 < bVar.mo38046a(); i2++) {
                this.f69076n[i2] = new C24042k(bVar.f68622n.get(i2), hVar, this, i2, (C24026a) null);
            }
            this.f69072g = new C24027b[bVar.f68619h.size()];
            for (int i3 = 0; i3 < bVar.f68619h.size(); i3++) {
                this.f69072g[i3] = new C24027b(bVar.f68619h.get(i3), hVar, this, i3);
            }
            this.f69073h = new C24033e[bVar.f68620i.size()];
            for (int i4 = 0; i4 < bVar.f68620i.size(); i4++) {
                this.f69073h[i4] = new C24033e(bVar.f68620i.get(i4), hVar, this, i4, (C24026a) null);
            }
            this.f69074i = new C24035g[bVar.f68617f.size()];
            for (int i5 = 0; i5 < bVar.f68617f.size(); i5++) {
                this.f69074i[i5] = new C24035g(bVar.f68617f.get(i5), hVar, this, i5, false, (C24026a) null);
            }
            this.f69075j = new C24035g[bVar.f68618g.size()];
            for (int i6 = 0; i6 < bVar.f68618g.size(); i6++) {
                this.f69075j[i6] = new C24035g(bVar.f68618g.get(i6), hVar, this, i6, true, (C24026a) null);
            }
            for (int i7 = 0; i7 < bVar.mo38046a(); i7++) {
                C24042k kVar = this.f69076n[i7];
                kVar.f69152j = new C24035g[kVar.f69151i];
                kVar.f69151i = 0;
            }
            for (int i8 = 0; i8 < bVar.f68617f.size(); i8++) {
                C24035g gVar = this.f69074i[i8];
                C24042k kVar2 = gVar.f69112p;
                if (kVar2 != null) {
                    C24035g[] gVarArr = kVar2.f69152j;
                    int i9 = kVar2.f69151i;
                    kVar2.f69151i = i9 + 1;
                    gVarArr[i9] = gVar;
                }
            }
            int i15 = 0;
            for (C24042k kVar3 : this.f69076n) {
                C24035g[] gVarArr2 = kVar3.f69152j;
                boolean z = true;
                if ((gVarArr2.length != 1 || !gVarArr2[0].f69108i) ? false : z) {
                    i15++;
                } else if (i15 > 0) {
                    throw new C24032d(this, "Synthetic oneofs must come last.");
                }
            }
            int length = this.f69076n.length;
            hVar.f69139j.mo38325b(this);
        }

        /* renamed from: a */
        public C24038h mo38312a() {
            return this.f69071f;
        }

        /* renamed from: b */
        public String mo38313b() {
            return this.f69070e;
        }

        /* renamed from: c */
        public C23836g1 mo38314c() {
            return this.f69069d;
        }

        /* renamed from: e */
        public final void mo38315e() {
            for (C24027b e : this.f69072g) {
                e.mo38315e();
            }
            for (C24035g e2 : this.f69074i) {
                C24035g.m29854e(e2);
            }
            for (C24035g e3 : this.f69075j) {
                C24035g.m29854e(e3);
            }
        }

        /* renamed from: f */
        public C24035g mo38316f(String str) {
            C24028c cVar = this.f69071f.f69139j;
            String str2 = this.f69070e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('.');
            sb.append(str);
            C24040i c = cVar.mo38326c(sb.toString(), C24028c.C24031c.ALL_SYMBOLS);
            if (c == null || !(c instanceof C24035g)) {
                return null;
            }
            return (C24035g) c;
        }

        /* renamed from: g */
        public C24035g mo38317g(int i) {
            return (C24035g) ((HashMap) this.f69071f.f69139j.f69080d).get(new C24028c.C24029a(this, i));
        }

        public String getName() {
            return this.f69069d.getName();
        }

        /* renamed from: h */
        public List<C24035g> mo38319h() {
            return Collections.unmodifiableList(Arrays.asList(this.f69074i));
        }

        /* renamed from: i */
        public List<C24027b> mo38320i() {
            return Collections.unmodifiableList(Arrays.asList(this.f69072g));
        }

        /* renamed from: j */
        public List<C24042k> mo38321j() {
            return Collections.unmodifiableList(Arrays.asList(this.f69076n));
        }

        /* renamed from: k */
        public C23938s.C23984l mo38322k() {
            return this.f69069d.mo38047b();
        }

        /* renamed from: l */
        public boolean mo38323l(int i) {
            for (C23938s.C23940b.C23943c next : this.f69069d.f68621j) {
                if (next.f68649e <= i && i < next.f68650f) {
                    return true;
                }
            }
            return false;
        }

        public C24027b(String str) {
            String str2;
            String str3;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str2 = str.substring(lastIndexOf + 1);
                str3 = str.substring(0, lastIndexOf);
            } else {
                str3 = "";
                str2 = str;
            }
            C23938s.C23940b.C23942b d = C23938s.C23940b.f68613s.toBuilder();
            str2.getClass();
            d.f68627d |= 1;
            d.f68628e = str2;
            d.onChanged();
            C23938s.C23940b.C23943c.C23945b c = C23938s.C23940b.C23943c.f68646i.toBuilder();
            c.f68653d |= 1;
            c.f68654e = 1;
            c.onChanged();
            c.f68653d |= 2;
            c.f68655f = 536870912;
            c.onChanged();
            C23938s.C23940b.C23943c a = c.buildPartial();
            if (a.isInitialized()) {
                C23821e2<C23938s.C23940b.C23943c, C23938s.C23940b.C23943c.C23945b, Object> e2Var = d.f68638r;
                if (e2Var == null) {
                    if ((d.f68627d & 32) == 0) {
                        d.f68637q = new ArrayList(d.f68637q);
                        d.f68627d |= 32;
                    }
                    d.f68637q.add(a);
                    d.onChanged();
                } else {
                    e2Var.mo37582f(a);
                }
                C23938s.C23940b a2 = d.buildPartial();
                if (a2.isInitialized()) {
                    this.f69069d = a2;
                    this.f69070e = str;
                    this.f69072g = new C24027b[0];
                    this.f69073h = new C24033e[0];
                    this.f69074i = new C24035g[0];
                    this.f69075j = new C24035g[0];
                    this.f69076n = new C24042k[0];
                    this.f69071f = new C24038h(str3, this);
                    return;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a2);
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }
    }
}
