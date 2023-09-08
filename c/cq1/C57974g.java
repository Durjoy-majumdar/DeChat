package cq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import java.util.Locale;
import lv1.C99672i;
import lv1.C99681n;
import p255vr.C65873e;
import rx3.C13598b0;
import sx3.C110823p;
import zb2.C66777a;

/* renamed from: cq1.g */
public class C57974g extends C66777a<C57974g> {

    /* renamed from: d */
    public final int f165884d;

    /* renamed from: e */
    public final C72996z1 f165885e;

    /* renamed from: f */
    public final int f165886f;

    /* renamed from: g */
    public C99681n f165887g;

    /* renamed from: h */
    public C99672i f165888h;

    /* renamed from: i */
    public boolean f165889i;

    /* renamed from: j */
    public int f165890j = 127;

    /* renamed from: n */
    public String f165891n = "";

    /* renamed from: o */
    public String f165892o = "";

    /* renamed from: p */
    public String f165893p = "";

    public C57974g(int i, C72996z1 z1Var, int i2) {
        C87412m.m108594g(z1Var, "contact");
        this.f165884d = i;
        this.f165885e = z1Var;
        this.f165886f = i2;
        mo82771b();
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f165885e.getUsername() + '-' + this.f165886f;
    }

    /* renamed from: b */
    public void mo82771b() {
        String str;
        C13598b0 b0Var;
        boolean z = true;
        if (this.f165886f == 1) {
            String n2 = !Util.isNullOrNil(this.f165885e.mo73969n2()) ? this.f165885e.mo73969n2() : this.f165885e.mo62909j3();
            if (n2 != null) {
                Locale locale = Locale.getDefault();
                C87412m.m108593f(locale, "getDefault()");
                str = n2.toUpperCase(locale);
                C87412m.m108593f(str, "this as java.lang.String).toUpperCase(locale)");
            } else {
                str = "";
            }
            String uy = ((C65873e) C86312j.m106911c(C65873e.class)).mo89921uy(str);
            char c = ' ';
            if (uy != null) {
                Locale locale2 = Locale.getDefault();
                C87412m.m108593f(locale2, "getDefault()");
                String upperCase = uy.toUpperCase(locale2);
                C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                this.f165893p = upperCase + 127;
                char[] charArray = upperCase.toCharArray();
                C87412m.m108593f(charArray, "this as java.lang.String).toCharArray()");
                Character F = C110823p.m150980F(charArray, 0);
                char charValue = F != null ? F.charValue() : ' ';
                if ('a' <= charValue && charValue < '{') {
                    charValue = (char) (charValue - ' ');
                } else {
                    if (!('A' <= charValue && charValue < '[')) {
                        charValue = (char) 123;
                    }
                }
                this.f165890j = charValue;
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f165893p = str + 127;
                char[] charArray2 = str.toCharArray();
                C87412m.m108593f(charArray2, "this as java.lang.String).toCharArray()");
                Character F2 = C110823p.m150980F(charArray2, 0);
                if (F2 != null) {
                    c = F2.charValue();
                }
                if ('a' <= c && c < '{') {
                    c = (char) (c - ' ');
                } else {
                    if ('A' > c || c >= '[') {
                        z = false;
                    }
                    if (!z) {
                        c = (char) 123;
                    }
                }
                this.f165890j = c;
            }
            this.f165893p += str;
            int i = this.f165890j;
            this.f165891n = (i < 65 || i > 90) ? "#" : String.valueOf((char) i);
            Log.m105924i("jiaminchen.AtSomeone", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f165890j) + " compareContent:" + this.f165893p);
        }
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f165886f;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C57974g gVar = (C57974g) obj;
        C87412m.m108594g(gVar, "other");
        int i = C87412m.m108596i(this.f165886f, gVar.f165886f);
        if (i == 0) {
            if (this.f165886f == 2) {
                return C87412m.m108596i(this.f165884d, gVar.f165884d);
            }
            i = C87412m.m108596i(this.f165890j, gVar.f165890j);
            if (i == 0) {
                return this.f165893p.compareTo(gVar.f165893p);
            }
        }
        return i;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C57974g gVar = (C57974g) obj;
        C87412m.m108594g(gVar, "other");
        return C87412m.m108589b(this.f165885e, gVar.f165885e) && C87412m.m108589b(this.f165888h, gVar.f165888h) && this.f165889i == gVar.f165889i;
    }
}
