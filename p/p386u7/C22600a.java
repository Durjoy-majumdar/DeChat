package p386u7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.util.WXWebReporter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p333e8.C20541m;
import p383t7.C22439a;
import p383t7.C22442d;
import p383t7.C22447h;

/* renamed from: u7.a */
public final class C22600a extends C22607d {

    /* renamed from: r */
    public static final int[] f64939r = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: s */
    public static final int[] f64940s = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: t */
    public static final int[] f64941t = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: u */
    public static final int[] f64942u = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: v */
    public static final int[] f64943v = {WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD, 191, 8482, 162, 163, 9834, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 32, 232, 226, 234, WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC, 244, 251};

    /* renamed from: w */
    public static final int[] f64944w = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE, 200, 202, 203, 235, 206, 207, WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, 212, 217, 249, 219, 171, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED};

    /* renamed from: x */
    public static final int[] f64945x = {195, WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, 205, 204, 236, 210, 242, 213, WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, 123, 125, 92, 94, 95, 124, 126, 196, 228, JsApiCheckIsSupportFaceDetect.CTRL_INDEX, WXWebReporter.KEY_NEW_FAILED_CANT_FIX, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, 165, 164, 9474, WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA, 229, 216, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, 9484, 9488, 9492, 9496};

    /* renamed from: f */
    public final C20541m f64946f = new C20541m();

    /* renamed from: g */
    public final int f64947g;

    /* renamed from: h */
    public final int f64948h;

    /* renamed from: i */
    public final LinkedList<C22601a> f64949i = new LinkedList<>();

    /* renamed from: j */
    public C22601a f64950j = new C22601a(0, 4);

    /* renamed from: k */
    public List<C22439a> f64951k;

    /* renamed from: l */
    public List<C22439a> f64952l;

    /* renamed from: m */
    public int f64953m;

    /* renamed from: n */
    public int f64954n;

    /* renamed from: o */
    public boolean f64955o;

    /* renamed from: p */
    public byte f64956p;

    /* renamed from: q */
    public byte f64957q;

    /* renamed from: u7.a$a */
    public static class C22601a {

        /* renamed from: a */
        public final List<CharacterStyle> f64958a = new ArrayList();

        /* renamed from: b */
        public final List<C22602a> f64959b = new ArrayList();

        /* renamed from: c */
        public final List<SpannableString> f64960c = new LinkedList();

        /* renamed from: d */
        public final SpannableStringBuilder f64961d = new SpannableStringBuilder();

        /* renamed from: e */
        public int f64962e;

        /* renamed from: f */
        public int f64963f;

        /* renamed from: g */
        public int f64964g;

        /* renamed from: h */
        public int f64965h;

        /* renamed from: i */
        public int f64966i;

        /* renamed from: j */
        public int f64967j;

        /* renamed from: u7.a$a$a */
        public static class C22602a {

            /* renamed from: a */
            public final CharacterStyle f64968a;

            /* renamed from: b */
            public final int f64969b;

            /* renamed from: c */
            public final int f64970c;

            public C22602a(CharacterStyle characterStyle, int i, int i2) {
                this.f64968a = characterStyle;
                this.f64969b = i;
                this.f64970c = i2;
            }
        }

        public C22601a(int i, int i2) {
            mo35718c(i, i2);
        }

        /* renamed from: a */
        public SpannableString mo35716a() {
            int i;
            int length = this.f64961d.length();
            for (int i2 = 0; i2 < ((ArrayList) this.f64958a).size(); i2++) {
                this.f64961d.setSpan(((ArrayList) this.f64958a).get(i2), 0, length, 33);
            }
            for (int i3 = 0; i3 < ((ArrayList) this.f64959b).size(); i3++) {
                C22602a aVar = (C22602a) ((ArrayList) this.f64959b).get(i3);
                int size = ((ArrayList) this.f64959b).size();
                int i4 = aVar.f64970c;
                if (i3 < size - i4) {
                    i = ((C22602a) ((ArrayList) this.f64959b).get(i4 + i3)).f64969b;
                } else {
                    i = length;
                }
                this.f64961d.setSpan(aVar.f64968a, aVar.f64969b, i, 33);
            }
            if (this.f64967j != -1) {
                this.f64961d.setSpan(new UnderlineSpan(), this.f64967j, length, 33);
            }
            return new SpannableString(this.f64961d);
        }

        /* renamed from: b */
        public boolean mo35717b() {
            return ((ArrayList) this.f64958a).isEmpty() && ((ArrayList) this.f64959b).isEmpty() && this.f64960c.isEmpty() && this.f64961d.length() == 0;
        }

        /* renamed from: c */
        public void mo35718c(int i, int i2) {
            this.f64958a.clear();
            this.f64959b.clear();
            this.f64960c.clear();
            this.f64961d.clear();
            this.f64962e = 15;
            this.f64963f = 0;
            this.f64964g = 0;
            this.f64965h = i;
            this.f64966i = i2;
            this.f64967j = -1;
        }

        /* renamed from: d */
        public void mo35719d(CharacterStyle characterStyle, int i) {
            ((ArrayList) this.f64959b).add(new C22602a(characterStyle, this.f64961d.length(), i));
        }

        public String toString() {
            return this.f64961d.toString();
        }
    }

    public C22600a(String str, int i) {
        this.f64947g = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.f64948h = 2;
        } else {
            this.f64948h = 1;
        }
        mo35714i(0);
        mo35713h();
    }

    /* renamed from: d */
    public C22442d mo35708d() {
        List<C22439a> list = this.f64951k;
        this.f64952l = list;
        return new C22609f(list);
    }

    /* renamed from: e */
    public void mo35709e(C22447h hVar) {
        int i;
        C22447h hVar2 = hVar;
        this.f64946f.mo32111v(hVar2.f67260f.array(), hVar2.f67260f.limit());
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            C20541m mVar = this.f64946f;
            int i2 = mVar.f57811c - mVar.f57810b;
            int i3 = this.f64947g;
            if (i2 >= i3) {
                byte n = i3 == 2 ? -4 : (byte) mVar.mo32103n();
                byte n2 = (byte) (this.f64946f.mo32103n() & 127);
                byte n3 = (byte) (this.f64946f.mo32103n() & 127);
                if ((n & 6) == 4 && (((i = this.f64948h) != 1 || (n & 1) == 0) && ((i != 2 || (n & 1) == 1) && !(n2 == 0 && n3 == 0)))) {
                    byte b = n2 & 247;
                    if (b == 17 && (n3 & 240) == 48) {
                        this.f64950j.f64961d.append((char) f64943v[n3 & 15]);
                    } else if ((n2 & 246) == 18 && (n3 & 224) == 32) {
                        C22601a aVar = this.f64950j;
                        int length = aVar.f64961d.length();
                        if (length > 0) {
                            aVar.f64961d.delete(length - 1, length);
                        }
                        if ((n2 & 1) == 0) {
                            this.f64950j.f64961d.append((char) f64944w[n3 & 31]);
                        } else {
                            this.f64950j.f64961d.append((char) f64945x[n3 & 31]);
                        }
                    } else if ((n2 & 224) == 0) {
                        byte b2 = n2 & 240;
                        boolean z4 = b2 == 16;
                        if (z4) {
                            if (this.f64955o && this.f64956p == n2 && this.f64957q == n3) {
                                this.f64955o = z;
                                z3 = true;
                            } else {
                                this.f64955o = true;
                                this.f64956p = n2;
                                this.f64957q = n3;
                            }
                        }
                        if (b == 17 && (n3 & 240) == 32) {
                            boolean z5 = (n3 & 1) == 1;
                            C22601a aVar2 = this.f64950j;
                            if (z5) {
                                aVar2.f64967j = aVar2.f64961d.length();
                            } else if (aVar2.f64967j != -1) {
                                aVar2.f64961d.setSpan(new UnderlineSpan(), aVar2.f64967j, aVar2.f64961d.length(), 33);
                                aVar2.f64967j = -1;
                            }
                            int i4 = (n3 >> 1) & 15;
                            if (i4 == 7) {
                                this.f64950j.mo35719d(new StyleSpan(2), 2);
                                this.f64950j.mo35719d(new ForegroundColorSpan(-1), 1);
                            } else {
                                this.f64950j.mo35719d(new ForegroundColorSpan(f64941t[i4]), 1);
                            }
                        } else {
                            if (b2 == 16 && (n3 & 192) == 64) {
                                int i5 = f64939r[n2 & 7];
                                if ((n3 & 32) != 0) {
                                    i5++;
                                }
                                C22601a aVar3 = this.f64950j;
                                if (i5 != aVar3.f64962e) {
                                    if (this.f64953m != 1 && !aVar3.mo35717b()) {
                                        C22601a aVar4 = new C22601a(this.f64953m, this.f64954n);
                                        this.f64950j = aVar4;
                                        this.f64949i.add(aVar4);
                                    }
                                    this.f64950j.f64962e = i5;
                                }
                                if ((n3 & 1) == 1) {
                                    ((ArrayList) this.f64950j.f64958a).add(new UnderlineSpan());
                                }
                                int i6 = (n3 >> 1) & 15;
                                if (i6 > 7) {
                                    this.f64950j.f64963f = f64940s[i6 & 7];
                                } else if (i6 == 7) {
                                    ((ArrayList) this.f64950j.f64958a).add(new StyleSpan(2));
                                    ((ArrayList) this.f64950j.f64958a).add(new ForegroundColorSpan(-1));
                                } else {
                                    ((ArrayList) this.f64950j.f64958a).add(new ForegroundColorSpan(f64941t[i6]));
                                }
                            } else {
                                if (b == 23 && n3 >= 33 && n3 <= 35) {
                                    this.f64950j.f64964g = n3 - 32;
                                } else {
                                    if (b == 20 && (n3 & 240) == 32) {
                                        if (n3 == 32) {
                                            mo35714i(2);
                                        } else if (n3 != 41) {
                                            switch (n3) {
                                                case 37:
                                                    this.f64954n = 2;
                                                    mo35714i(1);
                                                    break;
                                                case 38:
                                                    this.f64954n = 3;
                                                    mo35714i(1);
                                                    break;
                                                case 39:
                                                    this.f64954n = 4;
                                                    mo35714i(1);
                                                    break;
                                                default:
                                                    int i7 = this.f64953m;
                                                    if (i7 != 0) {
                                                        if (n3 == 33) {
                                                            C22601a aVar5 = this.f64950j;
                                                            int length2 = aVar5.f64961d.length();
                                                            if (length2 > 0) {
                                                                aVar5.f64961d.delete(length2 - 1, length2);
                                                                break;
                                                            }
                                                        } else {
                                                            switch (n3) {
                                                                case 44:
                                                                    this.f64951k = null;
                                                                    if (i7 == 1 || i7 == 3) {
                                                                        mo35713h();
                                                                        break;
                                                                    }
                                                                case 45:
                                                                    if (i7 == 1 && !this.f64950j.mo35717b()) {
                                                                        C22601a aVar6 = this.f64950j;
                                                                        ((LinkedList) aVar6.f64960c).add(aVar6.mo35716a());
                                                                        aVar6.f64961d.clear();
                                                                        ((ArrayList) aVar6.f64958a).clear();
                                                                        ((ArrayList) aVar6.f64959b).clear();
                                                                        aVar6.f64967j = -1;
                                                                        int min = Math.min(aVar6.f64966i, aVar6.f64962e);
                                                                        while (((LinkedList) aVar6.f64960c).size() >= min) {
                                                                            ((LinkedList) aVar6.f64960c).remove(0);
                                                                        }
                                                                        break;
                                                                    }
                                                                case 46:
                                                                    mo35713h();
                                                                    break;
                                                                case 47:
                                                                    this.f64951k = mo35712g();
                                                                    mo35713h();
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        } else {
                                            mo35714i(3);
                                        }
                                    }
                                }
                            }
                        }
                        z3 = z4;
                    } else {
                        C22601a aVar7 = this.f64950j;
                        int[] iArr = f64942u;
                        aVar7.f64961d.append((char) iArr[(n2 & Byte.MAX_VALUE) - 32]);
                        if ((n3 & 224) != 0) {
                            this.f64950j.f64961d.append((char) iArr[(n3 & Byte.MAX_VALUE) - 32]);
                        }
                    }
                    z = false;
                    z2 = true;
                }
            } else if (z2) {
                if (!z3) {
                    this.f64955o = false;
                }
                int i8 = this.f64953m;
                if (i8 == 1 || i8 == 3) {
                    this.f64951k = mo35712g();
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public boolean mo35710f() {
        return this.f64951k != this.f64952l;
    }

    public void flush() {
        super.flush();
        this.f64951k = null;
        this.f64952l = null;
        mo35714i(0);
        mo35713h();
        this.f64954n = 4;
        this.f64955o = false;
        this.f64956p = 0;
        this.f64957q = 0;
    }

    /* renamed from: g */
    public final List<C22439a> mo35712g() {
        C22439a aVar;
        int i;
        float f;
        int i2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.f64949i.size(); i3++) {
            C22601a aVar2 = this.f64949i.get(i3);
            aVar2.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < ((LinkedList) aVar2.f64960c).size(); i4++) {
                spannableStringBuilder.append((CharSequence) ((LinkedList) aVar2.f64960c).get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(aVar2.mo35716a());
            if (spannableStringBuilder.length() == 0) {
                aVar = null;
            } else {
                int i5 = aVar2.f64963f + aVar2.f64964g;
                int length = (32 - i5) - spannableStringBuilder.length();
                int i6 = i5 - length;
                int i7 = 2;
                if (aVar2.f64965h == 2 && Math.abs(i6) < 3) {
                    f = 0.5f;
                    i = 1;
                } else if (aVar2.f64965h != 2 || i6 <= 0) {
                    f = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
                    i = 0;
                } else {
                    f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                    i = 2;
                }
                if (aVar2.f64965h == 1 || (i2 = aVar2.f64962e) > 7) {
                    i2 = (aVar2.f64962e - 15) - 2;
                } else {
                    i7 = 0;
                }
                aVar = new C22439a(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i2, 1, i7, f, i, Float.MIN_VALUE);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo35713h() {
        this.f64950j.mo35718c(this.f64953m, this.f64954n);
        this.f64949i.clear();
        this.f64949i.add(this.f64950j);
    }

    /* renamed from: i */
    public final void mo35714i(int i) {
        int i2 = this.f64953m;
        if (i2 != i) {
            this.f64953m = i;
            mo35713h();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f64951k = null;
            }
        }
    }

    public void release() {
    }
}
