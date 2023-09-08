package s21;

import android.text.Editable;
import android.text.Html;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Pattern;
import w21.C102303a;
import w21.C102318o;

/* renamed from: s21.d */
public class C101499d implements Html.TagHandler {

    /* renamed from: c */
    public static final Pattern f297206c = Pattern.compile("\\d+");

    /* renamed from: d */
    public static final Pattern f297207d = Pattern.compile("#[a-f0-9]+");

    /* renamed from: e */
    public static HashMap<String, Integer> f297208e;

    /* renamed from: a */
    public Stack<C102303a> f297209a = new Stack<>();

    /* renamed from: b */
    public final HashMap<String, String> f297210b = new HashMap<>();

    /* renamed from: s21.d$a */
    public static class C101500a {
    }

    /* renamed from: s21.d$b */
    public static class C101501b {

        /* renamed from: a */
        public int f297211a = Integer.MIN_VALUE;

        /* renamed from: b */
        public String f297212b;

        /* renamed from: c */
        public String f297213c;

        /* renamed from: d */
        public String f297214d;
    }

    /* renamed from: s21.d$c */
    public static abstract class C101502c {

        /* renamed from: a */
        public boolean f297215a;

        public C101502c(int i, boolean z) {
            this.f297215a = z;
        }
    }

    /* renamed from: s21.d$d */
    public static class C101503d extends C101502c {
        public C101503d(int i, boolean z) {
            super(i, z);
        }
    }

    /* renamed from: s21.d$e */
    public static class C101504e extends C101502c {

        /* renamed from: b */
        public boolean f297216b;

        public C101504e(int i, boolean z, boolean z2) {
            super(i, z);
            this.f297216b = z2;
        }
    }

    /* renamed from: s21.d$f */
    public static class C101505f extends C101502c {
        public C101505f(int i, boolean z) {
            super(i, z);
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f297208e = hashMap;
        hashMap.put("aqua", 65535);
        f297208e.put("black", 0);
        f297208e.put("blue", 255);
        f297208e.put("fuchsia", 16711935);
        f297208e.put("green", 32768);
        f297208e.put("grey", 8421504);
        f297208e.put("lime", 65280);
        f297208e.put("maroon", 8388608);
        f297208e.put("navy", 128);
        f297208e.put("olive", 8421376);
        f297208e.put("purple", 8388736);
        f297208e.put("red", 16711680);
        f297208e.put("silver", 12632256);
        f297208e.put("teal", 32896);
        f297208e.put("white", 16777215);
        f297208e.put("yellow", 16776960);
    }

