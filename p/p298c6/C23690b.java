package p298c6;

import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p298c6.C23713g;
import p298c6.C23793j;

/* renamed from: c6.b */
public class C23690b {

    /* renamed from: a */
    public boolean f67880a = false;

    /* renamed from: c6.b$c */
    public enum C16849c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: c6.b$j */
    public enum C16850j {
        nth_child,
        nth_of_type,
        nth_last_of_type,
        UNSUPPORTED;
        

        /* renamed from: h */
        public static final Map<String, C16850j> f45536h = null;

        /* access modifiers changed from: public */
        static {
            f45536h = new HashMap();
            for (C16850j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    ((HashMap) f45536h).put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }
    }

    /* renamed from: c6.b$p */
    public static class C16851p {

        /* renamed from: a */
        public C16853s f45538a;

        /* renamed from: b */
        public C23713g.C23727e0 f45539b;

        /* renamed from: c */
        public C16854u f45540c;

        public C16851p(C16853s sVar, C23713g.C23727e0 e0Var, C16854u uVar) {
            this.f45538a = sVar;
            this.f45539b = e0Var;
            this.f45540c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f45538a) + " {...} (src=" + this.f45540c + ")";
        }
    }

    /* renamed from: c6.b$r */
    public static class C16852r {

        /* renamed from: a */
        public List<C16851p> f45541a = null;

        /* renamed from: a */
        public void mo17903a(C16851p pVar) {
            if (this.f45541a == null) {
                this.f45541a = new ArrayList();
            }
            for (int i = 0; i < this.f45541a.size(); i++) {
                if (this.f45541a.get(i).f45538a.f45543b > pVar.f45538a.f45543b) {
                    this.f45541a.add(i, pVar);
                    return;
                }
            }
            this.f45541a.add(pVar);
        }

        /* renamed from: b */
        public void mo17904b(C16852r rVar) {
            if (rVar.f45541a != null) {
                if (this.f45541a == null) {
                    this.f45541a = new ArrayList(rVar.f45541a.size());
                }
                for (C16851p a : rVar.f45541a) {
                    mo17903a(a);
                }
            }
        }

        public String toString() {
            if (this.f45541a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (C16851p pVar : this.f45541a) {
                sb.append(pVar.toString());
                sb.append(10);
            }
            return sb.toString();
        }
    }

    /* renamed from: c6.b$s */
    public static class C16853s {

        /* renamed from: a */
        public List<C23706t> f45542a = null;

        /* renamed from: b */
        public int f45543b = 0;

