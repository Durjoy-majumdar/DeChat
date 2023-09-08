package cq1;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Locale;
import p255vr.C65873e;
import rx3.C13598b0;
import sx3.C110823p;

/* renamed from: cq1.i */
public final class C57976i extends C57974g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57976i(int i, C72996z1 z1Var, int i2, String str) {
        super(i, z1Var, i2);
        String str2;
        C87412m.m108594g(z1Var, "contact");
        C87412m.m108594g(str, "groupId");
        if (i2 == 3) {
            C13598b0 b0Var = null;
            if (!Util.isNullOrNil(z1Var.mo73969n2())) {
                str2 = z1Var.mo73969n2();
            } else {
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
                str2 = Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
            }
            String str3 = "";
            str2 = str2 == null ? str3 : str2;
            this.f165892o = str2;
            if (Util.isNullOrNil(str2)) {
                String j3 = z1Var.mo62909j3();
                C87412m.m108593f(j3, "contact.displayNick");
                this.f165892o = j3;
            }
            String str4 = this.f165892o;
            if (str4 != null) {
                Locale locale = Locale.getDefault();
                C87412m.m108593f(locale, "getDefault()");
                str3 = str4.toUpperCase(locale);
                C87412m.m108593f(str3, "this as java.lang.String).toUpperCase(locale)");
            }
            String uy = ((C65873e) C86312j.m106911c(C65873e.class)).mo89921uy(str3);
            char c = ' ';
            boolean z = true;
            if (uy != null) {
                Locale locale2 = Locale.getDefault();
                C87412m.m108593f(locale2, "getDefault()");
                String upperCase = uy.toUpperCase(locale2);
                C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                String str5 = upperCase + 127;
                C87412m.m108594g(str5, "<set-?>");
                this.f165893p = str5;
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
            }
            if (b0Var == null) {
                String str6 = str3 + 127;
                C87412m.m108594g(str6, "<set-?>");
                this.f165893p = str6;
                char[] charArray2 = str3.toCharArray();
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
                this.f165890j = c;
            }
            String str7 = this.f165893p + str3;
            C87412m.m108594g(str7, "<set-?>");
            this.f165893p = str7;
            int i3 = this.f165890j;
            String valueOf = (i3 < 65 || i3 > 90) ? "#" : String.valueOf((char) i3);
            C87412m.m108594g(valueOf, "<set-?>");
            this.f165891n = valueOf;
            Log.m105924i("jiaminchen.AtSomeone", "displayName:" + str3 + " showHeadCode:" + ((char) this.f165890j) + " compareContent:" + this.f165893p);
        }
    }

    /* renamed from: b */
    public void mo82771b() {
    }

    public Object clone() {
        return super.clone();
    }
}