    /* renamed from: b */
    public static int m133267b(String str) {
        int i;
        int i2;
        int i3;
        Integer num = f297208e.get(str.toLowerCase());
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r2 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r1 == w21.C102318o.NOTEOL) == false) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140990a(boolean r6) {
        /*
            r5 = this;
            java.util.Stack<w21.a> r0 = r5.f297209a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.util.Stack<w21.a> r0 = r5.f297209a
            java.lang.Object r0 = r0.peek()
            w21.a r0 = (w21.C102303a) r0
            w21.o r1 = r0.f301317a
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L_0x0022
            r1.getClass()
            w21.o r4 = w21.C102318o.NOTEOL
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
            w21.o r4 = w21.C102318o.NOTEUL
            if (r1 != r4) goto L_0x002c
            r2 = 1
        L_0x002c:
            if (r2 != 0) goto L_0x0036
        L_0x002e:
            if (r6 != 0) goto L_0x0049
            boolean r1 = r1.mo141868a()
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            int r6 = r0.f301319c
            if (r6 <= r3) goto L_0x0043
            int r6 = r6 - r3
            r0.f301319c = r6
            int r6 = r0.f301318b
            int r6 = r6 - r3
            r0.f301318b = r6
            goto L_0x0051
        L_0x0043:
            java.util.Stack<w21.a> r6 = r5.f297209a
            r6.pop()
            goto L_0x0051
        L_0x0049:
            java.util.Stack<w21.a> r0 = r5.f297209a
            r0.pop()
            r5.mo140990a(r6)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s21.C101499d.mo140990a(boolean):void");
    }

    /* renamed from: c */
    public final Object mo140991c(Editable editable, Class<? extends Object> cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    /* renamed from: d */
    public final void mo140992d(boolean z, C102318o oVar) {
        if (z) {
            oVar = C102318o.NOTEOL;
        }
        C102303a peek = this.f297209a.isEmpty() ? null : this.f297209a.peek();
        if (peek == null) {
            this.f297209a.push(new C102303a(oVar, 1, 1));
        } else if (peek.f301317a == oVar) {
            peek.f301318b++;
            peek.f301319c++;
        } else {
            this.f297209a.push(new C102303a(oVar, peek.f301318b + 1, 1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: w21.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: w21.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: w21.k} */
    /* JADX WARNING: type inference failed for: r13v10, types: [s21.d$f] */
    /* JADX WARNING: type inference failed for: r13v11, types: [s21.d$e] */
    /* JADX WARNING: type inference failed for: r13v12, types: [s21.d$f] */
    /* JADX WARNING: type inference failed for: r13v13, types: [s21.d$d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleTag(boolean r18, java.lang.String r19, android.text.Editable r20, org.xml.sax.XMLReader r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            w21.o r3 = w21.C102318o.NOTEOL
            w21.o r4 = w21.C102318o.NOTEUL
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r0.f297210b
            r5.clear()
            r5 = 0
            r6 = 1
            java.lang.Class r7 = r21.getClass()     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.String r8 = "theNewElement"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r7.setAccessible(r6)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r8 = r21
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Class r8 = r7.getClass()     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.String r9 = "theAtts"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r8.setAccessible(r6)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Class r8 = r7.getClass()     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.String r9 = "data"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r8.setAccessible(r6)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Class r9 = r7.getClass()     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.String r10 = "length"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r9.setAccessible(r6)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Object r7 = r9.get(r7)     // Catch:{ Exception | NullPointerException -> 0x0077 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception | NullPointerException -> 0x0077 }
            int r7 = r7.intValue()     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r9 = 0
        L_0x0063:
            if (r9 >= r7) goto L_0x0078
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r0.f297210b     // Catch:{ Exception | NullPointerException -> 0x0077 }
            int r11 = r9 * 5
            int r12 = r11 + 1
            r12 = r8[r12]     // Catch:{ Exception | NullPointerException -> 0x0077 }
            int r11 = r11 + 4
            r11 = r8[r11]     // Catch:{ Exception | NullPointerException -> 0x0077 }
            r10.put(r12, r11)     // Catch:{ Exception | NullPointerException -> 0x0077 }
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
            r6 = 10
            if (r18 == 0) goto L_0x0276
            boolean r15 = r1.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x00a2
            r0.mo140992d(r5, r4)
            goto L_0x03f7
        L_0x00a2:
            boolean r14 = r1.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x00ae
            r14 = 1
            r0.mo140992d(r14, r3)
            goto L_0x03f7
        L_0x00ae:
            r14 = 1
            boolean r13 = r1.equalsIgnoreCase(r13)
            r15 = 17
            if (r13 == 0) goto L_0x00f6
            w21.o r1 = w21.C102318o.NOTETODO
            w21.a r3 = new w21.a
            r3.<init>(r1, r14, r14)
            java.util.Stack<w21.a> r1 = r0.f297209a
            r1.push(r3)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f297210b
            java.lang.String r3 = "checked"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00dd
            r6 = 1
            goto L_0x00de
        L_0x00dd:
            r6 = 0
        L_0x00de:
            s21.d$e r1 = new s21.d$e
            java.util.Stack<w21.a> r3 = r0.f297209a
            java.lang.Object r3 = r3.peek()
            w21.a r3 = (w21.C102303a) r3
            int r3 = r3.f301318b
            r1.<init>(r3, r5, r6)
            int r3 = r20.length()
            r2.setSpan(r1, r3, r3, r15)
            goto L_0x03f7
        L_0x00f6:
            boolean r12 = r1.equalsIgnoreCase(r12)
            r13 = 0
            if (r12 == 0) goto L_0x0168
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f297210b
            java.lang.String r6 = "done"
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 != 0) goto L_0x0118
            java.lang.String r6 = "true"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0118
            r1 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            java.util.Stack<w21.a> r6 = r0.f297209a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0158
            java.util.Stack<w21.a> r6 = r0.f297209a
            java.lang.Object r6 = r6.peek()
            w21.a r6 = (w21.C102303a) r6
            w21.o r7 = r6.f301317a
            int r6 = r6.f301318b
            r7.getClass()
            if (r7 != r3) goto L_0x0134
            r3 = 1
            goto L_0x0135
        L_0x0134:
            r3 = 0
        L_0x0135:
            if (r3 == 0) goto L_0x013d
            s21.d$d r13 = new s21.d$d
            r13.<init>(r6, r5)
            goto L_0x015d
        L_0x013d:
            if (r7 != r4) goto L_0x0142
            r16 = 1
            goto L_0x0144
        L_0x0142:
            r16 = 0
        L_0x0144:
            if (r16 == 0) goto L_0x014c
            s21.d$f r13 = new s21.d$f
            r13.<init>(r6, r5)
            goto L_0x015d
        L_0x014c:
            boolean r3 = r7.mo141868a()
            if (r3 == 0) goto L_0x015d
            s21.d$e r13 = new s21.d$e
            r13.<init>(r6, r5, r1)
            goto L_0x015d
        L_0x0158:
            s21.d$f r13 = new s21.d$f
            r13.<init>(r5, r5)
        L_0x015d:
            if (r13 == 0) goto L_0x03f7
            int r1 = r20.length()
            r2.setSpan(r13, r1, r1, r15)
            goto L_0x03f7
        L_0x0168:
            boolean r3 = r1.equalsIgnoreCase(r11)
            if (r3 != 0) goto L_0x01c7
            boolean r3 = r1.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x0175
            goto L_0x01c7
        L_0x0175:
            boolean r3 = r1.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0189
            s21.d$a r1 = new s21.d$a
            r1.<init>()
            int r3 = r20.length()
            r2.setSpan(r1, r3, r3, r15)
            goto L_0x03f7
        L_0x0189:
            boolean r3 = r1.equalsIgnoreCase(r8)
            java.lang.String r4 = "\n"
            if (r3 == 0) goto L_0x01a9
            int r1 = r20.length()
            r3 = 1
            if (r1 < r3) goto L_0x01a2
            int r3 = r1 + -1
            char r3 = r2.charAt(r3)
            if (r3 != r6) goto L_0x01a2
            goto L_0x03f7
        L_0x01a2:
            if (r1 == 0) goto L_0x03f7
            r2.append(r4)
            goto L_0x03f7
        L_0x01a9:
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x03f7
            int r1 = r20.length()
            r3 = 1
            if (r1 < r3) goto L_0x01c0
            int r3 = r1 + -1
            char r3 = r2.charAt(r3)
            if (r3 != r6) goto L_0x01c0
            goto L_0x03f7
        L_0x01c0:
            if (r1 == 0) goto L_0x03f7
            r2.append(r4)
            goto L_0x03f7
        L_0x01c7:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f297210b
            java.lang.String r3 = "style"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0255
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.String r4 = ";"
            java.lang.String[] r1 = r1.split(r4)
            int r4 = r1.length
            r6 = r13
            r7 = 0
        L_0x01e5:
            if (r7 >= r4) goto L_0x0252
            r8 = r1[r7]
            java.lang.String r9 = "font-size"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x020e
            java.util.regex.Pattern r9 = f297206c
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r5)
            if (r10 == 0) goto L_0x024f
            int r10 = r9.start()
            int r9 = r9.end()
            java.lang.String r8 = r8.substring(r10, r9)     // Catch:{ NumberFormatException -> 0x024f }
            int r3 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x024f }
            goto L_0x024f
        L_0x020e:
            java.lang.String r9 = "color"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x022f
            java.util.regex.Pattern r9 = f297207d
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r5)
            if (r10 == 0) goto L_0x024f
            int r6 = r9.start()
            int r9 = r9.end()
            java.lang.String r6 = r8.substring(r6, r9)
            goto L_0x024f
        L_0x022f:
            java.lang.String r9 = "background-color"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x024f
            java.util.regex.Pattern r9 = f297207d
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.find(r5)
            if (r10 == 0) goto L_0x024f
            int r10 = r9.start()
            int r9 = r9.end()
            java.lang.String r13 = r8.substring(r10, r9)
        L_0x024f:
            int r7 = r7 + 1
            goto L_0x01e5
        L_0x0252:
            r1 = r13
            r13 = r6
            goto L_0x0256
        L_0x0255:
            r1 = r13
        L_0x0256:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r0.f297210b
            java.lang.String r5 = "face"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r20.length()
            s21.d$b r6 = new s21.d$b
            r6.<init>()
            r6.f297211a = r3
            r6.f297212b = r13
            r6.f297213c = r1
            r6.f297214d = r4
            r2.setSpan(r6, r5, r5, r15)
            goto L_0x03f7
        L_0x0276:
            java.lang.Class<s21.d$c> r3 = s21.C101499d.C101502c.class
            boolean r4 = r1.equalsIgnoreCase(r15)
            if (r4 == 0) goto L_0x0283
            r0.mo140990a(r5)
            goto L_0x03f2
        L_0x0283:
            boolean r4 = r1.equalsIgnoreCase(r14)
            if (r4 == 0) goto L_0x028f
            r4 = 1
            r0.mo140990a(r4)
            goto L_0x03f2
        L_0x028f:
            r4 = 1
            boolean r13 = r1.equalsIgnoreCase(r13)
            r14 = 33
            if (r13 == 0) goto L_0x02de
            java.lang.Object r1 = r0.mo140991c(r2, r3)
            s21.d$c r1 = (s21.C101499d.C101502c) r1
            if (r1 == 0) goto L_0x03f2
            int r3 = r20.length()
            if (r3 == 0) goto L_0x02b1
            int r3 = r20.length()
            int r3 = r3 - r4
            char r3 = r2.charAt(r3)
            if (r3 == r6) goto L_0x02b4
        L_0x02b1:
            r2.append(r6)
        L_0x02b4:
            int r3 = r2.getSpanStart(r1)
            int r4 = r20.length()
            boolean r6 = r1.f297215a
            if (r6 != 0) goto L_0x02d9
            int r9 = u21.C101956h.m134205b()
            w21.s r6 = new w21.s
            r7 = r1
            s21.d$e r7 = (s21.C101499d.C101504e) r7
            boolean r8 = r7.f297216b
            if (r3 != r4) goto L_0x02cf
            r10 = 1
            goto L_0x02d0
        L_0x02cf:
            r10 = 0
        L_0x02d0:
            r11 = 0
            r12 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r2.setSpan(r6, r3, r4, r14)
        L_0x02d9:
            r2.removeSpan(r1)
            goto L_0x03f2
        L_0x02de:
            boolean r4 = r1.equalsIgnoreCase(r12)
            if (r4 == 0) goto L_0x0336
            java.lang.Object r1 = r0.mo140991c(r2, r3)
            s21.d$c r1 = (s21.C101499d.C101502c) r1
            if (r1 == 0) goto L_0x03f2
            int r3 = r20.length()
            if (r3 == 0) goto L_0x02fe
            int r3 = r20.length()
            r4 = 1
            int r3 = r3 - r4
            char r3 = r2.charAt(r3)
            if (r3 == r6) goto L_0x0301
        L_0x02fe:
            r2.append(r6)
        L_0x0301:
            int r3 = r2.getSpanStart(r1)
            int r4 = r20.length()
            boolean r6 = r1.f297215a
            if (r6 != 0) goto L_0x0331
            int r9 = u21.C101956h.m134205b()
            boolean r6 = r1 instanceof s21.C101499d.C101503d
            if (r6 == 0) goto L_0x0324
            w21.k r6 = new w21.k
            r8 = 1
            if (r3 != r4) goto L_0x031c
            r10 = 1
            goto L_0x031d
        L_0x031c:
            r10 = 0
        L_0x031d:
            r11 = 0
            r12 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x032e
        L_0x0324:
            w21.d r6 = new w21.d
            if (r3 != r4) goto L_0x032a
            r7 = 1
            goto L_0x032b
        L_0x032a:
            r7 = 0
        L_0x032b:
            r6.<init>(r9, r7, r5, r5)
        L_0x032e:
            r2.setSpan(r6, r3, r4, r14)
        L_0x0331:
            r2.removeSpan(r1)
            goto L_0x03f2
        L_0x0336:
            boolean r3 = r1.equalsIgnoreCase(r11)
            if (r3 != 0) goto L_0x0373
            boolean r3 = r1.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x0343
            goto L_0x0373
        L_0x0343:
            boolean r3 = r1.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0366
            java.lang.Class<s21.d$a> r1 = s21.C101499d.C101500a.class
            com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan r3 = new com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan
            r3.<init>()
            int r4 = r20.length()
            java.lang.Object r1 = r0.mo140991c(r2, r1)
            int r5 = r2.getSpanStart(r1)
            r2.removeSpan(r1)
            if (r5 == r4) goto L_0x03f2
            r2.setSpan(r3, r5, r4, r14)
            goto L_0x03f2
        L_0x0366:
            boolean r3 = r1.equalsIgnoreCase(r8)
            if (r3 == 0) goto L_0x036e
            goto L_0x03f2
        L_0x036e:
            r1.equalsIgnoreCase(r7)
            goto L_0x03f2
        L_0x0373:
            int r1 = r20.length()
            java.lang.Class<s21.d$b> r3 = s21.C101499d.C101501b.class
            java.lang.Object r3 = r0.mo140991c(r2, r3)
            if (r3 != 0) goto L_0x0380
            goto L_0x03f2
        L_0x0380:
            int r4 = r2.getSpanStart(r3)
            r2.removeSpan(r3)
            if (r4 == r1) goto L_0x03f2
            s21.d$b r3 = (s21.C101499d.C101501b) r3
            java.lang.String r6 = r3.f297214d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x039f
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            java.lang.String r7 = r3.f297214d
            r6.<init>(r7)
            r2.setSpan(r6, r4, r1, r14)
        L_0x039f:
            int r6 = r3.f297211a
            if (r6 <= 0) goto L_0x03a4
            r5 = 1
        L_0x03a4:
            if (r5 == 0) goto L_0x03b9
            float r5 = (float) r6
            float r6 = u21.C101956h.m134204a()
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            r6.<init>(r5)
            r2.setSpan(r6, r4, r1, r14)
        L_0x03b9:
            java.lang.String r5 = r3.f297212b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 1
            r5 = r5 ^ r6
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = -1
            if (r5 == 0) goto L_0x03d7
            java.lang.String r5 = r3.f297212b
            int r5 = m133267b(r5)
            if (r5 == r7) goto L_0x03d7
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r5 = r5 | r6
            r8.<init>(r5)
            r2.setSpan(r8, r4, r1, r14)
        L_0x03d7:
            java.lang.String r5 = r3.f297213c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r8 = 1
            r5 = r5 ^ r8
            if (r5 == 0) goto L_0x03f2
            java.lang.String r3 = r3.f297213c
            int r3 = m133267b(r3)
            if (r3 == r7) goto L_0x03f2
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            r3 = r3 | r6
            r5.<init>(r3)
            r2.setSpan(r5, r4, r1, r14)
        L_0x03f2:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f297210b
            r1.clear()
        L_0x03f7:
            s21.C101496a.f297204b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s21.C101499d.handleTag(boolean, java.lang.String, android.text.Editable, org.xml.sax.XMLReader):void");
    }
}
