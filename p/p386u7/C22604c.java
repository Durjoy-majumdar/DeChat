package p386u7;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.thumbplayer.api.TPOptionalID;
import java.util.LinkedList;
import java.util.List;
import p333e8.C20528a;
import p333e8.C20540l;
import p333e8.C20541m;
import p383t7.C22439a;
import p383t7.C22442d;
import p383t7.C22447h;

/* renamed from: u7.c */
public final class C22604c extends C22607d {

    /* renamed from: f */
    public final C20541m f64972f = new C20541m();

    /* renamed from: g */
    public final C20540l f64973g = new C20540l();

    /* renamed from: h */
    public final int f64974h;

    /* renamed from: i */
    public final C22605a[] f64975i;

    /* renamed from: j */
    public C22605a f64976j;

    /* renamed from: k */
    public List<C22439a> f64977k;

    /* renamed from: l */
    public List<C22439a> f64978l;

    /* renamed from: m */
    public C22606b f64979m;

    /* renamed from: n */
    public int f64980n;

    /* renamed from: u7.c$a */
    public static final class C22605a {

        /* renamed from: A */
        public static final int[] f64981A = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: B */
        public static final boolean[] f64982B = {false, false, false, true, true, true, false};

        /* renamed from: C */
        public static final int[] f64983C;

        /* renamed from: D */
        public static final int[] f64984D = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: E */
        public static final int[] f64985E = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: F */
        public static final int[] f64986F;

        /* renamed from: w */
        public static final int f64987w = m26454c(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f64988x;

        /* renamed from: y */
        public static final int[] f64989y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z */
        public static final int[] f64990z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a */
        public final List<SpannableString> f64991a = new LinkedList();

        /* renamed from: b */
        public final SpannableStringBuilder f64992b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f64993c;

        /* renamed from: d */
        public boolean f64994d;

        /* renamed from: e */
        public int f64995e;

        /* renamed from: f */
        public boolean f64996f;

        /* renamed from: g */
        public int f64997g;

        /* renamed from: h */
        public int f64998h;

        /* renamed from: i */
        public int f64999i;

        /* renamed from: j */
        public int f65000j;

        /* renamed from: k */
        public boolean f65001k;

        /* renamed from: l */
        public int f65002l;

        /* renamed from: m */
        public int f65003m;

        /* renamed from: n */
        public int f65004n;

        /* renamed from: o */
        public int f65005o;

        /* renamed from: p */
        public int f65006p;

        /* renamed from: q */
        public int f65007q;

        /* renamed from: r */
        public int f65008r;

        /* renamed from: s */
        public int f65009s;

        /* renamed from: t */
        public int f65010t;

        /* renamed from: u */
        public int f65011u;

        /* renamed from: v */
        public int f65012v;

        static {
            int c = m26454c(0, 0, 0, 0);
            f64988x = c;
            int c2 = m26454c(0, 0, 0, 3);
            f64983C = new int[]{c, c2, c, c, c2, c, c};
            f64986F = new int[]{c, c, c, c, c, c2, c2};
        }

        public C22605a() {
            mo35727d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m26454c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p333e8.C20528a.m22239c(r4, r0, r1)
                p333e8.C20528a.m22239c(r5, r0, r1)
                p333e8.C20528a.m22239c(r6, r0, r1)
                p333e8.C20528a.m22239c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p386u7.C22604c.C22605a.m26454c(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo35725a(char c) {
            if (c == 10) {
                ((LinkedList) this.f64991a).add(mo35726b());
                this.f64992b.clear();
                if (this.f65006p != -1) {
                    this.f65006p = 0;
                }
                if (this.f65007q != -1) {
                    this.f65007q = 0;
                }
                if (this.f65008r != -1) {
                    this.f65008r = 0;
                }
                if (this.f65010t != -1) {
                    this.f65010t = 0;
                }
                while (true) {
                    if ((this.f65001k && ((LinkedList) this.f64991a).size() >= this.f65000j) || ((LinkedList) this.f64991a).size() >= 15) {
                        ((LinkedList) this.f64991a).remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f64992b.append(c);
            }
        }

        /* renamed from: b */
        public SpannableString mo35726b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f64992b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f65006p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f65006p, length, 33);
                }
                if (this.f65007q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f65007q, length, 33);
                }
                if (this.f65008r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f65009s), this.f65008r, length, 33);
                }
                if (this.f65010t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f65011u), this.f65010t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public void mo35727d() {
            ((LinkedList) this.f64991a).clear();
            this.f64992b.clear();
            this.f65006p = -1;
            this.f65007q = -1;
            this.f65008r = -1;
            this.f65010t = -1;
            this.f65012v = 0;
            this.f64993c = false;
            this.f64994d = false;
            this.f64995e = 4;
            this.f64996f = false;
            this.f64997g = 0;
            this.f64998h = 0;
            this.f64999i = 0;
            this.f65000j = 15;
            this.f65001k = true;
            this.f65002l = 0;
            this.f65003m = 0;
            this.f65004n = 0;
            int i = f64988x;
            this.f65005o = i;
            this.f65009s = f64987w;
            this.f65011u = i;
        }

