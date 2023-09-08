package za3;

import android.text.Editable;
import android.text.Html;
import db3.C97457a;
import db3.C97474q;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Pattern;

/* renamed from: za3.d */
public class C102991d implements Html.TagHandler {

    /* renamed from: c */
    public static final Pattern f303922c = Pattern.compile("\\d+");

    /* renamed from: d */
    public static final Pattern f303923d = Pattern.compile("#[a-f0-9]+");

    /* renamed from: e */
    public static HashMap<String, Integer> f303924e;

    /* renamed from: a */
    public Stack<C97457a> f303925a = new Stack<>();

    /* renamed from: b */
    public final HashMap<String, String> f303926b = new HashMap<>();

    /* renamed from: za3.d$a */
    public static class C102992a {
    }

    /* renamed from: za3.d$b */
    public static class C102993b {

        /* renamed from: a */
        public static C102993b f303927a = new C102993b();
    }

    /* renamed from: za3.d$c */
    public static class C102994c {

        /* renamed from: a */
        public int f303928a = Integer.MIN_VALUE;

        /* renamed from: b */
        public String f303929b;

        /* renamed from: c */
        public String f303930c;

        /* renamed from: d */
        public String f303931d;
    }

    /* renamed from: za3.d$d */
    public static abstract class C102995d {

        /* renamed from: a */
        public boolean f303932a;

        public C102995d(int i, boolean z) {
            this.f303932a = z;
        }
    }

    /* renamed from: za3.d$e */
    public static class C102996e extends C102995d {
        public C102996e(int i, boolean z) {
            super(i, z);
        }
    }

    /* renamed from: za3.d$f */
    public static class C102997f extends C102995d {

        /* renamed from: b */
        public boolean f303933b;

        public C102997f(int i, boolean z, boolean z2) {
            super(i, z);
            this.f303933b = z2;
        }
    }

    /* renamed from: za3.d$g */
    public static class C102998g extends C102995d {
        public C102998g(int i, boolean z) {
            super(i, z);
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f303924e = hashMap;
        hashMap.put("aqua", 65535);
        f303924e.put("black", 0);
        f303924e.put("blue", 255);
        f303924e.put("fuchsia", 16711935);
        f303924e.put("green", 32768);
        f303924e.put("grey", 8421504);
        f303924e.put("lime", 65280);
        f303924e.put("maroon", 8388608);
        f303924e.put("navy", 128);
        f303924e.put("olive", 8421376);
        f303924e.put("purple", 8388736);
        f303924e.put("red", 16711680);
        f303924e.put("silver", 12632256);
        f303924e.put("teal", 32896);
        f303924e.put("white", 16777215);
        f303924e.put("yellow", 16776960);
    }