        /* renamed from: a */
        public void mo17906a() {
            this.f45543b += 1000;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (C23706t append : this.f45542a) {
                sb.append(append);
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f45543b);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: c6.b$u */
    public enum C16854u {
        Document,
        RenderOptions
    }

    /* renamed from: c6.b$b */
    public static class C23692b {

        /* renamed from: a */
        public final String f67881a;

        /* renamed from: b */
        public final C16849c f67882b;

        /* renamed from: c */
        public final String f67883c;

        public C23692b(String str, C16849c cVar, String str2) {
            this.f67881a = str;
            this.f67882b = cVar;
            this.f67883c = str2;
        }
    }

    /* renamed from: c6.b$d */
    public static class C23693d extends C23793j.C23797i {

        /* renamed from: c6.b$d$a */
        public static class C23694a {

            /* renamed from: a */
            public int f67884a;

            /* renamed from: b */
            public int f67885b;

            public C23694a(int i, int i2) {
                this.f67884a = i;
                this.f67885b = i2;
            }
        }

        public C23693d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: r */
        public final int mo37241r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            r2 = mo37387h().intValue();
         */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo37242s() {
            /*
                r8 = this;
                boolean r0 = r8.mo37385f()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = r8.f68198a
                int r2 = r8.f68199b
                char r0 = r0.charAt(r2)
                r2 = 39
                if (r0 == r2) goto L_0x0019
                r2 = 34
                if (r0 == r2) goto L_0x0019
                return r1
            L_0x0019:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r8.f68199b
                r3 = 1
                int r2 = r2 + r3
                r8.f68199b = r2
                java.lang.Integer r2 = r8.mo37387h()
                int r2 = r2.intValue()
            L_0x002c:
                r4 = -1
                if (r2 == r4) goto L_0x0087
                if (r2 == r0) goto L_0x0087
                r5 = 92
                if (r2 != r5) goto L_0x007a
                java.lang.Integer r2 = r8.mo37387h()
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0040
                goto L_0x002c
            L_0x0040:
                r5 = 10
                if (r2 == r5) goto L_0x0071
                r5 = 13
                if (r2 == r5) goto L_0x0071
                r5 = 12
                if (r2 != r5) goto L_0x004d
                goto L_0x0071
            L_0x004d:
                int r5 = r8.mo37241r(r2)
                if (r5 == r4) goto L_0x007a
                r6 = 1
            L_0x0054:
                r7 = 5
                if (r6 > r7) goto L_0x006c
                java.lang.Integer r2 = r8.mo37387h()
                int r2 = r2.intValue()
                int r7 = r8.mo37241r(r2)
                if (r7 != r4) goto L_0x0066
                goto L_0x006c
            L_0x0066:
                int r5 = r5 * 16
                int r5 = r5 + r7
                int r6 = r6 + 1
                goto L_0x0054
            L_0x006c:
                char r4 = (char) r5
                r1.append(r4)
                goto L_0x002c
            L_0x0071:
                java.lang.Integer r2 = r8.mo37387h()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x007a:
                char r2 = (char) r2
                r1.append(r2)
                java.lang.Integer r2 = r8.mo37387h()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x0087:
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p298c6.C23690b.C23693d.mo37242s():java.lang.String");
        }

        /* renamed from: t */
        public String mo37243t() {
            int i;
            int i2;
            if (mo37385f()) {
                i = this.f68199b;
            } else {
                int i3 = this.f68199b;
                int charAt = this.f68198a.charAt(i3);
                if (charAt == 45) {
                    charAt = mo37380a();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i2 = i3;
                } else {
                    int a = mo37380a();
                    while (true) {
                        if ((a < 65 || a > 90) && ((a < 97 || a > 122) && !((a >= 48 && a <= 57) || a == 45 || a == 95))) {
                            break;
                        }
                        a = mo37380a();
                    }
                    i2 = this.f68199b;
                }
                this.f68199b = i3;
                i = i2;
            }
            int i4 = this.f68199b;
            if (i == i4) {
                return null;
            }
            String substring = this.f68198a.substring(i4, i);
            this.f68199b = i;
            return substring;
        }

        /* renamed from: u */
        public String mo37244u() {
            if (mo37385f()) {
                return null;
            }
            int i = this.f68199b;
            int charAt = this.f68198a.charAt(i);
            int i2 = i;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33) {
                if (charAt == 10 || charAt == 13) {
                    break;
                }
                if (!mo37386g(charAt)) {
                    i2 = this.f68199b + 1;
                }
                charAt = mo37380a();
            }
            if (this.f68199b > i) {
                return this.f68198a.substring(i, i2);
            }
            this.f68199b = i;
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: c6.b$o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: c6.b$n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: c6.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: c6.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: c6.b$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: c6.b$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: c6.b$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: c6.b$h} */
        /* JADX WARNING: type inference failed for: r10v2 */
        /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.String, c6.b$a] */
        /* JADX WARNING: type inference failed for: r9v23, types: [c6.b$m] */
        /* JADX WARNING: type inference failed for: r9v24, types: [c6.b$m] */
        /* JADX WARNING: type inference failed for: r9v25, types: [c6.b$i] */
        /* JADX WARNING: type inference failed for: r9v26, types: [c6.b$k] */
        /* JADX WARNING: type inference failed for: r9v31, types: [c6.b$l] */
        /* JADX WARNING: type inference failed for: r9v33, types: [c6.b$l] */
        /* JADX WARNING: type inference failed for: r10v14 */
        /* JADX WARNING: type inference failed for: r10v18, types: [c6.b$t] */
        /* JADX WARNING: type inference failed for: r2v36 */
        /* JADX WARNING: type inference failed for: r2v46 */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0300, code lost:
            r17 = r8;
            r2 = r2;
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x044f, code lost:
            if (r10.f67905d != null) goto L_0x0458;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0451, code lost:
            r10.f67905d = new java.util.ArrayList();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0458, code lost:
            ((java.util.ArrayList) r10.f67905d).add(r9);
            r8 = r17;
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x0077, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0405  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x040a  */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x0470  */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x0484  */
        /* JADX WARNING: Removed duplicated region for block: B:246:0x0489  */
        /* JADX WARNING: Removed duplicated region for block: B:254:0x04a9  */
        /* JADX WARNING: Removed duplicated region for block: B:255:0x04ab  */
        /* JADX WARNING: Removed duplicated region for block: B:257:0x04ae  */
        /* JADX WARNING: Removed duplicated region for block: B:259:0x0422 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x0276 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:262:0x049c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<p298c6.C23690b.C16853s> mo37245v() {
            /*
                r30 = this;
                r0 = r30
                boolean r1 = r30.mo37385f()
                r2 = 0
                if (r1 == 0) goto L_0x000a
                return r2
            L_0x000a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 1
                r1.<init>(r3)
                c6.b$s r4 = new c6.b$s
                r4.<init>()
            L_0x0015:
                boolean r5 = r30.mo37385f()
                if (r5 != 0) goto L_0x049c
                c6.b$c r5 = p298c6.C23690b.C16849c.EQUALS
                boolean r7 = r30.mo37385f()
                if (r7 == 0) goto L_0x0025
                goto L_0x0486
            L_0x0025:
                int r7 = r0.f68199b
                java.util.List<c6.b$t> r8 = r4.f45542a
                if (r8 == 0) goto L_0x0036
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0034
                goto L_0x0036
            L_0x0034:
                r8 = 0
                goto L_0x0037
            L_0x0036:
                r8 = 1
            L_0x0037:
                r9 = 43
                if (r8 != 0) goto L_0x0055
                r8 = 62
                boolean r8 = r0.mo37383d(r8)
                if (r8 == 0) goto L_0x0049
                c6.b$e r8 = p298c6.C23690b.C23695e.CHILD
                r30.mo37396q()
                goto L_0x0056
            L_0x0049:
                boolean r8 = r0.mo37383d(r9)
                if (r8 == 0) goto L_0x0055
                c6.b$e r8 = p298c6.C23690b.C23695e.FOLLOWS
                r30.mo37396q()
                goto L_0x0056
            L_0x0055:
                r8 = r2
            L_0x0056:
                r10 = 42
                boolean r10 = r0.mo37383d(r10)
                if (r10 == 0) goto L_0x0064
                c6.b$t r10 = new c6.b$t
                r10.<init>(r8, r2)
                goto L_0x0077
            L_0x0064:
                java.lang.String r10 = r30.mo37243t()
                if (r10 == 0) goto L_0x0076
                c6.b$t r11 = new c6.b$t
                r11.<init>(r8, r10)
                int r10 = r4.f45543b
                int r10 = r10 + r3
                r4.f45543b = r10
                r10 = r11
                goto L_0x0077
            L_0x0076:
                r10 = r2
            L_0x0077:
                boolean r11 = r30.mo37385f()
                if (r11 != 0) goto L_0x046e
                r11 = 46
                boolean r11 = r0.mo37383d(r11)
                if (r11 == 0) goto L_0x00a3
                if (r10 != 0) goto L_0x008c
                c6.b$t r10 = new c6.b$t
                r10.<init>(r8, r2)
            L_0x008c:
                java.lang.String r11 = r30.mo37243t()
                if (r11 == 0) goto L_0x009b
                java.lang.String r12 = "class"
                r10.mo37254a(r12, r5, r11)
                r4.mo17906a()
                goto L_0x0077
            L_0x009b:
                c6.a r1 = new c6.a
                java.lang.String r2 = "Invalid \".class\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00a3:
                r11 = 35
                boolean r11 = r0.mo37383d(r11)
                if (r11 == 0) goto L_0x00ce
                if (r10 != 0) goto L_0x00b2
                c6.b$t r10 = new c6.b$t
                r10.<init>(r8, r2)
            L_0x00b2:
                java.lang.String r11 = r30.mo37243t()
                if (r11 == 0) goto L_0x00c6
                java.lang.String r12 = "id"
                r10.mo37254a(r12, r5, r11)
                int r11 = r4.f45543b
                r12 = 1000000(0xf4240, float:1.401298E-39)
                int r11 = r11 + r12
                r4.f45543b = r11
                goto L_0x0077
            L_0x00c6:
                c6.a r1 = new c6.a
                java.lang.String r2 = "Invalid \"#id\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00ce:
                r11 = 91
                boolean r11 = r0.mo37383d(r11)
                if (r11 == 0) goto L_0x0151
                if (r10 != 0) goto L_0x00dd
                c6.b$t r10 = new c6.b$t
                r10.<init>(r8, r2)
            L_0x00dd:
                r30.mo37396q()
                java.lang.String r11 = r30.mo37243t()
                java.lang.String r12 = "Invalid attribute simpleSelectors"
                if (r11 == 0) goto L_0x014b
                r30.mo37396q()
                r13 = 61
                boolean r13 = r0.mo37383d(r13)
                if (r13 == 0) goto L_0x00f5
                r13 = r5
                goto L_0x010c
            L_0x00f5:
                java.lang.String r13 = "~="
                boolean r13 = r0.mo37384e(r13)
                if (r13 == 0) goto L_0x0100
                c6.b$c r13 = p298c6.C23690b.C16849c.INCLUDES
                goto L_0x010c
            L_0x0100:
                java.lang.String r13 = "|="
                boolean r13 = r0.mo37384e(r13)
                if (r13 == 0) goto L_0x010b
                c6.b$c r13 = p298c6.C23690b.C16849c.DASHMATCH
                goto L_0x010c
            L_0x010b:
                r13 = r2
            L_0x010c:
                if (r13 == 0) goto L_0x0130
                r30.mo37396q()
                boolean r14 = r30.mo37385f()
                if (r14 == 0) goto L_0x0119
                r14 = r2
                goto L_0x0124
            L_0x0119:
                java.lang.String r14 = r30.mo37390k()
                if (r14 == 0) goto L_0x0120
                goto L_0x0124
            L_0x0120:
                java.lang.String r14 = r30.mo37243t()
            L_0x0124:
                if (r14 == 0) goto L_0x012a
                r30.mo37396q()
                goto L_0x0131
            L_0x012a:
                c6.a r1 = new c6.a
                r1.<init>(r12)
                throw r1
            L_0x0130:
                r14 = r2
            L_0x0131:
                r15 = 93
                boolean r15 = r0.mo37383d(r15)
                if (r15 == 0) goto L_0x0145
                if (r13 != 0) goto L_0x013d
                c6.b$c r13 = p298c6.C23690b.C16849c.EXISTS
            L_0x013d:
                r10.mo37254a(r11, r13, r14)
                r4.mo17906a()
                goto L_0x0077
            L_0x0145:
                c6.a r1 = new c6.a
                r1.<init>(r12)
                throw r1
            L_0x014b:
                c6.a r1 = new c6.a
                r1.<init>(r12)
                throw r1
            L_0x0151:
                r11 = 58
                boolean r11 = r0.mo37383d(r11)
                if (r11 == 0) goto L_0x046e
                if (r10 != 0) goto L_0x0160
                c6.b$t r10 = new c6.b$t
                r10.<init>(r8, r2)
            L_0x0160:
                java.lang.String r11 = r30.mo37243t()
                if (r11 == 0) goto L_0x0466
                java.util.Map<java.lang.String, c6.b$j> r12 = p298c6.C23690b.C16850j.f45536h
                java.util.HashMap r12 = (java.util.HashMap) r12
                java.lang.Object r12 = r12.get(r11)
                c6.b$j r12 = (p298c6.C23690b.C16850j) r12
                if (r12 == 0) goto L_0x0173
                goto L_0x0175
            L_0x0173:
                c6.b$j r12 = p298c6.C23690b.C16850j.UNSUPPORTED
            L_0x0175:
                int r13 = r12.ordinal()
                java.lang.String r14 = "Invalid or missing parameter section for pseudo class: "
                r15 = 40
                r9 = 41
                switch(r13) {
                    case 0: goto L_0x0443;
                    case 1: goto L_0x0437;
                    case 2: goto L_0x0304;
                    case 3: goto L_0x0304;
                    case 4: goto L_0x0304;
                    case 5: goto L_0x0304;
                    case 6: goto L_0x02ec;
                    case 7: goto L_0x02d7;
                    case 8: goto L_0x02c0;
                    case 9: goto L_0x02a9;
                    case 10: goto L_0x029f;
                    case 11: goto L_0x0294;
                    case 12: goto L_0x028b;
                    case 13: goto L_0x01e6;
                    case 14: goto L_0x01a3;
                    case 15: goto L_0x0199;
                    case 16: goto L_0x0199;
                    case 17: goto L_0x0199;
                    case 18: goto L_0x0199;
                    case 19: goto L_0x0199;
                    case 20: goto L_0x0199;
                    case 21: goto L_0x0199;
                    case 22: goto L_0x0199;
                    case 23: goto L_0x0199;
                    default: goto L_0x0182;
                }
            L_0x0182:
                c6.a r1 = new c6.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unsupported pseudo class: "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0199:
                c6.b$l r9 = new c6.b$l
                r9.<init>(r11)
                r4.mo17906a()
                goto L_0x0300
            L_0x01a3:
                boolean r12 = r30.mo37385f()
                if (r12 == 0) goto L_0x01aa
                goto L_0x01dc
            L_0x01aa:
                int r12 = r0.f68199b
                boolean r13 = r0.mo37383d(r15)
                if (r13 != 0) goto L_0x01b3
                goto L_0x01dc
            L_0x01b3:
                r30.mo37396q()
                r13 = r2
            L_0x01b7:
                java.lang.String r14 = r30.mo37243t()
                if (r14 != 0) goto L_0x01c0
                r0.f68199b = r12
                goto L_0x01dc
            L_0x01c0:
                if (r13 != 0) goto L_0x01c7
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
            L_0x01c7:
                r13.add(r14)
                r30.mo37396q()
                boolean r14 = r30.mo37395p()
                if (r14 != 0) goto L_0x01b7
                boolean r9 = r0.mo37383d(r9)
                if (r9 == 0) goto L_0x01da
                goto L_0x01dc
            L_0x01da:
                r0.f68199b = r12
            L_0x01dc:
                c6.b$l r9 = new c6.b$l
                r9.<init>(r11)
                r4.mo17906a()
                goto L_0x0300
            L_0x01e6:
                boolean r12 = r30.mo37385f()
                if (r12 == 0) goto L_0x01ed
                goto L_0x0252
            L_0x01ed:
                int r12 = r0.f68199b
                boolean r13 = r0.mo37383d(r15)
                if (r13 != 0) goto L_0x01f6
                goto L_0x0252
            L_0x01f6:
                r30.mo37396q()
                java.util.List r13 = r30.mo37245v()
                if (r13 != 0) goto L_0x0202
                r0.f68199b = r12
                goto L_0x0252
            L_0x0202:
                boolean r9 = r0.mo37383d(r9)
                if (r9 != 0) goto L_0x020b
                r0.f68199b = r12
                goto L_0x0252
            L_0x020b:
                r9 = r13
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.util.Iterator r9 = r9.iterator()
            L_0x0212:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L_0x0253
                java.lang.Object r12 = r9.next()
                c6.b$s r12 = (p298c6.C23690b.C16853s) r12
                java.util.List<c6.b$t> r12 = r12.f45542a
                if (r12 != 0) goto L_0x0223
                goto L_0x0253
            L_0x0223:
                java.util.ArrayList r12 = (java.util.ArrayList) r12
                java.util.Iterator r12 = r12.iterator()
            L_0x0229:
                boolean r15 = r12.hasNext()
                if (r15 == 0) goto L_0x0212
                java.lang.Object r15 = r12.next()
                c6.b$t r15 = (p298c6.C23690b.C23706t) r15
                java.util.List<c6.b$g> r15 = r15.f67905d
                if (r15 != 0) goto L_0x023a
                goto L_0x0212
            L_0x023a:
                java.util.ArrayList r15 = (java.util.ArrayList) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x0240:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0229
                java.lang.Object r16 = r15.next()
                r6 = r16
                c6.b$g r6 = (p298c6.C23690b.C23697g) r6
                boolean r6 = r6 instanceof p298c6.C23690b.C23700k
                if (r6 == 0) goto L_0x0240
            L_0x0252:
                r13 = r2
            L_0x0253:
                if (r13 == 0) goto L_0x0276
                c6.b$k r9 = new c6.b$k
                r9.<init>(r13)
                java.util.Iterator r6 = r13.iterator()
                r11 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0260:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x0272
                java.lang.Object r12 = r6.next()
                c6.b$s r12 = (p298c6.C23690b.C16853s) r12
                int r12 = r12.f45543b
                if (r12 <= r11) goto L_0x0260
                r11 = r12
                goto L_0x0260
            L_0x0272:
                r4.f45543b = r11
                goto L_0x0300
            L_0x0276:
                c6.a r1 = new c6.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x028b:
                c6.b$i r9 = new c6.b$i
                r9.<init>(r2)
                r4.mo17906a()
                goto L_0x0300
            L_0x0294:
                c6.b$m r9 = new c6.b$m
                java.lang.String r6 = r10.f67903b
                r9.<init>(r3, r6)
                r4.mo17906a()
                goto L_0x0300
            L_0x029f:
                c6.b$m r9 = new c6.b$m
                r6 = 0
                r9.<init>(r6, r2)
                r4.mo17906a()
                goto L_0x0300
            L_0x02a9:
                c6.b$h r9 = new c6.b$h
                r19 = 0
                r20 = 1
                r21 = 0
                r22 = 1
                java.lang.String r6 = r10.f67903b
                r18 = r9
                r23 = r6
                r18.<init>(r19, r20, r21, r22, r23)
                r4.mo17906a()
                goto L_0x0300
            L_0x02c0:
                c6.b$h r9 = new c6.b$h
                r24 = 0
                r25 = 1
                r26 = 1
                r27 = 1
                java.lang.String r6 = r10.f67903b
                r23 = r9
                r28 = r6
                r23.<init>(r24, r25, r26, r27, r28)
                r4.mo17906a()
                goto L_0x0300
            L_0x02d7:
                c6.b$h r9 = new c6.b$h
                r19 = 0
                r20 = 1
                r21 = 0
                r22 = 0
                r23 = 0
                r18 = r9
                r18.<init>(r19, r20, r21, r22, r23)
                r4.mo17906a()
                goto L_0x0300
            L_0x02ec:
                c6.b$h r9 = new c6.b$h
                r25 = 0
                r26 = 1
                r27 = 1
                r28 = 0
                r29 = 0
                r24 = r9
                r24.<init>(r25, r26, r27, r28, r29)
                r4.mo17906a()
            L_0x0300:
                r17 = r8
                goto L_0x044d
            L_0x0304:
                c6.b$j r6 = p298c6.C23690b.C16850j.nth_child
                if (r12 == r6) goto L_0x0310
                c6.b$j r6 = p298c6.C23690b.C16850j.nth_of_type
                if (r12 != r6) goto L_0x030d
                goto L_0x0310
            L_0x030d:
                r21 = 0
                goto L_0x0312
            L_0x0310:
                r21 = 1
            L_0x0312:
                c6.b$j r6 = p298c6.C23690b.C16850j.nth_of_type
                if (r12 == r6) goto L_0x031e
                c6.b$j r6 = p298c6.C23690b.C16850j.nth_last_of_type
                if (r12 != r6) goto L_0x031b
                goto L_0x031e
            L_0x031b:
                r22 = 0
                goto L_0x0320
            L_0x031e:
                r22 = 1
            L_0x0320:
                boolean r6 = r30.mo37385f()
                if (r6 == 0) goto L_0x0327
                goto L_0x032f
            L_0x0327:
                int r6 = r0.f68199b
                boolean r12 = r0.mo37383d(r15)
                if (r12 != 0) goto L_0x0334
            L_0x032f:
                r12 = r2
                r17 = r8
                goto L_0x0408
            L_0x0334:
                r30.mo37396q()
                java.lang.String r12 = "odd"
                boolean r12 = r0.mo37384e(r12)
                r13 = 2
                if (r12 == 0) goto L_0x0346
                c6.b$d$a r12 = new c6.b$d$a
                r12.<init>(r13, r3)
                goto L_0x0354
            L_0x0346:
                java.lang.String r12 = "even"
                boolean r12 = r0.mo37384e(r12)
                if (r12 == 0) goto L_0x0358
                c6.b$d$a r12 = new c6.b$d$a
                r15 = 0
                r12.<init>(r13, r15)
            L_0x0354:
                r17 = r8
                goto L_0x03f9
            L_0x0358:
                r12 = 43
                boolean r13 = r0.mo37383d(r12)
                r15 = 45
                if (r13 == 0) goto L_0x0363
                goto L_0x036b
            L_0x0363:
                boolean r13 = r0.mo37383d(r15)
                if (r13 == 0) goto L_0x036b
                r13 = -1
                goto L_0x036c
            L_0x036b:
                r13 = 1
            L_0x036c:
                java.lang.String r3 = r0.f68198a
                int r12 = r0.f68199b
                int r2 = r0.f68200c
                r9 = 0
                c6.c r2 = p298c6.C23707c.m28367a(r3, r12, r2, r9)
                if (r2 == 0) goto L_0x037d
                int r3 = r2.f67906a
                r0.f68199b = r3
            L_0x037d:
                r3 = 110(0x6e, float:1.54E-43)
                boolean r3 = r0.mo37383d(r3)
                if (r3 != 0) goto L_0x0395
                r3 = 78
                boolean r3 = r0.mo37383d(r3)
                if (r3 == 0) goto L_0x038e
                goto L_0x0395
            L_0x038e:
                r9 = r2
                r3 = r8
                r12 = r13
                r2 = 0
                r8 = 0
                r13 = 1
                goto L_0x03de
            L_0x0395:
                if (r2 == 0) goto L_0x0399
                r3 = r8
                goto L_0x03a3
            L_0x0399:
                c6.c r2 = new c6.c
                r3 = r8
                r8 = 1
                int r12 = r0.f68199b
                r2.<init>(r8, r12)
            L_0x03a3:
                r30.mo37396q()
                r8 = 43
                boolean r9 = r0.mo37383d(r8)
                if (r9 != 0) goto L_0x03b6
                boolean r9 = r0.mo37383d(r15)
                if (r9 == 0) goto L_0x03b6
                r12 = -1
                goto L_0x03b7
            L_0x03b6:
                r12 = 1
            L_0x03b7:
                if (r9 == 0) goto L_0x03d8
                r30.mo37396q()
                java.lang.String r9 = r0.f68198a
                int r15 = r0.f68199b
                int r8 = r0.f68200c
                r18 = r2
                r2 = 0
                c6.c r8 = p298c6.C23707c.m28367a(r9, r15, r8, r2)
                if (r8 == 0) goto L_0x03d3
                int r9 = r8.f67906a
                r0.f68199b = r9
                r9 = r8
                r8 = r18
                goto L_0x03de
            L_0x03d3:
                r0.f68199b = r6
                r17 = r3
                goto L_0x0407
            L_0x03d8:
                r18 = r2
                r2 = 0
                r8 = r18
                r9 = 0
            L_0x03de:
                c6.b$d$a r15 = new c6.b$d$a
                if (r8 != 0) goto L_0x03e5
                r17 = r3
                goto L_0x03ec
            L_0x03e5:
                r17 = r3
                long r2 = r8.f67907b
                int r3 = (int) r2
                int r2 = r13 * r3
            L_0x03ec:
                if (r9 != 0) goto L_0x03f0
                r3 = 0
                goto L_0x03f5
            L_0x03f0:
                long r8 = r9.f67907b
                int r3 = (int) r8
                int r3 = r3 * r12
            L_0x03f5:
                r15.<init>(r2, r3)
                r12 = r15
            L_0x03f9:
                r30.mo37396q()
                r2 = 41
                boolean r2 = r0.mo37383d(r2)
                if (r2 == 0) goto L_0x0405
                goto L_0x0408
            L_0x0405:
                r0.f68199b = r6
            L_0x0407:
                r12 = 0
            L_0x0408:
                if (r12 == 0) goto L_0x0422
                c6.b$h r9 = new c6.b$h
                int r2 = r12.f67884a
                int r3 = r12.f67885b
                java.lang.String r6 = r10.f67903b
                r18 = r9
                r19 = r2
                r20 = r3
                r23 = r6
                r18.<init>(r19, r20, r21, r22, r23)
                r4.mo17906a()
                r2 = 0
                goto L_0x044d
            L_0x0422:
                c6.a r1 = new c6.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0437:
                r17 = r8
                c6.b$n r9 = new c6.b$n
                r2 = 0
                r9.<init>(r2)
                r4.mo17906a()
                goto L_0x044d
            L_0x0443:
                r17 = r8
                c6.b$o r9 = new c6.b$o
                r9.<init>(r2)
                r4.mo17906a()
            L_0x044d:
                java.util.List<c6.b$g> r3 = r10.f67905d
                if (r3 != 0) goto L_0x0458
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r10.f67905d = r3
            L_0x0458:
                java.util.List<c6.b$g> r3 = r10.f67905d
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.add(r9)
                r8 = r17
                r3 = 1
                r9 = 43
                goto L_0x0077
            L_0x0466:
                c6.a r1 = new c6.a
                java.lang.String r2 = "Invalid pseudo class"
                r1.<init>(r2)
                throw r1
            L_0x046e:
                if (r10 == 0) goto L_0x0484
                java.util.List<c6.b$t> r3 = r4.f45542a
                if (r3 != 0) goto L_0x047b
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.f45542a = r3
            L_0x047b:
                java.util.List<c6.b$t> r3 = r4.f45542a
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.add(r10)
                r6 = 1
                goto L_0x0487
            L_0x0484:
                r0.f68199b = r7
            L_0x0486:
                r6 = 0
            L_0x0487:
                if (r6 == 0) goto L_0x049c
                boolean r3 = r30.mo37395p()
                if (r3 != 0) goto L_0x0490
                goto L_0x0499
            L_0x0490:
                r1.add(r4)
                c6.b$s r3 = new c6.b$s
                r3.<init>()
                r4 = r3
            L_0x0499:
                r3 = 1
                goto L_0x0015
            L_0x049c:
                java.util.List<c6.b$t> r2 = r4.f45542a
                if (r2 == 0) goto L_0x04ab
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x04a9
                goto L_0x04ab
            L_0x04a9:
                r3 = 0
                goto L_0x04ac
            L_0x04ab:
                r3 = 1
            L_0x04ac:
                if (r3 != 0) goto L_0x04b1
                r1.add(r4)
            L_0x04b1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p298c6.C23690b.C23693d.mo37245v():java.util.List");
        }
    }

    /* renamed from: c6.b$e */
    public enum C23695e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: c6.b$f */
    public enum C23696f {
        all,
        screen
    }

    /* renamed from: c6.b$g */
    public interface C23697g {
        /* renamed from: a */
        boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var);
    }

