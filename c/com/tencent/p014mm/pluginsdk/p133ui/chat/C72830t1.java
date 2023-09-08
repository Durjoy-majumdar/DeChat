package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.text.Editable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.cedit.api.MMFlexEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import sx3.C90364q0;
import yd3.C79080b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.t1 */
public final class C72830t1 {

    /* renamed from: c */
    public static final Map<Character, String> f212239c = C90364q0.m113147f(new C13604l('(', ")"), new C13604l(65288, "）"), new C13604l(12304, "】"), new C13604l('<', ">"));

    /* renamed from: d */
    public static final List<String> f212240d = C64197v.m75537f(".", ".", "、", ")", "）", "】");

    /* renamed from: a */
    public final ChatFooter f212241a;

    /* renamed from: b */
    public boolean f212242b;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.t1$a */
    public static final class C72831a {

        /* renamed from: j */
        public static final C72831a f212243j = new C72831a("", (Character) null, (String) null, -1, -1, false, (Character) null);

        /* renamed from: a */
        public final String f212244a;

        /* renamed from: b */
        public final Character f212245b;

        /* renamed from: c */
        public final String f212246c;

        /* renamed from: d */
        public final int f212247d;

        /* renamed from: e */
        public final int f212248e;

        /* renamed from: f */
        public final boolean f212249f;

        /* renamed from: g */
        public final Character f212250g;

        /* renamed from: h */
        public String f212251h = "";

        /* renamed from: i */
        public final C13601g f212252i = C36568h.m40985a(new C72832a(this));