    /* renamed from: b */
    public static int m136191b(String str) {
        int i;
        int i2;
        int i3;
        Integer num = f303924e.get(str.toLowerCase());
        if (num != null) {
            return num.intValue();
        }
        try {
            String str2 = str.toString();
            int length = str2.length();
            int i4 = 10;
            if ('-' == str2.charAt(0)) {
                i2 = 1;
                i = -1;
            } else {
                i2 = 0;
                i = 1;
            }
            if ('0' != str2.charAt(i2)) {
                if ('#' == str2.charAt(i2)) {
                    i3 = i2 + 1;
                }
                return Integer.parseInt(str2.substring(i2), i4) * i;
            } else if (i2 == length - 1) {
                return 0;
            } else {
                int i5 = i2 + 1;
                char charAt = str2.charAt(i5);
                if ('x' != charAt) {
                    if ('X' != charAt) {
                        i4 = 8;
                        i2 = i5;
                        return Integer.parseInt(str2.substring(i2), i4) * i;
                    }
                }
                i3 = i2 + 2;
            }
            i4 = 16;
            return Integer.parseInt(str2.substring(i2), i4) * i;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static void m136192d(Editable editable) {
        int length = editable.length();
        if ((length < 1 || editable.charAt(length - 1) != 10) && length != 0) {
            editable.append("\n");
            editable.setSpan(C102993b.f303927a, editable.length() - 1, editable.length(), 33);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r2 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r1 == db3.C97474q.NOTEOL) == false) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo142723a(boolean r6) {
        /*
            r5 = this;
            java.util.Stack<db3.a> r0 = r5.f303925a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.util.Stack<db3.a> r0 = r5.f303925a
            java.lang.Object r0 = r0.peek()
            db3.a r0 = (db3.C97457a) r0
            db3.q r1 = r0.f286064a
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L_0x0022
            r1.getClass()
            db3.q r4 = db3.C97474q.NOTEOL
            if (r1 != r4) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 != 0) goto L_0x0036
        L_0x0022:
            if (r6 != 0) goto L_0x002e
            r1.getClass()
            db3.q r4 = db3.C97474q.NOTEUL
            if (r1 != r4) goto L_0x002c
            r2 = 1
        L_0x002c:
            if (r2 != 0) goto L_0x0036
        L_0x002e:
            if (r6 != 0) goto L_0x0049
            boolean r1 = r1.mo136740a()
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            int r6 = r0.f286066c
            if (r6 <= r3) goto L_0x0043
            int r6 = r6 - r3
            r0.f286066c = r6
            int r6 = r0.f286065b
            int r6 = r6 - r3
            r0.f286065b = r6
            goto L_0x0051
        L_0x0043:
            java.util.Stack<db3.a> r6 = r5.f303925a
            r6.pop()
            goto L_0x0051
        L_0x0049:
            java.util.Stack<db3.a> r0 = r5.f303925a
            r0.pop()
            r5.mo142723a(r6)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.C102991d.mo142723a(boolean):void");
    }

    /* renamed from: c */
    public final Object mo142724c(Editable editable, Class<? extends Object> cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    /* renamed from: e */
    public final void mo142725e(boolean z, C97474q qVar) {
        if (z) {
            qVar = C97474q.NOTEOL;
        }
        C97457a peek = this.f303925a.isEmpty() ? null : this.f303925a.peek();
        if (peek == null) {
            this.f303925a.push(new C97457a(qVar, 1, 1));
        } else if (peek.f286064a == qVar) {
            peek.f286065b++;
            peek.f286066c++;
        } else {
            this.f303925a.push(new C97457a(qVar, peek.f286065b + 1, 1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: db3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: db3.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: db3.m} */
    /* JADX WARNING: type inference failed for: r13v12, types: [za3.d$g] */
    /* JADX WARNING: type inference failed for: r13v13, types: [za3.d$f] */
    /* JADX WARNING: type inference failed for: r13v14, types: [za3.d$g] */
    /* JADX WARNING: type inference failed for: r13v15, types: [za3.d$e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleTag(boolean r17, java.lang.String r18, android.text.Editable r19, org.xml.sax.XMLReader r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            db3.q r3 = db3.C97474q.NOTEOL
            db3.q r4 = db3.C97474q.NOTEUL
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r0.f303926b
            r5.clear()
            r5 = 1
            r6 = 0
            java.lang.Class r7 = r20.getClass()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r8 = "theNewElement"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception -> 0x0077 }
            r7.setAccessible(r5)     // Catch:{ Exception -> 0x0077 }
            r8 = r20
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x0077 }
            java.lang.Class r8 = r7.getClass()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r9 = "theAtts"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ Exception -> 0x0077 }
            r8.setAccessible(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ Exception -> 0x0077 }
            java.lang.Class r8 = r7.getClass()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r9 = "data"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ Exception -> 0x0077 }
            r8.setAccessible(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ Exception -> 0x0077 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ Exception -> 0x0077 }
            java.lang.Class r9 = r7.getClass()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r10 = "length"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ Exception -> 0x0077 }
            r9.setAccessible(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r7 = r9.get(r7)     // Catch:{ Exception -> 0x0077 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0077 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0077 }
            r9 = 0
        L_0x0063:
            if (r9 >= r7) goto L_0x0078
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r0.f303926b     // Catch:{ Exception -> 0x0077 }
            int r11 = r9 * 5
            int r12 = r11 + 1
            r12 = r8[r12]     // Catch:{ Exception -> 0x0077 }
            int r11 = r11 + 4
            r11 = r8[r11]     // Catch:{ Exception -> 0x0077 }
            r10.put(r12, r11)     // Catch:{ Exception -> 0x0077 }
            int r9 = r9 + 1
            goto L_0x0063
        L_0x0077:
        L_0x0078:
            java.lang.String r7 = "wx-div"
            java.lang.String r8 = "wx-p"
            java.lang.String r9 = "wx-b"
            java.lang.String r10 = "span"
            java.lang.String r11 = "wx-font"
            java.lang.String r12 = "wx-li"
            java.lang.String r13 = "wn-todo"
            java.lang.String r14 = "wx-ol"
            java.lang.String r15 = "wx-ul"
            if (r17 == 0) goto L_0x0246
            boolean r15 = r1.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x00a0
            r0.mo142725e(r6, r4)
            goto L_0x03c5
        L_0x00a0:
            boolean r14 = r1.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x00ab
            r0.mo142725e(r5, r3)
            goto L_0x03c5
        L_0x00ab:
            boolean r13 = r1.equalsIgnoreCase(r13)
            r14 = 17
            if (r13 == 0) goto L_0x00f1
            db3.q r1 = db3.C97474q.NOTETODO
            db3.a r3 = new db3.a
            r3.<init>(r1, r5, r5)
            java.util.Stack<db3.a> r1 = r0.f303925a
            r1.push(r3)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f303926b
            java.lang.String r3 = "checked"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x00d8
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            za3.d$f r1 = new za3.d$f
            java.util.Stack<db3.a> r3 = r0.f303925a
            java.lang.Object r3 = r3.peek()
            db3.a r3 = (db3.C97457a) r3
            int r3 = r3.f286065b
            r1.<init>(r3, r6, r5)
            int r3 = r19.length()
            r2.setSpan(r1, r3, r3, r14)
            goto L_0x03c5
        L_0x00f1:
            boolean r12 = r1.equalsIgnoreCase(r12)
            r13 = 0
            if (r12 == 0) goto L_0x0160
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f303926b
            java.lang.String r7 = "done"
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 != 0) goto L_0x0113
            java.lang.String r7 = "true"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0113
            r1 = 1
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            java.util.Stack<db3.a> r7 = r0.f303925a
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0150
            java.util.Stack<db3.a> r7 = r0.f303925a
            java.lang.Object r7 = r7.peek()
            db3.a r7 = (db3.C97457a) r7
            db3.q r8 = r7.f286064a
            int r7 = r7.f286065b
            r8.getClass()
            if (r8 != r3) goto L_0x012f
            r3 = 1
            goto L_0x0130
        L_0x012f:
            r3 = 0
        L_0x0130:
            if (r3 == 0) goto L_0x0138
            za3.d$e r13 = new za3.d$e
            r13.<init>(r7, r6)
            goto L_0x0155
        L_0x0138:
            if (r8 != r4) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r5 = 0
        L_0x013c:
            if (r5 == 0) goto L_0x0144
            za3.d$g r13 = new za3.d$g
            r13.<init>(r7, r6)
            goto L_0x0155
        L_0x0144:
            boolean r3 = r8.mo136740a()
            if (r3 == 0) goto L_0x0155
            za3.d$f r13 = new za3.d$f
            r13.<init>(r7, r6, r1)
            goto L_0x0155
        L_0x0150:
            za3.d$g r13 = new za3.d$g
            r13.<init>(r6, r6)
        L_0x0155:
            if (r13 == 0) goto L_0x03c5
            int r1 = r19.length()
            r2.setSpan(r13, r1, r1, r14)
            goto L_0x03c5
        L_0x0160:
            boolean r3 = r1.equalsIgnoreCase(r11)
            if (r3 != 0) goto L_0x0197
            boolean r3 = r1.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x016d
            goto L_0x0197
        L_0x016d:
            boolean r3 = r1.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0181
            za3.d$a r1 = new za3.d$a
            r1.<init>()
            int r3 = r19.length()
            r2.setSpan(r1, r3, r3, r14)
            goto L_0x03c5
        L_0x0181:
            boolean r3 = r1.equalsIgnoreCase(r8)
            if (r3 == 0) goto L_0x018c
            m136192d(r19)
            goto L_0x03c5
        L_0x018c:
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x03c5
            m136192d(r19)
            goto L_0x03c5
        L_0x0197:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f303926b
            java.lang.String r3 = "style"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0225
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.String r4 = ";"
            java.lang.String[] r1 = r1.split(r4)
            int r4 = r1.length
            r5 = r13
            r7 = 0
        L_0x01b5:
            if (r7 >= r4) goto L_0x0222
            r8 = r1[r7]
            java.lang.String r9 = "font-size"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01de
            java.util.regex.Pattern r9 = f303922c
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r6)
            if (r10 == 0) goto L_0x021f
            int r10 = r9.start()
            int r9 = r9.end()
            java.lang.String r8 = r8.substring(r10, r9)     // Catch:{ NumberFormatException -> 0x021f }
            int r3 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x021f }
            goto L_0x021f
        L_0x01de:
            java.lang.String r9 = "color"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01ff
            java.util.regex.Pattern r9 = f303923d
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r6)
            if (r10 == 0) goto L_0x021f
            int r5 = r9.start()
            int r9 = r9.end()
            java.lang.String r5 = r8.substring(r5, r9)
            goto L_0x021f
        L_0x01ff:
            java.lang.String r9 = "background-color"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x021f
            java.util.regex.Pattern r9 = f303923d
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r6)
            if (r10 == 0) goto L_0x021f
            int r10 = r9.start()
            int r9 = r9.end()
            java.lang.String r13 = r8.substring(r10, r9)
        L_0x021f:
            int r7 = r7 + 1
            goto L_0x01b5
        L_0x0222:
            r1 = r13
            r13 = r5
            goto L_0x0226
        L_0x0225:
            r1 = r13
        L_0x0226:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r0.f303926b
            java.lang.String r5 = "face"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r19.length()
            za3.d$c r6 = new za3.d$c
            r6.<init>()
            r6.f303928a = r3
            r6.f303929b = r13
            r6.f303930c = r1
            r6.f303931d = r4
            r2.setSpan(r6, r5, r5, r14)
            goto L_0x03c5
        L_0x0246:
            java.lang.Class<za3.d$d> r3 = za3.C102991d.C102995d.class
            boolean r4 = r1.equalsIgnoreCase(r15)
            if (r4 == 0) goto L_0x0253
            r0.mo142723a(r6)
            goto L_0x03c0
        L_0x0253:
            boolean r4 = r1.equalsIgnoreCase(r14)
            if (r4 == 0) goto L_0x025e
            r0.mo142723a(r5)
            goto L_0x03c0
        L_0x025e:
            boolean r4 = r1.equalsIgnoreCase(r13)
            r13 = 10
            r14 = 33
            if (r4 == 0) goto L_0x02ae
            java.lang.Object r1 = r0.mo142724c(r2, r3)
            za3.d$d r1 = (za3.C102991d.C102995d) r1
            if (r1 == 0) goto L_0x03c0
            int r3 = r19.length()
            if (r3 == 0) goto L_0x0281
            int r3 = r19.length()
            int r3 = r3 - r5
            char r3 = r2.charAt(r3)
            if (r3 == r13) goto L_0x0284
        L_0x0281:
            r2.append(r13)
        L_0x0284:
            int r3 = r2.getSpanStart(r1)
            int r4 = r19.length()
            boolean r7 = r1.f303932a
            if (r7 != 0) goto L_0x02a9
            int r10 = bb3.C92219b.m115909b()
            db3.k r7 = new db3.k
            r8 = r1
            za3.d$f r8 = (za3.C102991d.C102997f) r8
            boolean r9 = r8.f303933b
            if (r3 != r4) goto L_0x029f
            r11 = 1
            goto L_0x02a0
        L_0x029f:
            r11 = 0
        L_0x02a0:
            r12 = 0
            r13 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r2.setSpan(r7, r3, r4, r14)
        L_0x02a9:
            r2.removeSpan(r1)
            goto L_0x03c0
        L_0x02ae:
            boolean r4 = r1.equalsIgnoreCase(r12)
            if (r4 == 0) goto L_0x0304
            java.lang.Object r1 = r0.mo142724c(r2, r3)
            za3.d$d r1 = (za3.C102991d.C102995d) r1
            if (r1 == 0) goto L_0x03c0
            int r3 = r19.length()
            if (r3 == 0) goto L_0x02cd
            int r3 = r19.length()
            int r3 = r3 - r5
            char r3 = r2.charAt(r3)
            if (r3 == r13) goto L_0x02d0
        L_0x02cd:
            r2.append(r13)
        L_0x02d0:
            int r3 = r2.getSpanStart(r1)
            int r4 = r19.length()
            boolean r7 = r1.f303932a
            if (r7 != 0) goto L_0x02ff
            int r10 = bb3.C92219b.m115909b()
            boolean r7 = r1 instanceof za3.C102991d.C102996e
            if (r7 == 0) goto L_0x02f3
            db3.m r7 = new db3.m
            r9 = 1
            if (r3 != r4) goto L_0x02eb
            r11 = 1
            goto L_0x02ec
        L_0x02eb:
            r11 = 0
        L_0x02ec:
            r12 = 0
            r13 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x02fc
        L_0x02f3:
            db3.d r7 = new db3.d
            if (r3 != r4) goto L_0x02f8
            goto L_0x02f9
        L_0x02f8:
            r5 = 0
        L_0x02f9:
            r7.<init>(r10, r5, r6, r6)
        L_0x02fc:
            r2.setSpan(r7, r3, r4, r14)
        L_0x02ff:
            r2.removeSpan(r1)
            goto L_0x03c0
        L_0x0304:
            boolean r3 = r1.equalsIgnoreCase(r11)
            if (r3 != 0) goto L_0x0344
            boolean r3 = r1.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x0311
            goto L_0x0344
        L_0x0311:
            boolean r3 = r1.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0334
            java.lang.Class<za3.d$a> r1 = za3.C102991d.C102992a.class
            com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan r3 = new com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan
            r3.<init>()
            int r4 = r19.length()
            java.lang.Object r1 = r0.mo142724c(r2, r1)
            int r5 = r2.getSpanStart(r1)
            r2.removeSpan(r1)
            if (r5 == r4) goto L_0x03c0
            r2.setSpan(r3, r5, r4, r14)
            goto L_0x03c0
        L_0x0334:
            boolean r3 = r1.equalsIgnoreCase(r8)
            if (r3 == 0) goto L_0x033f
            m136192d(r19)
            goto L_0x03c0
        L_0x033f:
            r1.equalsIgnoreCase(r7)
            goto L_0x03c0
        L_0x0344:
            int r1 = r19.length()
            java.lang.Class<za3.d$c> r3 = za3.C102991d.C102994c.class
            java.lang.Object r3 = r0.mo142724c(r2, r3)
            if (r3 != 0) goto L_0x0351
            goto L_0x03c0
        L_0x0351:
            int r4 = r2.getSpanStart(r3)
            r2.removeSpan(r3)
            if (r4 == r1) goto L_0x03c0
            za3.d$c r3 = (za3.C102991d.C102994c) r3
            java.lang.String r7 = r3.f303931d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x036f
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            java.lang.String r8 = r3.f303931d
            r7.<init>(r8)
            r2.setSpan(r7, r4, r1, r14)
        L_0x036f:
            int r7 = r3.f303928a
            if (r7 <= 0) goto L_0x0374
            r6 = 1
        L_0x0374:
            if (r6 == 0) goto L_0x0389
            float r6 = (float) r7
            float r7 = bb3.C92219b.m115908a()
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            android.text.style.AbsoluteSizeSpan r7 = new android.text.style.AbsoluteSizeSpan
            r7.<init>(r6)
            r2.setSpan(r7, r4, r1, r14)
        L_0x0389:
            java.lang.String r6 = r3.f303929b
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r6 = r6 ^ r5
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8 = -1
            if (r6 == 0) goto L_0x03a6
            java.lang.String r6 = r3.f303929b
            int r6 = m136191b(r6)
            if (r6 == r8) goto L_0x03a6
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            r6 = r6 | r7
            r9.<init>(r6)
            r2.setSpan(r9, r4, r1, r14)
        L_0x03a6:
            java.lang.String r6 = r3.f303930c
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x03c0
            java.lang.String r3 = r3.f303930c
            int r3 = m136191b(r3)
            if (r3 == r8) goto L_0x03c0
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            r3 = r3 | r7
            r5.<init>(r3)
            r2.setSpan(r5, r4, r1, r14)
        L_0x03c0:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f303926b
            r1.clear()
        L_0x03c5:
            za3.C102988a.f303920b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.C102991d.handleTag(boolean, java.lang.String, android.text.Editable, org.xml.sax.XMLReader):void");
    }
}