    /* renamed from: c6.b$h */
    public static class C23698h implements C23697g {

        /* renamed from: a */
        public int f67893a;

        /* renamed from: b */
        public int f67894b;

        /* renamed from: c */
        public boolean f67895c;

        /* renamed from: d */
        public boolean f67896d;

        /* renamed from: e */
        public String f67897e;

        public C23698h(int i, int i2, boolean z, boolean z2, String str) {
            this.f67893a = i;
            this.f67894b = i2;
            this.f67895c = z;
            this.f67896d = z2;
            this.f67897e = str;
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            int i;
            int i2;
            String o = (!this.f67896d || this.f67897e != null) ? this.f67897e : l0Var.mo37264o();
            C23713g.C23747j0 j0Var = l0Var.f68086b;
            if (j0Var != null) {
                Iterator<C23713g.C23755n0> it = j0Var.mo37267d().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    C23713g.C23751l0 l0Var2 = (C23713g.C23751l0) it.next();
                    if (l0Var2 == l0Var) {
                        i2 = i;
                    }
                    if (o == null || l0Var2.mo37264o().equals(o)) {
                        i++;
                    }
                }
            } else {
                i2 = 0;
                i = 1;
            }
            int i3 = this.f67895c ? i2 + 1 : i - i2;
            int i4 = this.f67893a;
            if (i4 == 0) {
                return i3 == this.f67894b;
            }
            int i5 = this.f67894b;
            if ((i3 - i5) % i4 == 0) {
                return Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.f67894b) == Integer.signum(this.f67893a);
            }
            return false;
        }

