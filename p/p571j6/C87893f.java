package p571j6;

import com.tencent.xweb.file.XVFSFile;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: j6.f */
public class C87893f {

    /* renamed from: a */
    public final Reader f254406a;

    /* renamed from: b */
    public final char[] f254407b;

    /* renamed from: c */
    public int f254408c;

    /* renamed from: d */
    public int f254409d;

    /* renamed from: e */
    public int f254410e;

    /* renamed from: f */
    public int f254411f = 1;

    /* renamed from: g */
    public int f254412g;

    /* renamed from: h */
    public int f254413h;

    /* renamed from: i */
    public StringBuilder f254414i;

    /* renamed from: j */
    public int f254415j = -1;

    public C87893f(String str) {
        StringReader stringReader = new StringReader(str);
        int max = Math.max(10, Math.min(1024, str.length()));
        this.f254406a = stringReader;
        this.f254407b = new char[max];
    }

    /* renamed from: a */
    public final String mo122351a() {
        String str;
        int i = this.f254413h == -1 ? this.f254409d : this.f254409d - 1;
        if (this.f254414i.length() > 0) {
            StringBuilder sb = this.f254414i;
            char[] cArr = this.f254407b;
            int i2 = this.f254415j;
            sb.append(cArr, i2, i - i2);
            str = this.f254414i.toString();
            this.f254414i.setLength(0);
        } else {
            char[] cArr2 = this.f254407b;
            int i3 = this.f254415j;
            str = new String(cArr2, i3, i - i3);
        }
        this.f254415j = -1;
        return str;
    }

    /* renamed from: b */
    public final C33519j mo122352b(String str) {
        int i = this.f254408c + this.f254409d;
        int i2 = i - this.f254412g;
        if (!(this.f254413h == -1)) {
            i--;
        }
        return new C33519j(str, i, this.f254411f, i2 - 1);
    }

    /* renamed from: c */
    public final C33519j mo122353c(String str) {
        if (this.f254413h == -1) {
            return mo122352b("Unexpected end of input");
        }
        return mo122352b("Expected " + str);
    }

    /* renamed from: d */
    public final void mo122354d() {
        int i = this.f254409d;
        int i2 = this.f254410e;
        if (i == i2) {
            int i3 = this.f254415j;
            if (i3 != -1) {
                this.f254414i.append(this.f254407b, i3, i2 - i3);
                this.f254415j = 0;
            }
            this.f254408c += this.f254410e;
            Reader reader = this.f254406a;
            char[] cArr = this.f254407b;
            int read = reader.read(cArr, 0, cArr.length);
            this.f254410e = read;
            this.f254409d = 0;
            if (read == -1) {
                this.f254413h = -1;
                return;
            }
        }
        if (this.f254413h == 10) {
            this.f254411f++;
            this.f254412g = this.f254408c + this.f254409d;
        }
        char[] cArr2 = this.f254407b;
        int i4 = this.f254409d;
        this.f254409d = i4 + 1;
        this.f254413h = cArr2[i4];
    }

    /* renamed from: e */
    public final boolean mo122355e(char c) {
        if (this.f254413h != c) {
            return false;
        }
        mo122354d();
        return true;
    }

    /* renamed from: f */
    public final boolean mo122356f() {
        int i = this.f254413h;
        if (!(i >= 48 && i <= 57)) {
            return false;
        }
        mo122354d();
        return true;
    }

    /* renamed from: g */
    public final void mo122357g(char c) {
        if (!mo122355e(c)) {
            throw mo122353c("'" + c + "'");
        }
    }