        /* renamed from: com.tencent.mm.pluginsdk.ui.chat.t1$a$a */
        public static final class C72832a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ C72831a f212253d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C72832a(C72831a aVar) {
                super(0);
                this.f212253d = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0113  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r12 = this;
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r0 = r12.f212253d
                    java.lang.String r0 = r0.f212244a
                    java.lang.Integer r0 = z04.C66731x.m78731e(r0)
                    r1 = -1
                    if (r0 == 0) goto L_0x0010
                    int r0 = r0.intValue()
                    goto L_0x0011
                L_0x0010:
                    r0 = -1
                L_0x0011:
                    java.lang.String r2 = ""
                    r3 = 0
                    r4 = 1
                    if (r0 != r1) goto L_0x011f
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r0 = r12.f212253d
                    java.lang.String r1 = r0.f212246c
                    if (r1 == 0) goto L_0x00d2
                    java.lang.String r0 = r0.f212244a
                    java.lang.String r1 = "chineseStr"
                    gy3.C87412m.m108594g(r0, r1)
                    boolean r1 = android.text.TextUtils.isEmpty(r0)
                    if (r1 == 0) goto L_0x002b
                    goto L_0x004e
                L_0x002b:
                    char[] r0 = r0.toCharArray()
                    java.lang.String r1 = "this as java.lang.String).toCharArray()"
                    gy3.C87412m.m108593f(r0, r1)
                    int r1 = r0.length
                    r5 = 10
                    if (r1 <= r5) goto L_0x003b
                    goto L_0x004e
                L_0x003b:
                    int r1 = r0.length
                    r5 = 0
                L_0x003d:
                    if (r5 >= r1) goto L_0x0053
                    char r6 = r0[r5]
                    java.lang.String r6 = java.lang.String.valueOf(r6)
                    java.lang.String r7 = "零一二三四五六七八九十百千万亿"
                    boolean r6 = z04.C112550d0.m153801u(r7, r6, r3)
                    if (r6 != 0) goto L_0x0050
                L_0x004e:
                    r0 = 0
                    goto L_0x0054
                L_0x0050:
                    int r5 = r5 + 1
                    goto L_0x003d
                L_0x0053:
                    r0 = 1
                L_0x0054:
                    if (r0 == 0) goto L_0x00d2
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r0 = r12.f212253d
                    java.lang.String r0 = r0.f212244a
                    java.lang.String r1 = "chineseNum"
                    gy3.C87412m.m108594g(r0, r1)
                    int r1 = r0.length()
                    r2 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 1
                L_0x0067:
                    if (r2 >= r1) goto L_0x00bf
                    char r8 = r0.charAt(r2)
                    r9 = 9
                    r10 = 0
                L_0x0070:
                    if (r10 >= r9) goto L_0x0083
                    char[] r11 = p694t9.C36980a.f98064b
                    char r11 = r11[r10]
                    if (r8 != r11) goto L_0x0080
                    if (r6 == 0) goto L_0x007c
                    int r5 = r5 + r7
                    r6 = 0
                L_0x007c:
                    int r7 = r10 + 1
                    r9 = 0
                    goto L_0x0084
                L_0x0080:
                    int r10 = r10 + 1
                    goto L_0x0070
                L_0x0083:
                    r9 = 1
                L_0x0084:
                    if (r9 == 0) goto L_0x00b4
                    r9 = 5
                    r10 = 0
                L_0x0088:
                    if (r10 >= r9) goto L_0x00b4
                    char[] r11 = p694t9.C36980a.f98065c
                    char r11 = r11[r10]
                    if (r8 != r11) goto L_0x00b1
                    if (r10 == 0) goto L_0x00ad
                    if (r10 == r4) goto L_0x00aa
                    r11 = 2
                    if (r10 == r11) goto L_0x00a7
                    r11 = 3
                    if (r10 == r11) goto L_0x00a4
                    r11 = 4
                    if (r10 == r11) goto L_0x009e
                    goto L_0x00af
                L_0x009e:
                    r11 = 100000000(0x5f5e100, float:2.3122341E-35)
                    int r7 = r7 * r11
                    goto L_0x00af
                L_0x00a4:
                    int r7 = r7 * 10000
                    goto L_0x00af
                L_0x00a7:
                    int r7 = r7 * 1000
                    goto L_0x00af
                L_0x00aa:
                    int r7 = r7 * 100
                    goto L_0x00af
                L_0x00ad:
                    int r7 = r7 * 10
                L_0x00af:
                    int r6 = r6 + 1
                L_0x00b1:
                    int r10 = r10 + 1
                    goto L_0x0088
                L_0x00b4:
                    int r8 = r0.length()
                    int r8 = r8 - r4
                    if (r2 != r8) goto L_0x00bc
                    int r5 = r5 + r7
                L_0x00bc:
                    int r2 = r2 + 1
                    goto L_0x0067
                L_0x00bf:
                    int r5 = r5 + r4
                    t9.a r0 = p694t9.C36980a.f98063a
                    java.lang.String r2 = r0.mo60922a(r5)
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r0 = r12.f212253d
                    r0.getClass()
                    java.lang.String r1 = "一"
                    r0.f212251h = r1
                    goto L_0x014a
                L_0x00d2:
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r0 = r12.f212253d
                    java.lang.String r0 = r0.f212244a
                    if (r0 == 0) goto L_0x00e1
                    boolean r1 = z04.C112551y.m153811k(r0)
                    if (r1 == 0) goto L_0x00df
                    goto L_0x00e1
                L_0x00df:
                    r1 = 0
                    goto L_0x00e2
                L_0x00e1:
                    r1 = 1
                L_0x00e2:
                    if (r1 == 0) goto L_0x00e5
                    goto L_0x0107
                L_0x00e5:
                    int r1 = r0.length()
                    if (r1 == r4) goto L_0x00ec
                    goto L_0x0107
                L_0x00ec:
                    char r0 = r0.charAt(r3)
                    r1 = 9312(0x2460, float:1.3049E-41)
                    int r1 = gy3.C87412m.m108596i(r0, r1)
                    if (r1 < 0) goto L_0x0107
                    r1 = 9331(0x2473, float:1.3076E-41)
                    int r1 = gy3.C87412m.m108596i(r0, r1)
                    if (r1 >= 0) goto L_0x0107
                    int r0 = r0 + r4
                    char r0 = (char) r0
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    goto L_0x0108
                L_0x0107:
                    r0 = r2
                L_0x0108:
                    if (r0 == 0) goto L_0x0110
                    boolean r1 = z04.C112551y.m153811k(r0)
                    if (r1 == 0) goto L_0x0111
                L_0x0110:
                    r3 = 1
                L_0x0111:
                    if (r3 != 0) goto L_0x014a
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r1 = r12.f212253d
                    r1.getClass()
                    java.lang.String r2 = "①"
                    r1.f212251h = r2
                    r2 = r0
                    goto L_0x014a
                L_0x011f:
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r1 = r12.f212253d
                    boolean r5 = r1.f212249f
                    if (r5 != 0) goto L_0x0137
                    java.lang.Character r1 = r1.f212250g
                    if (r1 == 0) goto L_0x0134
                    char r1 = r1.charValue()
                    boolean r1 = java.lang.Character.isDigit(r1)
                    if (r1 != r4) goto L_0x0134
                    r3 = 1
                L_0x0134:
                    if (r3 == 0) goto L_0x0137
                    goto L_0x014a
                L_0x0137:
                    com.tencent.mm.pluginsdk.ui.chat.t1$a r1 = r12.f212253d
                    java.lang.Character r3 = r1.f212245b
                    if (r3 != 0) goto L_0x0142
                    java.lang.String r1 = r1.f212246c
                    if (r1 != 0) goto L_0x0142
                    goto L_0x014a
                L_0x0142:
                    if (r0 >= 0) goto L_0x0145
                    goto L_0x014a
                L_0x0145:
                    int r0 = r0 + r4
                    java.lang.String r2 = java.lang.String.valueOf(r0)
                L_0x014a:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72830t1.C72831a.C72832a.invoke():java.lang.Object");
            }
        }

