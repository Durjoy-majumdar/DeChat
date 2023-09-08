package fk2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Locale;
import lv1.C99672i;
import p255vr.C65873e;
import rx3.C13598b0;
import sx3.C110823p;
import zb2.C66777a;

/* renamed from: fk2.f */
public final class C59134f extends C66777a<C59134f> {

    /* renamed from: d */
    public final int f169131d;

    /* renamed from: e */
    public final C72996z1 f169132e;

    /* renamed from: f */
    public final int f169133f;

    /* renamed from: g */
    public C99672i f169134g;

    /* renamed from: h */
    public boolean f169135h;

    /* renamed from: i */
    public int f169136i;

    /* renamed from: j */
    public String f169137j;

    /* renamed from: n */
    public String f169138n;

    public C59134f(int i, C72996z1 z1Var, int i2, C44661m1 m1Var, int i3, C8480h hVar) {
        C13598b0 b0Var = null;
        m1Var = (i3 & 8) != 0 ? null : m1Var;
        C87412m.m108594g(z1Var, "contact");
        this.f169131d = i;
        this.f169132e = z1Var;
        this.f169133f = i2;
        this.f169136i = 127;
        String str = "";
        this.f169137j = str;
        this.f169138n = str;
        if (i2 == 2) {
            String n2 = !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : m1Var != null ? m1Var.mo69789q2(z1Var.getUsername()) : null;
            n2 = Util.isNullOrNil(n2) ? z1Var.mo62909j3() : n2;
            if (n2 != null) {
                Locale locale = Locale.getDefault();
                C87412m.m108593f(locale, "getDefault()");
                str = n2.toUpperCase(locale);
                C87412m.m108593f(str, "this as java.lang.String).toUpperCase(locale)");
            }
            String uy = ((C65873e) C86312j.m106911c(C65873e.class)).mo89921uy(str);
            char c = ' ';
            boolean z = true;
            if (uy != null) {
                Locale locale2 = Locale.getDefault();
                C87412m.m108593f(locale2, "getDefault()");
                String upperCase = uy.toUpperCase(locale2);
                C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                this.f169138n = upperCase + 127;
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
                this.f169136i = charValue;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f169138n = str + 127;
                char[] charArray2 = str.toCharArray();
                C87412m.m108593f(charArray2, "this as java.lang.String).toCharArray()");
                Character F2 = C110823p.m150980F(charArray2, 0);
                c = F2 != null ? F2.charValue() : c;
                if ('a' <= c && c < '{') {
                    c = (char) (c - ' ');
                } else {
                    if (!(('A' > c || c >= '[') ? false : z)) {
                        c = (char) 123;
                    }
                }
                this.f169136i = c;
            }
            this.f169138n += str;
            int i4 = this.f169136i;
            this.f169137j = (i4 < 65 || i4 > 90) ? "#" : String.valueOf((char) i4);
            Log.m105924i("jiaminchen.AtSomeone", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f169136i) + " compareContent:" + this.f169138n);
        }
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f169132e.getUsername() + '-' + this.f169133f;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f169133f;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C59134f fVar = (C59134f) obj;
        C87412m.m108594g(fVar, "other");
        int i = C87412m.m108596i(this.f169133f, fVar.f169133f);
        if (i == 0) {
            if (this.f169133f == 1) {
                return C87412m.m108596i(this.f169131d, fVar.f169131d);
            }
            i = C87412m.m108596i(this.f169136i, fVar.f169136i);
            if (i == 0) {
                return this.f169138n.compareTo(fVar.f169138n);
            }
        }
        return i;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C59134f fVar = (C59134f) obj;
        C87412m.m108594g(fVar, "other");
        return C87412m.m108589b(this.f169132e, fVar.f169132e) && C87412m.m108589b(this.f169134g, fVar.f169134g) && this.f169135h == fVar.f169135h;
    }
}
