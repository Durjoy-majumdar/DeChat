package r14;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.Arrays;
import q14.C25541i;

/* renamed from: r14.e */
public final class C26098e {

    /* renamed from: a */
    public int f72950a;

    /* renamed from: b */
    public byte f72951b = 12;

    /* renamed from: c */
    public int f72952c;

    /* renamed from: d */
    public int f72953d = -1;

    /* renamed from: e */
    public int f72954e;

    /* renamed from: f */
    public char[] f72955f = new char[16];

    /* renamed from: g */
    public final String f72956g;

    public C26098e(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        this.f72956g = str;
        mo52962g();
    }

    /* renamed from: d */
    public static /* synthetic */ Void m33448d(C26098e eVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = eVar.f72950a;
        }
        eVar.mo52959c(str, i);
        throw null;
    }

    /* renamed from: a */
    public final void mo52957a(char c) {
        int i = this.f72954e;
        char[] cArr = this.f72955f;
        if (i >= cArr.length) {
            char[] copyOf = Arrays.copyOf(cArr, cArr.length * 2);
            C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f72955f = copyOf;
        }
        char[] cArr2 = this.f72955f;
        int i2 = this.f72954e;
        this.f72954e = i2 + 1;
        cArr2[i2] = c;
    }

    /* renamed from: b */
    public final void mo52958b(String str, int i, int i2) {
        int i3 = i2 - i;
        int i4 = this.f72954e;
        int i5 = i4 + i3;
        char[] cArr = this.f72955f;
        if (i5 > cArr.length) {
            int length = cArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i5);
            C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f72955f = copyOf;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            this.f72955f[i4 + i6] = str.charAt(i + i6);
        }
        this.f72954e += i3;
    }

    /* renamed from: c */
    public final Void mo52959c(String str, int i) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        throw C25541i.m33035c(i, str, this.f72956g);
    }

    /* renamed from: e */
    public final int mo52960e(String str, int i) {
        if (i < str.length()) {
            char charAt = str.charAt(i);
            if ('0' <= charAt && '9' >= charAt) {
                return charAt - '0';
            }
            char c = 'a';
            if ('a' > charAt || 'f' < charAt) {
                c = 'A';
                if ('A' > charAt || 'F' < charAt) {
                    m33448d(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 2, (Object) null);
                    throw null;
                }
            }
            return (charAt - c) + 10;
        }
        mo52959c("Unexpected EOF during unicode escape", i);
        throw null;
    }

    /* renamed from: f */
    public final boolean mo52961f() {
        byte b = this.f72951b;
        return b == 0 || b == 1 || b == 6 || b == 8 || b == 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0124  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52962g() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f72956g
            int r1 = r11.f72950a
        L_0x0004:
            int r2 = r0.length()
            r3 = 12
            if (r1 >= r2) goto L_0x0129
            char r2 = r0.charAt(r1)
            r4 = 126(0x7e, float:1.77E-43)
            r5 = 0
            if (r2 >= r4) goto L_0x001a
            byte[] r6 = r14.C26099f.f72957a
            byte r2 = r6[r2]
            goto L_0x001d
        L_0x001a:
            byte[] r2 = r14.C26099f.f72957a
            r2 = 0
        L_0x001d:
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L_0x00e3
            if (r2 == r7) goto L_0x0031
            r3 = 3
            if (r2 == r3) goto L_0x002e
            r11.f72952c = r1
            r11.f72951b = r2
            int r1 = r1 + r7
            r11.f72950a = r1
            return
        L_0x002e:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0031:
            r11.f72952c = r1
            r11.f72954e = r5
            int r1 = r1 + r7
            r2 = r1
            r4 = r2
        L_0x0038:
            char r8 = r0.charAt(r2)
            r9 = 34
            if (r8 == r9) goto L_0x00ce
            char r8 = r0.charAt(r2)
            r9 = 92
            r10 = 0
            if (r8 != r9) goto L_0x00be
            r11.mo52958b(r0, r4, r2)
            int r2 = r2 + 1
            int r4 = r0.length()
            if (r2 >= r4) goto L_0x0056
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x00b8
            int r4 = r2 + 1
            char r2 = r0.charAt(r2)
            r8 = 117(0x75, float:1.64E-43)
            if (r2 != r8) goto L_0x0088
            int r2 = r4 + 1
            int r4 = r11.mo52960e(r0, r4)
            int r4 = r4 << r3
            int r8 = r2 + 1
            int r2 = r11.mo52960e(r0, r2)
            int r2 = r2 << 8
            int r4 = r4 + r2
            int r2 = r8 + 1
            int r8 = r11.mo52960e(r0, r8)
            int r8 = r8 << r6
            int r4 = r4 + r8
            int r8 = r2 + 1
            int r2 = r11.mo52960e(r0, r2)
            int r4 = r4 + r2
            char r2 = (char) r4
            r11.mo52957a(r2)
            r4 = r8
            goto L_0x009c
        L_0x0088:
            byte[] r9 = r14.C26099f.f72957a
            if (r2 >= r8) goto L_0x0091
            char[] r8 = r14.C110494b.f330396a
            char r8 = r8[r2]
            goto L_0x0092
        L_0x0091:
            r8 = 0
        L_0x0092:
            if (r8 == 0) goto L_0x0096
            r9 = 1
            goto L_0x0097
        L_0x0096:
            r9 = 0
        L_0x0097:
            if (r9 == 0) goto L_0x009e
            r11.mo52957a(r8)
        L_0x009c:
            r2 = r4
            goto L_0x0038
        L_0x009e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid escaped char '"
            r0.append(r1)
            r0.append(r2)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.mo52959c(r0, r4)
            throw r10
        L_0x00b8:
            java.lang.String r0 = "Unexpected EOF after escape character"
            r11.mo52959c(r0, r2)
            throw r10
        L_0x00be:
            int r2 = r2 + 1
            int r8 = r0.length()
            if (r2 >= r8) goto L_0x00c8
            goto L_0x0038
        L_0x00c8:
            java.lang.String r0 = "EOF"
            r11.mo52959c(r0, r2)
            throw r10
        L_0x00ce:
            if (r4 != r1) goto L_0x00d7
            r11.f72953d = r4
            int r0 = r2 - r4
            r11.f72954e = r0
            goto L_0x00dd
        L_0x00d7:
            r11.mo52958b(r0, r4, r2)
            r0 = -1
            r11.f72953d = r0
        L_0x00dd:
            int r2 = r2 + r7
            r11.f72950a = r2
            r11.f72951b = r7
            return
        L_0x00e3:
            r11.f72952c = r1
            r11.f72953d = r1
        L_0x00e7:
            int r2 = r0.length()
            if (r1 >= r2) goto L_0x0100
            char r2 = r0.charAt(r1)
            if (r2 >= r4) goto L_0x00f8
            byte[] r3 = r14.C26099f.f72957a
            byte r2 = r3[r2]
            goto L_0x00fb
        L_0x00f8:
            byte[] r2 = r14.C26099f.f72957a
            r2 = 0
        L_0x00fb:
            if (r2 != 0) goto L_0x0100
            int r1 = r1 + 1
            goto L_0x00e7
        L_0x0100:
            r11.f72950a = r1
            int r2 = r11.f72953d
            int r1 = r1 - r2
            r11.f72954e = r1
            byte[] r3 = r14.C26099f.f72957a
            if (r1 == r6) goto L_0x010c
            goto L_0x011d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r1 >= r6) goto L_0x0122
            int r3 = r2 + r1
            char r3 = r0.charAt(r3)
            java.lang.String r4 = "null"
            char r4 = r4.charAt(r1)
            if (r3 == r4) goto L_0x011f
        L_0x011d:
            r7 = 0
            goto L_0x0122
        L_0x011f:
            int r1 = r1 + 1
            goto L_0x010d
        L_0x0122:
            if (r7 == 0) goto L_0x0126
            r5 = 10
        L_0x0126:
            r11.f72951b = r5
            return
        L_0x0129:
            r11.f72952c = r1
            r11.f72951b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r14.C26098e.mo52962g():void");
    }

    /* renamed from: h */
    public final String mo52963h() {
        byte b = this.f72951b;
        if (b == 0 || b == 1) {
            return mo52964i(true);
        }
        mo52959c("Expected string or non-null literal", this.f72952c);
        throw null;
    }

    /* renamed from: i */
    public final String mo52964i(boolean z) {
        String str;
        int i = this.f72953d;
        if (i < 0) {
            char[] cArr = this.f72955f;
            int i2 = this.f72954e + 0;
            C87412m.m108594g(cArr, "<this>");
            int length = cArr.length;
            if (i2 > length) {
                throw new IndexOutOfBoundsException("startIndex: " + 0 + ", endIndex: " + i2 + ", size: " + length);
            } else if (i2 >= 0) {
                str = new String(cArr, 0, i2 - 0);
            } else {
                throw new IllegalArgumentException("startIndex: " + 0 + " > endIndex: " + i2);
            }
        } else {
            String str2 = this.f72956g;
            int i3 = this.f72954e + i;
            if (str2 != null) {
                str = str2.substring(i, i3);
                C87412m.m108593f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        if (z) {
            mo52962g();
        }
        return str;
    }

    /* renamed from: j */
    public final String mo52965j() {
        if (this.f72951b == 1) {
            return mo52964i(true);
        }
        mo52959c("Expected string literal with quotes. Use 'JsonBuilder.isLenient = true' to accept non-compliant JSON", this.f72952c);
        throw null;
    }

    public String toString() {
        return "JsonReader(source='" + this.f72956g + "', currentPosition=" + this.f72950a + ", tokenClass=" + this.f72951b + ", tokenPosition=" + this.f72952c + ", offset=" + this.f72953d + ')';
    }
}
