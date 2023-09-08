package r73;

import android.graphics.Color;
import android.webkit.JavascriptInterface;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.regex.Pattern;
import o40.C61926c;
import r73.C89894f;
import rx3.C13598b0;
import sx3.C110823p;
import z04.C66713a;

/* renamed from: r73.p */
public final class C89899p extends C47928a<C89902q> {

    /* renamed from: r73.p$a */
    public static final class C89900a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89899p f258353d;

        /* renamed from: e */
        public final /* synthetic */ String f258354e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89900a(C89899p pVar, String str) {
            super(0);
            this.f258353d = pVar;
            this.f258354e = str;
        }

        public Object invoke() {
            ((C89902q) this.f258353d.f128614b).mo123880N0(this.f258354e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r73.p$b */
    public static final class C89901b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89899p f258355d;

        /* renamed from: e */
        public final /* synthetic */ String f258356e;

        /* renamed from: f */
        public final /* synthetic */ Number f258357f;

        /* renamed from: g */
        public final /* synthetic */ Number f258358g;

        /* renamed from: h */
        public final /* synthetic */ Number f258359h;

        /* renamed from: i */
        public final /* synthetic */ Number f258360i;

        /* renamed from: j */
        public final /* synthetic */ int f258361j;

        /* renamed from: n */
        public final /* synthetic */ int f258362n;

        /* renamed from: o */
        public final /* synthetic */ String f258363o;

        /* renamed from: p */
        public final /* synthetic */ String f258364p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89901b(C89899p pVar, String str, Number number, Number number2, Number number3, Number number4, int i, int i2, String str2, String str3) {
            super(0);
            this.f258355d = pVar;
            this.f258356e = str;
            this.f258357f = number;
            this.f258358g = number2;
            this.f258359h = number3;
            this.f258360i = number4;
            this.f258361j = i;
            this.f258362n = i2;
            this.f258363o = str2;
            this.f258364p = str3;
        }

        public Object invoke() {
            String str = this.f258356e;
            C89894f.C89897c cVar = C89894f.f258347d;
            ((C89902q) this.f258355d.f128614b).mo123878A(str, cVar.mo124205e(this.f258357f), cVar.mo124205e(this.f258358g), cVar.mo124205e(this.f258359h), cVar.mo124205e(this.f258360i), this.f258361j, this.f258362n, this.f258363o, this.f258364p);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89899p(C89902q qVar) {
        super("wxPopup", qVar);
        C87412m.m108594g(qVar, "context");
    }

    @JavascriptInterface
    public final void close(String str) {
        C87412m.m108594g(str, "popupId");
        C61926c.m72668M(new C89900a(this, str));
    }

    @JavascriptInterface
    public final void popup(String str, Number number, Number number2, Number number3, Number number4, int i, String str2, String str3, String str4) {
        Object obj;
        String str5 = str;
        String str6 = str2;
        C87412m.m108594g(str5, "popupId");
        C87412m.m108594g(number, "width");
        C87412m.m108594g(number2, "height");
        C87412m.m108594g(number3, "left");
        C87412m.m108594g(number4, "top");
        C87412m.m108594g(str6, "colorRGBA");
        C87412m.m108594g(str3, "onDismissCallback");
        C87412m.m108594g(str4, "onOuterClickCallback");
        int i2 = 0;
        char[] cArr = {'#'};
        int length = str2.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                obj = "";
                break;
            } else if (!C110823p.m151007w(cArr, str6.charAt(i3))) {
                obj = str6.subSequence(i3, str2.length());
                break;
            } else {
                i3++;
            }
        }
        String upperCase = obj.toString().toUpperCase();
        C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase()");
        Pattern compile = Pattern.compile("[A-F0-9]{8}");
        C87412m.m108593f(compile, "compile(pattern)");
        if (compile.matcher(upperCase).matches()) {
            String substring = upperCase.substring(6, 8);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C66713a.m78712a(16);
            int parseInt = Integer.parseInt(substring, 16);
            String substring2 = upperCase.substring(0, 2);
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            C66713a.m78712a(16);
            int parseInt2 = Integer.parseInt(substring2, 16);
            String substring3 = upperCase.substring(2, 4);
            C87412m.m108593f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            C66713a.m78712a(16);
            int parseInt3 = Integer.parseInt(substring3, 16);
            String substring4 = upperCase.substring(4, 6);
            C87412m.m108593f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            C66713a.m78712a(16);
            i2 = Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(substring4, 16));
        }
        ((C89902q) this.f128614b).mo123879B(str5);
        C61926c.m72668M(new C89901b(this, str, number, number2, number3, number4, i, i2, str3, str4));
    }
}