    /* renamed from: h */
    public final String mo122358h() {
        mo122354d();
        mo122361k();
        while (true) {
            int i = this.f254413h;
            if (i == 34) {
                String a = mo122351a();
                mo122354d();
                return a;
            } else if (i == 92) {
                int i2 = i == -1 ? this.f254409d : this.f254409d - 1;
                StringBuilder sb = this.f254414i;
                char[] cArr = this.f254407b;
                int i3 = this.f254415j;
                sb.append(cArr, i3, i2 - i3);
                this.f254415j = -1;
                mo122354d();
                int i4 = this.f254413h;
                if (i4 == 34 || i4 == 47 || i4 == 92) {
                    this.f254414i.append((char) i4);
                } else if (i4 == 98) {
                    this.f254414i.append(8);
                } else if (i4 == 102) {
                    this.f254414i.append(12);
                } else if (i4 == 110) {
                    this.f254414i.append(10);
                } else if (i4 == 114) {
                    this.f254414i.append(13);
                } else if (i4 == 116) {
                    this.f254414i.append(9);
                } else if (i4 == 117) {
                    char[] cArr2 = new char[4];
                    int i5 = 0;
                    while (i5 < 4) {
                        mo122354d();
                        int i6 = this.f254413h;
                        if ((i6 >= 48 && i6 <= 57) || (i6 >= 97 && i6 <= 102) || (i6 >= 65 && i6 <= 70)) {
                            cArr2[i5] = (char) i6;
                            i5++;
                        } else {
                            throw mo122353c("hexadecimal digit");
                        }
                    }
                    this.f254414i.append((char) Integer.parseInt(new String(cArr2), 16));
                } else {
                    throw mo122353c("valid escape sequence");
                }
                mo122354d();
                mo122361k();
            } else if (i >= 32) {
                mo122354d();
            } else {
                throw mo122353c("valid string character");
            }
        }
    }

    /* renamed from: i */
    public final C87895h mo122359i() {
        int i = this.f254413h;
        if (i == 34) {
            return new C87894g(mo122358h());
        }
        if (i != 45) {
            if (i == 91) {
                mo122354d();
                C87885b bVar = new C87885b();
                mo122360j();
                if (!mo122355e(']')) {
                    do {
                        mo122360j();
                        bVar.mo122336k(mo122359i());
                        mo122360j();
                    } while (mo122355e(','));
                    if (!mo122355e(']')) {
                        throw mo122353c("',' or ']'");
                    }
                }
                return bVar;
            } else if (i == 102) {
                mo122354d();
                mo122357g('a');
                mo122357g('l');
                mo122357g('s');
                mo122357g('e');
                return C87884a.f254393c;
            } else if (i == 110) {
                mo122354d();
                mo122357g('u');
                mo122357g('l');
                mo122357g('l');
                return C87884a.f254391a;
            } else if (i == 116) {
                mo122354d();
                mo122357g('r');
                mo122357g('u');
                mo122357g('e');
                return C87884a.f254392b;
            } else if (i != 123) {
                switch (i) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    default:
                        throw mo122353c("value");
                }
            } else {
                mo122354d();
                C87889e eVar = new C87889e();
                mo122360j();
                if (!mo122355e('}')) {
                    do {
                        mo122360j();
                        if (this.f254413h == 34) {
                            String h = mo122358h();
                            mo122360j();
                            if (mo122355e(XVFSFile.PATH_SEPARATOR_CHAR)) {
                                mo122360j();
                                eVar.mo122343k(h, mo122359i());
                                mo122360j();
                            } else {
                                throw mo122353c("':'");
                            }
                        } else {
                            throw mo122353c("name");
                        }
                    } while (mo122355e(','));
                    if (!mo122355e('}')) {
                        throw mo122353c("',' or '}'");
                    }
                }
                return eVar;
            }
        }
        mo122361k();
        mo122355e('-');
        int i2 = this.f254413h;
        if (mo122356f()) {
            if (i2 != 48) {
                do {
                } while (mo122356f());
            }
            if (mo122355e('.')) {
                if (mo122356f()) {
                    do {
                    } while (mo122356f());
                } else {
                    throw mo122353c("digit");
                }
            }
            if (!mo122355e('e') && !mo122355e('E')) {
                return new C87888d(mo122351a());
            }
            if (!mo122355e('+')) {
                mo122355e('-');
            }
            if (mo122356f()) {
                do {
                } while (mo122356f());
                return new C87888d(mo122351a());
            }
            throw mo122353c("digit");
        }
        throw mo122353c("digit");
    }

    /* renamed from: j */
    public final void mo122360j() {
        while (true) {
            int i = this.f254413h;
            if (i == 32 || i == 9 || i == 10 || i == 13) {
                mo122354d();
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo122361k() {
        if (this.f254414i == null) {
            this.f254414i = new StringBuilder();
        }
        this.f254415j = this.f254409d - 1;
    }
}