        public String toString() {
            String str = this.f67895c ? "" : "last-";
            if (this.f67896d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(this.f67893a), Integer.valueOf(this.f67894b), this.f67897e});
            }
            return String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(this.f67893a), Integer.valueOf(this.f67894b)});
        }
    }

    /* renamed from: c6.b$i */
    public static class C23699i implements C23697g {
        public C23699i(C23691a aVar) {
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            return !(l0Var instanceof C23713g.C23747j0) || ((C23713g.C23747j0) l0Var).mo37267d().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    /* renamed from: c6.b$k */
    public static class C23700k implements C23697g {

        /* renamed from: a */
        public List<C16853s> f67898a;

        public C23700k(List<C16853s> list) {
            this.f67898a = list;
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            for (C16853s g : this.f67898a) {
                if (C23690b.m28347g(qVar, g, l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.f67898a + ")";
        }
    }

    /* renamed from: c6.b$l */
    public static class C23701l implements C23697g {

        /* renamed from: a */
        public String f67899a;

        public C23701l(String str) {
            this.f67899a = str;
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f67899a;
        }
    }

    /* renamed from: c6.b$m */
    public static class C23702m implements C23697g {

        /* renamed from: a */
        public boolean f67900a;

        /* renamed from: b */
        public String f67901b;

        public C23702m(boolean z, String str) {
            this.f67900a = z;
            this.f67901b = str;
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            int i;
            String o = (!this.f67900a || this.f67901b != null) ? this.f67901b : l0Var.mo37264o();
            C23713g.C23747j0 j0Var = l0Var.f68086b;
            if (j0Var != null) {
                Iterator<C23713g.C23755n0> it = j0Var.mo37267d().iterator();
                i = 0;
                while (it.hasNext()) {
                    C23713g.C23751l0 l0Var2 = (C23713g.C23751l0) it.next();
                    if (o == null || l0Var2.mo37264o().equals(o)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            if (!this.f67900a) {
                return String.format("only-child", new Object[0]);
            }
            return String.format("only-of-type <%s>", new Object[]{this.f67901b});
        }
    }

    /* renamed from: c6.b$n */
    public static class C23703n implements C23697g {
        public C23703n(C23691a aVar) {
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            return l0Var.f68086b == null;
        }

        public String toString() {
            return "root";
        }
    }

    /* renamed from: c6.b$o */
    public static class C23704o implements C23697g {
        public C23704o(C23691a aVar) {
        }

        /* renamed from: a */
        public boolean mo37246a(C23705q qVar, C23713g.C23751l0 l0Var) {
            return false;
        }

        public String toString() {
            return "target";
        }
    }

    /* renamed from: c6.b$q */
    public static class C23705q {
    }

    /* renamed from: c6.b$t */
    public static class C23706t {

        /* renamed from: a */
        public C23695e f67902a = null;

        /* renamed from: b */
        public String f67903b = null;

        /* renamed from: c */
        public List<C23692b> f67904c = null;

        /* renamed from: d */
        public List<C23697g> f67905d = null;

        public C23706t(C23695e eVar, String str) {
            this.f67902a = eVar == null ? C23695e.DESCENDANT : eVar;
            this.f67903b = str;
        }

        /* renamed from: a */
        public void mo37254a(String str, C16849c cVar, String str2) {
            if (this.f67904c == null) {
                this.f67904c = new ArrayList();
            }
            this.f67904c.add(new C23692b(str, cVar, str2));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C23695e eVar = this.f67902a;
            if (eVar == C23695e.CHILD) {
                sb.append("> ");
            } else if (eVar == C23695e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f67903b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C23692b> list = this.f67904c;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C23692b bVar = (C23692b) it.next();
                    sb.append('[');
                    sb.append(bVar.f67881a);
                    int ordinal = bVar.f67882b.ordinal();
                    if (ordinal == 1) {
                        sb.append('=');
                        sb.append(bVar.f67883c);
                    } else if (ordinal == 2) {
                        sb.append("~=");
                        sb.append(bVar.f67883c);
                    } else if (ordinal == 3) {
                        sb.append("|=");
                        sb.append(bVar.f67883c);
                    }
                    sb.append(']');
                }
            }
            List<C23697g> list2 = this.f67905d;
            if (list2 != null) {
                Iterator it4 = ((ArrayList) list2).iterator();
                while (it4.hasNext()) {
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append((C23697g) it4.next());
                }
            }
            return sb.toString();
        }
    }

    public C23690b(C23696f fVar, C16854u uVar) {
    }

    /* renamed from: a */
    public static int m28344a(List<C23713g.C23747j0> list, int i, C23713g.C23751l0 l0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        C23713g.C23747j0 j0Var = list.get(i);
        C23713g.C23747j0 j0Var2 = l0Var.f68086b;
        if (j0Var != j0Var2) {
            return -1;
        }
        for (C23713g.C23755n0 n0Var : j0Var2.mo37267d()) {
            if (n0Var == l0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: c */
    public static List<C23696f> m28345c(C23693d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.mo37385f()) {
            String str = null;
            if (!dVar.mo37385f()) {
                int i = dVar.f68199b;
                char charAt = dVar.f68198a.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    dVar.f68199b = i;
                } else {
                    int a = dVar.mo37380a();
                    while (true) {
                        if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                            str = dVar.f68198a.substring(i, dVar.f68199b);
                        } else {
                            a = dVar.mo37380a();
                        }
                    }
                    str = dVar.f68198a.substring(i, dVar.f68199b);
                }
            }
            if (str != null) {
                try {
                    arrayList.add(C23696f.valueOf(str));
                } catch (IllegalArgumentException unused) {
                }
                if (!dVar.mo37395p()) {
                    break;
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m28346f(C23705q qVar, C16853s sVar, int i, List<C23713g.C23747j0> list, int i2, C23713g.C23751l0 l0Var) {
        C23706t tVar = (C23706t) ((ArrayList) sVar.f45542a).get(i);
        if (!m28349i(qVar, tVar, list, i2, l0Var)) {
            return false;
        }
        C23695e eVar = tVar.f67902a;
        if (eVar == C23695e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (m28348h(qVar, sVar, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (eVar == C23695e.CHILD) {
            return m28348h(qVar, sVar, i - 1, list, i2);
        } else {
            int a = m28344a(list, i2, l0Var);
            if (a <= 0) {
                return false;
            }
            return m28346f(qVar, sVar, i - 1, list, i2, (C23713g.C23751l0) l0Var.f68086b.mo37267d().get(a - 1));
        }
    }

    /* renamed from: g */
    public static boolean m28347g(C23705q qVar, C16853s sVar, C23713g.C23751l0 l0Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        C23713g.C23747j0 j0Var = l0Var.f68086b;
        while (true) {
            i = 0;
            if (j0Var == null) {
                break;
            }
            arrayList.add(0, j0Var);
            j0Var = ((C23713g.C23755n0) j0Var).f68086b;
        }
        int size = arrayList.size() - 1;
        List<C23706t> list = sVar.f45542a;
        if ((list == null ? 0 : ((ArrayList) list).size()) == 1) {
            return m28349i(qVar, (C23706t) ((ArrayList) sVar.f45542a).get(0), arrayList, size, l0Var);
        }
        List<C23706t> list2 = sVar.f45542a;
        if (list2 != null) {
            i = ((ArrayList) list2).size();
        }
        return m28346f(qVar, sVar, i - 1, arrayList, size, l0Var);
    }

    /* renamed from: h */
    public static boolean m28348h(C23705q qVar, C16853s sVar, int i, List<C23713g.C23747j0> list, int i2) {
        C23706t tVar = (C23706t) ((ArrayList) sVar.f45542a).get(i);
        C23713g.C23751l0 l0Var = (C23713g.C23751l0) list.get(i2);
        if (!m28349i(qVar, tVar, list, i2, l0Var)) {
            return false;
        }
        C23695e eVar = tVar.f67902a;
        if (eVar == C23695e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (m28348h(qVar, sVar, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (eVar == C23695e.CHILD) {
            return m28348h(qVar, sVar, i - 1, list, i2 - 1);
        } else {
            int a = m28344a(list, i2, l0Var);
            if (a <= 0) {
                return false;
            }
            return m28346f(qVar, sVar, i - 1, list, i2, (C23713g.C23751l0) l0Var.f68086b.mo37267d().get(a - 1));
        }
    }

    /* renamed from: i */
    public static boolean m28349i(C23705q qVar, C23706t tVar, List<C23713g.C23747j0> list, int i, C23713g.C23751l0 l0Var) {
        List<String> list2;
        String str = tVar.f67903b;
        if (str != null && !str.equals(l0Var.mo37264o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C23692b> list3 = tVar.f67904c;
        if (list3 != null) {
            Iterator it = ((ArrayList) list3).iterator();
            while (it.hasNext()) {
                C23692b bVar = (C23692b) it.next();
                String str2 = bVar.f67881a;
                str2.getClass();
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (list2 = l0Var.f68079g) == null || !list2.contains(bVar.f67883c)) {
                        return false;
                    }
                } else if (!bVar.f67883c.equals(l0Var.f68075c)) {
                    return false;
                }
            }
        }
        List<C23697g> list4 = tVar.f67905d;
        if (list4 == null) {
            return true;
        }
        Iterator it4 = ((ArrayList) list4).iterator();
        while (it4.hasNext()) {
            if (!((C23697g) it4.next()).mo37246a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r0 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37238b(p298c6.C23690b.C16852r r11, p298c6.C23690b.C23693d r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.mo37243t()
            r12.mo37396q()
            if (r0 == 0) goto L_0x01ae
            boolean r1 = r10.f67880a
            java.lang.String r2 = "Invalid @media rule: expected '}' at end of rule set"
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = "media"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0074
            java.util.List r0 = m28345c(r12)
            boolean r1 = r12.mo37383d(r4)
            if (r1 == 0) goto L_0x006c
            r12.mo37396q()
            c6.b$f r1 = p298c6.C23690b.C23696f.screen
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r0.next()
            c6.b$f r4 = (p298c6.C23690b.C23696f) r4
            c6.b$f r7 = p298c6.C23690b.C23696f.all
            if (r4 == r7) goto L_0x0044
            if (r4 != r1) goto L_0x0032
        L_0x0044:
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x0055
            r10.f67880a = r6
            c6.b$r r0 = r10.mo37240e(r12)
            r11.mo17904b(r0)
            r10.f67880a = r5
            goto L_0x0058
        L_0x0055:
            r10.mo37240e(r12)
        L_0x0058:
            boolean r11 = r12.mo37385f()
            if (r11 != 0) goto L_0x01aa
            boolean r11 = r12.mo37383d(r3)
            if (r11 == 0) goto L_0x0066
            goto L_0x01aa
        L_0x0066:
            c6.a r11 = new c6.a
            r11.<init>(r2)
            throw r11
        L_0x006c:
            c6.a r11 = new c6.a
            java.lang.String r12 = "Invalid @media rule: missing rule set"
            r11.<init>(r12)
            throw r11
        L_0x0074:
            boolean r11 = r10.f67880a
            r1 = 59
            if (r11 != 0) goto L_0x0181
            java.lang.String r11 = "import"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x0181
            boolean r11 = r12.mo37385f()
            r0 = 0
            if (r11 == 0) goto L_0x008b
            goto L_0x0158
        L_0x008b:
            int r11 = r12.f68199b
            java.lang.String r3 = "url("
            boolean r3 = r12.mo37384e(r3)
            if (r3 != 0) goto L_0x0097
            goto L_0x0158
        L_0x0097:
            r12.mo37396q()
            java.lang.String r3 = r12.mo37242s()
            if (r3 != 0) goto L_0x013d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x00a5:
            boolean r4 = r12.mo37385f()
            if (r4 != 0) goto L_0x0131
            java.lang.String r4 = r12.f68198a
            int r5 = r12.f68199b
            char r4 = r4.charAt(r5)
            r5 = 39
            if (r4 == r5) goto L_0x0131
            r5 = 34
            if (r4 == r5) goto L_0x0131
            r5 = 40
            if (r4 == r5) goto L_0x0131
            r5 = 41
            if (r4 == r5) goto L_0x0131
            boolean r5 = r12.mo37386g(r4)
            if (r5 != 0) goto L_0x0131
            boolean r5 = java.lang.Character.isISOControl(r4)
            if (r5 == 0) goto L_0x00d0
            goto L_0x0131
        L_0x00d0:
            int r5 = r12.f68199b
            int r5 = r5 + r6
            r12.f68199b = r5
            r5 = 92
            if (r4 != r5) goto L_0x012b
            boolean r4 = r12.mo37385f()
            if (r4 == 0) goto L_0x00e0
            goto L_0x00a5
        L_0x00e0:
            java.lang.String r4 = r12.f68198a
            int r5 = r12.f68199b
            int r7 = r5 + 1
            r12.f68199b = r7
            char r4 = r4.charAt(r5)
            r5 = 10
            if (r4 == r5) goto L_0x00a5
            r5 = 13
            if (r4 == r5) goto L_0x00a5
            r5 = 12
            if (r4 != r5) goto L_0x00f9
            goto L_0x00a5
        L_0x00f9:
            int r5 = r12.mo37241r(r4)
            r7 = -1
            if (r5 == r7) goto L_0x012b
            r4 = 1
        L_0x0101:
            r8 = 5
            if (r4 > r8) goto L_0x0125
            boolean r8 = r12.mo37385f()
            if (r8 == 0) goto L_0x010b
            goto L_0x0125
        L_0x010b:
            java.lang.String r8 = r12.f68198a
            int r9 = r12.f68199b
            char r8 = r8.charAt(r9)
            int r8 = r12.mo37241r(r8)
            if (r8 != r7) goto L_0x011a
            goto L_0x0125
        L_0x011a:
            int r9 = r12.f68199b
            int r9 = r9 + r6
            r12.f68199b = r9
            int r5 = r5 * 16
            int r5 = r5 + r8
            int r4 = r4 + 1
            goto L_0x0101
        L_0x0125:
            char r4 = (char) r5
            r3.append(r4)
            goto L_0x00a5
        L_0x012b:
            char r4 = (char) r4
            r3.append(r4)
            goto L_0x00a5
        L_0x0131:
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0139
            r3 = r0
            goto L_0x013d
        L_0x0139:
            java.lang.String r3 = r3.toString()
        L_0x013d:
            if (r3 != 0) goto L_0x0142
            r12.f68199b = r11
            goto L_0x0158
        L_0x0142:
            r12.mo37396q()
            boolean r4 = r12.mo37385f()
            if (r4 != 0) goto L_0x0157
            java.lang.String r4 = ")"
            boolean r4 = r12.mo37384e(r4)
            if (r4 == 0) goto L_0x0154
            goto L_0x0157
        L_0x0154:
            r12.f68199b = r11
            goto L_0x0158
        L_0x0157:
            r0 = r3
        L_0x0158:
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = r12.mo37242s()
        L_0x015e:
            if (r0 == 0) goto L_0x0179
            r12.mo37396q()
            m28345c(r12)
            boolean r11 = r12.mo37385f()
            if (r11 != 0) goto L_0x01aa
            boolean r11 = r12.mo37383d(r1)
            if (r11 == 0) goto L_0x0173
            goto L_0x01aa
        L_0x0173:
            c6.a r11 = new c6.a
            r11.<init>(r2)
            throw r11
        L_0x0179:
            c6.a r11 = new c6.a
            java.lang.String r12 = "Invalid @import rule: expected string or url()"
            r11.<init>(r12)
            throw r11
        L_0x0181:
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r5] = r0
            java.lang.String r0 = "Ignoring @%s rule"
            java.lang.String.format(r0, r11)
        L_0x018a:
            boolean r11 = r12.mo37385f()
            if (r11 != 0) goto L_0x01aa
            java.lang.Integer r11 = r12.mo37387h()
            int r11 = r11.intValue()
            if (r11 != r1) goto L_0x019d
            if (r5 != 0) goto L_0x019d
            goto L_0x01aa
        L_0x019d:
            if (r11 != r4) goto L_0x01a2
            int r5 = r5 + 1
            goto L_0x018a
        L_0x01a2:
            if (r11 != r3) goto L_0x018a
            if (r5 <= 0) goto L_0x018a
            int r5 = r5 + -1
            if (r5 != 0) goto L_0x018a
        L_0x01aa:
            r12.mo37396q()
            return
        L_0x01ae:
            c6.a r11 = new c6.a
            java.lang.String r12 = "Invalid '@' rule"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23690b.mo37238b(c6.b$r, c6.b$d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37239d(p298c6.C23690b.C16852r r6, p298c6.C23690b.C23693d r7) {
        /*
            r5 = this;
            java.util.List r0 = r7.mo37245v()
            if (r0 == 0) goto L_0x00a9
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00a9
            r1 = 123(0x7b, float:1.72E-43)
            boolean r1 = r7.mo37383d(r1)
            if (r1 == 0) goto L_0x00a1
            r7.mo37396q()
            c6.g$e0 r1 = new c6.g$e0
            r1.<init>()
        L_0x001e:
            java.lang.String r2 = r7.mo37243t()
            r7.mo37396q()
            r3 = 58
            boolean r3 = r7.mo37383d(r3)
            if (r3 == 0) goto L_0x0099
            r7.mo37396q()
            java.lang.String r3 = r7.mo37244u()
            if (r3 == 0) goto L_0x0091
            r7.mo37396q()
            r4 = 33
            boolean r4 = r7.mo37383d(r4)
            if (r4 == 0) goto L_0x0058
            r7.mo37396q()
            java.lang.String r4 = "important"
            boolean r4 = r7.mo37384e(r4)
            if (r4 == 0) goto L_0x0050
            r7.mo37396q()
            goto L_0x0058
        L_0x0050:
            c6.a r6 = new c6.a
            java.lang.String r7 = "Malformed rule set: found unexpected '!'"
            r6.<init>(r7)
            throw r6
        L_0x0058:
            r4 = 59
            r7.mo37383d(r4)
            p298c6.C23793j.m28547H(r1, r2, r3)
            r7.mo37396q()
            boolean r2 = r7.mo37385f()
            if (r2 != 0) goto L_0x0071
            r2 = 125(0x7d, float:1.75E-43)
            boolean r2 = r7.mo37383d(r2)
            if (r2 == 0) goto L_0x001e
        L_0x0071:
            r7.mo37396q()
            java.util.Iterator r7 = r0.iterator()
        L_0x0078:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r7.next()
            c6.b$s r0 = (p298c6.C23690b.C16853s) r0
            c6.b$p r2 = new c6.b$p
            c6.b$u r3 = p298c6.C23690b.C16854u.Document
            r2.<init>(r0, r1, r3)
            r6.mo17903a(r2)
            goto L_0x0078
        L_0x008f:
            r6 = 1
            return r6
        L_0x0091:
            c6.a r6 = new c6.a
            java.lang.String r7 = "Expected property value"
            r6.<init>(r7)
            throw r6
        L_0x0099:
            c6.a r6 = new c6.a
            java.lang.String r7 = "Expected ':'"
            r6.<init>(r7)
            throw r6
        L_0x00a1:
            c6.a r6 = new c6.a
            java.lang.String r7 = "Malformed rule block: expected '{'"
            r6.<init>(r7)
            throw r6
        L_0x00a9:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23690b.mo37239d(c6.b$r, c6.b$d):boolean");
    }

    /* renamed from: e */
    public final C16852r mo37240e(C23693d dVar) {
        C16852r rVar = new C16852r();
        while (!dVar.mo37385f()) {
            try {
                if (!dVar.mo37384e("<!--")) {
                    if (!dVar.mo37384e("-->")) {
                        if (!dVar.mo37383d('@')) {
                            if (!mo37239d(rVar, dVar)) {
                                break;
                            }
                        } else {
                            mo37238b(rVar, dVar);
                        }
                    }
                }
            } catch (C23689a e) {
                e.getMessage();
            }
        }
        return rVar;
    }
}