        public C72831a(String str, Character ch, String str2, int i, int i2, boolean z, Character ch4) {
            C87412m.m108594g(str, "numStr");
            this.f212244a = str;
            this.f212245b = ch;
            this.f212246c = str2;
            this.f212247d = i;
            this.f212248e = i2;
            this.f212249f = z;
            this.f212250g = ch4;
        }

        /* renamed from: a */
        public final String mo100671a() {
            StringBuilder sb = new StringBuilder();
            Character ch = this.f212245b;
            if (ch != null) {
                sb.append(ch.charValue());
            }
            String str = this.f212251h;
            if (!(str == null || C112551y.m153811k(str))) {
                sb.append(this.f212251h);
            } else {
                sb.append("1");
            }
            String str2 = this.f212246c;
            if (str2 != null) {
                sb.append(str2);
            }
            if (this.f212249f) {
                sb.append("b");
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder().apply{\n …\n            }.toString()");
            return sb4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C72831a)) {
                return false;
            }
            C72831a aVar = (C72831a) obj;
            return C87412m.m108589b(this.f212244a, aVar.f212244a) && C87412m.m108589b(this.f212245b, aVar.f212245b) && C87412m.m108589b(this.f212246c, aVar.f212246c) && this.f212247d == aVar.f212247d && this.f212248e == aVar.f212248e && this.f212249f == aVar.f212249f && C87412m.m108589b(this.f212250g, aVar.f212250g);
        }

        public int hashCode() {
            int hashCode = this.f212244a.hashCode() * 31;
            Character ch = this.f212245b;
            int i = 0;
            int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
            String str = this.f212246c;
            int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f212247d) * 31) + this.f212248e) * 31;
            boolean z = this.f212249f;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            Character ch4 = this.f212250g;
            if (ch4 != null) {
                i = ch4.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "SeqInfo(numStr=" + this.f212244a + ", leftPattern=" + this.f212245b + ", rightPattern=" + this.f212246c + ", beginIndex=" + this.f212247d + ", endIndex=" + this.f212248e + ", isHasBlank=" + this.f212249f + ", nextChar=" + this.f212250g + ')';
        }
    }

    public C72830t1(ChatFooter chatFooter) {
        C87412m.m108594g(chatFooter, "chatFooter");
        this.f212241a = chatFooter;
    }

    /* renamed from: a */
    public static final boolean m85407a(C72830t1 t1Var, int i, C74974a aVar) {
        C72831a aVar2;
        if (i != 0) {
            t1Var.getClass();
            if (i != 1) {
                return false;
            }
            C87412m.m108594g(aVar, "<this>");
            if (C87412m.m108589b(aVar.getTag(C0966R.C0970id.f357669f50), Boolean.TRUE)) {
                aVar.setTag(C0966R.C0970id.f357669f50, Boolean.FALSE);
                return false;
            }
            int selectionStart = aVar.getSelectionStart();
            Editable text = aVar.getText();
            if (text == null || C112551y.m153811k(text)) {
                aVar2 = C72831a.f212243j;
            } else {
                String obj = text.subSequence(0, selectionStart).toString();
                int i2 = MMFlexEditText.f220522p;
                String p = C112551y.m153816p(obj, String.valueOf(8203), "", false, 4, (Object) null);
                if (p.charAt(p.length() - 1) != 10) {
                    aVar2 = C72831a.f212243j;
                } else {
                    String substring = p.substring(0, p.length() - 1);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    aVar2 = t1Var.mo100668b(substring);
                }
            }
            if (!(!C112551y.m153811k((String) ((C36570n) aVar2.f212252i).getValue()))) {
                return false;
            }
            try {
                StringBuilder sb = new StringBuilder();
                Character ch = aVar2.f212245b;
                if (ch != null) {
                    sb.append(ch.charValue());
                }
                sb.append((String) ((C36570n) aVar2.f212252i).getValue());
                String str = aVar2.f212246c;
                if (str != null) {
                    sb.append(str);
                }
                if (aVar2.f212249f) {
                    sb.append(" ");
                }
                text.insert(selectionStart, sb);
                C79080b.f232221a.mo109023a(2, aVar2.mo100671a(), !t1Var.f212242b);
                if (!t1Var.f212242b) {
                    t1Var.f212242b = true;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("ChatFooterKtHelper", th, "edt insert err", new Object[0]);
                return false;
            }
        } else if (!t1Var.mo100670d(aVar)) {
            return false;
        } else {
            aVar.setTag(C0966R.C0970id.f357669f50, Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.pluginsdk.p133ui.chat.C72830t1.C72831a mo100668b(java.lang.CharSequence r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x000d
            boolean r2 = z04.C112551y.m153811k(r9)
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0013
            com.tencent.mm.pluginsdk.ui.chat.t1$a r9 = com.tencent.p014mm.pluginsdk.p133ui.chat.C72830t1.C72831a.f212243j
            return r9
        L_0x0013:
            java.lang.String r2 = r9.toString()
            int r3 = r9.length()
            r4 = -1
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x0036
        L_0x001f:
            int r5 = r3 + -1
            char r6 = r9.charAt(r3)
            int r7 = com.tencent.p014mm.p136ui.widget.cedit.api.MMFlexEditText.f220522p
            r7 = 8203(0x200b, float:1.1495E-41)
            if (r6 != r7) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            if (r5 >= 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = r5
            goto L_0x001f
        L_0x0036:
            r3 = -1
        L_0x0037:
            if (r3 == r4) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            int r3 = r9.length()
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x0056
        L_0x0041:
            int r5 = r3 + -1
            char r6 = r9.charAt(r3)
            r7 = 10
            if (r6 != r7) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            if (r5 >= 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r3 = r5
            goto L_0x0041
        L_0x0056:
            r3 = -1
        L_0x0057:
            if (r3 != r4) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            int r0 = r3 + 1
        L_0x005c:
            int r9 = r2.length()
            r3 = 0
            if (r9 <= r0) goto L_0x006c
            char r9 = r2.charAt(r0)
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            goto L_0x006d
        L_0x006c:
            r9 = r3
        L_0x006d:
            java.util.Map<java.lang.Character, java.lang.String> r5 = f212239c
            boolean r6 = r5.containsKey(r9)
            if (r6 == 0) goto L_0x007e
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r0 + 1
            goto L_0x0080
        L_0x007e:
            r9 = r3
            r5 = r9
        L_0x0080:
            if (r0 == r4) goto L_0x00b6
            if (r5 == 0) goto L_0x0089
            com.tencent.mm.pluginsdk.ui.chat.t1$a r9 = r8.mo100669c(r0, r2, r9, r5)
            return r9
        L_0x0089:
            java.util.List<java.lang.String> r9 = f212240d
            java.util.Iterator r9 = r9.iterator()
        L_0x008f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00b1
            java.lang.Object r4 = r9.next()
            java.lang.String r4 = (java.lang.String) r4
            com.tencent.mm.pluginsdk.ui.chat.t1$a r4 = r8.mo100669c(r0, r2, r3, r4)
            rx3.g r5 = r4.f212252i
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = z04.C112551y.m153811k(r5)
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x008f
            return r4
        L_0x00b1:
            com.tencent.mm.pluginsdk.ui.chat.t1$a r9 = r8.mo100669c(r0, r2, r3, r3)
            return r9
        L_0x00b6:
            com.tencent.mm.pluginsdk.ui.chat.t1$a r9 = com.tencent.p014mm.pluginsdk.p133ui.chat.C72830t1.C72831a.f212243j
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72830t1.mo100668b(java.lang.CharSequence):com.tencent.mm.pluginsdk.ui.chat.t1$a");
    }

    /* renamed from: c */
    public final C72831a mo100669c(int i, String str, Character ch, String str2) {
        C87412m.m108594g(str, "str");
        int E = str2 != null ? C112550d0.m153769E(str, str2, i, false, 4, (Object) null) : i + 1;
        if (E == -1 || i >= E || str.length() < E) {
            C72831a aVar = C72831a.f212243j;
            return C72831a.f212243j;
        }
        String obj = str.subSequence(i, E).toString();
        if (ch != null) {
            i--;
        }
        int i2 = i;
        int length = E + (str2 != null ? str2.length() : 0);
        boolean z = str.length() > length && str.charAt(length) == ' ';
        int i3 = length + (z ? 1 : 0);
        return new C72831a(obj, ch, str2, i2, i3, z, str.length() > i3 ? Character.valueOf(str.charAt(i3)) : null);
    }

    /* renamed from: d */
    public final boolean mo100670d(C74974a aVar) {
        int i;
        C87412m.m108594g(aVar, "edt");
        int selectionStart = aVar.getSelectionStart();
        Editable text = aVar.getText();
        C87412m.m108593f(text, "editableText");
        C72831a b = mo100668b(text.subSequence(0, selectionStart).toString());
        if ((!C112551y.m153811k((String) ((C36570n) b.f212252i).getValue())) && (i = b.f212248e) == selectionStart) {
            try {
                text.delete(b.f212247d, i);
                return true;
            } catch (Throwable th) {
                Log.printErrStackTrace("ChatFooterKtHelper", th, "edt delete err", new Object[0]);
            }
        }
        return false;
    }
}
