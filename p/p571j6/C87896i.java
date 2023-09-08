package p571j6;

import java.io.Writer;

/* renamed from: j6.i */
public class C87896i {

    /* renamed from: b */
    public static final char[] f254417b = {'\\', '\"'};

    /* renamed from: c */
    public static final char[] f254418c = {'\\', '\\'};

    /* renamed from: d */
    public static final char[] f254419d = {'\\', 'n'};

    /* renamed from: e */
    public static final char[] f254420e = {'\\', 'r'};

    /* renamed from: f */
    public static final char[] f254421f = {'\\', 't'};

    /* renamed from: g */
    public static final char[] f254422g = {'\\', 'u', '2', '0', '2', '8'};

    /* renamed from: h */
    public static final char[] f254423h = {'\\', 'u', '2', '0', '2', '9'};

    /* renamed from: i */
    public static final char[] f254424i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public final Writer f254425a;

    public C87896i(Writer writer) {
        this.f254425a = writer;
    }

    /* renamed from: a */
    public void mo122363a() {
        this.f254425a.write(93);
    }

    /* renamed from: b */
    public void mo122364b() {
        this.f254425a.write(91);
    }

    /* renamed from: c */
    public void mo122365c() {
        this.f254425a.write(44);
    }

    /* renamed from: d */
    public void mo122366d(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            char[] cArr = null;
            if (charAt > '\\') {
                if (charAt >= 8232 && charAt <= 8233) {
                    cArr = charAt == 8232 ? f254422g : f254423h;
                }
            } else if (charAt == '\\') {
                cArr = f254418c;
            } else if (charAt <= '\"') {
                if (charAt == '\"') {
                    cArr = f254417b;
                } else if (charAt <= 31) {
                    if (charAt == 10) {
                        cArr = f254419d;
                    } else if (charAt == 13) {
                        cArr = f254420e;
                    } else if (charAt == 9) {
                        cArr = f254421f;
                    } else {
                        char[] cArr2 = f254424i;
                        cArr = new char[]{'\\', 'u', '0', '0', cArr2[(charAt >> 4) & 15], cArr2[charAt & 15]};
                    }
                }
            }
            if (cArr != null) {
                this.f254425a.write(str, i, i2 - i);
                this.f254425a.write(cArr);
                i = i2 + 1;
            }
        }
        this.f254425a.write(str, i, length - i);
    }

    /* renamed from: e */
    public void mo122367e() {
        this.f254425a.write(58);
    }

    /* renamed from: f */
    public void mo122368f() {
        this.f254425a.write(125);
    }

    /* renamed from: g */
    public void mo122369g() {
        this.f254425a.write(123);
    }

    /* renamed from: h */
    public void mo122370h() {
        this.f254425a.write(44);
    }
}
