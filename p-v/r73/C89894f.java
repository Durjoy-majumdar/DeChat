package r73;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.webkit.JavascriptInterface;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import js0.C88020k;
import p419td.C26304g;
import p419td.C26307i;
import p419td.C90392c;
import q73.C35796c0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: r73.f */
public final class C89894f extends C47928a<C89898g> {

    /* renamed from: d */
    public static final C89897c f258347d = new C89897c((C8480h) null);

    /* renamed from: e */
    public static final C13601g<Float> f258348e = C36568h.m40985a(C89895a.f258351d);

    /* renamed from: f */
    public static final C26307i f258349f;

    /* renamed from: g */
    public static final C90392c f258350g = C89896b.f258352a;

    /* renamed from: r73.f$a */
    public static final class C89895a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C89895a f258351d = new C89895a();

        public C89895a() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(C88020k.m109556g());
        }
    }

    /* renamed from: r73.f$b */
    public static final class C89896b implements C90392c {

        /* renamed from: a */
        public static final C89896b f258352a = new C89896b();

        /* renamed from: a */
        public final void mo124200a(Paint paint, Typeface typeface, String str, float f, boolean z, float f2, boolean z2, boolean z3) {
            if (C87412m.m108589b(str, "500")) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(0.8f);
                Log.m105918d("MicroMsg.WxCanvasAPI", "paintConfigCallback fontWeight=" + str + ", fontSize=" + f);
            } else if (C87412m.m108589b(str, "700")) {
                paint.setFakeBoldText(true);
                Log.m105918d("MicroMsg.WxCanvasAPI", "paintConfigCallback fontWeight=" + str + ", fontSize=" + f);
            }
        }
    }

    /* renamed from: r73.f$c */
    public static final class C89897c {
        public C89897c(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo124201a(Number number) {
            C87412m.m108594g(number, "<this>");
            return C60641c.m70921b(number.floatValue() / mo124203c());
        }

        /* renamed from: b */
        public final Context mo124202b() {
            Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
            C87412m.m108593f(applicationContext, "getContext().applicationContext");
            return applicationContext;
        }

        /* renamed from: c */
        public final float mo124203c() {
            return ((Number) ((C36570n) C89894f.f258348e).getValue()).floatValue();
        }

        /* renamed from: d */
        public final int mo124204d() {
            int i = C74783i3.m89537a(mo124202b()).f24704a;
            C89897c cVar = C89894f.f258347d;
            boolean z = false;
            if (cVar.mo124202b().getResources().getConfiguration().orientation == 2) {
                if (C75044y4.m89993e(cVar.mo124202b()) > 0) {
                    z = true;
                }
                if (z) {
                    i -= C75044y4.m89991c(cVar.mo124202b());
                }
            }
            return mo124201a(Integer.valueOf(i));
        }

        /* renamed from: e */
        public final int mo124205e(Number number) {
            C87412m.m108594g(number, "<this>");
            return C60641c.m70921b(number.floatValue() * mo124203c());
        }
    }

    static {
        C26307i iVar = new C26307i();
        C90392c cVar = f258350g;
        iVar.f73289f = cVar;
        C26304g gVar = iVar.f73286c;
        if (gVar != null) {
            gVar.f73267a.f73280f = cVar;
        }
        iVar.init(1024, 1024);
        f258349f = iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89894f(C89898g gVar) {
        super("wxCanvas", gVar);
        C87412m.m108594g(gVar, "context");
    }

    @JavascriptInterface
    public final boolean canVideoAutoPlay() {
        return ((C89898g) this.f128614b).mo123831H0();
    }

    @JavascriptInterface
    public final String getCacheDir() {
        return C35796c0.f95588a.mo60410l();
    }

    @JavascriptInterface
    public final V8Object getCanvas() {
        return ((C89898g) this.f128614b).mo123847i();
    }

    @JavascriptInterface
    public final int getElementId() {
        return ((C89898g) this.f128614b).mo123852n1();
    }

    @JavascriptInterface
    public final float getFontSize() {
        return ((C89898g) this.f128614b).getFontSize();
    }

    @JavascriptInterface
    public final int getFps() {
        return ((C89898g) this.f128614b).mo123830D();
    }

    @JavascriptInterface
    public final int getHeight() {
        return ((C89898g) this.f128614b).getHeight();
    }

    @JavascriptInterface
    public final String getId() {
        return ((C89898g) this.f128614b).getId();
    }

    @JavascriptInterface
    public final int getOffsetHeight() {
        return ((C89898g) this.f128614b).mo123832S0();
    }

    @JavascriptInterface
    public final int getOffsetTop() {
        return ((C89898g) this.f128614b).mo123854o0();
    }

    @JavascriptInterface
    public final int getWidth() {
        return ((C89898g) this.f128614b).getWidth();
    }

    @JavascriptInterface
    public final boolean isDarkMode() {
        return C85875k4.m106211z();
    }

    @JavascriptInterface
    public final boolean isOnScreen() {
        return ((C89898g) this.f128614b).mo123857r0();
    }

    @JavascriptInterface
    public final Number measureText(String str, String str2, String str3, Number number, String str4) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(str2, "fontWeight");
        C87412m.m108594g(str3, "fontStyle");
        C87412m.m108594g(number, "fontSize");
        C87412m.m108594g(str4, "fontFamily");
        C26307i iVar = f258349f;
        if (BuildInfo.DEBUG) {
            String str5 = this.f128615c;
            Log.m105918d(str5, "measureText text=" + str + " fontWeight=" + str2 + ", fontStyle=" + str3 + ", fontSize=" + number + ", fontFamily=" + str4);
        }
        float floatValue = number.floatValue();
        String lowerCase = str3.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        boolean b = C87412m.m108589b(lowerCase, "italic");
        String lowerCase2 = str3.toLowerCase();
        C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase()");
        iVar.useFont(str4, str2, floatValue, b, C87412m.m108589b(lowerCase2, "bold"));
        return Float.valueOf(iVar.measureText(str));
    }

    @JavascriptInterface
    public final String restore(String str) {
        C87412m.m108594g(str, "canvasId");
        return ((C89898g) this.f128614b).mo123835a0(str);
    }

    @JavascriptInterface
    public final void save(String str, Number number, Number number2, Number number3, Number number4, String str2) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(number, "left");
        C87412m.m108594g(number2, "top");
        C87412m.m108594g(number3, "width");
        C87412m.m108594g(number4, "height");
        C87412m.m108594g(str2, "layout");
        ((C89898g) this.f128614b).mo123833T(str, number, number2, number3, number4, str2);
    }

    @JavascriptInterface
    public final void setHeight(Number number) {
        C87412m.m108594g(number, "height");
        ((C89898g) this.f128614b).mo123834W(number);
    }

    @JavascriptInterface
    public final void setVideo(Number number, Number number2) {
        C87412m.m108594g(number, "top");
        C87412m.m108594g(number2, "bottom");
        String str = this.f128615c;
        Log.m105918d(str, "setVideo:" + ((C89898g) this.f128614b).getId() + " to " + number + ' ' + number2);
        ((C89898g) this.f128614b).mo123856q1(number, number2);
    }
}