        /* renamed from: e */
        public void mo35728e(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f65006p != -1) {
                if (!z) {
                    this.f64992b.setSpan(new StyleSpan(2), this.f65006p, this.f64992b.length(), 33);
                    this.f65006p = -1;
                }
            } else if (z) {
                this.f65006p = this.f64992b.length();
            }
            if (this.f65007q != -1) {
                if (!z2) {
                    this.f64992b.setSpan(new UnderlineSpan(), this.f65007q, this.f64992b.length(), 33);
                    this.f65007q = -1;
                }
            } else if (z2) {
                this.f65007q = this.f64992b.length();
            }
        }

        /* renamed from: f */
        public void mo35729f(int i, int i2, int i3) {
            if (!(this.f65008r == -1 || this.f65009s == i)) {
                this.f64992b.setSpan(new ForegroundColorSpan(this.f65009s), this.f65008r, this.f64992b.length(), 33);
            }
            if (i != f64987w) {
                this.f65008r = this.f64992b.length();
                this.f65009s = i;
            }
            if (!(this.f65010t == -1 || this.f65011u == i2)) {
                this.f64992b.setSpan(new BackgroundColorSpan(this.f65011u), this.f65010t, this.f64992b.length(), 33);
            }
            if (i2 != f64988x) {
                this.f65010t = this.f64992b.length();
                this.f65011u = i2;
            }
        }
    }

    /* renamed from: u7.c$b */
    public static final class C22606b {

        /* renamed from: a */
        public final int f65013a;

        /* renamed from: b */
        public final byte[] f65014b;

        /* renamed from: c */
        public int f65015c = 0;

        public C22606b(int i, int i2) {
            this.f65013a = i2;
            this.f65014b = new byte[((i2 * 2) - 1)];
        }
    }

    public C22604c(int i) {
        this.f64974h = i == -1 ? 1 : i;
        this.f64975i = new C22605a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f64975i[i2] = new C22605a();
        }
        this.f64976j = this.f64975i[0];
        mo35724i();
    }

    /* renamed from: d */
    public C22442d mo35708d() {
        List<C22439a> list = this.f64977k;
        this.f64978l = list;
        return new C22609f(list);
    }

    /* renamed from: e */
    public void mo35709e(C22447h hVar) {
        this.f64972f.mo32111v(hVar.f67260f.array(), hVar.f67260f.limit());
        while (true) {
            C20541m mVar = this.f64972f;
            if (mVar.f57811c - mVar.f57810b >= 3) {
                int n = mVar.mo32103n() & 7;
                int i = n & 3;
                boolean z = false;
                boolean z2 = (n & 4) == 4;
                byte n2 = (byte) this.f64972f.mo32103n();
                byte n3 = (byte) this.f64972f.mo32103n();
                if ((i == 2 || i == 3) && z2) {
                    if (i == 3) {
                        mo35722g();
                        int i2 = (n2 & 192) >> 6;
                        byte b = n2 & 63;
                        if (b == 0) {
                            b = 64;
                        }
                        C22606b bVar = new C22606b(i2, b);
                        this.f64979m = bVar;
                        byte[] bArr = bVar.f65014b;
                        int i3 = bVar.f65015c;
                        bVar.f65015c = i3 + 1;
                        bArr[i3] = n3;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C20528a.m22237a(z);
                        C22606b bVar2 = this.f64979m;
                        if (bVar2 != null) {
                            byte[] bArr2 = bVar2.f65014b;
                            int i4 = bVar2.f65015c;
                            int i5 = i4 + 1;
                            bArr2[i4] = n2;
                            bVar2.f65015c = i5 + 1;
                            bArr2[i5] = n3;
                        }
                    }
                    C22606b bVar3 = this.f64979m;
                    if (bVar3.f65015c == (bVar3.f65013a * 2) - 1) {
                        mo35722g();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public boolean mo35710f() {
        return this.f64977k != this.f64978l;
    }

    public void flush() {
        super.flush();
        this.f64977k = null;
        this.f64978l = null;
        this.f64980n = 0;
        this.f64976j = this.f64975i[0];
        mo35724i();
        this.f64979m = null;
    }

    /* renamed from: g */
    public final void mo35722g() {
        C22606b bVar = this.f64979m;
        if (bVar != null) {
            int i = bVar.f65015c;
            if (i == (bVar.f65013a * 2) - 1) {
                C20540l lVar = this.f64973g;
                lVar.f57805a = bVar.f65014b;
                lVar.f57806b = 0;
                lVar.f57807c = 0;
                lVar.f57808d = i;
                int d = lVar.mo32087d(3);
                int d2 = this.f64973g.mo32087d(5);
                int i2 = 7;
                int i3 = 6;
                if (d == 7) {
                    this.f64973g.mo32089f(2);
                    d += this.f64973g.mo32087d(6);
                }
                if (d2 != 0 && d == this.f64974h) {
                    boolean z = false;
                    while (this.f64973g.mo32085b() > 0) {
                        int d3 = this.f64973g.mo32087d(8);
                        if (d3 == 16) {
                            int d4 = this.f64973g.mo32087d(8);
                            if (d4 <= 31) {
                                if (d4 > 7) {
                                    if (d4 <= 15) {
                                        this.f64973g.mo32089f(8);
                                    } else if (d4 <= 23) {
                                        this.f64973g.mo32089f(16);
                                    } else if (d4 <= 31) {
                                        this.f64973g.mo32089f(24);
                                    }
                                }
                            } else if (d4 <= 127) {
                                if (d4 == 32) {
                                    this.f64976j.mo35725a(' ');
                                } else if (d4 == 33) {
                                    this.f64976j.mo35725a(160);
                                } else if (d4 == 37) {
                                    this.f64976j.mo35725a(8230);
                                } else if (d4 == 42) {
                                    this.f64976j.mo35725a(352);
                                } else if (d4 == 44) {
                                    this.f64976j.mo35725a(338);
                                } else if (d4 == 63) {
                                    this.f64976j.mo35725a(376);
                                } else if (d4 == 57) {
                                    this.f64976j.mo35725a(8482);
                                } else if (d4 == 58) {
                                    this.f64976j.mo35725a(353);
                                } else if (d4 == 60) {
                                    this.f64976j.mo35725a(339);
                                } else if (d4 != 61) {
                                    switch (d4) {
                                        case 48:
                                            this.f64976j.mo35725a(9608);
                                            break;
                                        case 49:
                                            this.f64976j.mo35725a(8216);
                                            break;
                                        case 50:
                                            this.f64976j.mo35725a(8217);
                                            break;
                                        case 51:
                                            this.f64976j.mo35725a(8220);
                                            break;
                                        case 52:
                                            this.f64976j.mo35725a(8221);
                                            break;
                                        case 53:
                                            this.f64976j.mo35725a(8226);
                                            break;
                                        default:
                                            switch (d4) {
                                                case 118:
                                                    this.f64976j.mo35725a(8539);
                                                    break;
                                                case 119:
                                                    this.f64976j.mo35725a(8540);
                                                    break;
                                                case 120:
                                                    this.f64976j.mo35725a(8541);
                                                    break;
                                                case 121:
                                                    this.f64976j.mo35725a(8542);
                                                    break;
                                                case 122:
                                                    this.f64976j.mo35725a(9474);
                                                    break;
                                                case 123:
                                                    this.f64976j.mo35725a(9488);
                                                    break;
                                                case 124:
                                                    this.f64976j.mo35725a(9492);
                                                    break;
                                                case 125:
                                                    this.f64976j.mo35725a(9472);
                                                    break;
                                                case 126:
                                                    this.f64976j.mo35725a(9496);
                                                    break;
                                                case 127:
                                                    this.f64976j.mo35725a(9484);
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f64976j.mo35725a(8480);
                                }
                                z = true;
                            } else {
                                if (d4 <= 159) {
                                    if (d4 <= 135) {
                                        this.f64973g.mo32089f(32);
                                    } else if (d4 <= 143) {
                                        this.f64973g.mo32089f(40);
                                    } else if (d4 <= 159) {
                                        this.f64973g.mo32089f(2);
                                        this.f64973g.mo32089f(this.f64973g.mo32087d(6) * 8);
                                    }
                                } else if (d4 <= 255) {
                                    if (d4 == 160) {
                                        this.f64976j.mo35725a(13252);
                                    } else {
                                        this.f64976j.mo35725a('_');
                                    }
                                    z = true;
                                }
                                i2 = 7;
                                i3 = 6;
                            }
                        } else if (d3 <= 31) {
                            if (d3 != 0) {
                                if (d3 == 3) {
                                    this.f64977k = mo35723h();
                                } else if (d3 != 8) {
                                    switch (d3) {
                                        case 12:
                                            mo35724i();
                                            break;
                                        case 13:
                                            this.f64976j.mo35725a(10);
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (d3 < 17 || d3 > 23) {
                                                if (d3 >= 24 && d3 <= 31) {
                                                    this.f64973g.mo32089f(16);
                                                    break;
                                                }
                                            } else {
                                                this.f64973g.mo32089f(8);
                                                break;
                                            }
                                    }
                                } else {
                                    C22605a aVar = this.f64976j;
                                    int length = aVar.f64992b.length();
                                    if (length > 0) {
                                        aVar.f64992b.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (d3 <= 127) {
                            if (d3 == 127) {
                                this.f64976j.mo35725a(9835);
                            } else {
                                this.f64976j.mo35725a((char) (d3 & 255));
                            }
                            z = true;
                        } else {
                            if (d3 <= 159) {
                                switch (d3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i4 = d3 - 128;
                                        if (this.f64980n != i4) {
                                            this.f64980n = i4;
                                            this.f64976j = this.f64975i[i4];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (this.f64973g.mo32086c()) {
                                                C22605a aVar2 = this.f64975i[8 - i5];
                                                ((LinkedList) aVar2.f64991a).clear();
                                                aVar2.f64992b.clear();
                                                aVar2.f65006p = -1;
                                                aVar2.f65007q = -1;
                                                aVar2.f65008r = -1;
                                                aVar2.f65010t = -1;
                                                aVar2.f65012v = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (this.f64973g.mo32086c()) {
                                                this.f64975i[8 - i6].f64994d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (this.f64973g.mo32086c()) {
                                                this.f64975i[8 - i7].f64994d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (this.f64973g.mo32086c()) {
                                                C22605a aVar3 = this.f64975i[8 - i8];
                                                aVar3.f64994d = !aVar3.f64994d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (this.f64973g.mo32086c()) {
                                                this.f64975i[8 - i9].mo35727d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        this.f64973g.mo32089f(8);
                                        break;
                                    case TPOptionalID.f349338xc9bdf6cd /*143*/:
                                        mo35724i();
                                        break;
                                    case 144:
                                        if (this.f64976j.f64993c) {
                                            this.f64976j.mo35728e(this.f64973g.mo32087d(4), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32086c(), this.f64973g.mo32086c(), this.f64973g.mo32087d(3), this.f64973g.mo32087d(3));
                                            break;
                                        } else {
                                            this.f64973g.mo32089f(16);
                                            break;
                                        }
                                    case 145:
                                        if (this.f64976j.f64993c) {
                                            int c = C22605a.m26454c(this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2));
                                            int c2 = C22605a.m26454c(this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2));
                                            this.f64973g.mo32089f(2);
                                            this.f64976j.mo35729f(c, c2, C22605a.m26454c(this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), 0));
                                            break;
                                        } else {
                                            this.f64973g.mo32089f(24);
                                            break;
                                        }
                                    case 146:
                                        if (this.f64976j.f64993c) {
                                            this.f64973g.mo32089f(4);
                                            int d5 = this.f64973g.mo32087d(4);
                                            this.f64973g.mo32089f(2);
                                            this.f64973g.mo32087d(6);
                                            C22605a aVar4 = this.f64976j;
                                            if (aVar4.f65012v != d5) {
                                                aVar4.mo35725a(10);
                                            }
                                            aVar4.f65012v = d5;
                                            break;
                                        } else {
                                            this.f64973g.mo32089f(16);
                                            break;
                                        }
                                    case 151:
                                        if (this.f64976j.f64993c) {
                                            int c3 = C22605a.m26454c(this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2));
                                            this.f64973g.mo32087d(2);
                                            C22605a.m26454c(this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), this.f64973g.mo32087d(2), 0);
                                            this.f64973g.mo32086c();
                                            this.f64973g.mo32086c();
                                            this.f64973g.mo32087d(2);
                                            this.f64973g.mo32087d(2);
                                            int d6 = this.f64973g.mo32087d(2);
                                            this.f64973g.mo32089f(8);
                                            C22605a aVar5 = this.f64976j;
                                            aVar5.f65005o = c3;
                                            aVar5.f65002l = d6;
                                            break;
                                        } else {
                                            this.f64973g.mo32089f(32);
                                            break;
                                        }
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i15 = d3 - 152;
                                        C22605a aVar6 = this.f64975i[i15];
                                        this.f64973g.mo32089f(2);
                                        boolean c4 = this.f64973g.mo32086c();
                                        boolean c5 = this.f64973g.mo32086c();
                                        this.f64973g.mo32086c();
                                        int d7 = this.f64973g.mo32087d(3);
                                        boolean c6 = this.f64973g.mo32086c();
                                        int d8 = this.f64973g.mo32087d(i2);
                                        int d9 = this.f64973g.mo32087d(8);
                                        int d15 = this.f64973g.mo32087d(4);
                                        int d16 = this.f64973g.mo32087d(4);
                                        this.f64973g.mo32089f(2);
                                        this.f64973g.mo32087d(i3);
                                        this.f64973g.mo32089f(2);
                                        int d17 = this.f64973g.mo32087d(3);
                                        int d18 = this.f64973g.mo32087d(3);
                                        aVar6.f64993c = true;
                                        aVar6.f64994d = c4;
                                        aVar6.f65001k = c5;
                                        aVar6.f64995e = d7;
                                        aVar6.f64996f = c6;
                                        aVar6.f64997g = d8;
                                        aVar6.f64998h = d9;
                                        aVar6.f64999i = d15;
                                        int i16 = d16 + 1;
                                        if (aVar6.f65000j != i16) {
                                            aVar6.f65000j = i16;
                                            while (true) {
                                                if ((c5 && ((LinkedList) aVar6.f64991a).size() >= aVar6.f65000j) || ((LinkedList) aVar6.f64991a).size() >= 15) {
                                                    ((LinkedList) aVar6.f64991a).remove(0);
                                                }
                                            }
                                        }
                                        if (!(d17 == 0 || aVar6.f65003m == d17)) {
                                            aVar6.f65003m = d17;
                                            int i17 = d17 - 1;
                                            int i18 = C22605a.f64983C[i17];
                                            boolean z2 = C22605a.f64982B[i17];
                                            int i19 = C22605a.f64990z[i17];
                                            int i25 = C22605a.f64981A[i17];
                                            int i26 = C22605a.f64989y[i17];
                                            aVar6.f65005o = i18;
                                            aVar6.f65002l = i26;
                                        }
                                        if (!(d18 == 0 || aVar6.f65004n == d18)) {
                                            aVar6.f65004n = d18;
                                            int i27 = d18 - 1;
                                            aVar6.mo35728e(0, 1, 1, false, false, C22605a.f64985E[i27], C22605a.f64984D[i27]);
                                            aVar6.mo35729f(C22605a.f64987w, C22605a.f64986F[i27], C22605a.f64988x);
                                        }
                                        if (this.f64980n != i15) {
                                            this.f64980n = i15;
                                            this.f64976j = this.f64975i[i15];
                                            break;
                                        }
                                        break;
                                }
                            } else if (d3 <= 255) {
                                this.f64976j.mo35725a((char) (d3 & 255));
                            }
                            z = true;
                        }
                        i2 = 7;
                        i3 = 6;
                    }
                    if (z) {
                        this.f64977k = mo35723h();
                    }
                }
            }
            this.f64979m = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p383t7.C22439a> mo35723h() {
        /*
            r19 = this;
            r0 = r19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0009:
            r4 = 8
            if (r3 >= r4) goto L_0x0118
            u7.c$a[] r4 = r0.f64975i
            r4 = r4[r3]
            boolean r5 = r4.f64993c
            r6 = 1
            if (r5 == 0) goto L_0x0029
            java.util.List<android.text.SpannableString> r5 = r4.f64991a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0027
            android.text.SpannableStringBuilder r4 = r4.f64992b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 != 0) goto L_0x0114
            u7.c$a[] r4 = r0.f64975i
            r4 = r4[r3]
            boolean r5 = r4.f64994d
            if (r5 == 0) goto L_0x0114
            boolean r5 = r4.f64993c
            if (r5 == 0) goto L_0x004b
            java.util.List<android.text.SpannableString> r5 = r4.f64991a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0049
            android.text.SpannableStringBuilder r5 = r4.f64992b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r5 = 0
            goto L_0x004c
        L_0x004b:
            r5 = 1
        L_0x004c:
            if (r5 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0111
        L_0x0051:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r5 = 0
        L_0x0057:
            java.util.List<android.text.SpannableString> r8 = r4.f64991a
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x0076
            java.util.List<android.text.SpannableString> r8 = r4.f64991a
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            java.lang.Object r8 = r8.get(r5)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.append(r8)
            r8 = 10
            r7.append(r8)
            int r5 = r5 + 1
            goto L_0x0057
        L_0x0076:
            android.text.SpannableString r5 = r4.mo35726b()
            r7.append(r5)
            int r5 = r4.f65002l
            r8 = 2
            if (r5 == 0) goto L_0x00a9
            if (r5 == r6) goto L_0x00a6
            if (r5 == r8) goto L_0x00a3
            r9 = 3
            if (r5 != r9) goto L_0x008a
            goto L_0x00a9
        L_0x008a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected justification value: "
            r2.append(r3)
            int r3 = r4.f65002l
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a3:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x00ab
        L_0x00a6:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00ab
        L_0x00a9:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x00ab:
            r9 = r5
            boolean r5 = r4.f64996f
            if (r5 == 0) goto L_0x00bb
            int r5 = r4.f64998h
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.f64997g
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x00c8
        L_0x00bb:
            int r5 = r4.f64998h
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.f64997g
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x00c8:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r5 = r4.f64999i
            int r11 = r5 % 3
            if (r11 != 0) goto L_0x00de
            r11 = 0
            goto L_0x00e3
        L_0x00de:
            if (r11 != r6) goto L_0x00e2
            r11 = 1
            goto L_0x00e3
        L_0x00e2:
            r11 = 2
        L_0x00e3:
            int r5 = r5 / 3
            if (r5 != 0) goto L_0x00e9
            r12 = 0
            goto L_0x00ee
        L_0x00e9:
            if (r5 != r6) goto L_0x00ed
            r12 = 1
            goto L_0x00ee
        L_0x00ed:
            r12 = 2
        L_0x00ee:
            int r15 = r4.f65005o
            int r5 = p386u7.C22604c.C22605a.f64988x
            if (r15 == r5) goto L_0x00f6
            r14 = 1
            goto L_0x00f7
        L_0x00f6:
            r14 = 0
        L_0x00f7:
            u7.b r17 = new u7.b
            r16 = 0
            r18 = 1
            int r4 = r4.f64995e
            r5 = r17
            r6 = r7
            r7 = r9
            r8 = r10
            r9 = r16
            r10 = r11
            r11 = r13
            r13 = r18
            r16 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r17
        L_0x0111:
            r1.add(r4)
        L_0x0114:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0118:
            java.util.Collections.sort(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p386u7.C22604c.mo35723h():java.util.List");
    }

    /* renamed from: i */
    public final void mo35724i() {
        for (int i = 0; i < 8; i++) {
            this.f64975i[i].mo35727d();
        }
    }
}
